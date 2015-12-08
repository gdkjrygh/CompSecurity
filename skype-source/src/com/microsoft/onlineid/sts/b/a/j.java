// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import android.text.TextUtils;
import com.microsoft.onlineid.sts.a.f;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a

final class j
{

    private final XmlPullParser a;
    private final int b;

    j(XmlPullParser xmlpullparser)
    {
        a = xmlpullparser;
        b = xmlpullparser.getDepth();
    }

    final boolean a()
        throws XmlPullParserException
    {
        boolean flag = false;
        a.getEventType();
        JVM INSTR tableswitch 1 3: default 36
    //                   1 38
    //                   2 36
    //                   3 40;
           goto _L1 _L2 _L1 _L3
_L1:
        flag = true;
_L2:
        return flag;
_L3:
        if (b == a.getDepth())
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    final boolean a(String s)
        throws XmlPullParserException, IOException
    {
        for (; e(); d())
        {
            if (com.microsoft.onlineid.sts.b.a.a.a(a).equals(s))
            {
                return true;
            }
        }

        return false;
    }

    final void b()
        throws XmlPullParserException, IOException
    {
        for (; a(); a.next()) { }
    }

    final void b(String s)
        throws XmlPullParserException, IOException, f
    {
        if (!a(s))
        {
            throw new f("Required node \"%s\" is missing.", new Object[] {
                s
            });
        } else
        {
            return;
        }
    }

    final int c()
    {
        return b;
    }

    protected final void d()
        throws XmlPullParserException, IOException
    {
        int k = a.getDepth();
        if (k == b)
        {
            b();
        } else
        {
            int i = a.getEventType();
            while (k != a.getDepth() || i != 3) 
            {
                i = a.next();
            }
        }
    }

    final boolean e()
        throws XmlPullParserException, IOException
    {
        while (a()) 
        {
            if (a.next() == 2)
            {
                return true;
            }
        }
        return false;
    }

    final String f()
        throws XmlPullParserException, IOException, f
    {
        String s = a.getName();
        String s1 = a.nextText();
        if (TextUtils.isEmpty(s1))
        {
            throw new f(String.format(Locale.US, "Expected text of %s is empty", new Object[] {
                s
            }), new Object[0]);
        } else
        {
            return s1;
        }
    }
}
