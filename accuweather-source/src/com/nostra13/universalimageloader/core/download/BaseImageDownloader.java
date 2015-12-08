// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.download;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.nostra13.universalimageloader.core.assist.ContentLengthInputStream;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.nostra13.universalimageloader.core.download:
//            ImageDownloader

public class BaseImageDownloader
    implements ImageDownloader
{

    protected static final String ALLOWED_URI_CHARS = "@#&=*+-_.,:!?()/~'%";
    protected static final int BUFFER_SIZE = 32768;
    public static final int DEFAULT_HTTP_CONNECT_TIMEOUT = 5000;
    public static final int DEFAULT_HTTP_READ_TIMEOUT = 20000;
    private static final String ERROR_UNSUPPORTED_SCHEME = "UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))";
    protected static final int MAX_REDIRECT_COUNT = 5;
    protected final int connectTimeout;
    protected final Context context;
    protected final int readTimeout;

    public BaseImageDownloader(Context context1)
    {
        context = context1.getApplicationContext();
        connectTimeout = 5000;
        readTimeout = 20000;
    }

    public BaseImageDownloader(Context context1, int i, int j)
    {
        context = context1.getApplicationContext();
        connectTimeout = i;
        readTimeout = j;
    }

    protected HttpURLConnection createConnection(String s, Object obj)
        throws IOException
    {
        s = (HttpURLConnection)(new URL(Uri.encode(s, "@#&=*+-_.,:!?()/~'%"))).openConnection();
        s.setConnectTimeout(connectTimeout);
        s.setReadTimeout(readTimeout);
        return s;
    }

    public InputStream getStream(String s, Object obj)
        throws IOException
    {
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
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$nostra13$universalimageloader$core$download$ImageDownloader$Scheme[ImageDownloader.Scheme.HTTPS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$nostra13$universalimageloader$core$download$ImageDownloader$Scheme[ImageDownloader.Scheme.FILE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$nostra13$universalimageloader$core$download$ImageDownloader$Scheme[ImageDownloader.Scheme.CONTENT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$nostra13$universalimageloader$core$download$ImageDownloader$Scheme[ImageDownloader.Scheme.ASSETS.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$nostra13$universalimageloader$core$download$ImageDownloader$Scheme[ImageDownloader.Scheme.DRAWABLE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$nostra13$universalimageloader$core$download$ImageDownloader$Scheme[ImageDownloader.Scheme.UNKNOWN.ordinal()] = 7;
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
            return getStreamFromOtherSource(s, obj);

        case 1: // '\001'
        case 2: // '\002'
            return getStreamFromNetwork(s, obj);

        case 3: // '\003'
            return getStreamFromFile(s, obj);

        case 4: // '\004'
            return getStreamFromContent(s, obj);

        case 5: // '\005'
            return getStreamFromAssets(s, obj);

        case 6: // '\006'
            return getStreamFromDrawable(s, obj);
        }
    }

    protected InputStream getStreamFromAssets(String s, Object obj)
        throws IOException
    {
        s = ImageDownloader.Scheme.ASSETS.crop(s);
        return context.getAssets().open(s);
    }

    protected InputStream getStreamFromContent(String s, Object obj)
        throws FileNotFoundException
    {
        return context.getContentResolver().openInputStream(Uri.parse(s));
    }

    protected InputStream getStreamFromDrawable(String s, Object obj)
    {
        int i = Integer.parseInt(ImageDownloader.Scheme.DRAWABLE.crop(s));
        s = ((BitmapDrawable)context.getResources().getDrawable(i)).getBitmap();
        obj = new ByteArrayOutputStream();
        s.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, ((java.io.OutputStream) (obj)));
        return new ByteArrayInputStream(((ByteArrayOutputStream) (obj)).toByteArray());
    }

    protected InputStream getStreamFromFile(String s, Object obj)
        throws IOException
    {
        s = ImageDownloader.Scheme.FILE.crop(s);
        return new ContentLengthInputStream(new BufferedInputStream(new FileInputStream(s), 32768), (new File(s)).length());
    }

    protected InputStream getStreamFromNetwork(String s, Object obj)
        throws IOException
    {
        s = createConnection(s, obj);
        for (int i = 0; s.getResponseCode() / 100 == 3 && i < 5; i++)
        {
            s = createConnection(s.getHeaderField("Location"), obj);
        }

        return new ContentLengthInputStream(new BufferedInputStream(s.getInputStream(), 32768), s.getContentLength());
    }

    protected InputStream getStreamFromOtherSource(String s, Object obj)
        throws IOException
    {
        throw new UnsupportedOperationException(String.format("UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))", new Object[] {
            s
        }));
    }
}
