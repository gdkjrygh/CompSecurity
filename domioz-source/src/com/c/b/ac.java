// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

// Referenced classes of package com.c.b:
//            o, aw, ad, ba, 
//            ap

final class ac extends o
{

    private static final String b[] = {
        "orientation"
    };

    ac(Context context)
    {
        super(context);
    }

    private static int a(ContentResolver contentresolver, Uri uri)
    {
        contentresolver = contentresolver.query(uri, b, null, null, null);
        if (contentresolver == null) goto _L2; else goto _L1
_L1:
        boolean flag = contentresolver.moveToFirst();
        if (flag) goto _L3; else goto _L2
_L2:
        int i;
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        i = 0;
_L5:
        return i;
_L3:
        int j = contentresolver.getInt(0);
        i = j;
        if (contentresolver == null) goto _L5; else goto _L4
_L4:
        contentresolver.close();
        return j;
        contentresolver;
        contentresolver = null;
_L9:
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        return 0;
        uri;
        contentresolver = null;
_L7:
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        throw uri;
        uri;
        if (true) goto _L7; else goto _L6
_L6:
        uri;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final boolean a(aw aw1)
    {
        aw1 = aw1.d;
        return "content".equals(aw1.getScheme()) && "media".equals(aw1.getAuthority());
    }

    public final ba b(aw aw1)
    {
        boolean flag1 = true;
        ContentResolver contentresolver = a.getContentResolver();
        int j = a(contentresolver, aw1.d);
        String s = contentresolver.getType(aw1.d);
        boolean flag;
        if (s != null && s.startsWith("video/"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (aw1.c())
        {
            int k = aw1.h;
            int l = aw1.i;
            Object obj;
            if (k <= ad.a.e && l <= ad.a.f)
            {
                obj = ad.a;
            } else
            if (k <= ad.b.e && l <= ad.b.f)
            {
                obj = ad.b;
            } else
            {
                obj = ad.c;
            }
            if (!flag && obj == ad.c)
            {
                return new ba(null, c(aw1), ap.b, j);
            }
            long l1 = ContentUris.parseId(aw1.d);
            android.graphics.BitmapFactory.Options options = d(aw1);
            options.inJustDecodeBounds = true;
            a(aw1.h, aw1.i, ((ad) (obj)).e, ((ad) (obj)).f, options, aw1);
            if (flag)
            {
                int i;
                if (obj == ad.c)
                {
                    i = ((flag1) ? 1 : 0);
                } else
                {
                    i = ((ad) (obj)).d;
                }
                obj = android.provider.MediaStore.Video.Thumbnails.getThumbnail(contentresolver, l1, i, options);
            } else
            {
                obj = android.provider.MediaStore.Images.Thumbnails.getThumbnail(contentresolver, l1, ((ad) (obj)).d, options);
            }
            if (obj != null)
            {
                return new ba(((android.graphics.Bitmap) (obj)), null, ap.b, j);
            }
        }
        return new ba(null, c(aw1), ap.b, j);
    }

}
