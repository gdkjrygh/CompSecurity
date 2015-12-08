// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.controller.impl;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import android.util.SparseArray;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.po.StoreInventoryPO;
import com.kohls.mcommerce.opal.common.po.StoreLocatorPO;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.RegistryObject;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.controller.iface.IAddToBagController;
import com.kohls.mcommerce.opal.framework.controller.iface.IStoreLocatorController;
import com.kohls.mcommerce.opal.framework.controller.iface.IViewControllerListener;
import com.kohls.mcommerce.opal.framework.listener.CartListener;
import com.kohls.mcommerce.opal.framework.view.activity.FindinStoreActivity;
import com.kohls.mcommerce.opal.framework.view.activity.ProductDetailsPWPActivity;
import com.kohls.mcommerce.opal.framework.view.fragment.StoreLocatorFragment;
import com.kohls.mcommerce.opal.framework.vo.CalculateOrderVO;
import com.kohls.mcommerce.opal.framework.vo.ErrorVO;
import com.kohls.mcommerce.opal.framework.vo.IValueObject;
import com.kohls.mcommerce.opal.framework.vo.StoreInventoryVO;
import com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO;
import com.kohls.mcommerce.opal.helper.adapter.AdapterHelper;
import com.kohls.mcommerce.opal.helper.adapter.AdapterProcedure;
import com.kohls.mcommerce.opal.helper.error.Error;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.controller.impl:
//            BaseControllerImpl, UpdateBagDelegate

