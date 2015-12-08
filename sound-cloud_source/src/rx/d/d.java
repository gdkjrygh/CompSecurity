// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.d;

import rx.P;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.internal.a.g;

public final class d
    implements P
{
    static final class a
    {

        Object a[];
        int b;

        public final void a(Object obj)
        {
            Object aobj[];
            int i;
            i = b;
            aobj = a;
            if (aobj != null) goto _L2; else goto _L1
_L1:
            aobj = new Object[16];
            a = aobj;
_L4:
            aobj[i] = obj;
            b = i + 1;
            return;
_L2:
            if (i == aobj.length)
            {
                Object aobj1[] = new Object[(i >> 2) + i];
                System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
                a = aobj1;
                aobj = aobj1;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        a()
        {
        }
    }


    private final P a;
    private boolean b;
    private volatile boolean c;
    private a d;
    private final g e = g.a();

    public d(P p)
    {
        a = p;
    }

    public final void onCompleted()
    {
        if (c)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        a a2;
        c = true;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        a2 = d;
        a a1;
        a1 = a2;
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        a1 = new a();
        d = a1;
        a1.a(g.b());
        this;
        JVM INSTR monitorexit ;
        return;
        b = true;
        this;
        JVM INSTR monitorexit ;
        a.onCompleted();
        return;
    }

    public final void onError(Throwable throwable)
    {
        Exceptions.throwIfFatal(throwable);
        if (c)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        throwable;
        this;
        JVM INSTR monitorexit ;
        throw throwable;
        a a2;
        c = true;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        a2 = d;
        a a1;
        a1 = a2;
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        a1 = new a();
        d = a1;
        a1.a(g.a(throwable));
        this;
        JVM INSTR monitorexit ;
        return;
        b = true;
        this;
        JVM INSTR monitorexit ;
        a.onError(throwable);
        return;
    }

    public final void onNext(Object obj)
    {
        if (c)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        a a1;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        a1 = d;
        Object obj1;
        obj1 = a1;
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        obj1 = new a();
        d = ((a) (obj1));
        ((a) (obj1)).a(g.a(obj));
        this;
        JVM INSTR monitorexit ;
        return;
        b = true;
        this;
        JVM INSTR monitorexit ;
        int i;
        try
        {
            a.onNext(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            c = true;
            Exceptions.throwIfFatal(((Throwable) (obj1)));
            a.onError(OnErrorThrowable.addValueAsLastCause(((Throwable) (obj1)), obj));
            return;
        }
_L4:
        i = 0;
_L2:
        if (i >= 1024)
        {
            continue; /* Loop/switch isn't completed */
        }
        this;
        JVM INSTR monitorenter ;
        obj1 = d;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        b = false;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        d = null;
        this;
        JVM INSTR monitorexit ;
        Object aobj[] = ((a) (obj1)).a;
        int k = aobj.length;
        int j = 0;
        do
        {
            if (j >= k)
            {
                break;
            }
            Object obj2 = aobj[j];
            if (obj2 == null)
            {
                break;
            }
            try
            {
                if (g.a(a, obj2))
                {
                    c = true;
                    return;
                }
            }
            catch (Throwable throwable)
            {
                c = true;
                Exceptions.throwIfFatal(throwable);
                a.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                return;
            }
            j++;
        } while (true);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
    }
}
