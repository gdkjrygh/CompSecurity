// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;

public final class jfj
{

    private final Context a;
    private final noz b;

    public jfj(Context context)
    {
        a = context;
        b = noz.a(context, "VideoDimensionExtractor", new String[0]);
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
            if (b.a())
            {
                noy.a("uri", uri);
            }
            return null;
        }
        return mediametadataretriever;
    }

    public jfi a(MediaMetadataRetriever mediametadataretriever)
    {
        String s;
        String s1;
        s = mediametadataretriever.extractMetadata(18);
        s1 = mediametadataretriever.extractMetadata(19);
        mediametadataretriever = mediametadataretriever.extractMetadata(24);
        int i;
        int j;
        if ("90".equals(mediametadataretriever) || "270".equals(mediametadataretriever))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            mediametadataretriever = s1;
        } else
        {
            mediametadataretriever = s;
        }
        j = Integer.parseInt(mediametadataretriever);
        if (i == 0)
        {
            s = s1;
        }
        i = Integer.parseInt(s);
        if (j <= 0 || i <= 0)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        mediametadataretriever = new jfi(j, i);
        return mediametadataretriever;
        mediametadataretriever;
        return null;
    }
}
