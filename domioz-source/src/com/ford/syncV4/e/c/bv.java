// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.c.a.p;
import com.ford.syncV4.e.h;
import java.util.Hashtable;

public final class bv extends h
{

    public bv()
    {
    }

    public bv(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final void a(p p)
    {
        if (p != null)
        {
            d.put("type", p);
        }
    }

    public final void a(String s)
    {
        if (s != null)
        {
            d.put("text", s);
        }
    }
}
