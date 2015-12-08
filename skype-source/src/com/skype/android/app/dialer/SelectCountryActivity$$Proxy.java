// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.widget.ListView;

// Referenced classes of package com.skype.android.app.dialer:
//            SelectCountryActivity

public class  extends com.skype.android.ity..Proxy
{

    public void clearViews()
    {
        super.ws();
        ((SelectCountryActivity)getTarget()).listView = null;
    }

    public void injectViews()
    {
        super.ews();
        ((SelectCountryActivity)getTarget()).listView = (ListView)findViewById(0x7f100504);
    }

    public (SelectCountryActivity selectcountryactivity)
    {
        super(selectcountryactivity);
    }
}
