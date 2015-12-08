// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.app;

import android.content.Context;
import android.content.res.Resources;
import b;
import bma;
import bnl;
import bpe;
import clx;
import ddy;
import lvd;
import nnr;
import noe;
import olm;

public class DefaultConnector extends noe
{

    private final Context b;
    private final bnl c;

    public DefaultConnector(Context context)
    {
        b = (Context)b.a(context, "context", null);
        bma bma1 = bpe.a(context).a;
        c = (bnl)olm.a(context, bnl);
        olm.a(context, clx);
        bma1.m();
        olm.a(context, nnr);
    }

    public final boolean a()
    {
        if (!ddy.c.a())
        {
            if (ddy.d.a())
            {
                return false;
            }
            if (!b.getResources().getBoolean(b.cm) || !c.A_())
            {
                return false;
            }
        }
        return true;
    }

    public final boolean b()
    {
        return lvd.a(c.a, "moviemaker:cloud_aam_editing_enabled", true);
    }

    public final int c()
    {
        return c.p();
    }
}
