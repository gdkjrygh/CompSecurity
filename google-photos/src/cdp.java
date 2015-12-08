// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.w3c.dom.Element;

public final class cdp
{

    public final String a;
    public final float b;
    public final float c;
    public final int d;
    public final String e;

    public cdp(Element element)
    {
        float f;
        String s;
        int i;
        if (element.hasAttribute("name"))
        {
            s = element.getAttribute("name");
        } else
        {
            s = "";
        }
        a = s;
        if (element.hasAttribute("index"))
        {
            i = Integer.valueOf(element.getAttribute("index")).intValue();
        } else
        {
            i = -1;
        }
        d = i;
        if (element.hasAttribute("div"))
        {
            f = Float.valueOf(element.getAttribute("div")).floatValue();
        } else
        {
            f = 1.0F;
        }
        b = f;
        if (element.hasAttribute("shift"))
        {
            f = Float.valueOf(element.getAttribute("shift")).floatValue();
        } else
        {
            f = 0.0F;
        }
        c = f;
        if (element.hasAttribute("component"))
        {
            element = element.getAttribute("component");
        } else
        {
            element = null;
        }
        e = element;
    }
}
