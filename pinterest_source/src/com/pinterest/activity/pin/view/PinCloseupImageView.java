// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Constants;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.education.EducationHelper;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.kit.utils.ImageUtils;
import com.pinterest.offline.OfflineDataInfo;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.progress.SmallLoadingView;
import org.apache.commons.lang3.BooleanUtils;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseUpWebImageView

public class PinCloseupImageView extends FrameLayout
{

    private PinCloseUpWebImageView _bigPinIv;
    private View _clickVw;
    private ImageView _flashlightSearchButton;
    protected com.pinterest.api.model.Pin.GalleryItem _galleryItem;
    private float _imageMargin;
    private android.view.View.OnClickListener _onClickListener;
    private android.view.View.OnLongClickListener _onLongClickListener;
    private com.pinterest.ui.imageview.WebImageView.ImageListener _pinImageListener;
    private WebImageView _pinIv;
    private SmallLoadingView _pinPs;
    private boolean _shouldAllowLongClick;
    private boolean _shouldAnimateFlashlightButton;
    private boolean _shouldShowFlashlightButton;
    private ImageView _videoIv;
    private WebViewClient pinWebClient;

    public PinCloseupImageView(Context context)
    {
        this(context, null);
    }

    public PinCloseupImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        pinWebClient = new _cls3();
        _pinImageListener = new _cls4();
        _onLongClickListener = new _cls5();
        init();
    }

    private void addFlashlightButton()
    {
        while (!_shouldShowFlashlightButton || !Experiments.T() || EducationHelper.c() || EducationHelper.d()) 
        {
            return;
        }
        _flashlightSearchButton = new ImageView(getContext());
        _shouldShowFlashlightButton = false;
        int i = (int)Resources.dimension(0x7f0a0125);
        int j = (int)Resources.dimension(0x7f0a0131);
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(i, i, 53);
        _flashlightSearchButton.setLayoutParams(layoutparams);
        _flashlightSearchButton.setPadding(j, j, j, j);
        _flashlightSearchButton.setImageResource(0x7f0201a0);
        _flashlightSearchButton.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        _flashlightSearchButton.setId(0x7f0f0006);
        addView(_flashlightSearchButton);
        if (_shouldAnimateFlashlightButton)
        {
            Events.postSticky(new FlashlightSearchButtonDisplayedEvent(_galleryItem.getPin()));
            animateFlashlightButtonEntrance(i + Constants.MARGIN);
        }
        _flashlightSearchButton.bringToFront();
        _flashlightSearchButton.setOnClickListener(new _cls1());
    }

    private void animateFlashlightButtonEntrance(float f)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(_flashlightSearchButton, "translationX", new float[] {
            f, 0.0F
        });
        objectanimator.setDuration(Constants.ANIM_SPEED_NORMAL);
        objectanimator.setInterpolator(new OvershootInterpolator());
        objectanimator.start();
    }

    private int getScaledHeight(com.pinterest.api.model.Pin.GalleryItem galleryitem)
    {
        return (int)Device.dpToPixel((getTargetWidth() / (float)galleryitem.getLargeWidth().intValue()) * ((float)galleryitem.getLargeHeight().intValue() / Device.getDensity()));
    }

    private float getTargetWidth()
    {
        float f = Device.getScreenWidth();
        float f1 = FragmentHelper.getCloseupWidth();
        f1 = Device.getScreenWidth() - (f - f1);
        f = f1;
        if (_imageMargin != 0.0F)
        {
            f = f1 - _imageMargin * 2.0F;
        }
        return f;
    }

    private void init()
    {
        _pinIv = new WebImageView(getContext());
        _pinIv.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        _pinIv.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        _pinIv.setCornerRadius((int)Resources.dimension(0x7f0a0181));
        _pinIv.setImageListener(_pinImageListener);
        _pinIv.setBackgroundResource(0x7f02026a);
        addView(_pinIv);
        _clickVw = new View(getContext());
        _clickVw.setId(0x7f0f000f);
        _clickVw.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        _clickVw.setOnClickListener(_onClickListener);
        _clickVw.setBackgroundResource(0x7f020283);
        addView(_clickVw);
        _clickVw.setOnLongClickListener(_onLongClickListener);
        _shouldShowFlashlightButton = true;
        _shouldAnimateFlashlightButton = true;
        _shouldAllowLongClick = true;
    }

    private void removeProgressSpinner()
    {
        if (_pinPs != null)
        {
            removeView(_pinPs);
            _pinPs = null;
        }
    }

    private void showBigImage()
    {
        if (_bigPinIv == null)
        {
            _bigPinIv = new PinCloseUpWebImageView(getContext());
            _bigPinIv.setWebViewClient(pinWebClient);
            _bigPinIv.setOnLongClickListener(_onLongClickListener);
            addView(_bigPinIv);
            _pinIv.bringToFront();
            _clickVw.bringToFront();
            if (_flashlightSearchButton != null)
            {
                _flashlightSearchButton.bringToFront();
                return;
            }
        }
    }

    private void showProgressSpinner()
    {
        if (_pinIv == null || _pinPs != null)
        {
            return;
        }
        _pinPs = new SmallLoadingView(getContext());
        int i = (int)Resources.dimension(0x7f0a01ab);
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(i, i);
        layoutparams.gravity = 17;
        if ((float)_pinIv.getLayoutParams().height > Device.getScreenHeight())
        {
            layoutparams.gravity = 49;
            layoutparams.setMargins(0, (int)(Device.getScreenHeight() / 2.0F), 0, 0);
        }
        _pinPs.setLayoutParams(layoutparams);
        addView(_pinPs);
    }

    private void showVideoIcon()
    {
        if (_videoIv != null)
        {
            return;
        } else
        {
            _videoIv = new ImageView(getContext());
            _videoIv.setImageResource(0x7f020202);
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutparams.gravity = 17;
            _videoIv.setLayoutParams(layoutparams);
            addView(_videoIv);
            return;
        }
    }

    private void updatePinIvSize(com.pinterest.api.model.Pin.GalleryItem galleryitem)
    {
        if (galleryitem != null && _pinIv != null && galleryitem.getLargeWidth() != null && galleryitem.getLargeHeight() != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = _pinIv.getLayoutParams();
            if (layoutparams != null)
            {
                layoutparams.height = getScaledHeight(galleryitem);
                layoutparams.width = (int)getTargetWidth();
                _pinIv.setTranslationX(0.0F);
                _pinIv.setLayoutParams(layoutparams);
                _clickVw.setTranslationX(0.0F);
                _clickVw.setLayoutParams(new android.widget.FrameLayout.LayoutParams(_pinIv.getLayoutParams()));
                return;
            }
        }
    }

    public void darken()
    {
        if (_pinIv != null)
        {
            _pinIv.setAlpha(0.9F);
            _pinIv.setColorFilter(Resources.color(0x7f0e0076));
        }
    }

    public ImageView getFlashlightButton()
    {
        return _flashlightSearchButton;
    }

    public int getFullHeight()
    {
        return getScaledHeight(_galleryItem);
    }

    public com.pinterest.api.model.Pin.GalleryItem getGalleryItem()
    {
        return _galleryItem;
    }

    public void lighten()
    {
        if (_pinIv != null)
        {
            _pinIv.setAlpha(1.0F);
            _pinIv.setColorFilter(null);
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        setGalleryItem(_galleryItem, true);
    }

    protected void onDetachedFromWindow()
    {
        _clickVw.setOnClickListener(null);
        _clickVw.setOnLongClickListener(null);
        removeProgressSpinner();
        super.onDetachedFromWindow();
    }

    public boolean performClick()
    {
        if (_onClickListener != null)
        {
            _onClickListener.onClick(this);
            return true;
        } else
        {
            return false;
        }
    }

    public void setGalleryItem(com.pinterest.api.model.Pin.GalleryItem galleryitem)
    {
        setGalleryItem(galleryitem, false);
    }

    public void setGalleryItem(com.pinterest.api.model.Pin.GalleryItem galleryitem, final boolean isBigImage)
    {
        boolean flag;
        flag = true;
        break MISSING_BLOCK_LABEL_2;
        if (galleryitem != null && _pinIv != null && (!galleryitem.equals(_galleryItem) || isBigImage))
        {
            updatePinIvSize(galleryitem);
            _galleryItem = galleryitem;
            isBigImage = ImageUtils.isBigImage(_galleryItem.getLargeWidth(), _galleryItem.getLargeHeight());
            boolean flag1 = ImageCache.getDefault().inMemory(_galleryItem.getMediumUrl());
            boolean flag2 = ImageCache.getDefault().inMemory(_galleryItem.getLargeUrl());
            final boolean isGif = BooleanUtils.isTrue(Boolean.valueOf(_galleryItem.isGif()));
            if (isGif || BooleanUtils.isTrue(Boolean.valueOf(_galleryItem.isVideo())) || BooleanUtils.isTrue(_galleryItem.getPin().getIsPromoted()) || BooleanUtils.isTrue(Boolean.valueOf(_galleryItem.getPin().isCSR())))
            {
                _shouldShowFlashlightButton = false;
            }
            OfflineDataInfo.g();
            if (OfflineDataInfo.f())
            {
                _pinIv.loadUrl(_galleryItem.getMediumUrl(), false);
            } else
            if (!isBigImage && flag2)
            {
                _pinIv.loadUrl(_galleryItem.getLargeUrl());
            } else
            if (flag1)
            {
                _pinIv.loadUrl(_galleryItem.getMediumUrl());
                flag = false;
            } else
            {
                showProgressSpinner();
                flag = false;
            }
            if (!flag)
            {
                postDelayed(new _cls2(), 500L);
            }
            _clickVw.setLayoutParams(new android.widget.FrameLayout.LayoutParams(_pinIv.getLayoutParams()));
            if (_galleryItem.isVideo() == Boolean.TRUE.booleanValue())
            {
                showVideoIcon();
                return;
            }
        }
        return;
    }

    public void setImageAlpha(float f)
    {
        if (_pinIv != null)
        {
            _pinIv.setAlpha(f);
        }
    }

    public void setImageMargin(float f)
    {
        _imageMargin = f;
    }

    public void setItemHeight(int i, boolean flag)
    {
        if (ImageUtils.isBigImage(_galleryItem.getLargeWidth(), _galleryItem.getLargeHeight()) || _pinIv == null)
        {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutparams = _pinIv.getLayoutParams();
        layoutparams.height = i;
        float f = ((float)i / (float)_galleryItem.getLargeHeight().intValue()) * ((float)_galleryItem.getLargeWidth().intValue() / Device.getDensity());
        layoutparams.width = (int)Device.dpToPixel(f);
        if (flag)
        {
            f = getTargetWidth() - Device.dpToPixel(f);
        } else
        {
            f = 0.0F;
        }
        _pinIv.setTranslationX(f);
        _pinIv.setLayoutParams(layoutparams);
        _clickVw.setTranslationX(f);
        _clickVw.setLayoutParams(new android.widget.FrameLayout.LayoutParams(_pinIv.getLayoutParams()));
    }

    public void setOnPinClickListener(android.view.View.OnClickListener onclicklistener)
    {
        _onClickListener = onclicklistener;
        if (_clickVw != null)
        {
            _clickVw.setOnClickListener(_onClickListener);
        }
    }

    protected void setShouldAllowLongClick(boolean flag)
    {
        _shouldAllowLongClick = flag;
    }

    public void setShouldAnimateFlashlightButton(boolean flag)
    {
        _shouldAnimateFlashlightButton = flag;
    }



/*
    static WebImageView access$002(PinCloseupImageView pincloseupimageview, WebImageView webimageview)
    {
        pincloseupimageview._pinIv = webimageview;
        return webimageview;
    }

*/






    private class _cls3 extends WebViewClient
    {

        final PinCloseupImageView this$0;

        public void onLoadResource(WebView webview, String s)
        {
            removeProgressSpinner();
        }

        public void onPageFinished(WebView webview, String s)
        {
            removeProgressSpinner();
            class _cls1
                implements Runnable
            {

                final _cls3 this$1;

                public void run()
                {
                    addFlashlightButton();
                    if (_pinIv != null)
                    {
                        removeView(_pinIv);
                        _pinIv.setBitmap(null, false);
                        _pinIv = null;
                    }
                }

                _cls1()
                {
                    this$1 = _cls3.this;
                    super();
                }
            }

            if (_pinIv != null)
            {
                _pinIv.postDelayed(new _cls1(), 500L);
            }
        }

        _cls3()
        {
            this$0 = PinCloseupImageView.this;
            super();
        }
    }


    private class _cls4 extends com.pinterest.ui.imageview.WebImageView.ImageListener
    {

        final PinCloseupImageView this$0;

        public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
        {
            if (_pinIv != null)
            {
                _pinIv.setBackgroundResource(0);
            }
            addFlashlightButton();
            Events.post(new ImageLoadEvent(_galleryItem.getPin()));
        }

        _cls4()
        {
            this$0 = PinCloseupImageView.this;
            super();
        }

        private class ImageLoadEvent
        {

            private Pin _pin;

            public final Pin getPin()
            {
                return _pin;
            }

            public ImageLoadEvent(Pin pin)
            {
                _pin = pin;
            }
        }

    }


    private class _cls5
        implements android.view.View.OnLongClickListener
    {

        final PinCloseupImageView this$0;

        public boolean onLongClick(View view)
        {
            if (_shouldAllowLongClick)
            {
                Events.post(new ShowPinContextMenuEvent(_galleryItem.getPin()));
            }
            return true;
        }

        _cls5()
        {
            this$0 = PinCloseupImageView.this;
            super();
        }
    }


    private class FlashlightSearchButtonDisplayedEvent
    {

        private Pin _pin;

        public final Pin getPin()
        {
            return _pin;
        }

        public FlashlightSearchButtonDisplayedEvent(Pin pin)
        {
            _pin = pin;
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinCloseupImageView this$0;

        public void onClick(View view)
        {
            Pinalytics.a(EventType.TAP, ElementType.FLASHLIGHT_SEARCH_ICON, ComponentType.PIN_CLOSEUP_GALLERY, null);
            Events.post(new FlashlightSearchButtonEvent());
        }

        _cls1()
        {
            this$0 = PinCloseupImageView.this;
            super();
        }

        private class FlashlightSearchButtonEvent
        {

            public FlashlightSearchButtonEvent()
            {
            }
        }

    }


    private class _cls2
        implements Runnable
    {

        final PinCloseupImageView this$0;
        final boolean val$isBigImage;
        final boolean val$isGif;

        public void run()
        {
            if (_pinIv == null)
            {
                return;
            }
            if (isBigImage || isGif)
            {
                showBigImage();
                _bigPinIv.setGalleryItem(_galleryItem);
                _bigPinIv.setLayoutParams(new android.widget.FrameLayout.LayoutParams(_pinIv.getLayoutParams()));
                return;
            } else
            {
                class _cls1 extends com.pinterest.ui.imageview.WebImageView.ImageListener
                {

                    final _cls2 this$1;

                    public void onBitmapSet()
                    {
                        removeProgressSpinner();
                        if (_pinIv != null)
                        {
                            _pinIv.setBackgroundResource(0);
                        }
                        addFlashlightButton();
                    }

                _cls1()
                {
                    this$1 = _cls2.this;
                    super();
                }
                }

                _pinIv.setImageListener(new _cls1());
                _pinIv.loadUrl(_galleryItem.getLargeUrl(), false);
                return;
            }
        }

        _cls2()
        {
            this$0 = PinCloseupImageView.this;
            isBigImage = flag;
            isGif = flag1;
            super();
        }
    }

}
