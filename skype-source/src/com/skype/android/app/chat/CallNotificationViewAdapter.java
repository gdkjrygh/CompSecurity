// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v7.util.a;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.calling.CallQualityFeedbackManager;
import com.skype.android.app.calling.CallQualityFeedbackRating;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.cache.FormattedMessageCache;
import com.skype.android.widget.SymbolView;

// Referenced classes of package com.skype.android.app.chat:
//            MessageViewAdapter, MessageViewAdapterComponent, MessageHolderUtil, MessageHolder, 
//            j, ChatFragmentProvider, ChatFragment, SkypeMessageHolder

public class CallNotificationViewAdapter extends MessageViewAdapter
    implements android.os.Handler.Callback, android.view.View.OnClickListener, android.widget.RatingBar.OnRatingBarChangeListener
{
    private static final class a extends j
    {

        TextView contents;
        RelativeLayout contentsContainer;
        TextView duration;
        SymbolView icon;
        boolean isUpsellCandidate;
        String overrideText;
        RatingBar ratingBar;
        View ratingContainer;
        TextView ratingText;
        boolean shouldHideItem;
        TextView videoMessageUpsell;

        public a(View view)
        {
            super(view);
            icon = (SymbolView)view.findViewById(0x7f1002a8);
            contentsContainer = (RelativeLayout)view.findViewById(0x7f1002a9);
            contents = (TextView)view.findViewById(0x7f1002aa);
            duration = (TextView)view.findViewById(0x7f1002ab);
            videoMessageUpsell = (TextView)view.findViewById(0x7f1002ac);
            ratingContainer = view.findViewById(0x7f1002ad);
            ratingText = (TextView)view.findViewById(0x7f1002af);
            ratingBar = (RatingBar)view.findViewById(0x7f1002b0);
        }
    }


    private static final int ACCESSIBLE_RATING_DELAY = 10000;
    private static final int RATING_DELAY = 3000;
    private static final int ratedAccStringIds[] = {
        0x7f0800d3, 0x7f0800d5, 0x7f0800d4, 0x7f0800d2, 0x7f0800d1
    };
    private static final int ratingActionAccStringIds[] = {
        0x7f0800cf, 0x7f0800d0, 0x7f0800dc, 0x7f0800db, 0x7f0800ce, 0x7f0800cd
    };
    private static final int ratingStringIds[] = {
        0x7f08030e, 0x7f08030d, 0x7f08030b, 0x7f08030c, 0x7f08030a
    };
    private static final int supportedMessageTypes[];
    private static final int thankYouAccStringIds[] = {
        0x7f0800d8, 0x7f0800da, 0x7f0800d9, 0x7f0800d7, 0x7f0800d6
    };
    AccessibilityUtil accessibilityUtil;
    private ClickableSpan clickableSpan;
    ConversationUtil conversationUtil;
    CallQualityFeedbackManager cqfManager;
    private Handler handler;
    SkyLib lib;
    FormattedMessageCache messageCache;
    MessageHolderUtil messageHolderUtil;
    TimeUtil timeUtil;

    CallNotificationViewAdapter(Activity activity)
    {
        super(activity);
        clickableSpan = new ClickableSpan() {

            final CallNotificationViewAdapter this$0;

            public final void onClick(View view)
            {
                showUrl(com.skype.android.res.Urls.Type.w);
            }

            
            {
                this$0 = CallNotificationViewAdapter.this;
                super();
            }
        };
        getComponent().inject(this);
        handler = new Handler(this);
    }

    private void alignTextAndIcon(a a1, boolean flag)
    {
        Resources resources = getContext().getResources();
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)a1.contentsContainer.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutparams1 = (android.widget.RelativeLayout.LayoutParams)a1.icon.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutparams2 = (android.widget.RelativeLayout.LayoutParams)a1.contents.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutparams3 = (android.widget.RelativeLayout.LayoutParams)a1.duration.getLayoutParams();
        if (flag)
        {
            layoutparams1.rightMargin = 0;
            layoutparams1.leftMargin = resources.getDimensionPixelSize(0x7f0c0076);
            layoutparams1.addRule(11);
            layoutparams1.addRule(9, 0);
            layoutparams.addRule(1, 0);
            layoutparams.addRule(0, a1.icon.getId());
            layoutparams3.addRule(11);
            layoutparams3.addRule(1, 0);
            layoutparams2.addRule(0, a1.duration.getId());
            layoutparams2.addRule(9, 0);
        } else
        {
            layoutparams1.rightMargin = resources.getDimensionPixelSize(0x7f0c0076);
            layoutparams1.leftMargin = 0;
            layoutparams1.addRule(9);
            layoutparams1.addRule(11, 0);
            layoutparams.addRule(0, 0);
            layoutparams.addRule(1, a1.icon.getId());
            layoutparams2.addRule(9);
            layoutparams2.addRule(0, 0);
            layoutparams3.addRule(1, a1.contents.getId());
            layoutparams3.addRule(11, 0);
        }
        a1.icon.setLayoutParams(layoutparams1);
        a1.contentsContainer.setLayoutParams(layoutparams);
        a1.contents.setLayoutParams(layoutparams2);
        a1.duration.setLayoutParams(layoutparams3);
    }

    private SpannableString createLearnMoreSpannableString(CharSequence charsequence, Context context)
    {
        SpannableString spannablestring = new SpannableString((new StringBuilder()).append(charsequence).append(" ").append(context.getString(0x7f080350)).toString());
        spannablestring.setSpan(new UnderlineSpan(), charsequence.length() + 1, spannablestring.length(), 0);
        spannablestring.setSpan(clickableSpan, charsequence.length() + 1, spannablestring.length(), 0);
        spannablestring.setSpan(new ForegroundColorSpan(context.getResources().getColor(0x7f0f00d3)), charsequence.length() + 1, spannablestring.length(), 0);
        spannablestring.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(0x7f0c0090)), charsequence.length() + 1, spannablestring.length(), 0);
        return spannablestring;
    }

    private int getCallDuration(Message message)
    {
        return message.getParamValueProp();
    }

    private int getConsecutiveNumMissedCalls(MessageHolder messageholder, android.support.v7.util.a a1)
    {
        int i = 0;
        int l = a1.c(messageholder);
        int k;
        do
        {
            k = i;
            if (!MessageHolderUtil.isStartedLiveSession(messageholder))
            {
                break;
            }
            k = i;
            if (!messageHolderUtil.isMissedCall(messageholder))
            {
                break;
            }
            i++;
            k = i;
            if (l - 2 < 0)
            {
                break;
            }
            l--;
            k = i;
            if (!MessageHolderUtil.isEndedLiveSession((MessageHolder)a1.b(l)))
            {
                break;
            }
            l--;
            messageholder = (MessageHolder)a1.b(l);
        } while (true);
        return k;
    }

    private String getRatingContentDescription(CallQualityFeedbackRating callqualityfeedbackrating, a a1)
    {
        a1 = a1.ratingBar;
        int i;
        if (callqualityfeedbackrating.getState() == com.skype.android.app.calling.CallQualityFeedbackRating.State.PENDING)
        {
            i = ratingActionAccStringIds[callqualityfeedbackrating.getValue()];
        } else
        {
            i = ratedAccStringIds[callqualityfeedbackrating.getValue() - 1];
        }
        return a1.getContext().getString(i);
    }

    private int getRatingDelay()
    {
        return !accessibilityUtil.a() ? 3000 : 10000;
    }

    private boolean isOutgoing(j j1, MessageHolder messageholder)
    {
        boolean flag = j1.isOutgoing();
        if (MessageHolderUtil.isEndedLiveSession(messageholder))
        {
            flag = messageHolderUtil.isOutgoing(messageholder);
        }
        return flag;
    }

    private boolean isUpsellCandidate(MessageHolder messageholder, android.support.v7.util.a a1)
    {
        ChatFragment chatfragment = ((ChatFragmentProvider)getContext()).getChatFragment();
        if (messageholder.getTimestamp() < chatfragment.getChatFragmentCreatedTimestamp())
        {
            return false;
        }
        if (!MessageHolderUtil.isStartedLiveSession(messageholder))
        {
            return false;
        }
        int i = a1.c(messageholder);
        if (i != a1.a() - 2)
        {
            return false;
        }
        if (!MessageHolderUtil.isEndedLiveSession((MessageHolder)a1.b(i + 1)))
        {
            return false;
        }
        boolean flag = messageHolderUtil.isOutgoing(messageholder);
        messageholder = (Message)messageholder.getMessageObject();
        if (!flag || getCallDuration(messageholder) > 0)
        {
            return false;
        }
        messageholder = messageholder.getLeaveReasonProp();
        static final class _cls3
        {

            static final int $SwitchMap$com$skype$SkyLib$LEAVE_REASON[];
            static final int $SwitchMap$com$skype$android$app$calling$CallQualityFeedbackRating$State[];

            static 
            {
                $SwitchMap$com$skype$android$app$calling$CallQualityFeedbackRating$State = new int[com.skype.android.app.calling.CallQualityFeedbackRating.State.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$calling$CallQualityFeedbackRating$State[com.skype.android.app.calling.CallQualityFeedbackRating.State.PENDING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$android$app$calling$CallQualityFeedbackRating$State[com.skype.android.app.calling.CallQualityFeedbackRating.State.SUBMITTED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                $SwitchMap$com$skype$SkyLib$LEAVE_REASON = new int[com.skype.SkyLib.LEAVE_REASON.values().length];
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_BUSY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LEAVE_REASON_NONE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_NO_ANSWER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_MANUAL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_PSTN_BLOCKED_REGULATORY_INDIA.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_ERROR.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_UNABLE_TO_CONNECT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_INTERNAL_ERROR.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.skype.SkyLib.LEAVE_REASON[messageholder.ordinal()])
        {
        case 5: // '\005'
        default:
            return false;

        case 3: // '\003'
        case 4: // '\004'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            return true;
        }
    }

    private void setRatingView(CallQualityFeedbackRating callqualityfeedbackrating, a a1, boolean flag)
    {
        RatingBar ratingbar;
        TextView textview;
        textview = a1.ratingText;
        ratingbar = a1.ratingBar;
        _cls3..SwitchMap.com.skype.android.app.calling.CallQualityFeedbackRating.State[callqualityfeedbackrating.getState().ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 104
    //                   2 140;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_140;
_L1:
        textview.setText(null);
_L4:
        a1 = getRatingContentDescription(callqualityfeedbackrating, a1);
        boolean flag1;
        if (callqualityfeedbackrating.getState() != com.skype.android.app.calling.CallQualityFeedbackRating.State.PENDING)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ratingbar.setIsIndicator(flag1);
        ratingbar.setContentDescription(a1);
        if (flag && accessibilityUtil.a())
        {
            AccessibilityUtil.b(ratingbar, a1);
        }
        return;
_L2:
        if (callqualityfeedbackrating.getValue() == 0)
        {
            textview.setText(0x7f0802c4);
        } else
        {
            textview.setText(ratingStringIds[callqualityfeedbackrating.getValue() - 1]);
        }
          goto _L4
        textview.setText(0x7f080335);
          goto _L4
    }

    private boolean shouldHideMessage(MessageHolder messageholder, android.support.v7.util.a a1)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (!MessageHolderUtil.isEndedLiveSession(messageholder))
            {
                break label0;
            }
            int i = a1.c(messageholder);
            flag = flag1;
            if (i <= 0)
            {
                break label0;
            }
            if (!MessageHolderUtil.isStartedLiveSession((MessageHolder)a1.b(i - 1)))
            {
                flag = flag1;
                if (getCallDuration((Message)messageholder.getMessageObject()) != 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
        boolean flag2 = flag;
        if (MessageHolderUtil.isStartedLiveSession(messageholder))
        {
            flag2 = flag;
            if (messageHolderUtil.isMissedCall(messageholder))
            {
                int k = a1.c(messageholder);
                flag2 = flag;
                if (k + 2 < a1.a())
                {
                    messageholder = (MessageHolder)a1.b(k + 1);
                    flag2 = flag;
                    if (MessageHolderUtil.isEndedLiveSession(messageholder))
                    {
                        flag2 = flag;
                        if (messageHolderUtil.isMissedCall(messageholder))
                        {
                            messageholder = (MessageHolder)a1.b(k + 2);
                            flag2 = flag;
                            if (MessageHolderUtil.isStartedLiveSession(messageholder))
                            {
                                flag2 = flag;
                                if (messageHolderUtil.isMissedCall(messageholder))
                                {
                                    flag2 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag2;
    }

    private boolean shouldShowCallStarted(MessageHolder messageholder, android.support.v7.util.a a1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (MessageHolderUtil.isStartedLiveSession(messageholder))
        {
            int i = a1.c(messageholder);
            if (i == a1.a() - 1 && (messageholder instanceof SkypeMessageHolder))
            {
                flag = ConversationUtil.t(((SkypeMessageHolder)messageholder).getConversation());
            } else
            {
                messageholder = (MessageHolder)a1.b(i + 1);
                flag = flag1;
                if (messageholder != null)
                {
                    flag = flag1;
                    if (!MessageHolderUtil.isEndedLiveSession(messageholder))
                    {
                        return true;
                    }
                }
            }
        }
        return flag;
    }

    private void showUrl(com.skype.android.res.Urls.Type type)
    {
        navigationUrl.goToUrl(getContext(), type);
    }

    private void updateVideoMessageUpsell(a a1, final MessageHolder chatFragment)
    {
        if (a1.isOutgoing() && (chatFragment instanceof SkypeMessageHolder) && conversationUtil.j(((SkypeMessageHolder)chatFragment).getConversation()))
        {
            chatFragment = ((ChatFragmentProvider)getContext()).getChatFragment();
            a1.videoMessageUpsell.setVisibility(0);
            a1.videoMessageUpsell.setOnClickListener(new android.view.View.OnClickListener() {

                final CallNotificationViewAdapter this$0;
                final ChatFragment val$chatFragment;

                public final void onClick(View view)
                {
                    chatFragment.startVideoMessageFlow();
                }

            
            {
                this$0 = CallNotificationViewAdapter.this;
                chatFragment = chatfragment;
                super();
            }
            });
            return;
        } else
        {
            a1.videoMessageUpsell.setVisibility(8);
            a1.videoMessageUpsell.setOnClickListener(null);
            a1.videoMessageUpsell.setClickable(false);
            return;
        }
    }

    protected void bindContentView(j j1, MessageHolder messageholder)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        a a1;
        View view;
        boolean flag;
        a1 = (a)j1;
        if (a1.shouldHideItem)
        {
            j1.itemView.setVisibility(8);
            j1.itemView.getLayoutParams().height = 0;
            return;
        }
        obj2 = (Message)messageholder.getMessageObject();
        flag = isOutgoing(j1, messageholder);
        obj1 = messageCache.a(((Message) (obj2)));
        obj = messageCache.a(((Message) (obj2)), true);
        obj3 = messageCache.a(((Message) (obj2)), false);
        byte byte0 = 0;
        if (a1.overrideText != null)
        {
            obj1 = a1.overrideText;
            obj = "";
            obj3 = "";
            byte0 = 8;
        }
        view = a1.itemView;
        view.setTag(a1);
        updateRatingViews(a1, ((Message) (obj2)));
        a1.icon.setVisibility(0);
        a1.videoMessageUpsell.setVisibility(8);
        a1.duration.setVisibility(byte0);
        if (a1.isUpsellCandidate)
        {
            updateVideoMessageUpsell(a1, messageholder);
        }
        messageholder = ((Message) (obj2)).getLeaveReasonProp();
        obj2 = null;
        _cls3..SwitchMap.com.skype.SkyLib.LEAVE_REASON[messageholder.ordinal()];
        JVM INSTR tableswitch 1 5: default 240
    //                   1 384
    //                   2 384
    //                   3 391
    //                   4 391
    //                   5 410;
           goto _L1 _L2 _L2 _L3 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_410;
_L1:
        messageholder = com.skype.android.widget.SymbolElement.SymbolCode.K;
_L5:
        a1.icon.setSymbolCode(messageholder);
        SymbolView symbolview = a1.icon;
        int i;
        if (messageholder == com.skype.android.widget.SymbolElement.SymbolCode.G)
        {
            i = getContext().getResources().getColor(0x7f0f011c);
        } else
        {
            i = getContext().getResources().getColor(0x7f0f00d3);
        }
        symbolview.setTextColor(i);
        messageholder = a1.duration;
        if (obj2 != null)
        {
            obj = obj2;
        }
        messageholder.setText(((CharSequence) (obj)));
        if (obj2 != null)
        {
            a1.duration.setMovementMethod(LinkMovementMethod.getInstance());
        }
        a1.duration.setContentDescription(((CharSequence) (obj3)));
        a1.contents.setText(((CharSequence) (obj1)));
        view.setOnClickListener(this);
        alignTimestampView(a1, flag);
        alignTextAndIcon(a1, flag);
        j1.itemView.setVisibility(0);
        j1.itemView.getLayoutParams().height = -2;
        return;
_L2:
        messageholder = com.skype.android.widget.SymbolElement.SymbolCode.u;
          goto _L5
_L3:
        if (flag)
        {
            messageholder = com.skype.android.widget.SymbolElement.SymbolCode.u;
        } else
        {
            messageholder = com.skype.android.widget.SymbolElement.SymbolCode.G;
        }
          goto _L5
        messageholder = com.skype.android.widget.SymbolElement.SymbolCode.K;
        obj2 = createLearnMoreSpannableString(((CharSequence) (obj)), view.getContext());
        obj1 = "";
          goto _L5
    }

    protected void bindContentView(j j1, MessageHolder messageholder, android.support.v7.util.a a1)
    {
        a a2;
        a2 = (a)j1;
        a2.shouldHideItem = shouldHideMessage(messageholder, a1);
        if (a2.shouldHideItem) goto _L2; else goto _L1
_L1:
        Object obj = null;
        if (!shouldShowCallStarted(messageholder, a1)) goto _L4; else goto _L3
_L3:
        String s = getContext().getString(0x7f080383);
_L6:
        a2.overrideText = s;
        a2.isUpsellCandidate = isUpsellCandidate(messageholder, a1);
_L2:
        super.bindContentView(j1, messageholder, a1);
        return;
_L4:
        s = obj;
        if (MessageHolderUtil.isStartedLiveSession(messageholder))
        {
            s = obj;
            if (messageHolderUtil.isMissedCall(messageholder))
            {
                int i = getConsecutiveNumMissedCalls(messageholder, a1);
                s = obj;
                if (i > 1)
                {
                    s = getContext().getString(0x7f0803fa, new Object[] {
                        Integer.valueOf(i)
                    });
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected j createMessageViewHolder(View view)
    {
        return new a(view);
    }

    protected CharSequence getDefaultContentDescription(j j1, MessageHolder messageholder)
    {
        Object obj = (Message)messageholder.getMessageObject();
        j1 = (a)j1;
        messageholder = messageCache.a(((Message) (obj)), false);
        String s = timeUtil.g(((Message) (obj)).getTimestampProp());
        obj = cqfManager.getPendingRating(((Message) (obj)).getObjectID());
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s);
        stringbuilder.append(", ");
        stringbuilder.append(ViewUtil.b(((a) (j1)).contents));
        stringbuilder.append(" ");
        stringbuilder.append(messageholder);
        if (obj != null)
        {
            stringbuilder.append(", ");
            stringbuilder.append(((a) (j1)).ratingText.getText());
            stringbuilder.append(", ");
            stringbuilder.append(((a) (j1)).ratingBar.getContentDescription());
        }
        return stringbuilder.toString();
    }

    protected int getLayoutId(int i)
    {
        return 0x7f030041;
    }

    public int[] getSupportedMessageTypes()
    {
        return supportedMessageTypes;
    }

    protected long getTimestamp(MessageHolder messageholder)
    {
        return messageholder.getTimestamp();
    }

    public boolean handleMessage(android.os.Message message)
    {
        boolean flag = false;
        CallQualityFeedbackRating callqualityfeedbackrating = cqfManager.getPendingRating(message.what);
        if (callqualityfeedbackrating != null && callqualityfeedbackrating.getValue() != 0)
        {
            callqualityfeedbackrating.setSubmitted();
            cqfManager.uploadSubmittedAndExpired();
            message = (a)message.obj;
            setRatingView(callqualityfeedbackrating, message, false);
            if (accessibilityUtil.a() && message != null)
            {
                message = ((a) (message)).ratingBar;
                AccessibilityUtil.b(message, message.getContext().getString(thankYouAccStringIds[callqualityfeedbackrating.getValue() - 1]));
            }
        }
        if (callqualityfeedbackrating != null)
        {
            flag = true;
        }
        return flag;
    }

    public boolean isStandalone(MessageHolder messageholder)
    {
        return true;
    }

    public void onClick(View view)
    {
        if (!view.isInTouchMode())
        {
            view = (a)view.getTag();
            if (view != null && ((a) (view)).ratingContainer.getVisibility() == 0)
            {
                ((a) (view)).ratingBar.requestFocus();
            }
        }
    }

    public void onRatingChanged(RatingBar ratingbar, float f, boolean flag)
    {
        int i = ((Integer)ratingbar.getTag(0x7f100010)).intValue();
        a a1 = (a)ratingbar.getTag(0x7f10000f);
        CallQualityFeedbackRating callqualityfeedbackrating = cqfManager.getPendingRating(i);
        if (callqualityfeedbackrating != null && a1 != null && f != (float)callqualityfeedbackrating.getValue())
        {
            callqualityfeedbackrating.setValue((int)f);
            setRatingView(callqualityfeedbackrating, a1, true);
            if (!ratingbar.isPressed() && callqualityfeedbackrating.getValue() > 0)
            {
                handler.removeMessages(i);
                ratingbar = handler.obtainMessage(i);
                ratingbar.obj = a1;
                handler.sendMessageDelayed(ratingbar, getRatingDelay());
            }
        }
    }

    public void updateRatingViews(a a1, Message message)
    {
        boolean flag = true;
        if (accessibilityUtil.a())
        {
            a1.ratingText.post(accessibilityUtil.a(a1.ratingContainer, a1.ratingText, 12));
            a1.ratingBar.post(accessibilityUtil.a(a1.ratingContainer, a1.ratingBar, 12));
            a1.ratingText.setFocusable(true);
        }
        message = cqfManager.getPendingRating(message.getObjectID());
        RatingBar ratingbar = a1.ratingBar;
        if (message == null)
        {
            flag = false;
        }
        ratingbar.setFocusable(flag);
        if (message != null)
        {
            a1.ratingBar.setTag(0x7f100010, Integer.valueOf(message.getId()));
            a1.ratingBar.setTag(0x7f10000f, a1);
            a1.ratingBar.setRating(message.getValue());
            setRatingView(message, a1, false);
            a1.ratingBar.setOnRatingBarChangeListener(this);
            a1.ratingContainer.setVisibility(0);
            return;
        } else
        {
            a1.ratingBar.setTag(0x7f100010, null);
            a1.ratingBar.setTag(0x7f10000f, null);
            a1.ratingBar.setOnRatingBarChangeListener(null);
            a1.ratingContainer.setVisibility(8);
            return;
        }
    }

    static 
    {
        supportedMessageTypes = (new int[] {
            com.skype.Message.TYPE.STARTED_LIVESESSION.toInt(), com.skype.Message.TYPE.ENDED_LIVESESSION.toInt()
        });
    }

}
