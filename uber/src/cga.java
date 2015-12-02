// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

final class cga extends cfm
{

    private static final String b[] = {
        "orientation"
    };

    cga(Context context)
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

    private static cgb a(int i, int j)
    {
        if (i <= cgb.a.e && j <= cgb.a.f)
        {
            return cgb.a;
        }
        if (i <= cgb.b.e && j <= cgb.b.f)
        {
            return cgb.b;
        } else
        {
            return cgb.c;
        }
    }

    public final boolean a(cgr cgr1)
    {
        cgr1 = cgr1.d;
        return "content".equals(cgr1.getScheme()) && "media".equals(cgr1.getAuthority());
    }

    public final cgv b(cgr cgr1)
    {
        boolean flag1 = true;
        Object obj = a.getContentResolver();
        int j = a(((ContentResolver) (obj)), cgr1.d);
        String s = ((ContentResolver) (obj)).getType(cgr1.d);
        boolean flag;
        if (s != null && s.startsWith("video/"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (cgr1.d())
        {
            cgb cgb1 = a(cgr1.h, cgr1.i);
            if (!flag && cgb1 == cgb.c)
            {
                return new cgv(null, c(cgr1), cgl.b, j);
            }
            long l = ContentUris.parseId(cgr1.d);
            android.graphics.BitmapFactory.Options options = d(cgr1);
            options.inJustDecodeBounds = true;
            a(cgr1.h, cgr1.i, cgb1.e, cgb1.f, options, cgr1);
            if (flag)
            {
                int i;
                if (cgb1 == cgb.c)
                {
                    i = ((flag1) ? 1 : 0);
                } else
                {
                    i = cgb1.d;
                }
                obj = android.provider.MediaStore.Video.Thumbnails.getThumbnail(((ContentResolver) (obj)), l, i, options);
            } else
            {
                obj = android.provider.MediaStore.Images.Thumbnails.getThumbnail(((ContentResolver) (obj)), l, cgb1.d, options);
            }
            if (obj != null)
            {
                return new cgv(((android.graphics.Bitmap) (obj)), null, cgl.b, j);
            }
        }
        return new cgv(null, c(cgr1), cgl.b, j);
    }

}
