// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.accuweather.android:
//            LoadingScreenActivity

class this._cls0
    implements com.accuweather.android.services.ILocationConverterListener
{

    final LoadingScreenActivity this$0;

    public void onConversionCompleted(List list)
    {
        getData().registerWeatherDataListener(LoadingScreenActivity.this);
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LocationModel locationmodel = (LocationModel)iterator.next();
            if (locationmodel.isHome())
            {
                getData().setHomeLocation(locationmodel.getLocKey());
            }
        } while (true);
        getData().setLocations((ArrayList)list);
        LoadingScreenActivity.access$000(LoadingScreenActivity.this, true);
        LoadingScreenActivity.access$100(LoadingScreenActivity.this);
    }

    public void onConversionError(Exception exception)
    {
        getData().registerWeatherDataListener(LoadingScreenActivity.this);
        Logger.i(this, (new StringBuilder()).append("Conversion exception ").append(exception.getLocalizedMessage()).toString());
    }

    Model()
    {
        this$0 = LoadingScreenActivity.this;
        super();
    }
}
