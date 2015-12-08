// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.builder;


// Referenced classes of package org.apache.commons.lang3.builder:
//            ToStringStyle, ReflectionToStringBuilder

public class ToStringBuilder
{

    private static volatile ToStringStyle defaultStyle;
    private final StringBuffer buffer;
    private final Object object;
    private final ToStringStyle style;

    public ToStringBuilder(Object obj)
    {
        this(obj, null, null);
    }

    public ToStringBuilder(Object obj, ToStringStyle tostringstyle)
    {
        this(obj, tostringstyle, null);
    }

    public ToStringBuilder(Object obj, ToStringStyle tostringstyle, StringBuffer stringbuffer)
    {
        ToStringStyle tostringstyle1 = tostringstyle;
        if (tostringstyle == null)
        {
            tostringstyle1 = getDefaultStyle();
        }
        tostringstyle = stringbuffer;
        if (stringbuffer == null)
        {
            tostringstyle = new StringBuffer(512);
        }
        buffer = tostringstyle;
        style = tostringstyle1;
        object = obj;
        tostringstyle1.appendStart(tostringstyle, obj);
    }

    public static ToStringStyle getDefaultStyle()
    {
        return defaultStyle;
    }

    public static String reflectionToString(Object obj)
    {
        return ReflectionToStringBuilder.toString(obj);
    }

    public ToStringBuilder append(String s, long l)
    {
        style.append(buffer, s, l);
        return this;
    }

    public ToStringBuilder append(String s, Object obj)
    {
        style.append(buffer, s, obj, null);
        return this;
    }

    public ToStringBuilder append(String s, boolean flag)
    {
        style.append(buffer, s, flag);
        return this;
    }

    public String build()
    {
        return toString();
    }

    public Object getObject()
    {
        return object;
    }

    public StringBuffer getStringBuffer()
    {
        return buffer;
    }

    public ToStringStyle getStyle()
    {
        return style;
    }

    public String toString()
    {
        if (getObject() == null)
        {
            getStringBuffer().append(getStyle().getNullText());
        } else
        {
            style.appendEnd(getStringBuffer(), getObject());
        }
        return getStringBuffer().toString();
    }

    static 
    {
        defaultStyle = ToStringStyle.DEFAULT_STYLE;
    }
}
