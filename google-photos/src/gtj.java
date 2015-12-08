// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public final class gtj
{

    private static final gup a;

    public static long a(gur gur1, int i, Uri uri, String s)
    {
        guo guo1 = new guo();
        guo1.b = uri;
        guo1.c = s;
        guo1.f = a;
        guo1.d = uri;
        guo1.e = s;
        return gur1.a(i, guo1.a()).a;
    }

    public static long a(gur gur1, int i, Uri uri, String s, byte abyte0[])
    {
        guo guo1 = new guo();
        guo1.b = uri;
        guo1.c = s;
        guo1.f = a;
        guo1.g = abyte0;
        return gur1.a(i, guo1.a()).a;
    }

    static 
    {
        a = gup.b;
    }
}
