// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.c.a.m;
import com.ford.syncV4.e.e;
import java.util.Hashtable;
import java.util.Vector;

public final class bt extends e
{

    public bt()
    {
        super("SystemRequest");
    }

    public bt(byte byte0)
    {
        super("EncodedSyncPData");
    }

    public final void a(m m)
    {
        if (m != null)
        {
            b.put("requestType", m);
            return;
        } else
        {
            b.remove("requestType");
            return;
        }
    }

    public final void a(Vector vector)
    {
        b.put("data", vector);
    }
}
