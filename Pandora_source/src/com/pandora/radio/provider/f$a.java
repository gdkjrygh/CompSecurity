// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.pandora.radio.provider:
//            f

private class <init>
    implements <init>
{

    final f a;

    public Collection a()
    {
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(new <init>("SETTINGS", f.d()));
        return arraylist;
    }

    public void a(SQLiteDatabase sqlitedatabase)
    {
    }

    public void a(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        f.a(sqlitedatabase, a);
    }

    private atabase(f f1)
    {
        a = f1;
        super();
    }

    a(f f1, a a1)
    {
        this(f1);
    }
}
