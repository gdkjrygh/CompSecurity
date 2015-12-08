// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.b.a.b;


// Referenced classes of package com.nuance.a.a.a.c.b.a.b:
//            e

public final class c extends e
{

    private Boolean a;

    public c(boolean flag)
    {
        super((short)7);
        a = new Boolean(flag);
    }

    public c(byte abyte0[])
    {
        boolean flag = false;
        super((short)7);
        if (abyte0 == null)
        {
            a = Boolean.valueOf(false);
        }
        if (abyte0.length <= 0)
        {
            a = Boolean.valueOf(false);
        }
        if (abyte0[0] != 0)
        {
            flag = true;
        }
        a = Boolean.valueOf(flag);
    }

    public final boolean a()
    {
        return a.booleanValue();
    }

    public final byte[] b()
    {
        char c1;
        if (a.booleanValue())
        {
            c1 = '\377';
        } else
        {
            c1 = '\0';
        }
        return super.b(new byte[] {
            (byte)c1
        });
    }
}
