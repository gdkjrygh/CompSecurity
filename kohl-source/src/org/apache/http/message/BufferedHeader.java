// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import org.apache.http.FormattedHeader;
import org.apache.http.HeaderElement;
import org.apache.http.ParseException;
import org.apache.http.util.CharArrayBuffer;

public class BufferedHeader
    implements FormattedHeader, Cloneable
{

    public BufferedHeader(CharArrayBuffer chararraybuffer)
        throws ParseException
    {
        throw new RuntimeException("Stub!");
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new RuntimeException("Stub!");
    }

    public CharArrayBuffer getBuffer()
    {
        throw new RuntimeException("Stub!");
    }

    public HeaderElement[] getElements()
        throws ParseException
    {
        throw new RuntimeException("Stub!");
    }

    public String getName()
    {
        throw new RuntimeException("Stub!");
    }

    public String getValue()
    {
        throw new RuntimeException("Stub!");
    }

    public int getValuePos()
    {
        throw new RuntimeException("Stub!");
    }

    public String toString()
    {
        throw new RuntimeException("Stub!");
    }
}
