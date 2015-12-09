// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import gvg;
import gvz;
import gwd;

final class MediaStoreRequestHandler extends gvg
{

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

    public final boolean a(gvz gvz1)
    {
        gvz1 = gvz1.d;
        return "content".equals(gvz1.getScheme()) && "media".equals(gvz1.getAuthority());
    }

    public final gwd b(gvz gvz1)
    {
        boolean flag1 = true;
        ContentResolver contentresolver = a.getContentResolver();
        int j = a(contentresolver, gvz1.d);
        String s = contentresolver.getType(gvz1.d);
        boolean flag;
        if (s != null && s.startsWith("video/"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (gvz1.c())
        {
            int k = gvz1.h;
            int l = gvz1.i;
            Object obj;
            if (k <= PicassoKind.a.width && l <= PicassoKind.a.height)
            {
                obj = PicassoKind.a;
            } else
            if (k <= PicassoKind.b.width && l <= PicassoKind.b.height)
            {
                obj = PicassoKind.b;
            } else
            {
                obj = PicassoKind.c;
            }
            if (!flag && obj == PicassoKind.c)
            {
                return new gwd(null, c(gvz1), Picasso.LoadedFrom.b, j);
            }
            long l1 = ContentUris.parseId(gvz1.d);
            android.graphics.BitmapFactory.Options options = d(gvz1);
            options.inJustDecodeBounds = true;
            a(gvz1.h, gvz1.i, ((PicassoKind) (obj)).width, ((PicassoKind) (obj)).height, options, gvz1);
            if (flag)
            {
                int i;
                if (obj == PicassoKind.c)
                {
                    i = ((flag1) ? 1 : 0);
                } else
                {
                    i = ((PicassoKind) (obj)).androidKind;
                }
                obj = android.provider.MediaStore.Video.Thumbnails.getThumbnail(contentresolver, l1, i, options);
            } else
            {
                obj = android.provider.MediaStore.Images.Thumbnails.getThumbnail(contentresolver, l1, ((PicassoKind) (obj)).androidKind, options);
            }
            if (obj != null)
            {
                return new gwd(((android.graphics.Bitmap) (obj)), null, Picasso.LoadedFrom.b, j);
            }
        }
        return new gwd(null, c(gvz1), Picasso.LoadedFrom.b, j);
    }


    private class PicassoKind extends Enum
    {

        public static final PicassoKind a;
        public static final PicassoKind b;
        public static final PicassoKind c;
        private static final PicassoKind d[];
        final int androidKind;
        final int height;
        final int width;

        public static PicassoKind valueOf(String s)
        {
            return (PicassoKind)Enum.valueOf(com/squareup/picasso/MediaStoreRequestHandler$PicassoKind, s);
        }

        public static PicassoKind[] values()
        {
            return (PicassoKind[])d.clone();
        }

        static 
        {
            a = new PicassoKind("MICRO", 0, 3, 96, 96);
            b = new PicassoKind("MINI", 1, 1, 512, 384);
            c = new PicassoKind("FULL", 2, 2, -1, -1);
            d = (new PicassoKind[] {
                a, b, c
            });
        }

        private PicassoKind(String s, int i, int j, int k, int l)
        {
            super(s, i);
            androidKind = j;
            width = k;
            height = l;
        }
    }

}
