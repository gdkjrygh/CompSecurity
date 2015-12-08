// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebView;

public class PandoraWebView extends WebView
{
    public static class a extends android.view.GestureDetector.SimpleOnGestureListener
    {

        public boolean a(MotionEvent motionevent)
        {
            return false;
        }
    }


    protected boolean a;
    private a b;
    private GestureDetector c;

    public PandoraWebView(Context context)
    {
        super(context);
        b = null;
        c = null;
    }

    public PandoraWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = null;
        c = null;
    }

    public PandoraWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = null;
        c = null;
    }

    public boolean a()
    {
        return a;
    }

    public void destroy()
    {
        a = true;
        super.destroy();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        while (c != null && (c.onTouchEvent(motionevent) || (motionevent.getAction() & 0xff) == 1 && b.a(motionevent))) 
        {
            return true;
        }
        return super.onTouchEvent(motionevent);
    }

    public void setGestureListener(a a1)
    {
        b = a1;
        if (b != null)
        {
            c = new GestureDetector(getContext(), b);
            return;
        } else
        {
            c = null;
            return;
        }
    }
}
