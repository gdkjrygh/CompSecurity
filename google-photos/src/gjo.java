// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class gjo
    implements evf
{

    private final Context a;

    public gjo(Context context)
    {
        a = context;
    }

    public final void a(SQLiteDatabase sqlitedatabase, int i)
    {
        throw new UnsupportedOperationException("This class does not support rebuild.");
    }

    public final boolean a()
    {
        return false;
    }

    public final evg b(SQLiteDatabase sqlitedatabase, int i)
    {
        if (gjr.a())
        {
            return new gjq(sqlitedatabase, a);
        } else
        {
            return new gjp();
        }
    }
}
