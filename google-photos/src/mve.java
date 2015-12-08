// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class mve
{

    private static final onh a = new onh("debug.social.die_hard");

    public static qlw a(qlw qlw1, byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        try
        {
            qlw1 = qlw.a(qlw1, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            qlw1 = String.valueOf(abyte0.getMessage());
            if (qlw1.length() != 0)
            {
                qlw1 = "Invalid binary data: ".concat(qlw1);
            } else
            {
                qlw1 = new String("Invalid binary data: ");
            }
            Log.e("MessageNanoUtils", qlw1, abyte0);
            qlw1 = null;
        }
        return qlw1;
    }

}
