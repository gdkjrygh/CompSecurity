// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Base64OutputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public final class can
{

    private final int a;
    private final cam b = new caq();

    public can(int i)
    {
        a = i;
    }

    final String a(String s)
    {
        Iterator iterator;
        String as[] = s.split("\n");
        if (as.length == 0)
        {
            return "";
        }
        s = new cao();
        PriorityQueue priorityqueue = new PriorityQueue(a, new Comparator() {

            public final int compare(Object obj, Object obj1)
            {
                obj = (cas)obj;
                obj1 = (cas)obj1;
                return (int)(((cas) (obj)).a - ((cas) (obj1)).a);
            }

        });
        for (int i = 0; i < as.length; i++)
        {
            String as1[] = cap.b(as[i]);
            if (as1.length >= 6)
            {
                car.a(as1, a, priorityqueue);
            }
        }

        iterator = priorityqueue.iterator();
_L2:
        cas cas1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cas1 = (cas)iterator.next();
        byte abyte0[] = b.a(cas1.b);
        ((cao) (s)).a.write(abyte0);
        if (true) goto _L2; else goto _L1
        IOException ioexception;
        ioexception;
        bka.b("Error while writing hash to byteStream", ioexception);
_L1:
        return s.toString();
    }
}
