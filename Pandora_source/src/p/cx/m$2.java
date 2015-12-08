// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p.df.a;

// Referenced classes of package p.cx:
//            m, h, d

static final class .Object
    implements Runnable
{

    final d a;
    final Object b[];

    public void run()
    {
        Object obj;
        Class class1;
        class1 = a.getClass();
        p.df.a.c("ExceptionHandler", (new StringBuilder()).append("Retrying Api Request: ").append(class1.getSimpleName()).toString());
        if (!(a instanceof h))
        {
            break MISSING_BLOCK_LABEL_88;
        }
        obj = ((h)a).b();
_L1:
        class1.getMethod("execute", new Class[] {
            [Ljava/lang/Object;
        }).invoke(obj, new Object[] {
            b
        });
        return;
        try
        {
            obj = class1.getConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            p.cx.m.a(nosuchmethodexception);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            p.cx.m.a(illegalargumentexception);
            return;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            p.cx.m.a(illegalaccessexception);
            return;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            p.cx.m.a(invocationtargetexception);
            return;
        }
        catch (InstantiationException instantiationexception)
        {
            p.cx.m.a(instantiationexception);
            return;
        }
          goto _L1
    }

    .Object(d d, Object aobj[])
    {
        a = d;
        b = aobj;
        super();
    }
}
