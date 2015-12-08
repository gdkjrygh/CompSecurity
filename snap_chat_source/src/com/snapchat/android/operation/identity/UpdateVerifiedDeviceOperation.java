// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.operation.identity;

import CU;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import com.snapchat.android.Timber;
import com.snapchat.android.content.SnapchatProvider;
import com.snapchat.android.database.DatabaseHelper;
import com.snapchat.android.database.schema.VerifiedDeviceSchema;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.Iterator;
import java.util.List;
import ul;

public final class UpdateVerifiedDeviceOperation
    implements CU
{
    public static final class Action extends Enum
    {

        private static final Action $VALUES[];
        public static final Action DELETE;
        public static final Action DELETE_ALL;
        public static final Action SAVE;

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/snapchat/android/operation/identity/UpdateVerifiedDeviceOperation$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])$VALUES.clone();
        }

        static 
        {
            SAVE = new Action("SAVE", 0);
            DELETE = new Action("DELETE", 1);
            DELETE_ALL = new Action("DELETE_ALL", 2);
            $VALUES = (new Action[] {
                SAVE, DELETE, DELETE_ALL
            });
        }

        private Action(String s, int i)
        {
            super(s, i);
        }
    }


    private final Intent a;
    private List b;
    private final Action c;
    private String d;

    private UpdateVerifiedDeviceOperation(Intent intent)
    {
        a = intent;
        c = (Action)a.getSerializableExtra("action");
        if (c == Action.SAVE)
        {
            b = intent.getParcelableArrayListExtra("verified_devices");
        } else
        if (c == Action.DELETE)
        {
            d = intent.getStringExtra("device_id");
            return;
        }
    }

    public UpdateVerifiedDeviceOperation(Intent intent, byte byte0)
    {
        ul.a();
        this(intent);
    }

    public final Intent getIntent()
    {
        return a;
    }

    public final void postProcess(Context context)
    {
    }

    public final void process(Context context)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Action.values().length];
                try
                {
                    a[Action.SAVE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Action.DELETE_ALL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Action.DELETE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[c.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 37
    //                   2 202
    //                   3 229;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        SQLiteDatabase sqlitedatabase;
        Object obj;
        obj = b;
        sqlitedatabase = DatabaseHelper.a(context).getWritableDatabase();
        sqlitedatabase.beginTransaction();
        if (ReleaseManager.f())
        {
            Timber.c("VerifiedDeviceTable", "saveVerifiedDeviceListInTransaction - beginTransaction", new Object[0]);
        }
        sqlitedatabase.delete("VerifiedDeviceTable", null, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        if (((List) (obj)).size() != 0)
        {
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); sqlitedatabase.insertWithOnConflict("VerifiedDeviceTable", null, (ContentValues)((Iterator) (obj)).next(), 5)) { }
        }
        break MISSING_BLOCK_LABEL_165;
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        context.getContentResolver().notifyChange(SnapchatProvider.d, null);
        if (ReleaseManager.f())
        {
            Timber.c("VerifiedDeviceTable", "saveVerifiedDeviceListInTransaction - endTransaction", new Object[0]);
        }
        throw exception;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        context.getContentResolver().notifyChange(SnapchatProvider.d, null);
        if (ReleaseManager.f())
        {
            Timber.c("VerifiedDeviceTable", "saveVerifiedDeviceListInTransaction - endTransaction", new Object[0]);
            return;
        }
          goto _L1
_L3:
        DatabaseHelper.a(context).getWritableDatabase().delete("VerifiedDeviceTable", null, null);
        context.getContentResolver().notifyChange(SnapchatProvider.d, null);
        return;
_L4:
        String s = d;
        DatabaseHelper.a(context).getWritableDatabase().delete("VerifiedDeviceTable", (new StringBuilder()).append(VerifiedDeviceSchema.DEVICE_ID.getColumnName()).append("='").append(s).append("'").toString(), null);
        context.getContentResolver().notifyChange(SnapchatProvider.d, null);
        return;
    }
}
