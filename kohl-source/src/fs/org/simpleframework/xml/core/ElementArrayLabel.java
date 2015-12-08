// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.ElementArray;
import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.Style;
import java.lang.annotation.Annotation;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            TemplateLabel, Introspector, Qualifier, Contact, 
//            Context, CompositeArray, PrimitiveArray, InstantiationException, 
//            ClassType, ArrayFactory, Factory, Expression, 
//            Decorator, Converter

class ElementArrayLabel extends TemplateLabel
{

    private Decorator decorator;
    private Introspector detail;
    private String entry;
    private ElementArray label;
    private String name;
    private Class type;

    public ElementArrayLabel(Contact contact, ElementArray elementarray)
    {
        detail = new Introspector(contact, this);
        decorator = new Qualifier(contact);
        type = contact.getType();
        entry = elementarray.entry();
        name = elementarray.name();
        label = elementarray;
    }

    private Converter getConverter(Context context, String s)
        throws Exception
    {
        Type type1 = getDependent();
        Contact contact = getContact();
        if (!context.isPrimitive(type1))
        {
            return new CompositeArray(context, contact, type1, s);
        } else
        {
            return new PrimitiveArray(context, contact, type1, s);
        }
    }

    private String getEntry(Context context)
        throws Exception
    {
        return context.getStyle().getElement(getEntry());
    }

    public Annotation getAnnotation()
    {
        return label;
    }

    public Contact getContact()
    {
        return detail.getContact();
    }

    public Converter getConverter(Context context)
        throws Exception
    {
        String s = getEntry(context);
        Contact contact = getContact();
        if (!type.isArray())
        {
            throw new InstantiationException("Type is not an array %s for %s", new Object[] {
                type, contact
            });
        } else
        {
            return getConverter(context, s);
        }
    }

    public Decorator getDecorator()
        throws Exception
    {
        return decorator;
    }

    public Type getDependent()
    {
        Class class1 = type.getComponentType();
        if (class1 == null)
        {
            return new ClassType(type);
        } else
        {
            return new ClassType(class1);
        }
    }

    public Object getEmpty(Context context)
        throws Exception
    {
        context = new ArrayFactory(context, new ClassType(type));
        if (!label.empty())
        {
            return context.getInstance();
        } else
        {
            return null;
        }
    }

    public String getEntry()
        throws Exception
    {
        if (detail.isEmpty(entry))
        {
            entry = detail.getEntry();
        }
        return entry;
    }

    public Expression getExpression()
        throws Exception
    {
        return detail.getExpression();
    }

    public String getName()
        throws Exception
    {
        return detail.getName();
    }

    public String getName(Context context)
        throws Exception
    {
        return context.getStyle().getElement(detail.getName());
    }

    public String getOverride()
    {
        return name;
    }

    public String getPath()
        throws Exception
    {
        return getExpression().getElement(getName());
    }

    public String getPath(Context context)
        throws Exception
    {
        return getExpression().getElement(getName(context));
    }

    public Class getType()
    {
        return type;
    }

    public boolean isData()
    {
        return label.data();
    }

    public boolean isRequired()
    {
        return label.required();
    }

    public String toString()
    {
        return detail.toString();
    }
}
