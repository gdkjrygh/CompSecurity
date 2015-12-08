// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

final class Za extends YR
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a g[];
        final int d;
        final int e;
        final int f;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(Za$a, s);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        static 
        {
            a = new a("MICRO", 0, 3, 96, 96);
            b = new a("MINI", 1, 1, 512, 384);
            c = new a("FULL", 2, 2, -1, -1);
            g = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i, int j, int k, int l)
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

    Za(Context context)
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

    public final boolean a(Zi zi)
    {
        zi = zi.d;
        return "content".equals(zi.getScheme()) && "media".equals(zi.getAuthority());
    }

    public final Zk.a b(Zi zi)
    {
        boolean flag1 = true;
        ContentResolver contentresolver = a.getContentResolver();
        int j = a(contentresolver, zi.d);
        String s = contentresolver.getType(zi.d);
        boolean flag;
        if (s != null && s.startsWith("video/"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (zi.a())
        {
            int k = zi.f;
            int l = zi.g;
            Object obj;
            if (k <= a.a.e && l <= a.a.f)
            {
                obj = a.a;
            } else
            if (k <= a.b.e && l <= a.b.f)
            {
                obj = a.b;
            } else
            {
                obj = a.c;
            }
            if (!flag && obj == a.c)
            {
                return new Zk.a(null, c(zi), Zf.c.b, j);
            }
            long l1 = ContentUris.parseId(zi.d);
            android.graphics.BitmapFactory.Options options = d(zi);
            options.inJustDecodeBounds = true;
            a(zi.f, zi.g, ((a) (obj)).e, ((a) (obj)).f, options);
            if (flag)
            {
                int i;
                if (obj == a.c)
                {
                    i = ((flag1) ? 1 : 0);
                } else
                {
                    i = ((a) (obj)).d;
                }
                obj = android.provider.MediaStore.Video.Thumbnails.getThumbnail(contentresolver, l1, i, options);
            } else
            {
                obj = android.provider.MediaStore.Images.Thumbnails.getThumbnail(contentresolver, l1, ((a) (obj)).d, options);
            }
            if (obj != null)
            {
                return new Zk.a(((android.graphics.Bitmap) (obj)), null, Zf.c.b, j);
            }
        }
        return new Zk.a(null, c(zi), Zf.c.b, j);
    }

}
