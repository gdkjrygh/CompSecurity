// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.googlemap;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.instabug.InstabugSupport;
import me.lyft.android.map.core.IMap;
import rx.functions.Action1;
import rx.subjects.BehaviorSubject;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.map.googlemap:
//            GoogleMapView, GooglePlayMap

class this._cls1
    implements Action1
{

    final is._cls0 this$1;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        GoogleMapView.access$200(_fld0).onNext(Unit.create());
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/map/googlemap/GoogleMapView$2

/* anonymous class */
    class GoogleMapView._cls2
        implements OnMapReadyCallback
    {

        final GoogleMapView this$0;

        public void onMapReady(GoogleMap googlemap)
        {
            InstabugSupport.addMap(GoogleMapView.this, googlemap);
            googlemap = new GooglePlayMap(googlemap);
            GoogleMapView.access$102(GoogleMapView.this, googlemap);
            GoogleMapView.access$100(GoogleMapView.this).setOnCameraChangeListener(new GoogleMapView._cls2._cls1());
            GoogleMapView.access$300(GoogleMapView.this).onNext(googlemap);
        }

            
            {
                this$0 = GoogleMapView.this;
                super();
            }
    }

}
