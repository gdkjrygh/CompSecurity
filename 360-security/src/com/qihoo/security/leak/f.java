// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.leak;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;

public class f extends FrameLayout
{
    public static interface a
    {

        public abstract void a();
    }


    private WindowManager a;
    private android.view.WindowManager.LayoutParams b;
    private a c;

    public f(Context context, a a1)
    {
        super(context);
        c = null;
        c = a1;
        a = (WindowManager)getContext().getSystemService("window");
        b = new android.view.WindowManager.LayoutParams(-2, -2, 2002, 544, -3);
        b.gravity = 51;
        setFocusableInTouchMode(true);
        setFocusable(true);
        LayoutInflater.from(getContext()).inflate(0x7f03006e, this);
    }

    private void c()
    {
        a.updateViewLayout(this, b);
    }

    private void d()
    {
        if (getContext().getResources().getConfiguration().orientation == 1)
        {
            b.x = 400;
            b.y = 500;
            return;
        } else
        {
            b.x = 1200;
            b.y = 480;
            return;
        }
    }

    public void a(Configuration configuration)
    {
        if (isShown())
        {
            d();
            c();
        }
    }

    public boolean a()
    {
        if (isShown())
        {
            return false;
        }
        try
        {
            d();
            a.addView(this, b);
        }
        catch (Exception exception)
        {
            return false;
        }
        return true;
    }

    public void b()
    {
        if (!isShown())
        {
            return;
        }
        try
        {
            a.removeView(this);
            c.a();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            b();
        }
        return super.onKeyDown(i, keyevent);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        b();
        return super.onTouchEvent(motionevent);
    }
}
