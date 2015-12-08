// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

// Referenced classes of package com.google.android.gms.internal:
//            zzar, zzao, zzhx, zzaq, 
//            zzas

public class zzap
{
    static class zza
    {

        ByteArrayOutputStream zzoF;
        Base64OutputStream zzoG;

        public String toString()
        {
            String s;
            try
            {
                zzoG.close();
            }
            catch (IOException ioexception)
            {
                zzhx.zzb("HashManager: Unable to convert to Base64.", ioexception);
            }
            zzoF.close();
            s = zzoF.toString();
            zzoF = null;
            zzoG = null;
            return s;
            Object obj;
            obj;
            zzhx.zzb("HashManager: Unable to convert to Base64.", ((Throwable) (obj)));
            zzoF = null;
            zzoG = null;
            return "";
            obj;
            zzoF = null;
            zzoG = null;
            throw obj;
        }

        public void write(byte abyte0[])
        {
            zzoG.write(abyte0);
        }

        public zza()
        {
            zzoF = new ByteArrayOutputStream(4096);
            zzoG = new Base64OutputStream(zzoF, 10);
        }
    }


    private final int zzoA = 6;
    private final int zzoB;
    private final int zzoC = 0;
    private final zzao zzoD = new zzar();

    public zzap(int i)
    {
        zzoB = i;
    }

    private String zzm(String s)
    {
        String as[];
        int i;
        as = s.split("\n");
        if (as.length == 0)
        {
            return "";
        }
        s = zzbz();
        Arrays.sort(as, new Comparator() {

            final zzap zzoE;

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((String)obj, (String)obj1);
            }

            public int compare(String s1, String s2)
            {
                return s2.length() - s1.length();
            }

            
            {
                zzoE = zzap.this;
                super();
            }
        });
        i = 0;
_L2:
        if (i >= as.length || i >= zzoB)
        {
            break; /* Loop/switch isn't completed */
        }
        if (as[i].trim().length() == 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        s.write(zzoD.zzl(as[i]));
        i++;
        if (true) goto _L2; else goto _L1
        IOException ioexception;
        ioexception;
        zzhx.zzb("Error while writing hash to byteStream", ioexception);
_L1:
        return s.toString();
    }

    public String zza(ArrayList arraylist)
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); stringbuffer.append('\n'))
        {
            stringbuffer.append(((String)arraylist.next()).toLowerCase(Locale.US));
        }

        switch (zzoC)
        {
        default:
            return "";

        case 0: // '\0'
            return zzn(stringbuffer.toString());

        case 1: // '\001'
            return zzm(stringbuffer.toString());
        }
    }

    zza zzbz()
    {
        return new zza();
    }

    String zzn(String s)
    {
        Iterator iterator;
        String as[] = s.split("\n");
        if (as.length == 0)
        {
            return "";
        }
        s = zzbz();
        PriorityQueue priorityqueue = new PriorityQueue(zzoB, new Comparator() {

            final zzap zzoE;

            public int compare(Object obj, Object obj1)
            {
                return zza((zzas.zza)obj, (zzas.zza)obj1);
            }

            public int zza(zzas.zza zza2, zzas.zza zza3)
            {
                return (int)(zza2.value - zza3.value);
            }

            
            {
                zzoE = zzap.this;
                super();
            }
        });
        for (int i = 0; i < as.length; i++)
        {
            String as1[] = zzaq.zzp(as[i]);
            if (as1.length >= zzoA)
            {
                zzas.zza(as1, zzoB, zzoA, priorityqueue);
            }
        }

        iterator = priorityqueue.iterator();
_L2:
        zzas.zza zza1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        zza1 = (zzas.zza)iterator.next();
        s.write(zzoD.zzl(zza1.zzoI));
        if (true) goto _L2; else goto _L1
        IOException ioexception;
        ioexception;
        zzhx.zzb("Error while writing hash to byteStream", ioexception);
_L1:
        return s.toString();
    }
}
