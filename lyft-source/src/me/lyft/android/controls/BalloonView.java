// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import me.lyft.android.rx.SecureObserver;
import me.lyft.android.utils.MetricsUtils;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;

public class BalloonView extends View
{

    private static final int ADD_BALLOON_INTERVAL_MILLIS = 500;
    private static final float ASSETS_OPACITY[] = {
        0.2F, 0.5F, 0.8F
    };
    private static final int BALLOON_SPEED_DP = 150;
    private static final int DEFAULT_IMAGE_WIDTH_PX = 120;
    public static final int MAX_BALLOONS_ON_SCREEN = 7;
    private static final long REDRAW_INTERVAL = 15L;
    public static final String TAG = "BalloonView";
    private int assetIndex;
    private final Bitmap assets[] = {
        BitmapFactory.decodeResource(getResources(), 0x7f0201d6), BitmapFactory.decodeResource(getResources(), 0x7f0201d5), BitmapFactory.decodeResource(getResources(), 0x7f0201d4)
    };
    private int balloonSpeed;
    private ArrayList balloons;
    private boolean continueToAnimate;
    private long lastAddedBalloonTimestamp;
    private Matrix matrix;
    private int numberOfSegments;
    private final Paint paint = new Paint();
    private long prevTime;
    private final Random rand = new Random();
    private Subscription redrawTimerSubscription;
    private ArrayList reusableBalloonPool;
    private int segmentIndexIndirect;
    private final List segmentIndexes = new ArrayList();
    private int segmentWidth;

