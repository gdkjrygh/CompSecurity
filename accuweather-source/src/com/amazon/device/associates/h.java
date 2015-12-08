// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.util.Xml;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.amazon.device.associates:
//            al, bt, p, aq, 
//            s, bj

public class h extends al
{

    public h()
    {
        super("PO-h.db", 0x240c8400L);
    }

    private bt a(String s1)
        throws XmlPullParserException, IOException
    {
        bt bt1;
        XmlPullParser xmlpullparser;
        bt1 = null;
        xmlpullparser = Xml.newPullParser();
        xmlpullparser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        xmlpullparser.setInput(new StringReader(s1));
        xmlpullparser.nextTag();
        xmlpullparser.require(2, null, "PopoverTemplatesOutput");
_L4:
        if (xmlpullparser.next() == 1) goto _L2; else goto _L1
_L1:
        if (xmlpullparser.getEventType() != 2 || !xmlpullparser.getName().equals("templateURL")) goto _L4; else goto _L3
_L3:
        xmlpullparser.next();
        s1 = xmlpullparser.getText();
_L6:
        if (s1 != null)
        {
            bt1 = new bt(s1);
        }
        return bt1;
_L2:
        s1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected bt a()
    {
        StringBuilder stringbuilder;
        Object obj;
        stringbuilder = new StringBuilder();
        obj = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("popover.data")));
_L1:
        String s1 = ((BufferedReader) (obj)).readLine();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        stringbuilder.append(s1).append("\n");
          goto _L1
        Exception exception1;
        exception1;
        exception1.printStackTrace();
        p.c("Error", "Error while reading HTML file.", new Object[] {
            exception1
        });
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
            p.c("Error", "Error while closing HTML file.", new Object[] {
                obj
            });
        }
        return new bt(stringbuilder.toString());
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
            p.c("Error", "Error while closing HTML file.", new Object[] {
                obj
            });
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        Exception exception;
        exception;
        try
        {
            ((BufferedReader) (obj)).close();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            p.c("Error", "Error while closing HTML file.", new Object[] {
                ioexception
            });
        }
        throw exception;
    }

    protected transient bt a(al aal[])
    {
        aal = aal[0];
        try
        {
            aq aq1 = new aq("http://assoc-msdk-us.amazon-adsystem.com/getPopoverTemplates");
            aq1.a("MarketplaceID", "ATVPDKIKX0DER");
            aq1.a(s.a);
            if (aq1.b() == 200)
            {
                aal.a = a(aq1.a());
                aal.b(true);
                aal.a(true);
            }
        }
        catch (Exception exception)
        {
            p.c("PopoverHTMLTemplate", "Service call threw exception.", new Object[] {
                exception
            });
        }
        return (bt)((al) (aal)).a;
    }

    protected volatile bj b()
    {
        return a();
    }

    public volatile String c()
    {
        return super.c();
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return a((al[])aobj);
    }
}
