// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.b.a.b;

import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;

// Referenced classes of package com.nuance.a.a.a.c.b.a.b:
//            e

public class a extends com.nuance.a.a.a.c.b.a.b.e
{

    private static final e a = d.a(com/nuance/a/a/a/c/b/a/b/a);
    private String b;

    public a(String s)
    {
        super((short)193);
        b = s;
    }

    public a(byte abyte0[])
    {
        super((short)193);
        try
        {
            b = new String(abyte0, "UTF-8");
            return;
        }
        catch (Exception exception)
        {
            a.b((new StringBuilder("PDXUTF8String() ")).append(exception.getMessage()).toString());
        }
        b = new String(abyte0);
    }

    public final String a()
    {
        return b;
    }

    public final byte[] b()
    {
        byte abyte0[];
        try
        {
            abyte0 = super.b(b.getBytes("UTF-8"));
        }
        catch (Exception exception)
        {
            a.b((new StringBuilder("PDXUTF8String().toByteArray() ")).append(exception.getMessage()).toString());
            return super.b(b.getBytes());
        }
        return abyte0;
    }

}
