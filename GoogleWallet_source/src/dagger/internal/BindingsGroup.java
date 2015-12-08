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

    public final Binding contributeProvidesBinding(String s, ProvidesBinding providesbinding)
    {
        return put(s, providesbinding);
    }

    public abstract Binding contributeSetBinding(String s, SetBinding setbinding);

    public final Set entrySet()
    {
        return bindings.entrySet();
    }

    public final Binding get(String s)
    {
        return (Binding)bindings.get(s);
    }

    protected final Binding put(String s, Binding binding)
    {
        Binding binding1 = (Binding)bindings.put(s, binding);
        if (binding1 != null)
        {
            bindings.put(s, binding1);
            s = String.valueOf(binding1);
            binding = String.valueOf(binding);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 20 + String.valueOf(binding).length())).append("Duplicate:\n    ").append(s).append("\n    ").append(binding).toString());
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        String s = String.valueOf(getClass().getSimpleName());
        String s1 = String.valueOf(bindings.toString());
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }
}
