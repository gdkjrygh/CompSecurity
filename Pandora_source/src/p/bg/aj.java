// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.d;

public class aj extends d
{

    public aj()
    {
        super("OnHashChange");
    }

    public aj(Hashtable hashtable)
    {
        super(hashtable);
    }

    public String c()
    {
        return (String)b.get("hashID");
    }
}
