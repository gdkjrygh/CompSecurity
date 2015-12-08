// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import com.google.android.gms.location.LocationClient;

// Referenced classes of package com.thetransitapp.droid:
//            TransitActivity

class this._cls0
    implements com.thetransitapp.droid.widget.uttonClickListener
{

    final TransitActivity this$0;

    public void onErrorButtonClick()
    {
        hideError();
        if (TransitActivity.access$0(TransitActivity.this) != null)
        {
            if (!TransitActivity.access$0(TransitActivity.this).isConnected() && !TransitActivity.access$0(TransitActivity.this).isConnecting())
            {
                TransitActivity.access$0(TransitActivity.this).connect();
            } else
            if (getLastLocation() == null)
            {
                showLocationServiceError();
                return;
            }
        }
    }

    ient()
    {
        this$0 = TransitActivity.this;
        super();
    }
}
