// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.a.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package com.mobvista.sdk.m.a.a.a:
//            b

public abstract class a
{

    private b a;

    public a(Context context)
    {
        a = new b(this, context, a(), 600);
    }

    protected abstract String a();

    protected abstract void a(SQLiteDatabase sqlitedatabase);

    public final SQLiteDatabase b()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = a.getReadableDatabase();
        this;
        JVM INSTR monitorexit ;
        return sqlitedatabase;
        Exception exception;
        exception;
        throw exception;
    }

    protected abstract void b(SQLiteDatabase sqlitedatabase);

    public final SQLiteDatabase c()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = a.getWritableDatabase();
        this;
        JVM INSTR monitorexit ;
        return sqlitedatabase;
        Exception exception;
        exception;
        throw exception;
    }
}
