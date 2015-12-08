// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.c.b:
//            g, cc

public final class au
{
    public static interface a
    {

        public abstract int a();
    }

    public static interface b
    {
    }

    public static interface c
        extends List
    {
    }


    protected static final Charset a = Charset.forName("UTF-8");
    protected static final Charset b = Charset.forName("ISO-8859-1");
    public static final byte c[];
    public static final ByteBuffer d;
    public static final g e;

    public static int a(a a1)
    {
        return a1.a();
    }

    public static int a(List list)
    {
        list = list.iterator();
        int i;
        for (i = 1; list.hasNext(); i = ((a)list.next()).a() + i * 31) { }
        return i;
    }

    public static boolean a(byte abyte0[])
    {
        return cc.a(abyte0, 0, abyte0.length);
    }

    public static String b(byte abyte0[])
    {
        return new String(abyte0, a);
    }

    static 
    {
        byte abyte0[] = new byte[0];
        c = abyte0;
        d = ByteBuffer.wrap(abyte0);
        abyte0 = c;
        e = g.a(abyte0, abyte0.length);
    }
}
