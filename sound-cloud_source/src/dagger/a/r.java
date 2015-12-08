// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;


// Referenced classes of package dagger.a:
//            d

public abstract class r
{

    public final boolean complete;
    public final Class includes[];
    public final String injectableTypes[];
    public final boolean library;
    public final Class moduleClass;
    public final boolean overrides;
    public final Class staticInjections[];

    public r(Class class1, String as[], Class aclass[], boolean flag, Class aclass1[], boolean flag1, boolean flag2)
    {
        moduleClass = class1;
        injectableTypes = as;
        staticInjections = aclass;
        overrides = flag;
        includes = aclass1;
        complete = flag1;
        library = flag2;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof r)
        {
            obj = (r)obj;
            return moduleClass.equals(((r) (obj)).moduleClass);
        } else
        {
            return false;
        }
    }

    public void getBindings(d d, Object obj)
    {
    }

    public final int hashCode()
    {
        return moduleClass.hashCode();
    }

    public Object newModule()
    {
        throw new UnsupportedOperationException((new StringBuilder("No no-args constructor on ")).append(getClass().getName()).toString());
    }
}
