// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import java.io.Serializable;
import org.apache.http.NameValuePair;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.LangUtils;

public class BasicNameValuePair
    implements Serializable, Cloneable, NameValuePair
{

    private static final long serialVersionUID = 0xa6a85653cc9535f8L;
    private final String name;
    private final String value;

    public BasicNameValuePair(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Name may not be null");
        } else
        {
            name = s;
            value = s1;
            return;
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }

    public boolean equals(Object obj)
    {
        boolean flag = true;
        if (obj != null)
        {
            if (this == obj)
            {
                return true;
            }
            if (obj instanceof NameValuePair)
            {
                obj = (BasicNameValuePair)obj;
                if (!name.equals(((BasicNameValuePair) (obj)).name) || !LangUtils.equals(value, ((BasicNameValuePair) (obj)).value))
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    public String getName()
    {
        return name;
    }

    public String getValue()
    {
        return value;
    }

    public int hashCode()
    {
        return LangUtils.hashCode(LangUtils.hashCode(17, name), value);
    }

    public String toString()
    {
        if (value == null)
        {
            return name;
        } else
        {
            CharArrayBuffer chararraybuffer = new CharArrayBuffer(name.length() + 1 + value.length());
            chararraybuffer.append(name);
            chararraybuffer.append("=");
            chararraybuffer.append(value);
            return chararraybuffer.toString();
        }
    }
}
