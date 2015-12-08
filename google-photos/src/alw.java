// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class alw extends alv
{

    public alw()
    {
    }

    public alw(int i)
    {
        super(i);
    }

    protected final int a()
    {
        return 0x80001ff2;
    }

    public final void b(int i)
    {
        if ((i & 0x100) > 0 && (i & 0x200) > 0)
        {
            throw new alo("IsStruct and IsArray options are mutually exclusive", 103);
        }
        if ((i & 2) > 0 && (i & 0x300) > 0)
        {
            throw new alo("Structs and arrays can't have \"value\" options", 103);
        } else
        {
            return;
        }
    }

    public final boolean b()
    {
        return a(1024);
    }

    public final boolean c()
    {
        return a(2048);
    }

    public final boolean d()
    {
        return a(4096);
    }
}
