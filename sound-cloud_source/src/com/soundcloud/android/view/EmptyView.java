// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.soundcloud.android.util.AnimUtils;

// Referenced classes of package com.soundcloud.android.view:
//            ErrorView

public class EmptyView extends RelativeLayout
{
    public static interface ActionListener
    {

        public abstract void onAction();
    }

    public static final class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status CONNECTION_ERROR;
        public static final Status ERROR;
        public static final Status OK;
        public static final Status SERVER_ERROR;
        public static final Status WAITING;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/soundcloud/android/view/EmptyView$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            WAITING = new Status("WAITING", 0);
            ERROR = new Status("ERROR", 1);
            CONNECTION_ERROR = new Status("CONNECTION_ERROR", 2);
            SERVER_ERROR = new Status("SERVER_ERROR", 3);
            OK = new Status("OK", 4);
            $VALUES = (new Status[] {
                WAITING, ERROR, CONNECTION_ERROR, SERVER_ERROR, OK
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }


    private String actionText;
    private Button buttonAction;
    private ActionListener buttonActionListener;
    private ViewGroup emptyLayout;
    private ErrorView errorView;
    private ImageView image;
    private int imageResource;
    private String message;
    private int messageResource;
    private View progressView;
    private String secondaryText;
    private Status status;
    private TextView textLink;
    private TextView textMessage;

    public EmptyView(Context context)
    {
        super(context);
        init(com.soundcloud.androidkit.R.layout.ak_empty_view);
    }

    public EmptyView(Context context, int i)
    {
        super(context);
        init(i);
    }

    public EmptyView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(com.soundcloud.androidkit.R.layout.ak_empty_view);
    }

    private void init(int i)
    {
        ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(i, this);
        setLayoutAnimation(new LayoutAnimationController(AnimationUtils.loadAnimation(getContext(), com.soundcloud.androidkit.R.anim.ak_fade_in_med)));
        progressView = findViewById(com.soundcloud.androidkit.R.id.ak_emptyview_progress);
        setClickable(true);
    }

    private void setupViews()
    {
        emptyLayout = (ViewGroup)View.inflate(getContext(), getEmptyViewLayoutId(), null);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        addView(emptyLayout, layoutparams);
        textMessage = (TextView)findViewById(com.soundcloud.androidkit.R.id.ak_emptyview_message);
        textLink = (TextView)findViewById(com.soundcloud.androidkit.R.id.ak_emptyview_link);
        buttonAction = (Button)findViewById(com.soundcloud.androidkit.R.id.ak_emptyview_btn_action);
        image = (ImageView)findViewById(com.soundcloud.androidkit.R.id.ak_emptyview_image);
        if (image != null)
        {
            setImage(imageResource);
        }
        buttonAction.setOnClickListener(new _cls2());
    }

    private void showError(Status status1)
    {
        if (errorView == null)
        {
            errorView = addErrorView();
        }
        AnimUtils.showView(errorView, true);
        if (emptyLayout != null)
        {
            AnimUtils.hideView(emptyLayout, false);
        }
        switch (_cls3..SwitchMap.com.soundcloud.android.view.EmptyView.Status[status1.ordinal()])
        {
        default:
            errorView.setServerErrorState();
            return;

        case 1: // '\001'
            errorView.setServerErrorState();
            return;

        case 2: // '\002'
            errorView.setConnectionErrorState();
            break;
        }
    }

