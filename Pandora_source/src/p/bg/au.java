// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.g;

public class au extends g
{

    public au()
    {
        super("PerformInteraction");
    }

    public au(Hashtable hashtable)
    {
        super(hashtable);
    }

    public Integer i()
    {
        return (Integer)b.get("choiceID");
    }
}
