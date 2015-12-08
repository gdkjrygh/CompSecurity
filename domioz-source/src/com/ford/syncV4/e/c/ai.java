// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.d;
import java.util.Hashtable;

public final class ai extends d
{

    public ai()
    {
        super("OnHashChange");
    }

    public ai(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final String c()
    {
        return (String)b.get("hashID");
    }
}
