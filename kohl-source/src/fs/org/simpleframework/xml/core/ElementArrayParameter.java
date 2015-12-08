// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.ElementArray;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            TemplateParameter, ElementArrayLabel, Label, Expression, 
//            ParameterContact

class ElementArrayParameter extends TemplateParameter
{
    private static class Contact extends ParameterContact
    {

        public String getName()
        {
            return ((ElementArray)label).name();
        }

        public Contact(ElementArray elementarray, Constructor constructor, int i)
        {
            super(elementarray, constructor, i);
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

    public ElementArrayParameter(Constructor constructor, ElementArray elementarray, int i)
        throws Exception
    {
        contact = new Contact(elementarray, constructor, i);
        label = new ElementArrayLabel(contact, elementarray);
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

    public String getPath()
    {
        return path;
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

    public String toString()
    {
        return contact.toString();
    }
}
