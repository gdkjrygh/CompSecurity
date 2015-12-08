// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.view.PriceSliderView;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.base.Events;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

public class PriceFilterFragment extends BaseFragment
{

    private static final int DEFAULT_BUCKET_MIN = 1;
    private static final int DEFAULT_BUCKET_MULTIPLIER = 10;
    private static final int DEFAULT_BUCKET_SIZE = 30;
    private static final int HINT_DELAY_MS = 1000;
    public static final String LAST_PRICE = "LAST_PRICE";
    public static final String PRICE_BUCKET = "PRICE_BUCKET";
    public static final String PRICE_SEP = ",";
    private float _bottom;
    private int _bucketSize;
    Button _clearBt;
    View _closeBt;
    FrameLayout _container;
    PriceSliderView _draggerVw;
    private Handler _handler;
    private ObjectAnimator _hintAnim;
    private Runnable _hintRunnable;
    private int _lastIndex;
    private String _lastPrice;
    private ArrayList _priceBuckets;
    private float _step;
    android.view.View.OnTouchListener _touchListener;
    boolean isDragging;

    public PriceFilterFragment()
    {
        _priceBuckets = new ArrayList();
        _bucketSize = 2;
        _lastIndex = -1;
        _handler = new Handler();
        _touchListener = new _cls2();
        _hintRunnable = new _cls3();
        _layoutId = 0x7f0300fd;
    }

    private void cancelHintAnim()
    {
        _handler.removeCallbacks(_hintRunnable);
        if (_hintAnim != null && _hintAnim.isStarted())
        {
            _hintAnim.cancel();
        }
    }

    private void dismiss()
    {
        if (getActivity() != null)
        {
            getActivity().onBackPressed();
        }
    }

    private Rect getDragWrapperRect()
    {
        Rect rect = new Rect();
        _draggerVw.getHitRect(rect);
        return rect;
    }

