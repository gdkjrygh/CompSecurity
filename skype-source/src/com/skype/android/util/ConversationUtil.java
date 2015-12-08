// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.util.SparseArray;
import android.widget.Toast;
import com.skype.Account;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.Message;
import com.skype.MessageImpl;
import com.skype.PROPKEY;
import com.skype.Participant;
import com.skype.Proptable;
import com.skype.ProptableImpl;
import com.skype.Setup;
import com.skype.SkyLib;
import com.skype.Transfer;
import com.skype.Video;
import com.skype.VideoImpl;
import com.skype.Voicemail;
import com.skype.VoicemailImpl;
import com.skype.android.app.location.LocationUtil;
import com.skype.android.app.media.XmmUtil;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.ChatText;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.cache.FormattedMessageCache;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Provider;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.util:
//            ContactUtil, VideoMessageEntitlementPropMap

public class ConversationUtil
{
    public static interface CallExtractor
    {

        public abstract Object a(Conversation conversation);
    }

    public static class TranslatorSetting
    {

        public boolean a;
        public String b;
        public String c;
        public String d;
        public String e;

        public TranslatorSetting()
        {
            b = "";
            c = "";
            d = "";
            e = "";
        }
    }


    private static final Pattern b = Pattern.compile(".*</ss>[^\\s<].*");
    private static String m = "TranslatorSettings";
    private static String n = "TranslatorConversation";
    private final CallExtractor a = new CallExtractor() {

        final ConversationUtil a;

        public final volatile Object a(Conversation conversation)
        {
            return conversation;
        }

            
            {
                a = ConversationUtil.this;
                super();
            }
    };
    private Context c;
    private AsyncService d;
    private SkyLib e;
    private ObjectIdMap f;
    private FormattedMessageCache g;
    private Provider h;
    private ContactUtil i;
    private final ChatText j;
    private EcsConfiguration k;
    private LocationUtil l;

    public ConversationUtil(Application application, AsyncService asyncservice, SkyLib skylib, ObjectIdMap objectidmap, FormattedMessageCache formattedmessagecache, Provider provider, ContactUtil contactutil, 
            EcsConfiguration ecsconfiguration, ChatText chattext)
    {
        c = application;
        d = asyncservice;
        e = skylib;
        f = objectidmap;
        g = formattedmessagecache;
        i = contactutil;
        h = provider;
        j = chattext;
        k = ecsconfiguration;
        l = new LocationUtil();
    }

    private boolean E(Conversation conversation)
    {
label0:
        {
            List list = a(false);
            boolean flag;
            if (list.size() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (list.size() == 1)
            {
                if (((Conversation)list.get(0)).getObjectID() != conversation.getObjectID())
                {
                    break label0;
                }
                flag = true;
            }
            return flag;
        }
        return false;
    }

    private String F(Conversation conversation)
    {
        try
        {
            conversation = c.getSharedPreferences(m, 0).getString(G(conversation), "");
        }
        // Misplaced declaration of an exception variable
        catch (Conversation conversation)
        {
            return "";
        }
        return conversation;
    }

    private static String G(Conversation conversation)
    {
        return (new StringBuilder()).append(n).append(conversation.getIdentityProp()).toString();
    }

    private int a(Conversation conversation, com.skype.Conversation.PARTICIPANTFILTER participantfilter, List list, int i1)
    {
        conversation = conversation.getParticipants(participantfilter).m_participantObjectIDList;
        int k1 = 0;
        int l1 = conversation.length;
        int j1 = 0;
        do
        {
            if (j1 >= l1)
            {
                break;
            }
            int i2 = conversation[j1];
            list.add(b((Participant)f.a(i2, com/skype/Participant)));
            k1++;
            if (k1 == i1)
            {
                break;
            }
            j1++;
        } while (true);
        return conversation.length;
    }

    public static Video a(SkyLib skylib, Participant participant)
    {
        participant = participant.getLiveSessionVideos();
        if (((com.skype.Participant.GetLiveSessionVideos_Result) (participant)).m_return && ((com.skype.Participant.GetLiveSessionVideos_Result) (participant)).m_videoObjectIDList.length > 0)
        {
            participant = ((com.skype.Participant.GetLiveSessionVideos_Result) (participant)).m_videoObjectIDList;
            int j1 = participant.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                int k1 = participant[i1];
                VideoImpl videoimpl = new VideoImpl();
                if (skylib.getVideo(k1, videoimpl) && videoimpl.getMediaTypeProp() == com.skype.Video.MEDIATYPE.MEDIA_VIDEO)
                {
                    return videoimpl;
                }
            }

        }
        return null;
    }

    public static EnumSet a(SkyLib skylib)
    {
        int j1 = skylib.getIntLibProp(com.skype.SkyLib.LIBPROP.LIBPROP_NGC_CAPABILITIES);
        skylib = EnumSet.noneOf(com/skype/SkyLib$NGC_CAPABILITIES);
        com.skype.SkyLib.NGC_CAPABILITIES angc_capabilities[] = com.skype.SkyLib.NGC_CAPABILITIES.values();
        int k1 = angc_capabilities.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            com.skype.SkyLib.NGC_CAPABILITIES ngc_capabilities = angc_capabilities[i1];
            if ((ngc_capabilities.toInt() & j1) != 0)
            {
                skylib.add(ngc_capabilities);
            }
        }

