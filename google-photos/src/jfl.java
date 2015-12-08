// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.io.IOException;

public final class jfl
{

    private final Context a;
    private final noz b;
    private final noz c;

    public jfl(Context context)
    {
        a = context;
        b = noz.a(context, 2, "FramerateExtractor", new String[0]);
        c = noz.a(context, "FramerateExtractor", new String[0]);
    }

    public float a(MediaExtractor mediaextractor)
    {
        float f;
        int i;
        i = 0;
        f = 0.0F;
_L2:
        float f1;
        MediaFormat mediaformat;
        if (i >= mediaextractor.getTrackCount())
        {
            break; /* Loop/switch isn't completed */
        }
        mediaformat = mediaextractor.getTrackFormat(i);
        f1 = f;
        if (!ejv.b(mediaformat.getString("mime")))
        {
            break MISSING_BLOCK_LABEL_83;
        }
        f1 = f;
        if (!mediaformat.containsKey("frame-rate"))
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (f != 0.0F && f != (float)mediaformat.getInteger("frame-rate"))
        {
            return 0.0F;
        }
        int j = mediaformat.getInteger("frame-rate");
        f1 = j;
_L3:
        i++;
        f = f1;
        if (true) goto _L2; else goto _L1
_L1:
        return f;
        NumberFormatException numberformatexception;
        numberformatexception;
        f1 = f;
          goto _L3
    }

    public float a(MediaMetadataRetriever mediametadataretriever)
    {
        float f = 0.0F;
        try
        {
            mediametadataretriever = mediametadataretriever.extractMetadata(25);
        }
        // Misplaced declaration of an exception variable
        catch (MediaMetadataRetriever mediametadataretriever)
        {
            return 0.0F;
        }
        if (mediametadataretriever == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        f = Float.valueOf(mediametadataretriever).floatValue();
        return f;
    }

    public MediaMetadataRetriever a(Uri uri)
    {
        MediaMetadataRetriever mediametadataretriever = new MediaMetadataRetriever();
        try
        {
            mediametadataretriever.setDataSource(a, uri);
        }
        catch (RuntimeException runtimeexception)
        {
            if (c.a())
            {
                noy.a("uri", uri);
            }
            return null;
        }
        return mediametadataretriever;
    }

    public MediaExtractor b(Uri uri)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        MediaExtractor mediaextractor = new MediaExtractor();
        mediaextractor.setDataSource(a, uri, null);
        return mediaextractor;
        Object obj;
        obj;
_L3:
        if (c.a())
        {
            noy.a("uri", uri);
            return null;
        }
          goto _L1
        obj;
          goto _L3
    }
}
