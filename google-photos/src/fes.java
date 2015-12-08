// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteStatement;
import java.util.concurrent.atomic.AtomicLong;

final class fes
{

    final AtomicLong a = new AtomicLong();
    final feb b;
    private final fet c;

    fes(feb feb)
    {
        b = feb;
        c = new fet(feb);
    }

    final void a(long l)
    {
        SQLiteStatement sqlitestatement = c.a("UPDATE size SET size = size + ?");
        sqlitestatement.bindLong(1, l);
        sqlitestatement.executeUpdateDelete();
        a.addAndGet(l);
        c.a("UPDATE size SET size = size + ?", sqlitestatement);
        return;
        Exception exception;
        exception;
        c.a("UPDATE size SET size = size + ?", sqlitestatement);
        throw exception;
    }
}
