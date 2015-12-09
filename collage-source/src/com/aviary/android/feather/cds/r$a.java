// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.database.Cursor;

// Referenced classes of package com.aviary.android.feather.cds:
//            r

public static final class a extends a
{

    final long a;
    String b;
    String c;
    String d;
    String e;
    String f;
    int g;
    int h;
    String i;

    public static a a(Cursor cursor)
    {
        if (b(cursor))
        {
            a a1 = new <init>(cursor.getLong(cursor.getColumnIndex("subscriptions_content_id")), cursor.getLong(cursor.getColumnIndex("subscriptions_subscription_id")));
            int j = cursor.getColumnIndex("subscriptions_content_display_name");
            if (j > -1)
            {
                a1.b = cursor.getString(j);
            }
            j = cursor.getColumnIndex("subscriptions_content_display_description");
            if (j > -1)
            {
                a1.c = cursor.getString(j);
            }
            j = cursor.getColumnIndex("subscriptions_content_duration_tier");
            if (j > -1)
            {
                a1.g = cursor.getInt(j);
            }
            j = cursor.getColumnIndex("subscriptions_content_purchased");
            if (j > -1)
            {
                a1.h = cursor.getInt(j);
            }
            j = cursor.getColumnIndex("subscriptions_content_unlock_type");
            if (j > -1)
            {
                a1.i = cursor.getString(j);
            }
            return a1;
        } else
        {
            return null;
        }
    }

    public int a()
    {
        return h;
    }

    public String b()
    {
        return i;
    }

    public Object clone()
    {
        i j = new <init>(s, a);
        j.b = b;
        j.c = c;
        j.d = d;
        j.e = e;
        j.f = f;
        j.g = g;
        j.h = h;
        j.i = i;
        return j;
    }

    (long l, long l1)
    {
        super(l);
        a = l1;
    }
}
