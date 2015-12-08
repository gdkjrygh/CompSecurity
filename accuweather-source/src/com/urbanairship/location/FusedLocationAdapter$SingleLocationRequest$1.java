// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.location.Location;
import com.google.android.gms.location.LocationListener;

// Referenced classes of package com.urbanairship.location:
//            FusedLocationAdapter

class val.this._cls0
    implements LocationListener
{

    final tResult this$1;
    final FusedLocationAdapter val$this$0;

    public void onLocationChanged(Location location)
    {
        tResult(location);
    }

    ()
    {
        this$1 = final_;
        val$this$0 = FusedLocationAdapter.this;
        super();
    }
}
