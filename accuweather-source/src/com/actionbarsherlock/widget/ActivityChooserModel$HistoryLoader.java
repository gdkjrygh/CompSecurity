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
        Object obj = ActivityChooserModel.access$400(ActivityChooserModel.this).openFileInput(ActivityChooserModel.access$300(ActivityChooserModel.this));
        Object obj1;
        obj1 = Xml.newPullParser();
        ((XmlPullParser) (obj1)).setInput(((java.io.InputStream) (obj)), null);
        int i = 0;
_L1:
        if (i == 1 || i == 2)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        i = ((XmlPullParser) (obj1)).next();
          goto _L1
        if (!"historical-records".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file does not start with historical-records tag.");
        }
        break MISSING_BLOCK_LABEL_125;
        obj1;
        Log.e(ActivityChooserModel.access$1100(), (new StringBuilder()).append("Error reading historical recrod file: ").append(ActivityChooserModel.access$300(ActivityChooserModel.this)).toString(), ((Throwable) (obj1)));
        if (obj != null)
        {
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
        }
        break MISSING_BLOCK_LABEL_457;
        Object obj2 = new ArrayList();
_L6:
        i = ((XmlPullParser) (obj1)).next();
        if (i != 1) goto _L3; else goto _L2
_L2:
        obj1 = ActivityChooserModel.access$500(ActivityChooserModel.this);
        obj1;
        JVM INSTR monitorenter ;
        List list;
        obj2 = new LinkedHashSet(((java.util.Collection) (obj2)));
        list = ActivityChooserModel.access$600(ActivityChooserModel.this);
        i = list.size() - 1;
_L4:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_361;
        }
        ((Set) (obj2)).add((rd)list.get(i));
        i--;
        if (true) goto _L4; else goto _L3
_L3:
        if (i == 3 || i == 4) goto _L6; else goto _L5
_L5:
        if (!"historical-record".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file not well-formed.");
        }
        break MISSING_BLOCK_LABEL_300;
        obj1;
        Log.e(ActivityChooserModel.access$1100(), (new StringBuilder()).append("Error reading historical recrod file: ").append(ActivityChooserModel.access$300(ActivityChooserModel.this)).toString(), ((Throwable) (obj1)));
        if (obj != null)
        {
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
        }
        break MISSING_BLOCK_LABEL_457;
        ((List) (obj2)).add(new rd(((XmlPullParser) (obj1)).getAttributeValue(null, "activity"), Long.parseLong(((XmlPullParser) (obj1)).getAttributeValue(null, "time")), Float.parseFloat(((XmlPullParser) (obj1)).getAttributeValue(null, "weight"))));
          goto _L6
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
        if (list.size() != ((Set) (obj2)).size())
        {
            break MISSING_BLOCK_LABEL_390;
        }
        obj1;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
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
        }
        break MISSING_BLOCK_LABEL_457;
        list.clear();
        list.addAll(((java.util.Collection) (obj2)));
        ActivityChooserModel.access$702(ActivityChooserModel.this, true);
        ActivityChooserModel.access$1000(ActivityChooserModel.this).post(new Runnable() {

            final ActivityChooserModel.HistoryLoader this$1;

            public void run()
            {
                ActivityChooserModel.access$800(this$0);
                ActivityChooserModel.access$900(this$0);
            }

            
            {
                this$1 = ActivityChooserModel.HistoryLoader.this;
                super();
            }
        });
        obj1;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
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
        }
        break MISSING_BLOCK_LABEL_457;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
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
