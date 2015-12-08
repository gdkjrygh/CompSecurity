// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Signature, Parameter, Criteria, Variable, 
//            Label, Contact, Context

class Initializer
{

    private final Constructor factory;
    private final List list;
    private final Signature signature;

    public Initializer(Constructor constructor, Signature signature1)
    {
        list = signature1.getParameters();
        signature = signature1;
        factory = constructor;
    }

    private double getAdjustment(Context context, double d)
    {
        double d1 = (double)list.size() / 1000D;
        if (d > 0.0D)
        {
            return d / (double)list.size() + d1;
        } else
        {
            return d / (double)list.size();
        }
    }

    private Object getInstance(Object aobj[])
        throws Exception
    {
        if (!factory.isAccessible())
        {
            factory.setAccessible(true);
        }
        return factory.newInstance(aobj);
    }

    private double getPercentage(Context context, Criteria criteria)
        throws Exception
    {
        double d = 0.0D;
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Parameter parameter = (Parameter)iterator.next();
            if (criteria.resolve(parameter.getPath(context)) == null)
            {
                if (parameter.isRequired())
                {
                    return -1D;
                }
                if (parameter.isPrimitive())
                {
                    return -1D;
                }
            } else
            {
                d++;
            }
        } while (true);
        return getAdjustment(context, d);
    }

    private Object getVariable(Context context, Criteria criteria, int i)
        throws Exception
    {
        context = criteria.remove(((Parameter)list.get(i)).getPath(context));
        if (context != null)
        {
            return context.getValue();
        } else
        {
            return null;
        }
    }

    public Object getInstance(Context context, Criteria criteria)
        throws Exception
    {
        Object aobj[] = list.toArray();
        for (int i = 0; i < list.size(); i++)
        {
            aobj[i] = getVariable(context, criteria, i);
        }

        return getInstance(aobj);
    }

    public Parameter getParameter(String s)
    {
        return (Parameter)signature.get(s);
    }

    public double getScore(Context context, Criteria criteria)
        throws Exception
    {
label0:
        {
            Signature signature1 = signature.getSignature(context);
            Iterator iterator = criteria.iterator();
            Object obj;
            Contact contact;
label1:
            do
            {
                Object obj1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    obj = (String)iterator.next();
                    obj1 = criteria.resolve(((String) (obj)));
                } while (obj1 == null);
                Parameter parameter = signature1.getParameter(((String) (obj)));
                contact = ((Label) (obj1)).getContact();
                obj = parameter;
                if (parameter != null)
                {
                    continue;
                }
                obj1 = ((Label) (obj1)).getNames(context).iterator();
                obj = parameter;
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        continue label1;
                    }
                    parameter = signature1.getParameter((String)((Iterator) (obj1)).next());
                    obj = parameter;
                } while (parameter == null);
                obj = parameter;
            } while (!contact.isReadOnly() || obj != null);
            return -1D;
        }
        return getPercentage(context, criteria);
    }

    public boolean isDefault()
    {
        return signature.size() == 0;
    }

    public String toString()
    {
        return factory.toString();
    }
}
