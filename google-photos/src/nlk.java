// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public final class nlk
{

    private static final String a[] = {
        "_id", "_data", "mime_type"
    };
    private static final String b[] = {
        "title", "_size", "latitude", "longitude", "bucket_id", "null AS duration", "null AS width", "null AS height"
    };
    private static final String c[] = {
        "title", "_size", "latitude", "longitude", "bucket_id", "null AS duration", "width", "height"
    };
    private static final String d[] = {
        "title", "_size", "latitude", "longitude", "bucket_id", "duration", "null AS width", "null AS height"
    };
    private static final String e[] = {
        "title", "_size", "latitude", "longitude", "bucket_id", "duration", "width", "height"
    };

    public static String[] a(Uri uri)
    {
        int i = a.length;
        int j = c.length;
        String as[] = new String[i + j + 3];
        System.arraycopy(a, 0, as, 0, i);
        String s;
        String s1;
        if (oql.c(uri))
        {
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                System.arraycopy(e, 0, as, i, j);
            } else
            {
                System.arraycopy(d, 0, as, i, j);
            }
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            System.arraycopy(c, 0, as, i, j);
        } else
        {
            System.arraycopy(b, 0, as, i, j);
        }
        s = String.valueOf(b.a(uri, "date_modified", "date_modified"));
        s1 = String.valueOf("corrected_added_modified");
        as[i + j] = (new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(s1).length())).append(s).append(" AS ").append(s1).toString();
        if (oql.c(uri))
        {
            s = "0 ";
        } else
        {
            s = "orientation";
        }
        s = String.valueOf(s);
        s1 = String.valueOf("aliased_orientation");
        as[i + j + 1] = (new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(s1).length())).append(s).append(" AS ").append(s1).toString();
        uri = String.valueOf(b.a(uri, "datetaken", "datetaken"));
        s = String.valueOf("corrected_date_taken");
        as[i + j + 2] = (new StringBuilder(String.valueOf(uri).length() + 4 + String.valueOf(s).length())).append(uri).append(" AS ").append(s).toString();
        return as;
    }

    public static String[] b(Uri uri)
    {
        String as[] = a(uri);
        int i;
        if (oql.c(uri))
        {
            as[12] = null;
            as[13] = "datetaken";
            as[11] = "date_modified";
        } else
        {
            as[12] = "orientation";
            as[13] = "datetaken";
            as[11] = "date_modified";
        }
        for (i = 0; i < as.length; i++)
        {
            uri = as[i];
            if (uri != null && uri.contains("null"))
            {
                as[i] = null;
            }
        }

        return as;
    }

}
