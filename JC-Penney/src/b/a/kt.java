// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package b.a:
//            kg, ow, ju, jv, 
//            pf, ji, kk

public final class kt extends kg
{

    final List a;
    private final jv c;

    public kt(jv jv1, List list)
    {
        int i = a(list);
        kg kg1 = (kg)list.get(0);
        int j = list.size();
        super(i, kg1.i_() * j + a(list));
        if (jv1 == null)
        {
            throw new NullPointerException("itemType == null");
        } else
        {
            a = list;
            c = jv1;
            return;
        }
    }

    private static int a(List list)
    {
        int i;
        try
        {
            i = Math.max(4, ((kg)list.get(0)).b);
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

    public final jv a()
    {
        return c;
    }

    public final void a(ji ji)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((kg)iterator.next()).a(ji)) { }
    }

    protected final void a(kk kk, int i)
    {
        Iterator iterator;
        boolean flag;
        int j;
        int k;
        j = super.b;
        iterator = a.iterator();
        flag = true;
        i += j;
        j = -1;
        k = -1;
_L2:
        kg kg1;
        int l;
        int i1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_135;
        }
        kg1 = (kg)iterator.next();
        i1 = kg1.i_();
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        l = kg1.b;
        flag = false;
        k = i1;
_L4:
        i = kg1.b(kk, i) + i1;
        j = l;
        if (true) goto _L2; else goto _L1
_L1:
        if (i1 != k)
        {
            throw new UnsupportedOperationException("item size mismatch");
        }
        l = j;
        if (kg1.b == j) goto _L4; else goto _L3
_L3:
        throw new UnsupportedOperationException("item alignment mismatch");
    }

    protected final void a_(ji ji, ow ow1)
    {
        int i = a.size();
        if (ow1.a())
        {
            ow1.a(0, (new StringBuilder()).append(f()).append(" ").append(a().h_()).toString());
            ow1.a(4, (new StringBuilder("  size: ")).append(pf.a(i)).toString());
        }
        ow1.d(i);
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((kg)iterator.next()).a(ji, ow1)) { }
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(100);
        stringbuffer.append(getClass().getName());
        stringbuffer.append(a);
        return stringbuffer.toString();
    }
}
