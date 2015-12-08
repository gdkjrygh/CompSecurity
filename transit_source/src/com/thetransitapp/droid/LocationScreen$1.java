// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import com.actionbarsherlock.widget.SearchView;
import com.thetransitapp.droid.service.ServiceCallback;

// Referenced classes of package com.thetransitapp.droid:
//            LocationScreen

class this._cls0
    implements ServiceCallback
{

    final LocationScreen this$0;

    public void onError(String s, Exception exception)
    {
    }

    public volatile void onResult(Object obj)
    {
        onResult((String)obj);
    }

    public void onResult(String s)
    {
        if (s != null)
        {
            LocationScreen.access$0(LocationScreen.this).setQuery(s, true);
        }
    }

    llback()
    {
        this$0 = LocationScreen.this;
        super();
    }
}
