// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import java.io.File;
import java.lang.reflect.InvocationHandler;

// Referenced classes of package b.a:
//            dd, ps

public final class da
{

    private File a;

    public da(Context context)
    {
        a = null;
        a = context.getDir("dx", 0);
        if (!a.isDirectory())
        {
            throw new dd("dxDir is not a directory!", (byte)0);
        } else
        {
            return;
        }
    }

    public final Object a(Class class1, InvocationHandler invocationhandler, Class aclass[], Object aobj[])
    {
        Class aclass1[];
        aclass1 = aclass;
        if (aclass == null)
        {
            aclass1 = new Class[0];
        }
        aclass = ((Class []) (aobj));
        if (aobj == null)
        {
            aclass = ((Class []) (new Object[0]));
        }
        class1;
        JVM INSTR monitorenter ;
        invocationhandler = ((InvocationHandler) (ps.a(class1).a(a).a(invocationhandler).a(aclass1).a(aclass).a()));
        class1;
        JVM INSTR monitorexit ;
        return invocationhandler;
        invocationhandler;
        throw invocationhandler;
    }
}
