// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.am;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bs.e;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            a

public final class c extends a
{

    private static final List e = Arrays.asList(new Integer[] {
        Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(5)
    });

    public c(u u, ah ah1, int i, int j, float f, Locale locale, File file, 
            e e1)
    {
        String s = String.valueOf(ah1.D);
        if (s.length() != 0)
        {
            s = "its".concat(s);
        } else
        {
            s = new String("its");
        }
        super(u, s, ah1, e, i, j, f, false, locale, file, e1);
    }

    protected final b.a d()
    {
        return new a.a(c) {

            private c f;

            protected final aa a(int i)
            {
                if (b[i] == null)
                {
                    return null;
                } else
                {
                    return new bg(super.c[i].a, h(), 256, 256, b[i], f.b, f.c);
                }
            }

            protected final byte[] b(int i)
            {
                if (b[i] == null)
                {
                    return null;
                }
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(b[i].length + 32);
                byte abyte0[];
                try
                {
                    ac ac1 = super.c[i].a;
                    int j = h();
                    byte abyte1[] = b[i];
                    DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);
                    dataoutputstream.writeInt(0x44524154);
                    am.a(dataoutputstream, 8);
                    am.a(dataoutputstream, ac1.a);
                    am.a(dataoutputstream, ac1.b);
                    am.a(dataoutputstream, ac1.c);
                    am.a(dataoutputstream, j);
                    am.a(dataoutputstream, 256);
                    am.a(dataoutputstream, 256);
                    am.a(dataoutputstream, abyte1.length);
                    dataoutputstream.write(abyte1);
                    abyte0 = bytearrayoutputstream.toByteArray();
                }
                catch (IOException ioexception)
                {
                    return null;
                }
                return abyte0;
            }

            
            {
                f = c.this;
                super(c.this, e1);
            }
        };
    }

}
