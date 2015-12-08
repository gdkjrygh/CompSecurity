// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ringtone;

import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.AsyncTask;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.ringtone:
//            RingtoneStorage

public class RingtoneDbHelper extends SQLiteOpenHelper
    implements RingtoneStorage
{

    private static final Logger b = Logger.getLogger("RingtoneDbHelper");
    private SQLiteDatabase a;

    public RingtoneDbHelper(Application application)
    {
        super(application, "skypeRingtoneDB.db", null, 1);
        a = null;
    }

    static SQLiteDatabase a(RingtoneDbHelper ringtonedbhelper)
    {
        return ringtonedbhelper.a;
    }

    static SQLiteDatabase a(RingtoneDbHelper ringtonedbhelper, SQLiteDatabase sqlitedatabase)
    {
        ringtonedbhelper.a = sqlitedatabase;
        return sqlitedatabase;
    }

    static Logger a()
    {
        return b;
    }

    public final AsyncTask a(String s, String s1)
    {
        return (new AsyncTask() {

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

            
            {
                a = RingtoneDbHelper.this;
                super();
            }
        }).execute(new String[] {
            s, s1
        });
    }

    public final AsyncTask a(String s, String s1, Uri uri)
    {
        return (new AsyncTask() {

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

            
            {
                a = RingtoneDbHelper.this;
                super();
            }
        }).execute(new String[] {
            s, s1, uri.toString()
        });
    }

    public final AsyncTask b(String s, String s1)
    {
        return (new AsyncTask() {

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

            
            {
                a = RingtoneDbHelper.this;
                super();
            }
        }).execute(new String[] {
            s, s1
        });
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE ringtones (_id INTEGER PRIMARY KEY,selfIdentity TEXT ,otherIdentity TEXT ,ringtoneUri TEXT,  UNIQUE (selfIdentity, otherIdentity) ON CONFLICT REPLACE )");
    }

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        onUpgrade(sqlitedatabase, i, j);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS ringtones");
        onCreate(sqlitedatabase);
    }

}
