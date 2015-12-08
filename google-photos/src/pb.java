// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pb
{

    public static final pb a = new pb(1, null);
    public static final pb b = new pb(2, null);
    private final Object c;

    private pb(int i, CharSequence charsequence)
    {
        this(pa.m().a(i, null));
    }

    private pb(Object obj)
    {
        c = obj;
    }

    static Object a(pb pb1)
    {
        return pb1.c;
    }

    static 
    {
        new pb(4, null);
        new pb(8, null);
        new pb(16, null);
        new pb(32, null);
        new pb(64, null);
        new pb(128, null);
        new pb(256, null);
        new pb(512, null);
        new pb(1024, null);
        new pb(2048, null);
        new pb(4096, null);
        new pb(8192, null);
        new pb(16384, null);
        new pb(32768, null);
        new pb(0x10000, null);
        new pb(0x20000, null);
        new pb(0x40000, null);
        new pb(0x80000, null);
        new pb(0x100000, null);
        new pb(0x200000, null);
    }
}
