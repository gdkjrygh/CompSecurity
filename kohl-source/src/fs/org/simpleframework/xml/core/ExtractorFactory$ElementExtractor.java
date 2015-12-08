// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Element;
import fs.org.simpleframework.xml.ElementUnion;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Extractor, ExtractorFactory, ElementLabel, Contact, 
//            Label

private static class union
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

    public (Contact contact1, ElementUnion elementunion)
        throws Exception
    {
        contact = contact1;
        union = elementunion;
    }
}
