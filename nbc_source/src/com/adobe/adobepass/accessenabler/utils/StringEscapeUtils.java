// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.utils;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

// Referenced classes of package com.adobe.adobepass.accessenabler.utils:
//            Entities

public class StringEscapeUtils
{

    public StringEscapeUtils()
    {
    }

    public static String unescapeHtml(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            StringWriter stringwriter = new StringWriter((int)((double)s.length() * 1.5D));
            unescapeHtml(((Writer) (stringwriter)), s);
            s = stringwriter.toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public static void unescapeHtml(Writer writer, String s)
        throws IOException
    {
        if (writer == null)
        {
            throw new IllegalArgumentException("The Writer must not be null.");
        }
        if (s == null)
        {
            return;
        } else
        {
            Entities.HTML40.unescape(writer, s);
            return;
        }
    }
}
