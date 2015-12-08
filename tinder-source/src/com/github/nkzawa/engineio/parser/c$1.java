// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.parser;

import java.util.ArrayList;

// Referenced classes of package com.github.nkzawa.engineio.parser:
//            c, a

static final class a
    implements a
{

    final ArrayList a;

    public final void a(Object obj)
    {
        if (obj instanceof String)
        {
            String s = String.valueOf(((String)obj).length());
            byte abyte0[] = new byte[s.length() + 2];
            abyte0[0] = 0;
            for (int i = 0; i < s.length(); i++)
            {
                abyte0[i + 1] = (byte)Character.getNumericValue(s.charAt(i));
            }

            abyte0[abyte0.length - 1] = -1;
            a.add(com.github.nkzawa.engineio.parser.a.a(new byte[][] {
                abyte0, c.b((String)obj)
            }));
            return;
        }
        String s1 = String.valueOf(((byte[])(byte[])obj).length);
        byte abyte1[] = new byte[s1.length() + 2];
        abyte1[0] = 1;
        for (int j = 0; j < s1.length(); j++)
        {
            abyte1[j + 1] = (byte)Character.getNumericValue(s1.charAt(j));
        }

        abyte1[abyte1.length - 1] = -1;
        a.add(com.github.nkzawa.engineio.parser.a.a(new byte[][] {
            abyte1, (byte[])(byte[])obj
        }));
    }

    (ArrayList arraylist)
    {
        a = arraylist;
        super();
    }
}
