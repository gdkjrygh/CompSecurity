// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.helper.adapter;

import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.helper.adapter.listener.AdapterValueListener;
import com.kohls.mcommerce.opal.helper.adapter.listener.IAdapterListener;
import com.kohls.mcommerce.opal.helper.adapter.rest.IRequestProcessor;
import com.kohls.mcommerce.opal.helper.adapter.rest.RequestProcessor;
import com.kohls.mcommerce.opal.helper.cache.inmemory.CacheListener;
import com.kohls.mcommerce.opal.helper.cache.inmemory.HeaderObject;
import com.kohls.mcommerce.opal.helper.cache.inmemory.IInMemoryCacheRegion;
import com.kohls.mcommerce.opal.helper.cache.inmemory.InMemoryCMSRegion;
import com.kohls.mcommerce.opal.helper.cache.inmemory.InMemoryCacheHelper;
import com.kohls.mcommerce.opal.helper.cache.inmemory.InMemoryCacheVO;
import com.kohls.mcommerce.opal.helper.cache.inmemory.InMemoryCatalogRegion;
import com.kohls.mcommerce.opal.helper.cache.inmemory.InMemoryCategoryRegion;
import com.kohls.mcommerce.opal.helper.error.AppException;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.helper.json.AdapterJsonParsingThread;
import com.worklight.wlclient.api.WLClient;
import com.worklight.wlclient.api.WLResponse;
import com.worklight.wlclient.api.WLResponseListener;
import java.util.LinkedHashMap;
import org.json.JSONObject;

// Referenced classes of package com.kohls.mcommerce.opal.helper.adapter:
//            AdapterOperation, AdapterProcedure

