// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            Animator, PropertyValuesHolder, TypeEvaluator

public class ValueAnimator extends Animator
{
    private static class AnimationHandler extends Handler
    {

        public void handleMessage(Message message)
        {
            ArrayList arraylist;
            ArrayList arraylist1;
            boolean flag;
            int i;
            flag = true;
            i = 1;
            arraylist = (ArrayList)ValueAnimator.sAnimations.get();
            arraylist1 = (ArrayList)ValueAnimator.sDelayedAnims.get();
            message.what;
            JVM INSTR tableswitch 0 1: default 52
        //                       0 53
        //                       1 91;
               goto _L1 _L2 _L3
_L1:
            return;
_L2:
label0:
            {
                message = (ArrayList)ValueAnimator.sPendingAnimations.get();
                if (arraylist.size() <= 0)
                {
                    flag = i;
                    if (arraylist1.size() <= 0)
                    {
                        break label0;
                    }
                }
                flag = false;
            }
_L16:
            if (message.size() > 0) goto _L4; else goto _L3
_L3:
            ArrayList arraylist2;
            int j;
            long l;
            l = AnimationUtils.currentAnimationTimeMillis();
            arraylist2 = (ArrayList)ValueAnimator.sReadyAnims.get();
            message = (ArrayList)ValueAnimator.sEndingAnims.get();
            j = arraylist1.size();
            i = 0;
_L17:
            if (i < j) goto _L6; else goto _L5
_L5:
            j = arraylist2.size();
            if (j <= 0) goto _L8; else goto _L7
_L7:
            i = 0;
_L18:
            if (i < j) goto _L10; else goto _L9
_L9:
            arraylist2.clear();
_L8:
            i = arraylist.size();
            j = 0;
_L19:
            if (j < i) goto _L12; else goto _L11
_L11:
            if (message.size() <= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = 0;
_L20:
            if (i < message.size()) goto _L14; else goto _L13
_L13:
            message.clear();
            if (!flag || arraylist.isEmpty() && arraylist1.isEmpty()) goto _L1; else goto _L15
_L15:
            sendEmptyMessageDelayed(1, Math.max(0L, ValueAnimator.sFrameDelay - (AnimationUtils.currentAnimationTimeMillis() - l)));
            return;
_L4:
            arraylist2 = (ArrayList)message.clone();
            message.clear();
            j = arraylist2.size();
            i = 0;
            while (i < j) 
            {
                ValueAnimator valueanimator1 = (ValueAnimator)arraylist2.get(i);
                if (valueanimator1.mStartDelay == 0L)
                {
                    valueanimator1.startAnimation();
                } else
                {
                    arraylist1.add(valueanimator1);
                }
                i++;
            }
              goto _L16
_L6:
            ValueAnimator valueanimator2 = (ValueAnimator)arraylist1.get(i);
            if (valueanimator2.delayedAnimationFrame(l))
            {
                arraylist2.add(valueanimator2);
            }
            i++;
              goto _L17
_L10:
            ValueAnimator valueanimator3 = (ValueAnimator)arraylist2.get(i);
            valueanimator3.startAnimation();
            valueanimator3.mRunning = true;
            arraylist1.remove(valueanimator3);
            i++;
              goto _L18
_L12:
            ValueAnimator valueanimator = (ValueAnimator)arraylist.get(j);
            if (valueanimator.animationFrame(l))
            {
                message.add(valueanimator);
            }
            if (arraylist.size() == i)
            {
                j++;
            } else
            {
                i--;
                message.remove(valueanimator);
            }
              goto _L19
_L14:
            ((ValueAnimator)message.get(i)).endAnimation();
            i++;
              goto _L20
        }

        private AnimationHandler()
        {
        }

        AnimationHandler(AnimationHandler animationhandler)
        {
            this();
        }
    }

    public static interface AnimatorUpdateListener
    {

        public abstract void onAnimationUpdate(ValueAnimator valueanimator);
    }


