// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class bvz extends bui
{

    public bvz(bup bup, buk buk, bus bus, String s)
    {
        super(new buo(bup), buk, bus, (new StringBuilder("Bearer ")).append(s).toString());
        a("Content-Type", "application/json");
        a("Accept", "application/json");
    }
}
