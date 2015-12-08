// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.text.TextUtils;
import com.jcp.h.f;
import com.jcp.h.g;

public abstract class ao extends ac
{

    public ao()
    {
    }

    protected String A()
    {
        return null;
    }

    protected abstract String h();

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getResources().getBoolean(0x7f0a0003))
        {
            setRequestedOrientation(1);
        }
    }

    public void onResume()
    {
        String s;
        f f;
label0:
        {
            super.onResume();
            if (y())
            {
                s = h();
                String s1 = A();
                if (!TextUtils.isEmpty(s))
                {
                    f = g.a(getIntent().getExtras(), z());
                    if (TextUtils.isEmpty(s1))
                    {
                        break label0;
                    }
                    g.a(s, s1, f);
                }
            }
            return;
        }
        g.a(s, f);
    }

    protected boolean y()
    {
        return true;
    }

    protected f z()
    {
        return null;
    }
}
