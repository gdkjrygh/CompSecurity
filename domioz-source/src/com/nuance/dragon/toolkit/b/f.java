// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.b;

import com.nuance.dragon.toolkit.d.b.c;
import java.util.Arrays;
import org.json.JSONObject;

// Referenced classes of package com.nuance.dragon.toolkit.b:
//            a

public final class f extends a
{

    private static final char b[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    public byte a[];

    public f(byte abyte0[])
    {
        super((short)4);
        c.a("bytes", abyte0);
        a = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, a, 0, abyte0.length);
    }

    public final String a(String s)
    {
        s = new StringBuilder();
        s.append("0x");
        byte abyte0[] = a;
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            byte byte1 = abyte0[i];
            byte byte0 = (byte)(byte1 >> 4 & 0xf);
            byte1 &= 0xf;
            s.append(b[byte0]);
            s.append(b[byte1]);
        }

        return s.toString();
    }

    protected final void a(JSONObject jsonobject)
    {
        StringBuilder stringbuilder = new StringBuilder();
        byte abyte0[] = a;
        int j = abyte0.length;
        boolean flag = true;
        for (int i = 0; i < j;)
        {
            byte byte0 = abyte0[i];
            if (!flag)
            {
                stringbuilder.append(',');
            }
            stringbuilder.append(byte0);
            i++;
            flag = false;
        }

        jsonobject.put("value", stringbuilder.toString());
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!super.equals(obj))
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (f)obj;
            if (!Arrays.equals(a, ((f) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return super.hashCode() * 31 + Arrays.hashCode(a);
    }

}
