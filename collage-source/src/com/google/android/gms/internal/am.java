// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

// Referenced classes of package com.google.android.gms.internal:
//            ao, al, an, ap

public class am
{
    static class a
    {

        ByteArrayOutputStream a;
        Base64OutputStream b;

        public void a(byte abyte0[])
            throws IOException
        {
            b.write(abyte0);
        }

        public String toString()
        {
            String s;
            try
            {
                b.close();
            }
            catch (IOException ioexception)
            {
                zzb.zzb("HashManager: Unable to convert to Base64.", ioexception);
            }
            a.close();
            s = a.toString();
            a = null;
            b = null;
            return s;
            Object obj;
            obj;
            zzb.zzb("HashManager: Unable to convert to Base64.", ((Throwable) (obj)));
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


    private final int a = 6;
    private final int b;
    private final int c = 0;
    private final al d = new ao();

    public am(int i)
    {
        b = i;
    }

    private String b(String s)
    {
        String as[];
        int i;
        as = s.split("\n");
        if (as.length == 0)
        {
            return "";
        }
        s = a();
        Arrays.sort(as, new Comparator() {

            final am a;

            public int a(String s1, String s2)
            {
                return s2.length() - s1.length();
            }

            public int compare(Object obj, Object obj1)
            {
                return a((String)obj, (String)obj1);
            }

            
            {
                a = am.this;
                super();
            }
        });
        i = 0;
_L2:
        if (i >= as.length || i >= b)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        if (as[i].trim().length() != 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        s.a(d.a(as[i]));
          goto _L3
        IOException ioexception;
        ioexception;
        zzb.zzb("Error while writing hash to byteStream", ioexception);
        return s.toString();
    }

    a a()
    {
        return new a();
    }

    String a(String s)
    {
        Iterator iterator;
        String as[] = s.split("\n");
        if (as.length == 0)
        {
            return "";
        }
        s = a();
        PriorityQueue priorityqueue = new PriorityQueue(b, new Comparator() {

            final am a;

            public int a(ap.a a2, ap.a a3)
            {
                return (int)(a2.a - a3.a);
            }

            public int compare(Object obj, Object obj1)
            {
                return a((ap.a)obj, (ap.a)obj1);
            }

            
            {
                a = am.this;
                super();
            }
        });
        int i = 0;
        while (i < as.length) 
        {
            String as1[] = an.b(as[i]);
            if (as1.length >= a)
            {
                ap.a(as1, b, a, priorityqueue);
            }
            i++;
        }
        iterator = priorityqueue.iterator();
_L2:
        ap.a a1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = (ap.a)iterator.next();
        s.a(d.a(a1.b));
        if (true) goto _L2; else goto _L1
        IOException ioexception;
        ioexception;
        zzb.zzb("Error while writing hash to byteStream", ioexception);
_L1:
        return s.toString();
    }

    public String a(ArrayList arraylist)
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); stringbuffer.append('\n'))
        {
            stringbuffer.append(((String)arraylist.next()).toLowerCase(Locale.US));
        }

        switch (c)
        {
        default:
            return "";

        case 0: // '\0'
            return a(stringbuffer.toString());

        case 1: // '\001'
            return b(stringbuffer.toString());
        }
    }
}