public class AdapterHelper
    implements CacheListener
{

    private static final String HEADER_EXPIRES = "Expires";
    private static final String TAG = com/kohls/mcommerce/opal/helper/adapter/AdapterHelper.getSimpleName();
    private HeaderObject headerObject;
    private WLResponse invocationResponse;
    private IAdapterListener mAdapterListener;
    private AdapterOperation mOperation;
    private Object mParams;
    private com.kohls.mcommerce.opal.helper.json.AdapterJsonParsingThread.ParsingListener mParsingListener;
    private AdapterJsonParsingThread mParsingThread;
    private AdapterProcedure mProcedure;
    private WLResponseListener mWlResponseListener;

    public AdapterHelper(AdapterProcedure adapterprocedure, Object obj, IAdapterListener iadapterlistener)
    {
        this(adapterprocedure, obj, iadapterlistener, null);
    }

    public AdapterHelper(AdapterProcedure adapterprocedure, Object obj, IAdapterListener iadapterlistener, HeaderObject headerobject)
    {
        mWlResponseListener = new _cls1();
        mParsingListener = new _cls2();
        mProcedure = adapterprocedure;
        mParams = obj;
        mAdapterListener = iadapterlistener;
        mOperation = AdapterOperation.CONNECT;
        headerObject = headerobject;
    }

    private void callNetworkProcedure()
    {
        if (checkAndRequestDataFromCache())
        {
            return;
        } else
        {
            requestAdapter();
            return;
        }
    }

    private void parseResponse(WLResponse wlresponse)
    {
        JSONObject jsonobject;
        invocationResponse = wlresponse;
        jsonobject = invocationResponse.getResponseJSON();
        String s = TAG;
        StringBuilder stringbuilder = (new StringBuilder()).append("*** ADAPTER RESPONSE: \n\t ");
        if (jsonobject != null)
        {
            wlresponse = jsonobject.toString();
        } else
        {
            wlresponse = "Response is null";
        }
        Logger.debug(s, stringbuilder.append(wlresponse).toString());
        if (mProcedure.getValueObjectClass() != null) goto _L2; else goto _L1
_L1:
        ((AdapterValueListener)mAdapterListener).onSuccess(jsonobject.toString());
_L4:
        return;
_L2:
        Logger.debug(TAG, "Parse request");
        if (jsonobject != null)
        {
            mParsingThread = new AdapterJsonParsingThread(mProcedure.getValueObjectClass(), mParsingListener, jsonobject.toString());
            mParsingThread.start();
        } else
        if (mAdapterListener != null)
        {
            mAdapterListener.onFailure(new Error(new AppException("Exception while executing request")));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void requestAdapter()
    {
        UtilityMethods.createJsonFromModel(mParams);
        try
        {
            Logger.debug(TAG, (new StringBuilder()).append("### Service called :").append(mProcedure.getURI()).toString());
            RequestProcessor.getInst().process(mProcedure, mParams, mWlResponseListener);
            return;
        }
        catch (Exception exception)
        {
            Logger.error(TAG, (new StringBuilder()).append("### REST Request Failed With Message : ").append(exception.getMessage()).toString());
        }
    }

    private void sendCacheResponse(InMemoryCacheVO inmemorycachevo)
    {
        if (mProcedure.getValueObjectClass() == null && inmemorycachevo.getmCacheData() != null)
        {
            ((AdapterValueListener)mAdapterListener).onSuccess(inmemorycachevo.getmCacheData());
        } else
        {
            Logger.debug(TAG, "Parse request");
            if (inmemorycachevo.getmCacheData() != null)
            {
                mParsingThread = new AdapterJsonParsingThread(mProcedure.getValueObjectClass(), mParsingListener, inmemorycachevo.getmCacheData());
                mParsingThread.start();
                return;
            }
        }
    }

    public void cancelAdapter()
    {
        if (mParsingThread != null && !mParsingThread.isCancelled())
        {
            mParsingThread.cancelThread(true);
        }
        mAdapterListener = null;
        mParsingListener = null;
    }

    public boolean checkAndRequestDataFromCache()
    {
        if (mProcedure.getProcedureName().equalsIgnoreCase(AdapterProcedure.PRODUCT_FOR_DIMENSIONS.getProcedureName()))
        {
            ((InMemoryCatalogRegion)InMemoryCacheHelper.getRegion((byte)0, this)).get(UtilityMethods.createJsonFromModel(mParams).toString());
            Logger.error("********", "************UtilityMethods.createJsonFromModel(mParams).toString()");
            return true;
        }
        if (mProcedure.getProcedureName().equalsIgnoreCase(AdapterProcedure.PRODUCT_FOR_DEPARTMENTID.getProcedureName()))
        {
            ((InMemoryCategoryRegion)InMemoryCacheHelper.getRegion((byte)1, this)).get(UtilityMethods.createJsonFromModel(mParams).toString());
            return true;
        }
        if (mProcedure.getProcedureName().equalsIgnoreCase(AdapterProcedure.CMS_HOME.getProcedureName()))
        {
            ((InMemoryCMSRegion)InMemoryCacheHelper.getRegion((byte)3, this)).get(UtilityMethods.createJsonFromModel(mParams).toString());
            return true;
        } else
        {
            return false;
        }
    }

    public void onCompleted(LinkedHashMap linkedhashmap)
    {
        if (linkedhashmap == null) goto _L2; else goto _L1
_L1:
        linkedhashmap = (InMemoryCacheVO)linkedhashmap.get(UtilityMethods.createJsonFromModel(mParams).toString());
        if (linkedhashmap == null) goto _L2; else goto _L3
_L3:
        sendCacheResponse(linkedhashmap);
_L5:
        return;
_L2:
        if (KohlsPhoneApplication.getInstance().isClientConnect())
        {
            requestAdapter();
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void performTask()
    {
        if (!KohlsPhoneApplication.getInstance().isClientConnect())
        {
            mOperation = AdapterOperation.CONNECT;
            Logger.debug(TAG, "Connect request");
            KohlsPhoneApplication.getInstance().getWLClient().connect(mWlResponseListener);
            return;
        } else
        {
            mOperation = AdapterOperation.PROCEDURE_CALL;
            callNetworkProcedure();
            return;
        }
    }

    public void saveDataintoCache(WLResponse wlresponse, long l)
    {
        IInMemoryCacheRegion iinmemorycacheregion = null;
        if (!mProcedure.getProcedureName().equalsIgnoreCase(AdapterProcedure.PRODUCT_FOR_DIMENSIONS.getProcedureName())) goto _L2; else goto _L1
_L1:
        iinmemorycacheregion = InMemoryCacheHelper.getRegion((byte)0, this);
_L4:
        if (iinmemorycacheregion != null)
        {
            iinmemorycacheregion.put(UtilityMethods.createJsonFromModel(mParams).toString(), new InMemoryCacheVO(l, wlresponse.getResponseJSON().toString()));
        }
        return;
_L2:
        if (mProcedure.getProcedureName().equalsIgnoreCase(AdapterProcedure.PRODUCT_FOR_DEPARTMENTID.getProcedureName()))
        {
            iinmemorycacheregion = InMemoryCacheHelper.getRegion((byte)1, this);
        } else
        if (mProcedure.getProcedureName().equalsIgnoreCase(AdapterProcedure.CMS_HOME.getProcedureName()))
        {
            iinmemorycacheregion = InMemoryCacheHelper.getRegion((byte)3, this);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }




/*
    static AdapterOperation access$002(AdapterHelper adapterhelper, AdapterOperation adapteroperation)
    {
        adapterhelper.mOperation = adapteroperation;
        return adapteroperation;
    }

*/







    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
