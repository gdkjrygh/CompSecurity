// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;


// Referenced classes of package dagger.internal:
//            Memoizer, FailoverLoader, ModuleAdapter

class this._cls0 extends Memoizer
{

    final FailoverLoader this$0;

    protected ModuleAdapter create(Class class1)
    {
        ModuleAdapter moduleadapter = (ModuleAdapter)instantiate(class1.getName().concat("$$ModuleAdapter"), class1.getClassLoader());
        if (moduleadapter == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Module adapter for ").append(class1).append(" could not be loaded. ").append("Please ensure that code generation was run for this module.").toString());
        } else
        {
            return moduleadapter;
        }
    }

    protected volatile Object create(Object obj)
    {
        return create((Class)obj);
    }

    ()
    {
        this$0 = FailoverLoader.this;
        super();
    }
}
