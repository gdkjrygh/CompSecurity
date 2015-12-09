// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.database.sqlite.SQLiteDatabase;
import com.android.common.SharedPreferencesCompat;

// Referenced classes of package com.google.android.gms.games.provider:
//            GamesSQLHelper, GamesDatabaseHelper

static final class mKey
    implements GamesSQLHelper
{

    private final int mAction = 1;
    private final android.content.lper.PreferenceHelper.mEditor mEditor;
    private final String mKey;

    public final void execute(SQLiteDatabase sqlitedatabase, int i)
    {
        mEditor.mEditor(mKey);
        SharedPreferencesCompat.apply(mEditor);
    }

    (android.content.lper.PreferenceHelper preferencehelper, String s)
    {
        mEditor = preferencehelper;
        mKey = s;
    }
}
