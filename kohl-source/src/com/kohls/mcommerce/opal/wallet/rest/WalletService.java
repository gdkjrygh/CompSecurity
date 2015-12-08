// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.digby.localpoint.sdk.core.ILPDevice;
import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.impl.LPLocalpointService;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.wallet.rest.containers.NotificationInputResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.NotificationResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import com.kohls.mcommerce.opal.wallet.rest.responses.Response;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.rest:
//            KohlsRestService

public class WalletService extends KohlsRestService
{

    long totalSize;

    public WalletService(WeakReference weakreference)
    {
        super(weakreference);
        totalSize = 0L;
        if (mContext.get() != null)
        {
            weakreference = ((ConnectivityManager)((Context)mContext.get()).getSystemService("connectivity")).getActiveNetworkInfo();
            if (weakreference != null)
            {
                if (weakreference.isConnected());
            }
        }
    }

    public WalletResponse addWalletItems(List list, boolean flag)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        android.net.Uri.Builder builder;
        obj1 = "https://kwallet.skavaone.com";
        obj = obj1;
        if (KohlsPhoneApplication.getInstance() != null)
        {
            obj = obj1;
            if (KohlsPhoneApplication.getInstance().getConfigurationUtils() != null)
            {
                obj = obj1;
                if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig() != null)
                {
                    obj = obj1;
                    if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL() != null)
                    {
                        obj = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL();
                    }
                }
            }
        }
        builder = Uri.parse(((String) (obj))).buildUpon();
        builder.path(Appconfig.WALLET_GET_BY_TYPE);
        obj3 = null;
        obj2 = null;
        obj = obj2;
        obj1 = obj3;
        JSONObject jsonobject = new JSONObject();
        obj = obj2;
        obj1 = obj3;
        JSONArray jsonarray = new JSONArray();
        obj = obj2;
        obj1 = obj3;
        Object obj4 = new JSONObject();
        obj = obj2;
        obj1 = obj3;
        Iterator iterator = list.iterator();
        list = ((List) (obj4));
_L7:
        obj = obj2;
        obj1 = obj3;
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        obj = obj2;
        obj1 = obj3;
        obj4 = (WalletItemResponse)iterator.next();
        obj = obj2;
        obj1 = obj3;
        list.put("id", ((WalletItemResponse) (obj4)).getId());
        if (!flag) goto _L4; else goto _L3
_L3:
        obj = obj2;
        obj1 = obj3;
        list.put("typeCode", "loyalty");
