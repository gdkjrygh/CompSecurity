// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.instabug;

import android.app.Application;
import android.view.View;
import com.google.android.gms.maps.GoogleMap;
import java.lang.reflect.Constructor;
import me.lyft.android.application.IUserProvider;

// Referenced classes of package me.lyft.android.infrastructure.instabug:
//            IInstabugService, NoOpInstabugService

public class InstabugSupport
{

    private static IInstabugService instance;

    public InstabugSupport()
    {
    }

    public static void addMap(View view, GoogleMap googlemap)
    {
        if (instance != null)
        {
            instance.addMapView(view, googlemap);
        }
    }

    private static IInstabugService createInstabugService(Application application, IUserProvider iuserprovider)
    {
        try
        {
            application = (IInstabugService)Class.forName("me.lyft.android.infrastructure.instabug.InstabugService").getConstructor(new Class[] {
                android/app/Application, me/lyft/android/application/IUserProvider
            }).newInstance(new Object[] {
                application, iuserprovider
            });
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            return new NoOpInstabugService();
        }
        return application;
    }

    public static IInstabugService getInstabugService(Application application, IUserProvider iuserprovider)
    {
        if (instance == null)
        {
            instance = createInstabugService(application, iuserprovider);
        }
        return instance;
    }
}
