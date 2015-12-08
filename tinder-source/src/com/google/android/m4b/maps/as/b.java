// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.as;

import java.util.LinkedList;

// Referenced classes of package com.google.android.m4b.maps.as:
//            a, c

public final class b extends com.google.android.m4b.maps.as.a
{
    public static interface a
    {

        public abstract void a(byte abyte0[], int i);
    }


    private static final c e = new c() {

        protected final Object a()
        {
            return new byte[4106];
        }

    };

    public b(int i)
    {
        super(i, 12, e);
    }

    public final void a(a a1)
    {
        for (int i = 0; i < b; i++)
        {
            a1.a((byte[])a.get(i), 4096);
        }

        if (b != a.size())
        {
            a1.a((byte[])c, d);
        }
    }

}
