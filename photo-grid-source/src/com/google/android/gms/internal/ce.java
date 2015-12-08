// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

// Referenced classes of package com.google.android.gms.internal:
//            cj, ch, cf, cd, 
//            cg, ci, ck, cl

public final class ce
{

    private final int a = 6;
    private final int b;
    private final int c = 0;
    private final cd d = new cj();

    public ce(int i)
    {
        b = i;
    }

    private String a(String s)
    {
        String as[];
        int i;
        as = s.split("\n");
        if (as.length == 0)
        {
            return "";
        }
        s = new ch();
        Arrays.sort(as, new cf(this));
        i = 0;
_L2:
        if (i >= as.length || i >= b)
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
        zzb.zzb("Error while writing hash to byteStream", ioexception);
_L1:
        return s.toString();
    }

    private String b(String s)
    {
        Iterator iterator;
        String as[] = s.split("\n");
        if (as.length == 0)
        {
            return "";
        }
        s = new ch();
        PriorityQueue priorityqueue = new PriorityQueue(b, new cg(this));
        for (int i = 0; i < as.length; i++)
        {
            String as1[] = ci.b(as[i]);
            if (as1.length >= a)
            {
                ck.a(as1, b, a, priorityqueue);
            }
        }

        iterator = priorityqueue.iterator();
_L2:
        cl cl1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cl1 = (cl)iterator.next();
        s.a(d.a(cl1.b));
        if (true) goto _L2; else goto _L1
        IOException ioexception;
        ioexception;
        zzb.zzb("Error while writing hash to byteStream", ioexception);
_L1:
        return s.toString();
    }

    public final String a(ArrayList arraylist)
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
            return b(stringbuffer.toString());

        case 1: // '\001'
            return a(stringbuffer.toString());
        }
    }
}
