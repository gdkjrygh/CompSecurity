// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.os;


// Referenced classes of package android.support.v4.os:
//            TraceJellybeanMR2

public class TraceCompat
{

    public static void beginSection(String s)
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            TraceJellybeanMR2.beginSection(s);
        }
    }

    public static void endSection()
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            TraceJellybeanMR2.endSection();
        }
    }
}
