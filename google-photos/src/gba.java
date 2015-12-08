// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class gba
{

    private final gbg a;
    private final dua b;

    gba(Context context, gbg gbg1)
    {
        a = gbg1;
        b = new dub(context);
    }

    public final boolean a(String s)
    {
        int i = 0;
        if (b.g(Uri.parse(s)))
        {
            return false;
        }
        Object obj = b(s);
        if (obj != null)
        {
            return ((Boolean) (obj)).booleanValue();
        }
        boolean flag = b.a(Uri.parse(s));
        obj = new ContentValues();
        if (flag)
        {
            i = 1;
        }
        ((ContentValues) (obj)).put("animation", Integer.valueOf(i));
        a.a("media_store_extra_animation", s, ((ContentValues) (obj)));
        return Boolean.valueOf(flag).booleanValue();
    }

    public Boolean b(String s)
    {
        boolean flag;
        flag = true;
        s = a.a("media_store_extra_animation", s);
        if (s.moveToFirst())
        {
            if (s.getInt(s.getColumnIndexOrThrow("animation")) != 1)
            {
                flag = false;
            }
            s.close();
            return Boolean.valueOf(flag);
        } else
        {
            s.close();
            return null;
        }
        Exception exception;
        exception;
        s.close();
        throw exception;
    }
}
