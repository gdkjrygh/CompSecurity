// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.Message;
import com.skype.Participant;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.skylib.ObjectInterfaceNotFoundException;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.RandomPercentageGenerator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.calling:
//            CallQualityFeedbackRating

public class CallQualityFeedbackManager
    implements android.os.Handler.Callback
{
    private static final class a extends RandomPercentageGenerator
    {

        public final com.skype.android.util.RandomPercentageGenerator.Result getOrAdd(Integer integer)
        {
            com.skype.android.util.RandomPercentageGenerator.Result result = super.getOrAdd(integer);
            if (result.a())
            {
                return result;
            } else
            {
                remove(integer);
                return null;
            }
        }

        public final volatile com.skype.android.util.RandomPercentageGenerator.Result getOrAdd(Object obj)
        {
            return getOrAdd((Integer)obj);
        }

        public final Collection getPendingUpload()
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = getValues().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.skype.android.util.RandomPercentageGenerator.Result result = (com.skype.android.util.RandomPercentageGenerator.Result)iterator.next();
                CallQualityFeedbackRating callqualityfeedbackrating = (CallQualityFeedbackRating)result.b();
                if (result.a() && callqualityfeedbackrating.getState() != CallQualityFeedbackRating.State.UPLOADED)
                {
                    arraylist.add(callqualityfeedbackrating);
                }
            } while (true);
            return arraylist;
        }

        public final void remove(Collection collection)
        {
            for (collection = collection.iterator(); collection.hasNext(); remove(Integer.valueOf(((Integer)collection.next()).intValue()))) { }
        }

        public a()
        {
            super(10);
        }
    }


    private static final int MINIMUM_CALL_DURATION_FOR_FEEDBACK = 5;
    private static final int PERCENTAGE_S2S_TO_CHECK = 10;
    private static final int WHAT_CALL_ENDED = 2;
    private static final int WHAT_CALL_STARTED = 1;
    private static final int WHAT_UPLOAD_ALL = 4;
    private static final int WHAT_UPLOAD_SUBMITTED_AND_EXPIRED = 3;
    private static final Logger log = Logger.getLogger("CallQualityFeedbackManager");
    private Map activeConvoCqfType;
    private final Analytics analytics;
    private final ConversationUtil conversationUtil;
    private Handler handler;
    private final SkyLib lib;
    private final ObjectIdMap map;
    private a ratingGenerator;
    private final Provider userPreferencesProvider;

    public CallQualityFeedbackManager(ObjectIdMap objectidmap, SkyLib skylib, ConversationUtil conversationutil, Provider provider, Analytics analytics1)
    {
        activeConvoCqfType = new HashMap();
        map = objectidmap;
        lib = skylib;
        conversationUtil = conversationutil;
        userPreferencesProvider = provider;
        analytics = analytics1;
        ratingGenerator = new a();
        handler = new Handler(Looper.getMainLooper(), this);
    }

    private void callEndedInternal(Message message)
    {
        CallQualityFeedbackRating.CQFType cqftype = (CallQualityFeedbackRating.CQFType)activeConvoCqfType.remove(Integer.valueOf(message.getConvoIdProp()));
        if (cqftype != null && message.getParamValueProp() >= 5)
        {
            generateRating(message, cqftype);
        }
    }

    private void callStartedInternal(Message message)
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        lib.getConversationByConvoID(message.getConvoIdProp(), conversationimpl);
        Object obj = ratingGenerator.getPendingUpload().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            CallQualityFeedbackRating callqualityfeedbackrating = (CallQualityFeedbackRating)((Iterator) (obj)).next();
            if (callqualityfeedbackrating.getState() != CallQualityFeedbackRating.State.UPLOADED && callqualityfeedbackrating.getConvoId() == message.getConvoIdProp())
            {
                ratingGenerator.remove(Integer.valueOf(callqualityfeedbackrating.getId()));
            }
        } while (true);
        obj = conversationUtil.a(conversationimpl, com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS);
        if (((List) (obj)).size() > 0)
        {
            if (((List) (obj)).size() > 1)
            {
                CallQualityFeedbackRating.CQFType cqftype = CallQualityFeedbackRating.CQFType.MPA;
                obj = cqftype;
                if (conversationimpl.getLiveCallTechnologyProp() == com.skype.Conversation.CALL_TECHNOLOGY.CALL_NGC)
                {
                    obj = cqftype;
                    if (conversationUtil.x(conversationimpl))
                    {
                        obj = CallQualityFeedbackRating.CQFType.MPV;
                    }
                }
            } else
            {
                obj = (Participant)((List) (obj)).get(0);
                if (isPSTNCallToNumber(((Participant) (obj))) || isPSTNCallToContact(((Participant) (obj))))
                {
                    obj = CallQualityFeedbackRating.CQFType.SKYPE_OUT;
                } else
                {
                    obj = CallQualityFeedbackRating.CQFType.SKYPE_TO_SKYPE;
                }
            }
            activeConvoCqfType.put(Integer.valueOf(message.getConvoIdProp()), obj);
        }
    }

    private void generateRating(Message message, CallQualityFeedbackRating.CQFType cqftype)
    {
        com.skype.android.util.RandomPercentageGenerator.Result result;
        int i;
        i = message.getOtherLiveMessage();
        result = null;
        log.info((new StringBuilder("CQF rating event, type=")).append(cqftype).append(")").toString());
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$app$calling$CallQualityFeedbackRating$CQFType[];

            static 
            {
                $SwitchMap$com$skype$android$app$calling$CallQualityFeedbackRating$CQFType = new int[CallQualityFeedbackRating.CQFType.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$calling$CallQualityFeedbackRating$CQFType[CallQualityFeedbackRating.CQFType.MPV.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$calling$CallQualityFeedbackRating$CQFType[CallQualityFeedbackRating.CQFType.MPA.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$calling$CallQualityFeedbackRating$CQFType[CallQualityFeedbackRating.CQFType.SKYPE_TO_SKYPE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$calling$CallQualityFeedbackRating$CQFType[CallQualityFeedbackRating.CQFType.SKYPE_OUT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.skype.android.app.calling.CallQualityFeedbackRating.CQFType[cqftype.ordinal()];
        JVM INSTR tableswitch 1 4: default 76
    //                   1 108
    //                   2 125
    //                   3 125
    //                   4 151;
           goto _L1 _L2 _L3 _L3 _L4
_L1:
        if (result != null && result.a())
        {
            result.a(new CallQualityFeedbackRating(i, message.getConvoIdProp(), cqftype));
        }
        return;
_L2:
        result = ratingGenerator.inject(Integer.valueOf(i), true);
        continue; /* Loop/switch isn't completed */
_L3:
        userPreferencesProvider.get();
        result = ratingGenerator.getOrAdd(Integer.valueOf(i));
        continue; /* Loop/switch isn't completed */
_L4:
        result = ratingGenerator.inject(Integer.valueOf(i), true);
        if (true) goto _L1; else goto _L5
_L5:
    }

    private boolean isPSTNCallToContact(Participant participant)
    {
        String s1 = participant.getLiveIdentityToUseProp();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = participant.getLiveIdentityProp();
        }
        return s != null && s.startsWith("+");
    }

    private boolean isPSTNCallToNumber(Participant participant)
    {
        return participant.getLiveTypeProp() == com.skype.SkyLib.IDENTITYTYPE.PSTN || participant.getLiveTypeProp() == com.skype.SkyLib.IDENTITYTYPE.PSTN_FREE || participant.getLiveTypeProp() == com.skype.SkyLib.IDENTITYTYPE.PSTN_UNDISCLOSED;
    }

    private boolean isRatingConversationActive(CallQualityFeedbackRating callqualityfeedbackrating)
    {
        boolean flag1 = false;
        ConversationImpl conversationimpl = new ConversationImpl();
        boolean flag = flag1;
        if (lib.getConversationByConvoID(callqualityfeedbackrating.getConvoId(), conversationimpl))
        {
            callqualityfeedbackrating = conversationimpl.getLocalLiveStatusProp();
            flag = flag1;
            if (callqualityfeedbackrating != com.skype.Conversation.LOCAL_LIVESTATUS.NONE)
            {
                flag = flag1;
                if (callqualityfeedbackrating != com.skype.Conversation.LOCAL_LIVESTATUS.RECENTLY_LIVE)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private boolean isRatingFromMostRecentCall(CallQualityFeedbackRating callqualityfeedbackrating)
    {
        int ai[];
        boolean flag;
        flag = true;
        int i = (int)(System.currentTimeMillis() / 1000L);
        ai = lib.getMessageListByType(com.skype.Message.TYPE.STARTED_LIVESESSION, true, i - 60, i + 1).m_messageObjectIDList;
        int k = ai.length;
        int j = 0;
_L2:
        int l;
        boolean flag1;
        flag1 = flag;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        l = ai[j];
        flag1 = flag;
        if (((Message)map.a(l, com/skype/Message)).getConvoIdProp() != callqualityfeedbackrating.getConvoId())
        {
            break MISSING_BLOCK_LABEL_114;
        }
        flag1 = flag;
        if (l == callqualityfeedbackrating.getId())
        {
            break MISSING_BLOCK_LABEL_114;
        }
        log.info("CallQualityFeedbackManager: isRatingFromMostRecentCall: The most recent STARTED_LIVESESSION Message for this conversation does not match the one stored with the rating");
        flag1 = false;
        j++;
        flag = flag1;
        if (true) goto _L2; else goto _L1
        callqualityfeedbackrating;
        log.warning("CallQualityFeedbackManager: isRatingFromMostRecentCall: Unable to confirm that the conversation of this rating has not had a subsequent call");
        flag1 = false;
_L1:
        return flag1;
    }

    private com.skype.SkyLib.LIVESESSION_QUALITYRATING toNativeRating(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return com.skype.SkyLib.LIVESESSION_QUALITYRATING.VERY_BAD;

        case 2: // '\002'
            return com.skype.SkyLib.LIVESESSION_QUALITYRATING.BAD;

        case 3: // '\003'
            return com.skype.SkyLib.LIVESESSION_QUALITYRATING.AVERAGE;

        case 4: // '\004'
            return com.skype.SkyLib.LIVESESSION_QUALITYRATING.GOOD;

        case 5: // '\005'
            return com.skype.SkyLib.LIVESESSION_QUALITYRATING.VERY_GOOD;
        }
    }

    private boolean uploadRating(CallQualityFeedbackRating callqualityfeedbackrating)
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        boolean flag1 = lib.getConversationByConvoID(callqualityfeedbackrating.getConvoId(), conversationimpl);
        boolean flag = flag1;
        if (flag1)
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("CallQualityFeedbackManager: uploadRating: Upload call quality feedback for convo ").append(callqualityfeedbackrating.getConvoId()).append(", CQF type=").append(callqualityfeedbackrating.getCqfType());
            if (callqualityfeedbackrating.getState() == CallQualityFeedbackRating.State.SUBMITTED)
            {
                flag = conversationimpl.provideLiveSessionQualityFeedback(callqualityfeedbackrating.getCqfType().getLabel(), "random", toNativeRating(callqualityfeedbackrating.getValue()), "", "");
                stringbuilder.append(", value=").append(callqualityfeedbackrating.getValue()).append(", success=").append(flag);
            } else
            {
                flag = conversationimpl.provideLiveSessionQualityFeedback(callqualityfeedbackrating.getCqfType().getLabel(), "cancel", com.skype.SkyLib.LIVESESSION_QUALITYRATING.AVERAGE, "", "");
                stringbuilder.append(", value=cancelled, success=").append(flag);
            }
            log.info(stringbuilder.toString());
            analytics.a(AnalyticsEvent.bD, flag);
        }
        return flag;
    }

    private void uploadRatings(boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = ratingGenerator.getPendingUpload().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            CallQualityFeedbackRating callqualityfeedbackrating = (CallQualityFeedbackRating)iterator.next();
            if (callqualityfeedbackrating.getState() != CallQualityFeedbackRating.State.UPLOADED && (callqualityfeedbackrating.getState() == CallQualityFeedbackRating.State.SUBMITTED || callqualityfeedbackrating.isExpired() || flag))
            {
                if (isRatingConversationActive(callqualityfeedbackrating) || !isRatingFromMostRecentCall(callqualityfeedbackrating))
                {
                    ratingGenerator.remove(Integer.valueOf(callqualityfeedbackrating.getId()));
                } else
                if (uploadRating(callqualityfeedbackrating))
                {
                    callqualityfeedbackrating.setUploaded();
                    arraylist.add(Integer.valueOf(callqualityfeedbackrating.getId()));
                }
            }
        } while (true);
        ratingGenerator.remove(arraylist);
    }

    public void callEnded(Message message)
    {
        message = handler.obtainMessage(2, message);
        handler.sendMessage(message);
    }

    public void callStarted(Message message)
    {
        message = handler.obtainMessage(1, message);
        handler.sendMessage(message);
    }

    public CallQualityFeedbackRating getPendingRating(int i)
    {
        CallQualityFeedbackRating callqualityfeedbackrating = (CallQualityFeedbackRating)ratingGenerator.getExisting(Integer.valueOf(i));
        if (callqualityfeedbackrating != null && callqualityfeedbackrating.getState() == CallQualityFeedbackRating.State.PENDING)
        {
            return callqualityfeedbackrating;
        } else
        {
            return null;
        }
    }

    public boolean handleMessage(android.os.Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 1: // '\001'
            callStartedInternal((Message)message.obj);
            return true;

        case 2: // '\002'
            callEndedInternal((Message)message.obj);
            return true;

        case 3: // '\003'
            uploadRatings(false);
            return true;

        case 4: // '\004'
            uploadRatings(true);
            break;
        }
        Object obj = conversationUtil.a(false);
        message = new HashSet(((List) (obj)).size());
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); message.add(Integer.valueOf(((Conversation)((Iterator) (obj)).next()).getDbID()))) { }
        if (message.isEmpty())
        {
            activeConvoCqfType.clear();
        } else
        {
            Iterator iterator = activeConvoCqfType.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                if (!message.contains(((java.util.Map.Entry)iterator.next()).getKey()))
                {
                    iterator.remove();
                }
            }
        }
        return true;
    }

    public void uploadAllRatings()
    {
        handler.sendEmptyMessage(4);
    }

    public void uploadSubmittedAndExpired()
    {
        handler.sendEmptyMessage(3);
    }

}
