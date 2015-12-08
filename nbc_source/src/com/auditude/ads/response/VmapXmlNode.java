// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.response;

import com.auditude.ads.network.vast.model.VASTDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class VmapXmlNode
{
    public static class VmapXmlNodeComparator
        implements Comparator
    {

        public int compare(VmapXmlNode vmapxmlnode, VmapXmlNode vmapxmlnode1)
        {
            return vmapxmlnode.index - vmapxmlnode1.index;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((VmapXmlNode)obj, (VmapXmlNode)obj1);
        }

        public VmapXmlNodeComparator()
        {
        }
    }


    private HashMap attributes;
    private HashMap childNodes;
    public int index;
    private String name;
    private String value;
    private ArrayList vastDocuments;

    public VmapXmlNode()
    {
        index = 0;
        attributes = new HashMap();
        childNodes = new HashMap();
        vastDocuments = new ArrayList();
    }

    public void addChild(VmapXmlNode vmapxmlnode)
    {
        if (!childNodes.containsKey(vmapxmlnode.getName()))
        {
            childNodes.put(vmapxmlnode.name, new ArrayList());
        }
        vmapxmlnode.index = childNodes.size();
        ((ArrayList)childNodes.get(vmapxmlnode.getName())).add(vmapxmlnode);
    }

    public void addVastDocument(VASTDocument vastdocument)
    {
        vastDocuments.add(vastdocument);
    }

    public String getAttributeByName(String s)
    {
        return (String)attributes.get(s);
    }

    public ArrayList getChildNodes()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = childNodes.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                Collections.sort(arraylist, new VmapXmlNodeComparator());
                return arraylist;
            }
            String s = (String)iterator.next();
            arraylist.addAll((ArrayList)childNodes.get(s));
        } while (true);
    }

    public ArrayList getChildeNodesByName(String s)
    {
        return (ArrayList)childNodes.get(s);
    }

    public String getName()
    {
        return name;
    }

    public String getValue()
    {
        return value;
    }

    public ArrayList getVastDocuments()
    {
        return vastDocuments;
    }

    public void setAttribute(String s, String s1)
    {
        attributes.put(s, s1);
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setValue(String s)
    {
        value = s;
    }
}
