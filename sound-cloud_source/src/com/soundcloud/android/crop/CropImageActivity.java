// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLES10;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package com.soundcloud.android.crop:
//            MonitoredActivity, CropUtil, CropImageView, RotateBitmap, 
//            HighlightView

public class CropImageActivity extends MonitoredActivity
{
    private class Cropper
    {

        final CropImageActivity this$0;

        private void makeDefault()
        {
            if (rotateBitmap == null)
            {
                return;
            }
            HighlightView highlightview = new HighlightView(imageView);
            int j1 = rotateBitmap.getWidth();
            int i1 = rotateBitmap.getHeight();
            Rect rect = new Rect(0, 0, j1, i1);
            int j = (Math.min(j1, i1) * 4) / 5;
            RectF rectf;
            Matrix matrix;
            int i;
            int k;
            boolean flag;
            if (aspectX != 0 && aspectY != 0)
            {
                if (aspectX > aspectY)
                {
                    i = (aspectY * j) / aspectX;
                } else
                {
                    int l = (aspectX * j) / aspectY;
                    i = j;
                    j = l;
                }
            } else
            {
                i = j;
            }
            k = (j1 - j) / 2;
            i1 = (i1 - i) / 2;
            rectf = new RectF(k, i1, j + k, i + i1);
            matrix = imageView.getUnrotatedMatrix();
            if (aspectX != 0 && aspectY != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            highlightview.setup(matrix, rect, rectf, flag);
            imageView.add(highlightview);
        }

        public void crop()
        {
            class _cls1
                implements Runnable
            {

                final Cropper this$1;

                public void run()
                {
                    makeDefault();
                    imageView.invalidate();
                    if (imageView.highlightViews.size() == 1)
                    {
                        cropView = (HighlightView)imageView.highlightViews.get(0);
                        cropView.setFocus(true);
                    }
                }

                _cls1()
                {
                    this$1 = Cropper.this;
                    super();
                }
            }

            handler.post(new _cls1());
        }


        private Cropper()
        {
            this$0 = CropImageActivity.this;
            super();
        }

        Cropper(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final int SIZE_DEFAULT = 2048;
    private static final int SIZE_LIMIT = 4096;
    private int aspectX;
    private int aspectY;
    private HighlightView cropView;
    private int exifRotation;
    private final Handler handler = new Handler();
    private CropImageView imageView;
    private boolean isSaving;
    private int maxX;
    private int maxY;
    private RotateBitmap rotateBitmap;
    private int sampleSize;
    private Uri saveUri;
    private Uri sourceUri;

    public CropImageActivity()
    {
    }

    private int calculateBitmapSampleSize(Uri uri)
        throws IOException
    {
        Uri uri1;
        android.graphics.BitmapFactory.Options options;
        int i;
        uri1 = null;
        i = 1;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        uri = getContentResolver().openInputStream(uri);
        uri1 = uri;
        BitmapFactory.decodeStream(uri, null, options);
        CropUtil.closeSilently(uri);
        for (int j = getMaxImageSize(); options.outHeight / i > j || options.outWidth / i > j; i <<= 1) { }
        break MISSING_BLOCK_LABEL_86;
        uri;
        CropUtil.closeSilently(uri1);
        throw uri;
        return i;
    }

    private void clearImageView()
    {
        imageView.clear();
        if (rotateBitmap != null)
        {
            rotateBitmap.recycle();
        }
        System.gc();
    }

    private Bitmap decodeRegionCrop(Rect rect, int i, int j)
    {
        float f1;
        Object obj4;
        obj4 = null;
        f1 = 0.0F;
        clearImageView();
        Object obj = getContentResolver().openInputStream(sourceUri);
        Object obj2;
        Object obj3 = obj;
        float f;
        Object obj1;
        BitmapRegionDecoder bitmapregiondecoder;
        RectF rectf;
        int k;
        int l;
        try
        {
            bitmapregiondecoder = BitmapRegionDecoder.newInstance(((java.io.InputStream) (obj)), false);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            rect = ((Rect) (obj));
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            rect = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            continue; /* Loop/switch isn't completed */
        }
_L1:
        obj3 = obj;
        k = bitmapregiondecoder.getWidth();
        obj3 = obj;
        l = bitmapregiondecoder.getHeight();
        obj1 = rect;
        obj3 = obj;
        if (exifRotation == 0)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        obj3 = obj;
        obj1 = new Matrix();
        obj3 = obj;
        ((Matrix) (obj1)).setRotate(-exifRotation);
        obj3 = obj;
        rectf = new RectF();
        obj3 = obj;
        ((Matrix) (obj1)).mapRect(rectf, new RectF(rect));
        obj3 = obj;
        if (rectf.left < 0.0F)
        {
            f = k;
        } else
        {
            f = 0.0F;
        }
        obj3 = obj;
        if (rectf.top < 0.0F)
        {
            f1 = l;
        }
        obj3 = obj;
        rectf.offset(f, f1);
        obj3 = obj;
        obj1 = new Rect((int)rectf.left, (int)rectf.top, (int)rectf.right, (int)rectf.bottom);
        obj3 = obj;
        rect = bitmapregiondecoder.decodeRegion(((Rect) (obj1)), new android.graphics.BitmapFactory.Options());
        obj3 = obj;
        if (((Rect) (obj1)).width() > i)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        obj4 = rect;
        obj3 = obj;
        if (((Rect) (obj1)).height() <= j)
        {
            break MISSING_BLOCK_LABEL_332;
        }
        obj3 = obj;
        obj4 = new Matrix();
        obj3 = obj;
        ((Matrix) (obj4)).postScale((float)i / (float)((Rect) (obj1)).width(), (float)j / (float)((Rect) (obj1)).height());
        obj3 = obj;
        obj4 = Bitmap.createBitmap(rect, 0, 0, rect.getWidth(), rect.getHeight(), ((Matrix) (obj4)), true);
        CropUtil.closeSilently(((java.io.Closeable) (obj)));
        return ((Bitmap) (obj4));
        obj3;
        rect = ((Rect) (obj4));
        obj4 = obj3;
_L7:
        obj3 = obj;
        throw new IllegalArgumentException((new StringBuilder("Rectangle ")).append(obj1).append(" is outside of the image (").append(k).append(",").append(l).append(",").append(exifRotation).append(")").toString(), ((Throwable) (obj4)));
        obj2;
        obj3 = rect;
        rect = ((Rect) (obj));
        obj = obj3;
_L6:
        (new StringBuilder("Error cropping image: ")).append(((IOException) (obj2)).getMessage());
        setResultException(((Throwable) (obj2)));
        CropUtil.closeSilently(rect);
        return ((Bitmap) (obj));
        obj2;
        obj = null;
        rect = null;
_L4:
        obj3 = obj;
        (new StringBuilder("OOM cropping image: ")).append(((OutOfMemoryError) (obj2)).getMessage());
        obj3 = obj;
        setResultException(((Throwable) (obj2)));
        CropUtil.closeSilently(((java.io.Closeable) (obj)));
        return rect;
        rect;
        obj3 = null;
_L2:
        CropUtil.closeSilently(((java.io.Closeable) (obj3)));
        throw rect;
        obj;
        obj3 = rect;
        rect = ((Rect) (obj));
        if (true) goto _L2; else goto _L1
        obj2;
        continue; /* Loop/switch isn't completed */
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        rect = null;
        obj = null;
        continue; /* Loop/switch isn't completed */
        obj2;
        java.io.InputStream inputstream = ((java.io.InputStream) (obj));
        obj = rect;
        rect = inputstream;
        if (true) goto _L6; else goto _L5
_L5:
        obj4;
          goto _L7
    }

    private int getMaxImageSize()
    {
        int i = getMaxTextureSize();
        if (i == 0)
        {
            return 2048;
        } else
        {
            return Math.min(i, 4096);
        }
    }

    private int getMaxTextureSize()
    {
        int ai[] = new int[1];
        GLES10.glGetIntegerv(3379, ai, 0);
        return ai[0];
    }

    private void loadInput()
    {
        Object obj;
        Object obj1;
        Object obj3;
        java.io.InputStream inputstream;
        android.graphics.BitmapFactory.Options options;
        Object obj4;
        options = null;
        obj4 = null;
        inputstream = null;
        obj = getIntent();
        obj1 = ((Intent) (obj)).getExtras();
        if (obj1 != null)
        {
            aspectX = ((Bundle) (obj1)).getInt("aspect_x");
            aspectY = ((Bundle) (obj1)).getInt("aspect_y");
            maxX = ((Bundle) (obj1)).getInt("max_x");
            maxY = ((Bundle) (obj1)).getInt("max_y");
            saveUri = (Uri)((Bundle) (obj1)).getParcelable("output");
        }
        sourceUri = ((Intent) (obj)).getData();
        if (sourceUri == null)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        exifRotation = CropUtil.getExifRotation(CropUtil.getFromMediaUri(this, getContentResolver(), sourceUri));
        obj1 = inputstream;
        obj3 = options;
        obj = obj4;
        sampleSize = calculateBitmapSampleSize(sourceUri);
        obj1 = inputstream;
        obj3 = options;
        obj = obj4;
        inputstream = getContentResolver().openInputStream(sourceUri);
        obj1 = inputstream;
        obj3 = inputstream;
        obj = inputstream;
        options = new android.graphics.BitmapFactory.Options();
        obj1 = inputstream;
        obj3 = inputstream;
        obj = inputstream;
        options.inSampleSize = sampleSize;
        obj1 = inputstream;
        obj3 = inputstream;
        obj = inputstream;
        rotateBitmap = new RotateBitmap(BitmapFactory.decodeStream(inputstream, null, options), exifRotation);
        CropUtil.closeSilently(inputstream);
        return;
        obj3;
        obj = obj1;
        (new StringBuilder("Error reading image: ")).append(((IOException) (obj3)).getMessage());
        obj = obj1;
        setResultException(((Throwable) (obj3)));
        CropUtil.closeSilently(((java.io.Closeable) (obj1)));
        return;
        Object obj2;
        obj2;
        obj = obj3;
        (new StringBuilder("OOM reading image: ")).append(((OutOfMemoryError) (obj2)).getMessage());
        obj = obj3;
        setResultException(((Throwable) (obj2)));
        CropUtil.closeSilently(((java.io.Closeable) (obj3)));
        return;
        obj2;
        CropUtil.closeSilently(((java.io.Closeable) (obj)));
        throw obj2;
    }

    private void onSaveClicked()
    {
label0:
        {
            if (cropView == null || isSaving)
            {
                return;
            }
            isSaving = true;
            Object obj = cropView.getScaledCropRect(sampleSize);
            int k = ((Rect) (obj)).width();
            int l = ((Rect) (obj)).height();
            int i = l;
            int j = k;
            if (maxX <= 0)
            {
                break label0;
            }
            i = l;
            j = k;
            if (maxY <= 0)
            {
                break label0;
            }
            if (k <= maxX)
            {
                i = l;
                j = k;
                if (l <= maxY)
                {
                    break label0;
                }
            }
            float f = (float)k / (float)l;
            if ((float)maxX / (float)maxY > f)
            {
                i = maxY;
                j = (int)((float)maxY * f + 0.5F);
            } else
            {
                j = maxX;
                i = (int)((float)maxX / f + 0.5F);
            }
        }
        try
        {
            obj = decodeRegionCrop(((Rect) (obj)), j, i);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            setResultException(illegalargumentexception);
            finish();
            return;
        }
        if (obj != null)
        {
            imageView.setImageRotateBitmapResetBase(new RotateBitmap(((Bitmap) (obj)), exifRotation), true);
            imageView.center();
            imageView.highlightViews.clear();
        }
        saveImage(((Bitmap) (obj)));
    }

    private void saveImage(final Bitmap b)
    {
        if (b != null)
        {
            CropUtil.startBackgroundJob(this, null, getResources().getString(R.string.crop__saving), new _cls5(), handler);
            return;
        } else
        {
            finish();
            return;
        }
    }

    private void saveOutput(final Bitmap b)
    {
        if (saveUri == null) goto _L2; else goto _L1
_L1:
        java.io.OutputStream outputstream;
        java.io.OutputStream outputstream1;
        outputstream1 = null;
        outputstream = null;
        java.io.OutputStream outputstream2 = getContentResolver().openOutputStream(saveUri);
        if (outputstream2 == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        outputstream = outputstream2;
        outputstream1 = outputstream2;
        b.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, outputstream2);
        CropUtil.closeSilently(outputstream2);
_L4:
        CropUtil.copyExifRotation(CropUtil.getFromMediaUri(this, getContentResolver(), sourceUri), CropUtil.getFromMediaUri(this, getContentResolver(), saveUri));
        setResultUri(saveUri);
_L2:
        handler.post(new _cls6());
        finish();
        return;
        IOException ioexception;
        ioexception;
        outputstream1 = outputstream;
        setResultException(ioexception);
        outputstream1 = outputstream;
        (new StringBuilder("Cannot open file: ")).append(saveUri);
        CropUtil.closeSilently(outputstream);
        if (true) goto _L4; else goto _L3
_L3:
        b;
        CropUtil.closeSilently(outputstream1);
        throw b;
    }

    private void setResultException(Throwable throwable)
    {
        setResult(404, (new Intent()).putExtra("error", throwable));
    }

    private void setResultUri(Uri uri)
    {
        setResult(-1, (new Intent()).putExtra("output", uri));
    }

    private void setupViews()
    {
        setContentView(R.layout.crop__activity_crop);
        imageView = (CropImageView)findViewById(R.id.crop_image);
        imageView.context = this;
        imageView.setRecycler(new _cls1());
        findViewById(R.id.btn_cancel).setOnClickListener(new _cls2());
        findViewById(R.id.btn_done).setOnClickListener(new _cls3());
    }

    private void setupWindowFlags()
    {
        requestWindowFeature(1);
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            getWindow().clearFlags(0x4000000);
        }
    }

    private void startCrop()
    {
        if (isFinishing())
        {
            return;
        } else
        {
            imageView.setImageRotateBitmapResetBase(rotateBitmap, true);
            CropUtil.startBackgroundJob(this, null, getResources().getString(R.string.crop__wait), new _cls4(), handler);
            return;
        }
    }

    public volatile void addLifeCycleListener(MonitoredActivity.LifeCycleListener lifecyclelistener)
    {
        super.addLifeCycleListener(lifecyclelistener);
    }

    public boolean isSaving()
    {
        return isSaving;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setupWindowFlags();
        setupViews();
        loadInput();
        if (rotateBitmap == null)
        {
            finish();
            return;
        } else
        {
            startCrop();
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (rotateBitmap != null)
        {
            rotateBitmap.recycle();
        }
    }

    public boolean onSearchRequested()
    {
        return false;
    }

    public volatile void removeLifeCycleListener(MonitoredActivity.LifeCycleListener lifecyclelistener)
    {
        super.removeLifeCycleListener(lifecyclelistener);
    }









/*
    static HighlightView access$802(CropImageActivity cropimageactivity, HighlightView highlightview)
    {
        cropimageactivity.cropView = highlightview;
        return highlightview;
    }

*/


    private class _cls5
        implements Runnable
    {

        final CropImageActivity this$0;
        final Bitmap val$b;

        public void run()
        {
            saveOutput(b);
        }

        _cls5()
        {
            this$0 = CropImageActivity.this;
            b = bitmap;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final CropImageActivity this$0;
        final Bitmap val$b;

        public void run()
        {
            imageView.clear();
            b.recycle();
        }

        _cls6()
        {
            this$0 = CropImageActivity.this;
            b = bitmap;
            super();
        }
    }


    private class _cls1
        implements ImageViewTouchBase.Recycler
    {

        final CropImageActivity this$0;

        public void recycle(Bitmap bitmap)
        {
            bitmap.recycle();
            System.gc();
        }

        _cls1()
        {
            this$0 = CropImageActivity.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final CropImageActivity this$0;

        public void onClick(View view)
        {
            setResult(0);
            finish();
        }

        _cls2()
        {
            this$0 = CropImageActivity.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final CropImageActivity this$0;

        public void onClick(View view)
        {
            onSaveClicked();
        }

        _cls3()
        {
            this$0 = CropImageActivity.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final CropImageActivity this$0;

        public void run()
        {
            final CountDownLatch latch = new CountDownLatch(1);
            class _cls1
                implements Runnable
            {

                final _cls4 this$1;
                final CountDownLatch val$latch;

                public void run()
                {
                    if (imageView.getScale() == 1.0F)
                    {
                        imageView.center();
                    }
                    latch.countDown();
                }

                _cls1()
                {
                    this$1 = _cls4.this;
                    latch = countdownlatch;
                    super();
                }
            }

            handler.post(new _cls1());
            try
            {
                latch.await();
            }
            catch (InterruptedException interruptedexception)
            {
                throw new RuntimeException(interruptedexception);
            }
            (new Cropper(null)).crop();
        }

        _cls4()
        {
            this$0 = CropImageActivity.this;
            super();
        }
    }

}
