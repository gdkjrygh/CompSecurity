// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import com.android.volley.k;
import com.android.volley.r;
import com.android.volley.w;
import kik.android.util.bx;

// Referenced classes of package com.kik.cache:
//            ac

public final class u extends ac
{

    private final Object f = new Object();
    private Context g;
    private boolean h;
    private android.graphics.BitmapFactory.Options i;
    private int j;

    private u(long l, String s, boolean flag, Context context, int k, android.graphics.BitmapFactory.Options options)
    {
        super(Long.valueOf(l), s, null, k, k, a, null);
        g = context;
        h = flag;
        i = options;
        j = k;
    }

    public static u a(long l, String s, boolean flag, Context context, int k, android.graphics.BitmapFactory.Options options)
    {
        return new u(l, (new StringBuilder("http://127.0.0.1/")).append(s).append("/").append(l).toString(), flag, context, k, options);
    }

    private r c(k k)
    {
        if (k == null)
        {
            return r.a(new w("Null response"));
        }
        if (!h)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        k = android.provider.MediaStore.Video.Thumbnails.getThumbnail(g.getContentResolver(), ((Long)x()).longValue(), j, i);
_L1:
        if (k != null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        Object obj = r.a(new w("thumb is null"));
        return ((r) (obj));
        k = android.provider.MediaStore.Images.Thumbnails.getThumbnail(g.getContentResolver(), ((Long)x()).longValue(), j, i);
          goto _L1
        Object obj2;
        obj = g.getContentResolver();
        obj2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        String s = (new StringBuilder()).append(x()).toString();
        obj2 = ((ContentResolver) (obj)).query(((android.net.Uri) (obj2)), new String[] {
            "_data"
        }, "_id=?", new String[] {
            s
        }, null);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        int l;
        if (!((Cursor) (obj2)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_201;
        }
        l = kik.android.util.r.a(((Cursor) (obj2)).getString(0));
        if (l < 0)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        obj = kik.android.util.r.b(k, l);
        k = ((k) (obj));
        ((Cursor) (obj2)).close();
_L2:
        Object obj1;
        if (k == null)
        {
            return r.a(new w("Null bitmap from composite"));
        } else
        {
            return r.a(k, null);
        }
        obj1;
        k = null;
_L4:
        bx.a(((Throwable) (obj1)), 10);
          goto _L2
        obj1;
        k = null;
_L3:
        bx.a(((Throwable) (obj1)));
          goto _L2
        obj1;
          goto _L3
        obj1;
          goto _L3
        obj1;
          goto _L4
        obj1;
          goto _L4
    }

    public final com.android.volley.b.a b(com.android.volley.b.a a1)
    {
        return null;
    }

    protected final r b(k k)
    {
        synchronized (f)
        {
            k = c(k);
        }
        return k;
        k;
        obj;
        JVM INSTR monitorexit ;
        throw k;
    }

    public final boolean e_()
    {
        return false;
    }
}
