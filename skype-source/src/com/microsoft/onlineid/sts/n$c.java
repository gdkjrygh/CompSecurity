// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import com.microsoft.onlineid.internal.a.d;

// Referenced classes of package com.microsoft.onlineid.sts:
//            n

public static final class j extends Enum
    implements d
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h k[];
    private final String i;
    private final Integer j;

    public static .a.d valueOf(String s)
    {
        return (.a.d)Enum.valueOf(com/microsoft/onlineid/sts/n$c, s);
    }

    public static .a.d[] values()
    {
        return (.a.d[])k.clone();
    }

    public final String a()
    {
        return i;
    }

    public final volatile Object b()
    {
        return j;
    }

    static 
    {
        a = new <init>("ConnectTimeout", 0, "ConnectTimeout", 10000);
        b = new <init>("SendTimeout", 1, "SendTimeout", 30000);
        c = new <init>("ReceiveTimeout", 2, "ReceiveTimeout", 30000);
        d = new <init>("BackupSlaveCount", 3, "BackupSlaveCount", 3);
        e = new <init>("MaxSecondsBetweenBackups", 4, "MaxSecondsBetweenBackups", 0x3f480);
        f = new <init>("MinSecondsBetweenConfigDownloads", 5, "MinSecondsBetweenConfigDownloads", 28800);
        g = new <init>("MaxTriesForSsoRequestToSingleService", 6, "MaxTriesForSsoRequestToSingleService", 2);
        h = new <init>("MaxTriesForSsoRequestWithFallback", 7, "MaxTriesForSsoRequestWithFallback", 4);
        k = (new k[] {
            a, b, c, d, e, f, g, h
        });
    }

    private .a.d(String s, int l, String s1, int i1)
    {
        super(s, l);
        i = s1;
        j = Integer.valueOf(i1);
    }
}
