// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.trusteer.tas.TAS_CLIENT_INFO;
import com.trusteer.tas.TAS_DRA_ITEM_INFO;
import com.trusteer.tas.TAS_INT_REF;
import com.trusteer.tas.TAS_LONG_REF;
import com.trusteer.tas.TAS_OBJECT;
import com.trusteer.tas.TAS_OBJECT_REF;
import com.trusteer.tas.TAS_STRING_REF;
import com.trusteer.tas.atas;
import com.trusteer.tas.tas;
import com.worklight.common.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class WLTrusteerInternal
{
    private class RecalcTask
        implements Runnable
    {

        final WLTrusteerInternal this$0;

        public void run()
        {
            int i = tas.TasDraRecalcRiskAssessment(1);
            if (i != 0)
            {
                try
                {
                    WLTrusteerInternal.logger.error((new StringBuilder()).append("TasDraRecalcRiskAssessment() failed. ").append(i).toString());
                    return;
                }
                catch (Throwable throwable)
                {
                    WLTrusteerInternal.logger.error((new StringBuilder()).append("TasDraRecalcRiskAssessment() failed. ").append(throwable).toString());
                }
                break MISSING_BLOCK_LABEL_70;
            }
            WLTrusteerInternal.logger.info("TasDraRecalcRiskAssessment() succeeded");
            return;
        }

        private RecalcTask()
        {
            this$0 = WLTrusteerInternal.this;
            super();
        }

    }


    private static final String TAS_GET_DEVICE_KEY_ERROR = "TasGetDeviceKey() failed.";
    private static final String TAS_GET_RISK_ERROR = "TasDraGetRiskAssessment() failed.";
    private static final String TAS_INIT_ERROR = "TasInitialize() failed. Invalid or missing license.";
    private static final String TAS_RECALC_ERROR = "TasDraRecalcRiskAssessment() failed.";
    private static final String TAS_RISK_TO_JSON_ERROR = "getRiskAssessmentAsJson() failed.";
    private static final Logger logger = Logger.getInstance(com/worklight/common/internal/WLTrusteerInternal.getName());
    private String deviceKey;
    private Thread recalcTask;

    public WLTrusteerInternal()
    {
        recalcTask = null;
    }

    private Map extractClientInformation(Context context)
    {
        Object obj;
        Exception exception;
        HashMap hashmap;
        hashmap = new HashMap();
        context = context.getAssets();
        obj = null;
        exception = null;
        context = new BufferedReader(new InputStreamReader(context.open("tas.license")));
_L3:
        obj = context.readLine();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = TextUtils.split(((String) (obj)), "=");
        if (obj.length >= 2)
        {
            hashmap.put(obj[0], obj[1]);
        }
          goto _L3
        obj;
_L7:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return hashmap;
            }
        }
        return hashmap;
_L2:
        context.readLine();
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return hashmap;
            }
            return hashmap;
        } else
        {
            return hashmap;
        }
        context;
_L5:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw context;
        exception;
        obj = context;
        context = exception;
        if (true) goto _L5; else goto _L4
