// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.Display;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.android.util.PropertyAnimationUtil;
import java.util.HashMap;

public class MessagePopup extends RelativeLayout
    implements android.os.Handler.Callback
{
    public static interface Callback
    {

        public abstract void onPopupComplete();
    }

    public static interface OnMessagePopupListener
    {

        public abstract void onMessagePopupDismiss();

        public abstract void onMessagePopupShown();
    }


    protected static final int HANDLE_DISMISS = 1;
    protected static final int MESSAGE_DURATION = 5000;
    private PropertyAnimationUtil animationUtil;
    protected int availableScreenSpace;
    private Callback callback;
    protected TextView contentView;
    protected int currentBubbleSize;
    protected Handler handler;
    protected int height;
    protected HashMap identityMap;
    protected OnMessagePopupListener onPopupListener;
    protected boolean setTextOnLayout;
    protected int width;

    public MessagePopup(Context context)
    {
        super(context);
        identityMap = new HashMap();
        init(context, null);
    }

    public MessagePopup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        identityMap = new HashMap();
        init(context, attributeset);
    }

    public MessagePopup(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        identityMap = new HashMap();
        init(context, attributeset);
    }

    private int getBubbleSize()
    {
        float f = (float)getResources().getInteger(0x7f0e0001) / 100F;
        return (int)((float)availableScreenSpace * f);
    }

    private void init(Context context, AttributeSet attributeset)
    {
        context = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
        availableScreenSpace = Math.min(context.getWidth(), context.getHeight());
        handler = new Handler(this);
        setTextOnLayout = true;
        animationUtil = new PropertyAnimationUtil();
    }

    protected void computeDimensions(int i, int j)
    {
        width = getBubbleSize();
        height = width;
    }

    public void dismiss()
    {
        animationUtil.b(this);
        if (onPopupListener != null)
        {
            onPopupListener.onMessagePopupDismiss();
        }
    }

    public boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            dismiss();
            if (callback != null)
            {
                callback.onPopupComplete();
            }
            return true;
        } else
        {
            return false;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        contentView = (TextView)findViewById(0x7f1003a7);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        i = (contentView.getHeight() - contentView.getPaddingTop() - contentView.getPaddingBottom()) / contentView.getLineHeight();
        contentView.setMaxLines(i);
        if (setTextOnLayout)
        {
            contentView.setText(contentView.getText());
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k = getBubbleSize();
        computeDimensions(i, j);
        super.onMeasure(width, height);
        setMeasuredDimension(width, height);
        if (k != currentBubbleSize)
        {
            resizeComponents(k);
        }
    }

    protected void resizeComponents(int i)
    {
        contentView.setWidth(i);
        contentView.setHeight(i);
        contentView.setPadding(contentView.getPaddingLeft(), contentView.getCompoundPaddingTop(), contentView.getPaddingRight(), contentView.getPaddingBottom());
        currentBubbleSize = i;
    }

    public void setListener(OnMessagePopupListener onmessagepopuplistener)
    {
        onPopupListener = onmessagepopuplistener;
    }

    protected void show()
    {
        animationUtil.a(this);
        if (onPopupListener != null)
        {
            onPopupListener.onMessagePopupShown();
        }
    }

    public void showMessage(String s, int i, Callback callback1)
    {
        callback = callback1;
        contentView.setTextAppearance(getContext(), i);
        contentView.setText(s);
        show();
        handler.sendEmptyMessageDelayed(1, 5000L);
    }
}
