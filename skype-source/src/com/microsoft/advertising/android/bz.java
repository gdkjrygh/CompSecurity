// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.microsoft.advertising.android:
//            by, ai

class bz extends WebView
{

    private static final String a = null;
    private static final String b = null;

    public bz(Context context)
    {
        super(context);
        setLayoutParams(by.a());
        context = getSettings();
        context.setSavePassword(false);
        context.setSaveFormData(false);
        context.setJavaScriptEnabled(true);
        context.setSupportZoom(false);
        context.setCacheMode(2);
        context.setAllowFileAccess(false);
        context.setPluginsEnabled(false);
        context.setLightTouchEnabled(false);
        setScrollBarStyle(0);
    }

    public void c(String s)
    {
        super.loadDataWithBaseURL(a, s, "text/html", "UTF-8", b);
    }

    protected boolean d()
    {
        return false;
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4 && d())
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public void setBackgroundColor(int i)
    {
        if (i == 0)
        {
            super.setBackgroundColor(-1);
            return;
        } else
        {
            super.setBackgroundColor(i);
            return;
        }
    }


    // Unreferenced inner class com/microsoft/advertising/android/bz$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        final bz a;
        private final String b;
        private final ai c;

        public final void run()
        {
            a.loadUrl(String.format("javascript:%s", new Object[] {
                b
            }));
_L1:
            return;
            Exception exception;
            exception;
            if (c != null)
            {
                c.a(exception);
                return;
            }
              goto _L1
        }

            
            {
                a = bz.this;
                b = s;
                c = ai1;
                super();
            }
    }

}
