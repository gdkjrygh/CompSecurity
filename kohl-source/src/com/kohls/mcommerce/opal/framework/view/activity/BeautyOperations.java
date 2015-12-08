// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.po.CreateListPO;
import com.kohls.mcommerce.opal.common.po.MyListPO;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.fragment.productdetails.ProductDetailsFragment;
import com.kohls.mcommerce.opal.framework.view.fragment.productdetails.helper.ProductDetailHelper;
import com.kohls.mcommerce.opal.helper.adapter.RestClient;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.helper.rest.BeautyRestHelper;
import com.kohls.mcommerce.opal.helper.rest.listener.BeautyOperationListener;
import com.kohls.mcommerce.opal.wallet.util.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            HomeActivity

public class BeautyOperations
    implements BeautyOperationListener
{

    static JSONArray jarray = null;
    public static String newListId;
    public static String originalListId;
    static JSONArray originalListItems;
    private final int ACTION_ADD_ITEMS_TO_NEW_LIST;
    private final int ACTION_CREATE_NEW_LIST;
    private final int ACTION_GET_ITEMS;
    private final int ACTION_GET_LIST_ITEM;
    private final int ACTION_POST_ITEM;
    private final int ACTION_POST_USER;
    public String LoggedInUser;
    private int actionPerformed;
    public Object add;
    private int counter;
    StringBuilder dataStr;
    int extra;
    private WeakReference fragment;
    public JSONArray jsonArray;
    public JSONArray listItems;
    BeautyOperationListener listener;
    private Activity mActivity;
    private com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config mConfig;
    protected com.kohls.mcommerce.opal.framework.vo.ProductDetailVO.Payload.Product mProduct;
    protected ProductDetailHelper mProductHelper;
    private final ResultReceiver mResultReceiver;
    private int maxCounter;
    public String newListName;
    ProgressDialog progressDialog;
    HttpResponse response;
    String subTitle;
    private TaskCaller taskCaller;
    String updatedDataStr;
    public String userLists[];

    public BeautyOperations(Activity activity)
    {
        actionPerformed = 0;
        response = null;
        ACTION_GET_LIST_ITEM = 1001;
        ACTION_POST_USER = 1002;
        ACTION_POST_ITEM = 1004;
        ACTION_GET_ITEMS = 1006;
        ACTION_CREATE_NEW_LIST = 1007;
        ACTION_ADD_ITEMS_TO_NEW_LIST = 1008;
        counter = 1;
        maxCounter = 0;
        mResultReceiver = new _cls1(null);
        extra = 0;
        subTitle = "";
        mConfig = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig();
        mActivity = activity;
    }

    public BeautyOperations(Activity activity, String s)
    {
        actionPerformed = 0;
        response = null;
        ACTION_GET_LIST_ITEM = 1001;
        ACTION_POST_USER = 1002;
        ACTION_POST_ITEM = 1004;
        ACTION_GET_ITEMS = 1006;
        ACTION_CREATE_NEW_LIST = 1007;
        ACTION_ADD_ITEMS_TO_NEW_LIST = 1008;
        counter = 1;
        maxCounter = 0;
        mResultReceiver = new _cls1(null);
        extra = 0;
        subTitle = "";
        mConfig = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig();
        originalListId = s;
        mActivity = activity;
    }

    private String getCreateListUrl(String s)
    {
        Object obj = new CreateListPO();
        obj.getClass();
        com.kohls.mcommerce.opal.common.po.CreateListPO.LoggedInUser loggedinuser = new com.kohls.mcommerce.opal.common.po.CreateListPO.LoggedInUser(((CreateListPO) (obj)));
        String s1 = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref();
        obj = s1;
        if (s1.contains(" "))
        {
            obj = s1.replace(" ", "");
        }
        Object obj1 = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserLastnameFromPref();
        s1 = ((String) (obj1));
        if (((String) (obj1)).contains(" "))
        {
            s1 = ((String) (obj1)).replace(" ", "");
        }
        loggedinuser.setemail(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        loggedinuser.setretailerUserId(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserID());
        loggedinuser.setfirstName(((String) (obj)));
        loggedinuser.setlastName(s1);
        obj1 = new StringBuffer();
        String s2 = UtilityMethods.getSaltValue();
        if (!TextUtils.isEmpty(s2))
        {
            ((StringBuffer) (obj1)).append(s2);
        }
        ((StringBuffer) (obj1)).append(((String) (obj)));
        ((StringBuffer) (obj1)).append(s1);
        ((StringBuffer) (obj1)).append(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        loggedinuser.setcheckSum(UtilityMethods.getMD5HexString(((StringBuffer) (obj1)).toString()));
        return (new StringBuilder()).append(UtilityMethods.getBaseListUrl()).append("createList?listName=").append(s).append("&listType=wishlist&budget=&listEventDate=&isPublic=false&emailOptIn=false&loggedInUser=").append(UtilityMethods.createJsonFromModel(loggedinuser)).toString().replace(" ", "%20");
    }

    private String getListUrl()
    {
        MyListPO mylistpo = new MyListPO();
        mylistpo.setnumItems(5);
        mylistpo.setnumLists(50);
        mylistpo.getClass();
        com.kohls.mcommerce.opal.common.po.MyListPO.LoggedInUser loggedinuser = new com.kohls.mcommerce.opal.common.po.MyListPO.LoggedInUser(mylistpo);
        String s1 = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref();
        String s = s1;
        if (s1.contains(" "))
        {
            s = s1.replace(" ", "");
        }
        Object obj = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserLastnameFromPref();
        s1 = ((String) (obj));
        if (((String) (obj)).contains(" "))
        {
            s1 = ((String) (obj)).replace(" ", "");
        }
        loggedinuser.setemail(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        loggedinuser.setretailerUserId(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserID());
        loggedinuser.setfirstName(s);
        loggedinuser.setlastName(s1);
        obj = new StringBuffer();
        String s2 = UtilityMethods.getSaltValue();
        if (!TextUtils.isEmpty(s2))
        {
            ((StringBuffer) (obj)).append(s2);
        }
        ((StringBuffer) (obj)).append(s);
        ((StringBuffer) (obj)).append(s1);
        ((StringBuffer) (obj)).append(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        loggedinuser.setcheckSum(UtilityMethods.getMD5HexString(((StringBuffer) (obj)).toString()));
        LoggedInUser = UtilityMethods.createJsonFromModel(loggedinuser);
        return (new StringBuilder()).append(mConfig.getShowListItemsUrl()).append("").append(RestClient.prepareParamString(UtilityMethods.getMapFromObject(mylistpo, com/kohls/mcommerce/opal/common/po/MyListPO), null)).append("&loggedInUser=").append(UtilityMethods.createJsonFromModel(loggedinuser)).toString();
    }

    private com.kohls.mcommerce.opal.common.po.MyListPO.LoggedInUser getUserUrl()
    {
        Object obj = new MyListPO();
        ((MyListPO) (obj)).setnumItems(5);
        ((MyListPO) (obj)).setnumLists(50);
        obj.getClass();
        com.kohls.mcommerce.opal.common.po.MyListPO.LoggedInUser loggedinuser = new com.kohls.mcommerce.opal.common.po.MyListPO.LoggedInUser(((MyListPO) (obj)));
        String s = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref();
        obj = s;
        if (s.contains(" "))
        {
            obj = s.replace(" ", "");
        }
        Object obj1 = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserLastnameFromPref();
        s = ((String) (obj1));
        if (((String) (obj1)).contains(" "))
        {
            s = ((String) (obj1)).replace(" ", "");
        }
        loggedinuser.setemail(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        loggedinuser.setretailerUserId(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserID());
        loggedinuser.setfirstName(((String) (obj)));
        loggedinuser.setlastName(s);
        obj1 = new StringBuffer();
        String s1 = UtilityMethods.getSaltValue();
        if (!TextUtils.isEmpty(s1))
        {
            ((StringBuffer) (obj1)).append(s1);
        }
        ((StringBuffer) (obj1)).append(((String) (obj)));
        ((StringBuffer) (obj1)).append(s);
        ((StringBuffer) (obj1)).append(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        loggedinuser.setcheckSum(UtilityMethods.getMD5HexString(((StringBuffer) (obj1)).toString()));
        return loggedinuser;
    }

    public void JSONList(String s)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        s = new JSONObject(s);
        actionPerformed;
        JVM INSTR lookupswitch 3: default 199
    //                   1001: 52
    //                   1006: 125
    //                   1007: 169;
           goto _L2 _L3 _L4 _L5
_L3:
        s = s.getJSONArray("lists");
        int i;
        if (s == null)
        {
            try
            {
                showDialogFromQRcode(mActivity, 1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
            return;
        }
        i = 0;
_L7:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        s.getJSONObject(i).getString("listName");
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        newListName = UtilityMethods.getNonExistingListName(s);
        getListItems(originalListId);
        return;
_L4:
        originalListItems = s.getJSONArray("listItems");
        if (originalListItems == null || originalListItems.length() == 0)
        {
            showDialogFromQRcode(mActivity, 0);
            return;
        }
        createNewList(newListName);
        return;
_L5:
        newListId = s.getJSONObject("wishList").getString("listId");
        AnalyticsHelper.sendAnalyticsForCreateListConfirmation();
        addItemToNewList(originalListItems, newListId);
        return;
_L2:
    }

    public void addItemToNewList(JSONArray jsonarray, String s)
    {
        actionPerformed = 1008;
        maxCounter = jsonarray.length();
        int i = 0;
        while (i < jsonarray.length()) 
        {
            try
            {
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                dataStr = new StringBuilder();
                dataStr.append("{\"itemType\":\"").append(jsonobject.getString("itemType")).append("\",\"itemId\":\"").append(jsonobject.getString("itemId")).append("\",\"itemProductId\":\"").append(jsonobject.getString("itemProductId")).append("\",\"productCode\":\"").append(jsonobject.getString("productCode")).append("\",\"itemColor\":\"").append(jsonobject.getString("itemColor")).append("\",\"itemSize\":\"").append(jsonobject.getString("itemSize")).append("\",\"wantedQty\":\"").append(jsonobject.getString("wantedQty")).append("\",\"priority\":\"1\",\"priceWhenCreated\":\"").append(jsonobject.getString("priceWhenCreated")).append("\",\"titleIfUnavailable\":\"\",\"imageUrlIfUnavailable\":\"\",\"categoryIfUnavailable\":\"\",\"listId\":\"").append(s).append("\",\"upcCode\":\"").append(jsonobject.getString("upcCode")).append("\"}");
                updatedDataStr = replaceAll(dataStr, "null", "");
    /* block-local class not found */
    class AsyncCaller {}

                (new AsyncCaller(null)).execute(new String[] {
                    updatedDataStr
                });
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
            }
            i++;
        }
    }

    public void createNewList(String s)
    {
        actionPerformed = 1007;
        (new BeautyRestHelper(this, com.kohls.mcommerce.opal.helper.rest.BeautyRestHelper.Method.GET, getCreateListUrl(s), null, null)).performTask();
        AnalyticsHelper.sendAnalyticsForCreateList();
    }

    public void getListAndAddItemsInNewList()
    {
    /* block-local class not found */
    class TaskCaller {}

        taskCaller = new TaskCaller(null);
        taskCaller.execute(new Void[0]);
    }

    public void getListItems(String s)
    {
        actionPerformed = 1006;
        (new BeautyRestHelper(this, com.kohls.mcommerce.opal.helper.rest.BeautyRestHelper.Method.GET, (new StringBuilder()).append(UtilityMethods.getBaseListUrl()).append("showItemsInPublicList?listId=").append(s).toString(), null, null)).performTask();
    }

    public void getUserLists()
    {
        actionPerformed = 1001;
        (new BeautyRestHelper(this, com.kohls.mcommerce.opal.helper.rest.BeautyRestHelper.Method.GET, getListUrl(), null, null)).performTask();
    }

    public void onFailure(Error error)
    {
        counter = counter + 1;
        if (fragment != null && fragment.get() != null && ((ProductDetailsFragment)fragment.get()).isVisible() && !((ProductDetailsFragment)fragment.get()).isRemoving())
        {
            ((ProductDetailsFragment)fragment.get()).notifyViewOnFailure(error);
        }
        Logger.debug("onFailure", "onFailure of BeautyOperations");
    }

    public void onSuccess(Object obj)
    {
        actionPerformed;
        JVM INSTR tableswitch 1001 1007: default 48
    //                   1001 58
    //                   1002 68
    //                   1003 48
    //                   1004 79
    //                   1005 48
    //                   1006 175
    //                   1007 185;
           goto _L1 _L2 _L3 _L1 _L4 _L1 _L5 _L6
_L1:
        Logger.debug("onSuccess", "onSuccess of BeautyOperations");
        return;
_L2:
        JSONList(Constants.GET_USERS_LISTS);
        continue; /* Loop/switch isn't completed */
_L3:
        Constants.NEW_ACCOUNT = false;
        getUserLists();
        continue; /* Loop/switch isn't completed */
_L4:
        AnalyticsHelper.sendAnalyticsForAddProductToList();
        if (counter == maxCounter)
        {
            if (taskCaller != null && !taskCaller.isCancelled())
            {
                progressDialog.dismiss();
                obj = new Intent(mActivity, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
                ((Intent) (obj)).putExtra("open_screen_key", "qrcode");
                ((Intent) (obj)).setFlags(0x4000000);
                mActivity.startActivity(((Intent) (obj)));
            }
        } else
        {
            counter = counter + 1;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        JSONList(Constants.GET_USERS_LISTS);
        continue; /* Loop/switch isn't completed */
_L6:
        JSONList(Constants.GET_USERS_LISTS);
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void postItems(String s)
    {
        actionPerformed = 1004;
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost((new StringBuilder()).append(UtilityMethods.getBaseListUrl()).append("addItemsToList").toString());
        ArrayList arraylist = new ArrayList(2);
        arraylist.add(new BasicNameValuePair("listItem", s));
        arraylist.add(new BasicNameValuePair("loggedInUser", LoggedInUser));
        try
        {
            httppost.setEntity(new UrlEncodedFormEntity(arraylist));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        try
        {
            response = defaulthttpclient.execute(httppost);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public void postUser()
    {
        com.kohls.mcommerce.opal.common.po.MyListPO.LoggedInUser loggedinuser = getUserUrl();
        actionPerformed = 1002;
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost((new StringBuilder()).append(UtilityMethods.getBaseListUrl()).append("createOrGetUser").toString());
        ArrayList arraylist = new ArrayList(2);
        arraylist.add(new BasicNameValuePair("loggedInUser", UtilityMethods.createJsonFromModel(loggedinuser)));
        try
        {
            httppost.setEntity(new UrlEncodedFormEntity(arraylist));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception.printStackTrace();
        }
        try
        {
            response = defaulthttpclient.execute(httppost);
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        onSuccess(response);
    }

    public String replaceAll(StringBuilder stringbuilder, String s, String s1)
    {
        for (int i = stringbuilder.indexOf(s); i != -1; i = stringbuilder.indexOf(s, i + s1.length()))
        {
            stringbuilder.replace(i, s.length() + i, s1);
        }

        return stringbuilder.toString();
    }

    public void showDialogFromQRcode()
    {
        UtilityMethods.showAlertDialog(4001, mResultReceiver, "", mActivity.getResources().getString(0x7f080113), 0, mActivity.getResources().getString(0x7f080121), mActivity.getResources().getString(0x7f080107), "", false, true, mActivity);
    }

    public void showDialogFromQRcode(Context context, int i)
    {
        context = new android.app.AlertDialog.Builder(context);
        i;
        JVM INSTR tableswitch 0 1: default 32
    //                   0 54
    //                   1 65;
           goto _L1 _L2 _L3
_L1:
        context.setNegativeButton("OK", new _cls2());
        context.show();
        return;
_L2:
        context.setMessage(0x7f0800fb);
        continue; /* Loop/switch isn't completed */
_L3:
        context.setMessage(0x7f08010d);
        if (true) goto _L1; else goto _L4
_L4:
    }




    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
