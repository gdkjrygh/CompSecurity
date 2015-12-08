// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.koushikdutta.urlimageviewhelper.UrlImageViewCallback;
import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;
import com.thetransitapp.droid.model.RouteImage;
import com.thetransitapp.droid.model.RoutingLeg;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.model.viewmodel.RouteViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.util:
//            PolylineUtility, BitmapUtility

public final class ShieldUtility
{

    private Context context;
    private GoogleMap map;
    private List shieldsMarkers;

    public ShieldUtility(GoogleMap googlemap, Context context1)
    {
        map = googlemap;
        context = context1;
        shieldsMarkers = new ArrayList();
    }

    private List calculateShieldsPositions(List list, double d)
    {
        double d1;
        Object obj;
        Iterator iterator;
        d1 = 0.0D;
        obj = null;
        iterator = list.iterator();
_L4:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        double d3;
        double d4;
        Object obj1;
        int i;
        int k;
        i = (int)Math.max(d1 / 50000D / d, 1.0D);
        d4 = d1 / (double)(i + 1);
        k = Math.min(i, 50);
        obj1 = new ArrayList(k);
        d3 = 0.0D;
        d = d4;
        i = 0;
        obj = null;
        iterator = list.iterator();
        list = ((List) (obj));
_L7:
        double d2;
        int j;
        if (!iterator.hasNext())
        {
            return ((List) (obj1));
        }
        obj = new SimplePlacemark((LatLng)iterator.next());
        d1 = d3;
        j = i;
        d2 = d;
          goto _L3
_L2:
        obj1 = new SimplePlacemark((LatLng)iterator.next());
        d2 = d1;
        if (obj != null)
        {
            d2 = d1 + (double)((SimplePlacemark) (obj1)).distanceTo(((SimplePlacemark) (obj)));
        }
        obj = obj1;
        d1 = d2;
          goto _L4
_L3:
        if (list == null) goto _L6; else goto _L5
_L5:
        double d5;
        d5 = ((SimplePlacemark) (obj)).distanceTo(list);
        d3 += d5;
_L8:
        d1 = d3;
        j = i;
        d2 = d;
        if (d < d3)
        {
            if (i < k)
            {
                break MISSING_BLOCK_LABEL_260;
            }
            d2 = d;
            j = i;
            d1 = d3;
        }
_L6:
        list = ((List) (obj));
        d3 = d1;
        i = j;
        d = d2;
          goto _L7
        ((List) (obj1)).add(interpolateLocation(list, ((SimplePlacemark) (obj)), d5 - (d3 - d)));
        d += d4;
        i++;
          goto _L8
    }

    public static LatLng interpolateLocation(SimplePlacemark simpleplacemark, SimplePlacemark simpleplacemark1, double d)
    {
        return interpolateLocationRatio(simpleplacemark, simpleplacemark1, (float)(d / (double)simpleplacemark.distanceTo(simpleplacemark1)));
    }

    public static LatLng interpolateLocationRatio(SimplePlacemark simpleplacemark, SimplePlacemark simpleplacemark1, double d)
    {
        float f = (float)((simpleplacemark.getLatitude() - simpleplacemark1.getLatitude()) * -1D);
        float f1 = (float)((simpleplacemark.getLongitude() - simpleplacemark1.getLongitude()) * -1D);
        return new LatLng(simpleplacemark.getLatitude() + (double)f * d, simpleplacemark.getLongitude() + (double)f1 * d);
    }

    private void showShields(List list, BitmapDescriptor bitmapdescriptor)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                return;
            }
            Object obj = (LatLng)list.next();
            obj = map.addMarker((new MarkerOptions()).position(((LatLng) (obj))).icon(bitmapdescriptor).anchor(0.5F, 0.5F));
            ((Marker) (obj)).showInfoWindow();
            shieldsMarkers.add(obj);
        } while (true);
    }

    public void clear()
    {
        Iterator iterator = shieldsMarkers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                shieldsMarkers.clear();
                return;
            }
            ((Marker)iterator.next()).remove();
        } while (true);
    }

    public void draw(final RoutingLeg leg)
    {
        final List positions;
label0:
        {
            if (leg.getLegType() == com.thetransitapp.droid.model.RoutingLeg.LegType.TRANSIT)
            {
                positions = map.getProjection().getVisibleRegion().latLngBounds;
                double d = ((LatLngBounds) (positions)).northeast.latitude;
                double d1 = ((LatLngBounds) (positions)).southwest.latitude;
                positions = leg.getShape();
                if (positions != null)
                {
                    positions = calculateShieldsPositions(PolylineUtility.decodePoly(positions), d - d1);
                    if (leg.getRoute().getRouteImage() == null || !leg.getRoute().getRouteImage().isReplaceName())
                    {
                        break label0;
                    }
                    Object obj = context.getResources().getDisplayMetrics();
                    obj = leg.getRoute().getRouteImage().getUrlWithScreenMetrics(((android.util.DisplayMetrics) (obj)), true);
                    UrlImageViewHelper.loadUrlDrawable(context, ((String) (obj)), new UrlImageViewCallback() {

                        final ShieldUtility this$0;
                        private final RoutingLeg val$leg;
                        private final List val$positions;

                        public void onLoaded(ImageView imageview, Bitmap bitmap, String s, boolean flag)
                        {
                            if (bitmap != null)
                            {
                                imageview = BitmapDescriptorFactory.fromBitmap(BitmapUtility.getShield(bitmap, leg.getRoute(), context.getResources().getDimensionPixelSize(0x7f08001e), context));
                                showShields(positions, imageview);
                            }
                        }

            
            {
                this$0 = ShieldUtility.this;
                leg = routingleg;
                positions = list;
                super();
            }
                    });
                }
            }
            return;
        }
        showShields(positions, BitmapDescriptorFactory.fromBitmap(BitmapUtility.getShield(leg.getRoute().getShortName(), leg.getRoute(), context.getResources().getDimensionPixelSize(0x7f08001e), context)));
    }


}
