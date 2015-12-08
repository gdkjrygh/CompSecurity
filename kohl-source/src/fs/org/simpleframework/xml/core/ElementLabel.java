// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Element;
import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.Style;
import java.lang.annotation.Annotation;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            TemplateLabel, Introspector, Qualifier, Contact, 
//            Context, Primitive, Composite, Expression, 
//            OverrideType, Decorator, Converter

class ElementLabel extends TemplateLabel
{

    private Decorator decorator;
    private Introspector detail;
    private Element label;
    private String name;
    private Class override;
    private Class type;

    public ElementLabel(Contact contact, Element element)
    {
        detail = new Introspector(contact, this);
        decorator = new Qualifier(contact);
        type = contact.getType();
        override = element.type();
        name = element.name();
        label = element;
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
        Contact contact = getContact();
        if (context.isPrimitive(contact))
        {
            return new Primitive(context, contact);
        }
        if (override == Void.TYPE)
        {
            return new Composite(context, contact);
        } else
        {
            return new Composite(context, contact, override);
        }
    }

    public Decorator getDecorator()
        throws Exception
    {
        return decorator;
    }

    public Object getEmpty(Context context)
    {
        return null;
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

    public Type getType(Class class1)
    {
        class1 = getContact();
        if (override == Void.TYPE)
        {
            return class1;
        } else
        {
            return new OverrideType(class1, override);
        }
    }

    public Class getType()
    {
        if (override == Void.TYPE)
        {
            return type;
        } else
        {
            return override;
        }
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
