// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.manager;

import android.content.Context;
import java.util.List;
import org.androidannotations.api.a;

// Referenced classes of package com.dominos.beacon.manager:
//            GeofenceManager

public final class GeofenceManager_ extends GeofenceManager
{

    private Context context_;

    private GeofenceManager_(Context context)
    {
        context_ = context;
        init_();
    }

    public static GeofenceManager_ getInstance_(Context context)
    {
        return new GeofenceManager_(context);
    }

    private void init_()
    {
        mContext = context_;
        setup();
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }

    public final void setupGeofences(List list, GeofenceManager.GeofenceCallback geofencecallback)
    {
        a.a(new _cls1("", list, geofencecallback));
    }


    private class _cls1 extends c
    {

        final GeofenceManager_ this$0;
        final GeofenceManager.GeofenceCallback val$callback;
        final List val$geofenceDataList;

        public void execute()
        {
            try
            {
                setupGeofences(geofenceDataList, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(String s1, List list, GeofenceManager.GeofenceCallback geofencecallback)
        {
            this$0 = GeofenceManager_.this;
            geofenceDataList = list;
            callback = geofencecallback;
            super(final_s, final_i, s1);
        }
    }

}
