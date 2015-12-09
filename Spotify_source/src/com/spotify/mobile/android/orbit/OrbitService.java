// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;

import android.app.Service;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.spotify.cosmos.router.NativeRouter;
import com.spotify.mobile.android.core.internal.ConnectivitySetter;
import cvj;
import cvk;
import dmz;
import gcz;
import gda;
import ggi;
import gin;
import gip;
import giq;
import gnw;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.spotify.mobile.android.orbit:
//            OrbitServiceInterface, OrbitLibraryLoader, OrbitPlayer, OrbitPlayerInterface, 
//            OrbitProvider, OrbitProviderInterface, OrbitPushNotifications, OrbitPushNotificationsInterface, 
//            OrbitSession, OrbitSessionInterface, OrbitServiceObserver, OrbitProviderObserver

public final class OrbitService
    implements ConnectivitySetter, OrbitServiceInterface
{

    public static final String CERTIFICATE_FILE_NAME = "cacert.pem";
    public static final gip DEPLOYED_FOR_VERSION = gip.a("deployed_for_version");
    private static boolean sNativeLoaded;
    private long nOrbitServicePtr;

    private OrbitService()
    {
    }

    public static OrbitService create(Service service, int i, String s)
    {
        initOrbit(service);
        String s2 = ((gcz)dmz.a(gcz)).e();
        Object obj = (gnw)dmz.a(gnw);
        String s1;
        if (((gnw) (obj)).b.f(gnw.a))
        {
            obj = ((gnw) (obj)).b.c(gnw.a);
        } else
        {
            obj = null;
        }
        s1 = ((String) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            s1 = s2;
        }
        return create(((Context) (service)), i, s, s2, s1);
    }

    private static native OrbitService create(Context context, int i, String s, String s1, String s2);

    private static void initOrbit(Context context)
    {
        if (sNativeLoaded)
        {
            return;
        } else
        {
            ((OrbitLibraryLoader)dmz.a(com/spotify/mobile/android/orbit/OrbitLibraryLoader)).waitForLibraryLoaded();
            sNativeLoaded = true;
            setCACertsDirectory(saveCertificate(context));
            dmz.a(gcz);
            gda gda1 = gcz.h();
            setMobileDeviceInfo(android.os.Build.VERSION.RELEASE, gcz.a(), gda1.a, gda1.b, gda1.c, gda1.d, ggi.c(context));
            setClassLoader(com/spotify/mobile/android/orbit/OrbitService.getClassLoader());
            return;
        }
    }

    private static String saveCertificate(Context context)
    {
        IOException ioexception;
        gin gin1;
        String s1;
        ioexception = null;
        String s = context.getApplicationContext().getApplicationInfo().dataDir;
        s1 = (new StringBuilder()).append(s).append(File.separator).append("cacert.pem").toString();
        gin1 = ((giq)dmz.a(giq)).a(context);
        if (gin1.f(DEPLOYED_FOR_VERSION) && gin1.c(DEPLOYED_FOR_VERSION).equals(""))
        {
            return s1;
        }
        context = context.getAssets();
        context = context.open("cacert.pem");
        FileOutputStream fileoutputstream = new FileOutputStream(s1);
        cvj.a(context, fileoutputstream);
        fileoutputstream.flush();
        gin1.b(DEPLOYED_FOR_VERSION, "");
        cvk.a(context);
        cvk.a(fileoutputstream);
        boolean flag = true;
_L1:
        Object obj;
        IOException ioexception1;
        if (flag)
        {
            return s1;
        } else
        {
            return "";
        }
        context;
        flag = true;
          goto _L1
        ioexception1;
        fileoutputstream = null;
        context = ioexception;
        ioexception = ioexception1;
_L4:
        cvk.a(context);
        cvk.a(fileoutputstream);
        flag = false;
          goto _L1
        context;
        flag = false;
          goto _L1
        obj;
        fileoutputstream = null;
        context = null;
_L3:
        try
        {
            cvk.a(context);
            cvk.a(fileoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw obj;
        obj;
        fileoutputstream = null;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L3; else goto _L2
_L2:
        obj;
        fileoutputstream = null;
          goto _L4
        obj;
          goto _L4
    }

    public static native void setCACertsDirectory(String s);

    private static native void setClassLoader(ClassLoader classloader);

    private static native void setMobileDeviceInfo(String s, int i, String s1, String s2, String s3, String s4, boolean flag);

    public final native void crash();

    public final native void destroy();

    public final native OrbitPlayer getOrbitPlayer();

    public final volatile OrbitPlayerInterface getOrbitPlayer()
    {
        return getOrbitPlayer();
    }

    public final native OrbitProvider getOrbitProvider();

    public final volatile OrbitProviderInterface getOrbitProvider()
    {
        return getOrbitProvider();
    }

    public final native OrbitPushNotifications getOrbitPushNotifications();

    public final volatile OrbitPushNotificationsInterface getOrbitPushNotifications()
    {
        return getOrbitPushNotifications();
    }

    public final native OrbitSession getOrbitSession();

    public final volatile OrbitSessionInterface getOrbitSession()
    {
        return getOrbitSession();
    }

    public final native boolean hasBananaFlavour();

    public final native void setConnectivityType(int i, boolean flag);

    public final native void setObserver(OrbitServiceObserver orbitserviceobserver);

    public final native void start(String s, String s1, String s2, boolean flag, boolean flag1, NativeRouter nativerouter, OrbitProviderObserver orbitproviderobserver);

    public final native void stop();

}
