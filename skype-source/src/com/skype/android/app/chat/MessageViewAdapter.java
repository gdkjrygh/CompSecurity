// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.util.a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.Message;
import com.skype.android.SkypeApplication;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.ActivityModule;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.SymbolView;

// Referenced classes of package com.skype.android.app.chat:
//            MessageViewAdapterComponent, j, MessageHolder, DaggerMessageViewAdapterComponent, 
//            SyntheticTypes, AnnotationUtil, MessageHolderUtil, ChatFragmentProvider

public abstract class MessageViewAdapter
{

    private static final String LONG_CLICK = "LONG_CLICK";
    AccessibilityUtil accessibility;
    Analytics analytics;
    AnnotationUtil annotationUtil;
    private MessageViewAdapterComponent component;
    ContactUtil contactUtil;
    private Activity context;
    EcsConfiguration ecsConfiguration;
    ImageCache imageCache;
    MessageHolderUtil messageHolderUtil;
    Navigation navigation;
    NavigationUrl navigationUrl;
    TimeUtil timeUtil;

    public MessageViewAdapter(Activity activity)
    {
        context = activity;
        getComponent().inject(this);
    }

    private void alignLovedByTextView(j j1)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)j1.getLovedByText().getLayoutParams();
        if (j1.isOutgoing())
        {
            j1.getLovedByText().setGravity(getLovedByTextGravity(true));
            layoutparams.addRule(7, 0x7f100286);
            int i = context.getResources().getDimensionPixelSize(0x7f0c0234);
            layoutparams.setMargins(0, i, i, 0);
        } else
        {
            j1.getLovedByText().setGravity(getLovedByTextGravity(false));
            layoutparams.addRule(5, 0x7f100286);
            int k = context.getResources().getDimensionPixelSize(0x7f0c0234);
            layoutparams.setMargins(k, k, 0, 0);
        }
        j1.getLovedByText().setLayoutParams(layoutparams);
    }

    private int getLovedByTextGravity(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT > 16)
        {
            return !flag ? 3 : 5;
        }
        return !flag ? 0x800003 : 0x800005;
    }

    private void reportUrlPreviewClicks(String s)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.N, s);
        analytics.a(AnalyticsEvent.cX, analyticsparametercontainer);
    }

    private void setTimestampText(j j1, MessageHolder messageholder)
    {
        if (j1.getTimestampView() == null)
        {
            return;
        }
        long l = getTimestamp(messageholder);
        if (l == -1L)
        {
            j1.getTimestampView().setText(0x7f0802fe);
        } else
        {
            Object obj = timeUtil.g(l);
            String s = timeUtil.b(l);
            boolean flag;
            if (messageholder.getTypeOrdinal() == com.skype.Message.TYPE.POSTED_SMS.toInt())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                messageholder = context.getResources().getString(0x7f080342, new Object[] {
                    obj
                });
            } else
            {
                messageholder = ((MessageHolder) (obj));
            }
            j1.getTimestampView().setText(messageholder);
            obj = j1.getTimestampView();
            messageholder = s;
            if (flag)
            {
                messageholder = context.getResources().getString(0x7f080342, new Object[] {
                    s
                });
            }
            ((TextView) (obj)).setContentDescription(messageholder);
        }
        if (j1.isChatItemExpanded())
        {
            j1.getTimestampView().setVisibility(0);
            return;
        } else
        {
            j1.getTimestampView().setVisibility(8);
            return;
        }
    }

    protected void alignTimestampView(j j1, boolean flag)
    {
        if (j1 == null)
        {
            return;
        }
        if (flag)
        {
            j1.getTimestampView().setGravity(5);
            return;
        } else
        {
            j1.getTimestampView().setGravity(3);
            return;
        }
    }

    protected abstract void bindContentView(j j1, MessageHolder messageholder);

    protected void bindContentView(j j1, MessageHolder messageholder, a a)
    {
        bindContentView(j1, messageholder);
    }

    public void bindViewHolder(j j1, MessageHolder messageholder, a a)
    {
label0:
        {
            bindContentView(j1, messageholder, a);
            setTimestampText(j1, messageholder);
            setDefaultViewClickListener(j1, messageholder);
            a = getDefaultContentDescription(j1, messageholder);
            j1.itemView.setContentDescription(a);
            if (ecsConfiguration.isHeartMarkedEnabled() && j1.getHeartContainer() != null && (messageholder.getMessageObject() instanceof Message))
            {
                if (!((Message)messageholder.getMessageObject()).canAnnotate() || messageholder.isDeleted())
                {
                    break label0;
                }
                j1.getHeartContainer().setVisibility(0);
                updateHearts(messageholder, j1);
                setHeartViewClickListener(j1.getHeartIcon(), j1.getLayoutPosition());
                setLovedByOthersClickListener(j1.getLovedByText(), j1.getLayoutPosition());
            }
            return;
        }
        j1.getHeartContainer().setVisibility(8);
    }

    protected abstract j createMessageViewHolder(View view);

    public j createMessageViewHolder(ViewGroup viewgroup, int i)
    {
        return createMessageViewHolder(getView(viewgroup, getLayoutId(i), false));
    }

    protected void enableClickForTimestamp(View view, final int position)
    {
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final MessageViewAdapter this$0;
            final int val$position;

            public final void onClick(View view1)
            {
                ((ChatFragmentProvider)getContext()).getChatFragment().onItemClick(position);
            }

            
            {
                this$0 = MessageViewAdapter.this;
                position = i;
                super();
            }
        });
    }

    MessageViewAdapterComponent getComponent()
    {
        if (component == null)
        {
            component = DaggerMessageViewAdapterComponent.builder().skypeApplicationComponent(((SkypeApplication)context.getApplicationContext()).a()).activityModule(new ActivityModule(context)).build();
        }
        return component;
    }

    protected Activity getContext()
    {
        return context;
    }

    protected abstract CharSequence getDefaultContentDescription(j j1, MessageHolder messageholder);

    protected abstract int getLayoutId(int i);

    public abstract int[] getSupportedMessageTypes();

    protected long getTimestamp(MessageHolder messageholder)
    {
        long l1 = messageholder.getTimestamp();
        long l = l1;
        if (!SyntheticTypes.isSynthetic(messageholder.getTypeOrdinal()))
        {
            l = l1;
            if (((Message)messageholder.getMessageObject()).getSendingStatusProp() == com.skype.Message.SENDING_STATUS.SENDING)
            {
                l = -1L;
            }
        }
        return l;
    }

    protected View getView(ViewGroup viewgroup, int i, boolean flag)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(i, viewgroup, flag);
    }

    public boolean isStandalone(MessageHolder messageholder)
    {
        return false;
    }

    protected void setDefaultViewClickListener(j j1, MessageHolder messageholder)
    {
        enableClickForTimestamp(j1.itemView, j1.getLayoutPosition());
    }

    protected void setHeartViewClickListener(View view, final int position)
    {
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final MessageViewAdapter this$0;
                final int val$position;

                public final void onClick(View view1)
                {
                    ((ChatFragmentProvider)getContext()).getChatFragment().onHeartClick(position);
                }

            
            {
                this$0 = MessageViewAdapter.this;
                position = i;
                super();
            }
            });
        }
    }

    protected void setLovedByOthersClickListener(TextView textview, final int position)
    {
        if (textview != null)
        {
            textview.setOnClickListener(new android.view.View.OnClickListener() {

                final MessageViewAdapter this$0;
                final int val$position;

                public final void onClick(View view)
                {
                    ((ChatFragmentProvider)getContext()).getChatFragment().onOtherLovedThisClick(position);
                }

            
            {
                this$0 = MessageViewAdapter.this;
                position = i;
                super();
            }
            });
        }
    }

    protected void setOnItemLongClickListener(Message message, View view, int i)
    {
        setOnItemLongClickListener(message, view, i, true, false);
    }

    protected void setOnItemLongClickListener(Message message, View view, int i, boolean flag, boolean flag1)
    {
        setOnItemLongClickListener(message, view, i, flag, flag1, null);
    }

    protected void setOnItemLongClickListener(final Message message, View view, final int position, final boolean showTimestampMenuItem, final boolean isUrlPreviewMessage, final String url)
    {
        if (view != null && (!TextUtils.isEmpty(message.getBodyXmlProp()) || message.getEditTimestampProp() <= 0))
        {
            view.setOnLongClickListener(new android.view.View.OnLongClickListener() {

                final MessageViewAdapter this$0;
                final boolean val$isUrlPreviewMessage;
                final Message val$message;
                final int val$position;
                final boolean val$showTimestampMenuItem;
                final String val$url;

                public final boolean onLongClick(View view1)
                {
                    ((ChatFragmentProvider)getContext()).getChatFragment().onItemLongClick(message, position, showTimestampMenuItem, url);
                    if (isUrlPreviewMessage)
                    {
                        reportUrlPreviewClicks("LONG_CLICK");
                    }
                    return true;
                }

            
            {
                this$0 = MessageViewAdapter.this;
                message = message1;
                position = i;
                showTimestampMenuItem = flag;
                url = s;
                isUrlPreviewMessage = flag1;
                super();
            }
            });
        }
    }

    public void updateHearts(MessageHolder messageholder, j j1)
    {
        SymbolView symbolview = j1.getHeartIcon();
        TextView textview = j1.getHeartMsgCount();
        if (symbolview != null && textview != null)
        {
            Object obj = (Message)messageholder.getMessageObject();
            int k = annotationUtil.getAnnotationCount(((Message) (obj)), com.skype.MessageAnnotation.TYPE.EMOTICON, "heart");
            int i = 0x7f0f0091;
            obj = com.skype.android.widget.SymbolElement.SymbolCode.fM;
            textview.setVisibility(8);
            if (k > 0)
            {
                i = 0x7f0f0090;
                obj = com.skype.android.widget.SymbolElement.SymbolCode.cw;
                if (messageholder.isConference() && k > 1)
                {
                    textview.setVisibility(0);
                    textview.setText(Integer.toString(k));
                } else
                {
                    textview.setVisibility(8);
                }
            }
            symbolview.setSymbolCode(((com.skype.android.widget.SymbolElement.SymbolCode) (obj)));
            symbolview.setSymbolColor(context.getResources().getColor(i));
        }
        if (j1.getLovedByText() != null)
        {
            alignLovedByTextView(j1);
        }
    }

}
