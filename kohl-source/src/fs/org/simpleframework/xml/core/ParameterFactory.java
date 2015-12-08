// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Attribute;
import fs.org.simpleframework.xml.Element;
import fs.org.simpleframework.xml.ElementArray;
import fs.org.simpleframework.xml.ElementList;
import fs.org.simpleframework.xml.ElementMap;
import fs.org.simpleframework.xml.Text;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            ElementParameter, ElementListParameter, ElementArrayParameter, ElementMapParameter, 
//            AttributeParameter, TextParameter, PersistenceException, Parameter

final class ParameterFactory
{
    private static class PameterBuilder
    {

        public Class create;
        public Class type;

        private transient Constructor getConstructor(Class aclass[])
            throws Exception
        {
            return create.getConstructor(aclass);
        }

        public Constructor getConstructor()
            throws Exception
        {
            return getConstructor(new Class[] {
                java/lang/reflect/Constructor, type, Integer.TYPE
            });
        }

        public PameterBuilder(Class class1, Class class2)
        {
            create = class1;
            type = class2;
        }
    }


    private static PameterBuilder getBuilder(Annotation annotation)
        throws Exception
    {
        if (annotation instanceof Element)
        {
            return new PameterBuilder(fs/org/simpleframework/xml/core/ElementParameter, fs/org/simpleframework/xml/Element);
        }
        if (annotation instanceof ElementList)
        {
            return new PameterBuilder(fs/org/simpleframework/xml/core/ElementListParameter, fs/org/simpleframework/xml/ElementList);
        }
        if (annotation instanceof ElementArray)
        {
            return new PameterBuilder(fs/org/simpleframework/xml/core/ElementArrayParameter, fs/org/simpleframework/xml/ElementArray);
        }
        if (annotation instanceof ElementMap)
        {
            return new PameterBuilder(fs/org/simpleframework/xml/core/ElementMapParameter, fs/org/simpleframework/xml/ElementMap);
        }
        if (annotation instanceof Attribute)
        {
            return new PameterBuilder(fs/org/simpleframework/xml/core/AttributeParameter, fs/org/simpleframework/xml/Attribute);
        }
        if (annotation instanceof Text)
        {
            return new PameterBuilder(fs/org/simpleframework/xml/core/TextParameter, fs/org/simpleframework/xml/Text);
        } else
        {
            throw new PersistenceException("Annotation %s not supported", new Object[] {
                annotation
            });
        }
    }

    private static Constructor getConstructor(Annotation annotation)
        throws Exception
    {
        return getBuilder(annotation).getConstructor();
    }

    public static Parameter getInstance(Constructor constructor, Annotation annotation, int i)
        throws Exception
    {
        Constructor constructor1 = getConstructor(annotation);
        if (!constructor1.isAccessible())
        {
            constructor1.setAccessible(true);
        }
        return (Parameter)constructor1.newInstance(new Object[] {
            constructor, annotation, Integer.valueOf(i)
        });
    }
}
