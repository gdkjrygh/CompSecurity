// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.gallery;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import me.lyft.android.infrastructure.camera.ICaptureImageSession;
import me.lyft.android.infrastructure.imagecrop.CropTouchManager;
import me.lyft.android.infrastructure.imagecrop.CropTouchPoint;
import me.lyft.android.infrastructure.imagecrop.ImageCropper;
import me.lyft.android.logging.L;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.utils.FileUtils;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

public class Cropper extends View
{

    public static final int CROPVIEW_ALPHA = 200;
    public static final int CROPVIEW_STROKE_WIDTH = 6;
    public static final int PERCENT = 100;
    private Bitmap bitmap;
    private int bitmapHeight;
    private int bitmapWidth;
    private int bottom;
    ICaptureImageSession captureImageSession;
    private Rect guideBounds;
    private int guideLeft;
    private int guideRight;
    private Rect imageBounds;
    ImageCropper imageCropper;
    ImageLoader imageLoader;
    private int left;
    private int maxHorizontalMoves;
    private int maxVerticalMoves;
    private Bitmap newBitmap;
    private float newX;
    private float newY;
    private CropTouchPoint position;
    private int right;
    private float scale;
    private int screenHeight;
    private int screenWidth;
    private boolean showGuide;
    private int top;
    private CropTouchManager touchManager;
    private Matrix transform;
    private Rect viewportBounds;
    private int viewportHeight;
    private int viewportWidth;

    public Cropper(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        transform = new Matrix();
        position = new CropTouchPoint();
        viewportBounds = new Rect();
        guideBounds = new Rect();
        imageBounds = new Rect();
        scale = 1.0F;
        showGuide = true;
        Scoop.a(this).b(this);
        touchManager = new CropTouchManager(context, 2);
        imageCropper = new ImageCropper(context, imageLoader);
    }

    private File getTemporaryUserPhotoFile()
    {
        return FileUtils.getTemporaryFile(getContext(), "profile_photo.jpg");
    }

    private void handleDragGesture()
    {
        if (touchManager.getPressCount() == 1)
        {
            position.add(touchManager.moveDelta(0));
        }
    }

    private void handleDragOutsideViewport(MotionEvent motionevent)
    {
        Rect rect = touchManager.getImageBounds();
        int i = motionevent.getAction() & 0xff;
        if (i == 6 || i == 1)
        {
            newY = position.getY();
            int j = rect.bottom;
            if ((float)j - newY >= (float)maxVerticalMoves)
            {
                newY = j - maxVerticalMoves;
            } else
            if (newY - (float)j >= (float)maxVerticalMoves)
            {
                newY = j + maxVerticalMoves;
            }
            newX = position.getX();
            j = rect.right;
            if (newX <= (float)(j - maxHorizontalMoves))
            {
                newX = j - maxHorizontalMoves;
            } else
            if (newX > (float)(maxHorizontalMoves + j))
            {
                newX = j + maxHorizontalMoves;
            }
            position.set(newX, newY);
        }
    }

    private void handlePinchGesture()
    {
        if (touchManager.getPressCount() == 2)
        {
            scale = touchManager.updateScale(scale);
            CropTouchManager croptouchmanager = touchManager;
            maxHorizontalMoves = CropTouchManager.getMaxMoves((int)((float)bitmapWidth * scale), viewportWidth);
            croptouchmanager = touchManager;
            maxVerticalMoves = CropTouchManager.getMaxMoves((int)((float)bitmapHeight * scale), viewportHeight);
        }
    }

    private void initViewport()
    {
        position.set(screenWidth / 2, screenHeight / 2);
        CropTouchManager croptouchmanager = touchManager;
        top = CropTouchManager.getTop(screenHeight, 0);
        imageBounds = new Rect(0, top, screenWidth / 2, top);
        touchManager.setImageBounds(imageBounds);
        touchManager.setBitmap(bitmap);
        touchManager.setViewport(screenWidth);
        touchManager.setMinimumScale();
        bitmapWidth = touchManager.getBitmap().getWidth();
        bitmapHeight = touchManager.getBitmap().getHeight();
        viewportWidth = touchManager.getViewportWidth();
        viewportHeight = touchManager.getViewportHeight();
        croptouchmanager = touchManager;
        maxVerticalMoves = CropTouchManager.getMaxMoves(bitmapHeight, viewportHeight);
        croptouchmanager = touchManager;
        maxHorizontalMoves = CropTouchManager.getMaxMoves(bitmapWidth, viewportWidth);
    }

