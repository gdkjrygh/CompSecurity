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
//            ViewBinding, ListenerBinding, ListenerClass, ListenerMethod

final class ViewInjection
{

    private final int id;
    private final LinkedHashMap listenerBindings = new LinkedHashMap();
    private final Set viewBindings = new LinkedHashSet();

    ViewInjection(int i)
    {
        id = i;
    }

    public void addListenerBinding(ListenerClass listenerclass, ListenerMethod listenermethod, ListenerBinding listenerbinding)
    {
        Object obj = (Map)listenerBindings.get(listenerclass);
        Object obj1;
        if (obj == null)
        {
            obj = new LinkedHashMap();
            listenerBindings.put(listenerclass, obj);
            listenerclass = null;
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
        ((Set) (obj1)).add(listenerbinding);
    }

    public void addViewBinding(ViewBinding viewbinding)
    {
        viewBindings.add(viewbinding);
    }

    public int getId()
    {
        return id;
    }

    public Map getListenerBindings()
    {
        return listenerBindings;
    }

    public List getRequiredBindings()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = viewBindings.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ViewBinding viewbinding = (ViewBinding)iterator.next();
            if (viewbinding.isRequired())
            {
                arraylist.add(viewbinding);
            }
        } while (true);
        for (Iterator iterator1 = listenerBindings.values().iterator(); iterator1.hasNext();)
        {
            Iterator iterator2 = ((Map)iterator1.next()).values().iterator();
            while (iterator2.hasNext()) 
            {
                Iterator iterator3 = ((Set)iterator2.next()).iterator();
                while (iterator3.hasNext()) 
                {
                    ListenerBinding listenerbinding = (ListenerBinding)iterator3.next();
                    if (listenerbinding.isRequired())
                    {
                        arraylist.add(listenerbinding);
                    }
                }
            }
        }

        return arraylist;
    }

    public Collection getViewBindings()
    {
        return viewBindings;
    }

    public boolean hasListenerBinding(ListenerClass listenerclass, ListenerMethod listenermethod)
    {
        listenerclass = (Map)listenerBindings.get(listenerclass);
        return listenerclass != null && listenerclass.containsKey(listenermethod);
    }
}
