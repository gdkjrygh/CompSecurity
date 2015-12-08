// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.stream.Style;

class DefaultStyle
    implements Style
{

    DefaultStyle()
    {
    }

    public String getAttribute(String s)
    {
        return s;
    }

    public String getElement(String s)
    {
        return s;
    }
}
