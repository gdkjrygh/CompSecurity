// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.google.android.gms.maps.model.LatLng;
import com.pinterest.activity.pin.view.modules.util.PinMapMarker;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.kit.application.Resources;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinPlaceFragment

class this._cls0 extends FeedApiResponseHandler
{

    final PinPlaceFragment this$0;

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        if (PinPlaceFragment.access$600(PinPlaceFragment.this) != null)
        {
            com.google.android.gms.maps.GoogleMap googlemap = PinPlaceFragment.access$600(PinPlaceFragment.this).getMap();
            LatLng latlng = new LatLng(PinPlaceFragment.access$1300(PinPlaceFragment.this).getLatitude().doubleValue(), PinPlaceFragment.access$1300(PinPlaceFragment.this).getLongitude().doubleValue());
            HashMap hashmap = new HashMap();
            feed = feed.getItems().iterator();
            do
            {
                if (!feed.hasNext())
                {
                    break;
                }
                Pin pin = (Pin)feed.next();
                Place place = pin.getPlace();
                if (place != null)
                {
                    hashmap.put(place.getLatLng(), pin);
                }
            } while (true);
            hashmap.remove(latlng);
            feed = hashmap.values().iterator();
            while (feed.hasNext()) 
            {
                final Pin nearbyPin = (Pin)feed.next();
                class _cls1
                    implements com.pinterest.activity.pin.view.modules.util.PinMapMarker.PinMapMarkerListener
                {

                    final PinPlaceFragment._cls7 this$1;
                    final Pin val$nearbyPin;

                    public void onMarkerAdded(Marker marker)
                    {
                        PinPlaceFragment.access$1400(this$0).put(marker.getId(), nearbyPin);
                    }

            _cls1()
            {
                this$1 = PinPlaceFragment._cls7.this;
                nearbyPin = pin;
                super();
            }
                }

                nearbyPin = new PinMapMarker(nearbyPin, googlemap, (new com.pinterest.activity.pin.view.modules.util.MarkerOptions()).setBackgroundDrawable(0x7f0201df).setPinImageSizeMultiplier(0.9F).setRound(false).setCornerRadius(Resources.dimension(0x7f0a01a2)).setFadeIn(true).setListener(new _cls1()));
                PinPlaceFragment.access$1500(PinPlaceFragment.this).add(nearbyPin);
            }
        }
    }

    _cls1()
    {
        this$0 = PinPlaceFragment.this;
        super();
    }
}
