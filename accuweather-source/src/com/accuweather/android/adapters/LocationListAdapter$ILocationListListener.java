// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import com.accuweather.android.models.location.LocationModel;

// Referenced classes of package com.accuweather.android.adapters:
//            LocationListAdapter

public static interface 
{

    public abstract void onLocationLongPressed(LocationModel locationmodel);

    public abstract void onLocationSelected(LocationModel locationmodel, int i);
}
