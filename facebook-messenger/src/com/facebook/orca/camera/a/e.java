// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera.a;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.orca.camera.aa;

// Referenced classes of package com.facebook.orca.camera.a:
//            a, c, b

public class e extends a
    implements c
{

    private static final Class i = com/facebook/orca/camera/a/a;
    private static final String k[] = {
        "_id"
    };
    private int j;

    public e(b b, ContentResolver contentresolver, long l, int i1, Uri uri, String s, 
            long l1, String s1, long l2, String s2, String s3, 
            int j1)
    {
        super(b, contentresolver, l, i1, uri, s, l1, s1, l2, s2, s3);
        j = j1;
    }

    public Bitmap a(boolean flag)
    {
        Object obj = new android.graphics.BitmapFactory.Options();
        obj.inDither = false;
        obj.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        Bitmap bitmap = android.provider.MediaStore.Images.Thumbnails.getThumbnail(a, c, 1, ((android.graphics.BitmapFactory.Options) (obj)));
        obj = bitmap;
        if (bitmap != null)
        {
            obj = bitmap;
            if (flag)
            {
                obj = aa.a(bitmap, c());
            }
        }
        return ((Bitmap) (obj));
    }

    public int c()
    {
        return j;
    }

}
