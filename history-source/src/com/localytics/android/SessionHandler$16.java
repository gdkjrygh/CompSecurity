// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.ContentValues;
import android.database.Cursor;

// Referenced classes of package com.localytics.android:
//            SessionHandler, LocalyticsProvider

class val.value
    implements Runnable
{

    final SessionHandler this$0;
    final String val$key;
    final String val$value;

    public void run()
    {
        Object obj = null;
        Object obj1 = mProvider.query("custom_dimensions", SessionHandler.access$100(), SessionHandler.access$200(), new String[] {
            val$key
        }, null);
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (val$value != null) goto _L4; else goto _L3
_L3:
        obj = obj1;
        mProvider.remove("custom_dimensions", String.format("%s = ?", new Object[] {
            "custom_dimension_key"
        }), new String[] {
            val$key
        });
_L5:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return;
_L4:
        obj = obj1;
        ContentValues contentvalues = new ContentValues();
        obj = obj1;
        contentvalues.put("custom_dimension_key", val$key);
        obj = obj1;
        contentvalues.put("custom_dimension_value", val$value);
        obj = obj1;
        mProvider.update("custom_dimensions", contentvalues, SessionHandler.access$200(), new String[] {
            val$key
        });
          goto _L5
        obj1;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw obj1;
_L2:
        obj = obj1;
        if (val$value == null) goto _L5; else goto _L6
_L6:
        obj = obj1;
        contentvalues = new ContentValues();
        obj = obj1;
        contentvalues.put("custom_dimension_key", val$key);
        obj = obj1;
        contentvalues.put("custom_dimension_value", val$value);
        obj = obj1;
        mProvider.insert("custom_dimensions", contentvalues);
          goto _L5
    }

    ()
    {
        this$0 = final_sessionhandler;
        val$key = s;
        val$value = String.this;
        super();
    }
}
