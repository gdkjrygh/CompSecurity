// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.models;

import com.adobe.adobepass.accessenabler.utils.SerializableNameValuePair;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class MetadataKey
    implements Serializable
{

    private ArrayList args;
    private int key;

    public MetadataKey(int i)
    {
        key = i;
        args = new ArrayList();
    }

    public void addArgument(SerializableNameValuePair serializablenamevaluepair)
    {
        args.add(serializablenamevaluepair);
    }

    public String getArgument(String s)
    {
        for (Iterator iterator = args.iterator(); iterator.hasNext();)
        {
            SerializableNameValuePair serializablenamevaluepair = (SerializableNameValuePair)iterator.next();
            if (serializablenamevaluepair.getName().equals(s))
            {
                return serializablenamevaluepair.getValue();
            }
        }

        return null;
    }

    public String getArgumentsAsString()
    {
        String s = "";
        for (Iterator iterator = args.iterator(); iterator.hasNext();)
        {
            SerializableNameValuePair serializablenamevaluepair = (SerializableNameValuePair)iterator.next();
            s = (new StringBuilder()).append(s).append(serializablenamevaluepair.getName()).append("=").append(serializablenamevaluepair.getValue()).append("(^)").toString();
        }

        if ("".equals(s))
        {
            return "";
        } else
        {
            return s.substring(0, s.length() - 3);
        }
    }

    public int getKey()
    {
        return key;
    }
}
