// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Process;
import android.util.Base64;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public final class ecf
{

    private final Map a;

    public ecf(Context context)
    {
        a = a(context.getResources().getXml(0x7f060000));
    }

    private static Map a(XmlResourceParser xmlresourceparser)
    {
        HashMap hashmap = new HashMap();
        int i = xmlresourceparser.next();
_L2:
        if (i == 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i != 2)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        Object obj;
        String s2;
        ecg ecg1;
        if (!xmlresourceparser.getName().equals("signing_certificate"))
        {
            break MISSING_BLOCK_LABEL_160;
        }
        String s = xmlresourceparser.getAttributeValue(null, "name");
        obj = xmlresourceparser.getAttributeValue(null, "package");
        boolean flag = xmlresourceparser.getAttributeBooleanValue(null, "release", false);
        s2 = xmlresourceparser.nextText().replaceAll("\\s|\\n", "");
        ecg1 = new ecg(s, ((String) (obj)), flag);
        obj = (ArrayList)hashmap.get(s2);
        ArrayList arraylist;
        arraylist = ((ArrayList) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        arraylist = new ArrayList();
        hashmap.put(s2, arraylist);
        String s1 = ecg1.a;
        s1 = ecg1.b;
        boolean flag1 = ecg1.c;
        arraylist.add(ecg1);
        i = xmlresourceparser.next();
        if (true) goto _L2; else goto _L1
        xmlresourceparser;
_L4:
        Logger.b(xmlresourceparser, "Could not read allowed callers from XML.", new Object[0]);
_L1:
        return hashmap;
        xmlresourceparser;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a(Context context, String s, int i)
    {
        if (1000 == i || Process.myUid() == i)
        {
            return true;
        }
        context = context.getPackageManager();
        try
        {
            context = context.getPackageInfo(s, 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.a(context, "Package manager can't find package: ", new Object[] {
                s
            });
            return false;
        }
        if (((PackageInfo) (context)).signatures.length != 1)
        {
            Logger.b("Caller has more than one signature certificate!", new Object[0]);
            return false;
        }
        context = Base64.encodeToString(((PackageInfo) (context)).signatures[0].toByteArray(), 2);
        Object obj = (ArrayList)a.get(context);
        if (obj == null)
        {
            if (a.isEmpty())
            {
                Logger.b("The list of valid certificates is empty. Either your file ", new Object[] {
                    "res/xml/allowed_media_browser_callers.xml is empty or there was an error ", "while reading it. Check previous log messages."
                });
            }
            return false;
        }
        StringBuilder stringbuilder = new StringBuilder();
        ecg ecg1;
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append(ecg1.b).append(' '))
        {
            ecg1 = (ecg)((Iterator) (obj)).next();
            if (s.equals(ecg1.b))
            {
                return true;
            }
        }

        Logger.a("Caller has a valid certificate, but its package doesn't match any ", new Object[] {
            "expected package for the given certificate. Caller's package is ", s, ". Expected packages as defined in res/xml/allowed_media_browser_callers.xml are (%s). This caller's certificate is: %s\n", stringbuilder.toString(), context
        });
        return false;
    }
}
