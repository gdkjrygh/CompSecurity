// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class cho
{

    public float a[];

    public cho()
    {
        a = new float[16];
    }

    public static cho a(float f, float f1, float f2, float f3)
    {
        cho cho1 = new cho();
        cho1.a[0] = f;
        cho1.a[5] = f1;
        cho1.a[10] = 1.0F;
        cho1.a[15] = 1.0F;
        cho1.a[12] = f2;
        cho1.a[13] = f3;
        return cho1;
    }

    public final void a(cho cho1)
    {
        for (int i = 0; i < a.length; i++)
        {
            a[i] = cho1.a[i];
        }

    }

    public final void a(cho cho1, cho cho2, float f)
    {
        for (int i = 0; i < a.length; i++)
        {
            a[i] = (1.0F - f) * cho1.a[i] + cho2.a[i] * f;
        }

    }

    public final String toString()
    {
        String s = String.valueOf(getClass().getSimpleName());
        String s1 = String.valueOf(Arrays.toString(a));
        return (new StringBuilder(String.valueOf(s).length() + 2 + String.valueOf(s1).length())).append(s).append("[").append(s1).append("]").toString();
    }
}
