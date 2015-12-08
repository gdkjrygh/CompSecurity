// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package com.actionbarsherlock.widget:
//            ActivityChooserModel

private final class <init>
    implements Runnable
{

    final ActivityChooserModel this$0;

    public void run()
    {
        Object obj1 = ActivityChooserModel.access$2(ActivityChooserModel.this);
        obj1;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList(ActivityChooserModel.access$3(ActivityChooserModel.this));
        obj1;
        JVM INSTR monitorexit ;
        Object obj;
        int i;
        int j;
        try
        {
            obj = ActivityChooserModel.access$0(ActivityChooserModel.this).openFileOutput(ActivityChooserModel.access$1(ActivityChooserModel.this), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(ActivityChooserModel.access$8(), (new StringBuilder("Error writing historical recrod file: ")).append(ActivityChooserModel.access$1(ActivityChooserModel.this)).toString(), ((Throwable) (obj)));
            return;
        }
        obj1 = Xml.newSerializer();
        ((XmlSerializer) (obj1)).setOutput(((java.io.OutputStream) (obj)), null);
        ((XmlSerializer) (obj1)).startDocument("UTF-8", Boolean.valueOf(true));
        ((XmlSerializer) (obj1)).startTag(null, "historical-records");
        j = arraylist.size();
        i = 0;
_L3:
        if (i < j) goto _L2; else goto _L1
_L1:
        ((XmlSerializer) (obj1)).endTag(null, "historical-records");
        ((XmlSerializer) (obj1)).endDocument();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        ((FileOutputStream) (obj)).close();
_L4:
        return;
        obj;
_L6:
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        <init> <init>1 = (this._cls0)arraylist.remove(0);
        ((XmlSerializer) (obj1)).startTag(null, "historical-record");
        ((XmlSerializer) (obj1)).attribute(null, "activity", <init>1.activity.flattenToString());
        ((XmlSerializer) (obj1)).attribute(null, "time", String.valueOf(<init>1.time));
        ((XmlSerializer) (obj1)).attribute(null, "weight", String.valueOf(<init>1.weight));
        ((XmlSerializer) (obj1)).endTag(null, "historical-record");
        i++;
          goto _L3
        Object obj2;
        obj2;
        Log.e(ActivityChooserModel.access$8(), (new StringBuilder("Error writing historical recrod file: ")).append(ActivityChooserModel.access$1(ActivityChooserModel.this)).toString(), ((Throwable) (obj2)));
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
        }
          goto _L4
        obj2;
        Log.e(ActivityChooserModel.access$8(), (new StringBuilder("Error writing historical recrod file: ")).append(ActivityChooserModel.access$1(ActivityChooserModel.this)).toString(), ((Throwable) (obj2)));
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
        }
          goto _L4
        obj2;
        Log.e(ActivityChooserModel.access$8(), (new StringBuilder("Error writing historical recrod file: ")).append(ActivityChooserModel.access$1(ActivityChooserModel.this)).toString(), ((Throwable) (obj2)));
        if (obj == null) goto _L4; else goto _L5
_L5:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj2;
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw obj2;
        obj;
        return;
        obj;
          goto _L6
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
