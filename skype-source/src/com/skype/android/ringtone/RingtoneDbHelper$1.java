// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ringtone;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.AsyncTask;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.ringtone:
//            RingtoneDbHelper

final class a extends AsyncTask
{

    final RingtoneDbHelper a;

    private Uri a(String as[])
    {
        if (as[0] != null && !as[0].isEmpty()) goto _L2; else goto _L1
_L1:
        RingtoneDbHelper.a().info("getRingtoneUriForContact() Identity can not be null or empty");
        as = null;
_L4:
        return as;
_L2:
        Object obj;
        Object obj1;
        RingtoneDbHelper.a(a, a.getReadableDatabase());
        obj1 = (new StringBuilder("selfIdentity ='")).append(as[0]).append("' AND otherIdentity ='").append(as[1]).append("'").toString();
        obj = null;
        as = null;
        obj1 = RingtoneDbHelper.a(a).query("ringtones", new String[] {
            "_id", "otherIdentity", "ringtoneUri"
        }, ((String) (obj1)), null, null, null, null);
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        as = ((String []) (obj1));
        obj = obj1;
        if (((Cursor) (obj1)).getCount() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        as = ((String []) (obj1));
        obj = obj1;
        ((Cursor) (obj1)).moveToFirst();
        as = ((String []) (obj1));
        obj = obj1;
        int i = ((Cursor) (obj1)).getColumnIndexOrThrow("ringtoneUri");
        as = ((String []) (obj1));
        obj = obj1;
        Uri uri = Uri.parse(((Cursor) (obj1)).getString(i));
        as = ((String []) (obj1));
        obj = obj1;
        RingtoneDbHelper.a().info((new StringBuilder("getRingtoneUriForContact() id: ")).append(i).append(" uri: ").append(uri.toString()).toString());
        as = uri;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            return uri;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
_L6:
        RingtoneDbHelper.a().info("getRingtoneUriForContact() nothing found");
        return null;
        Exception exception;
        exception;
        obj = as;
        RingtoneDbHelper.a().info((new StringBuilder("getRingtoneUriForContact() Exception:")).append(exception).toString());
        if (as != null)
        {
            as.close();
        }
        if (true) goto _L6; else goto _L5
_L5:
        as;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw as;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    (RingtoneDbHelper ringtonedbhelper)
    {
        a = ringtonedbhelper;
        super();
    }
}