_L4:
        context;
        context = exception;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void forceRiskAssessment()
    {
        recalcTask = new Thread(new RecalcTask());
        recalcTask.start();
    }

    private TAS_CLIENT_INFO getClientInfo(Context context)
    {
        TAS_CLIENT_INFO tas_client_info = new TAS_CLIENT_INFO();
        context = extractClientInformation(context);
        tas_client_info.setVendorId((String)context.get("vendorId"));
        tas_client_info.setClientId((String)context.get("clientId"));
        tas_client_info.setClientKey((String)context.get("clientKey"));
        return tas_client_info;
    }

    protected void finalize()
    {
        try
        {
            super.finalize();
            tas.TasFinalize();
            return;
        }
        catch (Throwable throwable)
        {
            logger.debug((new StringBuilder()).append("TasFinalize failed with error ").append(throwable).toString());
        }
    }

    public String getDeviceKey()
    {
        if (deviceKey == null)
        {
            TAS_STRING_REF tas_string_ref = new TAS_STRING_REF();
            TAS_LONG_REF tas_long_ref = new TAS_LONG_REF();
            tas.TasGetDeviceKey(null, tas_long_ref);
            if (tas.TasGetDeviceKey(tas_string_ref, tas_long_ref) == 0)
            {
                deviceKey = tas_string_ref.get_value();
            } else
            {
                logger.error("TasGetDeviceKey() failed.");
            }
        }
        return deviceKey;
    }

    public TAS_OBJECT getRiskAssessment()
    {
        TAS_OBJECT_REF tas_object_ref = new TAS_OBJECT_REF();
        if (tas.TasDraGetRiskAssessment(tas_object_ref) != 0)
        {
            logger.error("TasDraGetRiskAssessment() failed.");
            return null;
        } else
        {
            return tas_object_ref.get_value();
        }
    }

    public JSONObject getRiskAssessmentAsJson()
    {
        TAS_OBJECT tas_object;
        Object obj;
        TAS_OBJECT tas_object1;
        TAS_INT_REF tas_int_ref;
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        tas_int_ref = null;
        tas_object1 = null;
        tas_object = tas_object1;
        obj = tas_int_ref;
        jsonobject.put("device_key", getDeviceKey());
        tas_object = tas_object1;
        obj = tas_int_ref;
        tas_object1 = getRiskAssessment();
        if (tas_object1 == null) goto _L2; else goto _L1
_L1:
        tas_object = tas_object1;
        obj = tas_object1;
        tas_int_ref = new TAS_INT_REF();
        tas_object = tas_object1;
        obj = tas_object1;
        if (tas.TasDraGetRiskItemCount(tas_object1, tas_int_ref) != 0) goto _L2; else goto _L3
_L3:
        int i = 0;
_L4:
        tas_object = tas_object1;
        obj = tas_object1;
        if (i >= tas_int_ref.get_value())
        {
            break; /* Loop/switch isn't completed */
        }
        tas_object = tas_object1;
        obj = tas_object1;
        TAS_DRA_ITEM_INFO tas_dra_item_info = new TAS_DRA_ITEM_INFO();
        tas_object = tas_object1;
        obj = tas_object1;
        if (tas.TasDraGetRiskAssessmentItemByIndex(tas_object1, i, tas_dra_item_info) != 0)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        tas_object = tas_object1;
        obj = tas_object1;
        JSONObject jsonobject1 = new JSONObject();
        tas_object = tas_object1;
        obj = tas_object1;
        jsonobject1.put("value", tas_dra_item_info.getItemValue());
        tas_object = tas_object1;
        obj = tas_object1;
        jsonobject1.put("lastCalculated", tas_dra_item_info.getLastCalculated().getTime());
        tas_object = tas_object1;
        obj = tas_object1;
        jsonobject1.put("additionalData", tas_dra_item_info.getAdditionalData());
        tas_object = tas_object1;
        obj = tas_object1;
        jsonobject1.put("name", tas_dra_item_info.getItemName());
        tas_object = tas_object1;
        obj = tas_object1;
        jsonobject.put(tas_dra_item_info.getItemName(), jsonobject1);
        i++;
        if (true) goto _L4; else goto _L2
_L2:
        if (tas_object1 != null)
        {
            tas.TasDraReleaseRiskAssessment(tas_object1);
        }
_L6:
        return jsonobject;
        obj;
        obj = tas_object;
        logger.error("getRiskAssessmentAsJson() failed.");
        if (tas_object == null) goto _L6; else goto _L5
_L5:
        tas.TasDraReleaseRiskAssessment(tas_object);
        return jsonobject;
        Exception exception;
        exception;
        if (obj != null)
        {
            tas.TasDraReleaseRiskAssessment(((TAS_OBJECT) (obj)));
        }
        throw exception;
    }

    public boolean init(Context context)
    {
        if (atas.TasInitialize(context, getClientInfo(context), 0) == 0)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        logger.error("TasInitialize() failed. Invalid or missing license.");
        return false;
        try
        {
            logger.info("Trusteer initialized successfully");
            forceRiskAssessment();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            logger.error((new StringBuilder()).append("TasInitialize() failed. Invalid or missing license. ").append(context).toString());
            return false;
        }
        return true;
    }

    public boolean isRiskAssessmentAvailable()
    {
        return recalcTask == null || !recalcTask.isAlive();
    }

    public void waitForRiskAssessment()
    {
        try
        {
            if (recalcTask != null && recalcTask.isAlive())
            {
                recalcTask.join();
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }


}
