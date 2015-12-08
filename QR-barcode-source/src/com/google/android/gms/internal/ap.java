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
import java.util.PriorityQueue;

// Referenced classes of package com.google.android.gms.internal:
//            ar, ao, gs, aq, 
//            as

public class ap
{

    private final int nJ = 6;
    private final int nK;
    private final ao nL = new ar();
    private Base64OutputStream nM;
    private ByteArrayOutputStream nN;

    public ap(int i)
    {
        nK = i;
    }

    private String m(String s)
    {
        s = s.split("\n");
        if (s == null || s.length == 0)
        {
            return "";
        }
        nN = new ByteArrayOutputStream();
        nM = new Base64OutputStream(nN, 10);
        Arrays.sort(s, new Comparator() {

            final ap nO;

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((String)obj, (String)obj1);
            }

            public int compare(String s1, String s2)
            {
                return s2.length() - s1.length();
            }

            
            {
                nO = ap.this;
                super();
            }
        });
        int i = 0;
        while (i < s.length && i < nK) 
        {
            if (s[i].trim().length() != 0)
            {
                try
                {
                    nM.write(nL.l(s[i]));
                }
                catch (IOException ioexception)
                {
                    gs.b("Error while writing hash to byteStream", ioexception);
                }
            }
            i++;
        }
        try
        {
            nM.flush();
            nM.close();
            s = nN.toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gs.b("HashManager: Unable to convert to base 64", s);
            return "";
        }
        return s;
    }

    public String a(ArrayList arraylist)
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); stringbuffer.append('\n'))
        {
            stringbuffer.append(((String)arraylist.next()).toLowerCase());
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
        nN = new ByteArrayOutputStream();
        nM = new Base64OutputStream(nN, 10);
        PriorityQueue priorityqueue = new PriorityQueue(nK, new Comparator() {

            final ap nO;

            public int a(as.a a2, as.a a3)
            {
                return (int)(a2.value - a3.value);
            }

            public int compare(Object obj, Object obj1)
            {
                return a((as.a)obj, (as.a)obj1);
            }

            
            {
                nO = ap.this;
                super();
            }
        });
        int i = 0;
        while (i < s.length) 
        {
            String as1[] = aq.p(s[i]);
            if (as1.length >= nJ)
            {
                as.a(as1, nK, nJ, priorityqueue);
            }
            i++;
        }
        for (s = priorityqueue.iterator(); s.hasNext();)
        {
            as.a a1 = (as.a)s.next();
            try
            {
                nM.write(nL.l(a1.nQ));
            }
            catch (IOException ioexception)
            {
                gs.b("Error while writing hash to byteStream", ioexception);
            }
        }

        try
        {
            nM.flush();
            nM.close();
            s = nN.toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gs.b("HashManager: unable to convert to base 64", s);
            return "";
        }
        return s;
    }
}
