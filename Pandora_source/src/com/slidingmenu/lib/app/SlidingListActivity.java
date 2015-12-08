// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.slidingmenu.lib.app;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

// Referenced classes of package com.slidingmenu.lib.app:
//            a

public class SlidingListActivity extends ListActivity
{

    private a a;

    public SlidingListActivity()
    {
    }

    public void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        a.b(view, layoutparams);
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
        a.a(bundle);
        bundle = new ListView(this);
        bundle.setId(0x102000a);
        setContentView(bundle);
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        boolean flag = a.a(i, keyevent);
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
        a.b(bundle);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        a.c(bundle);
    }

    public void setBehindContentView(View view)
    {
        a(view, new android.view.ViewGroup.LayoutParams(-1, -1));
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
        a.a(view, layoutparams);
    }
}
