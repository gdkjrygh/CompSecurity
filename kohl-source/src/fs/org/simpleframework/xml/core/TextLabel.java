// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Text;
import java.lang.annotation.Annotation;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            TemplateLabel, Introspector, Contact, Context, 
//            TextException, Primitive, Expression, Converter, 
//            Decorator

class TextLabel extends TemplateLabel
{

    private Contact contact;
    private Introspector detail;
    private String empty;
    private Text label;
    private Class type;

    public TextLabel(Contact contact1, Text text)
    {
        detail = new Introspector(contact1, this);
        type = contact1.getType();
        empty = text.empty();
        contact = contact1;
        label = text;
    }

    public Annotation getAnnotation()
    {
        return label;
    }

    public Contact getContact()
    {
        return contact;
    }

    public Converter getConverter(Context context)
        throws Exception
    {
        String s = getEmpty(context);
        Contact contact1 = getContact();
        if (!context.isPrimitive(contact1))
        {
            throw new TextException("Cannot use %s to represent %s", new Object[] {
                contact1, label
            });
        } else
        {
            return new Primitive(context, contact1, s);
        }
    }

    public Decorator getDecorator()
        throws Exception
    {
        return null;
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
    {
        return "";
    }

    public String getName(Context context)
    {
        return getName();
    }

    public String getOverride()
    {
        return contact.toString();
    }

    public String getPath()
        throws Exception
    {
        return getExpression().getPath();
    }

    public String getPath(Context context)
        throws Exception
    {
        return getPath();
    }

    public Class getType()
    {
        return type;
    }

    public boolean isData()
    {
        return label.data();
    }

    public boolean isInline()
    {
        return true;
    }

    public boolean isRequired()
    {
        return label.required();
    }

    public boolean isText()
    {
        return true;
    }

    public String toString()
    {
        return detail.toString();
    }
}
