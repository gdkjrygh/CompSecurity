// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.QuickAction;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

public class MyPopupWindow
{

    protected Drawable mBackground;
    protected Context mContext;
    protected View mRootView;
    protected PopupWindow mWindow;
    protected WindowManager mWindowManager;

    public MyPopupWindow(Context context)
    {
        mBackground = null;
        mContext = context;
        mWindow = new PopupWindow(context);
        mWindow.setTouchInterceptor(new android.view.View.OnTouchListener() {

            final MyPopupWindow this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 4)
                {
                    mWindow.dismiss();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = MyPopupWindow.this;
                super();
            }
        });
        mWindowManager = (WindowManager)context.getSystemService("window");
    }

    public void dismiss()
    {
        mWindow.dismiss();
    }

    protected void onDismiss()
    {
    }

    protected void preShow()
    {
        if (mRootView == null)
        {
            throw new IllegalStateException("setContentView was not called with a view to display.");
        }
        if (mBackground == null)
        {
            mWindow.setBackgroundDrawable(new BitmapDrawable());
        } else
        {
            mWindow.setBackgroundDrawable(mBackground);
        }
        mWindow.setWidth(-2);
        mWindow.setHeight(-2);
        mWindow.setTouchable(true);
        mWindow.setFocusable(true);
        mWindow.setOutsideTouchable(true);
        mWindow.setContentView(mRootView);
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        mBackground = drawable;
    }

    public void setContentView(int i)
    {
        setContentView(((LayoutInflater)mContext.getSystemService("layout_inflater")).inflate(i, null));
    }

    public void setContentView(View view)
    {
        mRootView = view;
        mWindow.setContentView(view);
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        mWindow.setOnDismissListener(ondismisslistener);
    }
}
