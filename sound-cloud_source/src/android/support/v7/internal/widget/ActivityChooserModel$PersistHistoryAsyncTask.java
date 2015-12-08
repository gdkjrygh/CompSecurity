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
//            ActivityChooserModel

private final class <init> extends AsyncTask
{

    final ActivityChooserModel this$0;

    public final volatile Object doInBackground(Object aobj[])
    {
        return doInBackground(aobj);
    }

    public final transient Void doInBackground(Object aobj[])
    {
        List list;
        int i;
        i = 0;
        list = (List)aobj[0];
        aobj = (String)aobj[1];
        aobj = ActivityChooserModel.access$200(ActivityChooserModel.this).openFileOutput(((String) (aobj)), 0);
        XmlSerializer xmlserializer = Xml.newSerializer();
        int j;
        xmlserializer.setOutput(((java.io.OutputStream) (aobj)), null);
        xmlserializer.startDocument("UTF-8", Boolean.valueOf(true));
        xmlserializer.startTag(null, "historical-records");
        j = list.size();
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        doInBackground doinbackground = (this._cls0)list.remove(0);
        xmlserializer.startTag(null, "historical-record");
        xmlserializer.attribute(null, "activity", doinbackground.y.flattenToString());
        xmlserializer.attribute(null, "time", String.valueOf(doinbackground.y));
        xmlserializer.attribute(null, "weight", String.valueOf(doinbackground.y));
        xmlserializer.endTag(null, "historical-record");
        i++;
        if (true) goto _L2; else goto _L1
        aobj;
        ActivityChooserModel.access$300();
_L3:
        return null;
_L1:
        xmlserializer.endTag(null, "historical-records");
        xmlserializer.endDocument();
        ActivityChooserModel.access$502(ActivityChooserModel.this, true);
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
        ActivityChooserModel.access$300();
        (new StringBuilder("Error writing historical recrod file: ")).append(ActivityChooserModel.access$400(ActivityChooserModel.this));
        ActivityChooserModel.access$502(ActivityChooserModel.this, true);
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
        ActivityChooserModel.access$300();
        (new StringBuilder("Error writing historical recrod file: ")).append(ActivityChooserModel.access$400(ActivityChooserModel.this));
        ActivityChooserModel.access$502(ActivityChooserModel.this, true);
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
        ActivityChooserModel.access$300();
        (new StringBuilder("Error writing historical recrod file: ")).append(ActivityChooserModel.access$400(ActivityChooserModel.this));
        ActivityChooserModel.access$502(ActivityChooserModel.this, true);
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
        ActivityChooserModel.access$502(ActivityChooserModel.this, true);
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

    private ()
    {
        this$0 = ActivityChooserModel.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
