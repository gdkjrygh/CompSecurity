// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import com.accuweather.android.models.location.LocationSearch;
import java.util.List;

// Referenced classes of package com.accuweather.android.utilities:
//            Data

public static interface A
{

    public abstract void onError(Exception exception);

    public abstract void onGpsSearchCompleted(LocationSearch locationsearch, List list);

    public abstract void onHomeLocationChanged();

    public abstract void onLocationSearchCompleted(LocationSearch locationsearch, List list);

    public abstract void onWeatherCallCompleted(List list, List list1);
}
