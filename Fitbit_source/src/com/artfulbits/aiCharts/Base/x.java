// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            e

abstract class x
{

    x()
    {
    }

    public static String a(XmlPullParser xmlpullparser, int i)
        throws XmlPullParserException, IOException
    {
_L6:
        xmlpullparser.next();
        JVM INSTR tableswitch 2 3: default 28
    //                   2 40
    //                   3 47;
           goto _L1 _L2 _L3
_L1:
        if (xmlpullparser.getDepth() < i)
        {
            return null;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        return xmlpullparser.getName();
_L3:
        if (i == xmlpullparser.getDepth())
        {
            return null;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected static void a(x x1, Resources resources, XmlPullParser xmlpullparser)
        throws XmlPullParserException, IOException
    {
        AttributeSet attributeset = Xml.asAttributeSet(xmlpullparser);
        int j = attributeset.getAttributeCount();
        int k = xmlpullparser.getDepth();
        for (int i = 0; i < j; i++)
        {
            x1.a(resources, attributeset.getAttributeName(i), i, attributeset);
        }

        do
        {
            String s = a(xmlpullparser, k);
            if (s != null)
            {
                x x2 = x1.b(s);
                if (x2 != null)
                {
                    a(x2, resources, xmlpullparser);
                } else
                {
                    throw new RuntimeException((new StringBuilder("unknown tag")).append(s).toString());
                }
            } else
            {
                return;
            }
        } while (true);
    }

    protected void a(Resources resources, String s, int i, AttributeSet attributeset)
    {
    }

    protected x b(String s)
    {
        return null;
    }

    protected abstract e l();
}