    protected ErrorView addErrorView()
    {
        ErrorView errorview = (ErrorView)LayoutInflater.from(getContext()).inflate(com.soundcloud.androidkit.R.layout.ak_error_view, null);
        addView(errorview, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        return errorview;
    }

    protected int getEmptyViewLayoutId()
    {
        return com.soundcloud.androidkit.R.layout.ak_empty_collection_view;
    }

    public Status getStatus()
    {
        return status;
    }

    public EmptyView setActionListener(ActionListener actionlistener)
    {
        buttonActionListener = actionlistener;
        return this;
    }

    public EmptyView setActionText(int i)
    {
        return setActionText(getResources().getString(i));
    }

    public EmptyView setActionText(String s)
    {
label0:
        {
            actionText = s;
            if (buttonAction != null)
            {
                if (s == null)
                {
                    break label0;
                }
                buttonAction.setVisibility(0);
                buttonAction.setText(s);
            }
            return this;
        }
        buttonAction.setVisibility(8);
        return this;
    }

    public EmptyView setButtonActions(final Intent action)
    {
        setActionListener(new _cls1());
        return this;
    }

    public EmptyView setImage(int i)
    {
label0:
        {
            imageResource = i;
            if (image != null)
            {
                if (i <= 0)
                {
                    break label0;
                }
                image.setVisibility(0);
                image.setImageResource(i);
            }
            return this;
        }
        image.setVisibility(8);
        return this;
    }

    public EmptyView setMessageText(int i)
    {
label0:
        {
            messageResource = i;
            message = null;
            if (textMessage != null)
            {
                if (i <= 0)
                {
                    break label0;
                }
                textMessage.setText(i);
                textMessage.setVisibility(0);
            }
            return this;
        }
        textMessage.setVisibility(8);
        return this;
    }

    public EmptyView setMessageText(String s)
    {
label0:
        {
            message = s;
            messageResource = -1;
            if (textMessage != null)
            {
                if (TextUtils.isEmpty(s))
                {
                    break label0;
                }
                textMessage.setText(s);
                textMessage.setVisibility(0);
            }
            return this;
        }
        textMessage.setVisibility(8);
        return this;
    }

    public EmptyView setSecondaryText(int i)
    {
        return setSecondaryText(getResources().getString(i));
    }

    public EmptyView setSecondaryText(String s)
    {
label0:
        {
            secondaryText = s;
            if (textLink != null)
            {
                if (s == null)
                {
                    break label0;
                }
                textLink.setText(s);
                textLink.setVisibility(0);
            }
            return this;
        }
        textLink.setVisibility(8);
        return this;
    }

    public boolean setStatus(Status status1)
    {
label0:
        {
            if (status != status1)
            {
                status = status1;
                if (status1 != Status.WAITING)
                {
                    break label0;
                }
                progressView.setVisibility(0);
                if (emptyLayout != null)
                {
                    emptyLayout.setVisibility(8);
                }
                if (errorView != null)
                {
                    errorView.setVisibility(8);
                }
            }
            return true;
        }
        AnimUtils.hideView(progressView, false);
        if (status1 == Status.OK)
        {
            showEmptyLayout();
            return true;
        } else
        {
            showError(status1);
            return true;
        }
    }

    protected void showEmptyLayout()
    {
        if (emptyLayout == null)
        {
            setupViews();
            if (TextUtils.isEmpty(message))
            {
                setMessageText(messageResource);
            } else
            {
                setMessageText(message);
            }
            setSecondaryText(secondaryText);
            setActionText(actionText);
        }
        AnimUtils.showView(emptyLayout, true);
        if (errorView != null)
        {
            AnimUtils.hideView(errorView, false);
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final EmptyView this$0;

        public void onClick(View view)
        {
            if (buttonActionListener != null)
            {
                buttonActionListener.onAction();
            }
        }

        _cls2()
        {
            this$0 = EmptyView.this;
            super();
        }
    }


    private class _cls3
    {

        static final int $SwitchMap$com$soundcloud$android$view$EmptyView$Status[];

        static 
        {
            $SwitchMap$com$soundcloud$android$view$EmptyView$Status = new int[Status.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$view$EmptyView$Status[Status.SERVER_ERROR.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$view$EmptyView$Status[Status.CONNECTION_ERROR.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1
        implements ActionListener
    {

        final EmptyView this$0;
        final Intent val$action;

        public void onAction()
        {
            if (action != null)
            {
                getContext().startActivity(action);
            }
        }

        _cls1()
        {
            this$0 = EmptyView.this;
            action = intent;
            super();
        }
    }

}
