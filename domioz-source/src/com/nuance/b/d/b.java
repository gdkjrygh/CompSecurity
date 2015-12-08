// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.d;

import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.io.StringWriter;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package com.nuance.b.d:
//            c, d

public final class b
{

    private static final Pattern g = Pattern.compile("(((([a-z]){1,8}|\\*)(-((([a-z])|([0-9])){1,8}|\\*))*)(:((([a-z]){1,8}|\\*)(-((([a-z])|([0-9])){1,8}|\\*))*))?)");
    public String a;
    public c b;
    public int c;
    public int d;
    public d e;
    private String f;
    private String h;
    private String i;

    public b()
    {
        a = null;
        b = null;
        c = -1;
        d = -1;
        f = null;
        h = null;
        i = null;
        e = null;
    }

    public b(String s)
    {
        a = null;
        b = null;
        c = -1;
        d = -1;
        f = null;
        h = null;
        i = null;
        e = null;
        a = s;
    }

    public final void a(XmlSerializer xmlserializer)
    {
        boolean flag;
        flag = false;
        xmlserializer.startTag(null, "voice");
        if (b != null)
        {
            xmlserializer.attribute(null, "gender", b.toString());
        }
        if (c >= 0)
        {
            xmlserializer.attribute(null, "age", Integer.toString(c));
        }
        if (d > 0)
        {
            xmlserializer.attribute(null, "variant", Integer.toString(d));
        }
        if (a == null) goto _L2; else goto _L1
_L1:
        String s;
        int j;
        int k;
        s = a;
        k = s.length();
        j = 0;
_L5:
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        if (Character.isWhitespace(s.charAt(j))) goto _L4; else goto _L3
_L3:
        j = ((flag) ? 1 : 0);
_L6:
        if (j == 0)
        {
            xmlserializer.attribute(null, "name", a);
        }
_L2:
        if (f != null)
        {
            xmlserializer.attribute(null, "languages", f);
        }
        if (h != null)
        {
            xmlserializer.attribute(null, "required", h);
        }
        if (i != null)
        {
            xmlserializer.attribute(null, "ordering", i);
        }
        if (e != null)
        {
            xmlserializer.attribute(null, "onvoicefailure", e.toString());
        }
        return;
_L4:
        j++;
          goto _L5
        j = 1;
          goto _L6
    }

    public final String toString()
    {
        Object obj = Xml.newSerializer();
        StringWriter stringwriter = new StringWriter();
        try
        {
            ((XmlSerializer) (obj)).setOutput(stringwriter);
            a(((XmlSerializer) (obj)));
            ((XmlSerializer) (obj)).flush();
            obj = stringwriter.toString();
        }
        catch (IOException ioexception)
        {
            Log.e("SsmlBuilder", "Voice.toString. eating IOException ", ioexception);
            return "";
        }
        return ((String) (obj));
    }

}
