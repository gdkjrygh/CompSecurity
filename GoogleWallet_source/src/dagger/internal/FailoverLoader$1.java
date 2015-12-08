// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;


// Referenced classes of package dagger.internal:
//            Memoizer, FailoverLoader, ModuleAdapter

class this._cls0 extends Memoizer
{

    final FailoverLoader this$0;

    private ModuleAdapter create(Class class1)
    {
        ModuleAdapter moduleadapter = (ModuleAdapter)instantiate(class1.getName().concat("$$ModuleAdapter"), class1.getClassLoader());
        if (moduleadapter == null)
        {
            class1 = String.valueOf(class1);
            throw new IllegalStateException((new StringBuilder(String.valueOf(class1).length() + 100)).append("Module adapter for ").append(class1).append(" could not be loaded. Please ensure that code generation was run for this module.").toString());
        } else
        {
            return moduleadapter;
        }
    }

    protected final volatile Object create(Object obj)
    {
        return create((Class)obj);
    }

    ()
    {
        this$0 = FailoverLoader.this;
        super();
    }
}
