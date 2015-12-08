// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.time.Clock;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper

class  extends penHelper
{

    final ModelHelper this$0;

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        super.onCreate(sqlitedatabase);
        sqlitedatabase = Preferences.persisted();
        Clock clock = Clock.a;
        sqlitedatabase.set("PREF_DB_CREATED_AT", Clock.a());
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        super.onUpgrade(sqlitedatabase, i, j);
        sqlitedatabase = Preferences.persisted();
        Clock clock = Clock.a;
        sqlitedatabase.set("PREF_DB_CREATED_AT", Clock.a());
    }

    (Context context, String s, android.database.sqlite..CursorFactory cursorfactory)
    {
        this$0 = ModelHelper.this;
        super(context, s, cursorfactory);
    }
}
