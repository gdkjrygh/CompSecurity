// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;

import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlUtils
{

    private HtmlUtils()
    {
    }

    public static boolean isChildOf(Element element, Elements elements)
    {
        for (element = element.parents().iterator(); element.hasNext();)
        {
            if (elements.contains((Element)element.next()))
            {
                return true;
            }
        }

        return false;
    }

    public static Element toElement(String s)
    {
        return toElement(s, null);
    }

    public static Element toElement(String s, String s1)
    {
        if (s1 == null)
        {
            s = Jsoup.parse(s);
        } else
        {
            s = Jsoup.parse(s, s1);
        }
        return s.getElementsByTag("body").first().children().first();
    }
}
