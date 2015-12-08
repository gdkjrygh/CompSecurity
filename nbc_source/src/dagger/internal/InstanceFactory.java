// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;


// Referenced classes of package dagger.internal:
//            Factory

public final class InstanceFactory
    implements Factory
{

    private final Object instance;

    private InstanceFactory(Object obj)
    {
        instance = obj;
    }

    public static Factory create(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            return new InstanceFactory(obj);
        }
    }

    public Object get()
    {
        return instance;
    }
}
