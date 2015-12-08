// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package butterknife.internal:
//            FieldViewBinding, MethodViewBinding, ListenerClass, ListenerMethod

final class ViewBindings
{

    private final Set fieldBindings = new LinkedHashSet();
    private final int id;
    private final LinkedHashMap methodBindings = new LinkedHashMap();

    ViewBindings(int i)
    {
        id = i;
    }

    public void addFieldBinding(FieldViewBinding fieldviewbinding)
    {
        fieldBindings.add(fieldviewbinding);
    }

    public void addMethodBinding(ListenerClass listenerclass, ListenerMethod listenermethod, MethodViewBinding methodviewbinding)
    {
        Object obj = (Map)methodBindings.get(listenerclass);
        Object obj1 = null;
        if (obj == null)
        {
            obj = new LinkedHashMap();
            methodBindings.put(listenerclass, obj);
            listenerclass = ((ListenerClass) (obj1));
        } else
        {
            listenerclass = (Set)((Map) (obj)).get(listenermethod);
        }
        obj1 = listenerclass;
        if (listenerclass == null)
        {
            obj1 = new LinkedHashSet();
            ((Map) (obj)).put(listenermethod, obj1);
        }
        ((Set) (obj1)).add(methodviewbinding);
    }

    public Collection getFieldBindings()
    {
        return fieldBindings;
    }

    public int getId()
    {
        return id;
    }

    public Map getMethodBindings()
    {
        return methodBindings;
    }

    public List getRequiredBindings()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = fieldBindings.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            FieldViewBinding fieldviewbinding = (FieldViewBinding)iterator.next();
            if (fieldviewbinding.isRequired())
            {
                arraylist.add(fieldviewbinding);
            }
        } while (true);
        for (Iterator iterator1 = methodBindings.values().iterator(); iterator1.hasNext();)
        {
            Iterator iterator2 = ((Map)iterator1.next()).values().iterator();
            while (iterator2.hasNext()) 
            {
                Iterator iterator3 = ((Set)iterator2.next()).iterator();
                while (iterator3.hasNext()) 
                {
                    MethodViewBinding methodviewbinding = (MethodViewBinding)iterator3.next();
                    if (methodviewbinding.isRequired())
                    {
                        arraylist.add(methodviewbinding);
                    }
                }
            }
        }

        return arraylist;
    }

    public boolean hasMethodBinding(ListenerClass listenerclass, ListenerMethod listenermethod)
    {
        listenerclass = (Map)methodBindings.get(listenerclass);
        return listenerclass != null && listenerclass.containsKey(listenermethod);
    }
}
