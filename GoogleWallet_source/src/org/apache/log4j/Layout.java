// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j;

import org.apache.log4j.spi.OptionHandler;

public abstract class Layout
    implements OptionHandler
{

    public static final String LINE_SEP;
    public static final int LINE_SEP_LEN;

    public Layout()
    {
    }

    static 
    {
        String s = System.getProperty("line.separator");
        LINE_SEP = s;
        LINE_SEP_LEN = s.length();
    }
}
