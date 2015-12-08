// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ringtone;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.ringtone:
//            RingtoneDbHelper

final class a extends AsyncTask
{

    final RingtoneDbHelper a;

    protected final Object doInBackground(Object aobj[])
    {
        aobj = (String[])aobj;
        RingtoneDbHelper.a().info((new StringBuilder("setRingtoneUriForContact() selfId:")).append(((String) (aobj[0]))).append(" skypeId: ").append(((String) (aobj[1]))).toString());
        if (aobj[0] == null || ((String) (aobj[0])).isEmpty() || aobj[1] == null || ((String) (aobj[1])).isEmpty() || aobj[2] == null || ((String) (aobj[2])).isEmpty())
        {
            RingtoneDbHelper.a().info("setRingtoneUriForContact() identity and uri can not be null or empty");
            return Long.valueOf(-1L);
        } else
        {
            RingtoneDbHelper.a(a, a.getWritableDatabase());
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("selfIdentity", ((String) (aobj[0])));
            contentvalues.put("otherIdentity", ((String) (aobj[1])));
            contentvalues.put("ringtoneUri", ((String) (aobj[2])));
            return Long.valueOf(RingtoneDbHelper.a(a).insert("ringtones", null, contentvalues));
        }
    }

    (RingtoneDbHelper ringtonedbhelper)
    {
        a = ringtonedbhelper;
        super();
    }
}
