// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import javax.xml.namespace.QName;
import javax.xml.stream.events.Attribute;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            EventAttribute, StreamReader

private static class entry extends EventAttribute
{

    private final Attribute entry;

    public String getName()
    {
        return entry.getName().getLocalPart();
    }

    public String getPrefix()
    {
        return entry.getName().getPrefix();
    }

    public String getReference()
    {
        return entry.getName().getNamespaceURI();
    }

    public Object getSource()
    {
        return entry;
    }

    public String getValue()
    {
        return entry.getValue();
    }

    public boolean isReserved()
    {
        return false;
    }

    public (Attribute attribute)
    {
        entry = attribute;
    }
}
