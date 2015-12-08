// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package dagger.internal:
//            Binding, Linker, BindingsGroup

public final class SetBinding extends Binding
{

    private final List contributors;
    private final SetBinding parent;

    public SetBinding(SetBinding setbinding)
    {
        super(setbinding.provideKey, null, false, setbinding.requiredBy);
        parent = setbinding;
        setLibrary(setbinding.library());
        setDependedOn(setbinding.dependedOn());
        contributors = new ArrayList();
    }

    private SetBinding(String s, Object obj)
    {
        super(s, null, false, obj);
        parent = null;
        contributors = new ArrayList();
    }

    public static void add(BindingsGroup bindingsgroup, String s, Binding binding)
    {
        prepareSetBinding(bindingsgroup, s, binding).contributors.add(Linker.scope(binding));
    }

    private Set get()
    {
        ArrayList arraylist = new ArrayList();
        for (SetBinding setbinding = this; setbinding != null; setbinding = setbinding.parent)
        {
            int i = 0;
            int j = setbinding.contributors.size();
            while (i < j) 
            {
                Binding binding = (Binding)setbinding.contributors.get(i);
                Object obj = binding.get();
                if (binding.provideKey.equals(provideKey))
                {
                    arraylist.addAll((Set)obj);
                } else
                {
                    arraylist.add(obj);
                }
                i++;
            }
        }

        return Collections.unmodifiableSet(new LinkedHashSet(arraylist));
    }

    private static void injectMembers(Set set)
    {
        throw new UnsupportedOperationException("Cannot inject members on a contributed Set<T>.");
    }

    private static SetBinding prepareSetBinding(BindingsGroup bindingsgroup, String s, Binding binding)
    {
        Binding binding1 = bindingsgroup.get(s);
        if (binding1 instanceof SetBinding)
        {
            bindingsgroup = (SetBinding)binding1;
            boolean flag;
            if (bindingsgroup.library() && binding.library())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bindingsgroup.setLibrary(flag);
            return bindingsgroup;
        }
        if (binding1 != null)
        {
            bindingsgroup = String.valueOf(binding1);
            s = String.valueOf(binding);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(bindingsgroup).length() + 20 + String.valueOf(s).length())).append("Duplicate:\n    ").append(bindingsgroup).append("\n    ").append(s).toString());
        } else
        {
            SetBinding setbinding = new SetBinding(s, binding.requiredBy);
            setbinding.setLibrary(binding.library());
            bindingsgroup.contributeSetBinding(s, setbinding);
            return (SetBinding)bindingsgroup.get(s);
        }
    }

    public final void attach(Linker linker)
    {
        for (Iterator iterator = contributors.iterator(); iterator.hasNext(); ((Binding)iterator.next()).attach(linker)) { }
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        for (set1 = this; set1 != null; set1 = ((SetBinding) (set1)).parent)
        {
            set.addAll(((SetBinding) (set1)).contributors);
        }

    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((Set)obj);
    }

    public final String toString()
    {
        boolean flag = true;
        StringBuilder stringbuilder = new StringBuilder("SetBinding[");
        for (SetBinding setbinding = this; setbinding != null; setbinding = setbinding.parent)
        {
            int i = 0;
            for (int j = setbinding.contributors.size(); i < j; i++)
            {
                if (!flag)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append(setbinding.contributors.get(i));
                flag = false;
            }

        }

        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
