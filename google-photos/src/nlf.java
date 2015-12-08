// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public final class nlf
    implements nlo
{

    private static final String a = b.y("date_added");
    private static final String b = b.y("date_modified");
    private static final String c[];
    private static final String d[] = {
        "count(*)"
    };
    private final Context e;

    public nlf(Context context)
    {
        e = context;
    }

    private static long a(ejr ejr1, Uri uri)
    {
        ejr1 = ejr1.a(uri, c, null, null, "_id DESC LIMIT 1");
        if (ejr1 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        long l;
        if (!ejr1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_48;
        }
        l = ejr1.getLong(2);
        if (ejr1 != null)
        {
            ejr1.close();
        }
        return l;
        if (ejr1 != null)
        {
            ejr1.close();
        }
        return 0L;
        uri;
        if (ejr1 != null)
        {
            ejr1.close();
        }
        throw uri;
    }

    private static long b(ejr ejr1, Uri uri)
    {
        ejr1 = ejr1.a(uri, d, null, null, null);
        if (ejr1 == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        long l;
        if (!ejr1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_47;
        }
        l = ejr1.getLong(0);
        if (ejr1 != null)
        {
            ejr1.close();
        }
        return l;
        if (ejr1 != null)
        {
            ejr1.close();
        }
        return 0L;
        uri;
        if (ejr1 != null)
        {
            ejr1.close();
        }
        throw uri;
    }

    private static long c(ejr ejr1, Uri uri)
    {
        ejr1 = ejr1.a(uri, d, "mime_type NOT LIKE 'image/%' AND mime_type NOT LIKE 'video/%'", null, null);
        if (ejr1 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        long l;
        if (!ejr1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_48;
        }
        l = ejr1.getLong(0);
        if (ejr1 != null)
        {
            ejr1.close();
        }
        return l;
        if (ejr1 != null)
        {
            ejr1.close();
        }
        return 0L;
        uri;
        if (ejr1 != null)
        {
            ejr1.close();
        }
        throw uri;
    }

    public final nlp a(int i, Uri uri, Class class1)
    {
        Object obj1;
        long l;
        long l2;
        long l3;
        long l4;
        obj1 = (ejr)olm.a(e, ejr);
        long l1 = 0L;
        Object obj = null;
        l2 = b(((ejr) (obj1)), uri);
        l3 = c(((ejr) (obj1)), uri);
        l4 = a(((ejr) (obj1)), uri);
        obj1 = ((ejr) (obj1)).a(uri, c, null, null, "corrected_added_modified DESC LIMIT 1");
        l = l1;
        uri = obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        l = l1;
        uri = obj;
        if (((Cursor) (obj1)).moveToFirst())
        {
            l = ((Cursor) (obj1)).getLong(1);
            uri = ((Cursor) (obj1)).getString(0);
        }
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return new nlp(l2, l3, l, uri, l4, class1);
        uri;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw uri;
    }

    static 
    {
        String s = String.valueOf(b.d(a, b));
        String s1 = String.valueOf("corrected_added_modified");
        c = (new String[] {
            "_data", (new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(s1).length())).append(s).append(" as ").append(s1).toString(), "_id"
        });
    }
}
