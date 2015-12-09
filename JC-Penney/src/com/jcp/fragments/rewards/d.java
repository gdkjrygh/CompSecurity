// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.app.Activity;
import android.content.res.Resources;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import butterknife.ButterKnife;
import com.jcp.e.ag;
import com.jcp.fragments.s;

public abstract class d extends s
{

    protected ag h;

    public d()
    {
    }

    public void a(Activity activity)
    {
        super.a(activity);
        try
        {
            h = (ag)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement RewardsListener").toString());
        }
    }

    protected void a(Spinner spinner)
    {
        ArrayAdapter arrayadapter = new ArrayAdapter(i(), 0x1090008, j().getStringArray(0x7f0c0014));
        arrayadapter.setDropDownViewResource(0x1090009);
        spinner.setAdapter(arrayadapter);
    }

    public void f()
    {
        super.f();
        ButterKnife.reset(this);
    }
}
