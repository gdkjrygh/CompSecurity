// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.catalogue;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedList;
import ly.kite.KiteSDK;
import ly.kite.KiteSDKException;
import ly.kite.journey.UserJourneyType;
import ly.kite.journey.creation.ProductCreationActivity;
import ly.kite.util.HTTPJSONRequest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package ly.kite.catalogue:
//            Bleed, MultipleCurrencyAmount, SingleCurrencyAmount, BorderF, 
//            MultipleUnitSize, UnitOfLength, SingleUnitSize, Product, 
//            Catalogue, MultipleDestinationShippingCosts, ICatalogueConsumer

public class CatalogueLoader
    implements ly.kite.util.HTTPJSONRequest.HTTPJSONRequestListener
{

    public static final long ANY_AGE_OK = -1L;
    private static final int DEFAULT_IMAGES_PER_PAGE = 1;
    private static final boolean DISPLAY_DEBUGGING = false;
    private static final String JSON_NAME_AMOUNT = "amount";
    private static final String JSON_NAME_BORDER = "ios_image_border";
    private static final String JSON_NAME_BOTTOM = "bottom";
    private static final String JSON_NAME_CENTIMETERS = "cm";
    private static final String JSON_NAME_COST = "cost";
    private static final String JSON_NAME_CURRENCY = "currency";
    private static final String JSON_NAME_DESCRIPTION = "description";
    private static final String JSON_NAME_FORMATTED_AMOUNT = "formatted";
    private static final String JSON_NAME_GROUP_IMAGE = "ios_sdk_class_photo";
    private static final String JSON_NAME_GROUP_LABEL = "ios_sdk_product_class";
    private static final String JSON_NAME_HEIGHT = "height";
    private static final String JSON_NAME_IMAGES_PER_PAGE = "images_per_page";
    private static final String JSON_NAME_IMAGE_ASPECT_RATIO = "image_aspect_ratio";
    private static final String JSON_NAME_IMAGE_BORDER = "image_border";
    private static final String JSON_NAME_INCH = "inch";
    private static final String JSON_NAME_LABEL_COLOUR = "ios_sdk_label_color";
    private static final String JSON_NAME_LEFT = "left";
    private static final String JSON_NAME_MASK_BLEED = "mask_bleed";
    private static final String JSON_NAME_MASK_URL = "mask_url";
    private static final String JSON_NAME_PIXELS = "px";
    private static final String JSON_NAME_PRODUCT_ARRAY = "objects";
    private static final String JSON_NAME_PRODUCT_CODE = "product_code";
    private static final String JSON_NAME_PRODUCT_DETAIL = "product";
    private static final String JSON_NAME_PRODUCT_HERO_IMAGE = "ios_sdk_cover_photo";
    private static final String JSON_NAME_PRODUCT_ID = "template_id";
    private static final String JSON_NAME_PRODUCT_NAME = "name";
    private static final String JSON_NAME_PRODUCT_SHOTS = "ios_sdk_product_shots";
    private static final String JSON_NAME_PRODUCT_SIZE = "size";
    private static final String JSON_NAME_PRODUCT_SUBCLASS = "ios_sdk_product_subclass";
    private static final String JSON_NAME_PRODUCT_TYPE = "ios_sdk_product_type";
    private static final String JSON_NAME_PRODUCT_UI_CLASS = "ios_sdk_ui_class";
    private static final String JSON_NAME_RIGHT = "right";
    private static final String JSON_NAME_SHIPPING_COSTS = "shipping_costs";
    private static final String JSON_NAME_TOP = "top";
    private static final String JSON_NAME_USER_CONFIG = "user_config";
    private static final String JSON_NAME_WIDTH = "width";
    private static final String LOG_TAG = "CatalogueLoader";
    private static final String TEMPLATE_REQUEST_FORMAT_STRING = "%s/template/?limit=100";
    private static CatalogueLoader sProductCache;
    private LinkedList mConsumerList;
    private Context mContext;
    private HTTPJSONRequest mHTTPJSONRequest;
    private Handler mHandler;
    private Catalogue mLastRetrievedCatalogue;
    private long mLastRetrievedElapsedRealtimeMillis;
    private String mLastRetrievedEnvironmentAPIKey;
    private String mRequestAPIKey;

    private CatalogueLoader(Context context)
    {
        mContext = context;
        mHandler = new Handler();
        mConsumerList = new LinkedList();
    }

    public static CatalogueLoader getInstance(Context context)
    {
        if (sProductCache == null)
        {
            sProductCache = new CatalogueLoader(context);
        }
        return sProductCache;
    }

    private static Bleed parseBleed(JSONArray jsonarray)
        throws JSONException
    {
        return new Bleed(jsonarray.getInt(0), jsonarray.getInt(1), jsonarray.getInt(2), jsonarray.getInt(3));
    }

    private static int parseColour(JSONArray jsonarray)
        throws JSONException
    {
        return jsonarray.getInt(0) << 16 & 0xff0000 | 0xff000000 | jsonarray.getInt(1) << 8 & 0xff00 | jsonarray.getInt(2) & 0xff;
    }

    private static MultipleCurrencyAmount parseCost(JSONArray jsonarray)
        throws JSONException
    {
        MultipleCurrencyAmount multiplecurrencyamount = new MultipleCurrencyAmount();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            multiplecurrencyamount.add(parseCost(jsonarray.getJSONObject(i)));
        }

        return multiplecurrencyamount;
    }

    private static SingleCurrencyAmount parseCost(JSONObject jsonobject)
        throws JSONException
    {
        return new SingleCurrencyAmount(Currency.getInstance(jsonobject.getString("currency")), new BigDecimal(jsonobject.getString("amount")), jsonobject.getString("formatted"));
    }

    private static BorderF parseImageBorder(JSONObject jsonobject)
        throws JSONException
    {
        return new BorderF((float)jsonobject.optDouble("top"), (float)jsonobject.optDouble("right"), (float)jsonobject.optDouble("bottom"), (float)jsonobject.optDouble("left"));
    }

    private static ArrayList parseProductShots(JSONArray jsonarray)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        while (i < jsonarray.length()) 
        {
            String s = jsonarray.getString(i);
            try
            {
                arraylist.add(new URL(s));
            }
            catch (MalformedURLException malformedurlexception)
            {
                Log.e("CatalogueLoader", (new StringBuilder()).append("Invalid URL: ").append(s).toString(), malformedurlexception);
            }
            i++;
        }
        return arraylist;
    }

    private static MultipleUnitSize parseProductSize(JSONObject jsonobject)
        throws JSONException
    {
        MultipleUnitSize multipleunitsize = new MultipleUnitSize();
        multipleunitsize.add(parseProductSize(jsonobject.getJSONObject("cm"), UnitOfLength.CENTIMETERS));
        multipleunitsize.add(parseProductSize(jsonobject.getJSONObject("inch"), UnitOfLength.INCHES));
        try
        {
            multipleunitsize.add(parseProductSize(jsonobject.getJSONObject("px"), UnitOfLength.PIXELS));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return multipleunitsize;
        }
        return multipleunitsize;
    }

    private static SingleUnitSize parseProductSize(JSONObject jsonobject, UnitOfLength unitoflength)
        throws JSONException
    {
        return new SingleUnitSize(unitoflength, (float)jsonobject.getDouble("width"), (float)jsonobject.getDouble("height"));
    }

    private static void parseProducts(JSONArray jsonarray, Catalogue catalogue)
    {
        int i = 0;
_L7:
        if (i >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
        JSONObject jsonobject = jsonarray.getJSONObject(i);
        double d;
        URL url;
        String s;
        UserJourneyType userjourneytype;
        String s1;
        String s2;
        String s3;
        MultipleCurrencyAmount multiplecurrencyamount;
        MultipleDestinationShippingCosts multipledestinationshippingcosts;
        URL url1;
        ArrayList arraylist;
        String s4;
        String s5;
        MultipleUnitSize multipleunitsize;
        JSONObject jsonobject1;
        int j;
        int k;
        Log.d("CatalogueLoader", (new StringBuilder()).append("Product JSON:\n").append(jsonobject.toString()).toString());
        s1 = jsonobject.getString("template_id");
        s2 = jsonobject.getString("name");
        s3 = jsonobject.getString("description");
        j = jsonobject.optInt("images_per_page", 1);
        multiplecurrencyamount = parseCost(jsonobject.getJSONArray("cost"));
        multipledestinationshippingcosts = parseShippingCosts(jsonobject.getJSONObject("shipping_costs"));
        jsonobject1 = jsonobject.getJSONObject("product");
        url = new URL(jsonobject1.getString("ios_sdk_class_photo"));
        url1 = new URL(jsonobject1.getString("ios_sdk_cover_photo"));
        k = parseColour(jsonobject1.getJSONArray("ios_sdk_label_color"));
        s = jsonobject1.getString("ios_sdk_product_class");
        arraylist = parseProductShots(jsonobject1.getJSONArray("ios_sdk_product_shots"));
        s4 = jsonobject1.getString("ios_sdk_product_type");
        userjourneytype = parseUserJourneyType(jsonobject1.getString("ios_sdk_ui_class"));
        s5 = jsonobject1.getString("product_code");
        multipleunitsize = parseProductSize(jsonobject1.getJSONObject("size"));
        d = jsonobject1.optDouble("image_aspect_ratio", 1.0D);
        float f;
        Object obj2;
        f = (float)d;
        obj2 = null;
        Object obj = new URL(jsonobject1.getString("mask_url"));
        try
        {
            obj1 = parseBleed(jsonobject1.getJSONArray("mask_bleed"));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            break MISSING_BLOCK_LABEL_485;
        }
        obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L8:
        try
        {
            obj2 = parseImageBorder(jsonobject1.getJSONObject("image_border"));
        }
        catch (JSONException jsonexception)
        {
            jsonexception = null;
        }
        obj = (new Product(s1, s5, s2, s4, k, userjourneytype, j)).setCost(multiplecurrencyamount).setDescription(s3).setShippingCosts(multipledestinationshippingcosts).setImageURLs(url1, arraylist).setLabelColour(k).setMask(((URL) (obj1)), ((Bleed) (obj))).setSize(multipleunitsize).setCreationImage(f, ((BorderF) (obj2)));
        Log.i("CatalogueLoader", "-- Found product --");
        Log.i("CatalogueLoader", ((Product) (obj)).toLogString(s));
        if (ProductCreationActivity.isSupported(userjourneytype)) goto _L4; else goto _L3
_L3:
        Log.i("CatalogueLoader", "-- Product discarded: no user journey --");
          goto _L5
_L4:
        catalogue.addProduct(s, url, ((Product) (obj)));
          goto _L5
        obj;
        obj1 = jsonobject;
_L6:
        Log.e("CatalogueLoader", (new StringBuilder()).append("Unable to parse JSON product: ").append(obj1).toString(), ((Throwable) (obj)));
        break; /* Loop/switch isn't completed */
_L2:
        return;
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
        obj;
        obj = null;
        obj1 = obj;
        obj = obj2;
          goto _L8
    }

    private static MultipleCurrencyAmount parseShippingCost(JSONObject jsonobject)
        throws JSONException
    {
        return new MultipleCurrencyAmount(jsonobject);
    }

    private static MultipleDestinationShippingCosts parseShippingCosts(JSONObject jsonobject)
        throws JSONException
    {
        MultipleDestinationShippingCosts multipledestinationshippingcosts = new MultipleDestinationShippingCosts();
        String s;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); multipledestinationshippingcosts.add(s, parseShippingCost(jsonobject.getJSONObject(s))))
        {
            s = (String)iterator.next();
        }

        return multipledestinationshippingcosts;
    }

    private static UserJourneyType parseUserJourneyType(String s)
    {
        try
        {
            s = UserJourneyType.valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private void postCatalogueToConsumer(Catalogue catalogue, ICatalogueConsumer icatalogueconsumer)
    {
    /* block-local class not found */
    class CatalogueCallbackRunnable {}

        catalogue = new CatalogueCallbackRunnable(catalogue, icatalogueconsumer);
        mHandler.post(catalogue);
    }

    private void postCatalogueToConsumers(Catalogue catalogue)
    {
        do
        {
            ICatalogueConsumer icatalogueconsumer = (ICatalogueConsumer)mConsumerList.pollFirst();
            if (icatalogueconsumer != null)
            {
                postCatalogueToConsumer(catalogue, icatalogueconsumer);
            } else
            {
                mHTTPJSONRequest = null;
                return;
            }
        } while (true);
    }

    private void postErrorToConsumer(Exception exception, ICatalogueConsumer icatalogueconsumer)
    {
    /* block-local class not found */
    class ErrorCallbackRunnable {}

        exception = new ErrorCallbackRunnable(exception, icatalogueconsumer);
        mHandler.post(exception);
    }

    private void postErrorToConsumers(Exception exception)
    {
        do
        {
            ICatalogueConsumer icatalogueconsumer = (ICatalogueConsumer)mConsumerList.pollFirst();
            if (icatalogueconsumer != null)
            {
                postErrorToConsumer(exception, icatalogueconsumer);
            } else
            {
                mHTTPJSONRequest = null;
                return;
            }
        } while (true);
    }

    public void cancelRequests()
    {
        if (mHTTPJSONRequest != null)
        {
            mHTTPJSONRequest.cancel();
            mHTTPJSONRequest = null;
        }
        if (mConsumerList != null)
        {
            mConsumerList.clear();
        }
    }

    public Catalogue getCachedCatalogue(long l)
    {
        long l1 = 0L;
        if (l >= 0L)
        {
            l1 = SystemClock.elapsedRealtime() - l;
        }
        if (mLastRetrievedElapsedRealtimeMillis >= l1)
        {
            return mLastRetrievedCatalogue;
        } else
        {
            return null;
        }
    }

    public void onCatalogue(JSONObject jsonobject)
    {
        Catalogue catalogue = new Catalogue(jsonobject.optJSONObject("user_config"));
        try
        {
            parseProducts(jsonobject.getJSONArray("objects"), catalogue);
            mLastRetrievedCatalogue = catalogue;
            mLastRetrievedEnvironmentAPIKey = mRequestAPIKey;
            mLastRetrievedElapsedRealtimeMillis = SystemClock.elapsedRealtime();
            postCatalogueToConsumers(catalogue);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            postErrorToConsumers(jsonobject);
        }
    }

    public void onError(Exception exception)
    {
        postErrorToConsumers(exception);
    }

    public void onSuccess(int i, JSONObject jsonobject)
    {
        if (i >= 200 && i <= 299)
        {
            onCatalogue(jsonobject);
            return;
        }
        try
        {
            jsonobject = jsonobject.getJSONObject("error");
            String s = jsonobject.getString("message");
            jsonobject.getString("code");
            postErrorToConsumers(new KiteSDKException(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            postErrorToConsumers(jsonobject);
        }
    }

    public void requestCatalogue(long l, ICatalogueConsumer icatalogueconsumer)
    {
        long l1 = 0L;
        if (mHTTPJSONRequest != null)
        {
            mConsumerList.addLast(icatalogueconsumer);
            return;
        }
        String s = KiteSDK.getInstance(mContext).getAPIKey();
        if (mLastRetrievedEnvironmentAPIKey != null && mLastRetrievedEnvironmentAPIKey.equals(s) && mLastRetrievedElapsedRealtimeMillis > 0L)
        {
            if (l >= 0L)
            {
                l1 = SystemClock.elapsedRealtime() - l;
            }
            if (mLastRetrievedElapsedRealtimeMillis >= l1)
            {
                postCatalogueToConsumer(mLastRetrievedCatalogue, icatalogueconsumer);
                return;
            }
        }
        String s1 = String.format("%s/template/?limit=100", new Object[] {
            KiteSDK.getInstance(mContext).getAPIEndpoint()
        });
        mHTTPJSONRequest = new HTTPJSONRequest(mContext, ly.kite.util.HTTPJSONRequest.HttpMethod.GET, s1, null, null);
        mConsumerList.addLast(icatalogueconsumer);
        mRequestAPIKey = s;
        mHTTPJSONRequest.start(this);
    }

    public void requestCatalogue(long l, String as[], ICatalogueConsumer icatalogueconsumer)
    {
    /* block-local class not found */
    class CatalogueFilterConsumer {}

        requestCatalogue(l, ((ICatalogueConsumer) (new CatalogueFilterConsumer(as, icatalogueconsumer))));
    }

    public void requestCatalogue(ICatalogueConsumer icatalogueconsumer)
    {
        requestCatalogue(-1L, icatalogueconsumer);
    }
}
