// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.util;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.android.ex.photo.PhotoViewController;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.android.ex.photo.util:
//            Exif

public final class ImageUtils
{
    static class BaseInputStreamFactory
        implements InputStreamFactory
    {

        protected final ContentResolver mResolver;
        protected final Uri mUri;

        public InputStream createInputStream()
            throws FileNotFoundException
        {
            return mResolver.openInputStream(mUri);
        }

        public BaseInputStreamFactory(ContentResolver contentresolver, Uri uri)
        {
            mResolver = contentresolver;
            mUri = uri;
        }
    }

    static final class DataInputStreamFactory extends BaseInputStreamFactory
    {

        private byte mData[];

        private static byte[] parseDataUri(Uri uri)
        {
            uri = uri.getSchemeSpecificPart();
            if (uri.startsWith("base64,"))
            {
                return Base64.decode(uri.substring(7), 8);
            }
            if (!ImageUtils.BASE64_IMAGE_URI_PATTERN.matcher(uri).matches())
            {
                break MISSING_BLOCK_LABEL_100;
            }
            uri = Base64.decode(uri.substring(uri.indexOf("base64,") + 7), 0);
            return uri;
            uri;
            uri = String.valueOf(uri);
            Log.e("ImageUtils", (new StringBuilder(String.valueOf(uri).length() + 21)).append("Mailformed data URI: ").append(uri).toString());
            return null;
        }

        public final InputStream createInputStream()
            throws FileNotFoundException
        {
            if (mData == null)
            {
                mData = parseDataUri(mUri);
                if (mData == null)
                {
                    return super.createInputStream();
                }
            }
            return new ByteArrayInputStream(mData);
        }

        public DataInputStreamFactory(ContentResolver contentresolver, Uri uri)
        {
            super(contentresolver, uri);
        }
    }

    public static final class ImageSize extends Enum
    {

        private static final ImageSize $VALUES[];
        public static final ImageSize EXTRA_SMALL;
        public static final ImageSize NORMAL;
        public static final ImageSize SMALL;

        public static ImageSize valueOf(String s)
        {
            return (ImageSize)Enum.valueOf(com/android/ex/photo/util/ImageUtils$ImageSize, s);
        }

        public static ImageSize[] values()
        {
            return (ImageSize[])$VALUES.clone();
        }

        static 
        {
            EXTRA_SMALL = new ImageSize("EXTRA_SMALL", 0);
            SMALL = new ImageSize("SMALL", 1);
            NORMAL = new ImageSize("NORMAL", 2);
            $VALUES = (new ImageSize[] {
                EXTRA_SMALL, SMALL, NORMAL
            });
        }

