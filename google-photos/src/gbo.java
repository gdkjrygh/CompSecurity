// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;

public class gbo
{

    private final gbg a;
    private final jfl b;

    gbo(gbg gbg1, jfl jfl1)
    {
        a = gbg1;
        b = jfl1;
    }

    public final jfk a(String s)
    {
        float f1 = 0.0F;
        jfk jfk1;
        if (!b.g(Uri.parse(s)))
        {
            jfk1 = null;
        } else
        {
            jfk jfk2 = b(s);
            jfk1 = jfk2;
            if (jfk2 == null)
            {
                Object obj = b;
                Object obj2 = Uri.parse(s);
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    obj = null;
                } else
                {
                    Object obj1 = ((jfl) (obj)).a(((Uri) (obj2)));
                    float f;
                    if (obj1 != null)
                    {
                        f = ((jfl) (obj)).a(((MediaMetadataRetriever) (obj1)));
                        ((MediaMetadataRetriever) (obj1)).release();
                    } else
                    {
                        f = 0.0F;
                    }
                    obj2 = ((jfl) (obj)).b(((Uri) (obj2)));
                    if (obj2 != null)
                    {
                        f1 = ((jfl) (obj)).a(((MediaExtractor) (obj2)));
                        ((MediaExtractor) (obj2)).release();
                    }
                    if (obj1 == null && obj2 == null)
                    {
                        obj = null;
                    } else
                    {
                        obj = new jfk(f, f1);
                    }
                }
                if (obj == null)
                {
                    return null;
                } else
                {
                    obj1 = new ContentValues();
                    ((ContentValues) (obj1)).put("capture_frame_rate", Float.valueOf(((jfk) (obj)).a));
                    ((ContentValues) (obj1)).put("encoded_frame_rate", Float.valueOf(((jfk) (obj)).b));
                    a.a("media_store_extra_framerate", s, ((ContentValues) (obj1)));
                    return ((jfk) (obj));
                }
            }
        }
        return jfk1;
    }

    public jfk b(String s)
    {
        s = a.a("media_store_extra_framerate", s);
        jfk jfk1;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        jfk1 = new jfk(s.getFloat(s.getColumnIndexOrThrow("capture_frame_rate")), s.getFloat(s.getColumnIndexOrThrow("encoded_frame_rate")));
        s.close();
        return jfk1;
        s.close();
        return null;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }
}
