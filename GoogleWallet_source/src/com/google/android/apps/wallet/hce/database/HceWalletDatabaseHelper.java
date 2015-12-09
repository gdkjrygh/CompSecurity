// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.database;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.wallet.datastore.WalletDatabaseHelper;
import java.util.List;

public class HceWalletDatabaseHelper extends WalletDatabaseHelper
{

    public HceWalletDatabaseHelper(Application application, String s, int i, List list)
    {
        super(application, s, i, list);
    }

    public void onConfigure(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.setForeignKeyConstraintsEnabled(true);
    }
}
