// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.engine.a.c;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            a

public class r
    implements com.bumptech.glide.load.resource.bitmap.a
{
    static class a
    {

        public MediaMetadataRetriever a()
        {
            return new MediaMetadataRetriever();
        }

        a()
        {
        }
    }


    private static final a a = new a();
    private a b;
    private int c;

    public r()
    {
        this(a, -1);
    }

    r(a a1, int i)
    {
        b = a1;
        c = i;
    }

    public Bitmap a(ParcelFileDescriptor parcelfiledescriptor, c c1, int i, int j, com.bumptech.glide.load.a a1)
        throws IOException
    {
        a1 = b.a();
        a1.setDataSource(parcelfiledescriptor.getFileDescriptor());
        if (c >= 0)
        {
            c1 = a1.getFrameAtTime(c);
        } else
        {
            c1 = a1.getFrameAtTime();
        }
        a1.release();
        parcelfiledescriptor.close();
        return c1;
    }

    public String a()
    {
        return "VideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }

}
