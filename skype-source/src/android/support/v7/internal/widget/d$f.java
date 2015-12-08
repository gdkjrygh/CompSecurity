// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package android.support.v7.internal.widget:
//            d

private final class <init> extends AsyncTask
{

    final d a;

    private transient Void a(Object aobj[])
    {
        Object obj1;
        List list = (List)aobj[0];
        obj1 = (String)aobj[1];
        <init> <init>1;
        int i;
        int j;
        try
        {
            aobj = d.a(a).openFileOutput(((String) (obj1)), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            Log.e(d.d(), (new StringBuilder("Error writing historical recrod file: ")).append(((String) (obj1))).toString(), ((Throwable) (aobj)));
            return null;
        }
        obj1 = Xml.newSerializer();
        ((XmlSerializer) (obj1)).setOutput(((java.io.OutputStream) (aobj)), null);
        ((XmlSerializer) (obj1)).startDocument("UTF-8", Boolean.valueOf(true));
        ((XmlSerializer) (obj1)).startTag(null, "historical-records");
        j = list.size();
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        <init>1 = (ent)list.remove(0);
        ((XmlSerializer) (obj1)).startTag(null, "historical-record");
        ((XmlSerializer) (obj1)).attribute(null, "activity", <init>1.a.flattenToString());
        ((XmlSerializer) (obj1)).attribute(null, "time", String.valueOf(<init>1.b));
        ((XmlSerializer) (obj1)).attribute(null, "weight", String.valueOf(<init>1.c));
        ((XmlSerializer) (obj1)).endTag(null, "historical-record");
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        ((XmlSerializer) (obj1)).endTag(null, "historical-records");
        ((XmlSerializer) (obj1)).endDocument();
        d.c(a);
        Object obj;
        if (aobj != null)
        {
            try
            {
                ((FileOutputStream) (aobj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[]) { }
        }
        return null;
        obj;
        Log.e(d.d(), (new StringBuilder("Error writing historical recrod file: ")).append(d.b(a)).toString(), ((Throwable) (obj)));
        d.c(a);
        if (aobj != null)
        {
            try
            {
                ((FileOutputStream) (aobj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[]) { }
        }
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e(d.d(), (new StringBuilder("Error writing historical recrod file: ")).append(d.b(a)).toString(), ((Throwable) (obj)));
        d.c(a);
        if (aobj != null)
        {
            try
            {
                ((FileOutputStream) (aobj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[]) { }
        }
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e(d.d(), (new StringBuilder("Error writing historical recrod file: ")).append(d.b(a)).toString(), ((Throwable) (obj)));
        d.c(a);
        if (aobj != null)
        {
            try
            {
                ((FileOutputStream) (aobj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[]) { }
        }
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_396;
_L4:
        break MISSING_BLOCK_LABEL_233;
        obj;
        d.c(a);
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

    private (d d1)
    {
        a = d1;
        super();
    }

    a(d d1, byte byte0)
    {
        this(d1);
    }
}
