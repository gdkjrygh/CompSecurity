// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.inject;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import com.vungle.log.Logger;
import com.vungle.publisher.bt;
import com.vungle.publisher.cb;
import com.vungle.publisher.cc;
import com.vungle.publisher.cg;
import com.vungle.publisher.cj;
import com.vungle.publisher.ck;
import com.vungle.publisher.cl;
import com.vungle.publisher.cm;
import com.vungle.publisher.cn;
import com.vungle.publisher.cp;
import com.vungle.publisher.env.AdvertisingDeviceIdStrategy;
import com.vungle.publisher.env.AndroidDevice;
import com.vungle.publisher.env.WrapperFramework;
import com.vungle.publisher.image.BitmapFactory;
import com.vungle.publisher.location.AndroidLocation;
import com.vungle.publisher.location.GoogleLocationClientDetailedLocationProvider;
import com.vungle.publisher.location.GoogleLocationServicesDetailedLocationProvider;
import com.vungle.publisher.net.AndroidNetwork;
import dagger.ObjectGraph;
import java.io.File;

// Referenced classes of package com.vungle.publisher.inject:
//            Injector

class ConfigurablePublisherModule
    implements cg
{

    Context a;
    String b;
    BitmapFactory c;
    Class d;
    WrapperFramework e;
    String f;
    private boolean g;

    ConfigurablePublisherModule()
    {
    }

    static bt a(AndroidDevice androiddevice)
    {
        return androiddevice;
    }

    static cj a(ck ck)
    {
        return ck;
    }

    static cl a()
    {
        GoogleLocationClientDetailedLocationProvider googlelocationclientdetailedlocationprovider = new GoogleLocationClientDetailedLocationProvider();
        Injector.getInstance().a.inject(googlelocationclientdetailedlocationprovider);
        return googlelocationclientdetailedlocationprovider;
        NoClassDefFoundError noclassdeffounderror;
        noclassdeffounderror;
        googlelocationclientdetailedlocationprovider = null;
_L2:
        Logger.d("error creating GoogleLocationClientDetailedLocationProvider", noclassdeffounderror);
        return googlelocationclientdetailedlocationprovider;
        noclassdeffounderror;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static cn a(AndroidLocation androidlocation)
    {
        return androidlocation;
    }

    static cp a(AndroidNetwork androidnetwork)
    {
        return androidnetwork;
    }

    static com.vungle.publisher.env.AndroidDevice.DeviceIdStrategy a(AdvertisingDeviceIdStrategy advertisingdeviceidstrategy)
    {
        return advertisingdeviceidstrategy;
    }

    static String a(Context context)
    {
        context = context.getExternalFilesDir(null);
        if (context == null)
        {
            throw new cb();
        } else
        {
            return cc.a(new Object[] {
                context.getAbsolutePath(), ".vungle"
            });
        }
    }

    static cm b()
    {
        GoogleLocationServicesDetailedLocationProvider googlelocationservicesdetailedlocationprovider = new GoogleLocationServicesDetailedLocationProvider();
        Injector.getInstance().a.inject(googlelocationservicesdetailedlocationprovider);
        return googlelocationservicesdetailedlocationprovider;
        NoClassDefFoundError noclassdeffounderror;
        noclassdeffounderror;
        googlelocationservicesdetailedlocationprovider = null;
_L2:
        Logger.d("error creating GoogleLocationServicesDetailedLocationProvider", noclassdeffounderror);
        return googlelocationservicesdetailedlocationprovider;
        noclassdeffounderror;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static String b(Context context)
    {
        context = context.getExternalCacheDir();
        if (context == null)
        {
            throw new cb();
        } else
        {
            return cc.a(new Object[] {
                context, ".VungleCacheDir"
            });
        }
    }

    static AudioManager c(Context context)
    {
        context = (AudioManager)context.getSystemService("audio");
        if (context == null)
        {
            Logger.d("VungleDevice", "AudioManager not avaialble");
        }
        return context;
    }

    static String c()
    {
        return "http://api.vungle.com/api/v4/";
    }

    static ConnectivityManager d(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            Logger.d("VungleDevice", "ConnectivityManager not available");
        }
        return context;
    }

    static String d()
    {
        return "https://ingest.vungle.com/";
    }

    static SharedPreferences e(Context context)
    {
        return context.getSharedPreferences("VUNGLE_PUB_APP_INFO", 0);
    }

    static TelephonyManager f(Context context)
    {
        context = (TelephonyManager)context.getSystemService("phone");
        if (context == null)
        {
            Logger.d("VungleDevice", "TelephonyManager not avaialble");
        }
        return context;
    }

    static WindowManager g(Context context)
    {
        context = (WindowManager)context.getSystemService("window");
        if (context == null)
        {
            Logger.d("VungleDevice", "WindowManager not available");
        }
        return context;
    }

    public final void a(Context context, String s)
    {
        if (g)
        {
            Logger.d("VungleInject", "publisher module already initialized");
            return;
        } else
        {
            Logger.d("VungleInject", "initializing publisher module");
            a = context.getApplicationContext();
            b = s;
            g = true;
            return;
        }
    }

    public final void a(Class class1)
    {
        if (g)
        {
            Logger.d("VungleInject", "full screen ad activity class in publisher module NOT set - already initialized");
            return;
        } else
        {
            Logger.d("VungleInject", (new StringBuilder("setting full screen ad activity class in publisher module: ")).append(class1).toString());
            d = class1;
            return;
        }
    }

    public void setBitmapFactory(BitmapFactory bitmapfactory)
    {
        if (g)
        {
            Logger.d("VungleInject", "BitmapFactory in publisher module NOT set - already initialized");
            return;
        } else
        {
            Logger.d("VungleInject", (new StringBuilder("setting BitmapFactory in publisher module: ")).append(bitmapfactory).toString());
            c = bitmapfactory;
            return;
        }
    }

    public void setWrapperFramework(WrapperFramework wrapperframework)
    {
        if (g)
        {
            Logger.d("VungleInject", "wrapper framework in publisher module NOT set - already initialized");
            return;
        } else
        {
            Logger.d("VungleInject", (new StringBuilder("setting framework in publisher module: ")).append(wrapperframework).toString());
            e = wrapperframework;
            return;
        }
    }

    public void setWrapperFrameworkVersion(String s)
    {
        if (g)
        {
            Logger.d("VungleInject", "wrapper framework version in publisher module NOT set - already initialized");
            return;
        } else
        {
            Logger.d("VungleInject", (new StringBuilder("setting framework in publisher module: ")).append(s).toString());
            f = s;
            return;
        }
    }
}
