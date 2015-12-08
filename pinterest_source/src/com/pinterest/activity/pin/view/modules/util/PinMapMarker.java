// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules.util;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.makeramen.RoundedDrawable;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.network.image.CachableImage;
import com.pinterest.kit.network.image.ImageCache;
import com.squareup.picasso.Transformation;
import java.lang.ref.WeakReference;

public class PinMapMarker
    implements CachableImage
{

    public static final int BRING_TO_FRONT_DELAY_MS = 500;
    private WeakReference _map;
    Marker _marker;
    private int _markerHeight;
    PinMapMarkerOptions _options;
    private Pin _pin;

    public PinMapMarker(Pin pin, GoogleMap googlemap)
    {
        this(pin, googlemap, new PinMapMarkerOptions());
    }

    public PinMapMarker(Pin pin, GoogleMap googlemap, PinMapMarkerOptions pinmapmarkeroptions)
    {
        if (pin == null || pin.getPlace() == null)
        {
            return;
        } else
        {
            _pin = pin;
            _map = new WeakReference(googlemap);
            _options = pinmapmarkeroptions;
            ImageCache.loadImage(this, pin.getImageSquareUrl());
            return;
        }
    }

    public void bringToFront()
    {
        if (_marker != null)
        {
            _marker.showInfoWindow();
        }
    }

    public Object getImageTag()
    {
        return null;
    }

    public Marker getMarker()
    {
        return _marker;
    }

    public int getMarkerHeight()
    {
        return _markerHeight;
    }

    public PinMapMarkerOptions getOptions()
    {
        return _options;
    }

    public Transformation getTransformation()
    {
        return null;
    }

    public String getUrl()
    {
        return null;
    }

    public void onBitmapFailed(Drawable drawable)
    {
    }

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        Bitmap bitmap1 = Resources.bitmap(_options.backgroundDrawable);
        loadedfrom = Bitmap.createBitmap(bitmap1.getWidth(), bitmap1.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(loadedfrom);
        _markerHeight = bitmap1.getHeight();
        int i = (int)((float)bitmap1.getWidth() * _options.pinImageSizeMultiplier);
        int j = (int)((float)bitmap1.getWidth() / 2.0F - (float)i / 2.0F);
        bitmap = RoundedDrawable.a(bitmap);
        Rect rect;
        if (_options.round)
        {
            bitmap.a(true);
        } else
        {
            bitmap.a(_options.cornerRadius);
        }
        rect = new Rect(j, j, j + i, i + j);
        canvas.save();
        bitmap.setBounds(rect);
        bitmap.draw(canvas);
        canvas.restore();
        canvas.drawBitmap(bitmap1, 0.0F, 0.0F, null);
        if (_map.get() != null)
        {
            bitmap = _pin.getPlace();
            _marker = ((GoogleMap)_map.get()).addMarker((new MarkerOptions()).position(bitmap.getLatLng()).icon(BitmapDescriptorFactory.fromBitmap(loadedfrom)));
            if (_options.fadeIn)
            {
                bitmap = ValueAnimator.ofFloat(new float[] {
                    0.0F, 1.0F
                });
                bitmap.setDuration((int)(Math.random() * 600D));
                bitmap.addUpdateListener(new _cls1());
                bitmap.start();
            }
            if (_options.listener != null)
            {
                _options.listener.onMarkerAdded(_marker);
            }
        }
    }

    public void onPrepareLoad(Drawable drawable)
    {
    }

    public void remove()
    {
        if (_marker != null)
        {
            _marker.remove();
        }
    }

    public void setBitmap(Bitmap bitmap, boolean flag)
    {
    }

    public void setImageTag(Object obj)
    {
    }

    public void setTransformation(Transformation transformation)
    {
    }

    public void setUrl(String s)
    {
    }

    private class PinMapMarkerOptions
    {

        public int backgroundDrawable;
        public float cornerRadius;
        public boolean fadeIn;
        public PinMapMarkerListener listener;
        public float pinImageSizeMultiplier;
        public boolean round;

        public PinMapMarkerOptions setBackgroundDrawable(int i)
        {
            backgroundDrawable = i;
            return this;
        }

        public PinMapMarkerOptions setCornerRadius(float f)
        {
            cornerRadius = f;
            return this;
        }

        public PinMapMarkerOptions setFadeIn(boolean flag)
        {
            fadeIn = flag;
            return this;
        }

        public PinMapMarkerOptions setListener(PinMapMarkerListener pinmapmarkerlistener)
        {
            listener = pinmapmarkerlistener;
            return this;
        }

        public PinMapMarkerOptions setPinImageSizeMultiplier(float f)
        {
            pinImageSizeMultiplier = f;
            return this;
        }

        public PinMapMarkerOptions setRound(boolean flag)
        {
            round = flag;
            return this;
        }

        public PinMapMarkerOptions()
        {
            backgroundDrawable = 0x7f0201db;
            pinImageSizeMultiplier = 0.75F;
            round = true;
            fadeIn = false;
        }
    }


    private class _cls1
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        final PinMapMarker this$0;

        public void onAnimationUpdate(ValueAnimator valueanimator)
        {
            _marker.setAlpha(((Float)valueanimator.getAnimatedValue()).floatValue());
        }

        _cls1()
        {
            this$0 = PinMapMarker.this;
            super();
        }
    }


    private class PinMapMarkerListener
    {

        public abstract void onMarkerAdded(Marker marker);
    }

}
