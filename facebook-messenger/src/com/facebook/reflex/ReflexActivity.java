// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import android.app.NativeActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package com.facebook.reflex:
//            Widget

public class ReflexActivity extends NativeActivity
{

    private static Widget c;
    private Widget a;
    private boolean b;
    private int mNativeActivityHandle;

    public ReflexActivity()
    {
        b = false;
        mNativeActivityHandle = 0;
    }

    private void dispatchKeyEventFromInput(long l, long l1, int i, int j, int k, 
            int i1, int j1, int k1, int i2, int j2)
    {
        Object obj2 = new KeyEvent(l, l1, i, j, k, i1, j1, k1, i2, j2);
        if (j == 4)
        {
            if (i == 1 && !((KeyEvent) (obj2)).isCanceled())
            {
                InputMethodManager inputmethodmanager = (InputMethodManager)getSystemService("input_method");
                obj2 = getCurrentFocus();
                Object obj = obj2;
                if (obj2 == null)
                {
                    obj = getWindow().getDecorView();
                }
                if (!inputmethodmanager.hideSoftInputFromWindow(((View) (obj)).getWindowToken(), 0))
                {
                    onBackPressed();
                }
            }
        } else
        {
            onUserInteraction();
            Object obj1 = getWindow();
            if (!((Window) (obj1)).superDispatchKeyEvent(((KeyEvent) (obj2))))
            {
                obj1 = ((Window) (obj1)).getDecorView();
                if (obj1 != null)
                {
                    obj1 = ((View) (obj1)).getKeyDispatcherState();
                } else
                {
                    obj1 = null;
                }
                ((KeyEvent) (obj2)).dispatch(this, ((android.view.KeyEvent.DispatcherState) (obj1)), this);
                return;
            }
        }
    }

    public static Widget e()
    {
        return c;
    }

    private native void nativeSetRoot(Widget widget);

    private static native void setRuntimeProperty(String s, String s1);

    protected void a(Widget widget)
    {
        a = widget;
        if (b)
        {
            b(a);
        }
    }

    public void b(Widget widget)
    {
        if (c != widget)
        {
            Widget widget1 = c;
            c = widget;
            if (c != null)
            {
                c.a();
            }
            nativeSetRoot(c);
            if (widget1 != null)
            {
                widget1.b();
                return;
            }
        }
    }

    protected void didReceiveDriverInformation(String s, String s1, String s2, String s3)
    {
    }

    protected void onPause()
    {
        super.onPause();
        b = false;
    }

    protected void onResume()
    {
        super.onResume();
        b = true;
        b(a);
    }

    protected void onStop()
    {
        if (e() == a)
        {
            b(null);
        }
        super.onStop();
    }

    static 
    {
        System.loadLibrary("fb_stl_shared");
        System.loadLibrary("fb");
        System.loadLibrary("stopmotion");
        System.loadLibrary("peanut");
        System.loadLibrary("reflex");
        System.loadLibrary("reflex-jni");
    }
}
