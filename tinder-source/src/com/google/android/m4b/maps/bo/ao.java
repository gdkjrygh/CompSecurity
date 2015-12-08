// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ak.a;
import java.io.DataInput;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            ae, am, d, ap, 
//            bb

public class ao
{
    public static final class a extends ao
    {

        public final bb a()
        {
            return b;
        }

        public final boolean b()
        {
            return com.google.android.m4b.maps.bo.d.a(c, 2);
        }

        public final int c()
        {
            return d;
        }

        public final boolean d()
        {
            return com.google.android.m4b.maps.bo.d.a(c, 4);
        }

        public a(bb bb, int i, int j)
        {
            super(null, bb, i | 1, j);
        }
    }

    public static final class b extends ao
    {

        private int e;

        public final bb a()
        {
            return b;
        }

        public b(int i, bb bb)
        {
            super(null, bb, 0, 0);
            e = i;
        }
    }

    public static final class c extends ao
    {

        public final com.google.android.m4b.maps.ak.a a()
        {
            return a;
        }

        public c(com.google.android.m4b.maps.ak.a a1)
        {
            byte byte0;
            if (a1 instanceof com.google.android.m4b.maps.ak.a.b)
            {
                byte0 = 2;
            } else
            {
                byte0 = 0;
            }
            super(a1, null, byte0, -1);
        }
    }

    public static final class d extends ao
    {

        private int e;

        public d(int i)
        {
            super(null, null, 0, 0);
            e = i;
        }
    }


    protected final com.google.android.m4b.maps.ak.a a;
    protected final bb b;
    protected final int c;
    protected final int d;

    protected ao(com.google.android.m4b.maps.ak.a a1, bb bb, int i, int j)
    {
        a = a1;
        b = bb;
        c = i;
        d = j;
    }

    public static ao a(DataInput datainput, ae ae1)
    {
        int k = datainput.readUnsignedByte();
        if (ae1.a == 11)
        {
            int i = com.google.android.m4b.maps.bo.am.a(datainput);
            if (com.google.android.m4b.maps.bo.d.a(k, 1))
            {
                return new b(i, com.google.android.m4b.maps.bo.ap.a(datainput, ae1));
            } else
            {
                return new d(i);
            }
        }
        int j = -1;
        if (com.google.android.m4b.maps.bo.d.a(k, 1))
        {
            ae1 = com.google.android.m4b.maps.bo.ap.a(datainput, ae1);
            if (com.google.android.m4b.maps.bo.d.a(k, 2))
            {
                j = com.google.android.m4b.maps.bo.am.a(datainput);
            }
            return new a(ae1, k, j);
        }
        if (com.google.android.m4b.maps.bo.d.a(k, 2))
        {
            datainput = com.google.android.m4b.maps.ak.a.b(datainput);
        } else
        {
            datainput = com.google.android.m4b.maps.ak.a.a(datainput);
        }
        return new c(datainput);
    }
}
