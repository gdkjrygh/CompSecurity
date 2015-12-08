// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.miscellaneous;

import ahn;
import ajr;
import cdy;

public abstract class BaseEmitterFilter extends ahn
{

    public cdy mListener;

    protected BaseEmitterFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    protected final void a(long l, Object obj)
    {
        if (a())
        {
            mListener.a(l, obj);
        }
    }

    protected final boolean a()
    {
        return mListener != null;
    }
}
