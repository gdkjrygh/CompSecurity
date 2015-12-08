// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.xml;

import ezvcard.VCardVersion;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.xml.namespace.NamespaceContext;

public class XCardNamespaceContext
    implements NamespaceContext
{

    private final String ns;
    private final String prefix;

    public XCardNamespaceContext(VCardVersion vcardversion, String s)
    {
        ns = vcardversion.getXmlNamespace();
        prefix = s;
    }

    public String getNamespaceURI(String s)
    {
        if (prefix.equals(s))
        {
            return ns;
        } else
        {
            return null;
        }
    }

    public String getPrefix()
    {
        return prefix;
    }

    public String getPrefix(String s)
    {
        if (ns.equals(s))
        {
            return prefix;
        } else
        {
            return null;
        }
    }

    public Iterator getPrefixes(String s)
    {
        if (ns.equals(s))
        {
            return Arrays.asList(new String[] {
                prefix
            }).iterator();
        } else
        {
            return null;
        }
    }
}
