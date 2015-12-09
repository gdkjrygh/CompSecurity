// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelXMLReader

public class AdMarvelXMLElement
{

    private LinkedHashMap attributes;
    private LinkedHashMap children;
    private StringBuilder data;
    private String name;

    AdMarvelXMLElement(String s)
    {
        name = null;
        attributes = null;
        data = new StringBuilder();
        children = new LinkedHashMap();
        name = s;
    }

    AdMarvelXMLElement(String s, LinkedHashMap linkedhashmap)
    {
        name = null;
        attributes = null;
        data = new StringBuilder();
        children = new LinkedHashMap();
        name = s;
        attributes = linkedhashmap;
    }

    public void appendData(String s)
    {
        data.append(s);
    }

    public LinkedHashMap getAttributes()
    {
        return attributes;
    }

    public LinkedHashMap getChildren()
    {
        return children;
    }

    public String getData()
    {
        if (data == null)
        {
            return null;
        } else
        {
            return data.toString();
        }
    }

    public String getName()
    {
        return name;
    }

    public void setChildren(LinkedHashMap linkedhashmap)
    {
        children = linkedhashmap;
    }

    public String toString()
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        stringbuilder.append("<");
        stringbuilder.append(name);
        if (attributes == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = attributes.keySet().iterator();
_L4:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        stringbuilder.append(">");
        iterator = children.values().iterator();
_L5:
        if (!iterator.hasNext())
        {
            stringbuilder.append(AdMarvelXMLReader.xmlEncode(data.toString()));
            stringbuilder.append("</");
            stringbuilder.append(name);
            stringbuilder.append(">");
            return stringbuilder.toString();
        }
        break MISSING_BLOCK_LABEL_191;
_L3:
        String s = (String)iterator.next();
        stringbuilder.append(" ");
        stringbuilder.append(s);
        stringbuilder.append("=");
        stringbuilder.append("\"");
        stringbuilder.append(AdMarvelXMLReader.xmlEncode((String)attributes.get(s)));
        stringbuilder.append("\"");
          goto _L4
        Iterator iterator1 = ((ArrayList)iterator.next()).iterator();
        while (iterator1.hasNext()) 
        {
            stringbuilder.append(((AdMarvelXMLElement)iterator1.next()).toString());
        }
          goto _L5
    }
}
