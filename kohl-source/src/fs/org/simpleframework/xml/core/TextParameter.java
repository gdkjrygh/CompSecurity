// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Text;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            TemplateParameter, TextLabel, Label, Expression, 
//            Context, ParameterContact

class TextParameter extends TemplateParameter
{
    private static class Contact extends ParameterContact
    {

        public String getName()
        {
            return "";
        }

        public Contact(Text text, Constructor constructor, int i)
        {
            super(text, constructor, i);
        }
    }


    private final Contact contact;
    private final Expression expression;
    private final Constructor factory;
    private final int index;
    private final Label label;
    private final String name;
    private final String path;
    private final Class type;

    public TextParameter(Constructor constructor, Text text, int i)
        throws Exception
    {
        contact = new Contact(text, constructor, i);
        label = new TextLabel(contact, text);
        expression = label.getExpression();
        path = label.getPath();
        type = label.getType();
        name = label.getName();
        factory = constructor;
        index = i;
    }

    public Annotation getAnnotation()
    {
        return contact.getAnnotation();
    }

    public Expression getExpression()
    {
        return expression;
    }

    public int getIndex()
    {
        return index;
    }

    public String getName()
    {
        return name;
    }

    public String getName(Context context)
    {
        return getName();
    }

    public String getPath()
    {
        return path;
    }

    public String getPath(Context context)
    {
        return getPath();
    }

    public Class getType()
    {
        return factory.getParameterTypes()[index];
    }

    public boolean isPrimitive()
    {
        return type.isPrimitive();
    }

    public boolean isRequired()
    {
        return label.isRequired();
    }

    public boolean isText()
    {
        return true;
    }

    public String toString()
    {
        return contact.toString();
    }
}
