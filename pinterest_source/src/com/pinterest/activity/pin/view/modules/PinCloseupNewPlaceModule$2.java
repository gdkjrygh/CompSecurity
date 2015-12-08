// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.animation.ValueAnimator;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.fragment.MapFragment;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupNewPlaceModule

class this._cls0 extends FeedApiResponseHandler
{

    final PinCloseupNewPlaceModule this$0;

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        if (PinCloseupNewPlaceModule.access$100(PinCloseupNewPlaceModule.this) != null)
        {
            GoogleMap googlemap = PinCloseupNewPlaceModule.access$100(PinCloseupNewPlaceModule.this).getMap();
            LatLng latlng = new LatLng(_pinPlace.getLatitude().doubleValue(), _pinPlace.getLongitude().doubleValue());
            HashSet hashset = new HashSet();
            feed = feed.getItems().iterator();
            do
            {
                if (!feed.hasNext())
                {
                    break;
                }
                Place place = ((Pin)feed.next()).getPlace();
                if (place != null)
                {
                    hashset.add(new LatLng(place.getLatitude().doubleValue(), place.getLongitude().doubleValue()));
                }
            } while (true);
            hashset.remove(latlng);
            feed = hashset.iterator();
            while (feed.hasNext()) 
            {
                final Marker marker = (LatLng)feed.next();
                marker = googlemap.addMarker((new MarkerOptions()).position(marker).icon(BitmapDescriptorFactory.fromResource(0x7f0201de)));
                ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
                    0.0F, 1.0F
                });
                valueanimator.setDuration((int)(Math.random() * 600D));
                class _cls1
                    implements android.animation.ValueAnimator.AnimatorUpdateListener
                {

                    final PinCloseupNewPlaceModule._cls2 this$1;
                    final Marker val$marker;

                    public void onAnimationUpdate(ValueAnimator valueanimator1)
                    {
                        marker.setAlpha(((Float)valueanimator1.getAnimatedValue()).floatValue());
                    }

            _cls1()
            {
                this$1 = PinCloseupNewPlaceModule._cls2.this;
                marker = marker1;
                super();
            }
                }

                valueanimator.addUpdateListener(new _cls1());
                valueanimator.start();
            }
        }
    }

    _cls1()
    {
        this$0 = PinCloseupNewPlaceModule.this;
        super();
    }
}