    public BalloonView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        balloons = new ArrayList();
        reusableBalloonPool = new ArrayList();
        matrix = new Matrix();
        lastAddedBalloonTimestamp = System.currentTimeMillis();
        redrawTimerSubscription = Subscriptions.empty();
        continueToAnimate = false;
        balloonSpeed = MetricsUtils.fromView(this).dpToPixels(150F);
    }

    private void addBalloonsIfNeeded()
    {
        if (System.currentTimeMillis() - lastAddedBalloonTimestamp >= 500L && balloons.size() < 7)
        {
            createBalloon();
        }
    }

    private void createBalloon()
    {
        if (segmentIndexes.size() == 0)
        {
            return;
        }
        lastAddedBalloonTimestamp = System.currentTimeMillis();
        Bitmap bitmap = assets[assetIndex];
        int i = ((Integer)segmentIndexes.get(segmentIndexIndirect)).intValue();
        segmentIndexIndirect = (segmentIndexIndirect + 1) % segmentIndexes.size();
        float f = getX() + (float)(segmentWidth * i);
        float f1;
        Balloon balloon;
        if (i == 0)
        {
            f += bitmap.getWidth();
        } else
        if (i == numberOfSegments - 1)
        {
            f -= bitmap.getWidth();
        }
        f1 = ((float)assetIndex / (float)assets.length + 1.0F) * (float)balloonSpeed * 0.5F + randomize() * (float)balloonSpeed * 0.2F;
        if (reusableBalloonPool.size() > 0)
        {
            balloon = (Balloon)reusableBalloonPool.get(0);
            balloon.updateBalloon(f - (float)(bitmap.getWidth() / 2), getHeight(), bitmap, f1, ASSETS_OPACITY[assetIndex]);
            reusableBalloonPool.remove(0);
        } else
        {
            balloon = Balloon.createBalloon(f - (float)(bitmap.getWidth() / 2), getHeight(), bitmap, f1, ASSETS_OPACITY[assetIndex]);
        }
        balloons.add(balloon);
        assetIndex = (assetIndex + 1) % assets.length;
    }

    private int getLargestImageWidth()
    {
        if (assets != null && assets.length > 0)
        {
            return assets[assets.length - 1].getWidth();
        } else
        {
            return 120;
        }
    }

    private void initSegmentIndexes()
    {
        segmentIndexes.clear();
        segmentWidth = getWidth() / numberOfSegments;
        for (int i = 0; i < numberOfSegments; i++)
        {
            segmentIndexes.add(Integer.valueOf(i));
        }

        int k = segmentIndexes.size();
        for (int j = 0; j < k; j++)
        {
            int l = rand.nextInt(segmentIndexes.size());
            segmentIndexes.add(segmentIndexes.get(l));
            segmentIndexes.remove(l);
        }

        segmentIndexIndirect = 0;
    }

    private float randomize()
    {
        return (float)(rand.nextInt(1000) / 1000);
    }

    private void updateBalloonPositions()
    {
        long l = System.currentTimeMillis();
        float f = (float)(l - prevTime) / 1000F;
        prevTime = l;
        for (int i = 0; i < balloons.size(); i++)
        {
            Balloon balloon = (Balloon)balloons.get(i);
            <no variable> = 
// JavaClassFileOutputException: get_constant: invalid tag

    public void finishBalloonAnimation()
    {
        continueToAnimate = false;
        if (balloons.isEmpty())
        {
            return;
        } else
        {
            redrawTimerSubscription.unsubscribe();
            redrawTimerSubscription = Observable.interval(15L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new SecureObserver() {

                final BalloonView this$0;

                public void onSafeNext(Long long1)
                {
                    updateBalloonPositions();
                    if (!balloons.isEmpty())
                    {
                        invalidate();
                        return;
                    } else
                    {
                        redrawTimerSubscription.unsubscribe();
                        return;
                    }
                }

                public volatile void onSafeNext(Object obj)
                {
                    onSafeNext((Long)obj);
                }

            
            {
                this$0 = BalloonView.this;
                super();
            }
            });
            return;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        Balloon balloon;
        for (Iterator iterator = balloons.iterator(); iterator.hasNext(); canvas.drawBitmap(balloon.bitmap, matrix, paint))
        {
            balloon = (Balloon)iterator.next();
            matrix.setTranslate(balloon.width / 2, balloon.height / 2);
            matrix.postTranslate((float)(balloon.width / 2) + balloon.x, (float)(balloon.height / 2) + balloon.y);
            paint.setAlpha((int)(balloon.opacity * 256F));
        }

    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        numberOfSegments = i / getLargestImageWidth();
        initSegmentIndexes();
        prevTime = System.currentTimeMillis();
    }

    protected void onVisibilityChanged(View view, int i)
    {
        super.onVisibilityChanged(view, i);
        if (i == 0 && continueToAnimate)
        {
            startBalloonAnimation();
            return;
        }
        if (i == 0)
        {
            finishBalloonAnimation();
            return;
        } else
        {
            redrawTimerSubscription.unsubscribe();
            return;
        }
    }

    public void startBalloonAnimation()
    {
        continueToAnimate = true;
        redrawTimerSubscription.unsubscribe();
        redrawTimerSubscription = Observable.interval(15L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new SecureObserver() {

            final BalloonView this$0;

            public void onSafeNext(Long long1)
            {
                updateBalloonPositions();
                addBalloonsIfNeeded();
                if (!balloons.isEmpty())
                {
                    invalidate();
                }
            }

            public volatile void onSafeNext(Object obj)
            {
                onSafeNext((Long)obj);
            }

            
            {
                this$0 = BalloonView.this;
                super();
            }
        });
    }

    public void stopBalloonAnimation()
    {
        balloons.clear();
        invalidate();
        redrawTimerSubscription.unsubscribe();
    }






    private class Balloon
    {

        private Bitmap bitmap;
        private int height;
        private float opacity;
        private float speed;
        private int width;
        private float x;
        private float y;

        static Balloon createBalloon(float f, float f1, Bitmap bitmap1, float f2, float f3)
        {
            bitmap1 = new Balloon(bitmap1.getWidth(), bitmap1.getHeight(), f3, f2, bitmap1);
            bitmap1.x = f;
            bitmap1.y = (float)((Balloon) (bitmap1)).height + f1;
            return bitmap1;
        }

        public void updateBalloon(float f, float f1, Bitmap bitmap1, float f2, float f3)
        {
            bitmap = bitmap1;
            width = bitmap1.getWidth();
            height = bitmap1.getHeight();
            opacity = f3;
            speed = f2;
            x = f;
            y = (float)height + f1;
        }







/*
        static float access$324(Balloon balloon, float f)
        {
            f = balloon.y - f;
            balloon.y = f;
            return f;
        }

*/



        public Balloon(int i, int j, float f, float f1, Bitmap bitmap1)
        {
            width = i;
            height = j;
            opacity = f;
            speed = f1;
            bitmap = bitmap1;
        }
    }

}
