// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.bmwgroup.connected.car.app.ApplicationManager;
import com.bmwgroup.connected.car.app.ApplicationType;
import com.bmwgroup.connected.car.app.BrandType;
import com.bmwgroup.connected.car.internal.SdkManager;
import com.spotify.mobile.android.service.media.MediaService;
import java.util.Map;
import java.util.Stack;

public class ekn
    implements dmx
{

    public ekn()
    {
    }

    public static ado a(MediaService mediaservice, ekc ekc)
    {
        ApplicationManager applicationmanager = ApplicationManager.a;
        if (mediaservice == null)
        {
            throw new IllegalArgumentException("Context shouldn't be null!");
        }
        if (ekc == null)
        {
            throw new IllegalArgumentException("ApplicationListener shouldn't be null!");
        }
        if (applicationmanager.mApplication == null)
        {
            if (ekc instanceof aeh)
            {
                applicationmanager.mApplication = new afd(mediaservice, ekc);
            } else
            {
                applicationmanager.mApplication = new afb(mediaservice, ekc);
            }
        }
        applicationmanager.mContext = mediaservice;
        applicationmanager.mAppId = mediaservice.getPackageName();
        ekc = ago.a(applicationmanager.mAppId);
        mediaservice.registerReceiver(applicationmanager.mDisconnectReceiver, new IntentFilter(ekc[1]));
        return applicationmanager.mApplication;
    }

    public static void a()
    {
        ApplicationManager applicationmanager = ApplicationManager.a;
        SdkManager sdkmanager = SdkManager.a;
        SdkManager.b.a("reset() clearing mScreenIdentMap, mScreenListenerMap, mScreens -> %s", new Object[] {
            sdkmanager.mApplicationName
        });
        sdkmanager.mIdentObjectMap.clear();
        sdkmanager.mIdentTargetMap.clear();
        sdkmanager.mScreenIdentMap.clear();
        sdkmanager.mScreens.clear();
        sdkmanager.mCurrentIdent = "";
        applicationmanager.mApplication = null;
    }

    public static void a(Context context, String s, String s1, ApplicationType applicationtype, BrandType brandtype)
    {
        ApplicationManager applicationmanager = ApplicationManager.a;
        if (context == null)
        {
            throw new IllegalArgumentException("context must not be null");
        }
        applicationmanager.mAppId = context.getPackageName();
        if (brandtype == null)
        {
            brandtype = BrandType.a;
        }
        (new Handler()).post(new com.bmwgroup.connected.car.app.ApplicationManager._cls2(applicationmanager, brandtype, context, applicationtype, s, s1));
    }

    public static adm b()
    {
        return ApplicationManager.a.mApplication.a();
    }
}