_L5:
        obj = obj2;
        obj1 = obj3;
        list.put("effectiveStartDate", ((WalletItemResponse) (obj4)).getEffectiveStartDate());
        obj = obj2;
        obj1 = obj3;
        list.put("effectiveEndDate", ((WalletItemResponse) (obj4)).getEffectiveEndDate());
        obj = obj2;
        obj1 = obj3;
        list.put("value", ((WalletItemResponse) (obj4)).getValue());
        obj = obj2;
        obj1 = obj3;
        list.put("valueAsOf", ((WalletItemResponse) (obj4)).getValueAsOf());
        obj = obj2;
        obj1 = obj3;
        list.put("shareable", ((WalletItemResponse) (obj4)).getShareable());
        obj = obj2;
        obj1 = obj3;
        list.put("pin", ((WalletItemResponse) (obj4)).getPin());
        obj = obj2;
        obj1 = obj3;
        list.put("giftable", ((WalletItemResponse) (obj4)).getGiftable());
        obj = obj2;
        obj1 = obj3;
        list.put("deleted", ((WalletItemResponse) (obj4)).getDeleted());
        obj = obj2;
        obj1 = obj3;
        list.put("description", ((WalletItemResponse) (obj4)).getDescription());
        obj = obj2;
        obj1 = obj3;
        list.put("disclaimer", ((WalletItemResponse) (obj4)).getDisclaimer());
        obj = obj2;
        obj1 = obj3;
        list.put("notifications", ((WalletItemResponse) (obj4)).getNotifications());
        obj = obj2;
        obj1 = obj3;
        list.put("promoCode", ((WalletItemResponse) (obj4)).getPromoCode());
        obj = obj2;
        obj1 = obj3;
        list.put("giftCardNum", ((WalletItemResponse) (obj4)).getGiftCardNum());
        obj = obj2;
        obj1 = obj3;
        jsonarray.put(list);
        obj = obj2;
        obj1 = obj3;
        try
        {
            list = new JSONObject();
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            list.printStackTrace();
            return ((WalletResponse) (obj));
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            list.printStackTrace();
            return ((WalletResponse) (obj1));
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj = obj2;
        obj1 = obj3;
        list.put("typeCode", ((WalletItemResponse) (obj4)).getTypeCode());
        if (true) goto _L5; else goto _L2
_L2:
        obj = obj2;
        obj1 = obj3;
        jsonobject.put("walletItems", jsonarray);
        obj = obj2;
        obj1 = obj3;
        jsonobject.put("walletId", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletId());
        obj = obj2;
        obj1 = obj3;
        list = new StringEntity(jsonobject.toString(), "UTF-8");
        obj = obj2;
        obj1 = obj3;
        obj4 = new HttpPost(builder.build().toString());
        obj = obj2;
        obj1 = obj3;
        ((HttpPost) (obj4)).setEntity(list);
        obj = obj2;
        obj1 = obj3;
        list = (WalletResponse)Response.executeRequest(((org.apache.http.client.methods.HttpUriRequest) (obj4)), com/kohls/mcommerce/opal/wallet/rest/containers/WalletResponse, null);
        obj = list;
        obj1 = list;
        list.setRequestType("post_");
        return list;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public WalletResponse addtoWallet(Set set)
    {
        Object obj1 = "https://kwallet.skavaone.com";
        Object obj = obj1;
        if (KohlsPhoneApplication.getInstance() != null)
        {
            obj = obj1;
            if (KohlsPhoneApplication.getInstance().getConfigurationUtils() != null)
            {
                obj = obj1;
                if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig() != null)
                {
                    obj = obj1;
                    if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL() != null)
                    {
                        obj = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL();
                    }
                }
            }
        }
        Object obj4 = Uri.parse(((String) (obj))).buildUpon();
        ((android.net.Uri.Builder) (obj4)).path(Appconfig.WALLET_GET_BY_TYPE);
        obj = LPLocalpointService.getInstance((Context)mContext.get());
        ((android.net.Uri.Builder) (obj4)).appendQueryParameter(Appconfig.DEVICE_ID, ((LPLocalpointService) (obj)).getDevice().getID().getValue());
        Object obj3 = null;
        Object obj2 = null;
        obj = obj2;
        obj1 = obj3;
        JSONObject jsonobject;
        JSONObject jsonobject1;
        JSONArray jsonarray;
        try
        {
            jsonobject = new JSONObject();
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            set.printStackTrace();
            return ((WalletResponse) (obj));
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            set.printStackTrace();
            return ((WalletResponse) (obj1));
        }
        obj = obj2;
        obj1 = obj3;
        jsonobject1 = new JSONObject();
        obj = obj2;
        obj1 = obj3;
        jsonarray = new JSONArray();
        obj = obj2;
        obj1 = obj3;
        set = set.iterator();
