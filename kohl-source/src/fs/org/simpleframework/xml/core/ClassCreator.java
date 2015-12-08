// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Creator, Signature, Initializer, PersistenceException, 
//            Parameter, Context, Criteria

class ClassCreator
    implements Creator
{

    private final List list;
    private final Initializer primary;
    private final Signature registry;
    private final Class type;

    public ClassCreator(List list1, Signature signature, Initializer initializer)
    {
        type = signature.getType();
        registry = signature;
        primary = initializer;
        list = list1;
    }

    private Initializer getInitializer(Context context, Criteria criteria)
        throws Exception
    {
        Initializer initializer = primary;
        double d = 0.0D;
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Initializer initializer1 = (Initializer)iterator.next();
            double d1 = initializer1.getScore(context, criteria);
            if (d1 > d)
            {
                initializer = initializer1;
                d = d1;
            }
        } while (true);
        return initializer;
    }

    public List getInitializers()
    {
        return new ArrayList(list);
    }

    public Object getInstance(Context context, Criteria criteria)
        throws Exception
    {
        Initializer initializer = getInitializer(context, criteria);
        if (initializer == null)
        {
            throw new PersistenceException("Constructor not matched for %s", new Object[] {
                type
            });
        } else
        {
            return initializer.getInstance(context, criteria);
        }
    }

    public Parameter getParameter(String s)
    {
        return (Parameter)registry.get(s);
    }

    public List getParameters()
    {
        return registry.getParameters();
    }

    public boolean isDefault()
    {
        return primary != null;
    }

    public String toString()
    {
        return String.format("creator for %s", new Object[] {
            type
        });
    }
}
