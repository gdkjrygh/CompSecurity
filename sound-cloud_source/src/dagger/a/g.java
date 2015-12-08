// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;


// Referenced classes of package dagger.a:
//            q, f, r

final class g extends q
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    protected final Object a(Object obj)
    {
        obj = (Class)obj;
        r r1 = (r)a.a(((Class) (obj)).getName().concat("$$ModuleAdapter"), ((Class) (obj)).getClassLoader());
        if (r1 == null)
        {
            throw new IllegalStateException((new StringBuilder("Module adapter for ")).append(obj).append(" could not be loaded. Please ensure that code generation was run for this module.").toString());
        } else
        {
            return r1;
        }
    }
}
