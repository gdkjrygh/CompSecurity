// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.Message;
import com.skype.VideoMessage;
import com.skype.VideoMessageImpl;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.KpiAttributeName;
import com.skype.android.analytics.KpiAttributeValue;
import com.skype.android.analytics.KpiEvent;
import com.skype.android.analytics.MessageTelemetryEvent;
import com.skype.android.app.Navigation;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.ChatText;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.CircularProgressBar;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.BubbleRelativeLayout;

// Referenced classes of package com.skype.android.app.chat:
//            e, MessageViewAdapterComponent, MessageHolder, j, 
//            f

final class l extends e
{
    private final class a extends f
    {

        BubbleRelativeLayout bubblePreviewLayout;
        TextView expiredMessageTextView;
        SymbolView expiredSymbol;
        SymbolView play;
        ImageView preview;
        CircularProgressBar progress;
        TextView replyWithVideoTextView;
        final l this$0;

        public a(View view)
        {
            this$0 = l.this;
            super(view);
            view = getInlineContent();
            bubblePreviewLayout = (BubbleRelativeLayout)view.findViewById(0x7f1002d6);
            expiredMessageTextView = (TextView)view.findViewById(0x7f1002d5);
            preview = (ImageView)view.findViewById(0x7f1002d7);
            play = (SymbolView)view.findViewById(0x7f1002d9);
            expiredSymbol = (SymbolView)view.findViewById(0x7f1002da);
            progress = (CircularProgressBar)view.findViewById(0x7f1002db);
            replyWithVideoTextView = (TextView)view.findViewById(0x7f1002d8);
            l1 = getContext();
            progress.setProgressBackgroundColor(getResources().getColor(0x7f0f013c));
            progress.setProgressColor(getResources().getColor(0x7f0f0135));
            progress.setProgressWidth(getResources().getDimensionPixelSize(0x7f0c00fe));
            progress.setMax(100);
        }
    }


    private static final int supportedMessageTypes[];
    ChatText chatText;
    ConversationUtil conversationUtil;
    EcsConfiguration ecsConfiguration;
    ImageCache imageCache;
    ObjectIdMap map;
    Navigation navigation;
    private SparseArray videoMessages;

    public l(Activity activity)
    {
        super(activity);
        getComponent().inject(this);
        videoMessages = new SparseArray();
    }

