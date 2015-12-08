// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            z, le

public final class li
    implements z
{
    static final class a
    {

        public long a;
        public String b;
        public String c;
        public long d;
        public long e;
        public long f;
        public long g;
        public Map h;

        public static a a(InputStream inputstream)
            throws IOException
        {
            a a1 = new a();
            if (li.a(inputstream) != 0x20150306)
            {
                throw new IOException();
            }
            a1.b = li.c(inputstream);
            a1.c = li.c(inputstream);
            if (a1.c.equals(""))
            {
                a1.c = null;
            }
            a1.d = li.b(inputstream);
            a1.e = li.b(inputstream);
            a1.f = li.b(inputstream);
            a1.g = li.b(inputstream);
            a1.h = li.d(inputstream);
            return a1;
        }

        public final boolean a(OutputStream outputstream)
        {
            li.a(outputstream, 0x20150306);
            li.a(outputstream, b);
            if (c != null)
            {
                break MISSING_BLOCK_LABEL_159;
            }
            Object obj = "";
_L1:
            java.util.Map.Entry entry;
            try
            {
                li.a(outputstream, ((String) (obj)));
                li.a(outputstream, d);
                li.a(outputstream, e);
                li.a(outputstream, f);
                li.a(outputstream, g);
                obj = h;
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream)
            {
                le.b("%s", new Object[] {
                    outputstream.toString()
                });
                return false;
            }
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_167;
            }
            li.a(outputstream, ((Map) (obj)).size());
            for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); li.a(outputstream, (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                li.a(outputstream, (String)entry.getKey());
            }

            break MISSING_BLOCK_LABEL_172;
            obj = c;
              goto _L1
            li.a(outputstream, 0);
            outputstream.flush();
            return true;
        }

        private a()
        {
        }

        public a(String s, z.a a1)
        {
            b = s;
            a = a1.a.length;
            c = a1.b;
            d = a1.c;
            e = a1.d;
            f = a1.e;
            g = a1.f;
            h = a1.g;
        }
    }

    private static final class b extends FilterInputStream
    {

        private int a;

        static int a(b b1)
        {
            return b1.a;
        }

        public final int read()
            throws IOException
        {
            int i = super.read();
            if (i != -1)
            {
                a = a + 1;
            }
            return i;
        }

        public final int read(byte abyte0[], int i, int j)
            throws IOException
        {
            i = super.read(abyte0, i, j);
            if (i != -1)
            {
                a = a + i;
            }
            return i;
        }

 