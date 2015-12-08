// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import java.io.Serializable;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.message:
//            BasicHeaderValueParser, BasicLineFormatter

public class BasicHeader
    implements Serializable, Cloneable, Header
{

    private static final long serialVersionUID = 0xb4ae9550d79ce842L;
    private final String name;
    private final String value;

    public BasicHeader(String s, String s1)
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
    {
        return super.clone();
    }

    public HeaderElement[] getElements()
    {
        if (value != null)
        {
            return BasicHeaderValueParser.parseElements(value, null);
        } else
        {
            return new HeaderElement[0];
        }
    }

    public String getName()
    {
        return name;
    }

    public String getValue()
    {
        return value;
    }

    public String toString()
    {
        return BasicLineFormatter.DEFAULT.formatHeader(null, this).toString();
    }
}
