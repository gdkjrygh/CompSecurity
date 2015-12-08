// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker;

import fs.org.simpleframework.xml.transform.Matcher;
import fs.org.simpleframework.xml.transform.Transform;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMatcher
    implements Matcher, Transform
{

    private DateFormat format;

    public DateMatcher()
    {
        format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm.ss.SSS");
    }

    public Transform match(Class class1)
        throws Exception
    {
        if (class1 == java/util/Date)
        {
            return this;
        } else
        {
            return null;
        }
    }

    public volatile Object read(String s)
        throws Exception
    {
        return read(s);
    }

    public Date read(String s)
        throws Exception
    {
        return format.parse(s);
    }

    public volatile String write(Object obj)
        throws Exception
    {
        return write((Date)obj);
    }

    public String write(Date date)
        throws Exception
    {
        return format.format(date);
    }
}
