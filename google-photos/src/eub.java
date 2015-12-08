// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.sqlite.SQLiteStatement;

final class eub
    implements euc
{

    private final etz a;
    private final String b;

    public eub(etz etz1, String s)
    {
        a = etz1;
        b = s;
    }

    public final ContentValues a()
    {
        ContentValues contentvalues = new ContentValues(2);
        contentvalues.put("key", Integer.valueOf(a.f));
        contentvalues.put("value", b);
        return contentvalues;
    }

    public final void a(SQLiteStatement sqlitestatement, int i)
    {
        if (b != null)
        {
            sqlitestatement.bindString(1, b);
            return;
        } else
        {
            sqlitestatement.bindNull(1);
            return;
        }
    }
}
