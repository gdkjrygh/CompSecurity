// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;

public final class gbz
{

    public EnumSet a;
    public EnumSet b;
    ArrayList c;
    public Runnable d;
    private Handler e;

    public gbz(Class class1)
    {
        e = new Handler();
        c = new ArrayList();
        d = new Runnable() {

            private gbz a;

            public final void run()
            {
                EnumSet enumset;
                EnumSet enumset1;
                synchronized (a.d)
                {
                    enumset1 = a.a.clone();
                    enumset = a.b;
                    a.a = a.b;
                    a.b = null;
                }
                EnumSet enumset2 = enumset1.clone();
                enumset2.retainAll(enumset);
                obj = enumset1.clone();
                ((EnumSet) (obj)).addAll(enumset);
                ((EnumSet) (obj)).removeAll(enumset2);
                if (!((EnumSet) (obj)).isEmpty())
                {
                    Iterator iterator = a.c.iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        gca gca1 = (gca)iterator.next();
                        EnumSet enumset3 = gca1.a;
                        if (enumset3 == null || EnumSet.complementOf(enumset3).addAll(((java.util.Collection) (obj))))
                        {
                            gca1.a(enumset, ((EnumSet) (obj)));
                        }
                    } while (true);
                }
                break MISSING_BLOCK_LABEL_161;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = gbz.this;
                super();
            }
        };
        a = EnumSet.noneOf(class1);
    }

    public final void a()
    {
        if (b != null)
        {
            e.removeCallbacks(d);
            d.run();
        }
    }

    public final void a(gca gca)
    {
        c.add(gca);
    }

    public final void a(Enum enum, boolean flag)
    {
        Runnable runnable = d;
        runnable;
        JVM INSTR monitorenter ;
        if (b == null) goto _L2; else goto _L1
_L1:
        EnumSet enumset = EnumSet.copyOf(b);
_L8:
        if (!flag) goto _L4; else goto _L3
_L3:
        flag = enumset.add(enum);
_L6:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        a(enumset);
        runnable;
        JVM INSTR monitorexit ;
        return;
_L2:
        enumset = EnumSet.copyOf(a);
        continue; /* Loop/switch isn't completed */
_L4:
        flag = enumset.remove(enum);
        if (true) goto _L6; else goto _L5
_L5:
        enum;
        runnable;
        JVM INSTR monitorexit ;
        throw enum;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(EnumSet enumset)
    {
        if (b == null)
        {
            b = enumset;
            e.post(d);
            return;
        }
        if (enumset.equals(a))
        {
            b = null;
            e.removeCallbacks(d);
            return;
        } else
        {
            b = enumset;
            return;
        }
    }

    public final void b(gca gca)
    {
        c.remove(gca);
    }
}
