// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.gaid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;

// Referenced classes of package com.cleanmaster.gaid:
//            GooglePlayServiceConnection, AdvertisingIdInterface, b, a

public class AdvertisingIdHelper
{

    private static AdvertisingIdHelper instance = null;
    private String mGAId;
    private boolean mTrackFlag;

    private AdvertisingIdHelper()
    {
        mGAId = "";
        mTrackFlag = false;
    }

    static GooglePlayServiceConnection connection(Context context)
    {
        GooglePlayServiceConnection googleplayserviceconnection;
        boolean flag;
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        try
        {
            googleplayserviceconnection = new GooglePlayServiceConnection();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            flag = context.bindService(intent, googleplayserviceconnection, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        if (flag)
        {
            return googleplayserviceconnection;
        } else
        {
            return null;
        }
    }

    public static IInterface getIdInterface(IBinder ibinder)
    {
        if (ibinder != null) goto _L2; else goto _L1
_L1:
        IInterface iinterface = null;
_L4:
        return iinterface;
_L2:
        IInterface iinterface1;
        iinterface1 = ibinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (iinterface1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        iinterface = iinterface1;
        if (iinterface1 instanceof AdvertisingIdInterface) goto _L4; else goto _L3
_L3:
        return new b(ibinder);
    }

    public static AdvertisingIdHelper getInstance()
    {
        if (instance == null)
        {
            instance = new AdvertisingIdHelper();
        }
        return instance;
    }

    public void asyncGetGAId()
    {
        (new Thread(new a(this))).start();
    }

    public String getGAId()
    {
        return mGAId;
    }

    public boolean getTrackFlag()
    {
        return mTrackFlag;
    }




/*
    static String access$002(AdvertisingIdHelper advertisingidhelper, String s)
    {
        advertisingidhelper.mGAId = s;
        return s;
    }

*/


/*
    static boolean access$102(AdvertisingIdHelper advertisingidhelper, boolean flag)
    {
        advertisingidhelper.mTrackFlag = flag;
        return flag;
    }

*/
}