    private void alignContent(a a1, boolean flag)
    {
        Object obj1 = a1.bubblePreviewLayout;
        Object obj;
        int i;
        if (flag)
        {
            obj = com.skype.android.widget.bubbles.Bubblable.Direction.b;
        } else
        {
            obj = com.skype.android.widget.bubbles.Bubblable.Direction.a;
        }
        ((BubbleRelativeLayout) (obj1)).setDirectionState(((com.skype.android.widget.bubbles.Bubblable.Direction) (obj)), a1.isChained());
        obj = a1.replyWithVideoTextView;
        if (ecsConfiguration.isViMReplyWithVideoEnabled() && !flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((TextView) (obj)).setVisibility(i);
        obj = (android.widget.RelativeLayout.LayoutParams)a1.expiredMessageTextView.getLayoutParams();
        obj1 = (android.widget.RelativeLayout.LayoutParams)a1.bubblePreviewLayout.getLayoutParams();
        if (flag)
        {
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9, 0);
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(0, a1.bubblePreviewLayout.getId());
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(1, 0);
            return;
        } else
        {
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11, 0);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(0, 0);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(1, a1.bubblePreviewLayout.getId());
            return;
        }
    }

    private void bindVideoMessage(a a1, MessageHolder messageholder, VideoMessage videomessage, boolean flag)
    {
        boolean flag1;
        messageholder = (Message)messageholder.getMessageObject();
        com.skype.VideoMessage.STATUS status = videomessage.getStatusProp();
        flag1 = false;
        resetVisibilities(a1);
        CircularProgressBar circularprogressbar = a1.progress;
        static final class _cls3
        {

            static final int $SwitchMap$com$skype$VideoMessage$STATUS[];

            static 
            {
                $SwitchMap$com$skype$VideoMessage$STATUS = new int[com.skype.VideoMessage.STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$VideoMessage$STATUS[com.skype.VideoMessage.STATUS.BLANK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$VideoMessage$STATUS[com.skype.VideoMessage.STATUS.CANCELED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$VideoMessage$STATUS[com.skype.VideoMessage.STATUS.FAILED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$VideoMessage$STATUS[com.skype.VideoMessage.STATUS.INVALID.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$VideoMessage$STATUS[com.skype.VideoMessage.STATUS.RECORDED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$VideoMessage$STATUS[com.skype.VideoMessage.STATUS.UPLOADING.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$VideoMessage$STATUS[com.skype.VideoMessage.STATUS.EXPIRED.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$VideoMessage$STATUS[com.skype.VideoMessage.STATUS.UPLOADED.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        int i;
        if (status == com.skype.VideoMessage.STATUS.UPLOADING)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        circularprogressbar.setVisibility(i);
        _cls3..SwitchMap.com.skype.VideoMessage.STATUS[status.ordinal()];
        JVM INSTR tableswitch 1 7: default 100
    //                   1 127
    //                   2 127
    //                   3 127
    //                   4 127
    //                   5 139
    //                   6 139
    //                   7 151;
           goto _L1 _L2 _L2 _L2 _L2 _L3 _L3 _L4
_L1:
        showUploadedVideoMessage(videomessage, a1);
        flag1 = true;
_L6:
        setClickListeners(a1, messageholder, flag1, flag);
        return;
_L2:
        a1.bubblePreviewLayout.setVisibility(8);
        continue; /* Loop/switch isn't completed */
_L3:
        showUploadingVideoMessage(videomessage, a1);
        flag1 = true;
        continue; /* Loop/switch isn't completed */
_L4:
        showExpiredVideoMessage(a1);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private Conversation getConversation(a a1)
    {
        a1 = a1.getContact();
        ConversationImpl conversationimpl = new ConversationImpl();
        a1.openConversation(conversationimpl);
        return conversationimpl;
    }

    private VideoMessage getVideoMessage(Message message)
    {
        Object obj1;
label0:
        {
            obj1 = (VideoMessage)videoMessages.get(message.getObjectID());
            Object obj = obj1;
            if (obj1 == null)
            {
                obj1 = new VideoMessageImpl();
                obj = obj1;
                if (message.getVideoMessage(((VideoMessage) (obj1))))
                {
                    obj = (VideoMessage)map.a(((VideoMessage) (obj1)).getObjectID());
                    if (obj == null)
                    {
                        break label0;
                    }
                }
            }
            return ((VideoMessage) (obj));
        }
        map.b(((com.skype.ObjectInterface) (obj1)));
        map.a(((com.skype.ObjectInterface) (obj1)));
        return ((VideoMessage) (obj1));
    }

    private void loadVideoThubmnail(VideoMessage videomessage, a a1)
    {
        a1.preview.setImageResource(0x7f0f003b);
        Bitmap bitmap = imageCache.a(String.valueOf(videomessage.getObjectID()));
        if (bitmap != null)
        {
            a1.preview.setImageBitmap(bitmap);
        } else
        {
            videomessage.getThumbnail();
        }
        resizePreview(a1, bitmap);
    }

    private void resetVisibilities(a a1)
    {
        a1.expiredSymbol.setVisibility(8);
        a1.play.setVisibility(8);
        a1.preview.setVisibility(8);
        a1.expiredMessageTextView.setVisibility(8);
        a1.progress.setVisibility(8);
        a1.bubblePreviewLayout.setVisibility(0);
    }

    private void resizePreview(a a1, Bitmap bitmap)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)a1.preview.getLayoutParams();
        int i;
        int k;
        if (bitmap != null)
        {
            if (bitmap.getWidth() > bitmap.getHeight())
            {
                k = 0x7f0c00b4;
                i = 0x7f0c00b3;
            } else
            {
                k = 0x7f0c00b2;
                i = 0x7f0c00b1;
            }
        } else
        {
            i = 0x7f0c00b3;
            k = 0x7f0c00b3;
        }
        layoutparams.width = getContext().getResources().getDimensionPixelSize(k);
        layoutparams.height = getContext().getResources().getDimensionPixelSize(i);
        a1.preview.setLayoutParams(layoutparams);
    }

    private void sendVideoMessageViewedTelemetryEvent(Conversation conversation)
    {
        conversation = new MessageTelemetryEvent(KpiEvent.c, conversation, KpiAttributeValue.i);
        conversation.put(KpiAttributeName.h, KpiAttributeValue.f);
        analytics.a(conversation);
    }

    private void setClickListeners(final a viewHolder, final Message message, boolean flag, boolean flag1)
    {
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

            final l this$0;
            final Message val$message;
            final a val$viewHolder;

            public final void onClick(View view)
            {
                sendVideoMessageViewedTelemetryEvent(getConversation(viewHolder));
                navigation.playVideoMessage(message);
            }

            
            {
                this$0 = l.this;
                viewHolder = a1;
                message = message1;
                super();
            }
        };
        viewHolder.replyWithVideoTextView.setOnClickListener(new android.view.View.OnClickListener() {

            final l this$0;
            final a val$viewHolder;

            public final void onClick(View view)
            {
                analytics.c(AnalyticsEvent.u);
                view = getConversation(viewHolder);
                navigation.videoMessage(view);
            }

            
            {
                this$0 = l.this;
                viewHolder = a1;
                super();
            }
        });
        if (flag1)
        {
            if (flag)
            {
                viewHolder.itemView.setOnClickListener(onclicklistener);
                return;
            } else
            {
                viewHolder.itemView.setOnClickListener(null);
                viewHolder.itemView.setClickable(false);
                viewHolder.itemView.setFocusable(true);
                return;
            }
        }
        if (flag)
        {
            viewHolder.bubblePreviewLayout.setOnClickListener(onclicklistener);
            setOnItemLongClickListener(message, viewHolder.bubblePreviewLayout, viewHolder.getLayoutPosition());
            return;
        } else
        {
            viewHolder.bubblePreviewLayout.setOnClickListener(null);
            viewHolder.bubblePreviewLayout.setClickable(false);
            viewHolder.bubblePreviewLayout.setOnLongClickListener(null);
            viewHolder.bubblePreviewLayout.setLongClickable(false);
            return;
        }
    }

    private void showExpiredVideoMessage(a a1)
    {
        a1.preview.setImageResource(0x7f0f003b);
        a1.preview.setVisibility(0);
        a1.preview.setOnClickListener(null);
        a1.preview.setClickable(false);
        a1.expiredSymbol.setVisibility(0);
        a1.expiredMessageTextView.setVisibility(0);
        a1.expiredMessageTextView.setText(getContext().getResources().getText(0x7f0804e1));
        resizePreview(a1, null);
        if (accessibility.a())
        {
            a1.getInlineContent().setContentDescription(getContext().getString(0x7f0804e1));
        }
    }

    private void showUploadedVideoMessage(VideoMessage videomessage, a a1)
    {
        a1.preview.setVisibility(0);
        a1.play.setVisibility(0);
        a1.play.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.bV);
        a1.play.getBackground().setLevel(getContext().getResources().getInteger(0x7f0e003b));
        loadVideoThubmnail(videomessage, a1);
        String s = videomessage.getDescriptionProp();
        if (accessibility.a())
        {
            videomessage = s;
            if (TextUtils.isEmpty(s))
            {
                videomessage = a1.getInlineContent().getContext().getString(0x7f08006f);
            }
            a1.getInlineContent().setContentDescription(videomessage);
        }
    }

    private void showUploadingVideoMessage(VideoMessage videomessage, a a1)
    {
        a1.progress.setVisibility(0);
        a1.preview.setVisibility(0);
        a1.play.setVisibility(0);
        a1.play.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.aP);
        a1.play.getBackground().setLevel(getContext().getResources().getInteger(0x7f0e003c));
        loadVideoThubmnail(videomessage, a1);
        a1.progress.setProgress(videomessage.getProgressProp());
    }

    protected final void bindContentView(j j1, MessageHolder messageholder)
    {
        a a1 = (a)j1;
        VideoMessage videomessage = getVideoMessage((Message)messageholder.getMessageObject());
        alignContent(a1, j1.isOutgoing());
        bindVideoMessage(a1, messageholder, videomessage, accessibility.a());
    }

    protected final j createMessageViewHolder(View view)
    {
        return new a(view);
    }

    protected final void enableClickForTimestamp(View view, int i)
    {
        if (!accessibility.a())
        {
            super.enableClickForTimestamp(view, i);
        }
    }

    protected final int getLayoutId(int i)
    {
        return 0x7f030050;
    }

    public final int[] getSupportedMessageTypes()
    {
        return supportedMessageTypes;
    }

    static 
    {
        supportedMessageTypes = (new int[] {
            com.skype.Message.TYPE.POSTED_VIDEO_MESSAGE.toInt()
        });
    }


}
