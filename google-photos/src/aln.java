// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Trace;

public final class aln
{

    private static boolean a;

    public static void a()
    {
        if (a)
        {
            Trace.endSection();
        }
    }

    public static void a(String s)
    {
        if (a)
        {
            String s1 = s;
            if (s.length() > 127)
            {
                s1 = s.substring(0, 127);
            }
            Trace.beginSection(s1);
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
