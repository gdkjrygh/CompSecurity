// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.b;
import com.android.volley.x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class d
    implements com.android.volley.b
{
    private static final class a
    {

        public long a;
        public String b;
        public String c;
        public long d;
        public long e;
        public long f;
        public Map g;

        public static a a(InputStream inputstream)
        {
            a a1 = new a();
            inputstream = new ObjectInputStream(inputstream);
            if (inputstream.readByte() != 2)
            {
                throw new IOException();
            }
            a1.b = inputstream.readUTF();
            a1.c = inputstream.readUTF();
            if (a1.c.equals(""))
            {
                a1.c = null;
            }
            a1.d = inputstream.readLong();
            a1.e = inputstream.readLong();
            a1.f = inputstream.readLong();
            a1.g = a(((ObjectInputStream) (inputstream)));
            return a1;
        }

        private static Map a(ObjectInputStream objectinputstream)
        {
            int j = objectinputstream.readInt();
            Object obj;
            int i;
            if (j == 0)
            {
                obj = Collections.emptyMap();
            } else
            {
                obj = new HashMap(j);
            }
            for (i = 0; i < j; i++)
            {
                ((Map) (obj)).put(objectinputstream.readUTF().intern(), objectinputstream.readUTF().intern());
            }

            return ((Map) (obj));
        }

        private static void a(Map map, ObjectOutputStream objectoutputstream)
        {
            if (map != null)
            {
                objectoutputstream.writeInt(map.size());
                java.util.Map.Entry entry;
                for (map = map.entrySet().iterator(); map.hasNext(); objectoutputstream.writeUTF((String)entry.getValue()))
                {
                    entry = (java.util.Map.Entry)map.next();
                    objectoutputstream.writeUTF((String)entry.getKey());
                }

            } else
            {
                objectoutputstream.writeInt(0);
            }
        }

        public final boolean a(OutputStream outputstream)
        {
            ObjectOutputStream objectoutputstream;
            objectoutputstream = new ObjectOutputStream(outputstream);
            objectoutputstream.writeByte(2);
            objectoutputstream.writeUTF(b);
            if (c != null)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            outputstream = "";
_L1:
            try
            {
                objectoutputstream.writeUTF(outputstream);
                objectoutputstream.writeLong(d);
                objectoutputstream.writeLong(e);
                objectoutputstream.writeLong(f);
                a(g, objectoutputstream);
                objectoutputstream.flush();
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream)
            {
                x.b("%s", new Object[] {
                    outputstream.toString()
                });
                return false;
            }
            return true;
            outputstream = c;
              goto _L1
        }

        private a()
        {
        }

        public a(String s, com.android.volley.b.a a1)
        {
            b = s;
          