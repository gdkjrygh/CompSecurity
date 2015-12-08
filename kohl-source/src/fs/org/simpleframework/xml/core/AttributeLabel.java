// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Attribute;
import fs.org.simpleframework.xml.stream.Style;
import java.lang.annotation.Annotation;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            TemplateLabel, Introspector, Qualifier, Contact, 
//            Context, AttributeException, Primitive, Expression, 
//            Decorator, Converter

class AttributeLabel extends TemplateLabel
{

    private Decorator decorator;
    private Introspector detail;
    private String empty;
    private Attribute label;
    private String name;
    private Class type;

    public AttributeLabel(Contact contact, Attribute attribute)
    {
        detail = new Introspector(contact, this);
        decorator = new Qualifier(contact);
        type = contact.getType();
        empty = attribute.empty();
        name = attribute.name();
        label = attribute;
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
        String s = getEmpty(context);
        Contact contact = getContact();
        if (!context.isPrimitive(contact))
        {
            throw new AttributeException("Cannot use %s to represent %s", new Object[] {
                label, contact
            });
        } else
        {
            return new Primitive(context, contact, s);
        }
    }

    public Decorator getDecorator()
        throws Exception
    {
        return decorator;
    }

    public volatile Object getEmpty(Context context)
        throws Exception
    {
        return getEmpty(context);
    }

    public String getEmpty(Context context)
    {
        if (detail.isEmpty(empty))
        {
            return null;
        } else
        {
            return empty;
        }
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
        return context.getStyle().getAttribute(detail.getName());
    }

    public String getOverride()
    {
        return name;
    }

    public String getPath()
        throws Exception
    {
        return getExpression().getAttribute(getName());
    }

    public String getPath(Context context)
        throws Exception
    {
        return getExpression().getAttribute(getName(context));
    }

    public Class getType()
    {
        return type;
    }

    public boolean isAttribute()
    {
        return true;
    }

    public boolean isData()
    {
        return false;
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
