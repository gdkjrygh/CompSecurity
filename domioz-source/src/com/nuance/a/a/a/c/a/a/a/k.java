// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.a.a.a;

import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;

// Referenced classes of package com.nuance.a.a.a.c.a.a.a:
//            e, g, p, l

public class k
{

    private static final e a = d.a(com/nuance/a/a/a/c/a/a/a/k);

    public k()
    {
    }

    public static l a(byte abyte0[])
    {
        short word0 = (short)(((abyte0[1] & 0xff) << 8) + (abyte0[0] & 0xff));
        byte abyte1[] = new byte[abyte0.length - 2];
        System.arraycopy(abyte0, 2, abyte1, 0, abyte1.length);
        switch (word0)
        {
        case 29187: 
        case 29188: 
        default:
            a.b((new StringBuilder("PDXMessageFactory.createMessage() Unknown command: ")).append(word0).append(". ").toString());
            return null;

        case 29185: 
            return new com.nuance.a.a.a.c.a.a.a.e(abyte1);

        case 29186: 
            return new g(abyte1);

        case 29189: 
            return new p(abyte1);
        }
    }

}
