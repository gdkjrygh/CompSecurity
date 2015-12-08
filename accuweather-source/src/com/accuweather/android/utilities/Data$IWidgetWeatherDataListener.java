// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import com.accuweather.android.models.location.LocationSearch;
import java.util.List;

// Referenced classes of package com.accuweather.android.utilities:
//            Data

public static interface 
    extends 
{

    public abstract void onWidgetLocationSearchCompleted(LocationSearch locationsearch);

    public abstract void onWidgetWeatherCallCompleted(List list);
}
