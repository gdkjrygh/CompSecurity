// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ab;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import p.q.a;
import p.t.c;

// Referenced classes of package p.ab:
//            a

public class s
    implements p.ab.a
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

    public s()
    {
        this(a, -1);
    }

    s(a a1, int i)
    {
        b = a1;
        c = i;
    }

    public Bitmap a(ParcelFileDescriptor parcelfiledescriptor, c c1, int i, int j, p.q.a a1)
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
