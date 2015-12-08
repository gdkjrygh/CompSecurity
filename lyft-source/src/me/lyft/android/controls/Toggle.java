// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import me.lyft.android.common.Unit;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.subjects.BehaviorSubject;
import rx.subjects.PublishSubject;
import rx.subscriptions.Subscriptions;

public class Toggle extends FrameLayout
{

    private boolean checked;
    private PublishSubject checkedSubject;
    private View fill;
    private View handle;
    private Subscription measureSubscription;
    android.view.View.OnTouchListener onHandleTouchListener;
    android.view.View.OnTouchListener onTrackTouchListenser;
    private Action1 onViewLengthMeasured;
    private View track;
    private BehaviorSubject viewLengthMeasuredSubject;

    public Toggle(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        checkedSubject = PublishSubject.create();
        viewLengthMeasuredSubject = BehaviorSubject.create();
        measureSubscription = Subscriptions.empty();
        onViewLengthMeasured = new Action1() {

            final Toggle this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                setChecked(isChecked(), true);
            }

            
            {
                this$0 = Toggle.this;
                super();
            }
        };
        onTrackTouchListenser = new android.view.View.OnTouchListener() {

            final Toggle this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                boolean flag = false;
                if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
                float f = track.getWidth() - handle.getWidth();
                setHandlePosition((int)f);
_L4:
                return true;
_L2:
                if (motionevent.getAction() != 1)
                {
                    break; /* Loop/switch isn't completed */
                }
                if ((new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())).contains(view.getLeft() + (int)motionevent.getX(), view.getTop() + (int)motionevent.getY()))
                {
                    view = Toggle.this;
                    if (!checked)
                    {
                        flag = true;
                    }
                    view.setChecked(flag, true);
                }
                if (true) goto _L4; else goto _L3
_L3:
                setChecked(checked, false);
                return false;
            }

            
            {
                this$0 = Toggle.this;
                super();
            }
        };
        onHandleTouchListener = new android.view.View.OnTouchListener() {

            private final int TAP_DRAG_THRESHOLD = 10;
            final Toggle this$0;
            private float touchDownX;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                boolean flag = false;
                float f = 0.0F;
                if (motionevent.getAction() == 0)
                {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    touchDownX = motionevent.getX();
                } else
                {
                    if (motionevent.getAction() != 2)
                    {
                        continue;
                    }
                    float f1 = (view.getTranslationX() + motionevent.getX()) - touchDownX;
                    boolean flag1;
                    if (f1 >= 0.0F)
                    {
                        if (f1 > (float)(track.getWidth() - handle.getWidth()))
                        {
                            f = track.getWidth() - handle.getWidth();
                        } else
                        {
                            f = f1;
                        }
                    }
                    setHandlePosition((int)f);
                }
                do
                {
                    flag = true;
                    do
                    {
                        return flag;
                    } while (motionevent.getAction() != 1);
                    if (Math.abs(motionevent.getX() - touchDownX) < 10F)
                    {
                        view = Toggle.this;
                        if (!checked)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        view.setChecked(flag1, true);
                    } else
                    {
                        snapHandleToNearestState();
                    }
                } while (true);
            }

            
            {
                this$0 = Toggle.this;
                super();
            }
        };
        LayoutInflater.from(context).inflate(0x7f03013e, this, true);
        track = findViewById(0x7f0d0401);
        fill = findViewById(0x7f0d0402);
        handle = findViewById(0x7f0d0403);
        measureSubscription = viewLengthMeasuredSubject.first().subscribe(onViewLengthMeasured);
        handle.setOnTouchListener(onHandleTouchListener);
        track.setOnTouchListener(onTrackTouchListenser);
        setChecked(false, false);
    }

    private void setHandlePosition(int i)
    {
        handle.setTranslationX(i);
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)fill.getLayoutParams();
        layoutparams.width = handle.getWidth() / 2 + i;
        fill.setLayoutParams(layoutparams);
    }

    private void snapHandleToNearestState()
    {
        boolean flag = false;
        if (handle.getTranslationX() + (float)(handle.getWidth() / 2) > (float)(track.getWidth() / 2))
        {
            flag = true;
        }
        setChecked(flag, true);
    }

    public boolean isChecked()
    {
        return checked;
    }

    public Observable observeChange()
    {
        return checkedSubject.asObservable();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        measureSubscription.unsubscribe();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        viewLengthMeasuredSubject.onNext(Unit.create());
    }

    public void setChecked(boolean flag)
    {
        setChecked(flag, true);
    }

    public void setChecked(boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        int i;
        if (flag)
        {
            i = track.getWidth() - handle.getWidth();
        } else
        {
            i = 0;
        }
        setHandlePosition(i);
        i = ((flag2) ? 1 : 0);
        if (checked != flag)
        {
            i = 1;
        }
        checked = flag;
        if (flag1 && i != 0)
        {
            checkedSubject.onNext(Boolean.valueOf(checked));
        }
    }





}
