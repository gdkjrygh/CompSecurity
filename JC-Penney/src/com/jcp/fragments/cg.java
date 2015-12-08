// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.jcp.h.f;
import com.jcp.h.g;

public abstract class cg extends Fragment
{

    public cg()
    {
    }

    protected f S()
    {
        return null;
    }

    protected String T()
    {
        return null;
    }

    protected boolean Y()
    {
        return true;
    }

    protected abstract String a();

    public void f_()
    {
        String s;
        f f;
label0:
        {
            super.f_();
            if (Y())
            {
                s = a();
                String s1 = T();
                if (!TextUtils.isEmpty(s))
                {
                    f = g.a(h(), S());
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
}