    private String getPriceString(int i)
    {
        if (i >= 0) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return (String)_priceBuckets.get(j);
_L2:
        j = i;
        if (i >= _bucketSize)
        {
            j = _bucketSize - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void hideButtons()
    {
        _clearBt.animate().alpha(0.0F);
        _closeBt.animate().alpha(0.0F);
    }

    private void initBucketSteps()
    {
        if (_priceBuckets.size() == 0)
        {
            return;
        }
        _bottom = _container.getBottom() - _draggerVw.getMeasuredHeight();
        _step = _bottom / (float)(_bucketSize - 1);
        if (_lastPrice == null)
        {
            _lastPrice = (String)_priceBuckets.get(0);
            _handler.postDelayed(_hintRunnable, 1000L);
        }
        setPrice(_lastPrice);
        _lastIndex = _priceBuckets.indexOf(_lastPrice);
        setWrapperPosition(_lastIndex);
    }

    private void initBuckets()
    {
        String s = Preferences.user().getString("PRICE_BUCKET", null);
        if (s != null)
        {
            _priceBuckets = new ArrayList(Arrays.asList(s.split(",")));
        } else
        {
            initDefaultPriceBuckets();
        }
        _bucketSize = _priceBuckets.size();
    }

    private void initDefaultPriceBuckets()
    {
        _priceBuckets = new ArrayList(30);
        for (int i = 1; i < 31; i++)
        {
            _priceBuckets.add((new StringBuilder("$")).append(i * 10).toString());
        }

    }

    private boolean isDragWrapperHit(int i, int j)
    {
        return getDragWrapperRect().contains(i, j);
    }

    public static void navigate(String s, ArrayList arraylist)
    {
        Navigation navigation = new Navigation(Location.PRICE_FILTER);
        if (StringUtils.isNotEmpty(s))
        {
            navigation.putStringParcelable("LAST_PRICE", s);
        }
        if (arraylist != null && arraylist.size() > 0)
        {
            navigation.putStringArrayListParcelable("PRICE_BUCKET", arraylist);
        }
        Events.post(navigation);
    }

    private void setPrice(int i)
    {
        setPrice(getPriceString(i));
    }

    private void setPrice(String s)
    {
        _draggerVw.setPrice(s);
    }

    private void setWrapperPosition(int i)
    {
        _draggerVw.setY(_bottom - (float)(i + 1) * _step);
    }

    private void updatePrice(int i)
    {
        i = (int)((_bottom - (float)i) / _step) - 1;
        _lastIndex = i;
        setPrice(i);
    }

    void onClearClicked()
    {
        Events.post(new PriceUpdatedEvent(null));
        dismiss();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        cancelHintAnim();
    }

    void onFrameClicked()
    {
        dismiss();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _container.setOnTouchListener(_touchListener);
        initBuckets();
        _draggerVw.getViewTreeObserver().addOnGlobalLayoutListener(new _cls1());
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation != null)
        {
            _lastPrice = navigation.getStringParcelable("LAST_PRICE");
        }
    }












/*
    static ObjectAnimator access$902(PriceFilterFragment pricefilterfragment, ObjectAnimator objectanimator)
    {
        pricefilterfragment._hintAnim = objectanimator;
        return objectanimator;
    }

*/

    private class _cls2
        implements android.view.View.OnTouchListener
    {

        float initOffsetY;
        float lastY;
        final PriceFilterFragment this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            float f;
            float f1;
            int i;
            i = motionevent.getAction();
            f = motionevent.getX();
            f1 = motionevent.getY();
            i;
            JVM INSTR tableswitch 0 3: default 48
        //                       0 50
        //                       1 252
        //                       2 124
        //                       3 252;
               goto _L1 _L2 _L3 _L4 _L3
_L1:
            return false;
_L2:
            if (isDragWrapperHit((int)f, (int)f1))
            {
                isDragging = true;
                lastY = f1;
                initOffsetY = f1 - _draggerVw.getY();
                hideButtons();
                cancelHintAnim();
                _draggerVw.moveArrows();
                return true;
            } else
            {
                return false;
            }
_L4:
            if (isDragging)
            {
                int j = (int)_draggerVw.getY();
                if (j > 0 && (float)j < _bottom || f1 > initOffsetY && f1 < _bottom + initOffsetY)
                {
                    updatePrice(j);
                    _draggerVw.setY((_draggerVw.getY() + f1) - lastY);
                    lastY = f1;
                } else
                {
                    updatePrice(j);
                }
            }
            continue; /* Loop/switch isn't completed */
_L3:
            if (isDragging)
            {
                isDragging = false;
                view = getPriceString(_lastIndex);
                Events.post(new PriceUpdatedEvent(view));
                dismiss();
            }
            if (true) goto _L1; else goto _L5
_L5:
        }

        _cls2()
        {
            this$0 = PriceFilterFragment.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final PriceFilterFragment this$0;

        public void run()
        {
            if (_draggerVw == null)
            {
                return;
            } else
            {
                _hintAnim = ObjectAnimator.ofFloat(_draggerVw, "translationY", new float[] {
                    (float)(-Constants.MARGIN), 0.0F
                });
                _hintAnim.setDuration(500L);
                _hintAnim.start();
                return;
            }
        }

        _cls3()
        {
            this$0 = PriceFilterFragment.this;
            super();
        }
    }


    private class PriceUpdatedEvent
    {

        private String _price;
        final PriceFilterFragment this$0;

        public String getPrice()
        {
            return _price;
        }

        public PriceUpdatedEvent(String s)
        {
            this$0 = PriceFilterFragment.this;
            super();
            _price = s;
        }
    }


    private class _cls1
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final PriceFilterFragment this$0;

        public void onGlobalLayout()
        {
            initBucketSteps();
            _draggerVw.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }

        _cls1()
        {
            this$0 = PriceFilterFragment.this;
            super();
        }
    }

}
