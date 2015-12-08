// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.d;
import java.util.Hashtable;

public final class ae extends d
{

    public ae()
    {
        super("OnButtonPress");
    }

    public ae(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final Integer c()
    {
        return (Integer)b.get("customButtonID");
    }
}
