// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util;

import org.xmlpull.v1.XmlPullParser;

public final class XMLUtil
{

    public XMLUtil()
    {
    }

    public static boolean attributeAsBoolOrDefault(XmlPullParser xmlpullparser, String s, boolean flag)
    {
        xmlpullparser = xmlpullparser.getAttributeValue(null, s);
        if (xmlpullparser == null)
        {
            return flag;
        } else
        {
            return Boolean.parseBoolean(xmlpullparser);
        }
    }

    public static int attributeAsIntOrDefault(XmlPullParser xmlpullparser, String s, int i)
    {
        xmlpullparser = xmlpullparser.getAttributeValue(null, s);
        if (xmlpullparser == null)
        {
            return i;
        }
        int j;
        try
        {
            j = Integer.parseInt(xmlpullparser);
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            return i;
        }
        return j;
    }

    public static String attributeAsStringOrDefault(XmlPullParser xmlpullparser, String s, String s1)
    {
        xmlpullparser = xmlpullparser.getAttributeValue(null, s);
        if (xmlpullparser == null)
        {
            return s1;
        } else
        {
            return xmlpullparser;
        }
    }
}
