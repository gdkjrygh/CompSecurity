// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera.a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

// Referenced classes of package com.facebook.orca.camera.a:
//            b, d, e, a

public class f extends b
    implements d
{

    static final String h[] = {
        "_id", "_data", "datetaken", "mini_thumb_magic", "orientation", "title", "mime_type", "date_modified"
    };
    private static final Class i = com/facebook/orca/camera/a/f;
    private static final String j[] = {
        "image/jpeg", "image/png", "image/gif"
    };

    public f(ContentResolver contentresolver, Uri uri, Uri uri1, int k, String s)
    {
        super(contentresolver, uri, k, s);
        f = uri1;
    }

    protected a a(Cursor cursor)
    {
        String s;
        String s1;
        String s3;
        int k;
        long l;
        long l1;
        long l2;
label0:
        {
            l2 = cursor.getLong(0);
            s1 = cursor.getString(1);
            l1 = cursor.getLong(2);
            l = l1;
            if (l1 == 0L)
            {
                l = cursor.getLong(7) * 1000L;
            }
            l1 = cursor.getLong(3);
            k = cursor.getInt(4);
            String s2 = cursor.getString(5);
            s3 = cursor.getString(6);
            if (s2 != null)
            {
                s = s2;
                if (s2.length() != 0)
                {
                    break label0;
                }
            }
            s = s1;
        }
        return new e(this, a, l2, cursor.getPosition(), a(l2), s1, l1, s3, l, s, s, k);
    }

    protected long b(Cursor cursor)
    {
        return cursor.getLong(0);
    }

    protected Cursor d()
    {
        return android.provider.MediaStore.Images.Media.query(a, c, h, g(), h(), f());
    }

    protected String g()
    {
        if (e == null)
        {
            return "(mime_type in (?, ?, ?))";
        } else
        {
            return "(mime_type in (?, ?, ?)) AND bucket_id = ?";
        }
    }

    protected String[] h()
    {
        if (e != null)
        {
            int k = j.length;
            String as[] = new String[k + 1];
            System.arraycopy(j, 0, as, 0, k);
            as[k] = e;
            return as;
        } else
        {
            return j;
        }
    }

}
