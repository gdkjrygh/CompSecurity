// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class nte
{

    public nte()
    {
    }

    public static transient void a(Context context, int i, String as[])
    {
        SQLiteDatabase sqlitedatabase = nsz.a(context).a(i).getWritableDatabase();
        sqlitedatabase.beginTransaction();
        sqlitedatabase.execSQL("UPDATE notifications SET system_tray_version = 0 WHERE system_tray_version > 0");
        if (as.length <= 0) goto _L2; else goto _L1
_L1:
        context = String.valueOf("UPDATE notifications SET system_tray_version = last_modified_version WHERE priority IN (3,4) AND read_state = 1 AND push_enabled != 0 AND ");
        String s = String.valueOf(b.c("key", as.length));
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        context = context.concat(s);
_L3:
        sqlitedatabase.execSQL(context, as);
_L2:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        context = new String(context);
          goto _L3
        context;
        sqlitedatabase.endTransaction();
        throw context;
    }
}
