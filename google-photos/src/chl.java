// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public class chl
{

    private static final String a = chl.getSimpleName();

    private chl()
    {
    }

    public static void a(int i, chy chy1, cio cio, int j, cie cie)
    {
        try
        {
            chy1.a(new chm(j, cie, cio, 5));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (chy chy1)
        {
            Log.w(a, "exception while applying shader", chy1);
        }
    }

    public static void a(chy chy1, float af[])
    {
        try
        {
            chy1.a(new chn(af));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (chy chy1)
        {
            Log.w(a, "exception with glClear", chy1);
        }
    }

}
