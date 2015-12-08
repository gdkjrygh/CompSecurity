// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

// Referenced classes of package com.google.android.gms.internal:
//            o, l, n, p

public final class m
{
    static final class a
    {

        ByteArrayOutputStream a;
        Base64OutputStream b;

        public final void a(byte abyte0[])
            throws IOException
        {
            b.write(abyte0);
        }

        public final String toString()
        {
            String s;
            try
            {
                b.close();
            }
            catch (IOException ioexception)
            {
                com.google.android.gms.ads.internal.util.client.b.b("HashManager: Unable to convert to Base64.", ioexception);
            }
            a.close();
            s = a.toString();
            a = null;
            b = null;
            return s;
            Object obj;
            obj;
            com.google.android.gms.ads.internal.util.client.b.b("HashManager: Unable to convert to Base64.", ((Throwable) (obj)));
            a = null;
            b = null;
            return "";
            obj;
            a = null;
            b = null;
            throw obj;
        }

        public a()
        {
            a = new ByteArrayOutputStream(4096);
            b = new Base64OutputStream(a, 10);
        }
    }


    final int a = 0;
    private final int b = 6;
    private final int c;
    private final l d = new o();

    public m(int i)
    {
        c = i;
    }

    final String a(String s)
    {
        String as[];
        int i;
        as = s.split("\n");
        if (as.length == 0)
        {
            return "";
        }
        s = new a();
        Arrays.sort(as, new Comparator() {

            final m a;

            public final int compare(Object obj, Object obj1)
            {
                obj = (String)obj;
                return ((String)obj1).length() - ((String) (obj)).length();
            }

            
            {
                a = m.this;
                super();
            }
        });
        i = 0;
_L2:
        if (i >= as.length || i >= c)
        {
            break; /* Loop/switch isn't completed */
        }
        if (as[i].trim().length() == 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        s.a(d.a(as[i]));
        i++;
        if (true) goto _L2; else goto _L1
        IOException ioexception;
        ioexception;
        com.google.android.gms.ads.internal.util.client.b.b("Error while writing hash to byteStream", ioexception);
_L1:
        return s.toString();
    }

    final String b(String s)
    {
        Iterator iterator;
        String as[] = s.split("\n");
        if (as.length == 0)
        {
            return "";
        }
        s = new a();
        PriorityQueue priorityqueue = new PriorityQueue(c, new Comparator() {

            final m a;

            public final int compare(Object obj, Object obj1)
            {
                obj = (p.a)obj;
                obj1 = (p.a)obj1;
                return (int)(((p.a) (obj)).a - ((p.a) (obj1)).a);
            }

            
            {
                a = m.this;
                super();
            }
        });
        for (int i = 0; i < as.length; i++)
        {
            String as1[] = com.google.android.gms.internal.n.b(as[i]);
            if (as1.length >= b)
            {
                p.a(as1, c, b, priorityqueue);
            }
        }

        iterator = priorityqueue.iterator();
_L2:
        p.a a1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = (p.a)iterator.next();
        s.a(d.a(a1.b));
        if (true) goto _L2; else goto _L1
        IOException ioexception;
        ioexception;
        com.google.android.gms.ads.internal.util.client.b.b("Error while writing hash to byteStream", ioexception);
_L1:
        return s.toString();
    }
}
