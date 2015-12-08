// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

public class BasicHeaderElement
    implements Cloneable, HeaderElement
{

    private final String name;
    private final NameValuePair parameters[];
    private final String value;

    public BasicHeaderElement(String s, String s1, NameValuePair anamevaluepair[])
    {
        name = (String)Args.notNull(s, "Name");
        value = s1;
        if (anamevaluepair != null)
        {
            parameters = anamevaluepair;
            return;
        } else
        {
            parameters = new NameValuePair[0];
            return;
        }
    }

    public Object clone()
    {
        return super.clone();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof HeaderElement)
            {
                if (!name.equals(((BasicHeaderElement) (obj = (BasicHeaderElement)obj)).name) || !LangUtils.equals(value, ((BasicHeaderElement) (obj)).value) || !LangUtils.equals(parameters, ((BasicHeaderElement) (obj)).parameters))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public String getName()
    {
        return name;
    }

    public NameValuePair[] getParameters()
    {
        return (NameValuePair[])parameters.clone();
    }

    public String getValue()
    {
        return value;
    }

    public int hashCode()
    {
        int j = LangUtils.hashCode(LangUtils.hashCode(17, name), value);
        NameValuePair anamevaluepair[] = parameters;
        int k = anamevaluepair.length;
        for (int i = 0; i < k; i++)
        {
            j = LangUtils.hashCode(j, anamevaluepair[i]);
        }

        return j;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(name);
        if (value != null)
        {
            stringbuilder.append("=");
            stringbuilder.append(value);
        }
        NameValuePair anamevaluepair[] = parameters;
        int j = anamevaluepair.length;
        for (int i = 0; i < j; i++)
        {
            NameValuePair namevaluepair = anamevaluepair[i];
            stringbuilder.append("; ");
            stringbuilder.append(namevaluepair);
        }

        return stringbuilder.toString();
    }
}
