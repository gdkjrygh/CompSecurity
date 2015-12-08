// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

public final class evb extends mvh
{

    public evb()
    {
    }

    protected final SQLiteOpenHelper a(Context context, int i)
    {
        return new eva(context, i);
    }
}
