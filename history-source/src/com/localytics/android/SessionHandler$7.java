// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;

// Referenced classes of package com.localytics.android:
//            SessionHandler, Constants, LocalyticsProvider, DatapointHelper

class val.newSenderId
    implements Runnable
{

    final SessionHandler this$0;
    final String val$newSenderId;

    public void run()
    {
        if (!SessionHandler.access$000(SessionHandler.this)) goto _L2; else goto _L1
_L1:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Push has been disabled");
        }
_L4:
        return;
_L2:
        String s;
        Object obj;
        String s1;
        String s2;
        obj = null;
        s2 = null;
        s = null;
        s1 = null;
        Cursor cursor = mProvider.query("info", null, null, null, null);
        obj = cursor;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        obj = cursor;
        s2 = cursor.getString(cursor.getColumnIndexOrThrow("sender_id"));
        obj = cursor;
        s1 = cursor.getString(cursor.getColumnIndexOrThrow("registration_version"));
        obj = cursor;
        s = cursor.getString(cursor.getColumnIndexOrThrow("registration_id"));
        if (cursor != null)
        {
            cursor.close();
        }
        if (!val$newSenderId.equals(s2))
        {
            s = null;
            obj = new ContentValues();
            ((ContentValues) (obj)).put("sender_id", val$newSenderId);
            ((ContentValues) (obj)).put("registration_id", null);
            mProvider.update("info", ((ContentValues) (obj)), null, null);
        }
        obj = DatapointHelper.getAppVersion(mContext);
        if (!TextUtils.isEmpty(s) && ((String) (obj)).equals(s1)) goto _L4; else goto _L3
_L3:
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.putExtra("app", PendingIntent.getBroadcast(mContext, 0, new Intent(), 0));
        intent.putExtra("sender", val$newSenderId);
        intent.setPackage("com.google.android.gms");
        mContext.startService(intent);
        return;
        Exception exception;
        exception;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
    }

    r()
    {
        this$0 = final_sessionhandler;
        val$newSenderId = String.this;
        super();
    }
}
