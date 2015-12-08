// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import com.aetn.history.android.historyhere.utils.Utils;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

class this._cls0
    implements com.google.android.gms.maps.meraChangeListener
{

    final MapFragment this$0;

    public void onCameraChange(CameraPosition cameraposition)
    {
        Utils.logger(MapFragment.access$000(MapFragment.this), "onCameraChange()");
    }

    ()
    {
        this$0 = MapFragment.this;
        super();
    }
}
