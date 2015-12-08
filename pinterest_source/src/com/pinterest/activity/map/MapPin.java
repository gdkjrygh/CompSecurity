// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.map;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.makeramen.RoundedDrawable;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
import com.pinterest.base.Colors;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.network.image.CachableImage;
import com.pinterest.kit.network.image.ImageCache;
import com.squareup.picasso.Transformation;
import com.twotoasters.clusterkraf.ClusterPoint;

// Referenced classes of package com.pinterest.activity.map:
//            MarkerHolder, RoundedSize

public class MapPin
    implements MarkerHolder, CachableImage
{

    private static Paint blankPaint;
    private static Paint darkPaint;
    private ClusterPoint _cluster;
    private Object _imageTag;
    private Marker _marker;
    private RoundedDrawable _rounded;
    private Transformation _transformation;
    public String label;
    public LatLng latLng;
    public Pin pin;
    public String pinId;
    public String url;

    public MapPin(Pin pin1)
    {
        Place place = pin1.getPlace();
        if (place == null)
        {
            return;
        }
        pinId = pin1.getUid();
        pin = pin1;
        if (place.getLatitude() != null && place.getLongitude() != null)
        {
            latLng = new LatLng(place.getLatitude().doubleValue(), place.getLongitude().doubleValue());
        }
        url = pin1.getImageSquareUrl();
        label = pin1.getDescription();
        PLog.info((new StringBuilder("MapPin ")).append(latLng).append(" label: ").append(label).toString(), new Object[0]);
    }

    private void setImageBitmap()
    {
        if (_rounded != null && _cluster != null)
        {
            (new SetBitmapTask(new RoundedSize(pinId, _rounded, _cluster.e()))).execute();
        }
    }

    private void setMarkerIcon(BitmapDescriptor bitmapdescriptor)
    {
        try
        {
            _marker.setIcon(bitmapdescriptor);
            if (_cluster.e() == 1)
            {
                _marker.setTitle(label);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BitmapDescriptor bitmapdescriptor)
        {
            PLog.error(bitmapdescriptor, "exception occurred", new Object[0]);
        }
    }

    public boolean bitmapLoaded()
    {
        return _rounded != null;
    }

    public RoundedDrawable getBitmap()
    {
        return _rounded;
    }

    public Object getImageTag()
    {
        return _imageTag;
    }

    public Transformation getTransformation()
    {
        return _transformation;
    }

    public String getUrl()
    {
        return url;
    }

    public boolean hasMarker()
    {
        return _marker != null;
    }

    public boolean isValid()
    {
        return latLng != null;
    }

    public void loadUrl(String s)
    {
        loadUrl(s, false);
    }

    public void loadUrl(String s, boolean flag)
    {
        ImageCache.loadImage(this, s, flag);
    }

    public void onBitmapFailed(Drawable drawable)
    {
    }

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        setImageBitmap(bitmap);
    }

    public void onPrepareLoad(Drawable drawable)
    {
    }

    public void setBitmap(Bitmap bitmap, boolean flag)
    {
        setImageBitmap(bitmap);
    }

    public void setCluster(ClusterPoint clusterpoint)
    {
        _cluster = clusterpoint;
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        if (bitmap != null && hasMarker())
        {
            _rounded = RoundedDrawable.a(bitmap);
            _rounded.a(true);
            setImageBitmap();
        }
    }

    public void setImageTag(Object obj)
    {
        _imageTag = obj;
    }

    public void setMarker(Marker marker)
    {
        _marker = marker;
        if (!bitmapLoaded())
        {
            loadUrl(url);
            return;
        } else
        {
            setImageBitmap();
            return;
        }
    }

    public void setTransformation(Transformation transformation)
    {
        _transformation = transformation;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    static 
    {
        Paint paint = new Paint();
        blankPaint = paint;
        paint.setAntiAlias(true);
        blankPaint.setFilterBitmap(true);
        paint = new Paint();
        darkPaint = paint;
        paint.setColor(Colors.TEXT_DARK);
    }


    private class SetBitmapTask extends BackgroundTask
    {

        private BitmapDescriptor _descriptor;
        private RoundedSize _roundedSize;
        final MapPin this$0;

        public void onFinish()
        {
            setMarkerIcon(_descriptor);
        }

        public void run()
        {
            _descriptor = PinMarkerOptionsChooser.instance().getDescriptorFromRounded(_roundedSize.pinId, _roundedSize.rounded, _roundedSize.size);
        }

        public SetBitmapTask(RoundedSize roundedsize)
        {
            this$0 = MapPin.this;
            super();
            _roundedSize = roundedsize;
        }
    }

}
