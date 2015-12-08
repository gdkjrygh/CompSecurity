// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public final class adA extends ado
{

    private final adh a;
    private List b;

    public adA(adh adh, List list)
    {
        int i = a(list);
        ado ado1 = (ado)list.get(0);
        int j = list.size();
        super(i, ado1.ah_() * j + a(list));
        if (adh == null)
        {
            throw new NullPointerException("itemType == null");
        } else
        {
            b = list;
            a = adh;
            return;
        }
    }

    private static int a(List list)
    {
        int i;
        try
        {
            i = Math.max(4, ((ado)list.get(0)).g);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new IllegalArgumentException("items.size() == 0");
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new NullPointerException("items == null");
        }
        return i;
    }

    public final adh a()
    {
        return a;
    }

    public final void a(acU acu)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ado)iterator.next()).a(acu)) { }
    }

    protected final void a(adr adr, int i)
    {
        Iterator iterator;
        boolean flag;
        int j;
        int k;
        j = super.g;
        iterator = b.iterator();
        k = 0;
        flag = true;
        i += j;
        j = 0;
_L2:
        ado ado1;
        int l;
        int i1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_135;
        }
        ado1 = (ado)iterator.next();
        i1 = ado1.ah_();
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        l = ado1.g;
        k = i1;
        flag = false;
_L4:
        i = ado1.b(adr, i) + i1;
        j = l;
        if (true) goto _L2; else goto _L1
_L1:
        if (i1 != k)
        {
            throw new UnsupportedOperationException("item size mismatch");
        }
        l = j;
        if (ado1.g == j) goto _L4; else goto _L3
_L3:
        throw new UnsupportedOperationException("item alignment mismatch");
    }

    protected final void a_(acU acu, aeG aeg)
    {
        aeg.d(b.size());
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ado)iterator.next()).a(acu, aeg)) { }
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(100);
        stringbuffer.append(getClass().getName());
        stringbuffer.append(b);
        return stringbuffer.toString();
    }
}
