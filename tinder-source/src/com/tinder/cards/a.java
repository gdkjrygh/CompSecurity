// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.cards;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.a.e;
import com.facebook.a.f;
import com.tinder.e.at;
import com.tinder.e.d;
import com.tinder.enums.RateType;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ae;
import com.tinder.utils.ad;
import com.tinder.utils.o;
import com.tinder.views.SwipeDetector;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class a extends FrameLayout
    implements android.animation.Animator.AnimatorListener, com.tinder.views.SwipeDetector.SwipeDetectorListener
{

    private static final float RESET_DISPLACE_THRESHOLD = 0.005F;
    private static final float RESET_FRICTION = 9F;
    private static final int RESET_TENSION = 60;
    private static final int SWIPE_ANIM_DURATION = 300;
    private static final float SWIPE_VELOCITY_ANIM_MIN = 1.3F;
    private static final float SWIPE_VELOCITY_DIRECTION_SLOP = 0.05F;
    private static final int THROW_AWAY_ANIM_TIME = 180;
    private static final int THROW_AWAY_DELAY = 200;
    private static final int TOUCHLESS_SWIPE_ANIM_TIME = 180;
    private static final int TOUCHLESS_SWIPE_DELAY_LIKE_PASS = 225;
    private static final int TOUCHLESS_SWIPE_DELAY_SUPERLIKE = 425;
    private static final int TOUCHLESS_SWIPE_ROTATION = 28;
    private static final int TOUCHLESS_SWIPE_SCALE_SUPERLIKE_DURATION = 200;
    private static final String VIEW_TAG_OVERLAY = "cardbase_overlay";
    private float mCardMidpointWidth;
    private float mClickThreshold;
    private ViewGroup mDimLayout;
    private float mDragOffsetX;
    private float mDragOffsetY;
    boolean mEnableSuperlike;
    private boolean mInSuperLikeCoordinates;
    private boolean mIsAnimating;
    protected boolean mIsLiking;
    protected boolean mIsMoving;
    protected boolean mIsPassing;
    protected boolean mIsSuperLiking;
    protected boolean mIsSwipedFromClick;
    private LinearInterpolator mLinearInterp;
    private d mListenerCard;
    ae mManagerPrefs;
    private at mMotionEventOnClickListener;
    private View mOverlay;
    private e mResetSpring;
    private float mRotationOnDrag;
    public int mScreenHeight;
    protected int mScreenWidth;
    private int mStampAlpha;
    private ImageView mStampLikeCompat;
    private ImageView mStampNopeCompat;
    private ImageView mStampSuperLikeCompat;
    private float mStampVerticalPosition;
    private float mStampYTarget;
    private SwipeDetector mSwipeDetector;
    private float mSwipeEndX;
    private float mSwipeEndY;
    private float mSwipeUpBoundaryBegins;
    private float mSwipeUpBoundaryEnds;
    private float mTiltSlop;
    private float mUpSwipeLeftBounds;
    private float mUpSwipeRightBounds;
    private boolean mUpswipeEnabled;

    public a(Context context)
    {
        super(context);
        mScreenHeight = ad.b(getContext());
        mScreenWidth = ad.a(getContext());
        mUpSwipeLeftBounds = mScreenWidth / 4;
        mUpSwipeRightBounds = (float)mScreenWidth - mUpSwipeLeftBounds;
        mStampYTarget = getResources().getDimension(0x7f090076) + (float)ad.c(getContext());
        init();
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mScreenHeight = ad.b(getContext());
        mScreenWidth = ad.a(getContext());
        mUpSwipeLeftBounds = mScreenWidth / 4;
        mUpSwipeRightBounds = (float)mScreenWidth - mUpSwipeLeftBounds;
        mStampYTarget = getResources().getDimension(0x7f090076) + (float)ad.c(getContext());
        init();
    }

    public a(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mScreenHeight = ad.b(getContext());
        mScreenWidth = ad.a(getContext());
        mUpSwipeLeftBounds = mScreenWidth / 4;
        mUpSwipeRightBounds = (float)mScreenWidth - mUpSwipeLeftBounds;
        mStampYTarget = getResources().getDimension(0x7f090076) + (float)ad.c(getContext());
        init();
    }

    public a(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        mScreenHeight = ad.b(getContext());
        mScreenWidth = ad.a(getContext());
        mUpSwipeLeftBounds = mScreenWidth / 4;
        mUpSwipeRightBounds = (float)mScreenWidth - mUpSwipeLeftBounds;
        mStampYTarget = getResources().getDimension(0x7f090076) + (float)ad.c(getContext());
        init();
    }

    protected static float calculateYIntercept(float f1, float f2, float f3, float f4, float f5)
    {
        return ((f5 - f4) / (f3 - f2)) * f1;
    }

    private void cleanUpCardState()
    {
        if (mListenerCard == null) goto _L2; else goto _L1
_L1:
        if (!mIsPassing) goto _L4; else goto _L3
_L3:
        mListenerCard.a(this, mIsSwipedFromClick);
_L2:
        if (isUsingCompatStamps())
        {
            mStampNopeCompat.setVisibility(4);
            mStampLikeCompat.setVisibility(4);
            mStampSuperLikeCompat.setVisibility(4);
        }
        mStampAlpha = 0;
        mIsPassing = false;
        mIsLiking = false;
        mIsSuperLiking = false;
        mIsMoving = false;
        mIsSwipedFromClick = false;
        return;
_L4:
        if (mIsLiking)
        {
            mListenerCard.b(this, mIsSwipedFromClick);
        } else
        if (mIsSuperLiking)
        {
            mListenerCard.c(this, mIsSwipedFromClick);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private void fadeStampsCompat()
    {
        mStampAlpha = (int)o.a(mDragOffsetX, 0.0F, 0.0F, 1.0F, 255F);
        if (isDraggingLeft())
        {
            if (mStampSuperLikeCompat.getVisibility() == 0)
            {
                fadeSuperLikeStamp(false);
            }
            setStampCompatAlpha(mStampNopeCompat, mStampAlpha);
            mStampNopeCompat.setVisibility(0);
            mStampLikeCompat.setVisibility(4);
            mStampSuperLikeCompat.setVisibility(4);
            return;
        }
        if (isDraggingRight())
        {
            if (mStampSuperLikeCompat.getVisibility() == 0)
            {
                fadeSuperLikeStamp(false);
            }
            setStampCompatAlpha(mStampLikeCompat, mStampAlpha);
            mStampLikeCompat.setVisibility(0);
            mStampNopeCompat.setVisibility(4);
            mStampSuperLikeCompat.setVisibility(4);
            return;
        }
        if (isDraggingUp() && meetsRequirementsForSwipeUp() && mUpswipeEnabled)
        {
            if (mStampSuperLikeCompat.getVisibility() != 0)
            {
                fadeSuperLikeStamp(true);
            }
            setStampCompatAlpha(mStampSuperLikeCompat, 255F);
            mStampSuperLikeCompat.setVisibility(0);
            mStampLikeCompat.setVisibility(4);
            mStampNopeCompat.setVisibility(4);
            return;
        } else
        {
            mStampSuperLikeCompat.setVisibility(4);
            mStampLikeCompat.setVisibility(4);
            mStampNopeCompat.setVisibility(4);
            return;
        }
    }

    private void fadeSuperLikeStamp(boolean flag)
    {
        float f2 = 1.0F;
        float f1;
        AlphaAnimation alphaanimation;
        if (flag)
        {
            f1 = 0.0F;
        } else
        {
            f1 = 1.0F;
        }
        if (!flag)
        {
            f2 = 0.0F;
        }
        alphaanimation = new AlphaAnimation(f1, f2);
        alphaanimation.setDuration(200L);
        mStampSuperLikeCompat.setAnimation(alphaanimation);
        alphaanimation.start();
    }

    private float getStampCompatAlpha(View view)
    {
        if (ad.a)
        {
            return (float)((ImageView)view).getImageAlpha();
        } else
        {
            return view.getAlpha();
        }
    }

    private void init()
    {
        ManagerApp.h().a(this);
        mEnableSuperlike = ae.z();
        mSwipeDetector = new SwipeDetector(this);
        mLinearInterp = new LinearInterpolator();
        setLayerType(2, null);
    }

    private void rotate(float f1)
    {
        int i;
        if (mSwipeDetector.getStartY() < mTiltSlop)
        {
            i = 1;
        } else
        {
            i = -1;
        }
        f1 = (float)i * f1 * mRotationOnDrag;
        if (getRotation() != f1)
        {
            setRotation(f1);
        }
    }

    private void setStampCompatAlpha(View view, float f1)
    {
        if (ad.a)
        {
            ((ImageView)view).setImageAlpha((int)f1);
            return;
        } else
        {
            view.setAlpha(f1);
            return;
        }
    }

    private void translate(float f1, float f2)
    {
        setTranslationX(f1);
        setTranslationY(f2);
    }

    public void animateSwipe()
    {
        float f2 = 0.0F;
        float f1;
        ViewPropertyAnimator viewpropertyanimator;
        long l;
        if (mIsSuperLiking && mUpswipeEnabled)
        {
            f1 = -mSwipeEndY;
            l = Math.round(300F / Math.max(Math.abs(getVelocityY()), 1.3F));
        } else
        {
            float f3;
            if (mIsPassing)
            {
                f1 = -mSwipeEndX;
            } else
            {
                f1 = mSwipeEndX;
            }
            if (Math.abs(getVelocityX()) > 0.05F)
            {
                f2 = calculateYIntercept(f1, 0.0F, getDeltaX(), 0.0F, getDeltaY());
            } else
            {
                f2 = getDeltaY();
            }
            l = Math.round(300F / Math.max(Math.abs(getVelocityX()), 1.3F));
            f3 = f1;
            f1 = f2;
            f2 = f3;
        }
        mIsAnimating = true;
        viewpropertyanimator = animate().translationXBy(f2).translationYBy(f1).setDuration(l).setStartDelay(0L).setInterpolator(mLinearInterp).setListener(this);
        if (o.b())
        {
            viewpropertyanimator.setUpdateListener(null);
        }
        viewpropertyanimator.start();
    }

    public void animateTouchlessSwipe(RateType ratetype, android.animation.ValueAnimator.AnimatorUpdateListener animatorupdatelistener)
    {
        float f2;
        float f3;
        char c;
        f2 = 0.0F;
        f3 = -28F;
        c = '\341';
        static final class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[RateType.values().length];
                try
                {
                    a[RateType.LIKE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[RateType.PASS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[RateType.SUPERLIKE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3.a[ratetype.ordinal()])
        {
        case 1: // '\001'
            mIsLiking = true;
            continue;

        case 2: // '\002'
            mIsPassing = true;
            continue;

        case 3: // '\003'
            mIsSuperLiking = ae.y();
            continue;
        }
        break;
        do
        {
            mIsSwipedFromClick = true;
            int i = c;
            float f1;
            if (isUsingCompatStamps())
            {
                if (mIsLiking)
                {
                    setStampCompatAlpha(mStampLikeCompat, 255F);
                    mStampLikeCompat.setVisibility(0);
                    i = c;
                } else
                if (mIsPassing)
                {
                    setStampCompatAlpha(mStampNopeCompat, 255F);
                    mStampNopeCompat.setVisibility(0);
                    i = c;
                } else
                {
                    i = c;
                    if (mIsSuperLiking)
                    {
                        setStampCompatAlpha(mStampSuperLikeCompat, 255F);
                        mStampSuperLikeCompat.setVisibility(0);
                        ad.c(mStampSuperLikeCompat, 1.8F);
                        mStampSuperLikeCompat.animate().scaleX(1.0F).scaleY(1.0F).setDuration(200L).setInterpolator(new DecelerateInterpolator()).start();
                        i = 425;
                    }
                }
            }
            mIsAnimating = true;
            ObjectAnimator objectanimator;
            Object obj;
            AnimatorSet animatorset;
            if (mIsSuperLiking)
            {
                f1 = -mSwipeEndY;
            } else
            if (mIsLiking)
            {
                f2 = mSwipeEndX;
                f1 = 0.0F;
            } else
            if (mIsPassing)
            {
                f2 = -mSwipeEndX;
                f1 = 0.0F;
            } else
            {
                f1 = 0.0F;
            }
            if (o.b())
            {
                ratetype = animate().translationXBy(f2).translationY(f1);
                if (mIsLiking)
                {
                    f1 = 28F;
                } else
                {
                    f1 = -28F;
                }
                ratetype.rotation(f1).setDuration(180L).setStartDelay(i).setInterpolator(mLinearInterp).setListener(this).setUpdateListener(animatorupdatelistener).start();
                return;
            }
            ratetype = ObjectAnimator.ofFloat(this, View.TRANSLATION_X, new float[] {
                f2
            });
            objectanimator = ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, new float[] {
                f1
            });
            obj = View.ROTATION;
            f1 = f3;
            if (mIsAnimating)
            {
                f1 = 28F;
            }
            obj = ObjectAnimator.ofFloat(this, ((android.util.Property) (obj)), new float[] {
                f1
            });
            animatorset = new AnimatorSet();
            animatorset.setDuration(180L);
            animatorset.setStartDelay(i);
            animatorset.setInterpolator(mLinearInterp);
            animatorset.addListener(this);
            ratetype.addUpdateListener(animatorupdatelistener);
            animatorset.playTogether(new Animator[] {
                ratetype, objectanimator, obj
            });
            animatorset.start();
            return;
        } while (true);
    }

    public void disableDim()
    {
        if (isUsingDim())
        {
            mDimLayout.removeView(mOverlay);
        }
    }

    public void enableDimming(ViewGroup viewgroup, Drawable drawable)
    {
        if (!ad.a())
        {
            mDimLayout = viewgroup;
            mOverlay = new View(getContext());
            ad.a(mOverlay, drawable);
            mOverlay.setAlpha(0.0F);
            mOverlay.setTag("cardbase_overlay");
            mDimLayout.addView(mOverlay);
        }
    }

    public d getCardListener()
    {
        return mListenerCard;
    }

    public float getDeltaX()
    {
        return mSwipeDetector.getDeltaX();
    }

    public float getDeltaY()
    {
        return mSwipeDetector.getDeltaY();
    }

    public abstract float getDimFull();

    public abstract float getDimMedium();

    public float getDimNone()
    {
        return 0.0F;
    }

    public View getDimView()
    {
        return mOverlay;
    }

    public float getDragOffset()
    {
        return mDragOffsetX;
    }

    public float getEndX()
    {
        return mSwipeDetector.getStartX();
    }

    public float getEndY()
    {
        return mSwipeDetector.getEndY();
    }

    public View getStampLike()
    {
        return mStampLikeCompat;
    }

    public View getStampNope()
    {
        return mStampNopeCompat;
    }

    public View getStampSuperLike()
    {
        return mStampSuperLikeCompat;
    }

    public float getStartX()
    {
        return mSwipeDetector.getStartX();
    }

    public float getStartY()
    {
        return mSwipeDetector.getStartY();
    }

    public SwipeDetector getSwipeDetector()
    {
        return mSwipeDetector;
    }

    public float getSwipeThreshold()
    {
        return mSwipeDetector.getSwipeThreshold();
    }

    public float getTopThreshold()
    {
        return mSwipeDetector.getTopSwipeThreshold();
    }

    public float getVelocityX()
    {
        return mSwipeDetector.getVelocityX();
    }

    public float getVelocityY()
    {
        return mSwipeDetector.getVelocityY();
    }

    public boolean isDraggingLeft()
    {
        return mSwipeDetector.getDeltaX() < 0.0F && !isDraggingUp();
    }

    public boolean isDraggingRight()
    {
        return mSwipeDetector.getDeltaX() > 0.0F && !isDraggingUp();
    }

    public boolean isDraggingUp()
    {
        float f1 = mSwipeDetector.getDeltaY();
        boolean flag = withinUpSwipeBounds();
        return f1 < 0.0F && mUpswipeEnabled && flag;
    }

    public boolean isMoving()
    {
        return mIsMoving;
    }

    public boolean isUsingCompatStamps()
    {
        return mStampLikeCompat != null && mStampNopeCompat != null && mStampSuperLikeCompat != null;
    }

    public boolean isUsingDim()
    {
        return mOverlay != null;
    }

    public boolean meetsRequirementsForSwipeUp()
    {
        return true;
    }

    public void onAnimationCancel(Animator animator)
    {
        mIsMoving = false;
    }

    public void onAnimationEnd(Animator animator)
    {
        mIsAnimating = false;
        cleanUpCardState();
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
        mIsMoving = true;
    }

    public void onClickWithEvent(MotionEvent motionevent)
    {
        if (mMotionEventOnClickListener != null)
        {
            mMotionEventOnClickListener.onClick(motionevent, this);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        while (mListenerCard == null || mIsAnimating) 
        {
            return false;
        }
        if (!mIsMoving || motionevent.getActionMasked() != 0)
        {
            requestDisallowInterceptTouchEvent(true);
            return mSwipeDetector.onTouch(this, motionevent);
        } else
        {
            return mSwipeDetector.onTouch(this, motionevent);
        }
    }

    public void onTouchMove(MotionEvent motionevent, float f1, float f2, float f3, float f4, float f5, float f6)
    {
        f6 = (float)Math.toDegrees(Math.atan2(-f4, f3));
        f5 = f6;
        if (f6 < 0.0F)
        {
            f5 = f6 + 360F;
        }
        boolean flag;
        if (f5 >= mSwipeUpBoundaryBegins && f5 <= mSwipeUpBoundaryEnds)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mInSuperLikeCoordinates = flag;
        mDragOffsetX = f1;
        mDragOffsetY = f2;
        translate(f3, f4);
        rotate(f3);
        if (isUsingCompatStamps())
        {
            fadeStampsCompat();
        }
        mListenerCard.a(this, mDragOffsetX, mDragOffsetY, f3, f4, false);
    }

    public void onTouchUp(MotionEvent motionevent, float f1, float f2, float f3, float f4, boolean flag, boolean flag1, 
            boolean flag2, boolean flag3, boolean flag4)
    {
        mIsSuperLiking = flag2;
        mIsLiking = flag3;
        mIsPassing = flag4;
        (new StringBuilder("onTouchUp: up:")).append(flag2).append(", right:").append(flag3).append(", left:").append(flag4);
        if (flag3 || flag4 || flag2 && mUpswipeEnabled && meetsRequirementsForSwipeUp())
        {
            animateSwipe();
        } else
        {
            resetPosition();
        }
        if (flag1)
        {
            onClickWithEvent(motionevent);
        }
    }

    public void removeListener()
    {
        mListenerCard = null;
    }

    public void resetPosition()
    {
        resetPosition(false, ((com.facebook.a.d) (new com.facebook.a.d() {

            final a a;

            public final void onSpringUpdate(e e1)
            {
                a.mDragOffsetX = Math.min(1.0F, Math.abs(a.getTranslationX()) / a.getSwipeThreshold());
                a.mDragOffsetY = Math.min(1.0F, Math.abs(a.getTranslationY()) / a.getTopThreshold());
                if (a.mListenerCard != null)
                {
                    a.mListenerCard.a(a, a.mDragOffsetX, a.mDragOffsetY, a.getTranslationX(), a.getTranslationY(), true);
                }
            }

            
            {
                a = a.this;
                super();
            }
        })));
    }

    public void resetPosition(boolean flag, com.facebook.a.d d1)
    {
        float f1 = getTranslationX();
        float f2 = getTranslationY();
        float f3 = getRotation();
        boolean flag1 = isUsingCompatStamps();
        ImageView imageview = null;
        f f4;
        if (flag1)
        {
            if (f1 < 0.0F)
            {
                imageview = mStampNopeCompat;
            } else
            {
                imageview = mStampLikeCompat;
            }
        }
        mResetSpring = com.tinder.utils.a.a();
        f4 = f.a(60D, 9D);
        mResetSpring.j = 0.004999999888241291D;
        mResetSpring.b = true;
        mResetSpring.a(f4);
        mResetSpring.a(new com.facebook.a.d(f2, f1, f3, flag, imageview, d1) {

            final float a;
            final float b;
            final float c;
            final boolean d;
            final ImageView e;
            final com.facebook.a.d f;
            final a g;

            public final void onSpringActivate(e e1)
            {
                if (f != null)
                {
                    f.onSpringActivate(e1);
                }
                if (!d)
                {
                    g.onAnimationStart(null);
                }
            }

            public final void onSpringAtRest(e e1)
            {
                if (f != null)
                {
                    f.onSpringAtRest(e1);
                }
                if (!d)
                {
                    g.onAnimationEnd(null);
                    g.mResetSpring.k.clear();
                }
            }

            public final void onSpringUpdate(e e1)
            {
                float f5 = (float)e1.d.a;
                g.setTranslationY(a - a * f5);
                g.setTranslationX(b - b * f5);
                g.setRotation(o.a(f5, 0.0F, c, 1.0F, 0.0F));
                if (!d && e != null)
                {
                    g.setStampCompatAlpha(e, f5 * g.getStampCompatAlpha(e));
                }
                if (f != null)
                {
                    f.onSpringUpdate(e1);
                }
                g.mDragOffsetX = Math.min(1.0F, Math.abs(g.getTranslationX()) / g.getSwipeThreshold());
                g.mDragOffsetY = Math.min(1.0F, Math.abs(g.getTranslationY()) / g.getTopThreshold());
                if (g.mListenerCard != null)
                {
                    g.mListenerCard.a(g, g.mDragOffsetX, g.mDragOffsetY, g.getTranslationX(), g.getTranslationY(), true);
                }
            }

            
            {
                g = a.this;
                a = f1;
                b = f2;
                c = f3;
                d = flag;
                e = imageview;
                f = d1;
                super();
            }
        });
        mResetSpring.a(0.0D);
        mResetSpring.b(1.0D);
    }

    public void resetStamps()
    {
        if (isUsingCompatStamps())
        {
            setStampCompatAlpha(mStampNopeCompat, 0.0F);
            setStampCompatAlpha(mStampLikeCompat, 0.0F);
            setStampCompatAlpha(mStampSuperLikeCompat, 0.0F);
            mStampNopeCompat.setVisibility(4);
            mStampLikeCompat.setVisibility(4);
            mStampSuperLikeCompat.setVisibility(4);
        }
    }

    public void setCardListener(d d1)
    {
        mListenerCard = d1;
    }

    public void setClickThreshold(float f1)
    {
        mClickThreshold = f1;
        mSwipeDetector.setClickThreshold(f1);
    }

    public void setDimAlpha(float f1)
    {
        if (isUsingDim())
        {
            mOverlay.setAlpha(f1);
        }
    }

    public void setMinimumSwipeUpVelocity(float f1)
    {
        mSwipeDetector.setMinimumUpSwipeVelocity(f1);
    }

    public void setMinimumSwipeVelocity(float f1)
    {
        mSwipeDetector.setMinimumSwipeVelocity(f1);
    }

    public void setOnClickWithEventListener(at at1)
    {
        mMotionEventOnClickListener = at1;
    }

    public void setRotationOnDrag(float f1)
    {
        mRotationOnDrag = f1;
    }

    public void setStampLeftBounds()
    {
        mSwipeDetector.setLeftBounds(mUpSwipeLeftBounds);
    }

    public void setStampLikeCompat(ImageView imageview)
    {
        mStampLikeCompat = imageview;
    }

    public void setStampNopeCompat(ImageView imageview)
    {
        mStampNopeCompat = imageview;
    }

    public void setStampRightBounds()
    {
        mSwipeDetector.setRightBounds(mUpSwipeRightBounds);
    }

    public void setStampSuperLikeCompat(ImageView imageview)
    {
        mStampSuperLikeCompat = imageview;
    }

    public void setSwipeBoundaries(float f1, float f2)
    {
        mSwipeUpBoundaryBegins = 90F - f2;
        mSwipeUpBoundaryEnds = 90F + f2;
        mSwipeDetector.setSwipeBoundaries(f1, f2);
    }

    public void setSwipeBoundaries(float f1, float f2, float f3)
    {
        mSwipeUpBoundaryBegins = 90F - f2;
        mSwipeUpBoundaryEnds = 90F + f2;
        mSwipeDetector.setSwipeBoundaries(f1, f2, f3);
    }

    public void setSwipeEndX(float f1)
    {
        mSwipeEndX = f1;
    }

    public void setSwipeEndY(float f1)
    {
        mSwipeEndY = f1;
    }

    public void setSwipeThreshold(float f1)
    {
        mSwipeDetector.setSwipeThreshold(f1);
    }

    public void setSwipeUpEnabled(boolean flag)
    {
        mUpswipeEnabled = flag;
        mSwipeDetector.setSwipeUpEnabled(mUpswipeEnabled);
    }

    public void setTiltSlop(float f1)
    {
        mTiltSlop = f1;
    }

    public void setTopThreshhold(float f1)
    {
        mSwipeDetector.setTopSwipeThreshold(f1);
    }

    public boolean withinUpSwipeBounds()
    {
        if (mStampNopeCompat != null)
        {
            mStampVerticalPosition = ad.a(mStampNopeCompat).y + mStampNopeCompat.getHeight();
        }
        float f1;
        boolean flag;
        boolean flag1;
        if (mStampVerticalPosition < mStampYTarget)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        (new StringBuilder("meetsVerticalBounds: ")).append(flag1).append(", mStampVerticalPosition:").append(mStampVerticalPosition).append(", mStampYTarget:").append(mStampYTarget);
        if (mCardMidpointWidth == 0.0F)
        {
            mCardMidpointWidth = getWidth() / 2;
        }
        f1 = (float)ad.a(this).x + mCardMidpointWidth;
        (new StringBuilder("marker:")).append(f1).append(", leftBounds:").append(mUpSwipeLeftBounds).append(",rightBounds:").append(mUpSwipeRightBounds);
        if (f1 > mUpSwipeLeftBounds && f1 < mUpSwipeRightBounds)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag1 && flag && mInSuperLikeCoordinates;
    }



/*
    static float access$002(a a1, float f1)
    {
        a1.mDragOffsetX = f1;
        return f1;
    }

*/



/*
    static float access$102(a a1, float f1)
    {
        a1.mDragOffsetY = f1;
        return f1;
    }

*/




}
