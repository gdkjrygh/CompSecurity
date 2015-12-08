// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.c.a.g;
import com.ford.syncV4.e.h;
import java.util.Hashtable;

public final class y extends h
{

    public y()
    {
    }

    public final void a(g g)
    {
        if (g != null)
        {
            d.put("imageType", g);
            return;
        } else
        {
            d.remove("imageType");
            return;
        }
    }

    public final void a(String s)
    {
        if (s != null)
        {
            d.put("value", s);
            return;
        } else
        {
            d.remove("value");
            return;
        }
    }
}
