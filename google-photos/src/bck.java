// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class bck extends qst
{

    private static Map b = new WeakHashMap();
    public List a;

    public bck()
    {
        super("stts");
        a = Collections.emptyList();
    }

    public static long[] a(List list)
    {
        bck;
        JVM INSTR monitorenter ;
        Object obj = (SoftReference)b.get(list);
        if (obj == null) goto _L2; else goto _L1
_L1:
        long al[] = (long[])((SoftReference) (obj)).get();
        if (al == null) goto _L2; else goto _L3
_L3:
        list = al;
_L9:
        bck;
        JVM INSTR monitorexit ;
        return list;
_L2:
        al = list.iterator();
        long l = 0L;
        while (al.hasNext()) 
        {
            l = ((bcl)al.next()).a + l;
        }
        Iterator iterator;
        al = new long[(int)l];
        iterator = list.iterator();
        int i = 0;
_L7:
        bcl bcl1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        bcl1 = (bcl)iterator.next();
        int j = 0;
_L5:
        if ((long)j >= bcl1.a)
        {
            break; /* Loop/switch isn't completed */
        }
        al[i] = bcl1.b;
        j++;
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L7; else goto _L6
_L6:
        b.put(list, new SoftReference(al));
        list = al;
        if (true) goto _L9; else goto _L8
_L8:
        list;
        throw list;
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        int j = b.f(b.a(bytebuffer));
        a = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            a.add(new bcl(b.a(bytebuffer), b.a(bytebuffer)));
        }

    }

    protected final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        bax.b(bytebuffer, a.size());
        bcl bcl1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); bax.b(bytebuffer, bcl1.b))
        {
            bcl1 = (bcl)iterator.next();
            bax.b(bytebuffer, bcl1.a);
        }

    }

    protected final long e()
    {
        return (long)((a.size() << 3) + 8);
    }

    public String toString()
    {
        int i = a.size();
        return (new StringBuilder(39)).append("TimeToSampleBox[entryCount=").append(i).append("]").toString();
    }

}
