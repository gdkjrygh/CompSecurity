// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.database.Cursor;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.localytics.android:
//            AmpCallable, AmpSessionHandler, LocalyticsProvider, Constants

class this._cls0 extends AmpCallable
{

    final AmpSessionHandler this$0;

    Object call(Object aobj[])
    {
        Object obj;
        obj = null;
        aobj = null;
        Cursor cursor = mProvider.query("identifiers", null, null, null, null);
        aobj = cursor;
        obj = cursor;
        int i = cursor.getCount();
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (cursor != null)
        {
            cursor.close();
        }
        aobj = null;
_L6:
        return ((Object) (aobj));
_L2:
        aobj = cursor;
        obj = cursor;
        Object obj1 = new JSONObject();
        aobj = cursor;
        obj = cursor;
        i = cursor.getColumnIndexOrThrow("key");
        aobj = cursor;
        obj = cursor;
        int j = cursor.getColumnIndexOrThrow("value");
_L4:
        aobj = cursor;
        obj = cursor;
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        aobj = cursor;
        obj = cursor;
        ((JSONObject) (obj1)).put(cursor.getString(i), cursor.getString(j));
        if (true) goto _L4; else goto _L3
        obj;
        obj = ((Object) (aobj));
        if (!Constants.IS_LOGGABLE)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        obj = ((Object) (aobj));
        Log.w("Localytics", "[JavaScriptClient]: Failed to get identifiers");
        if (aobj != null)
        {
            ((Cursor) (aobj)).close();
        }
        return null;
_L3:
        aobj = cursor;
        obj = cursor;
        obj1 = ((JSONObject) (obj1)).toString();
        obj = obj1;
        aobj = ((Object []) (obj));
        if (cursor == null) goto _L6; else goto _L5
_L5:
        cursor.close();
        return obj;
        aobj;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw aobj;
    }

    ()
    {
        this$0 = AmpSessionHandler.this;
        super();
    }
}