_L2:
        obj = obj2;
        obj1 = obj3;
        if (!set.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj2;
        obj1 = obj3;
        jsonobject1.put("id", ((WalletItemResponse)set.next()).getId());
        if (true) goto _L2; else goto _L1
_L1:
        obj = obj2;
        obj1 = obj3;
        jsonarray.put(jsonobject1);
        obj = obj2;
        obj1 = obj3;
        jsonobject.put("walletItems", jsonarray);
        obj = obj2;
        obj1 = obj3;
        jsonobject.put("walletId", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletId());
        obj = obj2;
        obj1 = obj3;
        set = new StringEntity(jsonobject.toString());
        obj = obj2;
        obj1 = obj3;
        obj4 = new HttpPost(((android.net.Uri.Builder) (obj4)).build().toString());
        obj = obj2;
        obj1 = obj3;
        ((HttpPost) (obj4)).setEntity(set);
        obj = obj2;
        obj1 = obj3;
        set = (WalletResponse)Response.executeRequest(((org.apache.http.client.methods.HttpUriRequest) (obj4)), com/kohls/mcommerce/opal/wallet/rest/containers/WalletResponse, null);
        obj = set;
        obj1 = set;
        set.setRequestType("post_");
        return set;
    }

    public WalletResponse createWallet()
    {
        Object obj1 = "https://kwallet.skavaone.com";
        Object obj = obj1;
        if (KohlsPhoneApplication.getInstance() != null)
        {
            obj = obj1;
            if (KohlsPhoneApplication.getInstance().getConfigurationUtils() != null)
            {
                obj = obj1;
                if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig() != null)
                {
                    obj = obj1;
                    if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL() != null)
                    {
                        obj = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL();
                    }
                }
            }
        }
        Object obj3 = Uri.parse(((String) (obj))).buildUpon();
        ((android.net.Uri.Builder) (obj3)).path(Appconfig.WALLET_CREATE_ID);
        Object obj2 = null;
        WalletResponse walletresponse = null;
        obj = walletresponse;
        obj1 = obj2;
        Object obj4;
        try
        {
            obj4 = new JSONObject();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ((UnsupportedEncodingException) (obj1)).printStackTrace();
            return ((WalletResponse) (obj));
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return ((WalletResponse) (obj1));
        }
        obj = walletresponse;
        obj1 = obj2;
        ((JSONObject) (obj4)).put("lastName", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserLastnameFromPref());
        obj = walletresponse;
        obj1 = obj2;
        ((JSONObject) (obj4)).put("firstName", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref());
        obj = walletresponse;
        obj1 = obj2;
        ((JSONObject) (obj4)).put("retailerEmail", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        obj = walletresponse;
        obj1 = obj2;
        obj4 = new StringEntity(((JSONObject) (obj4)).toString());
        obj = walletresponse;
        obj1 = obj2;
        obj3 = new HttpPost(((android.net.Uri.Builder) (obj3)).build().toString());
        obj = walletresponse;
        obj1 = obj2;
        ((HttpPost) (obj3)).setEntity(((org.apache.http.HttpEntity) (obj4)));
        obj = walletresponse;
        obj1 = obj2;
        walletresponse = (WalletResponse)Response.executeRequest(((org.apache.http.client.methods.HttpUriRequest) (obj3)), com/kohls/mcommerce/opal/wallet/rest/containers/WalletResponse, null);
        obj = walletresponse;
        obj1 = walletresponse;
        walletresponse.setRequestType("post_");
        return walletresponse;
    }

    public WalletResponse deleteWalletItem(String s)
    {
        String s2 = "https://kwallet.skavaone.com";
        String s1 = s2;
        if (KohlsPhoneApplication.getInstance() != null)
        {
            s1 = s2;
            if (KohlsPhoneApplication.getInstance().getConfigurationUtils() != null)
            {
                s1 = s2;
                if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig() != null)
                {
                    s1 = s2;
                    if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL() != null)
                    {
                        s1 = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL();
                    }
                }
            }
        }
        s = (WalletResponse)Response.executeRequest(new HttpDelete((new StringBuilder()).append(s1).append("/").append(Appconfig.WALLET_DELETE).append(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletId()).append("/item/").append(s).toString()), com/kohls/mcommerce/opal/wallet/rest/containers/WalletResponse, null);
        s.setRequestType("post_");
        return s;
    }

    public WalletResponse getWallentByGiftCard(String s, String s1)
    {
        String s3 = "https://kwallet.skavaone.com";
        String s2 = s3;
        if (KohlsPhoneApplication.getInstance() != null)
        {
            s2 = s3;
            if (KohlsPhoneApplication.getInstance().getConfigurationUtils() != null)
            {
                s2 = s3;
                if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig() != null)
                {
                    s2 = s3;
                    if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL() != null)
                    {
                        s2 = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL();
                    }
                }
            }
        }
        android.net.Uri.Builder builder = Uri.parse(s2).buildUpon();
        builder.path(Appconfig.WALLET_GET_BY_GIFTCARD);
        Object obj1 = null;
        Object obj = null;
        s2 = obj;
        s3 = obj1;
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return s2;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return s3;
        }
        s2 = obj;
        s3 = obj1;
        jsonobject.put("id", s);
        s2 = obj;
        s3 = obj1;
        jsonobject.put("pin", s1);
        s2 = obj;
        s3 = obj1;
        s = new StringEntity(jsonobject.toString(), "UTF-8");
        s2 = obj;
        s3 = obj1;
        s1 = new HttpPost(builder.build().toString());
        s2 = obj;
        s3 = obj1;
        s1.setEntity(s);
        s2 = obj;
        s3 = obj1;
        s = (WalletResponse)Response.executeRequest(s1, com/kohls/mcommerce/opal/wallet/rest/containers/WalletResponse, null);
        s2 = s;
        s3 = s;
        s.setRequestType("post_");
        return s;
    }

    public WalletResponse getWallentByLookup(String s)
    {
        Object obj;
        String s1 = "https://kwallet.skavaone.com";
        obj = s1;
        if (KohlsPhoneApplication.getInstance() != null)
        {
            obj = s1;
            if (KohlsPhoneApplication.getInstance().getConfigurationUtils() != null)
            {
                obj = s1;
                if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig() != null)
                {
                    obj = s1;
                    if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL() != null)
                    {
                        obj = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL();
                    }
                }
            }
        }
        obj = Uri.parse(((String) (obj))).buildUpon();
        ((android.net.Uri.Builder) (obj)).path(Appconfig.WALLET_GET_BY_BARCODE);
        ((android.net.Uri.Builder) (obj)).appendPath(s);
        s = null;
        obj = new HttpGet(URLDecoder.decode(((android.net.Uri.Builder) (obj)).build().toString(), "utf-8"));
        s = ((String) (obj));
