// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.Observable;
import rx.subjects.PublishSubject;

public class HorizontalCarouselView extends HorizontalScrollView
{

    private static final double MIN_SCROLL_PERCENTAGE_THRESHOLD = 0.25D;
    private static final int SWIPE_THRESHOLD_VELOCITY = 300;
    LinearLayout containerView;
    private int currentVisibleViewIndex;
    private GestureDetector flingGestureDetector;
    PublishSubject onCarouselScrollToIndexSubject;
    private List views;

    public HorizontalCarouselView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        views = new ArrayList();
        currentVisibleViewIndex = 0;
        onCarouselScrollToIndexSubject = PublishSubject.create();
        initialize();
    }

    private int getNextIndex()
    {
        if (currentVisibleViewIndex == views.size() - 1)
        {
            return currentVisibleViewIndex;
        } else
        {
            return currentVisibleViewIndex + 1;
        }
    }

    private int getPreviousIndex()
    {
        if (currentVisibleViewIndex == 0)
        {
            return currentVisibleViewIndex;
        } else
        {
            return currentVisibleViewIndex - 1;
        }
    }

    private void initialize()
    {
        Scoop.a(this).a(getContext()).inflate(0x7f030086, this, true);
        ButterKnife.a(this);
        setOnTouchListener(new android.view.View.OnTouchListener() {

            float lastXPosition;
            final HorizontalCarouselView this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (flingGestureDetector.onTouchEvent(motionevent))
                {
                    return true;
                }
                motionevent.getAction();
                JVM INSTR tableswitch 0 3: default 52
            //                           0 54
            //                           1 65
            //                           2 52
            //                           3 65;
                   goto _L1 _L2 _L3 _L1 _L3
_L1:
                return false;
_L2:
                lastXPosition = motionevent.getX();
                  goto _L1
_L3:
                if (isSwipeToNext(lastXPosition, motionevent.getX()))
                {
                    scrollToIndex(getNextIndex());
                    return true;
                }
                if (isSwipeToPrevious(lastXPosition, motionevent.getX()))
                {
                    scrollToIndex(getPreviousIndex());
                    return true;
                } else
                {
                    scrollToIndex(currentVisibleViewIndex);
                    return true;
                }
            }

            
            {
                this$0 = HorizontalCarouselView.this;
                super();
                lastXPosition = 0.0F;
            }
        });
        flingGestureDetector = new FlingGestureDetector();
    }

    private boolean isFlingToNext(float f)
    {
        return f < 0.0F && Math.abs(f) > 300F;
    }

    private boolean isFlingToPrevious(float f)
    {
        return f > 0.0F && Math.abs(f) > 300F;
    }

    private boolean isSwipeToNext(float f, float f1)
    {
        return (double)(f - f1) > (double)getWidth() * 0.25D;
    }

    private boolean isSwipeToPrevious(float f, float f1)
    {
        return (double)(f1 - f) > (double)getWidth() * 0.25D;
    }

    private void scrollToIndex(int i)
    {
        if (views.isEmpty())
        {
            return;
        } else
        {
            View view = (View)views.get(i);
            currentVisibleViewIndex = i;
            smoothScrollTo((int)(view.getX() - (float)((getWidth() - view.getWidth()) / 2)), 0);
            onCarouselScrollToIndexSubject.onNext(Integer.valueOf(i));
            return;
        }
    }

    public void addItem(View view)
    {
        views.add(view);
        containerView.addView(view, views.size());
    }

    public void addItems(List list)
    {
        for (list = list.iterator(); list.hasNext(); addItem((View)list.next())) { }
    }

    public void clearItems()
    {
        View view;
        for (Iterator iterator = views.iterator(); iterator.hasNext(); containerView.removeView(view))
        {
            view = (View)iterator.next();
        }

        views.clear();
    }

    public Observable observeOnCarouselScrollToIndex()
    {
        return onCarouselScrollToIndexSubject.asObservable();
    }










    private class FlingGestureDetector extends GestureDetector
    {

        final HorizontalCarouselView this$0;

        public FlingGestureDetector()
        {
            this.this$0 = HorizontalCarouselView.this;
            super(new android.view.GestureDetector.SimpleOnGestureListener() {

                final HorizontalCarouselView val$this$0;

                public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
                {
                    if (motionevent == null || motionevent1 == null)
                    {
                        return true;
                    }
                    f1 = motionevent.getX();
                    float f2 = motionevent1.getX();
                    if (this$0.isSwipeToNext(f1, f2) || this$0.isFlingToNext(f))
                    {
                        this$0.scrollToIndex(this$0.getNextIndex());
                        return true;
                    }
                    if (this$0.isSwipeToPrevious(f1, f2) || this$0.isFlingToPrevious(f))
                    {
                        this$0.scrollToIndex(this$0.getPreviousIndex());
                        return true;
                    } else
                    {
                        return false;
                    }
                }

                
                {
                    this$0 = horizontalcarouselview;
                    super();
                }
            });
        }
    }

}
