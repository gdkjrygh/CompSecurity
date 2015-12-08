// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package dagger.internal:
//            Factory, a

public final class SetFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private static final String ARGUMENTS_MUST_BE_NON_NULL = "SetFactory.create() requires its arguments to be non-null";
    private final List contributingProviders;

    private SetFactory(List list)
    {
        contributingProviders = list;
    }

    public static Factory create(Factory factory)
    {
        if (!$assertionsDisabled && factory == null)
        {
            throw new AssertionError("SetFactory.create() requires its arguments to be non-null");
        } else
        {
            return factory;
        }
    }

    public static transient Factory create(Provider aprovider[])
    {
        if (!$assertionsDisabled && aprovider == null)
        {
            throw new AssertionError("SetFactory.create() requires its arguments to be non-null");
        }
        aprovider = Arrays.asList(aprovider);
        if (!$assertionsDisabled && aprovider.contains(null))
        {
            throw new AssertionError("Codegen error?  Null within provider list.");
        }
        if (!$assertionsDisabled && hasDuplicates(aprovider))
        {
            throw new AssertionError("Codegen error?  Duplicates in the provider list");
        } else
        {
            return new SetFactory(aprovider);
        }
    }

    private static boolean hasDuplicates(List list)
    {
        HashSet hashset = new HashSet(list);
        return list.size() != hashset.size();
    }

    public final volatile Object get()
    {
        return get();
    }

    public final Set get()
    {
        int j = 0;
        ArrayList arraylist = new ArrayList(contributingProviders.size());
        int i = 0;
        for (int l = contributingProviders.size(); i < l; i++)
        {
            Provider provider = (Provider)contributingProviders.get(i);
            Set set = (Set)provider.get();
            if (set == null)
            {
                throw new NullPointerException((new StringBuilder()).append(provider).append(" returned null").toString());
            }
            arraylist.add(set);
            j += set.size();
        }

        java.util.LinkedHashSet linkedhashset = a.a(j);
        i = 0;
        for (int k = arraylist.size(); i < k; i++)
        {
            Object obj;
            for (Iterator iterator = ((Set)arraylist.get(i)).iterator(); iterator.hasNext(); linkedhashset.add(obj))
            {
                obj = iterator.next();
                if (obj == null)
                {
                    throw new NullPointerException("a null element was provided");
                }
            }

        }

        return Collections.unmodifiableSet(linkedhashset);
    }

    static 
    {
        boolean flag;
        if (!dagger/internal/SetFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
