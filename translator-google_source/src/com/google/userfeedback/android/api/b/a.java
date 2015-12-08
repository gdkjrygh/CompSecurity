// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api.b;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.userfeedback.android.api.b:
//            c

public final class a
{

    public static String a(byte abyte0[])
    {
        c c1;
        int j;
        int k;
        k = abyte0.length;
        c1 = new c();
        j = k / 3 << 2;
        if (!c1.f) goto _L2; else goto _L1
_L1:
        int i;
        i = j;
        if (k % 3 > 0)
        {
            i = j + 4;
        }
_L8:
        if (!c1.g || k <= 0) goto _L4; else goto _L3
_L3:
        int l = (k - 1) / 57;
        if (c1.h)
        {
            j = 2;
        } else
        {
            j = 1;
        }
        i = j * (l + 1) + i;
          goto _L5
_L4:
        try
        {
            c1.a = new byte[i];
            c1.a(abyte0, k);
            return new String(c1.a, "US-ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
_L2:
        i = j;
        switch (k % 3)
        {
        default:
            i = j;
            break;

        case 1: // '\001'
            i = j + 2;
            break;

        case 2: // '\002'
            i = j + 3;
            break;

        case 0: // '\0'
            break;
        }
          goto _L6
_L5:
        if (true) goto _L4; else goto _L6
_L6:
        if (true) goto _L8; else goto _L7
_L7:
    }
}