        private ImageSize(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface InputStreamFactory
    {

        public abstract InputStream createInputStream()
            throws FileNotFoundException;
    }


    private static final Pattern BASE64_IMAGE_URI_PATTERN = Pattern.compile("^(?:.*;)?base64,.*");
    public static final ImageSize sUseImageSize;

    private static InputStreamFactory createInputStreamFactory(ContentResolver contentresolver, Uri uri)
    {
        if ("data".equals(uri.getScheme()))
        {
            return new DataInputStreamFactory(contentresolver, uri);
        } else
        {
            return new BaseInputStreamFactory(contentresolver, uri);
        }
    }

    public static com.android.ex.photo.loaders.PhotoBitmapLoaderInterface.BitmapResult createLocalBitmap(ContentResolver contentresolver, Uri uri, int i)
    {
        com.android.ex.photo.loaders.PhotoBitmapLoaderInterface.BitmapResult bitmapresult = new com.android.ex.photo.loaders.PhotoBitmapLoaderInterface.BitmapResult();
        contentresolver = createInputStreamFactory(contentresolver, uri);
        android.graphics.BitmapFactory.Options options;
        try
        {
            uri = getImageBounds(contentresolver);
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            return bitmapresult;
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            bitmapresult.status = 1;
            return bitmapresult;
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            return bitmapresult;
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            bitmapresult.status = 1;
            return bitmapresult;
        }
        if (uri != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        bitmapresult.status = 1;
        return bitmapresult;
        options = new android.graphics.BitmapFactory.Options();
        options.inSampleSize = Math.max(((Point) (uri)).x / i, ((Point) (uri)).y / i);
        bitmapresult.bitmap = decodeStream(contentresolver, null, options);
        bitmapresult.status = 0;
        return bitmapresult;
    }

    private static Bitmap decodeStream(InputStreamFactory inputstreamfactory, Rect rect, android.graphics.BitmapFactory.Options options)
        throws FileNotFoundException
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj = null;
        obj1 = null;
        Object obj3 = inputstreamfactory.createInputStream();
        obj1 = obj3;
        obj2 = obj3;
        obj = obj3;
        int i = Exif.getOrientation(((InputStream) (obj3)), -1L);
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        obj1 = obj3;
        obj2 = obj3;
        obj = obj3;
        ((InputStream) (obj3)).close();
        obj1 = obj3;
        obj2 = obj3;
        obj = obj3;
        inputstreamfactory = inputstreamfactory.createInputStream();
        obj1 = inputstreamfactory;
        obj2 = inputstreamfactory;
        obj = inputstreamfactory;
        obj3 = BitmapFactory.decodeStream(inputstreamfactory, rect, options);
        if (inputstreamfactory == null || obj3 != null) goto _L2; else goto _L1
_L1:
        obj1 = inputstreamfactory;
        obj2 = inputstreamfactory;
        obj = inputstreamfactory;
        if (options.inJustDecodeBounds) goto _L2; else goto _L3
_L3:
        obj1 = inputstreamfactory;
        obj2 = inputstreamfactory;
        obj = inputstreamfactory;
        Log.w("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options): Image bytes cannot be decoded into a Bitmap");
        obj1 = inputstreamfactory;
        obj2 = inputstreamfactory;
        obj = inputstreamfactory;
        throw new UnsupportedOperationException("Image bytes cannot be decoded into a Bitmap.");
        inputstreamfactory;
        obj = obj1;
        Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an OOME", inputstreamfactory);
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStreamFactory inputstreamfactory) { }
        }
        rect = null;
_L7:
        return rect;
_L2:
        if (obj3 == null || i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = inputstreamfactory;
        obj2 = inputstreamfactory;
        obj = inputstreamfactory;
        rect = new Matrix();
        obj1 = inputstreamfactory;
        obj2 = inputstreamfactory;
        obj = inputstreamfactory;
        rect.postRotate(i);
        obj1 = inputstreamfactory;
        obj2 = inputstreamfactory;
        obj = inputstreamfactory;
        options = Bitmap.createBitmap(((Bitmap) (obj3)), 0, 0, ((Bitmap) (obj3)).getWidth(), ((Bitmap) (obj3)).getHeight(), rect, true);
        rect = options;
        if (inputstreamfactory != null)
        {
            try
            {
                inputstreamfactory.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStreamFactory inputstreamfactory)
            {
                return options;
            }
            return options;
        }
        if (true) goto _L5; else goto _L4
_L5:
        break MISSING_BLOCK_LABEL_175;
_L4:
        rect = ((Rect) (obj3));
        if (inputstreamfactory != null)
        {
            try
            {
                inputstreamfactory.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStreamFactory inputstreamfactory)
            {
                return ((Bitmap) (obj3));
            }
            return ((Bitmap) (obj3));
        }
        continue; /* Loop/switch isn't completed */
        inputstreamfactory;
        obj = obj2;
        Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an IOE", inputstreamfactory);
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStreamFactory inputstreamfactory) { }
        }
        return null;
        inputstreamfactory;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Rect rect) { }
        }
        throw inputstreamfactory;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static Point getImageBounds(InputStreamFactory inputstreamfactory)
        throws IOException
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        decodeStream(inputstreamfactory, null, options);
        return new Point(options.outWidth, options.outHeight);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            sUseImageSize = ImageSize.NORMAL;
        } else
        if ((long)PhotoViewController.sMemoryClass >= 32L)
        {
            sUseImageSize = ImageSize.NORMAL;
        } else
        if ((long)PhotoViewController.sMemoryClass >= 24L)
        {
            sUseImageSize = ImageSize.SMALL;
        } else
        {
            sUseImageSize = ImageSize.EXTRA_SMALL;
        }
    }

}
