// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

final class fzn
    implements fzj
{

    private static final String a[] = {
        "_data", "datetaken", "orientation", "_size", "latitude", "longitude", "null AS duration", "null AS width", "null AS height"
    };
    private static final String b[] = {
        "_data", "datetaken", "orientation", "_size", "latitude", "longitude", "null AS duration", "width", "height"
    };
    private static final String c[] = {
        "_data", "datetaken", "null AS orientation", "_size", "latitude", "longitude", "duration", "null AS width", "null AS height"
    };
    private static final String d[] = {
        "_data", "datetaken", "null AS orientation", "_size", "latitude", "longitude", "duration", "width", "height"
    };
    private final ContentResolver e;

    public fzn(ContentResolver contentresolver)
    {
        e = contentresolver;
    }

    public final fzw a(fzi fzi1, int i)
    {
        Object obj;
        Object obj2;
        i = 1;
        Object obj1 = null;
        obj = null;
        obj2 = Uri.parse(fzi1.b);
        if (b.g(((Uri) (obj2))))
        {
            i = 0;
        }
        if (i != 0)
        {
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                fzi1 = b;
            } else
            {
                fzi1 = a;
            }
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            fzi1 = d;
        } else
        {
            fzi1 = c;
        }
        obj2 = e.query(((Uri) (obj2)), fzi1, null, null, null);
        if (obj2 == null)
        {
            return null;
        }
        fzi1 = obj1;
        String s;
        if (!((Cursor) (obj2)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_289;
        }
        s = ((Cursor) (obj2)).getString(0);
        fzi1 = obj;
        if (!TextUtils.isEmpty(s))
        {
            fzi1 = (new File(s)).getName();
        }
        fzy fzy1 = new fzy();
        fzy1.f = Integer.valueOf(((Cursor) (obj2)).getInt(2));
        fzy1.c = Long.valueOf(((Cursor) (obj2)).getLong(1));
        fzy1.a = Double.valueOf(((Cursor) (obj2)).getDouble(4));
        fzy1.b = Double.valueOf(((Cursor) (obj2)).getDouble(5));
        fzy1.d = Long.valueOf(((Cursor) (obj2)).getLong(7));
        fzy1.e = Long.valueOf(((Cursor) (obj2)).getLong(8));
        fzy1.h = s;
        fzy1.g = fzi1;
        fzy1.i = Long.valueOf(((Cursor) (obj2)).getLong(3));
        fzy1.q = Long.valueOf(((Cursor) (obj2)).getLong(6));
        fzi1 = fzy1.a();
        ((Cursor) (obj2)).close();
        return fzi1;
        fzi1;
        ((Cursor) (obj2)).close();
        throw fzi1;
    }

    public final boolean a(fzi fzi1)
    {
        if (TextUtils.isEmpty(fzi1.b))
        {
            return false;
        } else
        {
            return b.h(Uri.parse(fzi1.b));
        }
    }

}
