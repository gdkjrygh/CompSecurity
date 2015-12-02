// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.d.d;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.d.d:
//            c

public abstract class d
{

    private final String a;
    private final int b;
    private c c;

    protected d(String s, int i)
    {
        boolean flag = true;
        super();
        if (i < 1)
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Version must be positive");
        a = s;
        b = i;
    }

    public final String a()
    {
        return a;
    }

    protected abstract void a(SQLiteDatabase sqlitedatabase);

    protected abstract void a(SQLiteDatabase sqlitedatabase, int i, int j);

    void a(c c1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (c != null && c != c1)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        Preconditions.checkArgument(flag, "SharedSQLiteDbPart initialized more than once");
        c = c1;
        this;
        JVM INSTR monitorexit ;
        return;
        c1;
        throw c1;
    }

    public final int b()
    {
        return b;
    }
}