_L2:
        s = (WalletResponse)Response.executeRequest(s, com/kohls/mcommerce/opal/wallet/rest/containers/WalletResponse, null);
        s.setRequestType("get_");
        return s;
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        unsupportedencodingexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public WalletResponse getWalletByBulkLookup(Set set)
    {
        Object obj1 = "https://kwallet.skavaone.com";
        Object obj = obj1;
        if (KohlsPhoneApplication.getInstance() != null)
        {
            obj = obj1;
            if (KohlsPhoneApplication.getInstance().getConfigurationUtils() != null)
            {
                obj = obj1;
                if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig() != null)
                {
                    obj = obj1;
                    if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL() != null)
                    {
                        obj = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL();
                    }
                }
            }
        }
        Object obj4 = Uri.parse(((String) (obj))).buildUpon();
        ((android.net.Uri.Builder) (obj4)).path(Appconfig.WALLET_GET_BY_BARCODE);
        Object obj3 = null;
        Object obj2 = null;
        obj = obj2;
        obj1 = obj3;
        JSONArray jsonarray;
        JSONObject jsonobject;
        try
        {
            jsonarray = new JSONArray();
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            set.printStackTrace();
            return ((WalletResponse) (obj));
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            set.printStackTrace();
            return ((WalletResponse) (obj1));
        }
        obj = obj2;
        obj1 = obj3;
        jsonobject = new JSONObject();
        obj = obj2;
        obj1 = obj3;
        set = set.iterator();
