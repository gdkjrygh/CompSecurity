// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.ElementList;
import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.Style;
import java.lang.annotation.Annotation;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            TemplateLabel, Introspector, Qualifier, Contact, 
//            Context, CompositeList, PrimitiveList, CompositeInlineList, 
//            PrimitiveInlineList, ElementException, ClassType, CollectionFactory, 
//            Factory, Expression, Decorator, Converter

class ElementListLabel extends TemplateLabel
{

    private Decorator decorator;
    private Introspector detail;
    private String entry;
    private Class item;
    private ElementList label;
    private String name;
    private Class type;

    public ElementListLabel(Contact contact, ElementList elementlist)
    {
        detail = new Introspector(contact, this);
        decorator = new Qualifier(contact);
        type = contact.getType();
        entry = elementlist.entry();
        item = elementlist.type();
        name = elementlist.name();
        label = elementlist;
    }

    private Converter getConverter(Context context, String s)
        throws Exception
    {
        Type type1 = getDependent();
        Contact contact = getContact();
        if (!context.isPrimitive(type1))
        {
            return new CompositeList(context, contact, type1, s);
        } else
        {
            return new PrimitiveList(context, contact, type1, s);
        }
    }

    private String getEntry(Context context)
        throws Exception
    {
        return context.getStyle().getElement(getEntry());
    }

    private Converter getInlineConverter(Context context, String s)
        throws Exception
    {
        Type type1 = getDependent();
        Contact contact = getContact();
        if (!context.isPrimitive(type1))
        {
            return new CompositeInlineList(context, contact, type1, s);
        } else
        {
            return new PrimitiveInlineList(context, contact, type1, s);
        }
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
        if (!label.inline())
        {
            return getConverter(context, s);
        } else
        {
            return getInlineConverter(context, s);
        }
    }

    public Decorator getDecorator()
        throws Exception
    {
        return decorator;
    }

    public Type getDependent()
        throws Exception
    {
        Contact contact = getContact();
        if (item == Void.TYPE)
        {
            item = contact.getDependent();
        }
        if (item == null)
        {
            throw new ElementException("Unable to determine generic type for %s", new Object[] {
                contact
            });
        } else
        {
            return new ClassType(item);
        }
    }

    public Object getEmpty(Context context)
        throws Exception
    {
        context = new CollectionFactory(context, new ClassType(type));
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

    public boolean isCollection()
    {
        return true;
    }

    public boolean isData()
    {
        return label.data();
    }

    public boolean isInline()
    {
        return label.inline();
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
