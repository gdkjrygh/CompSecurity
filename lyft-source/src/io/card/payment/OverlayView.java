// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import io.card.payment.i18n.LocalizedStrings;
import io.card.payment.i18n.StringKey;
import java.lang.ref.WeakReference;

// Referenced classes of package io.card.payment:
//            Torch, Logo, CreditCard, Util, 
//            DetectionInfo, CardIOActivity

class OverlayView extends View
{

    private static final android.graphics.drawable.GradientDrawable.Orientation GRADIENT_ORIENTATIONS[];
    private static final String TAG = io/card/payment/OverlayView.getSimpleName();
    private int guideColor;
    private boolean hideCardIOLogo;
    private Bitmap mBitmap;
    private Rect mCameraPreviewRect;
    private DetectionInfo mDInfo;
    private CreditCard mDetectedCard;
    private GradientDrawable mGradientDrawable;
    private Rect mGuide;
    private final Paint mGuidePaint = new Paint(1);
    private final Paint mLockedBackgroundPaint = new Paint(1);
    private Path mLockedBackgroundPath;
    private final Logo mLogo;
    private Rect mLogoRect;
    private int mRotation;
    private int mRotationFlip;
    private float mScale;
    private final WeakReference mScanActivityRef;
    private final boolean mShowTorch;
    private int mState;
    private final Torch mTorch;
    private Rect mTorchRect;
    private String scanInstructions;

    public OverlayView(CardIOActivity cardioactivity, AttributeSet attributeset, boolean flag)
    {
        super(cardioactivity, attributeset);
        hideCardIOLogo = false;
        mScale = 1.0F;
        mShowTorch = flag;
        mScanActivityRef = new WeakReference(cardioactivity);
        mRotationFlip = 1;
        mScale = getResources().getDisplayMetrics().density / 1.5F;
        mTorch = new Torch(70F * mScale, 50F * mScale);
        mLogo = new Logo(cardioactivity);
        mLockedBackgroundPaint.clearShadowLayer();
        mLockedBackgroundPaint.setStyle(android.graphics.Paint.Style.FILL);
        mLockedBackgroundPaint.setColor(0xbb000000);
        scanInstructions = LocalizedStrings.getString(StringKey.SCAN_GUIDE);
    }

