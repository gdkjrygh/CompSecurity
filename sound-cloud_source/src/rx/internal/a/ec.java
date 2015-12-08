// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.List;
import rx.b.a;

// Referenced classes of package rx.internal.a:
//            ea

final class ec
    implements a
{

    final ea.b a;

    ec(ea.b b)
    {
        a = b;
        super();
    }

    public final void call()
    {
        boolean flag;
        boolean flag1;
label0:
        {
            flag1 = true;
            flag = false;
            obj2 = a;
            synchronized (((ea.b) (obj2)).c)
            {
                if (!((ea.b) (obj2)).e)
                {
                    break label0;
                }
                if (((ea.b) (obj2)).d == null)
                {
                    obj2.d = new ArrayList();
                }
                ((ea.b) (obj2)).d.add(ea.f);
            }
            return;
        }
        obj2.e = true;
        obj;
        JVM INSTR monitorexit ;
        boolean flag2 = ((ea.b) (obj2)).a();
        if (!flag2)
        {
            synchronized (((ea.b) (obj2)).c)
            {
                obj2.e = false;
            }
            return;
        }
        break MISSING_BLOCK_LABEL_102;
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
_L4:
        obj3 = ((ea.b) (obj2)).c;
        obj3;
        JVM INSTR monitorenter ;
        obj1 = ((ea.b) (obj2)).d;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj2.e = false;
        obj3;
        JVM INSTR monitorexit ;
        return;
_L6:
        flag1 = flag;
        obj3;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
_L5:
        if (!flag)
        {
            synchronized (((ea.b) (obj2)).c)
            {
                obj2.e = false;
            }
        }
        throw obj1;
_L2:
        obj2.d = null;
        obj3;
        JVM INSTR monitorexit ;
        flag2 = ((ea.b) (obj2)).a(((List) (obj1)));
        if (flag2) goto _L4; else goto _L3
_L3:
        synchronized (((ea.b) (obj2)).c)
        {
            obj2.e = false;
        }
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        obj1;
        obj3;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
          goto _L5
        obj1;
        flag = false;
          goto _L6
        obj1;
        flag = flag1;
          goto _L6
    }
}
