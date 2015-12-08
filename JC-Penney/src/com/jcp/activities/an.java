// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.jcp.h.f;
import com.jcp.h.g;

public abstract class an extends Activity
{

    public an()
    {
    }

    protected abstract String a();

    protected boolean b()
    {
        return true;
    }

    protected boolean d()
    {
        return false;
    }

    protected f e()
    {
        return null;
    }

    protected String f()
    {
        return null;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!d() && getResources().getBoolean(0x7f0a0003))
        {
            setRequestedOrientation(1);
        }
    }

    public void onResume()
    {
        String s;
        f f1;
label0:
        {
            super.onResume();
            if (b())
            {
                s = a();
                String s1 = f();
                if (!TextUtils.isEmpty(s))
                {
                    f1 = g.a(getIntent().getExtras(), e());
                    if (TextUtils.isEmpty(s1))
                    {
                        break label0;
                    }
                    g.a(s, s1, f1);
                }
            }
            return;
        }
        g.a(s, f1);
    }
}
