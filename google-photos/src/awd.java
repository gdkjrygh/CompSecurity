// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;

public final class awd
    implements anj
{

    public static final anf a = anf.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", Long.valueOf(-1L), new awe());
    private static anf b = anf.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", null, new awf());
    private static final awg c = new awg();
    private final aqm d;
    private final awg e;

    public awd(aqm aqm)
    {
        this(aqm, c);
    }

    private awd(aqm aqm, awg awg1)
    {
        d = aqm;
        e = awg1;
    }

    private boolean a(ParcelFileDescriptor parcelfiledescriptor)
    {
        MediaMetadataRetriever mediametadataretriever = new MediaMetadataRetriever();
        try
        {
            mediametadataretriever.setDataSource(parcelfiledescriptor.getFileDescriptor());
        }
        // Misplaced declaration of an exception variable
        catch (ParcelFileDescriptor parcelfiledescriptor)
        {
            mediametadataretriever.release();
            return false;
        }
        finally
        {
            mediametadataretriever.release();
        }
        mediametadataretriever.release();
        return true;
        throw parcelfiledescriptor;
    }

    public final aqa a(Object obj, int i, int j, ani ani1)
    {
        ParcelFileDescriptor parcelfiledescriptor = (ParcelFileDescriptor)obj;
        long l = ((Long)ani1.a(a)).longValue();
        if (l < 0L && l != -1L)
        {
            throw new IllegalArgumentException((new StringBuilder(83)).append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ").append(l).toString());
        }
        obj = (Integer)ani1.a(b);
        ani1 = new MediaMetadataRetriever();
        ani1.setDataSource(parcelfiledescriptor.getFileDescriptor());
        if (l == -1L)
        {
            obj = ani1.getFrameAtTime();
        } else
        if (obj == null)
        {
            obj = ani1.getFrameAtTime(l);
        } else
        {
            obj = ani1.getFrameAtTime(l, ((Integer) (obj)).intValue());
        }
        ani1.release();
        parcelfiledescriptor.close();
        return ave.a(((android.graphics.Bitmap) (obj)), d);
    }

    public final volatile boolean a(Object obj, ani ani1)
    {
        return a((ParcelFileDescriptor)obj);
    }

}
