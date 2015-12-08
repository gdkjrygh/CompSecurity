// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.fitbit.data.repo.l;
import com.fitbit.data.repo.o;
import com.fitbit.e.a;
import com.fitbit.util.aj;
import com.squareup.picasso.Downloader;
import java.io.IOException;

final class b
    implements Downloader
{

    b()
    {
    }

    private static Bitmap a(String s)
    {
        s = l.a().a(s);
        if (s != null)
        {
            return BitmapFactory.decodeByteArray(s, 0, s.length);
        } else
        {
            return null;
        }
    }

    public com.squareup.picasso.Downloader.Response load(Uri uri, boolean flag)
        throws IOException
    {
        com.fitbit.e.a.a("FitbitPicasso", "(DISK): Loading image: %s", new Object[] {
            uri
        });
        Bitmap bitmap = a(aj.a(uri.toString()));
        if (bitmap != null)
        {
            com.fitbit.e.a.a("FitbitPicasso", "(DISK): Image found: %s", new Object[] {
                uri
            });
            return new com.squareup.picasso.Downloader.Response(bitmap, false, bitmap.getByteCount());
        } else
        {
            com.fitbit.e.a.a("FitbitPicasso", "(DISK): Image NOT found: %s", new Object[] {
                uri
            });
            return null;
        }
    }
}