_L2:
        obj = obj2;
        obj1 = obj3;
        if (!set.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj2;
        obj1 = obj3;
        jsonarray.put((String)set.next());
        if (true) goto _L2; else goto _L1
_L1:
        obj = obj2;
        obj1 = obj3;
        jsonobject.put("walletItemIds", jsonarray);
        obj = obj2;
        obj1 = obj3;
        set = new StringEntity(jsonobject.toString());
        obj = obj2;
        obj1 = obj3;
        obj4 = new HttpPut(((android.net.Uri.Builder) (obj4)).build().toString());
        obj = obj2;
        obj1 = obj3;
        ((HttpPut) (obj4)).setEntity(set);
        obj = obj2;
        obj1 = obj3;
        set = (WalletResponse)Response.executeRequest(((org.apache.http.client.methods.HttpUriRequest) (obj4)), com/kohls/mcommerce/opal/wallet/rest/containers/WalletResponse, null);
        obj = set;
        obj1 = set;
        set.setRequestType("post_");
        return set;
    }

    public WalletResponse getWalletData(String s)
    {
        String s1 = "https://kwallet.skavaone.com";
        Object obj = s1;
        if (KohlsPhoneApplication.getInstance() != null)
        {
            obj = s1;
            if (KohlsPhoneApplication.getInstance().getConfigurationUtils() != null)
            {
                obj = s1;
                if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig() != null)
                {
                    obj = s1;
                    if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL() != null)
                    {
                        obj = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL();
                    }
                }
            }
        }
        obj = Uri.parse(((String) (obj))).buildUpon();
        ((android.net.Uri.Builder) (obj)).path(Appconfig.WALLET_GET_BY_ID);
        ((android.net.Uri.Builder) (obj)).appendPath(s);
        s = (WalletResponse)Response.executeRequest(new HttpGet(((android.net.Uri.Builder) (obj)).build().toString()), com/kohls/mcommerce/opal/wallet/rest/containers/WalletResponse, null);
        s.setRequestType("get_");
        return s;
    }

    public NotificationResponse getWalletNotifications(String s)
    {
        String s2 = "https://kwallet.skavaone.com";
        String s1 = s2;
        if (KohlsPhoneApplication.getInstance() != null)
        {
            s1 = s2;
            if (KohlsPhoneApplication.getInstance().getConfigurationUtils() != null)
            {
                s1 = s2;
                if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig() != null)
                {
                    s1 = s2;
                    if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL() != null)
                    {
                        s1 = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL();
                    }
                }
            }
        }
        s = (NotificationResponse)Response.executeRequest(new HttpGet((new StringBuilder()).append(s1).append("/").append(Appconfig.WALLET_NOTIFICATION).append(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletId()).append("/walletItem/").append(s).append("/notifications").toString()), com/kohls/mcommerce/opal/wallet/rest/containers/NotificationResponse, null);
        s.setRequestType("get_");
        return s;
    }

    public WalletResponse getWalletbyEmail(String s)
    {
        String s1 = "https://kwallet.skavaone.com";
        Object obj = s1;
        if (KohlsPhoneApplication.getInstance() != null)
        {
            obj = s1;
            if (KohlsPhoneApplication.getInstance().getConfigurationUtils() != null)
            {
                obj = s1;
                if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig() != null)
                {
                    obj = s1;
                    if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL() != null)
                    {
                        obj = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL();
                    }
                }
            }
        }
        obj = Uri.parse(((String) (obj))).buildUpon();
        ((android.net.Uri.Builder) (obj)).path(Appconfig.WALLET_GET_BY_EMAIL);
        if (TextUtils.isEmpty(s))
        {
            ((android.net.Uri.Builder) (obj)).appendPath(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        } else
        {
            ((android.net.Uri.Builder) (obj)).appendPath(s);
        }
        s = (WalletResponse)Response.executeRequest(new HttpGet(((android.net.Uri.Builder) (obj)).build().toString()), com/kohls/mcommerce/opal/wallet/rest/containers/WalletResponse, null);
        s.setRequestType("post_");
        return s;
    }

    public NotificationResponse setWalletNotifications(String s, NotificationInputResponse notificationinputresponse, boolean flag)
    {
        String s1 = "https://kwallet.skavaone.com";
        Object obj = s1;
        if (KohlsPhoneApplication.getInstance() != null)
        {
            obj = s1;
            if (KohlsPhoneApplication.getInstance().getConfigurationUtils() != null)
            {
                obj = s1;
                if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig() != null)
                {
                    obj = s1;
                    if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL() != null)
                    {
                        obj = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletandLoyaltyBaseURL();
                    }
                }
            }
        }
        Object obj2 = (new StringBuilder()).append(((String) (obj))).append("/").append(Appconfig.WALLET_NOTIFICATION).append(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletId()).append("/walletItem/").append(s).append("/notifications").toString();
        Object obj1 = null;
        s1 = null;
        s = s1;
        obj = obj1;
        JSONObject jsonobject;
        JSONArray jsonarray;
        JSONObject jsonobject1;
        try
        {
            jsonobject = new JSONObject();
        }
        // Misplaced declaration of an exception variable
        catch (NotificationInputResponse notificationinputresponse)
        {
            notificationinputresponse.printStackTrace();
            return s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return ((NotificationResponse) (obj));
        }
        s = s1;
        obj = obj1;
        jsonarray = new JSONArray();
        s = s1;
        obj = obj1;
        jsonobject1 = new JSONObject();
        s = s1;
        obj = obj1;
        jsonobject1.put("notificationId", notificationinputresponse.getNotificationId());
        s = s1;
        obj = obj1;
        jsonobject1.put("notificationDelta", notificationinputresponse.getNotificationDelta());
        s = s1;
        obj = obj1;
        jsonobject1.put("enabled", notificationinputresponse.getEnabled());
        s = s1;
        obj = obj1;
        jsonobject1.put("mode", notificationinputresponse.getMode());
        s = s1;
        obj = obj1;
        jsonarray.put(jsonobject1);
        s = s1;
        obj = obj1;
        jsonobject.put("notificationEnabled", flag);
        s = s1;
        obj = obj1;
        jsonobject.put("notificationInputs", jsonarray);
        s = s1;
        obj = obj1;
        notificationinputresponse = new StringEntity(jsonobject.toString());
        s = s1;
        obj = obj1;
        obj2 = new HttpPost(((String) (obj2)));
        s = s1;
        obj = obj1;
        ((HttpPost) (obj2)).setEntity(notificationinputresponse);
        s = s1;
        obj = obj1;
        notificationinputresponse = (NotificationResponse)Response.executeRequest(((org.apache.http.client.methods.HttpUriRequest) (obj2)), com/kohls/mcommerce/opal/wallet/rest/containers/NotificationResponse, null);
        s = notificationinputresponse;
        obj = notificationinputresponse;
        notificationinputresponse.setRequestType("post_");
        return notificationinputresponse;
    }
}