    private void decorateBitmap()
    {
        Object obj = new RectF(2.0F, 2.0F, mBitmap.getWidth() - 2, mBitmap.getHeight() - 2);
        float f = (float)mBitmap.getHeight() * 0.06666667F;
        Bitmap bitmap = Bitmap.createBitmap(mBitmap.getWidth(), mBitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0);
        Paint paint = new Paint(1);
        paint.setColor(0xff000000);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        canvas.drawRoundRect(((RectF) (obj)), f, f, paint);
        obj = new Paint();
        ((Paint) (obj)).setFilterBitmap(false);
        canvas = new Canvas(mBitmap);
        ((Paint) (obj)).setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, ((Paint) (obj)));
        ((Paint) (obj)).setXfermode(null);
        bitmap.recycle();
    }

    private Rect guideStrokeRect(int i, int j, int k, int l)
    {
        int i1 = (int)(8F * mScale);
        Rect rect = new Rect();
        rect.left = Math.min(i, k) - i1;
        rect.right = Math.max(i, k) + i1;
        rect.top = Math.min(j, l) - i1;
        rect.bottom = i1 + Math.max(j, l);
        return rect;
    }

    public Bitmap getBitmap()
    {
        return mBitmap;
    }

    public Bitmap getCardImage()
    {
        if (mBitmap != null && !mBitmap.isRecycled())
        {
            return Bitmap.createBitmap(mBitmap, 0, 0, mBitmap.getWidth(), mBitmap.getHeight());
        } else
        {
            return null;
        }
    }

    public Rect getTorchRect()
    {
        return mTorchRect;
    }

    public boolean isAnimating()
    {
        return mState != 0;
    }

    public void markupCard()
    {
        int i = 0;
        if (mBitmap != null)
        {
            if (mDetectedCard.flipped)
            {
                Matrix matrix = new Matrix();
                matrix.setRotate(180F, mBitmap.getWidth() / 2, mBitmap.getHeight() / 2);
                mBitmap = Bitmap.createBitmap(mBitmap, 0, 0, mBitmap.getWidth(), mBitmap.getHeight(), matrix, false);
            }
            Canvas canvas = new Canvas(mBitmap);
            Paint paint = new Paint();
            Util.setupTextPaintStyle(paint);
            paint.setTextSize(28F * mScale);
            int j = mDetectedCard.cardNumber.length();
            float f = (float)mBitmap.getWidth() / 428F;
            int k = (int)((float)mDetectedCard.yoff * f - 6F);
            while (i < j) 
            {
                int l = (int)((float)mDetectedCard.xoff[i] * f);
                canvas.drawText((new StringBuilder()).append("").append(mDetectedCard.cardNumber.charAt(i)).toString(), l, k, paint);
                i++;
            }
        }
    }

    public void onDraw(Canvas canvas)
    {
        if (mGuide != null && mCameraPreviewRect != null)
        {
            canvas.save();
            mGradientDrawable.draw(canvas);
            int i;
            if (mRotation == 0 || mRotation == 180)
            {
                i = (mGuide.bottom - mGuide.top) / 4;
            } else
            {
                i = (mGuide.right - mGuide.left) / 4;
            }
            if (mDInfo != null && mDInfo.numVisibleEdges() == 4)
            {
                canvas.drawPath(mLockedBackgroundPath, mLockedBackgroundPaint);
            }
            mGuidePaint.clearShadowLayer();
            mGuidePaint.setStyle(android.graphics.Paint.Style.FILL);
            mGuidePaint.setColor(guideColor);
            canvas.drawRect(guideStrokeRect(mGuide.left, mGuide.top, mGuide.left + i, mGuide.top), mGuidePaint);
            canvas.drawRect(guideStrokeRect(mGuide.left, mGuide.top, mGuide.left, mGuide.top + i), mGuidePaint);
            canvas.drawRect(guideStrokeRect(mGuide.right, mGuide.top, mGuide.right - i, mGuide.top), mGuidePaint);
            canvas.drawRect(guideStrokeRect(mGuide.right, mGuide.top, mGuide.right, mGuide.top + i), mGuidePaint);
            canvas.drawRect(guideStrokeRect(mGuide.left, mGuide.bottom, mGuide.left + i, mGuide.bottom), mGuidePaint);
            canvas.drawRect(guideStrokeRect(mGuide.left, mGuide.bottom, mGuide.left, mGuide.bottom - i), mGuidePaint);
            canvas.drawRect(guideStrokeRect(mGuide.right, mGuide.bottom, mGuide.right - i, mGuide.bottom), mGuidePaint);
            canvas.drawRect(guideStrokeRect(mGuide.right, mGuide.bottom, mGuide.right, mGuide.bottom - i), mGuidePaint);
            if (mDInfo != null)
            {
                if (mDInfo.topEdge)
                {
                    canvas.drawRect(guideStrokeRect(mGuide.left, mGuide.top, mGuide.right, mGuide.top), mGuidePaint);
                }
                if (mDInfo.bottomEdge)
                {
                    canvas.drawRect(guideStrokeRect(mGuide.left, mGuide.bottom, mGuide.right, mGuide.bottom), mGuidePaint);
                }
                if (mDInfo.leftEdge)
                {
                    canvas.drawRect(guideStrokeRect(mGuide.left, mGuide.top, mGuide.left, mGuide.bottom), mGuidePaint);
                }
                if (mDInfo.rightEdge)
                {
                    canvas.drawRect(guideStrokeRect(mGuide.right, mGuide.top, mGuide.right, mGuide.bottom), mGuidePaint);
                }
                if (mDInfo.numVisibleEdges() < 3)
                {
                    float f1 = 34F * mScale;
                    float f = 26F * mScale;
                    Util.setupTextPaintStyle(mGuidePaint);
                    mGuidePaint.setTextAlign(android.graphics.Paint.Align.CENTER);
                    mGuidePaint.setTextSize(f);
                    canvas.translate(mGuide.left + mGuide.width() / 2, mGuide.top + mGuide.height() / 2);
                    canvas.rotate(mRotationFlip * mRotation);
                    if (scanInstructions != null && scanInstructions != "")
                    {
                        String as[] = scanInstructions.split("\n");
                        f = -(((float)(as.length - 1) * f1 - f) / 2.0F) - 3F;
                        for (i = 0; i < as.length; i++)
                        {
                            canvas.drawText(as[i], 0.0F, f, mGuidePaint);
                            f += f1;
                        }

                    }
                }
            }
            canvas.restore();
            if (!hideCardIOLogo)
            {
                canvas.save();
                canvas.translate(mLogoRect.exactCenterX(), mLogoRect.exactCenterY());
                canvas.rotate(mRotationFlip * mRotation);
                mLogo.draw(canvas, 100F * mScale, 50F * mScale);
                canvas.restore();
            }
            if (mShowTorch)
            {
                canvas.save();
                canvas.translate(mTorchRect.exactCenterX(), mTorchRect.exactCenterY());
                canvas.rotate(mRotationFlip * mRotation);
                mTorch.draw(canvas);
                canvas.restore();
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        Rect rect;
        if ((motionevent.getAction() & 0xff) != 0)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        motionevent = new Point((int)motionevent.getX(), (int)motionevent.getY());
        rect = Util.rectGivenCenter(motionevent, 20, 20);
        Log.d(TAG, (new StringBuilder()).append("onTouchEvent: ").append(motionevent).toString());
        if (mShowTorch && mTorchRect != null && Rect.intersects(mTorchRect, rect))
        {
            Log.d(TAG, "torch touched");
            ((CardIOActivity)mScanActivityRef.get()).toggleFlash();
            break MISSING_BLOCK_LABEL_174;
        }
        if (mLogoRect != null && Rect.intersects(mLogoRect, rect))
        {
            Log.d(TAG, "logo touched");
            break MISSING_BLOCK_LABEL_174;
        }
        try
        {
            ((CardIOActivity)mScanActivityRef.get()).triggerAutoFocus();
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            Log.d(TAG, "NullPointerException caught in onTouchEvent method");
        }
        return false;
    }

    public void setBitmap(Bitmap bitmap)
    {
        if (mBitmap != null)
        {
            mBitmap.recycle();
        }
        mBitmap = bitmap;
        if (mBitmap != null)
        {
            decorateBitmap();
        }
    }

    public void setCameraPreviewRect(Rect rect)
    {
        mCameraPreviewRect = rect;
    }

    public void setDetectedCard(CreditCard creditcard)
    {
        mDetectedCard = creditcard;
    }

    public void setDetectionInfo(DetectionInfo detectioninfo)
    {
        if (mDInfo != null && !mDInfo.sameEdgesAs(detectioninfo))
        {
            invalidate();
        }
        mDInfo = detectioninfo;
    }

    public void setGuideAndRotation(Rect rect, int i)
    {
        Log.d(TAG, (new StringBuilder()).append("setGuideAndRotation: ").append(rect).append(", ").append(i).toString());
        mRotation = i;
        mGuide = rect;
        invalidate();
        if (mRotation % 180 != 0)
        {
            rect = new Point((int)(mScale * 40F), (int)(mScale * 60F));
            mRotationFlip = -1;
        } else
        {
            rect = new Point((int)(mScale * 60F), (int)(mScale * 40F));
            mRotationFlip = 1;
        }
        if (mCameraPreviewRect != null)
        {
            Log.d(TAG, (new StringBuilder()).append("").append(mCameraPreviewRect).append(", ").append(rect).append(", ").append(mCameraPreviewRect).append(", ").append(rect).toString());
            mTorchRect = Util.rectGivenCenter(new Point(mCameraPreviewRect.left + ((Point) (rect)).x, mCameraPreviewRect.top + ((Point) (rect)).y), (int)(70F * mScale), (int)(mScale * 50F));
            i = mCameraPreviewRect.right;
            int j = ((Point) (rect)).x;
            int k = mCameraPreviewRect.top;
            mLogoRect = Util.rectGivenCenter(new Point(i - j, ((Point) (rect)).y + k), (int)(100F * mScale), (int)(mScale * 50F));
            mGradientDrawable = new GradientDrawable(GRADIENT_ORIENTATIONS[(mRotation / 90) % 4], new int[] {
                -1, 0xff000000
            });
            mGradientDrawable.setGradientType(0);
            mGradientDrawable.setBounds(mGuide);
            mGradientDrawable.setAlpha(50);
            mLockedBackgroundPath = new Path();
            mLockedBackgroundPath.addRect(new RectF(mCameraPreviewRect), android.graphics.Path.Direction.CW);
            mLockedBackgroundPath.addRect(new RectF(mGuide), android.graphics.Path.Direction.CCW);
        }
    }

    public void setGuideColor(int i)
    {
        guideColor = i;
    }

    public void setHideCardIOLogo(boolean flag)
    {
        hideCardIOLogo = flag;
    }

    public void setScanInstructions(String s)
    {
        scanInstructions = s;
    }

    public void setTorchOn(boolean flag)
    {
        mTorch.setOn(flag);
        invalidate();
    }

    public void setUseCardIOLogo(boolean flag)
    {
        mLogo.loadLogo(flag);
    }

    static 
    {
        GRADIENT_ORIENTATIONS = (new android.graphics.drawable.GradientDrawable.Orientation[] {
            android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT
        });
    }
}
