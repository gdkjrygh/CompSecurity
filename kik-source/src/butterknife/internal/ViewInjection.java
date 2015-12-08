// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package butterknife.internal:
//            MethodBinding, Listener, FieldBinding

final class ViewInjection
{

    private final Set fieldBindings = new LinkedHashSet();
    private final int id;
    private final Map methodBindings = new LinkedHashMap();

    ViewInjection(int i)
    {
        id = i;
    }

    public final void addFieldBinding(FieldBinding fieldbinding)
    {
        fieldBindings.add(fieldbinding);
    }

    public final void addMethodBinding(Listener listener, MethodBinding methodbinding)
    {
        MethodBinding methodbinding1 = (MethodBinding)methodBindings.get(listener);
        if (methodbinding1 != null)
        {
            throw new IllegalStateException((new StringBuilder("View ")).append(id).append(" already has method binding for ").append(listener.getType()).append(" on ").append(methodbinding1.getName()).toString());
        } else
        {
            methodBindings.put(listener, methodbinding);
            return;
        }
    }

    public final Collection getFieldBindings()
    {
        return fieldBindings;
    }

    public final int getId()
    {
        return id;
    }

    public final Map getMethodBindings()
    {
        return Collections.unmodifiableMap(new LinkedHashMap(methodBindings));
    }

    public final List getRequiredBindings()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = fieldBindings.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            FieldBinding fieldbinding = (FieldBinding)iterator.next();
            if (fieldbinding.isRequired())
            {
                arraylist.add(fieldbinding);
            }
        } while (true);
        iterator = methodBindings.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MethodBinding methodbinding = (MethodBinding)iterator.next();
            if (methodbinding.isRequired())
            {
                arraylist.add(methodbinding);
            }
        } while (true);
        return arraylist;
    }
}
