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
//            ar, ao, gr, aq, 
//            as

public class ap
{

    private final int nT = 6;
    private final int nU;
    private final ao nV = new ar();
    private Base64OutputStream nW;
    private ByteArrayOutputStream nX;

    public ap(int i)
    {
        nU = i;
    }

    private String m(String s)
    {
        s = s.split("\n");
        if (s == null || s.length == 0)
        {
            return "";
        }
        nX = new ByteArrayOutputStream();
        nW = new Base64OutputStream(nX, 10);
        Arrays.sort(s, new Comparator() {

            final ap nY;

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((String)obj, (String)obj1);
            }

            public int compare(String s1, String s2)
            {
                return s2.length() - s1.length();
            }

            
            {
                nY = ap.this;
                super();
            }
        });
        int i = 0;
        while (i < s.length && i < nU) 
        {
            if (s[i].trim().length() != 0)
            {
                try
                {
                    nW.write(nV.l(s[i]));
                }
                catch (IOException ioexception)
                {
                    gr.b("Error while writing hash to byteStream", ioexception);
                }
            }
            i++;
        }
        try
        {
            nW.flush();
            nW.close();
            s = nX.toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gr.b("HashManager: Unable to convert to base 64", s);
            return "";
        }
        return s;
    }

    public String a(ArrayList arraylist)
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); stringbuffer.append('\n'))
        {
            stringbuffer.append(((String)arraylist.next()).toLowerCase(Locale.US));
        }

        switch (0)
        {
        default:
            return "";

        case 0: // '\0'
            return n(stringbuffer.toString());

        case 1: // '\001'
            return m(stringbuffer.toString());
        }
    }

    String n(String s)
    {
        s = s.split("\n");
        if (s == null || s.length == 0)
        {
            return "";
        }
        nX = new ByteArrayOutputStream();
        nW = new Base64OutputStream(nX, 10);
        PriorityQueue priorityqueue = new PriorityQueue(nU, new Comparator() {

            final ap nY;

            public int a(as.a a2, as.a a3)
            {
                return (int)(a2.value - a3.value);
            }

            public int compare(Object obj, Object obj1)
            {
                return a((as.a)obj, (as.a)obj1);
            }

            
            {
                nY = ap.this;
                super();
            }
        });
        int i = 0;
        while (i < s.length) 
        {
            String as1[] = aq.p(s[i]);
            if (as1.length >= nT)
            {
                as.a(as1, nU, nT, priorityqueue);
            }
            i++;
        }
        for (s = priorityqueue.iterator(); s.hasNext();)
        {
            as.a a1 = (as.a)s.next();
            try
            {
                nW.write(nV.l(a1.oa));
            }
            catch (IOException ioexception)
            {
                gr.b("Error while writing hash to byteStream", ioexception);
            }
        }

        try
        {
            nW.flush();
            nW.close();
            s = nX.toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gr.b("HashManager: unable to convert to base 64", s);
            return "";
        }
        return s;
    }
}
