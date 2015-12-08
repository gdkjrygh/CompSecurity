// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import rx.Observable;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.controls:
//            ISwitcherItem, SimpleAnimationListener, SwitcherSelection

public abstract class MultiSwitcher extends RelativeLayout
{

    private static final float THUMB_SLIDING_DURATION = 200F;
    private PublishSubject animationFinishedSubject;
    private GestureDetector gestureDetector;
    private boolean isCurrentItemDragged;
    private boolean isSelectionAnimationInProgress;
    private boolean isUserAction;
    private int itemWidth;
    private final List items;
    LinearLayout itemsPlaceHolder;
    private int lastTouchedThumbIndex;
    private LayoutInflater layoutInflater;
    private Action1 previewChangeListener;
    private PublishSubject previewChangedSubject;
    private int previewItemIndex;
    private int selectedItemIndex;
    private Action1 selectionChangeListener;
    private PublishSubject selectionChangedSubject;
    private boolean sizeMeasured;
    private ValueAnimator thumbAnimator;
    private Action0 thumbClickListener;
    private PublishSubject thumbClickSubject;
    ViewGroup thumbView;
    private android.view.View.OnTouchListener thumbViewTouchListener = new android.view.View.OnTouchListener() {

        public float lastTouchX;
        final MultiSwitcher this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            motionevent.getActionMasked();
            JVM INSTR tableswitch 0 4: default 40
        //                       0 52
        //                       1 185
        //                       2 85
        //                       3 185
        //                       4 185;
               goto _L1 _L2 _L3 _L4 _L3 _L3
_L1:
            return gestureDetector.onTouchEvent(motionevent);
_L2:
            lastTouchedThumbIndex = getCurrentItemIndex();
            lastTouchX = motionevent.getX();
            clearThumbAnimation();
            continue; /* Loop/switch isn't completed */
_L4:
            float f = lastTouchX;
            float f1 = motionevent.getX();
            f1 = (float)getThumbTranslationX() - (f - f1);
            f = f1;
            if (f1 <= 0.0F)
            {
                f = 0.0F;
            }
            f1 = f;
            if (f >= (float)getMaxTranslationX())
            {
                f1 = getMaxTranslationX();
            }
            if (f1 >= 0.0F)
            {
                setThumbTranslationX((int)f1);
            }
            isCurrentItemDragged = true;
            checkIfPreviewItemChanged();
            continue; /* Loop/switch isn't completed */
_L3:
            isUserAction = true;
            isCurrentItemDragged = false;
            animateToItemIndex(getCurrentItemIndex());
            if (true) goto _L1; else goto _L5
_L5:
        }

            
            {
                this$0 = MultiSwitcher.this;
                super();
            }
    };
    private int width;

    public MultiSwitcher(Context context)
    {
        super(context);
        items = new ArrayList(3);
        selectedItemIndex = 0;
        previewItemIndex = 0;
        isSelectionAnimationInProgress = false;
        selectionChangedSubject = PublishSubject.create();
        previewChangedSubject = PublishSubject.create();
        animationFinishedSubject = PublishSubject.create();
        thumbClickSubject = PublishSubject.create();
        selectionChangeListener = Actions.empty();
        previewChangeListener = Actions.empty();
        thumbClickListener = Actions.empty();
        isCurrentItemDragged = false;
        isUserAction = false;
        init();
    }

    public MultiSwitcher(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        items = new ArrayList(3);
        selectedItemIndex = 0;
        previewItemIndex = 0;
        isSelectionAnimationInProgress = false;
        selectionChangedSubject = PublishSubject.create();
        previewChangedSubject = PublishSubject.create();
        animationFinishedSubject = PublishSubject.create();
        thumbClickSubject = PublishSubject.create();
        selectionChangeListener = Actions.empty();
        previewChangeListener = Actions.empty();
        thumbClickListener = Actions.empty();
        isCurrentItemDragged = false;
        isUserAction = false;
        init();
    }

    public MultiSwitcher(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        items = new ArrayList(3);
        selectedItemIndex = 0;
        previewItemIndex = 0;
        isSelectionAnimationInProgress = false;
        selectionChangedSubject = PublishSubject.create();
        previewChangedSubject = PublishSubject.create();
        animationFinishedSubject = PublishSubject.create();
        thumbClickSubject = PublishSubject.create();
        selectionChangeListener = Actions.empty();
        previewChangeListener = Actions.empty();
        thumbClickListener = Actions.empty();
        isCurrentItemDragged = false;
        isUserAction = false;
        init();
    }

    private void animateTo(int i)
    {
        int j = itemWidth * i;
        if (i == items.size() - 1)
        {
            j = width - itemWidth;
        }
        clearThumbAnimation();
        thumbAnimator = createThumbAnimator(j);
        thumbAnimator.start();
    }

    private void checkIfPreviewItemChanged()
    {
        int i;
        if (isSelectionAnimationInProgress)
        {
            i = selectedItemIndex;
        } else
        {
            i = getCurrentItemIndex();
        }
        setPreviewItemIndex(i);
    }

    private void clearThumbAnimation()
    {
        if (thumbAnimator != null)
        {
            thumbAnimator.removeAllListeners();
            thumbAnimator.cancel();
        }
    }

    private ValueAnimator createThumbAnimator(int i)
    {
        int j = getThumbTranslationX();
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(thumbView, "translationX", new float[] {
            (float)i
        });
        objectanimator.setDuration((long)(((float)Math.abs(j - i) * 200F) / (float)itemWidth));
        objectanimator.addListener(new SimpleAnimationListener() {

            final MultiSwitcher this$0;

            public void onAnimationCancel(Animator animator)
            {
                super.onAnimationCancel(animator);
                isSelectionAnimationInProgress = false;
                animationFinishedSubject.onNext(Unit.create());
            }

            public void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                isSelectionAnimationInProgress = false;
                animationFinishedSubject.onNext(Unit.create());
                updateThumb();
            }

            
            {
                this$0 = MultiSwitcher.this;
                super();
            }
        });
        return objectanimator;
    }

    private int getCurrentItemIndex()
    {
        return (int)(((float)getThumbTranslationX() + (float)(itemWidth / 2)) / (float)itemWidth);
    }

    private int getMaxTranslationX()
    {
        return width - itemWidth;
    }

    private android.widget.RelativeLayout.LayoutParams getThumViewLayoutParams()
    {
        return (android.widget.RelativeLayout.LayoutParams)thumbView.getLayoutParams();
    }

    private int getThumbTranslationX()
    {
        return (int)thumbView.getTranslationX();
    }

    private void initThumb()
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = getThumViewLayoutParams();
        layoutparams.width = itemWidth;
        thumbView.setLayoutParams(layoutparams);
        slideTo(selectedItemIndex);
    }

    private void initializeSubViews()
    {
        if (items.size() > 0)
        {
            itemWidth = width / items.size();
            itemsPlaceHolder.post(new Runnable() {

                final MultiSwitcher this$0;

                public void run()
                {
                    if (!isCurrentItemDragged)
                    {
                        initThumb();
                        updateThumb();
                    }
                    itemsPlaceHolder.removeAllViews();
                    Iterator iterator = items.iterator();
                    for (int i = 0; iterator.hasNext(); i++)
                    {
                        ISwitcherItem iswitcheritem = (ISwitcherItem)iterator.next();
                        View view = createSwitcherItem(layoutInflater, iswitcheritem);
                        bindSwitcherItem(view, iswitcheritem);
                        view.setOnClickListener(i. new android.view.View.OnClickListener() {

                            final _cls4 this$1;
                            final int val$currentIndex;

                            public void onClick(View view)
                            {
                                isUserAction = true;
                                animateToItemIndex(currentIndex);
                            }

            
            {
                this$1 = final__pcls4;
                currentIndex = I.this;
                super();
            }
                        });
                        itemsPlaceHolder.addView(view, new android.widget.LinearLayout.LayoutParams(itemWidth, -1));
                    }

                }

            
            {
                this$0 = MultiSwitcher.this;
                super();
            }
            });
        }
    }

    private void setPreviewItemIndex(int i)
    {
        if (previewItemIndex != i)
        {
            previewItemIndex = i;
            updateThumb();
            ISwitcherItem iswitcheritem = getPreviewItem();
            if (iswitcheritem != null)
            {
                previewChangedSubject.onNext(iswitcheritem);
                previewChangeListener.call(iswitcheritem);
            }
        }
    }

    private void setSelectedIndex(int i)
    {
        if (selectedItemIndex != i)
        {
            selectedItemIndex = i;
            final ISwitcherItem selectedItem = getSelectedItem();
            if (selectedItem != null)
            {
                final boolean wasUserAction = isUserAction;
                isUserAction = false;
                animationFinishedSubject.first().subscribe(new Action1() {

                    final MultiSwitcher this$0;
                    final ISwitcherItem val$selectedItem;
                    final boolean val$wasUserAction;

                    public volatile void call(Object obj)
                    {
                        call((Unit)obj);
                    }

                    public void call(Unit unit)
                    {
                        unit = new SwitcherSelection(selectedItem, wasUserAction);
                        selectionChangedSubject.onNext(unit);
                        selectionChangeListener.call(unit);
                    }

            
            {
                this$0 = MultiSwitcher.this;
                selectedItem = iswitcheritem;
                wasUserAction = flag;
                super();
            }
                });
            }
            setPreviewItemIndex(i);
        }
    }

    private void setThumbTranslationX(int i)
    {
        thumbView.setTranslationX(i);
    }

    private void slideTo(int i)
    {
        int j = itemWidth * i;
        if (i == items.size() - 1)
        {
            j = width - itemWidth;
        }
        setThumbTranslationX(j);
    }

    public boolean animateThumbToItemId(String s)
    {
        if (!isCurrentItemDragged)
        {
            int i = 0;
            while (i < items.size()) 
            {
                if (Objects.equals(((ISwitcherItem)items.get(i)).getId(), s))
                {
                    animateToItemIndex(i);
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    protected void animateToItemIndex(int i)
    {
        isSelectionAnimationInProgress = true;
        setSelectedIndex(i);
        updateThumb();
        animateTo(i);
    }

    protected abstract void bindSwitcherItem(View view, ISwitcherItem iswitcheritem);

    protected abstract View createMultiSwitcherView(LayoutInflater layoutinflater, ViewGroup viewgroup);

    protected abstract View createSwitcherItem(LayoutInflater layoutinflater, ISwitcherItem iswitcheritem);

    protected abstract View createThumb(LayoutInflater layoutinflater, ViewGroup viewgroup);

    public ISwitcherItem getPreviewItem()
    {
        if (previewItemIndex < items.size())
        {
            return (ISwitcherItem)items.get(previewItemIndex);
        } else
        {
            return null;
        }
    }

    public String getPreviewItemId()
    {
        ISwitcherItem iswitcheritem = getPreviewItem();
        if (iswitcheritem != null)
        {
            return iswitcheritem.getId();
        } else
        {
            return null;
        }
    }

    public ISwitcherItem getSelectedItem()
    {
        if (selectedItemIndex >= 0 && selectedItemIndex < items.size())
        {
            return (ISwitcherItem)items.get(selectedItemIndex);
        } else
        {
            return null;
        }
    }

    public String getSelectedItemId()
    {
        ISwitcherItem iswitcheritem = getSelectedItem();
        if (iswitcheritem != null)
        {
            return iswitcheritem.getId();
        } else
        {
            return null;
        }
    }

    public View getThumbViewAt(int i)
    {
        return itemsPlaceHolder.getChildAt(i);
    }

    protected void init()
    {
        if (isInEditMode())
        {
            return;
        } else
        {
            layoutInflater = LayoutInflater.from(getContext());
            ButterKnife.a(this, createMultiSwitcherView(layoutInflater, this));
            createThumb(layoutInflater, thumbView);
            thumbView.setOnTouchListener(thumbViewTouchListener);
            gestureDetector = new GestureDetector(getContext(), new android.view.GestureDetector.SimpleOnGestureListener() {

                final MultiSwitcher this$0;

                public boolean onSingleTapUp(MotionEvent motionevent)
                {
                    if (getCurrentItemIndex() == lastTouchedThumbIndex)
                    {
                        thumbClickSubject.onNext(Unit.create());
                        thumbClickListener.call();
                    }
                    return false;
                }

            
            {
                this$0 = MultiSwitcher.this;
                super();
            }
            });
            return;
        }
    }

    public boolean isVisible()
    {
        return getVisibility() == 0;
    }

    public boolean moveThumbToItemId(String s)
    {
        if (!isCurrentItemDragged)
        {
            int i = 0;
            while (i < items.size()) 
            {
                if (Objects.equals(((ISwitcherItem)items.get(i)).getId(), s))
                {
                    moveToIndex(i);
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    protected void moveToIndex(int i)
    {
        slideTo(i);
        updateThumb();
        setSelectedIndex(i);
    }

    public Observable observePreviewChanges()
    {
        return previewChangedSubject.asObservable();
    }

    public Observable observeSelectionChanges()
    {
        return selectionChangedSubject.asObservable();
    }

    public Observable observeThumbClick()
    {
        return thumbClickSubject.asObservable();
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        width = i;
        sizeMeasured = true;
        initializeSubViews();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return true;
    }

    public void setItems(List list)
    {
        if (!items.equals(list))
        {
            items.clear();
            items.addAll(list);
            if (sizeMeasured)
            {
                initializeSubViews();
            }
        }
    }

    public void setOnSelectionChangeListener(Action1 action1)
    {
        selectionChangeListener = action1;
    }

    public void setPreviewChangeListener(Action1 action1)
    {
        previewChangeListener = action1;
    }

    public void setThumbClickListener(Action0 action0)
    {
        thumbClickListener = action0;
    }

    protected void updateThumb()
    {
        if (items.size() > 0 && previewItemIndex < items.size())
        {
            updateThumbViewToIndex((ISwitcherItem)items.get(previewItemIndex), thumbView);
        }
    }

    protected abstract void updateThumbViewToIndex(ISwitcherItem iswitcheritem, ViewGroup viewgroup);




/*
    static boolean access$1002(MultiSwitcher multiswitcher, boolean flag)
    {
        multiswitcher.isUserAction = flag;
        return flag;
    }

*/


/*
    static int access$102(MultiSwitcher multiswitcher, int i)
    {
        multiswitcher.lastTouchedThumbIndex = i;
        return i;
    }

*/



/*
    static boolean access$1202(MultiSwitcher multiswitcher, boolean flag)
    {
        multiswitcher.isSelectionAnimationInProgress = flag;
        return flag;
    }

*/
















/*
    static boolean access$802(MultiSwitcher multiswitcher, boolean flag)
    {
        multiswitcher.isCurrentItemDragged = flag;
        return flag;
    }

*/

}
