// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.download;

import com.nostra13.universalimageloader.core.assist.FlushedInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.nostra13.universalimageloader.core.download:
//            ImageDownloader

public class SlowNetworkImageDownloader
    implements ImageDownloader
{

    private final ImageDownloader wrappedDownloader;

    public SlowNetworkImageDownloader(ImageDownloader imagedownloader)
    {
        wrappedDownloader = imagedownloader;
    }

    public InputStream getStream(String s, Object obj)
        throws IOException
    {
        obj = wrappedDownloader.getStream(s, obj);
        static class _cls1
        {

            static final int $SwitchMap$com$nostra13$universalimageloader$core$download$ImageDownloader$Scheme[];

            static 
            {
                $SwitchMap$com$nostra13$universalimageloader$core$download$ImageDownloader$Scheme = new int[ImageDownloader.Scheme.values().length];
                try
                {
                    $SwitchMap$com$nostra13$universalimageloader$core$download$ImageDownloader$Scheme[ImageDownloader.Scheme.HTTP.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$nostra13$universalimageloader$core$download$ImageDownloader$Scheme[ImageDownloader.Scheme.HTTPS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme[ImageDownloader.Scheme.ofUri(s).ordinal()])
        {
        default:
            return ((InputStream) (obj));

        case 1: // '\001'
        case 2: // '\002'
            return new FlushedInputStream(((InputStream) (obj)));
        }
    }
}
