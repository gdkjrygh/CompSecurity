// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package dagger.internal:
//            Binding, ProvidesBinding, SetBinding

public abstract class BindingsGroup
{

    private final Map bindings = new LinkedHashMap();

    public BindingsGroup()
    {
    }

    public Binding contributeProvidesBinding(String s, ProvidesBinding providesbinding)
    {
        return put(s, providesbinding);
    }

    public abstract Binding contributeSetBinding(String s, SetBinding setbinding);

    public final Set entrySet()
    {
        return bindings.entrySet();
    }

    public Binding get(String s)
    {
        return (Binding)bindings.get(s);
    }

    protected Binding put(String s, Binding binding)
    {
        Binding binding1 = (Binding)bindings.put(s, binding);
        if (binding1 != null)
        {
            bindings.put(s, binding1);
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate:\n    ").append(binding1).append("\n    ").append(binding).toString());
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(bindings.toString()).toString();
    }
}
