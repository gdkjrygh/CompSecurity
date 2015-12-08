// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.Style;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Label, Context, Expression, Contact, 
//            Decorator, Converter

class CacheLabel
    implements Label
{

    private final Annotation annotation;
    private final boolean attribute;
    private final boolean collection;
    private final Contact contact;
    private final boolean data;
    private final Decorator decorator;
    private final Type depend;
    private final String entry;
    private final Expression expression;
    private final boolean inline;
    private final Label label;
    private final String name;
    private final Collection names;
    private final String override;
    private final String path;
    private final Collection paths;
    private final boolean required;
    private final boolean text;
    private final Class type;
    private final boolean union;

    public CacheLabel(Label label1)
        throws Exception
    {
        annotation = label1.getAnnotation();
        expression = label1.getExpression();
        decorator = label1.getDecorator();
        attribute = label1.isAttribute();
        collection = label1.isCollection();
        contact = label1.getContact();
        depend = label1.getDependent();
        required = label1.isRequired();
        override = label1.getOverride();
        inline = label1.isInline();
        union = label1.isUnion();
        names = label1.getNames();
        paths = label1.getPaths();
        path = label1.getPath();
        type = label1.getType();
        name = label1.getName();
        entry = label1.getEntry();
        data = label1.isData();
        text = label1.isText();
        label = label1;
    }

    public Annotation getAnnotation()
    {
        return annotation;
    }

    public Contact getContact()
    {
        return contact;
    }

    public Converter getConverter(Context context)
        throws Exception
    {
        return label.getConverter(context);
    }

    public Decorator getDecorator()
        throws Exception
    {
        return decorator;
    }

    public Type getDependent()
        throws Exception
    {
        return depend;
    }

    public Object getEmpty(Context context)
        throws Exception
    {
        return label.getEmpty(context);
    }

    public String getEntry()
        throws Exception
    {
        return entry;
    }

    public Expression getExpression()
        throws Exception
    {
        return expression;
    }

    public Label getLabel(Class class1)
        throws Exception
    {
        return label.getLabel(class1);
    }

    public String getName()
        throws Exception
    {
        return name;
    }

    public String getName(Context context)
        throws Exception
    {
        context = context.getStyle();
        if (attribute)
        {
            return context.getAttribute(name);
        } else
        {
            return context.getElement(name);
        }
    }

    public Collection getNames()
        throws Exception
    {
        return names;
    }

    public Collection getNames(Context context)
        throws Exception
    {
        if (!union)
        {
            return Arrays.asList(new String[] {
                getPath(context), getName(context)
            });
        } else
        {
            return label.getNames(context);
        }
    }

    public String getOverride()
    {
        return override;
    }

    public String getPath()
        throws Exception
    {
        return path;
    }

    public String getPath(Context context)
        throws Exception
    {
        context = getName(context);
        if (attribute)
        {
            return expression.getAttribute(context);
        } else
        {
            return expression.getElement(context);
        }
    }

    public Collection getPaths()
        throws Exception
    {
        return paths;
    }

    public Collection getPaths(Context context)
        throws Exception
    {
        if (!union)
        {
            return Collections.singleton(getPath(context));
        } else
        {
            return label.getPaths(context);
        }
    }

    public Type getType(Class class1)
        throws Exception
    {
        return label.getType(class1);
    }

    public Class getType()
    {
        return type;
    }

    public boolean isAttribute()
    {
        return attribute;
    }

    public boolean isCollection()
    {
        return collection;
    }

    public boolean isData()
    {
        return data;
    }

    public boolean isInline()
    {
        return inline;
    }

    public boolean isRequired()
    {
        return required;
    }

    public boolean isText()
    {
        return text;
    }

    public boolean isUnion()
    {
        return union;
    }

    public String toString()
    {
        return label.toString();
    }
}
