// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.Factory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package dagger.internal:
//            Collections

public final class SetFactory
    implements Factory
{

    private final Set contributingProviders;

    private Set get()
    {
        Object obj = new ArrayList(contributingProviders.size());
        Set set;
        for (Iterator iterator = contributingProviders.iterator(); iterator.hasNext(); ((List) (obj)).add(set))
        {
            Provider provider = (Provider)iterator.next();
            set = (Set)provider.get();
            if (set == null)
            {
                obj = String.valueOf(provider);
                throw new NullPointerException((new StringBuilder(String.valueOf(obj).length() + 14)).append(((String) (obj))).append(" returned null").toString());
            }
        }

        int i = 0;
        for (Iterator iterator1 = ((List) (obj)).iterator(); iterator1.hasNext();)
        {
            i += ((Set)iterator1.next()).size();
        }

        java.util.LinkedHashSet linkedhashset = Collections.newLinkedHashSetWithExpectedSize(i);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            Iterator iterator2 = ((Set)((Iterator) (obj)).next()).iterator();
            while (iterator2.hasNext()) 
            {
                Object obj1 = iterator2.next();
                if (obj1 == null)
                {
                    throw new NullPointerException("a null element was provided");
                }
                linkedhashset.add(obj1);
            }
        }

        return Collections.unmodifiableSet(linkedhashset);
    }

    public final volatile Object get()
    {
        return get();
    }
}
