// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ringtone;

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
        RingtoneDbHelper.a().info((new StringBuilder("removeRingtoneForContact() selfId:")).append(((String) (aobj[0]))).toString());
        if (aobj[0] == null || ((String) (aobj[0])).isEmpty() || aobj[1] == null || ((String) (aobj[1])).isEmpty())
        {
            RingtoneDbHelper.a().info("setRingtoneUriForContact() identity and uri can not be null or empty");
            return Integer.valueOf(-1);
        } else
        {
            RingtoneDbHelper.a(a, a.getWritableDatabase());
            aobj = (new StringBuilder("selfIdentity ='")).append(((String) (aobj[0]))).append("' AND otherIdentity ='").append(((String) (aobj[1]))).append("'").toString();
            return Integer.valueOf(RingtoneDbHelper.a(a).delete("ringtones", ((String) (aobj)), null));
        }
    }

    (RingtoneDbHelper ringtonedbhelper)
    {
        a = ringtonedbhelper;
        super();
    }
}
