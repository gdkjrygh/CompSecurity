// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.ElementMap;
import fs.org.simpleframework.xml.ElementMapUnion;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Extractor, ExtractorFactory, ElementMapLabel, Contact, 
//            Label

private static class union
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

    public (Contact contact1, ElementMapUnion elementmapunion)
        throws Exception
    {
        contact = contact1;
        union = elementmapunion;
    }
}
