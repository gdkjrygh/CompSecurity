// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.am;

import android.os.SystemClock;
import com.google.android.m4b.maps.a.b;
import com.google.android.m4b.maps.a.s;
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

public final class c
    implements com.google.android.m4b.maps.a.b
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
        {
            a a1 = new a();
            if (c.a(inputstream) != 0x20150306)
            {
                throw new IOException();
            }
            a1.b = c.c(inputstream);
            a1.c = c.c(inputstream);
            if (a1.c.equals(""))
            {
                a1.c = null;
            }
            a1.d = com.google.android.m4b.maps.am.c.b(inputstream);
            a1.e = com.google.android.m4b.maps.am.c.b(inputstream);
            a1.f = com.google.android.m4b.maps.am.c.b(inputstream);
            a1.g = com.google.android.m4b.maps.am.c.b(inputstream);
            a1.h = c.d(inputstream);
            return a1;
        }

        public final boolean a(OutputStream outputstream)
        {
            c.a(outputstream, 0x20150306);
            c.a(outputstream, b);
            if (c != null)
            {
                break MISSING_BLOCK_LABEL_159;
            }
            Object obj = "";
_L1:
            java.util.Map.Entry entry;
            try
            {
                c.a(outputstream, ((String) (obj)));
                c.a(outputstream, d);
                c.a(outputstream, e);
                c.a(outputstream, f);
                c.a(outputstream, g);
                obj = h;
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream)
            {
                s.b("%s", new Object[] {
                    outputstream.toString()
                });
                return false;
            }
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_167;
            }
            c.a(outputstream, ((Map) (obj)).size());
            for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); c.a(outputstream, (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                c.a(outputstream, (String)entry.getKey());
            }

            break MISSING_BLOCK_LABEL_172;
            obj = c;
              goto _L1
            c.a(outputstream, 0);
            outputstream.flush();
            return true;
        }

        private a()
        {
        }

        public a(String s1, com.google.android.m4b.maps.a.b.a a1)
        {
            b = s1;
            a = a1.a.length;
            c = a1.b;
            d = a1.c;
            e = a1.d;
            f = a1.e;
            g = a1.f;
            h = a1.g;
        }
    }

    static final class b extends FilterInputStream
    {

        private int a;

        static int a(b b1)
        {
            return b1.a;
        }

        public final int read()
        {
            int i = super.read();
            if (i != -1)
            {
                a = a + 1;
            }
            return i;
        }

        public final int read(byte abyte0[], int i, int j)
        {
            i = super.read(abyte0, i, j);
            if (i != -1)
            {
                a =