    private File screenShot()
    {
        showGuide = false;
        setDrawingCacheEnabled(true);
        Object obj = Bitmap.createBitmap(getDrawingCache());
        setDrawingCacheEnabled(false);
        showGuide = true;
        newBitmap = Bitmap.createBitmap(((Bitmap) (obj)), viewportBounds.left, viewportBounds.top, viewportBounds.width(), viewportBounds.height());
        obj = getTemporaryUserPhotoFile();
        try
        {
            FileOutputStream fileoutputstream = new FileOutputStream(((File) (obj)));
            newBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, fileoutputstream);
            fileoutputstream.flush();
            fileoutputstream.close();
        }
        catch (Throwable throwable)
        {
            L.e(throwable, "failed to take screenshot", new Object[0]);
            return ((File) (obj));
        }
        return ((File) (obj));
    }

    public boolean interceptTouch(View view, MotionEvent motionevent)
    {
        try
        {
            touchManager.update(motionevent);
            handleDragGesture();
            handlePinchGesture();
            handleDragOutsideViewport(motionevent);
            invalidate();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            L.e("Exception: %s", new Object[] {
                view
            });
            return true;
        }
        return true;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (bitmap != null)
        {
            left = 0;
            guideLeft = screenWidth / 2 - viewportHeight / 2;
            Object obj = touchManager;
            top = CropTouchManager.getTop(screenHeight, viewportHeight);
            right = screenWidth;
            guideRight = viewportHeight + guideLeft;
            bottom = top + viewportHeight;
            obj = new Paint();
            transform.reset();
            transform.postTranslate((float)(-bitmapWidth) / 2.0F, (float)(-bitmapHeight) / 2.0F);
            transform.postScale(scale, scale);
            transform.postTranslate(position.getX(), position.getY());
            canvas.drawBitmap(bitmap, transform, ((Paint) (obj)));
            ((Paint) (obj)).setColor(0xff000000);
            ((Paint) (obj)).setAlpha(200);
            canvas.drawRect(0.0F, 0.0F, screenWidth, top - 6, ((Paint) (obj)));
            canvas.drawRect(0.0F, bottom + 6, screenWidth, screenHeight, ((Paint) (obj)));
            ((Paint) (obj)).setStyle(android.graphics.Paint.Style.STROKE);
            ((Paint) (obj)).setStrokeWidth(6F);
            ((Paint) (obj)).setColor(-1);
            viewportBounds.set(left, top, right, bottom);
            guideBounds.set(guideLeft, top, guideRight, bottom);
            if (showGuide)
            {
                canvas.drawRect(guideBounds, ((Paint) (obj)));
            }
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            setOnTouchListener(new android.view.View.OnTouchListener() {

                final Cropper this$0;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    return interceptTouch(view, motionevent);
                }

            
            {
                this$0 = Cropper.this;
                super();
            }
            });
            setBackgroundColor(0xff000000);
            return;
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        screenWidth = i;
        screenHeight = j;
        imageCropper.createBitmap(captureImageSession.getImage()).first().observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() {

            final Cropper this$0;

            public void call(Bitmap bitmap1)
            {
                bitmap = bitmap1;
                initViewport();
                invalidate();
            }

            public volatile void call(Object obj)
            {
                call((Bitmap)obj);
            }

            
            {
                this$0 = Cropper.this;
                super();
            }
        }, new Action1() {

            final Cropper this$0;

            public volatile void call(Object obj)
            {
                call((Throwable)obj);
            }

            public void call(Throwable throwable)
            {
                L.e(throwable, "failed to load image", new Object[0]);
            }

            
            {
                this$0 = Cropper.this;
                super();
            }
        });
    }

    public void retakePicture()
    {
        captureImageSession.retakePicture();
    }

    public void savePicture()
    {
        if (bitmap != null)
        {
            captureImageSession.saveCroppedPicture(screenShot());
        }
    }


/*
    static Bitmap access$002(Cropper cropper, Bitmap bitmap1)
    {
        cropper.bitmap = bitmap1;
        return bitmap1;
    }

*/

}
