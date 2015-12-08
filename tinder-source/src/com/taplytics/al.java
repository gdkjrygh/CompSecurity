// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// Referenced classes of package com.taplytics:
//            s

public final class al extends SQLiteOpenHelper
{

    private s a;

    public al(Context context, String s1, s s2)
    {
        super(context, s1, null, 4);
        a = s2;
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        a.a = sqlitedatabase;
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        a.a = sqlitedatabase;
    }
}
