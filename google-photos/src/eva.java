// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public final class eva extends mvq
{

    private static final long a;
    private static long b;

    protected eva(Context context, int i)
    {
        super(context, "gphotos", i, null, 1);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            setWriteAheadLoggingEnabled(true);
        }
    }

    public static boolean b()
    {
        while (b == 0L || SystemClock.uptimeMillis() - b >= a) 
        {
            return false;
        }
        return true;
    }

    public final void a()
    {
        super.a();
        b = SystemClock.uptimeMillis();
    }

    public final void onOpen(SQLiteDatabase sqlitedatabase)
    {
        super.onOpen(sqlitedatabase);
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            sqlitedatabase.enableWriteAheadLogging();
        }
    }

    static 
    {
        a = TimeUnit.MINUTES.toMillis(1L);
    }
}
