// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import com.bricolsoftconsulting.geocoderplus.Address;

// Referenced classes of package com.thetransitapp.droid.widget:
//            RoutingSearch, SuggestionTextView

class ew
    implements com.thetransitapp.droid.service.coderTaskCallback
{

    final RoutingSearch this$0;
    private final SuggestionTextView val$textView;

    public void onAddressReceived(Address address)
    {
        RoutingSearch.this.onAddressReceived(val$textView, address);
    }

    ew()
    {
        this$0 = final_routingsearch;
        val$textView = SuggestionTextView.this;
        super();
    }
}
