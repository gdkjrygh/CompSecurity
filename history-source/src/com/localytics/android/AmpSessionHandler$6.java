// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.ClipboardManager;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.widget.Toast;

// Referenced classes of package com.localytics.android:
//            AmpCallable, AmpSessionHandler, LocalyticsProvider

class this._cls0 extends AmpCallable
{

    final AmpSessionHandler this$0;

    Object call(Object aobj[])
    {
        String s;
        s = null;
        aobj = null;
        Cursor cursor = mProvider.query("info", null, null, null, null);
        aobj = cursor;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_49;
        }
        aobj = cursor;
        s = cursor.getString(cursor.getColumnIndexOrThrow("registration_id"));
        if (cursor != null)
        {
            cursor.close();
        }
        Exception exception;
        if (!TextUtils.isEmpty(s))
        {
            aobj = mContext;
            Context context = mContext;
            ((ClipboardManager)((Context) (aobj)).getSystemService("clipboard")).setText(s);
            Toast.makeText(mContext, (new StringBuilder()).append(s).append(" has been copied to the clipboard.").toString(), 1).show();
            return null;
        } else
        {
            Toast.makeText(mContext, "No push token found. Please check your integration.", 1).show();
            return null;
        }
        exception;
        if (aobj != null)
        {
            ((Cursor) (aobj)).close();
        }
        throw exception;
    }

    ()
    {
        this$0 = AmpSessionHandler.this;
        super();
    }
}
