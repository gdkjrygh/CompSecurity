// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.util.k;

// Referenced classes of package com.jcp.adapters:
//            UPSTrackAdapter

class _cls9
{

    protected LinearLayout additionalInfoLayout;
    protected ImageView chevronImageView;
    protected LinearLayout chevronLayout;
    protected TextView contactNumber;
    protected TextView deliveredDateAndTime;
    protected TextView deliveredLocation;
    protected TextView shippingService;
    protected TextView shippingStatus;
    protected TextView type;
    protected TextView weight;

    void onPhoneClick()
    {
        k.a(contactNumber.getText().toString(), UPSTrackAdapter.a());
    }

    public _cls9(View view)
    {
        ButterKnife.inject(this, view);
    }
}
