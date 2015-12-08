// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            e

public final class l
{
    public static interface a
    {

        public abstract int a();
    }

    public static interface b
    {

        public abstract a a();
    }


    protected static final Charset a = Charset.forName("UTF-8");
    public static final byte b[];
    public static final e c;
    private static Charset d = Charset.forName("ISO-8859-1");
    private static ByteBuffer e;

    static boolean a()
    {
        return false;
    }

    static 
    {
        byte abyte0[] = new byte[0];
        b = abyte0;
        e = ByteBuffer.wrap(abyte0);
        abyte0 = b;
        c = com.google.android.m4b.maps.ct.e.a(abyte0, abyte0.length);
    }
}
