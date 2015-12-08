// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class dpk
    implements evg
{

    private final SQLiteDatabase a;
    private final int b;
    private final dpj c;

    public dpk(SQLiteDatabase sqlitedatabase, int i, dpj dpj1)
    {
        a = sqlitedatabase;
        b = i;
        c = dpj1;
    }

    public final String a()
    {
        return "AllMediaCountManager";
    }

    public final void a(long l)
    {
        c.a(a, b, eud.a);
    }

    public final void a(evh evh)
    {
        c.a(a, b, eud.a);
    }

    public final void a(String s, long l)
    {
        c.a(a, b, eud.b);
    }

    public final void b()
    {
    }

    public final void b(evh evh)
    {
    }

    public final void c()
    {
        c.b(b).c = null;
    }
}
