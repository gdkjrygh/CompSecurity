// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.d;

public class ag extends d
{

    public ag()
    {
        super("OnCommand");
    }

    public ag(Hashtable hashtable)
    {
        super(hashtable);
    }

    public Integer c()
    {
        return (Integer)b.get("cmdID");
    }
}
