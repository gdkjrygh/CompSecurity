// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Criteria, Variable, Contact, Label, 
//            Context

class Collector
    implements Criteria
{
    private class Registry extends LinkedHashMap
    {

        final Collector this$0;

        public Iterator iterator()
        {
            return keySet().iterator();
        }

        private Registry()
        {
            this$0 = Collector.this;
            super();
        }

    }


    private final Registry alias = new Registry();
    private final Context context;
    private final Registry registry = new Registry();

    public Collector(Context context1)
    {
        context = context1;
    }

    public void commit(Object obj)
        throws Exception
    {
        Variable variable;
        for (Iterator iterator1 = registry.values().iterator(); iterator1.hasNext(); variable.getContact().set(obj, variable.getValue()))
        {
            variable = (Variable)iterator1.next();
        }

    }

    public Variable get(String s)
    {
        return (Variable)registry.get(s);
    }

    public Iterator iterator()
    {
        return registry.iterator();
    }

    public Variable remove(String s)
        throws Exception
    {
        s = (Variable)alias.remove(s);
        if (s != null)
        {
            Object obj = s.getNames(context);
            String s1 = s.getPath(context);
            String s2;
            for (obj = ((Collection) (obj)).iterator(); ((Iterator) (obj)).hasNext(); alias.remove(s2))
            {
                s2 = (String)((Iterator) (obj)).next();
            }

            registry.remove(s1);
        }
        return s;
    }

    public Variable resolve(String s)
    {
        return (Variable)alias.get(s);
    }

    public void set(Label label, Object obj)
        throws Exception
    {
        obj = new Variable(label, obj);
        if (label != null)
        {
            Object obj1 = label.getNames(context);
            label = label.getPath(context);
            if (!registry.containsKey(label))
            {
                registry.put(label, obj);
            }
            for (label = ((Collection) (obj1)).iterator(); label.hasNext(); alias.put(obj1, obj))
            {
                obj1 = (String)label.next();
            }

        }
    }
}
