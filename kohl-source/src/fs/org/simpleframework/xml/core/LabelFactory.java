// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Attribute;
import fs.org.simpleframework.xml.Element;
import fs.org.simpleframework.xml.ElementArray;
import fs.org.simpleframework.xml.ElementList;
import fs.org.simpleframework.xml.ElementListUnion;
import fs.org.simpleframework.xml.ElementMap;
import fs.org.simpleframework.xml.ElementMapUnion;
import fs.org.simpleframework.xml.ElementUnion;
import fs.org.simpleframework.xml.Text;
import fs.org.simpleframework.xml.Version;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            ElementLabel, ElementListLabel, ElementArrayLabel, ElementMapLabel, 
//            ElementUnionLabel, ElementListUnionLabel, ElementMapUnionLabel, AttributeLabel, 
//            VersionLabel, TextLabel, PersistenceException, CacheLabel, 
//            Label, Contact

final class LabelFactory
{
    private static class LabelBuilder
    {

        public Class entry;
        public Class label;
        public Class type;

        private Constructor getConstructor(Class class1)
            throws Exception
        {
            return type.getConstructor(new Class[] {
                fs/org/simpleframework/xml/core/Contact, class1
            });
        }

        private Constructor getConstructor(Class class1, Class class2)
            throws Exception
        {
            return type.getConstructor(new Class[] {
                fs/org/simpleframework/xml/core/Contact, class1, class2
            });
        }

        public Constructor getConstructor()
            throws Exception
        {
            if (entry != null)
            {
                return getConstructor(label, entry);
            } else
            {
                return getConstructor(label);
            }
        }

        public LabelBuilder(Class class1, Class class2)
        {
            this(class1, class2, null);
        }

        public LabelBuilder(Class class1, Class class2, Class class3)
        {
            entry = class3;
            label = class2;
            type = class1;
        }
    }


    private static LabelBuilder getBuilder(Annotation annotation)
        throws Exception
    {
        if (annotation instanceof Element)
        {
            return new LabelBuilder(fs/org/simpleframework/xml/core/ElementLabel, fs/org/simpleframework/xml/Element);
        }
        if (annotation instanceof ElementList)
        {
            return new LabelBuilder(fs/org/simpleframework/xml/core/ElementListLabel, fs/org/simpleframework/xml/ElementList);
        }
        if (annotation instanceof ElementArray)
        {
            return new LabelBuilder(fs/org/simpleframework/xml/core/ElementArrayLabel, fs/org/simpleframework/xml/ElementArray);
        }
        if (annotation instanceof ElementMap)
        {
            return new LabelBuilder(fs/org/simpleframework/xml/core/ElementMapLabel, fs/org/simpleframework/xml/ElementMap);
        }
        if (annotation instanceof ElementUnion)
        {
            return new LabelBuilder(fs/org/simpleframework/xml/core/ElementUnionLabel, fs/org/simpleframework/xml/ElementUnion, fs/org/simpleframework/xml/Element);
        }
        if (annotation instanceof ElementListUnion)
        {
            return new LabelBuilder(fs/org/simpleframework/xml/core/ElementListUnionLabel, fs/org/simpleframework/xml/ElementListUnion, fs/org/simpleframework/xml/ElementList);
        }
        if (annotation instanceof ElementMapUnion)
        {
            return new LabelBuilder(fs/org/simpleframework/xml/core/ElementMapUnionLabel, fs/org/simpleframework/xml/ElementMapUnion, fs/org/simpleframework/xml/ElementMap);
        }
        if (annotation instanceof Attribute)
        {
            return new LabelBuilder(fs/org/simpleframework/xml/core/AttributeLabel, fs/org/simpleframework/xml/Attribute);
        }
        if (annotation instanceof Version)
        {
            return new LabelBuilder(fs/org/simpleframework/xml/core/VersionLabel, fs/org/simpleframework/xml/Version);
        }
        if (annotation instanceof Text)
        {
            return new LabelBuilder(fs/org/simpleframework/xml/core/TextLabel, fs/org/simpleframework/xml/Text);
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
        annotation = getBuilder(annotation).getConstructor();
        if (!annotation.isAccessible())
        {
            annotation.setAccessible(true);
        }
        return annotation;
    }

    public static Label getInstance(Contact contact, Annotation annotation)
        throws Exception
    {
        return getInstance(contact, annotation, null);
    }

    public static Label getInstance(Contact contact, Annotation annotation, Annotation annotation1)
        throws Exception
    {
        contact = getLabel(contact, annotation, annotation1);
        if (contact == null)
        {
            return contact;
        } else
        {
            return new CacheLabel(contact);
        }
    }

    private static Label getLabel(Contact contact, Annotation annotation, Annotation annotation1)
        throws Exception
    {
        Constructor constructor = getConstructor(annotation);
        if (annotation1 != null)
        {
            return (Label)constructor.newInstance(new Object[] {
                contact, annotation, annotation1
            });
        } else
        {
            return (Label)constructor.newInstance(new Object[] {
                contact, annotation
            });
        }
    }
}
