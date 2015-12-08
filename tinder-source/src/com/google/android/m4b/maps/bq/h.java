// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.bc.b;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bs.e;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            a

public final class h extends a
{

    private static final List e = Arrays.asList(new Integer[] {
        Integer.valueOf(0), Integer.valueOf(9)
    });

    public h(u u, ah ah1, Locale locale, File file, e e1)
    {
        String s = String.valueOf(ah1.D);
        if (s.length() != 0)
        {
            s = "rgts".concat(s);
        } else
        {
            s = new String("rgts");
        }
        super(u, s, ah1, e, 1, 24, 1.0F, true, locale, file, e1);
    }

    protected final b.a d()
    {
        return new a.a(c) {

            private h f;

            protected final aa a(int i)
            {
                if (b[i] == null)
                {
                    return null;
                } else
                {
                    com.google.android.m4b.maps.bo.ac ac = super.c[i].a;
                    byte abyte0[] = b[i];
                    k.a();
                    return com.google.android.m4b.maps.bc.b.a(ac, abyte0, 0, k.c() + 0x48190800L);
                }
            }

            protected final byte[] b(int i)
            {
                return b[i];
            }

            protected final int h()
            {
                int i = 0;
_L3:
                if (i >= b.length) goto _L2; else goto _L1
_L1:
                if (b[i] == null)
                {
                    continue; /* Loop/switch isn't completed */
                }
                int j = com.google.android.m4b.maps.bc.b.a(b[i], 0);
                return j;
                IOException ioexception;
                ioexception;
                i++;
                  goto _L3
_L2:
                return -1;
            }

            
            {
                f = h.this;
                super(h.this, e1);
            }
        };
    }

}
