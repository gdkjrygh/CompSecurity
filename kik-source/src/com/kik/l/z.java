// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.ContentValues;
import android.database.Cursor;
import kik.a.d.a.d;
import kik.a.d.j;

// Referenced classes of package com.kik.l:
//            y

public final class z extends y
{

    public z(Cursor cursor)
    {
        super(cursor);
    }

    public static ContentValues a(d d1)
    {
        ContentValues contentvalues = new ContentValues();
        if (d1 != null)
        {
            contentvalues.put("body", d1.e());
            contentvalues.put("friend_attribute_type", d1.a().toString());
            contentvalues.put("referrer_jid", d1.d().b());
            contentvalues.put("reply", Boolean.valueOf(d1.f()));
            contentvalues.put("timestamp", Long.valueOf(d1.h()));
        }
        return contentvalues;
    }
}
