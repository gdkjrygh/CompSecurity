// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.c.a.d;
import com.ford.syncV4.e.e;
import java.util.Hashtable;

public final class av extends e
{

    public av()
    {
        super("PutFile");
    }

    public final void a(d d)
    {
        if (d != null)
        {
            b.put("fileType", d);
            return;
        } else
        {
            b.remove("fileType");
            return;
        }
    }

    public final void a(String s)
    {
        if (s != null)
        {
            b.put("syncFileName", s);
            return;
        } else
        {
            b.remove("syncFileName");
            return;
        }
    }
}
