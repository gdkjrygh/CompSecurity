// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.sqlite.SQLiteStatement;

final class eua
    implements euc
{

    private final int a;
    private final etz b;

    public eua(etz etz1, int i)
    {
        a = i;
        b = etz1;
    }

    public final ContentValues a()
    {
        ContentValues contentvalues = new ContentValues(2);
        contentvalues.put("key", Integer.valueOf(b.f));
        contentvalues.put("value", Integer.valueOf(a));
        return contentvalues;
    }

    public final void a(SQLiteStatement sqlitestatement, int i)
    {
        sqlitestatement.bindLong(1, a);
    }
}
