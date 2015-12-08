// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.at.c;
import com.google.android.m4b.maps.ba.b;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bx.o;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            aa, ah, ac

public final class bg
    implements aa
{

    public final byte a[];
    public String b[];
    public String c[];
    public List d;
    public int e;
    private final ac f;
    private final ah g;
    private final int h;
    private final int i;
    private final int j;
    private final e k;

    public bg(ac ac, int l, int i1, int j1, byte abyte0[], ah ah1, e e1)
    {
        byte byte0 = -1;
        super();
        e = -1;
        f = ac;
        g = ah1;
        h = l;
        i = i1;
        j = j1;
        k = e1;
        ac = abyte0;
        if (abyte0 != null)
        {
            ac = abyte0;
            if (abyte0.length != 0)
            {
                ac = new b();
                abyte0 = ac.a(abyte0);
                if (o.a())
                {
                    b = ac.b();
                    c = ac.c();
                    e1 = ac.a();
                    l = byte0;
                    if (e1 != null)
                    {
                        l = byte0;
                        if (e1.i(3))
                        {
                            l = e1.d(3);
                            if (l == 0)
                            {
                                l = byte0;
                            }
                        }
                    }
                    e = l;
                }
                if (ah1 == ah.x)
                {
                    d = ac.d();
                }
                ac = abyte0;
                if (abyte0[0] == 67)
                {
                    try
                    {
                        ac = com.google.android.m4b.maps.at.c.a(abyte0);
                    }
                    // Misplaced declaration of an exception variable
                    catch (ac ac)
                    {
                        throw new IOException("Input image is not Compact JPEG");
                    }
                }
            }
        }
        if (b == null)
        {
            b = new String[0];
        }
        if (c == null)
        {
            c = new String[0];
        }
        if (d == null)
        {
            d = Collections.emptyList();
        }
        a = ac;
    }

    public final ac a()
    {
        return f;
    }

    public final ah b()
    {
        return g;
    }

    public final int c()
    {
        return h;
    }

    public final boolean d()
    {
        return false;
    }

    public final int e()
    {
        return -1;
    }

    public final boolean f()
    {
        return false;
    }

    public final void g()
    {
    }

    public final boolean h()
    {
        return false;
    }
}
