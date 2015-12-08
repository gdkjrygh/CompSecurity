// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b;

import android.util.Xml;
import com.microsoft.onlineid.a.a;
import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.internal.c.e;
import com.microsoft.onlineid.internal.o;
import com.microsoft.onlineid.sts.a.f;
import com.microsoft.onlineid.sts.q;
import com.microsoft.onlineid.sts.r;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class b
{

    public b()
    {
    }

    public abstract q a();

    public final void a(InputStream inputstream)
        throws IOException, f
    {
        try
        {
            XmlPullParser xmlpullparser = Xml.newPullParser();
            inputstream = o.a(inputstream, o.a);
            d.a(new e(String.format(Locale.US, "%s: %s", new Object[] {
                getClass().getSimpleName(), inputstream
            })));
            xmlpullparser.setInput(new StringReader(inputstream));
            a(xmlpullparser);
            if (a() != null)
            {
                inputstream = a();
                com.microsoft.onlineid.a.a.a().a("Server errors", inputstream.a().name(), (new StringBuilder()).append(getClass().getSimpleName()).append(": ").append(inputstream.c()).toString());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new f("XML response could not be properly parsed.", inputstream, new Object[0]);
        }
    }

    protected abstract void a(XmlPullParser xmlpullparser)
        throws IOException, f;

    public final boolean b()
    {
        return a() == null;
    }
}
