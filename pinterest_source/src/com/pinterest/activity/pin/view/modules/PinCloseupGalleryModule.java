// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.pin.adapter.ImageGalleryAdapter;
import com.pinterest.activity.pin.view.PinCloseupImageView;
import com.pinterest.activity.pin.view.modules.util.ClickThroughUtil;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Colors;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.education.EducationHelper;
import com.pinterest.events.VariantUpdatedEvent;
import com.pinterest.kit.application.Resources;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.experiences.Experience;
import java.util.List;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupGalleryModule extends PinCloseupBaseModule
    implements android.view.View.OnClickListener
{

    public static final float ALPHA_LIGHT = 0.9F;
    public static final float NO_ALPHA = 1F;
    int HORIZONTAL_PADDING_BIG;
    int HORIZONTAL_PADDING_SMALL;
    private ImageGalleryAdapter _adapter;
    private int _currentPosition;
    private PinCloseupImageView _currentView;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private com.pinterest.api.model.BuyableProduct.Variant _variant;
    private ViewPager _viewPager;

    public PinCloseupGalleryModule(Context context)
    {
        super(context);
        HORIZONTAL_PADDING_SMALL = (int)Resources.dimension(0x7f0a018a);
        HORIZONTAL_PADDING_BIG = (int)Resources.dimension(0x7f0a0184);
        _eventsSubscriber = new _cls7();
    }

    private void performAnimation()
    {
        int i = _currentView.getFullHeight();
        final PinCloseupImageView nextView = _adapter.getViewAtPosition(_currentPosition + 1);
        Object obj = ValueAnimator.ofInt(new int[] {
            _currentView.getMeasuredHeight(), i
        });
        ((ValueAnimator) (obj)).addUpdateListener(new _cls4());
        ((ValueAnimator) (obj)).setDuration(500L);
        i = HORIZONTAL_PADDING_BIG;
        int k = HORIZONTAL_PADDING_SMALL;
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            _viewPager.getPaddingRight(), i + k
        });
        valueanimator.addUpdateListener(new _cls5());
        valueanimator.setDuration(500L);
        AnimatorSet animatorset = new AnimatorSet();
        obj = animatorset.play(valueanimator).with(((Animator) (obj)));
        if (nextView != null)
        {
            int j = HORIZONTAL_PADDING_BIG;
            nextView.setTranslationX(j);
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(nextView, "translationX", new float[] {
                (float)j, 0.0F
            });
            objectanimator.setDuration(500L);
            ((android.animation.AnimatorSet.Builder) (obj)).with(objectanimator);
        }
        animatorset.addListener(new _cls6());
        animatorset.start();
    }

    private void updateViewPagerPadding(int i)
    {
        if (_adapter.getCount() > 1)
        {
            if (i == 0)
            {
                _viewPager.setPadding(HORIZONTAL_PADDING_SMALL, 0, HORIZONTAL_PADDING_SMALL + HORIZONTAL_PADDING_BIG, 0);
                return;
            } else
            {
                _viewPager.setPadding(HORIZONTAL_PADDING_BIG, 0, HORIZONTAL_PADDING_BIG, 0);
                return;
            }
        } else
        {
            _viewPager.setPadding(HORIZONTAL_PADDING_SMALL, 0, HORIZONTAL_PADDING_SMALL, 0);
            return;
        }
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_GALLERY;
    }

    public PinCloseupImageView getCurrentView()
    {
        return _currentView;
    }

    protected boolean hasContent()
    {
        return _adapter.getCount() > 0;
    }

    protected void init()
    {
        _padding.top = (int)Resources.dimension(0x7f0a0186);
        _variant = null;
    }

    protected void initView()
    {
        setBackgroundColor(Colors.WHITE);
        removeAllViews();
        _viewPager = new _cls1(getContext());
        _viewPager.setPageMargin((int)Device.dpToPixel(Resources.dimension(0x7f0a0189)));
        _viewPager.setClipToPadding(false);
        _adapter = new ImageGalleryAdapter();
        _adapter.setPinClickListener(this);
        _adapter.setContext(getContext());
        _viewPager.setAdapter(_adapter);
        updateViewPagerPadding(0);
        addView(_viewPager, -1, -2);
        _viewPager.setOnPageChangeListener(new _cls2());
        _viewPager.setPageTransformer(false, new _cls3());
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Events.register(_eventsSubscriber, com/pinterest/events/VariantUpdatedEvent, new Class[0]);
    }

    public void onClick(View view)
    {
        view = _pin.getBuyableProduct();
        if (view != null)
        {
            if (BuyableProductHelper.buyableProductReady(view))
            {
                Events.post(new GalleryClickedEvent(_pin, _variant));
            }
        } else
        {
            view = _pin.getClickThroughUrl();
            Pinalytics.a(ElementType.PIN_SOURCE_IMAGE, ComponentType.MODAL_PIN, _pin.getUid(), _pin.getLoggingAuxData());
            StopWatch.get().start("clickthrough_verify");
            ClickThroughUtil.gotoPinLink(view, _pin, _apiTag);
            int i = EducationHelper.b();
            if (i == Experience.ANDROID_CLICKTHROUGH_ED.getValue() || i == Experience.ANDROID_CLICKTHROUGH_ED_HELPER.getValue() || i == Experience.ANDROID_CLICKTHROUGH_ED_TABLET.getValue() || i == Experience.ANDROID_CLICKTHROUGH_ED_HELPER_TABLET.getValue())
            {
                Events.post(new EducationEvent(com.pinterest.activity.task.education.event.EducationEvent.Type.NEXT));
                return;
            }
        }
    }

    protected void onDetachedFromWindow()
    {
        Events.unregister(_eventsSubscriber);
        super.onDetachedFromWindow();
    }

    public boolean onFilterTouchEventForSecurity(MotionEvent motionevent)
    {
        boolean flag1 = true;
        boolean flag = flag1;
        if ((motionevent.getFlags() & 1) != 0)
        {
            flag = flag1;
            if (BuyableProductHelper.isPinBuyable(_pin))
            {
                flag = flag1;
                if (BuyableProductHelper.isPointInsideView(motionevent.getRawX(), motionevent.getRawY(), _currentView))
                {
                    Toast.makeText(getContext(), 0x7f070160, 1).show();
                    motionevent.setAction(3);
                    CrashReporting.a(new IllegalStateException("Commerce gallery tap-jacking prevented."));
                    flag = false;
                }
            }
        }
        return flag;
    }

    protected boolean shouldUpdateView()
    {
        List list;
        if (_pin != null)
        {
            if ((list = _pin.getGalleryItems()).size() != _adapter.getCount())
            {
                _adapter.setDataSource(list);
                _adapter.notifyDataSetChanged();
                return true;
            }
        }
        return false;
    }

    protected void updateView()
    {
        if (_adapter.getCount() != 0)
        {
            _currentPosition = _viewPager.getCurrentItem();
            _currentView = _adapter.getViewAtPosition(_currentPosition);
            if (_currentView == null)
            {
                updateViewPagerPadding(_currentPosition);
                return;
            }
            _currentView.setGalleryItem((com.pinterest.api.model.Pin.GalleryItem)_pin.getGalleryItems().get(_currentPosition));
            if (_adapter.getCount() <= 1)
            {
                updateViewPagerPadding(_currentPosition);
                return;
            }
            _currentView.setImageMargin(HORIZONTAL_PADDING_BIG);
            if (_currentPosition == 0)
            {
                int i = _currentView.getFullHeight();
                _currentView.setItemHeight(i, false);
                PinCloseupImageView pincloseupimageview = _adapter.getViewAtPosition(_currentPosition + 1);
                if (pincloseupimageview != null)
                {
                    pincloseupimageview.setItemHeight(i, false);
                }
                _viewPager.setPadding(HORIZONTAL_PADDING_SMALL, 0, HORIZONTAL_PADDING_BIG + HORIZONTAL_PADDING_SMALL, 0);
                return;
            }
        }
    }



