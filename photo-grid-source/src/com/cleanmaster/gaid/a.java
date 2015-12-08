// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.gaid;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.picksinit.PicksMob;
import com.picksinit.b;

// Referenced classes of package com.cleanmaster.gaid:
//            AdvertisingIdHelper, GooglePlayServiceConnection, AdvertisingIdInterface

final class a
    implements Runnable
{

    final AdvertisingIdHelper a;

    a(AdvertisingIdHelper advertisingidhelper)
    {
        a = advertisingidhelper;
        super();
    }

    public final void run()
    {
        GooglePlayServiceConnection googleplayserviceconnection;
        obj2 = PicksMob.getInstance().getContext();
        googleplayserviceconnection = AdvertisingIdHelper.connection(((Context) (obj2)));
        if (googleplayserviceconnection != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        AdvertisingIdInterface advertisingidinterface;
        advertisingidinterface = (AdvertisingIdInterface)AdvertisingIdHelper.getIdInterface(googleplayserviceconnection.getConnectedBinder());
        obj = advertisingidinterface.getId();
        boolean flag = advertisingidinterface.isLimitAdTrackingEnabled(false);
        if (googleplayserviceconnection != null)
        {
            try
            {
                ((Context) (obj2)).unbindService(googleplayserviceconnection);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
_L4:
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L1; else goto _L3
_L3:
        synchronized (AdvertisingIdHelper.access$000(a))
        {
            AdvertisingIdHelper.access$002(a, ((String) (obj)));
            AdvertisingIdHelper.access$102(a, flag);
        }
        return;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        Object obj1;
        obj1;
        obj1 = null;
_L6:
        if (googleplayserviceconnection == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        ((Context) (obj2)).unbindService(googleplayserviceconnection);
        flag = false;
          goto _L4
        obj2;
        flag = false;
          goto _L4
        obj1;
        obj1 = null;
_L5:
        if (googleplayserviceconnection == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        ((Context) (obj2)).unbindService(googleplayserviceconnection);
        flag = false;
          goto _L4
        obj2;
        flag = false;
          goto _L4
        obj1;
        if (googleplayserviceconnection != null)
        {
            try
            {
                ((Context) (obj2)).unbindService(googleplayserviceconnection);
            }
            catch (IllegalArgumentException illegalargumentexception) { }
        }
        throw obj1;
        Object obj3;
        obj3;
          goto _L5
        obj3;
          goto _L6
    }
}
