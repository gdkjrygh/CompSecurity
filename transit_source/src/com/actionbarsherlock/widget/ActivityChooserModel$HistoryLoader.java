// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.actionbarsherlock.widget:
//            ActivityChooserModel

private final class <init>
    implements Runnable
{

    final ActivityChooserModel this$0;

    public void run()
    {
        Object obj;
        Object obj1;
        int i;
        try
        {
            obj = ActivityChooserModel.access$0(ActivityChooserModel.this).openFileInput(ActivityChooserModel.access$1(ActivityChooserModel.this));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj1 = Xml.newPullParser();
        ((XmlPullParser) (obj1)).setInput(((java.io.InputStream) (obj)), null);
        i = 0;
          goto _L1
_L14:
        if (!"historical-records".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file does not start with historical-records tag.");
        }
          goto _L2
        obj1;
        Log.e(ActivityChooserModel.access$8(), (new StringBuilder("Error reading historical recrod file: ")).append(ActivityChooserModel.access$1(ActivityChooserModel.this)).toString(), ((Throwable) (obj1)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        ((FileInputStream) (obj)).close();
_L8:
        return;
_L15:
        i = ((XmlPullParser) (obj1)).next();
        continue; /* Loop/switch isn't completed */
_L2:
        Object obj2 = new ArrayList();
_L10:
        i = ((XmlPullParser) (obj1)).next();
        if (i != 1) goto _L4; else goto _L3
_L3:
        obj1 = ActivityChooserModel.access$2(ActivityChooserModel.this);
        obj1;
        JVM INSTR monitorenter ;
        List list;
        obj2 = new LinkedHashSet(((java.util.Collection) (obj2)));
        list = ActivityChooserModel.access$3(ActivityChooserModel.this);
        i = list.size() - 1;
_L12:
        if (i >= 0) goto _L6; else goto _L5
_L5:
        if (list.size() != ((Set) (obj2)).size())
        {
            break MISSING_BLOCK_LABEL_375;
        }
        obj1;
        JVM INSTR monitorexit ;
        if (obj == null) goto _L8; else goto _L7
_L7:
        try
        {
            ((FileInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
_L4:
        if (i == 3 || i == 4) goto _L10; else goto _L9
_L9:
        if (!"historical-record".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file not well-formed.");
        }
        break MISSING_BLOCK_LABEL_286;
        obj1;
        Log.e(ActivityChooserModel.access$8(), (new StringBuilder("Error reading historical recrod file: ")).append(ActivityChooserModel.access$1(ActivityChooserModel.this)).toString(), ((Throwable) (obj1)));
        if (obj == null) goto _L8; else goto _L11
_L11:
        try
        {
            ((FileInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        ((List) (obj2)).add(new rd(((XmlPullParser) (obj1)).getAttributeValue(null, "activity"), Long.parseLong(((XmlPullParser) (obj1)).getAttributeValue(null, "time")), Float.parseFloat(((XmlPullParser) (obj1)).getAttributeValue(null, "weight"))));
          goto _L10
        obj1;
        IOException ioexception;
        Exception exception;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw obj1;
_L6:
        ((Set) (obj2)).add((rd)list.get(i));
        i--;
          goto _L12
        list.clear();
        list.addAll(((java.util.Collection) (obj2)));
        ActivityChooserModel.access$4(ActivityChooserModel.this, true);
        ActivityChooserModel.access$5(ActivityChooserModel.this).post(new Runnable() {

            final ActivityChooserModel.HistoryLoader this$1;

            public void run()
            {
                ActivityChooserModel.access$6(this$0);
                ActivityChooserModel.access$7(this$0);
            }

            
            {
                this$1 = ActivityChooserModel.HistoryLoader.this;
                super();
            }
        });
        obj1;
        JVM INSTR monitorexit ;
        if (obj == null) goto _L8; else goto _L13
_L13:
        try
        {
            ((FileInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            return;
        }
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        ioexception;
        return;
_L1:
        if (i != 1 && i != 2) goto _L15; else goto _L14
    }


    private _cls1.this._cls1()
    {
        this$0 = ActivityChooserModel.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
