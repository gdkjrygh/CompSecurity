// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Element;
import fs.org.simpleframework.xml.ElementList;
import fs.org.simpleframework.xml.ElementListUnion;
import fs.org.simpleframework.xml.ElementMap;
import fs.org.simpleframework.xml.ElementMapUnion;
import fs.org.simpleframework.xml.ElementUnion;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            PersistenceException, Extractor, Contact, ElementLabel, 
//            Label, ElementListLabel, ElementMapLabel

class ExtractorFactory
{
    private static class ElementExtractor
        implements Extractor
    {

        private final Contact contact;
        private final ElementUnion union;

        public List getAnnotations()
        {
            Element aelement[] = union.value();
            if (aelement.length > 0)
            {
                return Arrays.asList(aelement);
            } else
            {
                return Collections.emptyList();
            }
        }

        public Label getLabel(Element element)
        {
            return new ElementLabel(contact, element);
        }

        public volatile Label getLabel(Annotation annotation)
            throws Exception
        {
            return getLabel((Element)annotation);
        }

        public Class getType(Element element)
        {
            Class class1 = element.type();
            element = class1;
            if (class1 == Void.TYPE)
            {
                element = contact.getType();
            }
            return element;
        }

        public volatile Class getType(Annotation annotation)
            throws Exception
        {
            return getType((Element)annotation);
        }

        public ElementExtractor(Contact contact1, ElementUnion elementunion)
            throws Exception
        {
            contact = contact1;
            union = elementunion;
        }
    }

    private static class ElementListExtractor
        implements Extractor
    {

        private final Contact contact;
        private final ElementListUnion union;

        public List getAnnotations()
        {
            ElementList aelementlist[] = union.value();
            if (aelementlist.length > 0)
            {
                return Arrays.asList(aelementlist);
            } else
            {
                return Collections.emptyList();
            }
        }

        public Label getLabel(ElementList elementlist)
        {
            return new ElementListLabel(contact, elementlist);
        }

        public volatile Label getLabel(Annotation annotation)
            throws Exception
        {
            return getLabel((ElementList)annotation);
        }

        public Class getType(ElementList elementlist)
        {
            return elementlist.type();
        }

        public volatile Class getType(Annotation annotation)
            throws Exception
        {
            return getType((ElementList)annotation);
        }

        public ElementListExtractor(Contact contact1, ElementListUnion elementlistunion)
            throws Exception
        {
            contact = contact1;
            union = elementlistunion;
        }
    }

    private static class ElementMapExtractor
        implements Extractor
    {

        private final Contact contact;
        private final ElementMapUnion union;

        public List getAnnotations()
        {
            ElementMap aelementmap[] = union.value();
            if (aelementmap.length > 0)
            {
                return Arrays.asList(aelementmap);
            } else
            {
                return Collections.emptyList();
            }
        }

        public Label getLabel(ElementMap elementmap)
        {
            return new ElementMapLabel(contact, elementmap);
        }

        public volatile Label getLabel(Annotation annotation)
            throws Exception
        {
            return getLabel((ElementMap)annotation);
        }

        public Class getType(ElementMap elementmap)
        {
            return elementmap.valueType();
        }

        public volatile Class getType(Annotation annotation)
            throws Exception
        {
            return getType((ElementMap)annotation);
        }

        public ElementMapExtractor(Contact contact1, ElementMapUnion elementmapunion)
            throws Exception
        {
            contact = contact1;
            union = elementmapunion;
        }
    }

    private static class ExtractorBuilder
    {

        private final Class label;
        private final Class type;

        private Constructor getConstructor()
            throws Exception
        {
            return type.getConstructor(new Class[] {
                fs/org/simpleframework/xml/core/Contact, label
            });
        }


        public ExtractorBuilder(Class class1, Class class2)
        {
            label = class1;
            type = class2;
        }
    }


    private final Contact contact;
    private final Annotation label;

    public ExtractorFactory(Contact contact1, Annotation annotation)
    {
        contact = contact1;
        label = annotation;
    }

    private ExtractorBuilder getBuilder(Annotation annotation)
        throws Exception
    {
        if (annotation instanceof ElementUnion)
        {
            return new ExtractorBuilder(fs/org/simpleframework/xml/ElementUnion, fs/org/simpleframework/xml/core/ExtractorFactory$ElementExtractor);
        }
        if (annotation instanceof ElementListUnion)
        {
            return new ExtractorBuilder(fs/org/simpleframework/xml/ElementListUnion, fs/org/simpleframework/xml/core/ExtractorFactory$ElementListExtractor);
        }
        if (annotation instanceof ElementMapUnion)
        {
            return new ExtractorBuilder(fs/org/simpleframework/xml/ElementMapUnion, fs/org/simpleframework/xml/core/ExtractorFactory$ElementMapExtractor);
        } else
        {
            throw new PersistenceException("Annotation %s is not a union", new Object[] {
                annotation
            });
        }
    }

    private Object getInstance(Annotation annotation)
        throws Exception
    {
        Constructor constructor = getBuilder(annotation).getConstructor();
        if (!constructor.isAccessible())
        {
            constructor.setAccessible(true);
        }
        return constructor.newInstance(new Object[] {
            contact, annotation
        });
    }

    public Extractor getInstance()
        throws Exception
    {
        return (Extractor)getInstance(label);
    }
}
