// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import com.google.android.gms.maps.model.MarkerOptions;
import com.thetransitapp.droid.service.ServiceCallback;

// Referenced classes of package com.thetransitapp.droid.widget:
//            RoutingSearch, SuggestionTextView

class 
    implements ServiceCallback
{

    final RoutingSearch this$0;
    private final MarkerOptions val$options;
    private final SuggestionTextView val$textView;

    public void onError(String s, Exception exception)
    {
    }

    public volatile void onResult(Object obj)
    {
        onResult((String)obj);
    }

    public void onResult(String s)
    {
        if (s != null && val$textView != null)
        {
            val$textView.setText(s, false);
            val$textView.dismissDropDown();
            val$options.snippet(s);
            boolean flag = RoutingSearch.access$0(RoutingSearch.this);
            if (flag)
            {
                hideKeyboard();
                RoutingSearch.access$1(RoutingSearch.this).routeButtonStatusChange(flag, false, true);
            }
        }
    }

    ()
    {
        this$0 = final_routingsearch;
        val$textView = suggestiontextview;
        val$options = MarkerOptions.this;
        super();
    }
}