/*
    static PinCloseupImageView access$002(PinCloseupGalleryModule pincloseupgallerymodule, PinCloseupImageView pincloseupimageview)
    {
        pincloseupgallerymodule._currentView = pincloseupimageview;
        return pincloseupimageview;
    }

*/



/*
    static int access$102(PinCloseupGalleryModule pincloseupgallerymodule, int i)
    {
        pincloseupgallerymodule._currentPosition = i;
        return i;
    }

*/





/*
    static com.pinterest.api.model.BuyableProduct.Variant access$502(PinCloseupGalleryModule pincloseupgallerymodule, com.pinterest.api.model.BuyableProduct.Variant variant)
    {
        pincloseupgallerymodule._variant = variant;
        return variant;
    }

*/

    private class _cls7
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PinCloseupGalleryModule this$0;

        public void onEventMainThread(VariantUpdatedEvent variantupdatedevent)
        {
            com.pinterest.api.model.BuyableProduct.Variant variant = variantupdatedevent.a();
            if (variant != null && variantupdatedevent.a(_pin)) goto _L2; else goto _L1
_L1:
            _variant = null;
_L4:
            return;
_L2:
            variantupdatedevent = variant.getImages();
            if (variantupdatedevent != null && !variantupdatedevent.isEmpty())
            {
                variantupdatedevent = (com.pinterest.api.model.Pin.GalleryItem)variantupdatedevent.get(0);
                List list = _pin.getGalleryItems();
                int i = 0;
                while (i < list.size()) 
                {
                    if (((com.pinterest.api.model.Pin.GalleryItem)list.get(i)).getImageSignature().equals(variantupdatedevent.getImageSignature()))
                    {
                        _viewPager.setCurrentItem(i);
                        _variant = variant;
                        return;
                    }
                    i++;
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        _cls7()
        {
            this$0 = PinCloseupGalleryModule.this;
            super();
        }
    }


    private class _cls4
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        final PinCloseupGalleryModule this$0;
        final PinCloseupImageView val$nextView;

        public void onAnimationUpdate(ValueAnimator valueanimator)
        {
            int i = ((Integer)valueanimator.getAnimatedValue()).intValue();
            _currentView.setItemHeight(i, false);
            if (nextView != null)
            {
                nextView.setItemHeight(i, false);
            }
        }

        _cls4()
        {
            this$0 = PinCloseupGalleryModule.this;
            nextView = pincloseupimageview;
            super();
        }
    }


    private class _cls5
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        final PinCloseupGalleryModule this$0;

        public void onAnimationUpdate(ValueAnimator valueanimator)
        {
            _viewPager.setPadding(HORIZONTAL_PADDING_SMALL, 0, ((Integer)valueanimator.getAnimatedValue()).intValue(), 0);
        }

        _cls5()
        {
            this$0 = PinCloseupGalleryModule.this;
            super();
        }
    }


    private class _cls6 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final PinCloseupGalleryModule this$0;
        final PinCloseupImageView val$nextView;

        public void onAnimationEnd(Animator animator)
        {
            if (nextView != null)
            {
                nextView.darken();
            }
        }

        public void onAnimationStart(Animator animator)
        {
            if (nextView != null)
            {
                nextView.lighten();
            }
        }

        _cls6()
        {
            this$0 = PinCloseupGalleryModule.this;
            nextView = pincloseupimageview;
            super();
        }
    }


    private class _cls1 extends ViewPager
    {

        final PinCloseupGalleryModule this$0;

        protected void onMeasure(int i, int j)
        {
            if (_currentView == null)
            {
                _currentView = _adapter.getViewAtPosition(_currentPosition);
            }
            if (_currentView != null)
            {
                _currentView.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                j = android.view.View.MeasureSpec.makeMeasureSpec(_currentView.getMeasuredHeight(), 0x40000000);
            }
            super.onMeasure(i, j);
        }

        _cls1(Context context)
        {
            this$0 = PinCloseupGalleryModule.this;
            super(context);
        }
    }


    private class _cls2 extends android.support.v4.view.ViewPager.SimpleOnPageChangeListener
    {

        final PinCloseupGalleryModule this$0;

        public void onPageSelected(int i)
        {
            com.pinterest.api.model.Pin.GalleryItem galleryitem;
            boolean flag;
            if (_currentPosition == 0 || i == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            _currentView.darken();
            _currentPosition = i;
            _currentView = _adapter.getViewAtPosition(_currentPosition);
            _currentView.lighten();
            if (flag)
            {
                updateViewPagerPadding(i);
            }
            galleryitem = _currentView.getGalleryItem();
            Events.post(new GalleryUpdatedEvent(galleryitem));
            Pinalytics.a(_pinUid, i, galleryitem.getImageSignature());
        }

        _cls2()
        {
            this$0 = PinCloseupGalleryModule.this;
            super();
        }

        private class GalleryUpdatedEvent
        {

            private com.pinterest.api.model.Pin.GalleryItem _galleryItem;
            final PinCloseupGalleryModule this$0;

            public com.pinterest.api.model.Pin.GalleryItem getGallerySelectedItem()
            {
                return _galleryItem;
            }

            GalleryUpdatedEvent(com.pinterest.api.model.Pin.GalleryItem galleryitem)
            {
                this$0 = PinCloseupGalleryModule.this;
                super();
                _galleryItem = galleryitem;
            }
        }

    }


    private class _cls3
        implements android.support.v4.view.ViewPager.PageTransformer
    {

        final PinCloseupGalleryModule this$0;

        public void transformPage(View view, float f)
        {
            if (view == _currentView && _pin != null && _pin.getGalleryItems().size() >= 2 && _currentView.getGalleryItem() != null && _currentView.getGalleryItem().getLargeHeight() != null)
            {
                int i = view.getWidth();
                f -= (float)_viewPager.getPaddingLeft() / (float)i;
                PinCloseupImageView pincloseupimageview = _adapter.getViewAtPosition(_currentPosition - 1);
                PinCloseupImageView pincloseupimageview1 = _adapter.getViewAtPosition(_currentPosition + 1);
                int j = _currentView.getFullHeight();
                view = null;
                boolean flag;
                if (f > 0.0F)
                {
                    view = pincloseupimageview;
                } else
                if (f < 0.0F)
                {
                    view = pincloseupimageview1;
                }
                i = j;
                if (view != null)
                {
                    i = view.getFullHeight();
                    float f1 = Math.abs(f);
                    i = j - (int)((float)(j - i) * f1);
                }
                view = _currentView;
                if (f < 0.0F)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setItemHeight(i, flag);
                if (pincloseupimageview != null)
                {
                    pincloseupimageview.setItemHeight(i, true);
                }
                if (pincloseupimageview1 != null)
                {
                    pincloseupimageview1.setItemHeight(i, false);
                    return;
                }
            }
        }

        _cls3()
        {
            this$0 = PinCloseupGalleryModule.this;
            super();
        }
    }


    private class GalleryClickedEvent
    {

        private final Pin _galleryPin;
        private com.pinterest.api.model.BuyableProduct.Variant _galleryVariant;
        final PinCloseupGalleryModule this$0;

        public Pin getPin()
        {
            return _galleryPin;
        }

        public com.pinterest.api.model.BuyableProduct.Variant getVariant()
        {
            return _galleryVariant;
        }

        public boolean isEventForPin(Pin pin)
        {
            return pin != null && _galleryPin != null && pin.getUid().equals(_galleryPin.getUid());
        }

        GalleryClickedEvent(Pin pin, com.pinterest.api.model.BuyableProduct.Variant variant)
        {
            this$0 = PinCloseupGalleryModule.this;
            super();
            _galleryPin = pin;
            _galleryVariant = variant;
        }
    }

}