        return skylib;
    }

    public static boolean a(Conversation conversation, int i1)
    {
        boolean flag = false;
        if (i1 > conversation.getConsumptionHorizonProp())
        {
            flag = conversation.setConsumedHorizon(i1, false);
        }
        return flag;
    }

    public static boolean a(Conversation conversation, com.skype.Conversation.CAPABILITY capability)
    {
        return conversation.getCapabilities().length > 0 && conversation.getCapabilities()[capability.toInt()];
    }

    public static boolean a(Conversation conversation, Participant participant)
    {
        com.skype.Participant.VOICE_STATUS voice_status = participant.getVoiceStatusProp();
        return conversation.getLiveHostProp().equals(participant.getIdentityProp()) || voice_status != com.skype.Participant.VOICE_STATUS.VOICE_UNKNOWN && voice_status != com.skype.Participant.VOICE_STATUS.VOICE_NA;
    }

    public static boolean a(Participant participant)
    {
        static final class _cls2
        {

            static final int a[];
            static final int b[];
            static final int c[];

            static 
            {
                c = new int[com.skype.Message.TYPE.values().length];
                try
                {
                    c[com.skype.Message.TYPE.POSTED_MEDIA_MESSAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    c[com.skype.Message.TYPE.POSTED_FLIK_MESSAGE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                b = new int[com.skype.Conversation.TYPE.values().length];
                try
                {
                    b[com.skype.Conversation.TYPE.DIALOG.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[com.skype.Conversation.TYPE.CONFERENCE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                a = new int[com.skype.Participant.VOICE_STATUS.values().length];
                try
                {
                    a[com.skype.Participant.VOICE_STATUS.VOICE_AVAILABLE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.skype.Participant.VOICE_STATUS.VOICE_CONNECTING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.skype.Participant.VOICE_STATUS.RINGING.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.skype.Participant.VOICE_STATUS.LISTENING.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.skype.Participant.VOICE_STATUS.SPEAKING.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.skype.Participant.VOICE_STATUS.VOICE_ON_HOLD.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[participant.getVoiceStatusProp().ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return true;
        }
    }

    public static boolean a(Transfer transfer)
    {
        transfer = transfer.getStatusProp();
        return transfer == com.skype.Transfer.STATUS.TRANSFERRING || transfer == com.skype.Transfer.STATUS.TRANSFERRING_OVER_RELAY;
    }

    private static boolean a(Video video)
    {
        return video != null && (video.getStatusProp() == com.skype.Video.STATUS.RUNNING || video.getStatusProp() == com.skype.Video.STATUS.PAUSED);
    }

    public static boolean a(TranslatorSetting translatorsetting)
    {
        return translatorsetting.b.length() > 0 && translatorsetting.c.length() > 0;
    }

    public static int b(Conversation conversation, com.skype.Conversation.PARTICIPANTFILTER participantfilter)
    {
        return conversation.getParticipants(participantfilter).m_participantObjectIDList.length;
    }

    public static String b(String s1)
    {
        String s2 = s1;
        if (b.matcher(s1).matches())
        {
            s2 = s1.replaceAll("</ss>([^\\s<])", "</ss> $1");
        }
        return s2;
    }

    public static boolean b(com.skype.Conversation.LOCAL_LIVESTATUS local_livestatus)
    {
        return local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_LOCALLY || local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_REMOTELY;
    }

    public static boolean b(SkyLib skylib)
    {
        return a(skylib).contains(com.skype.SkyLib.NGC_CAPABILITIES.NGC_GROUP_CALLING_INITIATION_ENABLED);
    }

    public static boolean b(TranslatorSetting translatorsetting)
    {
        return translatorsetting.d.length() > 0 && translatorsetting.e.length() > 0;
    }

    private static String[] b(List list)
    {
        String as[];
        int i1;
        if (list != null)
        {
            i1 = list.size();
        } else
        {
            i1 = 0;
        }
        as = new String[i1];
        for (int j1 = 0; j1 < i1; j1++)
        {
            as[j1] = ((Contact)list.get(j1)).getIdentity();
        }

        return as;
    }

    public static boolean c(com.skype.Conversation.LOCAL_LIVESTATUS local_livestatus)
    {
        return local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE || local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.OTHERS_ARE_LIVE || local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_LOCALLY || local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_REMOTELY;
    }

    public static boolean c(Conversation conversation)
    {
        return conversation.getInboxTimestampProp() > 0 && (conversation.getTypeProp() == com.skype.Conversation.TYPE.CONFERENCE || conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG);
    }

    public static boolean d(Conversation conversation)
    {
        return conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG;
    }

    public static boolean e(Conversation conversation)
    {
        return conversation.getTypeProp() == com.skype.Conversation.TYPE.LEGACY_VOICE_CONFERENCE;
    }

    private static String g(int i1)
    {
        return (new StringBuilder("HeartMessageAnnotation")).append(i1).toString();
    }

    public static boolean g(Conversation conversation)
    {
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            return !t(conversation) && a(conversation, com.skype.Conversation.CAPABILITY.CAN_SPAWN);
        } else
        {
            return a(conversation, com.skype.Conversation.CAPABILITY.CAN_ADD);
        }
    }

    public static boolean h(Conversation conversation)
    {
        return a(conversation, com.skype.Conversation.CAPABILITY.CAN_KICK);
    }

    public static boolean p(Conversation conversation)
    {
        boolean flag = false;
        int i1 = ((flag) ? 1 : 0);
        if (conversation != null)
        {
            if (conversation.getUnconsumedNormalMessagesProp() > 0)
            {
                i1 = 0 + 1;
            } else
            if (conversation.getUnconsumedElevatedMessagesProp() > 0)
            {
                i1 = 0 + 1;
            } else
            {
                i1 = ((flag) ? 1 : 0);
                if (conversation.getUnconsumedMessagesVoiceProp())
                {
                    i1 = 0 + 1;
                }
            }
        }
        return i1 > 0;
    }

    public static boolean s(Conversation conversation)
    {
        conversation = conversation.getLocalLiveStatusProp();
        return conversation == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_LOCALLY || conversation == com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_REMOTELY;
    }

    public static boolean t(Conversation conversation)
    {
        return c(conversation.getLocalLiveStatusProp());
    }

    public static boolean u(Conversation conversation)
    {
        return conversation.getLocalLiveStatusProp() == com.skype.Conversation.LOCAL_LIVESTATUS.STARTING;
    }

    public static boolean v(Conversation conversation)
    {
        return conversation.getLocalLiveStatusProp() == com.skype.Conversation.LOCAL_LIVESTATUS.RINGING_FOR_ME;
    }

    public static boolean w(Conversation conversation)
    {
        return !TextUtils.isEmpty(conversation.getAlertStringProp());
    }

    public static boolean y(Conversation conversation)
    {
        return a(conversation, com.skype.Conversation.CAPABILITY.CAN_SEND_MEDIAMESSAGE);
    }

    public static boolean z(Conversation conversation)
    {
        return a(conversation, com.skype.Conversation.CAPABILITY.CAN_CHANGE_PICTURE);
    }

    public final boolean A(Conversation conversation)
    {
        boolean flag = false;
        conversation = F(conversation);
        if (conversation.isEmpty())
        {
            return false;
        }
        try
        {
            conversation = (new JSONObject(conversation)).getJSONObject("text");
        }
        // Misplaced declaration of an exception variable
        catch (Conversation conversation)
        {
            return false;
        }
        if (conversation != null)
        {
            flag = true;
        }
        return flag;
    }

    public final boolean B(Conversation conversation)
    {
        boolean flag2 = false;
        boolean flag;
        boolean flag1;
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag2;
        if (flag)
        {
            flag1 = flag2;
            if (k.isTranslatorEnabled())
            {
                conversation = F(conversation);
                try
                {
                    flag1 = (new JSONObject(conversation)).getBoolean("enabled");
                }
                // Misplaced declaration of an exception variable
                catch (Conversation conversation)
                {
                    return false;
                }
            }
        }
        return flag1;
    }

    public final TranslatorSetting C(Conversation conversation)
    {
        conversation = F(conversation);
        TranslatorSetting translatorsetting = new TranslatorSetting();
        try
        {
            JSONObject jsonobject = new JSONObject(conversation);
            translatorsetting.a = jsonobject.getBoolean("enabled");
            translatorsetting.b = jsonobject.getJSONObject("text").getString("mycode");
            translatorsetting.c = jsonobject.getJSONObject("text").getString("othercode");
            translatorsetting.d = jsonobject.getJSONObject("speech").getString("mycode");
            translatorsetting.e = jsonobject.getJSONObject("speech").getString("othercode");
        }
        catch (Exception exception)
        {
            if (conversation.isEmpty())
            {
                translatorsetting.a = false;
                return translatorsetting;
            }
        }
        return translatorsetting;
    }

    public final boolean D(Conversation conversation)
    {
        boolean flag = false;
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            flag = ContactUtil.g(r(conversation));
        }
        return flag;
    }

    public final SpannableStringBuilder a()
    {
        Object obj = c.getResources().getString(0x7f08039b);
        int i1 = ((String) (obj)).length();
        StyleSpan stylespan = new StyleSpan(2);
        ForegroundColorSpan foregroundcolorspan = new ForegroundColorSpan(c.getResources().getColor(0x7f0f0114));
        obj = new SpannableStringBuilder(((CharSequence) (obj)));
        ((SpannableStringBuilder) (obj)).setSpan(stylespan, 0, i1, 33);
        ((SpannableStringBuilder) (obj)).setSpan(foregroundcolorspan, 0, i1, 33);
        return ((SpannableStringBuilder) (obj));
    }

    public final Contact a(String s1)
    {
        ContactImpl contactimpl = new ContactImpl();
        e.getContact(s1, contactimpl);
        return contactimpl;
    }

    public final Conversation a(Conversation conversation, List list, boolean flag)
    {
        if (list == null || list.size() <= 0)
        {
            return conversation;
        }
        list = b(list);
        _cls2.b[conversation.getTypeProp().ordinal()];
        JVM INSTR tableswitch 1 2: default 56
    //                   1 77
    //                   2 112;
           goto _L1 _L2 _L3
_L1:
        if (flag && t(conversation))
        {
            conversation.ringOthers(list);
        }
        return conversation;
_L2:
        int i1 = conversation.spawnConference(list, false);
        if (i1 != 0)
        {
            conversation = (Conversation)f.a(i1, com/skype/Conversation);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        conversation.addConsumers(list, false);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final Conversation a(List list)
    {
        return a(list, ((String) (null)));
    }

    public final Conversation a(List list, String s1)
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        if (list.size() == 1)
        {
            s1 = conversationimpl;
            if (((Contact)list.get(0)).openConversation(conversationimpl))
            {
                s1 = (Conversation)f.a(conversationimpl.getObjectID(), com/skype/Conversation);
            }
            return s1;
        }
        if (list.size() > 0 && e.createConference(conversationimpl))
        {
            if (!TextUtils.isEmpty(s1))
            {
                conversationimpl.setTopic(s1, false);
            }
            f.b(conversationimpl);
            f.a(conversationimpl);
            conversationimpl.addConsumers(b(list), false);
        }
        conversationimpl.join();
        return conversationimpl;
    }

    public final Participant a(int i1)
    {
        Object obj = (Conversation)f.a(i1, com/skype/Conversation);
        String s1 = ((Conversation) (obj)).getLiveHostProp();
        for (obj = a(((Conversation) (obj)), com.skype.Conversation.PARTICIPANTFILTER.ALL).iterator(); ((Iterator) (obj)).hasNext();)
        {
            Participant participant = (Participant)((Iterator) (obj)).next();
            if (s1.equals(participant.getIdentityProp()))
            {
                return participant;
            }
        }

        return null;
    }

    public final Participant a(Conversation conversation, String s1)
    {
        conversation = conversation.getParticipants(com.skype.Conversation.PARTICIPANTFILTER.ALL).m_participantObjectIDList;
        int j1 = conversation.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            int k1 = conversation[i1];
            Participant participant = (Participant)f.a(k1, com/skype/Participant);
            if (participant.getIdentityProp().equals(s1))
            {
                return participant;
            }
        }

        return null;
    }

    public final CharSequence a(Message message, boolean flag)
    {
label0:
        {
            CharSequence charsequence = g.a(message);
            message = charsequence;
            if (TextUtils.isEmpty(charsequence))
            {
                if (!flag)
                {
                    break label0;
                }
                message = c.getString(0x7f080405);
            }
            return message;
        }
        return c.getString(0x7f0803e0);
    }

    public final CharSequence a(boolean flag, boolean flag1, com.skype.Message.TYPE type)
    {
label0:
        {
label1:
            {
                {
                    if (flag1)
                    {
                        return a();
                    }
                    int i1 = -1;
                    switch (_cls2.c[type.ordinal()])
                    {
                    default:
                        if (XmmUtil.isXmmMessageType(type))
                        {
                            if (flag)
                            {
                                i1 = 0x7f0804e7;
                            } else
                            {
                                i1 = 0x7f0804c8;
                            }
                        }
                        break;

                    case 1: // '\001'
                        break label1;

                    case 2: // '\002'
                        break label0;
                    }
                }
                if (i1 != -1)
                {
                    return j.a(i1, new Object[0]);
                } else
                {
                    return "";
                }
            }
            if (flag)
            {
                i1 = 0x7f0804e5;
            } else
            {
                i1 = 0x7f0804c6;
            }
            break MISSING_BLOCK_LABEL_60;
        }
        if (flag)
        {
            i1 = 0x7f0804e4;
        } else
        {
            i1 = 0x7f0804c5;
        }
        break MISSING_BLOCK_LABEL_60;
    }

    public final CharSequence a(boolean flag, boolean flag1, com.skype.Message.TYPE type, CharSequence charsequence)
    {
        Object obj = charsequence;
        if (!flag) goto _L2; else goto _L1
_L1:
        obj = charsequence;
        if (flag1) goto _L2; else goto _L3
_L3:
        int i1 = -1;
        _cls2.c[type.ordinal()];
        JVM INSTR tableswitch 1 2: default 48
    //                   1 84
    //                   2 92;
           goto _L4 _L5 _L6
_L4:
        if (XmmUtil.isXmmMessageType(type))
        {
            i1 = 0x7f080107;
        }
_L8:
        obj = charsequence;
        if (i1 != -1)
        {
            obj = c.getString(i1);
        }
_L2:
        return ((CharSequence) (obj));
_L5:
        i1 = 0x7f080105;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = 0x7f080104;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final List a(com.skype.Conversation.LOCAL_LIVESTATUS local_livestatus)
    {
        return a(EnumSet.of(local_livestatus));
    }

    public final List a(Conversation conversation, com.skype.Conversation.PARTICIPANTFILTER participantfilter)
    {
        ArrayList arraylist = new ArrayList();
        conversation = conversation.getParticipants(participantfilter).m_participantObjectIDList;
        int j1 = conversation.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            int k1 = conversation[i1];
            arraylist.add((Participant)f.a(k1, com/skype/Participant));
        }

        return arraylist;
    }

    public final List a(EnumSet enumset)
    {
        ArrayList arraylist = new ArrayList();
        int ai[] = e.getConversationList(com.skype.Conversation.LIST_TYPE.LIVE_CONVERSATIONS).m_conversationObjectIDList;
        int j1 = ai.length;
label0:
        for (int i1 = 0; i1 < j1; i1++)
        {
            int k1 = ai[i1];
            Conversation conversation = (Conversation)f.a(k1, com/skype/Conversation);
            Iterator iterator = enumset.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                com.skype.Conversation.LOCAL_LIVESTATUS local_livestatus = (com.skype.Conversation.LOCAL_LIVESTATUS)iterator.next();
                if (conversation.getLocalLiveStatusProp() == local_livestatus)
                {
                    arraylist.add(conversation);
                }
            } while (true);
        }

        return arraylist;
    }

    public final List a(boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        PROPKEY propkey = PROPKEY.CONVERSATION_LOCAL_LIVESTATUS;
        ProptableImpl proptableimpl = new ProptableImpl();
        e.getConversationTable(com.skype.Conversation.LIST_TYPE.LIVE_CONVERSATIONS, new PROPKEY[] {
            propkey
        }, proptableimpl);
        for (int i1 = 0; i1 < proptableimpl.getCount(); i1++)
        {
            int j1 = proptableimpl.getInt(i1, PROPKEY.CONVERSATION_LOCAL_LIVESTATUS.toInt());
            if (flag || j1 != com.skype.Conversation.LOCAL_LIVESTATUS.OTHERS_ARE_LIVE.toInt() && j1 != com.skype.Conversation.LOCAL_LIVESTATUS.OTHERS_ARE_LIVE_FULL.toInt())
            {
                int k1 = proptableimpl.getObjectID(i1);
                arraylist.add((Conversation)f.a(k1, com/skype/Conversation));
            }
        }

        return arraylist;
    }

    public final Map a(long l1)
    {
        SparseArray sparsearray = new SparseArray();
        HashMap hashmap = new HashMap();
        if (l1 > 0L)
        {
            int i1 = (int)((System.currentTimeMillis() + 1000L) / 1000L);
            com.skype.SkyLib.GetMessageListByType_Result getmessagelistbytype_result1 = e.getMessageListByType(com.skype.Message.TYPE.POSTED_TEXT, true, (int)l1, i1);
            com.skype.SkyLib.GetMessageListByType_Result getmessagelistbytype_result2 = e.getMessageListByType(com.skype.Message.TYPE.POSTED_SMS, true, (int)l1, i1);
            com.skype.SkyLib.GetMessageListByType_Result getmessagelistbytype_result = e.getMessageListByType(com.skype.Message.TYPE.POSTED_FILES, true, (int)l1, i1);
            int ai1[] = getmessagelistbytype_result1.m_messageObjectIDList;
            int ai2[] = getmessagelistbytype_result2.m_messageObjectIDList;
            int ai3[] = getmessagelistbytype_result.m_messageObjectIDList;
            if (ai1.length > 0 || ai2.length > 0 || ai3.length > 0)
            {
                int ai[] = new int[ai1.length + ai2.length + ai3.length];
                System.arraycopy(ai1, 0, ai, 0, ai1.length);
                System.arraycopy(ai2, 0, ai, ai1.length, ai2.length);
                System.arraycopy(ai3, 0, ai, ai1.length + ai2.length, ai3.length);
                int k1 = ai.length;
                for (int j1 = 0; j1 < k1; j1++)
                {
                    int i2 = ai[j1];
                    MessageImpl messageimpl = new MessageImpl();
                    boolean flag = e.getConversationMessage(i2, messageimpl);
                    Object obj = messageimpl.getConsumptionStatusProp();
                    if (!flag || obj == com.skype.Message.CONSUMPTION_STATUS.CONSUMED || obj == com.skype.Message.CONSUMPTION_STATUS.UNCONSUMED_SUPPRESSED)
                    {
                        continue;
                    }
                    i2 = messageimpl.getConvoIdProp();
                    if (sparsearray.get(i2) != null || i2 <= 0)
                    {
                        continue;
                    }
                    obj = new ConversationImpl();
                    if (e.getConversationByConvoID(i2, ((Conversation) (obj))))
                    {
                        sparsearray.put(i2, obj);
                        hashmap.put(obj, messageimpl);
                    }
                }

            }
        }
        return hashmap;
    }

    public final void a(int i1, int j1)
    {
        try
        {
            android.content.SharedPreferences.Editor editor = c.getSharedPreferences("HeartMessageAnnotation", 0).edit();
            editor.putInt(g(i1), j1);
            editor.commit();
            return;
        }
        catch (Exception exception)
        {
            Log.i("ConversationUtil", "Unable to store to shared preferences.");
        }
    }

    public final void a(Conversation conversation)
    {
        int ai[] = e.getConversationList(com.skype.Conversation.LIST_TYPE.PINNED_CONVERSATIONS).m_conversationObjectIDList;
        boolean flag;
        if (ai.length == 0)
        {
            flag = conversation.pinFirst();
        } else
        {
            flag = conversation.pinAfter(ai[ai.length - 1]);
        }
        if (flag)
        {
            Toast.makeText(c, c.getString(0x7f0803a3, new Object[] {
                m(conversation)
            }), 0).show();
        }
    }

    public final void a(Conversation conversation, TranslatorSetting translatorsetting)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("enabled", translatorsetting.a);
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.put("mycode", translatorsetting.b);
            jsonobject1.put("othercode", translatorsetting.c);
            jsonobject.put("text", jsonobject1);
            jsonobject1 = new JSONObject();
            jsonobject1.put("mycode", translatorsetting.d);
            jsonobject1.put("othercode", translatorsetting.e);
            jsonobject.put("speech", jsonobject1);
            translatorsetting = jsonobject.toString();
        }
        // Misplaced declaration of an exception variable
        catch (Conversation conversation)
        {
            return;
        }
        try
        {
            android.content.SharedPreferences.Editor editor = c.getSharedPreferences(m, 0).edit();
            editor.putString(G(conversation), translatorsetting);
            editor.commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Conversation conversation)
        {
            return;
        }
    }

    public final Contact b(Participant participant)
    {
        participant = participant.getIdentityProp();
        ContactImpl contactimpl = new ContactImpl();
        e.getContact(participant, contactimpl);
        f.b(contactimpl);
        return contactimpl;
    }

    public final List b(long l1)
    {
        CallExtractor callextractor = a;
        ArrayList arraylist = new ArrayList();
        int i1 = (int)((System.currentTimeMillis() + 1000L) / 1000L);
        if (l1 > 0L)
        {
            int ai[] = e.getMessageListByType(com.skype.Message.TYPE.ENDED_LIVESESSION, true, (int)l1, i1).m_messageObjectIDList;
            if (ai.length > 0)
            {
                int k1 = ai.length;
                for (int j1 = 0; j1 < k1; j1++)
                {
                    int i2 = ai[j1];
                    Object obj = new MessageImpl();
                    e.getConversationMessage(i2, ((Message) (obj)));
                    MessageImpl messageimpl = new MessageImpl();
                    e.getConversationMessage(((Message) (obj)).getOtherLiveMessage(), messageimpl);
                    com.skype.SkyLib.LEAVE_REASON leave_reason = ((Message) (obj)).getLeaveReasonProp();
                    if (messageimpl.getAuthorProp().equalsIgnoreCase(((Account)h.get()).getSkypenameProp()) || !leave_reason.equals(com.skype.SkyLib.LEAVE_REASON.LIVE_NO_ANSWER))
                    {
                        continue;
                    }
                    i2 = ((Message) (obj)).getConvoIdProp();
                    if (i2 <= 0)
                    {
                        continue;
                    }
                    obj = new ConversationImpl();
                    if (e.getConversationByConvoID(i2, ((Conversation) (obj))))
                    {
                        arraylist.add(callextractor.a(((Conversation) (obj))));
                    }
                }

            }
        }
        return arraylist;
    }

    public final void b(int i1)
    {
        Object obj = b(System.currentTimeMillis() / 1000L);
        if (((List) (obj)).size() > 0)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                if (((Conversation)((Iterator) (obj)).next()).getObjectID() == i1)
                {
                    ((Iterator) (obj)).remove();
                }
            } while (true);
        }
    }

    public final void b(Conversation conversation)
    {
        if (conversation.unPin())
        {
            Toast.makeText(c, c.getString(0x7f0803a7, new Object[] {
                m(conversation)
            }), 0).show();
        }
    }

    public final boolean b(boolean flag)
    {
        EnumSet enumset = EnumSet.of(com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE);
        if (flag)
        {
            enumset.add(com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_LOCALLY);
            enumset.add(com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_REMOTELY);
        }
        return a(enumset).size() > 0;
    }

    public final int c(int i1)
    {
        try
        {
            i1 = c.getSharedPreferences("HeartMessageAnnotation", 0).getInt(g(i1), -1);
        }
        catch (Exception exception)
        {
            Log.i("ConversationUtil", "Unable to retrieve from shared preferences.");
            return -1;
        }
        return i1;
    }

    public final CharSequence c(boolean flag)
    {
        if (flag)
        {
            return j.a(0x7f0804e6, new Object[0]);
        } else
        {
            return j.a(0x7f0804c7, new Object[0]);
        }
    }

    public final List c(Conversation conversation, com.skype.Conversation.PARTICIPANTFILTER participantfilter)
    {
        ArrayList arraylist = new ArrayList();
        a(conversation, participantfilter, arraylist, e.getChatMemberCountLimit());
        return arraylist;
    }

    public final CharSequence d(boolean flag)
    {
        if (flag)
        {
            return j.a(c.getResources().getQuantityString(0x7f0b0012, 1), new Object[0]);
        } else
        {
            return j.a(c.getResources().getQuantityString(0x7f0b0011, 1), new Object[0]);
        }
    }

    public final void d(int i1)
    {
        try
        {
            android.content.SharedPreferences.Editor editor = c.getSharedPreferences("HeartMessageAnnotation", 0).edit();
            editor.remove(g(i1));
            editor.apply();
            return;
        }
        catch (Exception exception)
        {
            Log.i("ConversationUtil", "Unable to remove from shared preferences.");
        }
    }

    public final CharSequence e(boolean flag)
    {
        if (flag)
        {
            return j.a(0x7f0804e3, new Object[0]);
        } else
        {
            return j.a(0x7f0804c4, new Object[0]);
        }
    }

    public final boolean e(int i1)
    {
        return !D((Conversation)f.a(i1, com/skype/Conversation));
    }

    public final boolean f(int i1)
    {
label0:
        {
            Object obj = (Conversation)f.a(i1, com/skype/Conversation);
            boolean flag = false;
            if (((Conversation) (obj)).getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
            {
                obj = r(((Conversation) (obj)));
                if (!ContactUtil.g(((Contact) (obj))) || ((Contact) (obj)).isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.ALL_BUDDIES))
                {
                    break label0;
                }
                flag = true;
            }
            return flag;
        }
        return false;
    }

    public final boolean f(Conversation conversation)
    {
        boolean flag = a(conversation, com.skype.Conversation.CAPABILITY.CAN_RING_ALL);
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            return flag;
        }
        return flag && a(e).contains(com.skype.SkyLib.NGC_CAPABILITIES.NGC_GROUP_CALLING_ENABLED);
    }

    public final boolean i(Conversation conversation)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (e.getSetup().getInt("*Lib/Video/Disable") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag3 = a(conversation, com.skype.Conversation.CAPABILITY.CAN_RING_VIDEO);
        flag2 = flag3;
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.CONFERENCE)
        {
            if (flag3 && a(e).contains(com.skype.SkyLib.NGC_CAPABILITIES.NGC_GROUP_CALLING_INITIATION_ENABLED))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
        }
        conversation = c.getPackageManager();
        if (conversation.hasSystemFeature("android.hardware.camera") || conversation.hasSystemFeature("android.hardware.camera.front"))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag1 && flag && flag2;
    }

    public final boolean j(Conversation conversation)
    {
        boolean flag4 = false;
        if (!k.isAsyncVideoMessageEnabled()) goto _L2; else goto _L1
_L1:
        boolean flag3;
        PackageManager packagemanager = c.getPackageManager();
        boolean flag;
        boolean flag2;
        if (packagemanager.hasSystemFeature("android.hardware.camera") || packagemanager.hasSystemFeature("android.hardware.camera.front"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (e.getSetup().getInt("*Lib/Video/Disable") == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag && flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag3 = flag4;
        if (flag)
        {
            flag3 = flag4;
            if (E(conversation))
            {
                flag3 = flag4;
                if (a(conversation, com.skype.Conversation.CAPABILITY.CAN_SEND_MEDIAMESSAGE))
                {
                    flag3 = true;
                }
            }
        }
_L4:
        return flag3;
_L2:
        flag3 = flag4;
        if (!i(conversation)) goto _L4; else goto _L3
_L3:
        VideoMessageEntitlementPropMap videomessageentitlementpropmap;
        boolean flag5;
        flag5 = a(conversation, com.skype.Conversation.CAPABILITY.CAN_SEND_VIDEOMESSAGE);
        videomessageentitlementpropmap = new VideoMessageEntitlementPropMap(e.getVideoMessagingEntitlement());
        flag3 = flag4;
        if (!E(conversation)) goto _L4; else goto _L5
_L5:
        flag3 = flag4;
        if (!flag5) goto _L4; else goto _L6
_L6:
        if (videomessageentitlementpropmap.a() > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag1;
        if (videomessageentitlementpropmap.a() == -1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag3 = flag4;
        if (!flag1) goto _L4; else goto _L7
_L7:
        return true;
    }

    public final boolean k(Conversation conversation)
    {
        return a(conversation, com.skype.Conversation.CAPABILITY.CAN_SEND_FILE) && conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG || a(conversation, com.skype.Conversation.CAPABILITY.CAN_SEND_MEDIAMESSAGE) && k.isAsyncFileSharingEnabled();
    }

    public final boolean l(Conversation conversation)
    {
        return a(conversation, com.skype.Conversation.CAPABILITY.CAN_SEND_STATIC_LOCATION_MESSAGE) && l.isLocationSendingEnabled(c, k);
    }

    public final CharSequence m(Conversation conversation)
    {
        String s3;
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            s3 = i.l(r(conversation));
        } else
        {
            if (!TextUtils.isEmpty(conversation.getMetaTopicProp()))
            {
                return g.a(conversation);
            }
            s3 = conversation.getDisplaynameProp();
            if (!TextUtils.isEmpty(s3))
            {
                String s1 = s3.toString();
                i.getClass();
                if (s1.contains("guest:"))
                {
                    s3 = "";
                }
            }
            String s2 = s3;
            if (!TextUtils.isEmpty(s3))
            {
                s2 = s3;
                if (s3.toString().trim().equals(((Account)h.get()).getSkypenameProp()))
                {
                    s2 = "";
                }
            }
            s3 = s2;
            if (TextUtils.isEmpty(s2))
            {
                conversation = c(conversation, com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS);
                if (conversation.size() == 0)
                {
                    return c.getResources().getString(0x7f0804e9);
                }
                ArrayList arraylist = new ArrayList();
                Iterator iterator = conversation.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Contact contact = (Contact)iterator.next();
                    arraylist.add(contact.getDisplaynameProp().trim());
                    String s4 = contact.getDisplaynameProp().trim();
                    i.getClass();
                    if (s4.startsWith("guest:"))
                    {
                        contact.refreshProfile();
                    }
                } while (arraylist.size() != 3);
                if (conversation.size() > 3)
                {
                    arraylist.add("...");
                }
                return TextUtils.join(", ", arraylist);
            }
        }
        return s3;
    }

    public final CharSequence n(Conversation conversation)
    {
        com.skype.Conversation.TYPE type = conversation.getTypeProp();
        boolean flag;
        if (type == com.skype.Conversation.TYPE.LEGACY_VOICE_CONFERENCE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (type == com.skype.Conversation.TYPE.CONFERENCE || flag)
        {
            if (!TextUtils.isEmpty(conversation.getMetaTopicProp()))
            {
                return g.a(conversation);
            }
            Object obj = new ArrayList();
            int j1;
            if (flag)
            {
                ((List) (obj)).addAll(c(conversation, com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS));
            } else
            {
                LinkedList linkedlist = new LinkedList();
                Iterator iterator = a(conversation, com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Participant participant = (Participant)iterator.next();
                    if (a(conversation, participant))
                    {
                        linkedlist.add(b(participant));
                    }
                } while (true);
                if (linkedlist.size() == 1 && ((Contact)linkedlist.get(0)).getIdentity().equals(conversation.getLiveHostProp()))
                {
                    ((List) (obj)).addAll(c(conversation, com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS));
                } else
                {
                    ((List) (obj)).addAll(linkedlist);
                }
            }
            j1 = ((List) (obj)).size();
            if (((List) (obj)).size() == 1 && j1 == 1)
            {
                return i.l((Contact)((List) (obj)).get(0));
            }
            conversation = new StringBuilder();
            obj = ((List) (obj)).iterator();
            int i1;
            if (((Iterator) (obj)).hasNext())
            {
                obj = (Contact)((Iterator) (obj)).next();
                if (conversation.length() > 0)
                {
                    conversation.append(", ");
                }
                conversation.append(i.l(((Contact) (obj))));
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 < j1)
            {
                String s1 = conversation.toString();
                conversation = new StringBuilder();
                conversation.append(c.getResources().getQuantityString(0x7f0b0017, j1 - i1, new Object[] {
                    s1, Integer.valueOf(j1 - i1)
                }));
            }
            return conversation.toString();
        } else
        {
            return i.l(r(conversation));
        }
    }

    public final Participant o(Conversation conversation)
    {
        conversation = conversation.getParticipants(com.skype.Conversation.PARTICIPANTFILTER.MYSELF).m_participantObjectIDList;
        if (conversation.length > 0)
        {
            return (Participant)f.a(conversation[0], com/skype/Participant);
        } else
        {
            return null;
        }
    }

    public final List q(Conversation conversation)
    {
        LinkedList linkedlist = new LinkedList();
        int i1 = conversation.getConsumptionHorizonProp();
        int k1 = (int)(System.currentTimeMillis() / 1000L);
        int ai[] = e.getMessageListByType(com.skype.Message.TYPE.POSTED_VOICE_MESSAGE, false, i1, k1 + 1).m_messageObjectIDList;
        k1 = ai.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            int l1 = ai[j1];
            Message message = (Message)f.a(l1, com/skype/Message);
            VoicemailImpl voicemailimpl = new VoicemailImpl();
            if (message.getVoiceMessage(voicemailimpl) && voicemailimpl.getConvoIdProp() == conversation.getDbID() && voicemailimpl.getStatusProp() != com.skype.Voicemail.STATUS.PLAYED)
            {
                linkedlist.add(voicemailimpl);
            }
        }

        return linkedlist;
    }

    public final Contact r(Conversation conversation)
    {
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            ContactImpl contactimpl = new ContactImpl();
            e.getContact(conversation.getIdentityProp(), contactimpl);
            return contactimpl;
        } else
        {
            throw new IllegalArgumentException("Requires a conversation of type DIALOG");
        }
    }

    public final boolean x(Conversation conversation)
    {
        Object obj = o(conversation);
        if (obj != null)
        {
            obj = ((Participant) (obj)).getLiveSessionVideos();
            if (((com.skype.Participant.GetLiveSessionVideos_Result) (obj)).m_return && ((com.skype.Participant.GetLiveSessionVideos_Result) (obj)).m_videoObjectIDList.length > 0)
            {
                int ai[] = ((com.skype.Participant.GetLiveSessionVideos_Result) (obj)).m_videoObjectIDList;
                int j1 = ai.length;
                for (int i1 = 0; i1 < j1; i1++)
                {
                    int k1 = ai[i1];
                    VideoImpl videoimpl = new VideoImpl();
                    if (e.getVideo(k1, videoimpl) && videoimpl.getMediaTypeProp() == com.skype.Video.MEDIATYPE.MEDIA_VIDEO && a(videoimpl))
                    {
                        return true;
                    }
                }

            }
        }
        for (conversation = a(conversation, com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS).iterator(); conversation.hasNext();)
        {
            Participant participant = (Participant)conversation.next();
            if (a(a(e, participant)))
            {
                return true;
            }
        }

        return false;
    }

}
