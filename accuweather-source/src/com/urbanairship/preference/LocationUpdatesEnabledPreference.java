// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.urbanairship.preference:
//            UACheckBoxPreference

public class LocationUpdatesEnabledPreference extends UACheckBoxPreference
{

    public LocationUpdatesEnabledPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public UAPreference.PreferenceType getPreferenceType()
    {
        return UAPreference.PreferenceType.LOCATION_UPDATES_ENABLED;
    }

    public volatile View onCreateView(ViewGroup viewgroup)
    {
        return super.onCreateView(viewgroup);
    }

    public volatile void setValue(Object obj)
    {
        super.setValue(obj);
    }
}
