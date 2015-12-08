// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.download.ImageDownloader;
import com.nostra13.universalimageloader.utils.ImageSizeUtils;
import com.nostra13.universalimageloader.utils.IoUtils;
import com.nostra13.universalimageloader.utils.L;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.nostra13.universalimageloader.core.decode:
//            ImageDecoder, ImageDecodingInfo

public class BaseImageDecoder
    implements ImageDecoder
{
    protected static class ExifInfo
    {

        public final boolean flipHorizontal;
        public final int rotation;

        protected ExifInfo()
        {
            rotation = 0;
            flipHorizontal = false;
        }

        protected ExifInfo(int i, boolean flag)
        {
            rotation = i;
            flipHorizontal = flag;
        }
    }

    protected static class ImageFileInfo
    {

        public final ExifInfo exif;
        public final ImageSize imageSize;

        protected ImageFileInfo(ImageSize imagesize, ExifInfo exifinfo)
        {
            imageSize = imagesize;
            exif = exifinfo;
        }
    }


    protected static final String ERROR_CANT_DECODE_IMAGE = "Image can't be decoded [%s]";
    protected static final String LOG_FLIP_IMAGE = "Flip image horizontally [%s]";
    protected static final String LOG_ROTATE_IMAGE = "Rotate image on %1$d\260 [%2$s]";
    protected static final String LOG_SABSAMPLE_IMAGE = "Subsample original image (%1$s) to %2$s (scale = %3$d) [%4$s]";
    protected static final String LOG_SCALE_IMAGE = "Scale subsampled image (%1$s) to %2$s (scale = %3$.5f) [%4$s]";
    protected final boolean loggingEnabled;

    public BaseImageDecoder(boolean flag)
    {
        loggingEnabled = flag;
    }

    private boolean canDefineExifParams(String s, String s1)
    {
        return android.os.Build.VERSION.SDK_INT >= 5 && "image/jpeg".equalsIgnoreCase(s1) && com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.ofUri(s) == com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.FILE;
    }

    protected Bitmap considerExactScaleAndOrientaiton(Bitmap bitmap, ImageDecodingInfo imagedecodinginfo, int i, boolean flag)
    {
        Matrix matrix = new Matrix();
        ImageScaleType imagescaletype = imagedecodinginfo.getImageScaleType();
        if (imagescaletype == ImageScaleType.EXACTLY || imagescaletype == ImageScaleType.EXACTLY_STRETCHED)
        {
            ImageSize imagesize = new ImageSize(bitmap.getWidth(), bitmap.getHeight(), i);
            ImageSize imagesize1 = imagedecodinginfo.getTargetSize();
            com.nostra13.universalimageloader.core.assist.ViewScaleType viewscaletype = imagedecodinginfo.getViewScaleType();
            float f;
            boolean flag1;
            if (imagescaletype == ImageScaleType.EXACTLY_STRETCHED)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            f = ImageSizeUtils.computeImageScale(imagesize, imagesize1, viewscaletype, flag1);
            if (Float.compare(f, 1.0F) != 0)
            {
                matrix.setScale(f, f);
                if (loggingEnabled)
                {
                    L.d("Scale subsampled image (%1$s) to %2$s (scale = %3$.5f) [%4$s]", new Object[] {
                        imagesize, imagesize.scale(f), Float.valueOf(f), imagedecodinginfo.getImageKey()
                    });
                }
            }
        }
        if (flag)
        {
            matrix.postScale(-1F, 1.0F);
            if (loggingEnabled)
            {
                L.d("Flip image horizontally [%s]", new Object[] {
                    imagedecodinginfo.getImageKey()
                });
            }
        }
        if (i != 0)
        {
            matrix.postRotate(i);
            if (loggingEnabled)
            {
                L.d("Rotate image on %1$d\260 [%2$s]", new Object[] {
                    Integer.valueOf(i), imagedecodinginfo.getImageKey()
                });
            }
        }
        imagedecodinginfo = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (imagedecodinginfo != bitmap)
        {
            bitmap.recycle();
        }
        return imagedecodinginfo;
    }

    public Bitmap decode(ImageDecodingInfo imagedecodinginfo)
        throws IOException
    {
        InputStream inputstream;
        InputStream inputstream1;
        inputstream1 = getImageStream(imagedecodinginfo);
        inputstream = inputstream1;
        ImageFileInfo imagefileinfo = defineImageSizeAndRotation(inputstream1, imagedecodinginfo);
        inputstream = inputstream1;
        inputstream1 = resetStream(inputstream1, imagedecodinginfo);
        inputstream = inputstream1;
        Bitmap bitmap = BitmapFactory.decodeStream(inputstream1, null, prepareDecodingOptions(imagefileinfo.imageSize, imagedecodinginfo));
        IoUtils.closeSilently(inputstream1);
        if (bitmap == null)
        {
            L.e("Image can't be decoded [%s]", new Object[] {
                imagedecodinginfo.getImageKey()
            });
            return bitmap;
        } else
        {
            return considerExactScaleAndOrientaiton(bitmap, imagedecodinginfo, imagefileinfo.exif.rotation, imagefileinfo.exif.flipHorizontal);
        }
        imagedecodinginfo;
        IoUtils.closeSilently(inputstream);
        throw imagedecodinginfo;
    }

    protected ExifInfo defineExifOrientation(String s)
    {
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        i = 0;
        flag = false;
        flag1 = false;
        flag2 = false;
        flag3 = false;
        flag4 = false;
        int j = (new ExifInterface(com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.FILE.crop(s))).getAttributeInt("Orientation", 1);
        j;
        JVM INSTR tableswitch 1 8: default 88
    //                   1 106
    //                   2 103
    //                   3 127
    //                   4 124
    //                   5 138
    //                   6 114
    //                   7 111
    //                   8 141;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        flag = flag4;
_L11:
        return new ExifInfo(i, flag);
_L3:
        flag = true;
_L2:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L8:
        flag1 = true;
_L7:
        i = 90;
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L5:
        flag2 = true;
_L4:
        i = 180;
        flag = flag2;
        continue; /* Loop/switch isn't completed */
_L6:
        flag3 = true;
_L9:
        i = 270;
        flag = flag3;
        continue; /* Loop/switch isn't completed */
        IOException ioexception;
        ioexception;
        L.w("Can't read EXIF tags from file [%s]", new Object[] {
            s
        });
        flag = flag4;
        if (true) goto _L11; else goto _L10
_L10:
    }

    protected ImageFileInfo defineImageSizeAndRotation(InputStream inputstream, ImageDecodingInfo imagedecodinginfo)
        throws IOException
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputstream, null, options);
        inputstream = imagedecodinginfo.getImageUri();
        if (imagedecodinginfo.shouldConsiderExifParams() && canDefineExifParams(inputstream, options.outMimeType))
        {
            inputstream = defineExifOrientation(inputstream);
        } else
        {
            inputstream = new ExifInfo();
        }
        return new ImageFileInfo(new ImageSize(options.outWidth, options.outHeight, ((ExifInfo) (inputstream)).rotation), inputstream);
    }

    protected InputStream getImageStream(ImageDecodingInfo imagedecodinginfo)
        throws IOException
    {
        return imagedecodinginfo.getDownloader().getStream(imagedecodinginfo.getImageUri(), imagedecodinginfo.getExtraForDownloader());
    }

    protected android.graphics.BitmapFactory.Options prepareDecodingOptions(ImageSize imagesize, ImageDecodingInfo imagedecodinginfo)
    {
        ImageScaleType imagescaletype = imagedecodinginfo.getImageScaleType();
        int i;
        if (imagescaletype == ImageScaleType.NONE)
        {
            i = ImageSizeUtils.computeMinImageSampleSize(imagesize);
        } else
        {
            ImageSize imagesize1 = imagedecodinginfo.getTargetSize();
            boolean flag;
            if (imagescaletype == ImageScaleType.IN_SAMPLE_POWER_OF_2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = ImageSizeUtils.computeImageSampleSize(imagesize, imagesize1, imagedecodinginfo.getViewScaleType(), flag);
        }
        if (i > 1 && loggingEnabled)
        {
            L.d("Subsample original image (%1$s) to %2$s (scale = %3$d) [%4$s]", new Object[] {
                imagesize, imagesize.scaleDown(i), Integer.valueOf(i), imagedecodinginfo.getImageKey()
            });
        }
        imagesize = imagedecodinginfo.getDecodingOptions();
        imagesize.inSampleSize = i;
        return imagesize;
    }

    protected InputStream resetStream(InputStream inputstream, ImageDecodingInfo imagedecodinginfo)
        throws IOException
    {
        try
        {
            inputstream.reset();
        }
        catch (IOException ioexception)
        {
            IoUtils.closeSilently(inputstream);
            return getImageStream(imagedecodinginfo);
        }
        return inputstream;
    }
}
