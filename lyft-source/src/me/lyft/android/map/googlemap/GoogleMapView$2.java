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

class this._cls0
    implements OnMapReadyCallback
{

    final GoogleMapView this$0;

    public void onMapReady(GoogleMap googlemap)
    {
        InstabugSupport.addMap(GoogleMapView.this, googlemap);
        googlemap = new GooglePlayMap(googlemap);
        GoogleMapView.access$102(GoogleMapView.this, googlemap);
        GoogleMapView.access$100(GoogleMapView.this).setOnCameraChangeListener(new Action1() {

            final GoogleMapView._cls2 this$1;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                GoogleMapView.access$200(this$0).onNext(Unit.create());
            }

            
            {
                this$1 = GoogleMapView._cls2.this;
                super();
            }
        });
        GoogleMapView.access$300(GoogleMapView.this).onNext(googlemap);
    }

    _cls1.this._cls1()
    {
        this$0 = GoogleMapView.this;
        super();
    }
}
