// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.card;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.libraries.bind.async.AsyncUtil;
import com.google.android.libraries.bind.async.DelayedRunnable;
import com.google.android.libraries.bind.async.JankLock;
import com.google.android.libraries.bind.data.BindingDataAdapter;
import com.google.android.libraries.bind.data.DataAdapter;
import com.google.android.libraries.bind.data.DataList;
import com.google.android.libraries.bind.data.DataView;
import com.google.android.libraries.bind.logging.Logd;
import com.google.android.libraries.bind.util.ParcelUtil;
import com.google.android.libraries.bind.util.Util;
import com.google.android.libraries.bind.widget.MulticastOnScrollListener;
import com.google.android.libraries.bind.widget.WidgetUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public class CardListView extends ListView
{
    private static final class CaptureData
    {

        long animationDuration;
        Rect position;

        private CaptureData()
        {
        }

        CaptureData(byte byte0)
        {
            this();
        }
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
            }

        };
        public final Object cardId;
        public final int offsetFromTop;

        public String toString()
        {
            return cardId.toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            ParcelUtil.writeObjectToParcel(cardId, parcel, i);
            parcel.writeInt(offsetFromTop);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            cardId = ParcelUtil.readObjectFromParcel(parcel, com/google/android/libraries/bind/card/CardListView$SavedState.getClassLoader());
            offsetFromTop = parcel.readInt();
        }

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable, Object obj, int i)
        {
            super(parcelable);
            cardId = obj;
            offsetFromTop = i;
        }
    }


    protected static final boolean ENABLE_ANIMATION;
    static final Logd LOGD = Logd.get(com/google/android/libraries/bind/card/CardListView);
    private static final int a11yTempCount[] = new int[3];
    private static final Interpolator alphaInterpolator = new LinearInterpolator();
    private static final Interpolator translationInterpolator = new AccelerateDecelerateInterpolator();
    private boolean animateChanges;
    private boolean blendAnimationOnNextInvalidation;
    private final Map captures;
    private int invisibleHeight;
    private android.widget.AbsListView.OnScrollListener legacyOnScrollListener;
    private final MulticastOnScrollListener multicastOnScrollListener;
    private final DataSetObserver postUpdateObserver;
    private final DataSetObserver preUpdateObserver;
    SavedState stashedSavedState;
    private final RectF tempRect;

    public CardListView(Context context)
    {
        this(context, null, 0);
    }

    public CardListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CardListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        multicastOnScrollListener = new MulticastOnScrollListener();
        animateChanges = true;
        captures = new HashMap();
        tempRect = new RectF();
        invisibleHeight = 0;
        setSelector(0x106000d);
        super.setOnScrollListener(multicastOnScrollListener);
        postUpdateObserver = new DataSetObserver() {

            final CardListView this$0;

            public final void onChanged()
            {
                CardListView cardlistview = CardListView.this;
                if (cardlistview.stashedSavedState != null)
                {
                    SavedState savedstate = cardlistview.stashedSavedState;
                    cardlistview.stashedSavedState = null;
                    Logd logd = CardListView.LOGD;
                    cardlistview.restoreSavedState(savedstate);
                }
            }

            
            {
                this$0 = CardListView.this;
                super();
            }
        };
        preUpdateObserver = new DataSetObserver() {

            final CardListView this$0;

            public final void onChanged()
            {
                if (stashedSavedState == null)
                {
                    CardListView cardlistview = CardListView.this;
                    cardlistview.stashedSavedState = cardlistview.captureState();
                }
                prepareInvalidationAnimation();
            }

            
            {
                this$0 = CardListView.this;
                super();
            }
        };
    }

    private static RectF capturePosition(View view, View view1, RectF rectf)
    {
        rectf.set(0.0F, 0.0F, view.getWidth(), view.getHeight());
        for (; view != view1; view = (View)view.getParent())
        {
            rectf.offset(view.getLeft(), view.getTop());
        }

        return rectf;
    }

    private SavedState captureState(int i)
    {
        Object obj = getAdapter();
        if (obj instanceof BindingDataAdapter)
        {
            obj = (BindingDataAdapter)obj;
            if (pointToPosition(getWidth() / 2, i) != -1)
            {
                throw new NullPointerException();
            }
        }
        return null;
    }

    private void disableClipChildren(ViewParent viewparent)
    {
        do
        {
            if (!(viewparent instanceof ViewGroup))
            {
                break;
            }
            ((ViewGroup)viewparent).setClipChildren(false);
            ViewParent viewparent1 = viewparent.getParent();
            if (!(viewparent1 instanceof ViewGroup) || viewparent == this)
            {
                break;
            }
            viewparent = viewparent1;
        } while (true);
    }

    private void traverse(View view, boolean flag)
    {
        if (!(view instanceof DataView)) goto _L2; else goto _L1
_L1:
        Object obj = ((DataView)view).getDataRow();
        if (obj == null || ((DataList) (obj)).getCount() <= 0) goto _L4; else goto _L3
_L3:
        obj = ((DataList) (obj)).getItemId(0);
        if (!flag) goto _L6; else goto _L5
_L5:
        CaptureData capturedata = new CaptureData((byte)0);
        RectF rectf = capturePosition(view, this, new RectF());
        Rect rect1 = new Rect();
        rect1.left = Math.round(rectf.left);
        rect1.top = Math.round(rectf.top);
        rect1.right = Math.round(rectf.right);
        rect1.bottom = Math.round(rectf.bottom);
        capturedata.position = rect1;
        capturedata.animationDuration = 250L;
        captures.put(obj, capturedata);
        view.animate().cancel();
        view.setAlpha(1.0F);
        view.setTranslationX(0.0F);
        view.setTranslationY(0.0F);
        view.setRotation(0.0F);
_L4:
        return;
_L6:
        obj = (CaptureData)captures.remove(obj);
        if (obj != null)
        {
            Rect rect = ((CaptureData) (obj)).position;
            capturePosition(view, this, tempRect);
            float f = (float)rect.centerX() - tempRect.centerX();
            float f1 = (float)rect.centerY() - tempRect.centerY();
            if (Math.abs(f) > 5F || Math.abs(f1) > 5F)
            {
                view.setTranslationX(f);
                view.setTranslationY(f1);
                view.setRotation(0.0F);
                view.animate().translationX(0.0F).translationY(0.0F).scaleX(1.0F).scaleY(1.0F).setDuration(((CaptureData) (obj)).animationDuration).setInterpolator(translationInterpolator).setStartDelay(0L);
                disableClipChildren(view.getParent());
                return;
            }
        } else
        {
            view.setAlpha(0.0F);
            view.animate().alpha(1.0F).rotation(0.0F).setStartDelay(250L).setInterpolator(alphaInterpolator).setDuration(250L);
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                view.animate().withLayer();
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int i = 0;
            while (i < view.getChildCount()) 
            {
                traverse(view.getChildAt(i), flag);
                i++;
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    final SavedState captureState()
    {
        if (getChildCount() > 0)
        {
            if (getFirstVisiblePosition() == 0 && getChildAt(0).getTop() == 0)
            {
                return captureState(0);
            }
            if (getFirstVisiblePosition() + getChildCount() == getAdapter().getCount() && getChildAt(getChildCount() - 1).getBottom() <= getHeight())
            {
                return captureState(getChildAt(getChildCount() - 1).getBottom() - 1);
            }
        }
        return captureState(getHeight() / 2);
    }

    protected void dispatchDraw(Canvas canvas)
    {
        Object obj;
        if (!animateChanges || captures.isEmpty())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj = LOGD;
        if (!ENABLE_ANIMATION)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        traverse(this, false);
        captures.clear();
        obj = JankLock.global;
        if (JankLock.DISABLED)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (JankLock.DISABLED)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        AsyncUtil.checkMainThread();
        ((JankLock) (obj)).pauseLock.lock();
        obj.isPaused = true;
        ((JankLock) (obj)).pauseLock.unlock();
        ((JankLock) (obj)).resumeRunnable.postDelayed$25666f8(500L);
        super.dispatchDraw(canvas);
        return;
        canvas;
        ((JankLock) (obj)).pauseLock.unlock();
        throw canvas;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        setAdapter(((ListAdapter) (null)));
        multicastOnScrollListener.listeners.clear();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        Object obj = getAdapter();
        boolean flag;
        if (obj instanceof BindingDataAdapter)
        {
            obj = (BindingDataAdapter)obj;
            int k = 0;
            int i = 0;
            for (; k < getFirstVisiblePosition(); k++)
            {
                int l = ((BindingDataAdapter) (obj)).getA11yRowCount(k);
                Logd logd = LOGD;
                i += l;
            }

            a11yTempCount[0] = i;
            for (k = getFirstVisiblePosition(); k < getLastVisiblePosition(); k++)
            {
                int i1 = ((BindingDataAdapter) (obj)).getA11yRowCount(k);
                Logd logd1 = LOGD;
                i += i1;
            }

            a11yTempCount[1] = i;
            int j1 = getLastVisiblePosition();
            k = i;
            for (int j = j1; j < ((BindingDataAdapter) (obj)).getCount(); j++)
            {
                int k1 = ((BindingDataAdapter) (obj)).getA11yRowCount(j);
                Logd logd2 = LOGD;
                k += k1;
            }

            a11yTempCount[2] = k;
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            accessibilityevent.setFromIndex(a11yTempCount[0]);
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                accessibilityevent.setToIndex(a11yTempCount[1] - 1);
            }
            accessibilityevent.setItemCount(a11yTempCount[2]);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        Logd logd = LOGD;
        if (parcelable instanceof SavedState)
        {
            parcelable = (SavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            restoreSavedState(parcelable);
            return;
        } else
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = captureState();
        Object obj = savedstate;
        if (savedstate == null)
        {
            obj = super.onSaveInstanceState();
        }
        return ((Parcelable) (obj));
    }

    protected final void prepareInvalidationAnimation()
    {
label0:
        {
            Logd logd = LOGD;
            if (ENABLE_ANIMATION && captures.isEmpty())
            {
                if (WidgetUtil.isVisibleOnScreen(this))
                {
                    break label0;
                }
                Logd logd1 = LOGD;
            }
            return;
        }
        if (getChildCount() == 0)
        {
            Logd logd2 = LOGD;
            return;
        } else
        {
            Logd logd3 = LOGD;
            traverse(this, true);
            blendAnimationOnNextInvalidation = false;
            return;
        }
    }

    final void restoreSavedState(SavedState savedstate)
    {
        Object obj = savedstate.cardId;
        if (getAdapter() instanceof BindingDataAdapter)
        {
            stashedSavedState = savedstate;
            savedstate = LOGD;
        }
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        ListAdapter listadapter1 = getAdapter();
        if (listadapter1 != null)
        {
            listadapter1.unregisterDataSetObserver(postUpdateObserver);
            if (animateChanges)
            {
                listadapter1.unregisterDataSetObserver(preUpdateObserver);
            }
        }
        super.setAdapter(listadapter);
        if (listadapter != null)
        {
            listadapter = (DataAdapter)listadapter;
            listadapter.registerDataSetObserver(postUpdateObserver, 1);
            if (animateChanges)
            {
                listadapter.registerDataSetObserver(preUpdateObserver, -1);
            }
        }
    }

    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        if (onscrolllistener == null)
        {
            if (legacyOnScrollListener != null)
            {
                onscrolllistener = legacyOnScrollListener;
                multicastOnScrollListener.listeners.remove(onscrolllistener);
                legacyOnScrollListener = null;
            }
            return;
        }
        boolean flag;
        if (legacyOnScrollListener == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Util.checkPrecondition(flag);
        legacyOnScrollListener = onscrolllistener;
        onscrolllistener = legacyOnScrollListener;
        multicastOnScrollListener.listeners.add(onscrolllistener);
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ENABLE_ANIMATION = flag;
    }

}