public class StoreLocatorControllerImpl extends BaseControllerImpl
    implements IStoreLocatorController, IAddToBagController, CartListener
{

    private WeakReference mActivity;
    private WeakReference mFragment;
    private UpdateBagDelegate mUpdateBagDelegate;
    private com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store myStore;
    private String skuCode;
    private SparseArray storeMapping;
    private int what;

    public StoreLocatorControllerImpl(WeakReference weakreference, WeakReference weakreference1)
    {
        mFragment = weakreference;
        mActivity = weakreference1;
    }

    private void performGetInventoryAdapter(String s)
    {
        StoreInventoryPO storeinventorypo = new StoreInventoryPO();
        storeinventorypo.setchannel("store");
        storeinventorypo.setstoreNum(s);
        storeinventorypo.setSku(skuCode);
        (new AdapterHelper(AdapterProcedure.INVENTORY_BY_STORESEARCH, storeinventorypo, this)).performTask();
    }

    public void getInventoryforSKU(Location location, com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store store, String s, com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store store1)
    {
        myStore = store1;
        if (store == null)
        {
            getStoreLocations(location, 1003);
        } else
        {
            storeMapping = new SparseArray(0);
            what = 1004;
    /* block-local class not found */
    class StoreInventory {}

            (new StoreInventory(store)).execute(new Void[0]);
        }
        skuCode = s;
    }

    public Error getPayloadError(IValueObject ivalueobject)
    {
        Object obj = null;
        if (what != 1003 || !(ivalueobject instanceof StoreLocatorVO)) goto _L2; else goto _L1
_L1:
        ivalueobject = (StoreLocatorVO)ivalueobject;
        if (ivalueobject == null || ivalueobject.getErrors() == null || ivalueobject.getErrors().size() <= 0) goto _L4; else goto _L3
_L3:
        Error error = new Error(((ErrorVO)ivalueobject.getErrors().get(0)).getCode(), ((ErrorVO)ivalueobject.getErrors().get(0)).getMessage(), com.kohls.mcommerce.opal.helper.error.Error.ErrorType.ADAPTER_ERROR);
_L6:
        return error;
_L4:
        error = obj;
        if (ivalueobject != null)
        {
            error = obj;
            if (ivalueobject.getPayload() != null)
            {
                error = obj;
                if (ivalueobject.getPayload().getStores() != null)
                {
                    error = obj;
                    if (ivalueobject.getPayload().getStores().size() == 0)
                    {
                        return new Error("", KohlsPhoneApplication.getContext().getString(0x7f0803d2), com.kohls.mcommerce.opal.helper.error.Error.ErrorType.ADAPTER_PAYLOAD);
                    }
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        error = obj;
        if (what == 1004)
        {
            error = obj;
            if (ivalueobject instanceof StoreInventoryVO)
            {
                ivalueobject = (StoreInventoryVO)ivalueobject;
                error = obj;
                if (ivalueobject != null)
                {
                    error = obj;
                    if (ivalueobject.getErrors() != null)
                    {
                        error = obj;
                        if (ivalueobject.getErrors().size() > 0)
                        {
                            return new Error(((ErrorVO)ivalueobject.getErrors().get(0)).getCode(), ((ErrorVO)ivalueobject.getErrors().get(0)).getMessage(), com.kohls.mcommerce.opal.helper.error.Error.ErrorType.ADAPTER_ERROR);
                        }
                    }
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void getStoreLocations(Location location, int i)
    {
        what = i;
        StoreLocatorPO storelocatorpo = new StoreLocatorPO();
        if (location != null)
        {
            storelocatorpo.setLatitude(String.valueOf(location.getLatitude()));
            storelocatorpo.setLongitude(String.valueOf(location.getLongitude()));
        }
        if (myStore != null)
        {
            Location location1 = new Location("my store location");
            location1.setLatitude(myStore.getAddress().getLocation().getLatitude());
            location1.setLongitude(myStore.getAddress().getLocation().getLongitude());
            myStore.setDistanceFromOrigin(String.valueOf(UtilityMethods.getDistance(location, location1)));
        }
        storeMapping = new SparseArray(0);
        storelocatorpo.setRadius(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getStoreRadius());
        (new AdapterHelper(AdapterProcedure.STORE_BY_OPENSEARCH, storelocatorpo, this)).performTask();
    }

    public void onCartFailure(Error error)
    {
        mUpdateBagDelegate.callUpdatedToBagAdapter(this, false);
    }

    public void onCartSuccessful()
    {
        mUpdateBagDelegate.callUpdatedToBagAdapter(this, true);
    }

    public void onFailure(Error error)
    {
        if (mFragment != null)
        {
            ((StoreLocatorFragment)mFragment.get()).notifyViewOnFailure(error);
        } else
        if (mActivity != null && mActivity.get() != null)
        {
            ((FindinStoreActivity)mActivity.get()).notifyViewOnFailure(error);
            return;
        }
    }

    public void onOCBDisabled()
    {
        mUpdateBagDelegate.callUpdatedToBagAdapter(this, false);
    }

    public void onSuccess(IValueObject ivalueobject)
    {
        if ((mFragment == null || mFragment.get() == null || !((StoreLocatorFragment)mFragment.get()).isVisible() || ((StoreLocatorFragment)mFragment.get()).isRemoving()) && (mActivity == null || mActivity.get() == null || ((FindinStoreActivity)mActivity.get()).isFinishing())) goto _L2; else goto _L1
_L1:
        if (!(ivalueobject instanceof CalculateOrderVO)) goto _L4; else goto _L3
_L3:
        ivalueobject = mUpdateBagDelegate.handleAddToBagOnSuccess((IViewControllerListener)mActivity.get(), ivalueobject, (Context)mActivity.get());
        if (!mUpdateBagDelegate.isIfFromShoppingBagForPWP()) goto _L6; else goto _L5
_L5:
        ((ProductDetailsPWPActivity)((StoreLocatorFragment)mFragment.get()).getActivity()).onGiftAdded();
_L2:
        return;
_L6:
        if (!TextUtils.isEmpty(ivalueobject))
        {
            ((FindinStoreActivity)mActivity.get()).notifyViewOnSuccess(ivalueobject);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (what != 1003 || !(ivalueobject instanceof StoreLocatorVO))
        {
            break; /* Loop/switch isn't completed */
        }
        what = 1004;
        ivalueobject = (StoreLocatorVO)ivalueobject;
        if (ivalueobject != null && ivalueobject.getPayload() != null && ivalueobject.getPayload().getStores() != null && ivalueobject.getPayload().getStores().size() > 0)
        {
            (new StoreInventory(ivalueobject)).execute(new Void[0]);
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
        Object obj;
        if (what != 1004 || !(ivalueobject instanceof StoreInventoryVO))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (StoreInventoryVO)ivalueobject;
        if (((StoreInventoryVO) (obj)).getPayload() == null || ((StoreInventoryVO) (obj)).getPayload().getSkuCode() == null || ((StoreInventoryVO) (obj)).getPayload().getSkuCode().getStores() == null) goto _L2; else goto _L8
_L8:
        com.kohls.mcommerce.opal.framework.vo.StoreInventoryVO.Payload.SKU.StoreInventoryInfo storeinventoryinfo;
        com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store store;
        for (obj = ((StoreInventoryVO) (obj)).getPayload().getSkuCode().getStores().iterator(); ((Iterator) (obj)).hasNext(); storeMapping.append(Integer.parseInt(storeinventoryinfo.getStoreNum()), store))
        {
            storeinventoryinfo = (com.kohls.mcommerce.opal.framework.vo.StoreInventoryVO.Payload.SKU.StoreInventoryInfo)((Iterator) (obj)).next();
            store = (com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)storeMapping.get(Integer.parseInt(storeinventoryinfo.getStoreNum()));
            if (store != null)
            {
                store.setAllocatedStock(storeinventoryinfo.getAllocatedStock());
                store.setAvailability(storeinventoryinfo.getAvailability());
                store.setAvailableStock(storeinventoryinfo.getAvailableStock());
                store.setChannel(storeinventoryinfo.getChannel());
                store.setBopusEligible(storeinventoryinfo.getIsBopusEligible());
                store.setBopusEligibleStore(storeinventoryinfo.getIsBopusEligibleStore());
            }
        }

        if (mFragment != null)
        {
            ((StoreLocatorFragment)mFragment.get()).notifyViewOnSuccess(ivalueobject);
            return;
        }
        if (mActivity == null) goto _L2; else goto _L9
_L9:
        ((FindinStoreActivity)mActivity.get()).notifyViewOnSuccess(storeMapping);
        return;
        if (mFragment == null || ivalueobject == null) goto _L2; else goto _L10
_L10:
        ((StoreLocatorFragment)mFragment.get()).notifyViewOnSuccess(ivalueobject);
        return;
    }

    public void updateBag(String s, int i, String s1, RegistryObject registryobject, String s2, boolean flag, boolean flag1, 
            String s3, String s4, boolean flag2)
    {
        mUpdateBagDelegate = new UpdateBagDelegate(s3, i, s, s2, s1, flag, flag1, s4, flag2, registryobject);
        mUpdateBagDelegate.callCartAdapter(this);
    }




}
