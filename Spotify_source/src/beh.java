// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Trace;

public final class beh
{

    public static void a()
    {
        if (bej.a >= 18)
        {
            Trace.endSection();
        }
    }

    public static void a(String s)
    {
        if (bej.a >= 18)
        {
            Trace.beginSection(s);
        }
    }
}
