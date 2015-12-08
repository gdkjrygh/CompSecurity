// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.provider;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.pandora.android.provider:
//            a

private static class <init>
    implements com.pandora.radio.provider.a
{

    public Collection a()
    {
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(new com.pandora.radio.provider.<init>("alarms", com.pandora.android.provider.a.c()));
        return arraylist;
    }

    public void a(SQLiteDatabase sqlitedatabase)
    {
    }

    public void a(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

    private abase()
    {
    }

    abase(abase abase)
    {
        this();
    }
}
