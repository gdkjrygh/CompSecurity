// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.ContentValues;
import android.database.Cursor;
import kik.a.d.g;

// Referenced classes of package com.kik.l:
//            y

public class v extends y
{

    public v(Cursor cursor)
    {
        super(cursor);
    }

    public static ContentValues a(g g1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("jid", g1.a());
        contentvalues.put("is_muted", Boolean.valueOf(g1.b()));
        contentvalues.put("unmute_timestamp", Long.valueOf(g1.c()));
        contentvalues.put("is_dirty", Boolean.valueOf(g1.d()));
        return contentvalues;
    }
}
