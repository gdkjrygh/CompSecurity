// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.EnterpriseMobileBanking.AppHelper;
import org.apache.cordova.CordovaWebView;

public class AppWebView extends CordovaWebView
{

    private boolean mAppWebViewDisplayBlocked;

    public AppWebView(Context context)
    {
        super(context);
        mAppWebViewDisplayBlocked = false;
    }

    public AppWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mAppWebViewDisplayBlocked = false;
    }

    public AppWebView(Context context, AttributeSet attributeset, int i)
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
        if (s.equals("about:blank") || s.startsWith("javascript:"))
        {
            if (s.startsWith("file://") || s.startsWith("javascript:") || isUrlWhiteListed(s))
            {
                super.loadUrl(s);
            }
            return;
        }
        String s1 = getProperty("url", null);
        if (s1 == null || getUrlsStackSize() > 0)
        {
            loadUrlIntoView(s);
            return;
        } else
        {
            loadUrlIntoView(s1);
            return;
        }
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

    public void setmAppWebViewDisplayBlocked(boolean flag)
    {
        mAppWebViewDisplayBlocked = flag;
    }
}
