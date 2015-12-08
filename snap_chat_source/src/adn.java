// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public final class adn extends adr
{
    static final class a extends Enum
    {

        private static final int a[] = {
            1, 2, 3
        };

        public static int[] a()
        {
            return (int[])a.clone();
        }

    }


    private static final Comparator e = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (ado)obj;
            obj1 = (ado)obj1;
            return ((ado) (obj)).a().compareTo(((ado) (obj1)).a());
        }

    };
    final ArrayList a = new ArrayList(100);
    private final HashMap f = new HashMap(100);
    private final int g;
    private int h;

    public adn(acU acu, int i, int j)
    {
        super(acu, i);
        g = j;
        h = -1;
    }

    public final int a(adg adg)
    {
        return ((ado)adg).d();
    }

    public final Collection a()
    {
        return a;
    }

    public final void a(ado ado1)
    {
        h();
        try
        {
            if (ado1.g > super.c)
            {
                throw new IllegalArgumentException("incompatible item alignment");
            }
        }
        // Misplaced declaration of an exception variable
        catch (ado ado1)
        {
            throw new NullPointerException("item == null");
        }
        a.add(ado1);
    }

    protected final void a_(aeG aeg)
    {
        acU acu = super.b;
        Iterator iterator = a.iterator();
        ado ado1;
        int i;
        int j;
        for (i = 0; iterator.hasNext(); i = ado1.ah_() + j)
        {
            ado1 = (ado)iterator.next();
            j = ado1.g - 1;
            int k = ~j & i + j;
            j = i;
            if (i != k)
            {
                aeg.g(k - i);
                j = k;
            }
            ado1.a(acu, aeg);
        }

        if (i != h)
        {
            throw new RuntimeException("output size mismatch");
        } else
        {
            return;
        }
    }

    public final int ai_()
    {
        g();
        return h;
    }

    public final ado b(ado ado1)
    {
        h();
        ado ado2 = (ado)f.get(ado1);
        if (ado2 != null)
        {
            return ado2;
        } else
        {
            a(ado1);
            f.put(ado1, ado1);
            return ado1;
        }
    }

    protected final void c()
    {
        acU acu = super.b;
        int i = 0;
        do
        {
            int j = a.size();
            if (i < j)
            {
                while (i < j) 
                {
                    ((ado)a.get(i)).a(acu);
                    i++;
                }
            } else
            {
                return;
            }
        } while (true);
    }

    public final void d()
    {
        g();
        static final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[a.a().length];
                try
                {
                    a[2] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[g - 1];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 130
    //                   2 140;
           goto _L1 _L2 _L3
_L1:
        int i;
        int j;
        int k;
        k = a.size();
        i = 0;
        j = 0;
_L7:
        ado ado1;
        int l;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        ado1 = (ado)a.get(i);
        try
        {
            l = ado1.b(this, j);
        }
        catch (RuntimeException runtimeexception)
        {
            throw aeM.a(runtimeexception, (new StringBuilder("...while placing ")).append(ado1).toString());
        }
        if (l >= j) goto _L5; else goto _L4
_L4:
        throw new RuntimeException((new StringBuilder("bogus place() result for ")).append(ado1).toString());
_L2:
        Collections.sort(a);
        continue; /* Loop/switch isn't completed */
_L3:
        Collections.sort(a, e);
        continue; /* Loop/switch isn't completed */
_L5:
        j = ado1.ah_();
        j = l + j;
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        h = j;
        return;
        if (true) goto _L1; else goto _L8
_L8:
    }

}
