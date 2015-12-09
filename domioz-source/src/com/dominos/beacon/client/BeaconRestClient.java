// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.client;

import com.dominos.App;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.beacon.data.http.BeaconRestInterface;
import com.dominos.beacon.model.BeaconOrderPost;
import com.dominos.beacon.model.CarryoutOrder;
import com.dominos.beacon.model.CheckInPost;
import com.dominos.beacon.model.CheckInResponse;
import com.dominos.beacon.util.BeaconConfigurationPreferences_;
import com.google.b.k;
import java.util.List;
import org.c.c.a.r;
import org.c.e.a.l;

public class BeaconRestClient
{

    private static final int CONNECT_TIMEOUT = 5000;
    private static final String DEV_ROOT_URL = "http://api-dev.dominos.com/beacon-service/public/order";
    private static final String PROD_ROOT_URL = "https://api.dominos.com/beacon-service/public/order";
    private static final int READ_TIMEOUT = 30000;
    private static final String TAG = com/dominos/beacon/client/BeaconRestClient.getSimpleName();
    BeaconConfigurationPreferences_ mBeaconConfigurationPreferences;
    BeaconRestInterface mRestInterface;

    public BeaconRestClient()
    {
    }

    private String getRootUrl()
    {
        if (App.isDebugMode())
        {
            return "http://api-dev.dominos.com/beacon-service/public/order";
        } else
        {
            return "https://api.dominos.com/beacon-service/public/order";
        }
    }

    public boolean checkIn(String s, int i, int j)
    {
        try
        {
            s = new CheckInPost(String.valueOf(i), String.valueOf(j), s);
            s = (new k()).b(s, com/dominos/beacon/model/CheckInPost);
            s = mRestInterface.checkIn(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtil.e(TAG, s.getMessage(), s, new Object[0]);
            return false;
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        LogUtil.d(TAG, "Post check in failed. Invalid response.", new Object[0]);
        return false;
        if (s.getMessages() == null || s.getMessages().isEmpty() || !StringHelper.containsIgnoreCase(((com.dominos.beacon.model.CheckInResponse.Message)s.getMessages().get(0)).getCode(), "ERROR"))
        {
            break MISSING_BLOCK_LABEL_131;
        }
        LogUtil.d(TAG, ((com.dominos.beacon.model.CheckInResponse.Message)s.getMessages().get(0)).getDescription(), new Object[0]);
        return false;
        return true;
    }

    public CarryoutOrder getOrder(int i, int j)
    {
        Object obj;
        try
        {
            obj = new BeaconOrderPost(String.valueOf(i), String.valueOf(j));
            obj = (new k()).b(obj, com/dominos/beacon/model/BeaconOrderPost);
            obj = mRestInterface.getOrders(((String) (obj)));
        }
        catch (Exception exception)
        {
            return null;
        }
        return ((CarryoutOrder) (obj));
    }

    public CarryoutOrder getOrderByPhone(String s, int i, int j)
    {
        try
        {
            s = new BeaconOrderPost(String.valueOf(i), String.valueOf(j), s);
            s = (new k()).b(s, com/dominos/beacon/model/BeaconOrderPost);
            s = mRestInterface.getOrders(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    void setupService()
    {
        Object obj = getRootUrl();
        mRestInterface.setRootUrl(((String) (obj)));
        mRestInterface.setHeader("Content-Type", "application/json");
        obj = mRestInterface.getRestTemplate();
        r r1 = new r();
        r1.setReadTimeout(30000);
        r1.setConnectTimeout(5000);
        ((l) (obj)).setRequestFactory(r1);
    }

}
