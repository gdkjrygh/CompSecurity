// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.googlemap;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.SphericalUtils;
import me.lyft.android.infrastructure.instabug.InstabugSupport;
import me.lyft.android.map.core.IMap;
import me.lyft.android.map.core.IMapView;
import me.lyft.android.map.core.NullMap;
import me.lyft.android.map.core.camera.IMapPosition;
import me.lyft.android.map.core.camera.MapBound;
import me.lyft.android.map.core.projection.IProjection;
import me.lyft.android.map.googlemap.projection.GoogleMapProjection;
import me.lyft.android.rx.Binder;
import me.lyft.android.utils.MetricsUtils;
import me.lyft.android.utils.ViewExtensions;
import rx.Observable;
import rx.Scheduler;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.subjects.BehaviorSubject;
import rx.subjects.PublishSubject;
import rx.subscriptions.Subscriptions;

// Referenced classes of package me.lyft.android.map.googlemap:
//            GooglePlayMap

public class GoogleMapView extends MapView
    implements IMapView
{

    public static final int MAP_DRAG_ANIMATION_DELAY = 250;
    private static final double MIN_DISTANCE_CHANGE = 5D;
    private static final float MIN_MOVE_DELTA = 7F;
    public static final double MIN_PIXEL_CHANGE = 25D;
    Binder binder;
    private final PublishSubject cameraPositionChanged = PublishSubject.create();
    private boolean centerMapGestures;
    private float firstMoveX;
    private float firstMoveY;
    private final BehaviorSubject googleMapSubject = BehaviorSubject.create();
    private boolean isMapDragging;
    private final PublishSubject isMapDraggingSubject = PublishSubject.create();
    private Long lastActionUpTime;
    private IMap map;
    private final PublishSubject mapDragEndSubject = PublishSubject.create();
    private final PublishSubject mapDragStartedSubject = PublishSubject.create();
    private MetricsUtils metricsUtils;
    Subscription moveEndSubscription;
    private boolean multiTouch;
    private Location prevCenter;

    public GoogleMapView(Context context)
    {
        super(context);
        lastActionUpTime = null;
        moveEndSubscription = Subscriptions.empty();
        map = NullMap.getInstance();
    }

    private MotionEvent centerMotionEvent(MotionEvent motionevent)
    {
        float f = 0.0F;
        int i = 0;
        float f1 = 0.0F;
        for (; i < motionevent.getPointerCount(); i++)
        {
            f1 += motionevent.getX(i);
            f += motionevent.getY(i);
        }

        f1 /= motionevent.getPointerCount();
        f /= motionevent.getPointerCount();
        motionevent.offsetLocation((float)getWidth() / 2.0F - f1, (float)getHeight() / 2.0F - f);
        return motionevent;
    }

    private void interceptMapTouch(MotionEvent motionevent)
    {
        float f;
        float f1;
        f = metricsUtils.pixelsToDp(motionevent.getX());
        f1 = metricsUtils.pixelsToDp(motionevent.getY());
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 60
    //                   0 61
    //                   1 162
    //                   2 92
    //                   3 162;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        return;
_L2:
        firstMoveX = f;
        firstMoveY = f1;
        prevCenter = map.getMapPosition().getLocation();
        return;
_L4:
        if (Math.abs(firstMoveX - f) > 7F || Math.abs(firstMoveY - f1) > 7F)
        {
            if (!isMapDragging)
            {
                moveEndSubscription.unsubscribe();
            }
            mapDragStartedSubject.onNext(Unit.create());
            isMapDraggingSubject.onNext(Boolean.valueOf(true));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        isMapDraggingSubject.onNext(Boolean.valueOf(false));
        motionevent = map.getMapPosition().getLocation();
        Object obj = map.getProjection();
        android.graphics.Point point = ((IProjection) (obj)).toScreenLocation(motionevent);
        obj = ((IProjection) (obj)).toScreenLocation(prevCenter);
        double d = SphericalUtils.computeDistanceBetween(motionevent, prevCenter);
        if (GoogleMapProjection.distanceBetween(point, ((android.graphics.Point) (obj))) > 25D || d > 5D)
        {
            prevCenter = motionevent;
            queueMapMoveEnded();
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void queueMapMoveEnded()
    {
        moveEndSubscription.unsubscribe();
        final rx.Scheduler.Worker worker = AndroidSchedulers.mainThread().createWorker();
        moveEndSubscription = worker;
        worker.schedule(new Action0() {

            final GoogleMapView this$0;
            final rx.Scheduler.Worker val$worker;

            public void call()
            {
                if (!worker.isUnsubscribed())
                {
                    mapDragEndSubject.onNext(Unit.create());
                }
            }

            
            {
                this$0 = GoogleMapView.this;
                worker = worker1;
                super();
            }
        }, 250L, TimeUnit.MILLISECONDS);
    }

    private boolean resolveDispactTouchEvent(MotionEvent motionevent)
    {
        boolean flag = true;
        if (motionevent.getPointerCount() > 1)
        {
            multiTouch = true;
            flag = super.dispatchTouchEvent(centerMotionEvent(motionevent));
        } else
        {
            if (motionevent.getAction() == 1)
            {
                multiTouch = false;
                Long long1 = lastActionUpTime;
                lastActionUpTime = Long.valueOf(System.currentTimeMillis());
                if (long1 != null && lastActionUpTime.longValue() - long1.longValue() < (long)ViewConfiguration.getDoubleTapTimeout())
                {
                    return super.dispatchTouchEvent(centerMotionEvent(motionevent));
                } else
                {
                    return super.dispatchTouchEvent(motionevent);
                }
            }
            if (!multiTouch)
            {
                return super.dispatchTouchEvent(motionevent);
            }
        }
        return flag;
    }

    public Observable animateToBounds(final List locations, final int padding)
    {
        return ViewExtensions.onLoadedObservable(this).map(new Func1() {

            final GoogleMapView this$0;
            final List val$locations;
            final int val$padding;

            public volatile Object call(Object obj)
            {
                return call((Unit)obj);
            }

            public MapBound call(Unit unit)
            {
                return new MapBound(locations, getMeasuredWidth(), getMeasuredHeight(), padding);
            }

            
            {
                this$0 = GoogleMapView.this;
                locations = list;
                padding = i;
                super();
            }
        });
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        if (!centerMapGestures)
        {
            flag = super.dispatchTouchEvent(motionevent);
        } else
        {
            flag = resolveDispactTouchEvent(motionevent);
        }
        interceptMapTouch(motionevent);
        return flag;
    }

    public Observable observeCameraPositionChanged()
    {
        return cameraPositionChanged.asObservable();
    }

    public Observable observeGoogleMapLoaded()
    {
        return googleMapSubject.asObservable().first();
    }

    public Observable observeMapDragEnd()
    {
        return mapDragEndSubject.asObservable();
    }

    public Observable observeMapDragStart()
    {
        return mapDragStartedSubject.asObservable();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        metricsUtils = MetricsUtils.fromView(this);
        MapsInitializer.a(getContext());
        binder = Binder.attach(this);
        binder.bind(isMapDraggingSubject, new Action1() {

            final GoogleMapView this$0;

            public void call(Boolean boolean1)
            {
                isMapDragging = boolean1.booleanValue();
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = GoogleMapView.this;
                super();
            }
        });
        getMapAsync(new OnMapReadyCallback() {

            final GoogleMapView this$0;

            public void onMapReady(GoogleMap googlemap)
            {
                InstabugSupport.addMap(GoogleMapView.this, googlemap);
                googlemap = new GooglePlayMap(googlemap);
                map = googlemap;
                map.setOnCameraChangeListener(new Action1() {

                    final _cls2 this$1;

                    public volatile void call(Object obj)
                    {
                        call((Unit)obj);
                    }

                    public void call(Unit unit)
                    {
                        cameraPositionChanged.onNext(Unit.create());
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                });
                googleMapSubject.onNext(googlemap);
            }

            
            {
                this$0 = GoogleMapView.this;
                super();
            }
        });
    }

    public void setCenterMapGestures(boolean flag)
    {
        centerMapGestures = flag;
    }


/*
    static boolean access$002(GoogleMapView googlemapview, boolean flag)
    {
        googlemapview.isMapDragging = flag;
        return flag;
    }

*/



/*
    static IMap access$102(GoogleMapView googlemapview, IMap imap)
    {
        googlemapview.map = imap;
        return imap;
    }

*/



}