    static final int ANIMATION_FRAME = 1;
    static final int ANIMATION_START = 0;
    private static final long DEFAULT_FRAME_DELAY = 10L;
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    static final int RUNNING = 1;
    static final int SEEKED = 2;
    static final int STOPPED = 0;
    private static ThreadLocal sAnimationHandler = new ThreadLocal();
    private static final ThreadLocal sAnimations = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected ArrayList initialValue()
        {
            return new ArrayList();
        }

    };
    private static final Interpolator sDefaultInterpolator = new AccelerateDecelerateInterpolator();
    private static final ThreadLocal sDelayedAnims = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected ArrayList initialValue()
        {
            return new ArrayList();
        }

    };
    private static final ThreadLocal sEndingAnims = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected ArrayList initialValue()
        {
            return new ArrayList();
        }

    };
    private static long sFrameDelay = 10L;
    private static final ThreadLocal sPendingAnimations = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected ArrayList initialValue()
        {
            return new ArrayList();
        }

    };
    private static final ThreadLocal sReadyAnims = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected ArrayList initialValue()
        {
            return new ArrayList();
        }

    };
    private float mCurrentFraction;
    private int mCurrentIteration;
    private long mDelayStartTime;
    private long mDuration;
    boolean mInitialized;
    private Interpolator mInterpolator;
    private boolean mPlayingBackwards;
    int mPlayingState;
    private int mRepeatCount;
    private int mRepeatMode;
    private boolean mRunning;
    long mSeekTime;
    private long mStartDelay;
    long mStartTime;
    private boolean mStarted;
    private boolean mStartedDelay;
    private ArrayList mUpdateListeners;
    PropertyValuesHolder mValues[];
    HashMap mValuesMap;

    public ValueAnimator()
    {
        mSeekTime = -1L;
        mPlayingBackwards = false;
        mCurrentIteration = 0;
        mCurrentFraction = 0.0F;
        mStartedDelay = false;
        mPlayingState = 0;
        mRunning = false;
        mStarted = false;
        mInitialized = false;
        mDuration = 300L;
        mStartDelay = 0L;
        mRepeatCount = 0;
        mRepeatMode = 1;
        mInterpolator = sDefaultInterpolator;
        mUpdateListeners = null;
    }

    public static void clearAllAnimations()
    {
        ((ArrayList)sAnimations.get()).clear();
        ((ArrayList)sPendingAnimations.get()).clear();
        ((ArrayList)sDelayedAnims.get()).clear();
    }

    private boolean delayedAnimationFrame(long l)
    {
        if (!mStartedDelay)
        {
            mStartedDelay = true;
            mDelayStartTime = l;
        } else
        {
            long l1 = l - mDelayStartTime;
            if (l1 > mStartDelay)
            {
                mStartTime = l - (l1 - mStartDelay);
                mPlayingState = 1;
                return true;
            }
        }
        return false;
    }

    private void endAnimation()
    {
        ((ArrayList)sAnimations.get()).remove(this);
        ((ArrayList)sPendingAnimations.get()).remove(this);
        ((ArrayList)sDelayedAnims.get()).remove(this);
        mPlayingState = 0;
        if (!mRunning || mListeners == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        int i;
        int j;
        arraylist = (ArrayList)mListeners.clone();
        j = arraylist.size();
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        mRunning = false;
        mStarted = false;
        return;
_L3:
        ((Animator.AnimatorListener)arraylist.get(i)).onAnimationEnd(this);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static int getCurrentAnimationsCount()
    {
        return ((ArrayList)sAnimations.get()).size();
    }

    public static long getFrameDelay()
    {
        return sFrameDelay;
    }

    public static transient ValueAnimator ofFloat(float af[])
    {
        ValueAnimator valueanimator = new ValueAnimator();
        valueanimator.setFloatValues(af);
        return valueanimator;
    }

    public static transient ValueAnimator ofInt(int ai[])
    {
        ValueAnimator valueanimator = new ValueAnimator();
        valueanimator.setIntValues(ai);
        return valueanimator;
    }

    public static transient ValueAnimator ofObject(TypeEvaluator typeevaluator, Object aobj[])
    {
        ValueAnimator valueanimator = new ValueAnimator();
        valueanimator.setObjectValues(aobj);
        valueanimator.setEvaluator(typeevaluator);
        return valueanimator;
    }

    public static transient ValueAnimator ofPropertyValuesHolder(PropertyValuesHolder apropertyvaluesholder[])
    {
        ValueAnimator valueanimator = new ValueAnimator();
        valueanimator.setValues(apropertyvaluesholder);
        return valueanimator;
    }

    public static void setFrameDelay(long l)
    {
        sFrameDelay = l;
    }

    private void start(boolean flag)
    {
        if (Looper.myLooper() == null)
        {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        mPlayingBackwards = flag;
        mCurrentIteration = 0;
        mPlayingState = 0;
        mStarted = true;
        mStartedDelay = false;
        ((ArrayList)sPendingAnimations.get()).add(this);
        if (mStartDelay != 0L) goto _L2; else goto _L1
_L1:
        setCurrentPlayTime(getCurrentPlayTime());
        mPlayingState = 0;
        mRunning = true;
        if (mListeners == null) goto _L2; else goto _L3
_L3:
        Object obj;
        int i;
        int j;
        obj = (ArrayList)mListeners.clone();
        j = ((ArrayList) (obj)).size();
        i = 0;
_L6:
        if (i < j) goto _L4; else goto _L2
_L2:
        AnimationHandler animationhandler = (AnimationHandler)sAnimationHandler.get();
        obj = animationhandler;
        if (animationhandler == null)
        {
            obj = new AnimationHandler(null);
            sAnimationHandler.set(obj);
        }
        ((AnimationHandler) (obj)).sendEmptyMessage(0);
        return;
_L4:
        ((Animator.AnimatorListener)((ArrayList) (obj)).get(i)).onAnimationStart(this);
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void startAnimation()
    {
        initAnimation();
        ((ArrayList)sAnimations.get()).add(this);
        if (mStartDelay <= 0L || mListeners == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        int i;
        int j;
        arraylist = (ArrayList)mListeners.clone();
        j = arraylist.size();
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ((Animator.AnimatorListener)arraylist.get(i)).onAnimationStart(this);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void addUpdateListener(AnimatorUpdateListener animatorupdatelistener)
    {
        if (mUpdateListeners == null)
        {
            mUpdateListeners = new ArrayList();
        }
        mUpdateListeners.add(animatorupdatelistener);
    }

    void animateValue(float f)
    {
        int i;
        int j;
        f = mInterpolator.getInterpolation(f);
        mCurrentFraction = f;
        j = mValues.length;
        i = 0;
_L5:
        if (i < j) goto _L2; else goto _L1
_L1:
        if (mUpdateListeners == null) goto _L4; else goto _L3
_L3:
        j = mUpdateListeners.size();
        i = 0;
_L6:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_69;
        }
_L4:
        return;
_L2:
        mValues[i].calculateValue(f);
        i++;
          goto _L5
        ((AnimatorUpdateListener)mUpdateListeners.get(i)).onAnimationUpdate(this);
        i++;
          goto _L6
    }

    boolean animationFrame(long l)
    {
        float f;
        float f1;
        int i;
        boolean flag;
        boolean flag1 = false;
        if (mPlayingState == 0)
        {
            mPlayingState = 1;
            if (mSeekTime < 0L)
            {
                mStartTime = l;
            } else
            {
                mStartTime = l - mSeekTime;
                mSeekTime = -1L;
            }
        }
        switch (mPlayingState)
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        int j;
        if (mDuration > 0L)
        {
            f1 = (float)(l - mStartTime) / (float)mDuration;
        } else
        {
            f1 = 1.0F;
        }
        flag = flag1;
        f = f1;
        if (f1 < 1.0F) goto _L2; else goto _L1
_L1:
        if (mCurrentIteration >= mRepeatCount && mRepeatCount != -1)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        if (mListeners == null) goto _L4; else goto _L3
_L3:
        j = mListeners.size();
        i = 0;
_L6:
        if (i < j) goto _L5; else goto _L4
_L4:
        if (mRepeatMode == 2)
        {
            if (mPlayingBackwards)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            mPlayingBackwards = flag;
        }
        mCurrentIteration = mCurrentIteration + (int)f1;
        f = f1 % 1.0F;
        mStartTime = mStartTime + mDuration;
        flag = flag1;
_L2:
        f1 = f;
        if (mPlayingBackwards)
        {
            f1 = 1.0F - f;
        }
        animateValue(f1);
        return flag;
_L5:
        ((Animator.AnimatorListener)mListeners.get(i)).onAnimationRepeat(this);
        i++;
          goto _L6
        flag = true;
        f = Math.min(f1, 1.0F);
          goto _L2
    }

    public void cancel()
    {
        if (mPlayingState == 0 && !((ArrayList)sPendingAnimations.get()).contains(this) && !((ArrayList)sDelayedAnims.get()).contains(this)) goto _L2; else goto _L1
_L1:
        if (!mRunning || mListeners == null) goto _L4; else goto _L3
_L3:
        Iterator iterator = ((ArrayList)mListeners.clone()).iterator();
_L7:
        if (iterator.hasNext()) goto _L5; else goto _L4
_L4:
        endAnimation();
_L2:
        return;
_L5:
        ((Animator.AnimatorListener)iterator.next()).onAnimationCancel(this);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public volatile Animator clone()
    {
        return clone();
    }

    public ValueAnimator clone()
    {
        ValueAnimator valueanimator = (ValueAnimator)super.clone();
        if (mUpdateListeners == null) goto _L2; else goto _L1
_L1:
        Object obj;
        int i;
        int j;
        obj = mUpdateListeners;
        valueanimator.mUpdateListeners = new ArrayList();
        j = ((ArrayList) (obj)).size();
        i = 0;
_L6:
        if (i < j) goto _L3; else goto _L2
_L2:
        valueanimator.mSeekTime = -1L;
        valueanimator.mPlayingBackwards = false;
        valueanimator.mCurrentIteration = 0;
        valueanimator.mInitialized = false;
        valueanimator.mPlayingState = 0;
        valueanimator.mStartedDelay = false;
        obj = mValues;
        if (obj == null) goto _L5; else goto _L4
_L4:
        j = obj.length;
        valueanimator.mValues = new PropertyValuesHolder[j];
        valueanimator.mValuesMap = new HashMap(j);
        i = 0;
_L7:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_152;
        }
_L5:
        return valueanimator;
_L3:
        valueanimator.mUpdateListeners.add((AnimatorUpdateListener)((ArrayList) (obj)).get(i));
        i++;
          goto _L6
        PropertyValuesHolder propertyvaluesholder = obj[i].clone();
        valueanimator.mValues[i] = propertyvaluesholder;
        valueanimator.mValuesMap.put(propertyvaluesholder.getPropertyName(), propertyvaluesholder);
        i++;
          goto _L7
    }

    public void end()
    {
        if (!((ArrayList)sAnimations.get()).contains(this) && !((ArrayList)sPendingAnimations.get()).contains(this))
        {
            mStartedDelay = false;
            startAnimation();
        } else
        if (!mInitialized)
        {
            initAnimation();
        }
        if (mRepeatCount > 0 && (mRepeatCount & 1) == 1)
        {
            animateValue(0.0F);
        } else
        {
            animateValue(1.0F);
        }
        endAnimation();
    }

    public float getAnimatedFraction()
    {
        return mCurrentFraction;
    }

    public Object getAnimatedValue()
    {
        if (mValues != null && mValues.length > 0)
        {
            return mValues[0].getAnimatedValue();
        } else
        {
            return null;
        }
    }

    public Object getAnimatedValue(String s)
    {
        s = (PropertyValuesHolder)mValuesMap.get(s);
        if (s != null)
        {
            return s.getAnimatedValue();
        } else
        {
            return null;
        }
    }

    public long getCurrentPlayTime()
    {
        if (!mInitialized || mPlayingState == 0)
        {
            return 0L;
        } else
        {
            return AnimationUtils.currentAnimationTimeMillis() - mStartTime;
        }
    }

    public long getDuration()
    {
        return mDuration;
    }

    public Interpolator getInterpolator()
    {
        return mInterpolator;
    }

    public int getRepeatCount()
    {
        return mRepeatCount;
    }

    public int getRepeatMode()
    {
        return mRepeatMode;
    }

    public long getStartDelay()
    {
        return mStartDelay;
    }

    public PropertyValuesHolder[] getValues()
    {
        return mValues;
    }

    void initAnimation()
    {
        if (mInitialized) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = mValues.length;
        i = 0;
_L6:
        if (i < j) goto _L4; else goto _L3
_L3:
        mInitialized = true;
_L2:
        return;
_L4:
        mValues[i].init();
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean isRunning()
    {
        boolean flag1 = true;
        boolean flag = flag1;
        if (mPlayingState != 1)
        {
            flag = flag1;
            if (!mRunning)
            {
                flag = false;
            }
        }
        return flag;
    }

    public boolean isStarted()
    {
        return mStarted;
    }

    public void removeAllUpdateListeners()
    {
        if (mUpdateListeners == null)
        {
            return;
        } else
        {
            mUpdateListeners.clear();
            mUpdateListeners = null;
            return;
        }
    }

    public void removeUpdateListener(AnimatorUpdateListener animatorupdatelistener)
    {
        if (mUpdateListeners != null)
        {
            mUpdateListeners.remove(animatorupdatelistener);
            if (mUpdateListeners.size() == 0)
            {
                mUpdateListeners = null;
                return;
            }
        }
    }

    public void reverse()
    {
        boolean flag;
        if (mPlayingBackwards)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        mPlayingBackwards = flag;
        if (mPlayingState == 1)
        {
            long l = AnimationUtils.currentAnimationTimeMillis();
            long l1 = mStartTime;
            mStartTime = l - (mDuration - (l - l1));
            return;
        } else
        {
            start(true);
            return;
        }
    }

    public void setCurrentPlayTime(long l)
    {
        initAnimation();
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        if (mPlayingState != 1)
        {
            mSeekTime = l;
            mPlayingState = 2;
        }
        mStartTime = l1 - l;
        animationFrame(l1);
    }

    public volatile Animator setDuration(long l)
    {
        return setDuration(l);
    }

    public ValueAnimator setDuration(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("Animators cannot have negative duration: ")).append(l).toString());
        } else
        {
            mDuration = l;
            return this;
        }
    }

    public void setEvaluator(TypeEvaluator typeevaluator)
    {
        if (typeevaluator != null && mValues != null && mValues.length > 0)
        {
            mValues[0].setEvaluator(typeevaluator);
        }
    }

    public transient void setFloatValues(float af[])
    {
        if (af == null || af.length == 0)
        {
            return;
        }
        if (mValues == null || mValues.length == 0)
        {
            setValues(new PropertyValuesHolder[] {
                PropertyValuesHolder.ofFloat("", af)
            });
        } else
        {
            mValues[0].setFloatValues(af);
        }
        mInitialized = false;
    }

    public transient void setIntValues(int ai[])
    {
        if (ai == null || ai.length == 0)
        {
            return;
        }
        if (mValues == null || mValues.length == 0)
        {
            setValues(new PropertyValuesHolder[] {
                PropertyValuesHolder.ofInt("", ai)
            });
        } else
        {
            mValues[0].setIntValues(ai);
        }
        mInitialized = false;
    }

    public void setInterpolator(Interpolator interpolator)
    {
        if (interpolator != null)
        {
            mInterpolator = interpolator;
            return;
        } else
        {
            mInterpolator = new LinearInterpolator();
            return;
        }
    }

    public transient void setObjectValues(Object aobj[])
    {
        if (aobj == null || aobj.length == 0)
        {
            return;
        }
        if (mValues == null || mValues.length == 0)
        {
            setValues(new PropertyValuesHolder[] {
                PropertyValuesHolder.ofObject("", null, aobj)
            });
        } else
        {
            mValues[0].setObjectValues(aobj);
        }
        mInitialized = false;
    }

    public void setRepeatCount(int i)
    {
        mRepeatCount = i;
    }

    public void setRepeatMode(int i)
    {
        mRepeatMode = i;
    }

    public void setStartDelay(long l)
    {
        mStartDelay = l;
    }

    public transient void setValues(PropertyValuesHolder apropertyvaluesholder[])
    {
        int j = apropertyvaluesholder.length;
        mValues = apropertyvaluesholder;
        mValuesMap = new HashMap(j);
        int i = 0;
        do
        {
            if (i >= j)
            {
                mInitialized = false;
                return;
            }
            PropertyValuesHolder propertyvaluesholder = apropertyvaluesholder[i];
            mValuesMap.put(propertyvaluesholder.getPropertyName(), propertyvaluesholder);
            i++;
        } while (true);
    }

    public void start()
    {
        start(false);
    }

    public String toString()
    {
        String s;
        String s1;
        s = (new StringBuilder("ValueAnimator@")).append(Integer.toHexString(hashCode())).toString();
        s1 = s;
        if (mValues == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        if (i < mValues.length) goto _L4; else goto _L3
_L3:
        s1 = s;
_L2:
        return s1;
_L4:
        s = (new StringBuilder(String.valueOf(s))).append("\n    ").append(mValues[i].toString()).toString();
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }












}
