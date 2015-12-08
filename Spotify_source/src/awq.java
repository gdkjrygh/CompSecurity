// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Hashtable;

public final class awq extends atn
{

    public awq()
    {
    }

    public awq(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final Integer a()
    {
        return (Integer)e.get("majorVersion");
    }

    public final Integer b()
    {
        return (Integer)e.get("minorVersion");
    }
}
