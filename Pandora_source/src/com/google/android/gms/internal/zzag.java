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
//            zzai, zzaf, zzah, zzaj

public class zzag
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


    private final zzaf zzpA = new zzai();
    private final int zzpx = 6;
    private final int zzpy;
    private final int zzpz = 0;

    public zzag(int i)
    {
        zzpy = i;
    }

    private String zzo(String s)
    {
        String as[];
        int i;
        as = s.split("\n");
        if (as.length == 0)
        {
            return "";
        }
        s = zzbF();
        Arrays.sort(as, new Comparator() {

            final zzag a;

            public int a(String s1, String s2)
            {
                return s2.length() - s1.length();
            }

            public int compare(Object obj, Object obj1)
            {
                return a((String)obj, (String)obj1);
            }

            
            {
                a = zzag.this;
                super();
            }
        });
        i = 0;
_L2:
        if (i >= as.length || i >= zzpy)
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
        s.a(zzpA.zzn(as[i]));
          goto _L3
        IOException ioexception;
        ioexception;
        zzb.zzb("Error while writing hash to byteStream", ioexception);
        return s.toString();
    }

    public String zza(ArrayList arraylist)
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); stringbuffer.append('\n'))
        {
            stringbuffer.append(((String)arraylist.next()).toLowerCase(Locale.US));
        }

        switch (zzpz)
        {
        default:
            return "";

        case 0: // '\0'
            return zzp(stringbuffer.toString());

        case 1: // '\001'
            return zzo(stringbuffer.toString());
        }
    }

    a zzbF()
    {
        return new a();
    }

    String zzp(String s)
    {
        Iterator iterator;
        String as[] = s.split("\n");
        if (as.length == 0)
        {
            return "";
        }
        s = zzbF();
        PriorityQueue priorityqueue = new PriorityQueue(zzpy, new Comparator() {

            final zzag a;

            public int a(zzaj.zza zza2, zzaj.zza zza3)
            {
                return (int)(zza2.value - zza3.value);
            }

            public int compare(Object obj, Object obj1)
            {
                return a((zzaj.zza)obj, (zzaj.zza)obj1);
            }

            
            {
                a = zzag.this;
                super();
            }
        });
        int i = 0;
        while (i < as.length) 
        {
            String as1[] = zzah.zzr(as[i]);
            if (as1.length >= zzpx)
            {
                zzaj.zza(as1, zzpy, zzpx, priorityqueue);
            }
            i++;
        }
        iterator = priorityqueue.iterator();
_L2:
        zzaj.zza zza1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        zza1 = (zzaj.zza)iterator.next();
        s.a(zzpA.zzn(zza1.zzpF));
        if (true) goto _L2; else goto _L1
        IOException ioexception;
        ioexception;
        zzb.zzb("Error while writing hash to byteStream", ioexception);
_L1:
        return s.toString();
    }
}
