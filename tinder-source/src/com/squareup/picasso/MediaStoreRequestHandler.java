// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.IOException;

// Referenced classes of package com.squareup.picasso:
//            g, r

final class MediaStoreRequestHandler extends g
{
    static final class PicassoKind extends Enum
    {

        public static final PicassoKind a;
        public static final PicassoKind b;
        public static final PicassoKind c;
        private static final PicassoKind g[];
        final int d;
        final int e;
        final int f;

        public static PicassoKind valueOf(String s)
        {
            return (PicassoKind)Enum.valueOf(com/squareup/picasso/MediaStoreRequestHandler$PicassoKind, s);
        }

        public static PicassoKind[] values()
        {
            return (PicassoKind[])g.clone();
        }

        static 
        {
            a = new PicassoKind("MICRO", 0, 3, 96, 96);
            b = new PicassoKind("MINI", 1, 1, 512, 384);
            c = new PicassoKind("FULL", 2, 2, -1, -1);
            g = (new PicassoKind[] {
                a, b, c
            });
        }

        private PicassoKind(String s, int i, int j, int k, int l)
        {
            super(s, i);
            d = j;
            e = k;
            f = l;
        }
    }


    private static final String b[] = {
        "orientation"
    };

    MediaStoreRequestHandler(Context context)
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

    public final boolean a(r r1)
    {
        r1 = r1.d;
        return "content".equals(r1.getScheme()) && "media".equals(r1.getAuthority());
    }

    public final t.a b(r r1)
        throws IOException
    {
        boolean flag1 = true;
        ContentResolver contentresolver = a.getContentResolver();
        int j = a(contentresolver, r1.d);
        String s = contentresolver.getType(r1.d);
        boolean flag;
        if (s != null && s.startsWith("video/"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (r1.c())
        {
            int k = r1.h;
            int l = r1.i;
            Object obj;
            if (k <= PicassoKind.a.e && l <= PicassoKind.a.f)
            {
                obj = PicassoKind.a;
            } else
            if (k <= PicassoKind.b.e && l <= PicassoKind.b.f)
            {
                obj = PicassoKind.b;
            } else
            {
                obj = PicassoKind.c;
            }
            if (!flag && obj == PicassoKind.c)
            {
                return new t.a(null, c(r1), Picasso.LoadedFrom.b, j);
            }
            long l1 = ContentUris.parseId(r1.d);
            android.graphics.BitmapFactory.Options options = d(r1);
            options.inJustDecodeBounds = true;
            a(r1.h, r1.i, ((PicassoKind) (obj)).e, ((PicassoKind) (obj)).f, options, r1);
            if (flag)
            {
                int i;
                if (obj == PicassoKind.c)
                {
                    i = ((flag1) ? 1 : 0);
                } else
                {
                    i = ((PicassoKind) (obj)).d;
                }
                obj = android.provider.MediaStore.Video.Thumbnails.getThumbnail(contentresolver, l1, i, options);
            } else
            {
                obj = android.provider.MediaStore.Images.Thumbnails.getThumbnail(contentresolver, l1, ((PicassoKind) (obj)).d, options);
            }
            if (obj != null)
            {
                return new t.a(((android.graphics.Bitmap) (obj)), null, Picasso.LoadedFrom.b, j);
            }
        }
        return new t.a(null, c(r1), Picasso.LoadedFrom.b, j);
    }

}
