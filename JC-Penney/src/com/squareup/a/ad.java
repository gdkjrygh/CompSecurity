// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

// Referenced classes of package com.squareup.a:
//            p, ae, ax, bc, 
//            aq

class ad extends p
{

    private static final String b[] = {
        "orientation"
    };

    ad(Context context)
    {
        super(context);
    }

    static int a(ContentResolver contentresolver, Uri uri)
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

    static ae a(int i, int j)
    {
        if (i <= ae.a.e && j <= ae.a.f)
        {
            return ae.a;
        }
        if (i <= ae.b.e && j <= ae.b.f)
        {
            return ae.b;
        } else
        {
            return ae.c;
        }
    }

    public bc a(ax ax1, int i)
    {
        Object obj = a.getContentResolver();
        int j = a(((ContentResolver) (obj)), ax1.d);
        String s = ((ContentResolver) (obj)).getType(ax1.d);
        if (s != null && s.startsWith("video/"))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (ax1.d())
        {
            ae ae1 = a(ax1.h, ax1.i);
            if (i == 0 && ae1 == ae.c)
            {
                return new bc(null, b(ax1), aq.b, j);
            }
            long l = ContentUris.parseId(ax1.d);
            android.graphics.BitmapFactory.Options options = c(ax1);
            options.inJustDecodeBounds = true;
            a(ax1.h, ax1.i, ae1.e, ae1.f, options, ax1);
            if (i != 0)
            {
                if (ae1 == ae.c)
                {
                    i = 1;
                } else
                {
                    i = ae1.d;
                }
                obj = android.provider.MediaStore.Video.Thumbnails.getThumbnail(((ContentResolver) (obj)), l, i, options);
            } else
            {
                obj = android.provider.MediaStore.Images.Thumbnails.getThumbnail(((ContentResolver) (obj)), l, ae1.d, options);
            }
            if (obj != null)
            {
                return new bc(((android.graphics.Bitmap) (obj)), null, aq.b, j);
            }
        }
        return new bc(null, b(ax1), aq.b, j);
    }

    public boolean a(ax ax1)
    {
        ax1 = ax1.d;
        return "content".equals(ax1.getScheme()) && "media".equals(ax1.getAuthority());
    }

}
