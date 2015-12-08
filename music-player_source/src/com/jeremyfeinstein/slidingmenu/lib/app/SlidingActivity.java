// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jeremyfeinstein.slidingmenu.lib.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;

// Referenced classes of package com.jeremyfeinstein.slidingmenu.lib.app:
//            a

public class SlidingActivity extends Activity
{

    private a a;

    public SlidingActivity()
    {
    }

    public View findViewById(int i)
    {
        View view = super.findViewById(i);
        if (view != null)
        {
            return view;
        } else
        {
            return a.a(i);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = new a(this);
        a.a();
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        boolean flag = a.b(i);
        if (flag)
        {
            return flag;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        a.a(bundle);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        a.b(bundle);
    }

    public void setBehindContentView(View view)
    {
        new android.view.ViewGroup.LayoutParams(-1, -1);
        a.b(view);
    }

    public void setContentView(int i)
    {
        setContentView(getLayoutInflater().inflate(i, null));
    }

    public void setContentView(View view)
    {
        setContentView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        a.a(view);
    }
}
