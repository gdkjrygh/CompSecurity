// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BoardMapFragment

class val.bounds
    implements com.google.android.gms.maps.hangeListener
{

    final BoardMapFragment this$0;
    final LatLngBounds val$bounds;

    public void onCameraChange(CameraPosition cameraposition)
    {
        BoardMapFragment.access$300(BoardMapFragment.this).setOnCameraChangeListener(null);
        BoardMapFragment.access$400(BoardMapFragment.this, val$bounds);
    }

    ner()
    {
        this$0 = final_boardmapfragment;
        val$bounds = LatLngBounds.this;
        super();
    }
}
