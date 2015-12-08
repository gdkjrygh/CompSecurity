// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package android.support.v7.internal.widget:
//            j, m

final class o extends AsyncTask
{

    final j a;

    o(j j1)
    {
        a = j1;
        super();
    }

    private transient Void a(Object aobj[])
    {
        List list;
        int i;
        i = 0;
        list = (List)aobj[0];
        aobj = (String)aobj[1];
        aobj = j.a(a).openFileOutput(((String) (aobj)), 0);
        XmlSerializer xmlserializer = Xml.newSerializer();
        int k;
        xmlserializer.setOutput(((java.io.OutputStream) (aobj)), null);
        xmlserializer.startDocument("UTF-8", Boolean.valueOf(true));
        xmlserializer.startTag(null, "historical-records");
        k = list.size();
_L2:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        m m1 = (m)list.remove(0);
        xmlserializer.startTag(null, "historical-record");
        xmlserializer.attribute(null, "activity", m1.a.flattenToString());
        xmlserializer.attribute(null, "time", String.valueOf(m1.b));
        xmlserializer.attribute(null, "weight", String.valueOf(m1.c));
        xmlserializer.endTag(null, "historical-record");
        i++;
        if (true) goto _L2; else goto _L1
        aobj;
        j.e();
_L3:
        return null;
_L1:
        xmlserializer.endTag(null, "historical-records");
        xmlserializer.endDocument();
        j.c(a);
        if (aobj != null)
        {
            try
            {
                ((FileOutputStream) (aobj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                return null;
            }
            return null;
        }
          goto _L3
        Object obj;
        obj;
        j.e();
        (new StringBuilder("Error writing historical recrod file: ")).append(j.b(a));
        j.c(a);
        if (aobj != null)
        {
            try
            {
                ((FileOutputStream) (aobj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                return null;
            }
            return null;
        }
          goto _L3
        obj;
        j.e();
        (new StringBuilder("Error writing historical recrod file: ")).append(j.b(a));
        j.c(a);
        if (aobj != null)
        {
            try
            {
                ((FileOutputStream) (aobj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                return null;
            }
            return null;
        }
          goto _L3
        obj;
        j.e();
        (new StringBuilder("Error writing historical recrod file: ")).append(j.b(a));
        j.c(a);
        if (aobj == null) goto _L3; else goto _L4
_L4:
        try
        {
            ((FileOutputStream) (aobj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            return null;
        }
        return null;
        obj;
        j.c(a);
        if (aobj != null)
        {
            try
            {
                ((FileOutputStream) (aobj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[]) { }
        }
        throw obj;
    }

    public final Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }
}
