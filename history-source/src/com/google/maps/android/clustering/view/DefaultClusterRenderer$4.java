// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.clustering.view;

import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.clustering.Cluster;
import java.util.Map;

// Referenced classes of package com.google.maps.android.clustering.view:
//            DefaultClusterRenderer

class this._cls0
    implements com.google.android.gms.maps.ckListener
{

    final DefaultClusterRenderer this$0;

    public void onInfoWindowClick(Marker marker)
    {
        if (DefaultClusterRenderer.access$700(DefaultClusterRenderer.this) != null)
        {
            DefaultClusterRenderer.access$700(DefaultClusterRenderer.this).onClusterInfoWindowClick((Cluster)DefaultClusterRenderer.access$600(DefaultClusterRenderer.this).get(marker));
        }
    }

    ndowClickListener()
    {
        this$0 = DefaultClusterRenderer.this;
        super();
    }
}
