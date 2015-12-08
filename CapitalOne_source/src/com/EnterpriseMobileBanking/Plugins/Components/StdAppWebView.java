// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Utils.Log;

public class StdAppWebView extends WebView
{

    private static final String TAG = "StdAppWebView";
    private boolean mAppWebViewDisplayBlocked;

    public StdAppWebView(Context context)
    {
        super(context);
        mAppWebViewDisplayBlocked = false;
    }

    public StdAppWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mAppWebViewDisplayBlocked = false;
    }

    public StdAppWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mAppWebViewDisplayBlocked = false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (!mAppWebViewDisplayBlocked)
        {
            return super.dispatchTouchEvent(motionevent);
        } else
        {
            return mAppWebViewDisplayBlocked;
        }
    }

    public boolean ismAppWebViewDisplayBlocked()
    {
        return mAppWebViewDisplayBlocked;
    }

    public void loadUrl(String s)
    {
        if (hasFocus())
        {
            clearFocus();
        }
        Log.d("StdAppWebView", (new StringBuilder()).append("Loading: ").append(s).toString());
        super.loadUrl(s);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag = AppHelper.showingMenu();
        if (flag && motionevent.getAction() == 1)
        {
            AppHelper.hideMenu();
        } else
        {
            requestFocus();
        }
        return flag || super.onInterceptTouchEvent(motionevent);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = AppHelper.showingMenu();
        if (flag && motionevent.getAction() == 1)
        {
            AppHelper.hideMenu();
        }
        return flag || super.onTouchEvent(motionevent);
    }

    public void postUrl(String s, byte abyte0[])
    {
        Log.d("StdAppWebView", (new StringBuilder()).append("Loading: ").append(s).toString());
        super.postUrl(s, abyte0);
    }

    public void setmAppWebViewDisplayBlocked(boolean flag)
    {
        mAppWebViewDisplayBlocked = flag;
    }
}
