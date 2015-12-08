// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.os;

import android.os.Trace;

class TraceJellybeanMR2
{

    public static void beginSection(String s)
    {
        Trace.beginSection(s);
    }

    public static void endSection()
    {
        Trace.endSection();
    }
}
