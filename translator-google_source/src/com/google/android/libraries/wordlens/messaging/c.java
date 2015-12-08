// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens.messaging;

import com.google.android.libraries.wordlens.util.f;

// Referenced classes of package com.google.android.libraries.wordlens.messaging:
//            a

public final class c extends a
{

    private float c;

    public c(int i, byte abyte0[])
    {
        super(i, abyte0);
        c = (0.0F / 0.0F);
    }

    public final float a()
    {
        if (Float.isNaN(c))
        {
            try
            {
                c = Float.intBitsToFloat(f.a(super.b, 0));
            }
            catch (Exception exception)
            {
                String s = f.a(super.b);
                String s1 = String.valueOf(exception.getLocalizedMessage());
                (new StringBuilder(String.valueOf(s).length() + 54 + String.valueOf(s1).length())).append("Unable to parse confidence from payload: ").append(s).append(", exception: ").append(s1);
                return 0.0F;
            }
        }
        if (Float.isNaN(c))
        {
            return 0.0F;
        } else
        {
            return c;
        }
    }
}
