// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import android.view.ViewGroup;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.skype.android.app.location:
//            ReceivedLocationActivity

final class this._cls0
    implements com.google.android.gms.maps.._cls6
{

    final ReceivedLocationActivity this$0;

    public final void onMapClick(LatLng latlng)
    {
        ReceivedLocationActivity.access$700(ReceivedLocationActivity.this).setVisibility(8);
    }

    ()
    {
        this$0 = ReceivedLocationActivity.this;
        super();
    }
}
