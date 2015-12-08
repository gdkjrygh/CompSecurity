// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

public final class gbm
{

    public final gbg a;
    public final jfj b;

    gbm(gbg gbg1, jfj jfj)
    {
        a = gbg1;
        b = jfj;
    }

    public jfi a(String s)
    {
        s = a.a("media_store_extra_video_dimension", s);
        jfi jfi1;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        jfi1 = new jfi(s.getInt(s.getColumnIndexOrThrow("width")), s.getInt(s.getColumnIndexOrThrow("height")));
        s.close();
        return jfi1;
        s.close();
        return null;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }
}
