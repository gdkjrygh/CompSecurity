// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.storelocator;

import com.dominos.android.sdk.common.AddressUtil;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.locator.LocatorResult;
import com.dominos.android.sdk.common.dom.locator.LocatorStore;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.google.a.b.ar;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.android.sdk.core.storelocator:
//            StoreLocatorAPI

public class StoreLocatorManager extends Manager
{

    private static final int STORE_DEFAULT_INDEX = 0;
    private static final String TAG = com/dominos/android/sdk/core/storelocator/StoreLocatorManager.getSimpleName();
    StoreLocatorAPI mStoreLocatorAPI;

    public StoreLocatorManager()
    {
    }

    private LocatorStore getPotentialStore(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            LocatorStore locatorstore = (LocatorStore)list.next();
            if (locatorstore.isDeliveryStore())
            {
                return locatorstore;
            }
        }

        return null;
    }

    public String getName()
    {
        return "store_locator";
    }

    public void locateClosestStore(LabsAddress labsaddress, LocateClosestStoreCallback locatecloseststorecallback)
    {
        Object obj;
        byte byte0;
        locatecloseststorecallback.onBegin();
        obj = labsaddress.getAddressType();
        byte0 = -1;
        ((String) (obj)).hashCode();
        JVM INSTR tableswitch 2011093247 2011093247: default 36
    //                   2011093247 124;
           goto _L1 _L2
_L1:
        byte0;
        JVM INSTR tableswitch 0 0: default 56
    //                   0 139;
           goto _L3 _L4
_L3:
        LogUtil.d(TAG, "Fetching store for delivery address.", new Object[0]);
        obj = mStoreLocatorAPI.getStores(labsaddress);
        break; /* Loop/switch isn't completed */
_L2:
        if (((String) (obj)).equals("Campus"))
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        LogUtil.d(TAG, "Fetching store for delivery campus address", new Object[0]);
        obj = mStoreLocatorAPI.getStoresByBuilding(labsaddress);
        if (obj != null)
        {
            labsaddress = AddressUtil.getUpdatedDeliveryAddress(labsaddress, ((LocatorResult) (obj)).getLabsAddress());
            if (!StringHelper.equals("Campus", labsaddress.getAddressType()) && StringHelper.isEmpty(labsaddress.getStreetNumber()))
            {
                locatecloseststorecallback.onAddressInvalid(LocateStoreError.STREET_NUMBER_MISSING);
                locatecloseststorecallback.onFinish();
                return;
            }
            if (((LocatorResult) (obj)).getStores() != null && !((LocatorResult) (obj)).getStores().isEmpty())
            {
                obj = getPotentialStore(((LocatorResult) (obj)).getStores());
                if (obj != null)
                {
                    locatecloseststorecallback.onStoreFound(((LocatorStore) (obj)), labsaddress);
                } else
                {
                    locatecloseststorecallback.onStoreNotFound();
                }
            } else
            {
                locatecloseststorecallback.onStoreNotFound();
            }
            locatecloseststorecallback.onFinish();
            return;
        }
        locatecloseststorecallback.onLocateStoreFailed();
        locatecloseststorecallback.onFinish();
        return;
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected void onSessionSet()
    {
    }


    private class LocateClosestStoreCallback extends BaseCallback
    {

        public abstract void onAddressInvalid(LocateStoreError locatestoreerror);

        public abstract void onLocateStoreFailed();

        public abstract void onStoreFound(LocatorStore locatorstore, LabsAddress labsaddress);

        public abstract void onStoreNotFound();

        public LocateClosestStoreCallback()
        {
        }
    }


    private class LocateStoreError extends Enum
    {

        private static final LocateStoreError $VALUES[];
        public static final LocateStoreError STREET_NUMBER_MISSING;

        public static LocateStoreError valueOf(String s)
        {
            return (LocateStoreError)Enum.valueOf(com/dominos/android/sdk/core/storelocator/StoreLocatorManager$LocateStoreError, s);
        }

        public static LocateStoreError[] values()
        {
            return (LocateStoreError[])$VALUES.clone();
        }

        static 
        {
            STREET_NUMBER_MISSING = new LocateStoreError("STREET_NUMBER_MISSING", 0);
            $VALUES = (new LocateStoreError[] {
                STREET_NUMBER_MISSING
            });
        }

        private LocateStoreError(String s, int i)
        {
            super(s, i);
        }
    }

}
