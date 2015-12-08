// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.e;
import java.util.Hashtable;

public final class be extends e
{

    public be()
    {
        super("SetDisplayLayout");
    }

    public final void a(String s)
    {
        if (s != null)
        {
            b.put("displayLayout", s);
            return;
        } else
        {
            b.remove("displayLayout");
            return;
        }
    }
}
