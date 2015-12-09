// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.analytics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ly.kite.KiteSDK;
import ly.kite.address.Address;
import ly.kite.address.Country;
import ly.kite.catalogue.MultipleCurrencyAmount;
import ly.kite.catalogue.PrintJob;
import ly.kite.catalogue.PrintOrder;
import ly.kite.catalogue.Product;
import ly.kite.catalogue.SingleCurrencyAmount;
import ly.kite.pricing.OrderPricing;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package ly.kite.analytics:
//            IAnalyticsEventCallback, NullAnalyticsEventCallback, MixpanelAgent

public class Analytics
{

    public static final String ENTRY_POINT_JSON_PROPERTY_VALUE_HOME_SCREEN = "Home Screen";
    private static final String EVENT_NAME_CREATE_PAYMENT_SCREEN_VIEWED = "Payment Screen Viewed";
    private static final String EVENT_NAME_CREATE_PRODUCT_SCREEN_VIEWED = "Review Screen Viewed";
    private static final String EVENT_NAME_ORDER_SUBMISSION = "Print Order Submission";
    private static final String EVENT_NAME_PAYMENT_COMPLETED = "Payment Completed";
    private static final String EVENT_NAME_PRODUCT_ORDER_REVIEW_SCREEN_VIEWED = "Product Order Review Screen";
    private static final String EVENT_NAME_PRODUCT_OVERVIEW_SCREEN_VIEWED = "Product Description Screen Viewed";
    private static final String EVENT_NAME_PRODUCT_SELECTION_SCREEN_VIEWED = "Product Selection Screen Viewed";
    private static final String EVENT_NAME_SDK_LOADED = "Kite Loaded";
    private static final String EVENT_NAME_SHIPPING_SCREEN_VIEWED = "Shipping Screen Viewed";
    private static final String JSON_PROPERTY_NAME_API_KEY = "API Key";
    private static final String JSON_PROPERTY_NAME_API_TOKEN = "token";
    private static final String JSON_PROPERTY_NAME_APP_NAME = "App Name";
    private static final String JSON_PROPERTY_NAME_APP_PACKAGE = "App Package";
    private static final String JSON_PROPERTY_NAME_APP_VERSION = "App Version";
    private static final String JSON_PROPERTY_NAME_COST = "Cost";
    private static final String JSON_PROPERTY_NAME_EMAIL = "email";
    private static final String JSON_PROPERTY_NAME_ENTRY_POINT = "Entry Point";
    private static final String JSON_PROPERTY_NAME_ENVIRONMENT = "Environment";
    private static final String JSON_PROPERTY_NAME_EVENT = "event";
    private static final String JSON_PROPERTY_NAME_JOB_COUNT = "Job Count";
    private static final String JSON_PROPERTY_NAME_KITE_SDK_VERSION = "Kite SDK Version";
    private static final String JSON_PROPERTY_NAME_LOCALE_COUNTRY = "Locale Country";
    private static final String JSON_PROPERTY_NAME_MODEL = "model";
    private static final String JSON_PROPERTY_NAME_PAYMENT_METHOD = "Payment Method";
    private static final String JSON_PROPERTY_NAME_PHONE = "phone";
    private static final String JSON_PROPERTY_NAME_PLATFORM = "platform";
    private static final String JSON_PROPERTY_NAME_PLATFORM_VERSION = "platform version";
    private static final String JSON_PROPERTY_NAME_PRINT_ORDER_ID = "Print Order Id";
    private static final String JSON_PROPERTY_NAME_PRINT_SUBMISSION_ERROR = "Print Submission Error";
    private static final String JSON_PROPERTY_NAME_PRINT_SUBMISSION_SUCCESS = "Print Submission Success";
    private static final String JSON_PROPERTY_NAME_PRODUCT = "Product";
    private static final String JSON_PROPERTY_NAME_PRODUCT_NAME = "Product Name";
    private static final String JSON_PROPERTY_NAME_PROOF_OF_PAYMENT = "Proof of Payment";
    private static final String JSON_PROPERTY_NAME_PROPERTIES = "properties";
    private static final String JSON_PROPERTY_NAME_SCREEN_HEIGHT = "Screen Height";
    private static final String JSON_PROPERTY_NAME_SCREEN_WIDTH = "Screen Width";
    private static final String JSON_PROPERTY_NAME_SHIPPING_CITY = "Shipping City";
    private static final String JSON_PROPERTY_NAME_SHIPPING_COUNTRY = "Shipping Country";
    private static final String JSON_PROPERTY_NAME_SHIPPING_COUNTRY_CODE2 = "Shipping Country Code2";
    private static final String JSON_PROPERTY_NAME_SHIPPING_COUNTRY_CODE3 = "Shipping Country Code3";
    private static final String JSON_PROPERTY_NAME_SHIPPING_COUNTY = "Shipping County";
    private static final String JSON_PROPERTY_NAME_SHIPPING_EMAIL = "Shipping Email";
    private static final String JSON_PROPERTY_NAME_SHIPPING_LINE_1 = "Shipping Line 1";
    private static final String JSON_PROPERTY_NAME_SHIPPING_LINE_2 = "Shipping Line 2";
    private static final String JSON_PROPERTY_NAME_SHIPPING_PHONE = "Shipping Phone";
    private static final String JSON_PROPERTY_NAME_SHIPPING_POSTCODE = "Shipping Postcode";
    private static final String JSON_PROPERTY_NAME_SHIPPING_RECIPIENT = "Shipping Recipient";
    private static final String JSON_PROPERTY_NAME_SHIPPING_SCREEN_VARIANT = "Shipping Screen Variant";
    private static final String JSON_PROPERTY_NAME_SHOW_PHONE_ENTRY_FIELD = "Showing Phone Entry Field";
    private static final String JSON_PROPERTY_NAME_UNIQUE_USER_ID = "distinct_id";
    private static final String JSON_PROPERTY_NAME_VOUCHER_CODE = "Voucher Code";
    private static final String JSON_PROPERTY_VALUE_FALSE = "False";
    private static final String JSON_PROPERTY_VALUE_NO = "No";
    private static final String JSON_PROPERTY_VALUE_TRUE = "True";
    private static final String JSON_PROPERTY_VALUE_YES = "Yes";
    private static final String LOG_TAG = "Analytics";
    public static final String PAYMENT_METHOD_CREDIT_CARD = "Credit Card";
    public static final String PAYMENT_METHOD_PAYPAL = "PayPal";
    private static final String PLATFORM_JSON_PROPERTY_VALUE_ANDROID = "Android";
    private static final String SHARED_PREFERENCES_NAME = "kite_sdk_analytics_shared_prefs";
    public static final String VARIANT_JSON_PROPERTY_VALUE_CLASSIC_PLUS_ADDRESS_SEARCH = "Classic + Address Search";
    private static Analytics sAnalytics;
    private IAnalyticsEventCallback mCachedEventCallback;
    private HashMap mCachedPropertiesMap;
    private Context mContext;

