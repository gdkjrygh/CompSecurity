// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import kik.android.h.i;

public final class ab
{
    private final class a extends i
    {

        final ab a;

        public final void a(SQLiteDatabase sqlitedatabase, int j, int k)
        {
        }

        public final void onCreate(SQLiteDatabase sqlitedatabase)
        {
        }

        public final void onUpgrade(SQLiteDatabase sqlitedatabase, int j, int k)
        {
        }

        public a(Context context, String s)
        {
            a = ab.this;
            super(context, "appTable", 7, s);
        }
    }


    private a a;

    public ab(Context context, String s)
    {
        a = new a(context, s);
        a.getReadableDatabase().close();
    }

    public final void a()
    {
        synchronized (a)
        {
            a.getWritableDatabase().delete("appTable", null, null);
        }
        return;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
