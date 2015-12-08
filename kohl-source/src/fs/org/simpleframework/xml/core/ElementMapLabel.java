// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.ElementMap;
import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.Style;
import java.lang.annotation.Annotation;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            TemplateLabel, Introspector, Qualifier, Entry, 
//            Contact, ClassType, CompositeMap, CompositeInlineMap, 
//            ElementException, MapFactory, Factory, Context, 
//            Expression, Decorator, Converter

class ElementMapLabel extends TemplateLabel
{

    private Decorator decorator;
    private Introspector detail;
    private Entry entry;
    private Class items[];
    private ElementMap label;
    private String name;
    private String parent;
    private Class type;

    public ElementMapLabel(Contact contact, ElementMap elementmap)
    {
        detail = new Introspector(contact, this);
        decorator = new Qualifier(contact);
        entry = new Entry(contact, elementmap);
        type = contact.getType();
        name = elementmap.name();
        label = elementmap;
    }

    private Type getMap()
    {
        return new ClassType(type);
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
        Type type1 = getMap();
        if (!label.inline())
        {
            return new CompositeMap(context, entry, type1);
        } else
        {
            return new CompositeInlineMap(context, entry, type1);
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
        if (items == null)
        {
            items = contact.getDependents();
        }
        if (items == null)
        {
            throw new ElementException("Unable to determine type for %s", new Object[] {
                contact
            });
        }
        if (items.length == 0)
        {
            return new ClassType(java/lang/Object);
        } else
        {
            return new ClassType(items[0]);
        }
    }

    public Object getEmpty(Context context)
        throws Exception
    {
        context = new MapFactory(context, new ClassType(type));
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
        if (detail.isEmpty(parent))
        {
            parent = detail.getEntry();
        }
        return parent;
    }

    public Expression getExpression()
        throws Exception
    {
        return detail.getExpression();
    }

    public String getName()
        throws Exception
    {
        if (label.inline())
        {
            return entry.getEntry();
        } else
        {
            return detail.getName();
        }
    }

    public String getName(Context context)
        throws Exception
    {
        Style style = context.getStyle();
        context = entry.getEntry();
        if (!label.inline())
        {
            context = detail.getName();
        }
        return style.getElement(context);
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