    private Analytics(Context context)
    {
        mContext = context;
    }

    private static void addToJSON(PrintOrder printorder, JSONObject jsonobject)
    {
        Object obj;
        int i;
        Object obj1;
        Object obj3;
        int j;
        try
        {
            obj1 = printorder.getJobs();
            obj = new JSONArray();
        }
        // Misplaced declaration of an exception variable
        catch (PrintOrder printorder)
        {
            Log.e("Analytics", "Error setting JSON properties", printorder);
            return;
        }
        i = 0;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj1 = ((List) (obj1)).iterator();
        i = 0;
_L3:
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj3 = (PrintJob)((Iterator) (obj1)).next();
        j = i + 1;
        obj3 = ((PrintJob) (obj3)).getProduct();
        i = j;
        if (obj3 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((JSONArray) (obj)).put(((Product) (obj3)).getName());
        i = j;
        if (true) goto _L3; else goto _L2
_L2:
        Object obj2;
        jsonobject.put("Product", obj);
        jsonobject.put("Proof of Payment", printorder.getProofOfPayment());
        obj = printorder.getLastPrintSubmissionError();
        obj2 = printorder.getReceipt();
        if (obj == null) goto _L5; else goto _L4
_L4:
        jsonobject.put("Print Submission Success", "False");
        jsonobject.put("Print Submission Error", ((Exception) (obj)).toString());
_L7:
        obj = printorder.getPromoCode();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        jsonobject.put("Voucher Code", obj);
        obj2 = printorder.getUserData();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        obj = ((JSONObject) (obj2)).getString("email");
        obj2 = ((JSONObject) (obj2)).getString("phone");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        jsonobject.put("Shipping Email", obj);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        jsonobject.put("Shipping Phone", obj2);
        obj = printorder.getShippingAddress();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_361;
        }
        jsonobject.put("Shipping Recipient", nonNullString(((Address) (obj)).getRecipientName()));
        jsonobject.put("Shipping Line 1", nonNullString(((Address) (obj)).getLine1()));
        jsonobject.put("Shipping Line 2", nonNullString(((Address) (obj)).getLine2()));
        jsonobject.put("Shipping City", nonNullString(((Address) (obj)).getCity()));
        jsonobject.put("Shipping County", nonNullString(((Address) (obj)).getStateOrCounty()));
        jsonobject.put("Shipping Postcode", nonNullString(((Address) (obj)).getZipOrPostalCode()));
        obj = ((Address) (obj)).getCountry();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_445;
        }
        jsonobject.put("Shipping Country", nonNullString(((Country) (obj)).displayName()));
        jsonobject.put("Shipping Country Code2", nonNullString(((Country) (obj)).iso2Code()));
        jsonobject.put("Shipping Country Code3", nonNullString(((Country) (obj)).iso3Code()));
_L8:
        printorder = printorder.getOrderPricing();
        if (printorder == null)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        printorder = printorder.getTotalCost();
        if (printorder == null)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        printorder = printorder.get("GBP");
        if (printorder == null)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        jsonobject.put("Cost", printorder.getAmount());
        jsonobject.put("Job Count", i);
        return;
_L5:
        if (obj2 == null) goto _L7; else goto _L6
_L6:
        jsonobject.put("Print Order Id", obj2);
        jsonobject.put("Print Submission Success", "True");
        jsonobject.put("Print Submission Error", "False");
          goto _L7
        jsonobject.put("Shipping Country", "");
        jsonobject.put("Shipping Country Code2", "");
        jsonobject.put("Shipping Country Code3", "");
          goto _L8
    }

    private IAnalyticsEventCallback getEventCallback()
    {
        if (mCachedEventCallback == null)
        {
            String s = mContext.getString(ly.kite.R.string.analytics_event_callback_class_name);
            try
            {
                mCachedEventCallback = (IAnalyticsEventCallback)Class.forName(s).getConstructor(new Class[] {
                    android/content/Context
                }).newInstance(new Object[] {
                    mContext
                });
            }
            catch (Exception exception)
            {
                mCachedEventCallback = new NullAnalyticsEventCallback(mContext);
            }
        }
        return mCachedEventCallback;
    }

    public static Analytics getInstance(Context context)
    {
        if (sAnalytics == null)
        {
            sAnalytics = new Analytics(context);
        }
        return sAnalytics;
    }

    private JSONObject getPropertiesJSONObject()
    {
        if (mCachedPropertiesMap == null)
        {
            mCachedPropertiesMap = new HashMap();
            mCachedPropertiesMap.put("token", "cdf64507670dd359c43aa8895fb87676");
            mCachedPropertiesMap.put("distinct_id", KiteSDK.getInstance(mContext).getUniqueUserId());
            mCachedPropertiesMap.put("App Package", mContext.getPackageName());
            mCachedPropertiesMap.put("App Name", mContext.getString(mContext.getApplicationInfo().labelRes));
            mCachedPropertiesMap.put("App Version", "1.0");
            mCachedPropertiesMap.put("platform", "Android");
            mCachedPropertiesMap.put("platform version", android.os.Build.VERSION.RELEASE);
            mCachedPropertiesMap.put("model", Build.MODEL);
            Object obj = mContext.getResources().getDisplayMetrics();
            mCachedPropertiesMap.put("Screen Width", Integer.valueOf(((DisplayMetrics) (obj)).widthPixels));
            mCachedPropertiesMap.put("Screen Height", Integer.valueOf(((DisplayMetrics) (obj)).heightPixels));
            obj = KiteSDK.getInstance(mContext);
            ly.kite.KiteSDK.Environment environment = ((KiteSDK) (obj)).getEnvironment();
            mCachedPropertiesMap.put("Environment", environment.getName());
            mCachedPropertiesMap.put("API Key", ((KiteSDK) (obj)).getAPIKey());
            mCachedPropertiesMap.put("Kite SDK Version", "4.0.1");
            mCachedPropertiesMap.put("Locale Country", Country.getInstance(Locale.getDefault()).displayName());
        }
        return new JSONObject(mCachedPropertiesMap);
    }

    private static String nonNullString(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = String.valueOf("");
        }
        return s1;
    }

    private void trackEvent(String s)
    {
        trackEvent(s, getPropertiesJSONObject());
    }

    private void trackEvent(String s, JSONObject jsonobject)
    {
        JSONObject jsonobject1 = new JSONObject();
        try
        {
            jsonobject1.put("event", s);
            jsonobject1.put("properties", jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Analytics", "Error setting JSON properties", s);
        }
        MixpanelAgent.getInstance(mContext).trackEvent(jsonobject1);
    }

    public void trackCreateProductScreenViewed(Product product)
    {
        JSONObject jsonobject = getPropertiesJSONObject();
        try
        {
            jsonobject.put("Product Name", product.getName());
        }
        catch (JSONException jsonexception)
        {
            Log.e("Analytics", "Error setting JSON properties", jsonexception);
        }
        trackEvent("Review Screen Viewed", jsonobject);
        getEventCallback().onCreateProductScreenViewed(product);
    }

    public void trackOrderSubmission(PrintOrder printorder)
    {
        JSONObject jsonobject = getPropertiesJSONObject();
        addToJSON(printorder, jsonobject);
        trackEvent("Print Order Submission", jsonobject);
        getEventCallback().onOrderSubmission(printorder);
    }

    public void trackPaymentCompleted(PrintOrder printorder, String s)
    {
        JSONObject jsonobject = getPropertiesJSONObject();
        addToJSON(printorder, jsonobject);
        try
        {
            jsonobject.put("Payment Method", s);
        }
        catch (JSONException jsonexception)
        {
            Log.e("Analytics", "Error setting JSON properties", jsonexception);
        }
        trackEvent("Payment Completed", jsonobject);
        getEventCallback().onPaymentCompleted(printorder, s);
    }

    public void trackPaymentScreenViewed(PrintOrder printorder)
    {
        JSONObject jsonobject = getPropertiesJSONObject();
        addToJSON(printorder, jsonobject);
        trackEvent("Payment Screen Viewed", jsonobject);
        getEventCallback().onPaymentScreenViewed(printorder);
    }

    public void trackProductOrderReviewScreenViewed(Product product)
    {
        JSONObject jsonobject = getPropertiesJSONObject();
        try
        {
            jsonobject.put("Product Name", product.getName());
        }
        catch (JSONException jsonexception)
        {
            Log.e("Analytics", "Error setting JSON properties", jsonexception);
        }
        trackEvent("Product Order Review Screen", jsonobject);
        getEventCallback().onProductOrderReviewScreenViewed(product);
    }

    public void trackProductOverviewScreenViewed(Product product)
    {
        JSONObject jsonobject = getPropertiesJSONObject();
        try
        {
            jsonobject.put("Product Name", product.getName());
        }
        catch (JSONException jsonexception)
        {
            Log.e("Analytics", "Error setting JSON properties", jsonexception);
        }
        trackEvent("Product Description Screen Viewed", jsonobject);
        getEventCallback().onProductOverviewScreenViewed(product);
    }

    public void trackProductSelectionScreenViewed()
    {
        trackEvent("Product Selection Screen Viewed");
        getEventCallback().onProductSelectionScreenViewed();
    }

    public void trackSDKLoaded(String s)
    {
        JSONObject jsonobject = getPropertiesJSONObject();
        try
        {
            jsonobject.put("Entry Point", s);
        }
        catch (JSONException jsonexception)
        {
            Log.e("Analytics", "Error setting JSON properties", jsonexception);
        }
        trackEvent("Kite Loaded", jsonobject);
        getEventCallback().onSDKLoaded(s);
    }

    public void trackShippingScreenViewed(PrintOrder printorder, String s, boolean flag)
    {
        JSONObject jsonobject;
        jsonobject = getPropertiesJSONObject();
        addToJSON(printorder, jsonobject);
        jsonobject.put("Shipping Screen Variant", s);
        String s1;
        if (flag)
        {
            s1 = "Yes";
        } else
        {
            s1 = "No";
        }
        try
        {
            jsonobject.put("Showing Phone Entry Field", s1);
        }
        catch (JSONException jsonexception)
        {
            Log.e("Analytics", "Error setting JSON properties", jsonexception);
        }
        trackEvent("Shipping Screen Viewed", jsonobject);
        getEventCallback().onShippingScreenViewed(printorder, s, flag);
        return;
    }
}
