// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.ap;
import com.google.android.m4b.maps.bo.d;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bw.f;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            a

public class n extends a
{

    private static final List e = Arrays.asList(new Integer[] {
        Integer.valueOf(0), Integer.valueOf(12)
    });
    protected long f;

    public n(u u1, ah ah1, int i, float f1, Locale locale, File file, e e1)
    {
        String s1 = ah1.D;
        String s;
        if (u1 == null || u1.h() == null || "DriveAbout".equals(u1.h()))
        {
            s = "";
        } else
        {
            s = String.valueOf(u1.h().replace(':', '_'));
            if (s.length() != 0)
            {
                s = "_".concat(s);
            } else
            {
                s = new String("_");
            }
        }
        super(u1, (new StringBuilder(String.valueOf(s1).length() + 3 + String.valueOf(s).length())).append("vts").append(s1).append(s).toString(), ah1, e, 1, i, f1, false, locale, file, e1);
        f = -1L;
    }

    protected final b.a d()
    {
        return new a.a(c) {

            private n f;

            protected final aa a(int i)
            {
                if (b[i] == null)
                {
                    return null;
                }
                ap ap1;
                long l;
                if (f.f > 0L)
                {
                    k.a();
                    l = k.c() + f.f;
                } else
                {
                    l = -1L;
                }
                ap1 = ap.a(super.c[i].a, b[i], 0, super.c[i].h, l, -1L, f.c);
                k.a();
                ap1.g();
                return ap1;
            }

            protected final byte[] a(int i, int j)
            {
                byte abyte0[] = new byte[i + 8];
                com.google.android.m4b.maps.bo.d.a(a, abyte0, 0);
                com.google.android.m4b.maps.bo.d.a(j, abyte0, 4);
                return abyte0;
            }

            protected final byte[] b(int i)
            {
                return b[i];
            }

            
            {
                f = n.this;
                super(n.this, e1);
            }
        };
    }

    public final void f()
    {
        f = 0x1d4c0L;
    }

    public void run()
    {
        com.google.android.m4b.maps.bw.f.a();
        super.run();
        com.google.android.m4b.maps.bw.f.b();
        return;
        Exception exception;
        exception;
        com.google.android.m4b.maps.bw.f.b();
        throw exception;
    }

}
