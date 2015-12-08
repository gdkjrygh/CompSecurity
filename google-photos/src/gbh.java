// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class gbh
{

    private final Context a;
    private final gbg b;
    private final noz c;

    public gbh(Context context, gbg gbg1)
    {
        a = context;
        b = gbg1;
        c = noz.a(context, 2, "PhotosphereCache", new String[0]);
    }

    public final boolean a(String s)
    {
        Object obj = b(s);
        if (obj != null)
        {
            return ((Boolean) (obj)).booleanValue();
        }
        long l = noy.a();
        boolean flag = (new nvr(a, Uri.parse(s))).a();
        obj = new ContentValues();
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ((ContentValues) (obj)).put("photosphere", Integer.valueOf(i));
        b.a("media_store_extra_photosphere", s, ((ContentValues) (obj)));
        if (c.a())
        {
            noy.a("uri", s);
            noy.a("duration", l);
        }
        return Boolean.valueOf(flag).booleanValue();
    }

    public Boolean b(String s)
    {
        boolean flag;
        flag = true;
        s = b.a("media_store_extra_photosphere", s);
        if (s.moveToFirst())
        {
            if (s.getInt(s.getColumnIndexOrThrow("photosphere")) != 1)
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
