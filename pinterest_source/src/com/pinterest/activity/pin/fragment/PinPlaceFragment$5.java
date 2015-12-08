// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.graphics.Point;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ViewType;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinPlaceFragment

class this._cls0
    implements com.pinterest.base.iber
{

    final PinPlaceFragment this$0;

    public void onEventMainThread(com.pinterest.kit.view.te te)
    {
        GoogleMap googlemap;
label0:
        {
            if (PinPlaceFragment.access$000(PinPlaceFragment.this) != te)
            {
                PinPlaceFragment.access$002(PinPlaceFragment.this, te);
                googlemap = PinPlaceFragment.access$600(PinPlaceFragment.this).getMap();
                if (PinPlaceFragment.access$700(PinPlaceFragment.this) == null)
                {
                    PinPlaceFragment.access$702(PinPlaceFragment.this, new Point((int)(Device.getScreenWidth() / 2.0F), (int)((float)PinPlaceFragment.access$800(PinPlaceFragment.this).getHeight() + Resources.dimension(0x7f0a019f) / 2.0F)));
                }
                if (te != com.pinterest.kit.view.te.a)
                {
                    break label0;
                }
                Pinalytics.a(ViewType.PLACE, ComponentType.PLACE_VIEW_MAP, null);
                googlemap.animateCamera(CameraUpdateFactory.zoomBy(2.0F, PinPlaceFragment.access$700(PinPlaceFragment.this)));
            }
            return;
        }
        Pinalytics.b(ViewType.PLACE, ComponentType.PLACE_VIEW_MAP, null);
        googlemap.animateCamera(CameraUpdateFactory.zoomBy(-2F, PinPlaceFragment.access$700(PinPlaceFragment.this)));
        PinPlaceFragment.access$900(PinPlaceFragment.this);
    }

    nPlaceMapFragment()
    {
        this$0 = PinPlaceFragment.this;
        super();
    }
}
