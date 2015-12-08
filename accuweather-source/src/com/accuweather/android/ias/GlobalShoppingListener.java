// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.ias;

import android.content.Context;
import android.content.SharedPreferences;
import com.accuweather.android.utilities.Logger;
import com.amazon.device.associates.Offset;
import com.amazon.device.associates.PurchaseExperience;
import com.amazon.device.associates.PurchaseResponse;
import com.amazon.device.associates.Receipt;
import com.amazon.device.associates.ReceiptsResponse;
import com.amazon.device.associates.SearchByIdResponse;
import com.amazon.device.associates.SearchResponse;
import com.amazon.device.associates.ServiceStatusResponse;
import com.amazon.device.associates.ShoppingListener;
import com.amazon.device.associates.UserData;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.accuweather.android.ias:
//            DialogHelper

public class GlobalShoppingListener
    implements ShoppingListener
{

    private static final GlobalShoppingListener instance = new GlobalShoppingListener();
    private static ShoppingListener localListener = null;
    private static Context mContext = null;
    public static boolean mDigitalBundleSupported = false;
    public static boolean mInAppShoppingSupported = false;
    public static boolean mSearchSupported = false;
    private static String mUserId = null;

    public GlobalShoppingListener()
    {
    }

    public static GlobalShoppingListener getInstance()
    {
        return instance;
    }

    public static String getUserId()
    {
        return mUserId;
    }

    public static void setUserId(String s)
    {
        mUserId = s;
    }

    public void onPurchaseResponse(PurchaseResponse purchaseresponse)
    {
        Logger.i(getClass().getName(), "In onPurchaseResponse().");
        if (purchaseresponse.getStatus() != com.amazon.device.associates.PurchaseResponse.Status.SUCCESSFUL)
        {
            DialogHelper.showDialog(mContext, "Sorry", "An error has occured while processing your order.");
        }
        localListener.onPurchaseResponse(purchaseresponse);
    }

    public void onReceiptsResponse(ReceiptsResponse receiptsresponse)
    {
        if (receiptsresponse.getStatus() == com.amazon.device.associates.ReceiptsResponse.Status.SUCCESSFUL)
        {
            Object obj = receiptsresponse.getNextOffset();
            SharedPreferences sharedpreferences = mContext.getSharedPreferences(mUserId, 0);
            android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putString("offsetKey", ((Offset) (obj)).toString());
            obj = receiptsresponse.getReceipts().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                Receipt receipt = (Receipt)((Iterator) (obj)).next();
                int j = sharedpreferences.getInt(receipt.getProductId(), 0);
                boolean flag = sharedpreferences.getBoolean(receipt.getReceiptId(), false);
                int i;
                if (flag && receipt.isCanceled())
                {
                    i = j - 1;
                    editor.putBoolean(receipt.getReceiptId(), false);
                } else
                {
                    i = j;
                    if (!flag)
                    {
                        i = j;
                        if (!receipt.isCanceled())
                        {
                            i = j + 1;
                            editor.putBoolean(receipt.getReceiptId(), true);
                        }
                    }
                }
                editor.putInt(receipt.getProductId(), i);
            }
            editor.commit();
        }
        localListener.onReceiptsResponse(receiptsresponse);
    }

    public void onSearchByIdResponse(SearchByIdResponse searchbyidresponse)
    {
        localListener.onSearchByIdResponse(searchbyidresponse);
    }

    public void onSearchResponse(SearchResponse searchresponse)
    {
        localListener.onSearchResponse(searchresponse);
    }

    public void onServiceStatusResponse(ServiceStatusResponse servicestatusresponse)
    {
        mSearchSupported = servicestatusresponse.canSearch();
        mDigitalBundleSupported = servicestatusresponse.canGetReceipts();
        if (servicestatusresponse.getSupportedPurchaseExperiences().contains(PurchaseExperience.IN_APP))
        {
            mInAppShoppingSupported = true;
        }
        if (mInAppShoppingSupported)
        {
            setUserId(servicestatusresponse.getUserData().getUserId());
        } else
        {
            setUserId(null);
        }
        localListener.onServiceStatusResponse(servicestatusresponse);
    }

    public void setContext(Context context)
    {
        mContext = context;
    }

    public void setLocalListener(ShoppingListener shoppinglistener)
    {
        localListener = shoppinglistener;
    }

}
