// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.ElementList;
import fs.org.simpleframework.xml.ElementListUnion;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Extractor, ExtractorFactory, ElementListLabel, Contact, 
//            Label

private static class union
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

    public (Contact contact1, ElementListUnion elementlistunion)
        throws Exception
    {
        contact = contact1;
        union = elementlistunion;
    }
}
