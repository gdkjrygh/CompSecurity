// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.h;

public class cd extends h
{

    public cd()
    {
    }

    public cd(Hashtable hashtable)
    {
        super(hashtable);
    }

    public String a()
    {
        return (String)d.get("make");
    }

    public String b()
    {
        return (String)d.get("model");
    }

    public String c()
    {
        return (String)d.get("modelYear");
    }
}
