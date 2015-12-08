// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api.c;

import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public final class l
{

    public static String a(Set set)
    {
        Object obj;
        XmlSerializer xmlserializer;
        obj = set;
        if (set == null)
        {
            obj = Collections.emptySet();
        }
        set = new StringWriter();
        xmlserializer = Xml.newSerializer();
        IllegalArgumentException illegalargumentexception;
        xmlserializer.setOutput(set);
        xmlserializer.startTag("", "AA_set");
        String s;
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); xmlserializer.startTag("", "AA_string").text(s).endTag("", "AA_string"))
        {
            s = (String)((Iterator) (obj)).next();
        }

          goto _L1
_L3:
        return set.toString();
_L1:
        try
        {
            xmlserializer.endTag("", "AA_set").endDocument();
        }
        // Misplaced declaration of an exception variable
        catch (IllegalArgumentException illegalargumentexception) { }
        catch (IllegalStateException illegalstateexception) { }
        catch (IOException ioexception) { }
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static Set a(String s)
    {
        TreeSet treeset;
        XmlPullParser xmlpullparser;
        treeset = new TreeSet();
        xmlpullparser = Xml.newPullParser();
        xmlpullparser.setInput(new StringReader(s));
        xmlpullparser.next();
        xmlpullparser.require(2, "", "AA_set");
_L2:
        s = treeset;
        if (xmlpullparser.next() == 3)
        {
            break; /* Loop/switch isn't completed */
        }
        xmlpullparser.require(2, "", "AA_string");
        xmlpullparser.next();
        xmlpullparser.require(4, null, null);
        treeset.add(xmlpullparser.getText());
        xmlpullparser.next();
        xmlpullparser.require(3, null, "AA_string");
        if (true) goto _L2; else goto _L1
        s;
        Log.w("getStringSet", s);
        s = null;
_L1:
        return s;
        s;
        Log.w("getStringSet", s);
        return null;
    }
}
