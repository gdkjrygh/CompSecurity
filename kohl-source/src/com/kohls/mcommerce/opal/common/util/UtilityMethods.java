// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.util;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.location.Address;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.os.ResultReceiver;
import android.telephony.TelephonyManager;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kohls.mcommerce.opal.common.app.KohlsActivityLifecycleCallbacks;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.po.CalculateOrderPO;
import com.kohls.mcommerce.opal.common.po.RecommendationsPO;
import com.kohls.mcommerce.opal.common.po.StoreLocatorPO;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.common.value.ConstantValues;
import com.kohls.mcommerce.opal.framework.controller.ControllerFactory;
import com.kohls.mcommerce.opal.framework.controller.iface.IPersistentCartController;
import com.kohls.mcommerce.opal.framework.controller.iface.IRefreshTokenController;
import com.kohls.mcommerce.opal.framework.listener.CartListener;
import com.kohls.mcommerce.opal.framework.view.activity.AccountActivity;
import com.kohls.mcommerce.opal.framework.view.activity.CollectionsActivity;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.framework.view.activity.OrderTrackingStatusActivity;
import com.kohls.mcommerce.opal.framework.view.activity.ProductDetailsActivity;
import com.kohls.mcommerce.opal.framework.view.activity.RatingAndReviewActivity;
import com.kohls.mcommerce.opal.framework.view.activity.RewardIdHelpActivity;
import com.kohls.mcommerce.opal.framework.view.activity.ScanActivity;
import com.kohls.mcommerce.opal.framework.view.activity.ScanHelpActivity;
import com.kohls.mcommerce.opal.framework.view.activity.StoreDetailActivity;
import com.kohls.mcommerce.opal.framework.view.activity.WebViewActivity;
import com.kohls.mcommerce.opal.framework.view.fragment.BaseDialogFragment;
import com.kohls.mcommerce.opal.framework.vo.GeoCoderVO;
import com.kohls.mcommerce.opal.helper.adapter.AdapterHelper;
import com.kohls.mcommerce.opal.helper.adapter.AdapterProcedure;
import com.kohls.mcommerce.opal.helper.adapter.RestClient;
import com.kohls.mcommerce.opal.helper.adapter.listener.IAdapterListener;
import com.kohls.mcommerce.opal.helper.cache.inmemory.CacheFlushHelper;
import com.kohls.mcommerce.opal.helper.db.custom.DBShoppingBagHelper;
import com.kohls.mcommerce.opal.helper.error.AppException;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import com.kohls.mcommerce.opal.notifications.NotificationController;
import com.kohls.mcommerce.opal.wallet.rest.containers.LoyaltyProfileResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ProfileData;
import com.kohls.mcommerce.opal.wallet.util.Base64;
import com.kohls.mcommerce.opal.wallet.util.CustomTypeFace;
import com.kohls.mcommerce.opal.wallet.util.PointsIndicatorUtil;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;
import com.kohls.mcommerce.opal.wl.HybridScreen;
import com.kohls.mcommerce.opal.wl.WLActivity;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kohls.mcommerce.opal.common.util:
//            Logger, RegistryObject, ConfigurationUtils, ServerLogger

public final class UtilityMethods
{

    private static final String ELLIPSES = "..";
    public static final String EMAIL_MIME_TYPE = "text/plain";
    private static final String EXTRA_SCREEN_TO_LOAD = "screenToLoad";
    public static final int ID_SORT_AVAILABILITY = 1000;
    public static final int ID_SORT_DISTANCE = 1001;
    public static final int ID_SORT_MYSTORE_DISTANCE = 1003;
    public static final int ID_SORT_STORENAME = 1002;
    public static final String IN_STOCK = "In";
    public static final String LOW_STOCK = "Low";
    public static final String MY_STORE_LOCATION = "my store location";
    public static final String OUT_STOCK = "Out";

    public UtilityMethods()
    {
    }

    public static boolean IsMatch(String s, String s1)
    {
        boolean flag;
        try
        {
            flag = Pattern.compile(s1).matcher(s).matches();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.debug("REGEX", "REGEX Error");
            return false;
        }
        return flag;
    }

    private static boolean addressHasCityandStateInfo(Address address, String s, String s1)
    {
_L2:
        return false;
        if (address == null || s1 == null || address.getFeatureName() == null || s != null && address.getFeatureName().equalsIgnoreCase(s)) goto _L2; else goto _L1
_L1:
        if (s1 == null || !isTextOnlyNumeric(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (address.getPostalCode() == null || !address.getPostalCode().contains(s1)) goto _L2; else goto _L3
_L3:
        return true;
        if (s1 == null || address == null || address.getLocality() == null && address.getAdminArea() == null) goto _L2; else goto _L4
_L4:
        return true;
    }

    public static ArrayList asList(SparseArray sparsearray)
    {
        if (sparsearray != null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = null;
_L4:
        return arraylist;
_L2:
        ArrayList arraylist1 = new ArrayList(sparsearray.size());
        int i = 0;
        do
        {
            arraylist = arraylist1;
            if (i >= sparsearray.size())
            {
                continue;
            }
            if (sparsearray.valueAt(i) != null)
            {
                arraylist1.add(sparsearray.valueAt(i));
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean canGetLocation(Context context)
    {
        context = (LocationManager)context.getSystemService("location");
        boolean flag = context.isProviderEnabled("gps");
        boolean flag1 = context.isProviderEnabled("network");
        return flag || flag1;
    }

    public static boolean checkAndLaunchPDPOrPMP(String s, Context context)
    {
        Object obj;
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        flag = false;
        flag2 = false;
        flag5 = false;
        flag6 = false;
        flag3 = false;
        flag4 = false;
        obj = null;
        i = 0;
        if (s != null)
        {
            obj = s;
        }
        flag1 = flag;
        if (obj == null) goto _L2; else goto _L1
_L1:
        s = (new URL(URLDecoder.decode(((String) (obj)), "UTF-8"))).getQuery();
        String s36;
        Object obj5;
        s36 = null;
        obj5 = null;
        flag1 = flag;
        if (s == null) goto _L2; else goto _L3
_L3:
        String as[];
        int k;
        as = s.replace(" ", "+").split("&");
        k = as.length;
        int j;
        j = 0;
        s = null;
_L14:
        if (j >= k) goto _L5; else goto _L4
_L4:
        String s37;
        s37 = as[j];
        flag = flag2;
        String s1 = s;
        flag1 = flag3;
        s1 = s;
        if (s37.startsWith("pCode"))
        {
            break MISSING_BLOCK_LABEL_173;
        }
        flag = flag2;
        String s2 = s;
        flag1 = flag3;
        s2 = s;
        if (s37.startsWith("prd"))
        {
            break MISSING_BLOCK_LABEL_173;
        }
        flag = flag2;
        String s3 = s;
        flag1 = flag3;
        s3 = s;
        if (!s37.startsWith("listItemId"))
        {
            break MISSING_BLOCK_LABEL_201;
        }
        flag = flag2;
        String s4 = s;
        flag1 = flag3;
        s4 = s;
        s36 = s37.substring(s37.indexOf("=") + 1);
        flag = flag2;
        String s5 = s;
        flag1 = flag3;
        s5 = s;
        if (s37.startsWith("skuCode"))
        {
            break MISSING_BLOCK_LABEL_245;
        }
        flag = flag2;
        String s6 = s;
        flag1 = flag3;
        s6 = s;
        if (!s37.startsWith("regItemId"))
        {
            break MISSING_BLOCK_LABEL_273;
        }
        flag = flag2;
        String s7 = s;
        flag1 = flag3;
        s7 = s;
        obj5 = s37.substring(s37.indexOf("=") + 1);
        obj = s;
        flag = flag2;
        String s8 = s;
        flag1 = flag3;
        s8 = s;
        if (!s37.startsWith("regId"))
        {
            break MISSING_BLOCK_LABEL_344;
        }
        i = 1;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_324;
        }
        flag = flag2;
        String s9 = s;
        flag1 = flag3;
        s9 = s;
        s = new RegistryObject();
        s.setRegistryID(s37.substring(s37.indexOf("=") + 1));
        obj = s;
        s = ((String) (obj));
        flag = flag2;
        Object obj1 = obj;
        flag1 = flag3;
        obj1 = obj;
        if (!s37.startsWith("shipId")) goto _L7; else goto _L6
_L6:
        i = 1;
        if (obj != null) goto _L9; else goto _L8
_L8:
        flag = flag2;
        Object obj2 = obj;
        flag1 = flag3;
        obj2 = obj;
        s = new RegistryObject();
_L25:
        s.setShipToId(s37.substring(s37.indexOf("=") + 1));
_L7:
        obj = s;
        flag = flag2;
        String s10 = s;
        flag1 = flag3;
        s10 = s;
        if (!s37.startsWith("regType"))
        {
            break MISSING_BLOCK_LABEL_481;
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_461;
        }
        flag = flag2;
        String s11 = s;
        flag1 = flag3;
        s11 = s;
        s = new RegistryObject();
        s.setRegistryType(s37.substring(s37.indexOf("=") + 1));
        obj = s;
        s = ((String) (obj));
        flag = flag2;
        Object obj3 = obj;
        flag1 = flag3;
        obj3 = obj;
        if (!s37.startsWith("qty")) goto _L11; else goto _L10
_L10:
        if (obj != null) goto _L13; else goto _L12
_L12:
        flag = flag2;
        Object obj4 = obj;
        flag1 = flag3;
        obj4 = obj;
        s = new RegistryObject();
_L24:
        s.setWantedQty(s37.substring(s37.indexOf("=") + 1));
_L11:
        flag = flag2;
        String s12 = s;
        flag1 = flag3;
        s12 = s;
        if (!s37.startsWith("listName") || !i)
        {
            break MISSING_BLOCK_LABEL_621;
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_598;
        }
        flag = flag2;
        String s13 = s;
        flag1 = flag3;
        s13 = s;
        s = new RegistryObject();
        s.setRegistryName(URLDecoder.decode(s37.substring(s37.indexOf("=") + 1), "UTF-8"));
_L15:
        j++;
          goto _L14
        obj;
        ((UnsupportedEncodingException) (obj)).printStackTrace();
          goto _L15
        s;
        flag1 = flag4;
_L26:
        s.printStackTrace();
_L2:
        return flag1;
_L5:
        if (s36 == null) goto _L17; else goto _L16
_L16:
        flag3 = true;
        flag2 = true;
        flag = flag2;
        String s14 = s;
        flag1 = flag3;
        s14 = s;
        obj = new Intent();
        flag = flag2;
        String s15 = s;
        flag1 = flag3;
        s15 = s;
        if (!s36.startsWith("c")) goto _L19; else goto _L18
_L18:
        flag = flag2;
        String s16 = s;
        flag1 = flag3;
        s16 = s;
        ((Intent) (obj)).setClass(context, com/kohls/mcommerce/opal/framework/view/activity/CollectionsActivity);
_L20:
        flag = flag2;
        String s17 = s;
        flag1 = flag3;
        s17 = s;
        ((Intent) (obj)).putExtra("key_category_id", s36);
        flag = flag2;
        String s18 = s;
        flag1 = flag3;
        s18 = s;
        ((Intent) (obj)).addFlags(0x4000000);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_807;
        }
        flag = flag2;
        String s19 = s;
        flag1 = flag3;
        s19 = s;
        if (s.getShipToId() == null)
        {
            break MISSING_BLOCK_LABEL_807;
        }
        flag = flag2;
        String s20 = s;
        flag1 = flag3;
        s20 = s;
        ((Intent) (obj)).putExtra("key_registry_id", s);
        flag = flag2;
        String s21 = s;
        flag1 = flag3;
        s21 = s;
        ((Activity)context).startActivityForResult(((Intent) (obj)), 5);
        flag = flag2;
        String s22 = s;
        flag1 = flag3;
        s22 = s;
        ((Intent) (obj)).putExtra("from", "BrowsFragment");
        return true;
_L19:
        flag = flag2;
        String s23 = s;
        flag1 = flag3;
        s23 = s;
        ((Intent) (obj)).setClass(context, com/kohls/mcommerce/opal/framework/view/activity/ProductDetailsActivity);
        if (true) goto _L20; else goto _L17
_L17:
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_1069;
        }
        flag3 = true;
        flag2 = true;
        flag = flag2;
        String s24 = s;
        flag1 = flag3;
        s24 = s;
        obj = new Intent(context, com/kohls/mcommerce/opal/framework/view/activity/ProductDetailsActivity);
        flag = flag2;
        String s25 = s;
        flag1 = flag3;
        s25 = s;
        ((Intent) (obj)).putExtra("key_sku_code", ((String) (obj5)));
        if (s36 == null)
        {
            break MISSING_BLOCK_LABEL_960;
        }
        flag = flag2;
        String s26 = s;
        flag1 = flag3;
        s26 = s;
        ((Intent) (obj)).putExtra("key_category_id", s36);
        flag = flag2;
        String s27 = s;
        flag1 = flag3;
        s27 = s;
        ((Intent) (obj)).putExtra("from", "FeatureBrand");
        flag = flag2;
        String s28 = s;
        flag1 = flag3;
        s28 = s;
        ((Intent) (obj)).addFlags(0x4000000);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_1046;
        }
        flag = flag2;
        String s29 = s;
        flag1 = flag3;
        s29 = s;
        if (s.getShipToId() == null)
        {
            break MISSING_BLOCK_LABEL_1046;
        }
        flag = flag2;
        String s30 = s;
        flag1 = flag3;
        s30 = s;
        ((Intent) (obj)).putExtra("key_registry_id", s);
        flag = flag2;
        String s31 = s;
        flag1 = flag3;
        s31 = s;
        ((Activity)context).startActivityForResult(((Intent) (obj)), 5);
        return true;
        s36 = null;
        obj = null;
        flag = flag2;
        String s32 = s;
        flag1 = flag3;
        s32 = s;
        j = as.length;
        i = 0;
_L27:
        if (i >= j) goto _L22; else goto _L21
_L21:
        obj5 = as[i];
        flag = flag2;
        String s33 = s;
        flag1 = flag3;
        s33 = s;
        if (!((String) (obj5)).startsWith("id"))
        {
            break MISSING_BLOCK_LABEL_1161;
        }
        flag = flag2;
        String s34 = s;
        flag1 = flag3;
        s34 = s;
        String s35;
        s35 = ((String) (obj5)).substring(((String) (obj5)).indexOf("=") + 1);
        break MISSING_BLOCK_LABEL_1434;
        flag = flag2;
        s35 = s;
        flag1 = flag3;
        s35 = s;
        s35 = s36;
        if (!((String) (obj5)).startsWith("title"))
        {
            break MISSING_BLOCK_LABEL_1434;
        }
        flag = flag2;
        s35 = s;
        flag1 = flag3;
        s35 = s;
        obj5 = ((String) (obj5)).substring(((String) (obj5)).indexOf("=") + 1);
        s35 = s36;
        obj = obj5;
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_1434;
        }
        flag1 = flag3;
        s35 = s;
        obj = URLDecoder.decode(((String) (obj5)), "UTF-8");
        s35 = s36;
        break MISSING_BLOCK_LABEL_1434;
        obj;
        flag = flag2;
        s35 = s;
        flag1 = flag3;
        s35 = s;
        ((UnsupportedEncodingException) (obj)).printStackTrace();
        s35 = s36;
        obj = obj5;
        break MISSING_BLOCK_LABEL_1434;
        s;
_L23:
        s.printStackTrace();
        return flag;
_L22:
        flag = flag6;
        if (s36 == null)
        {
            break MISSING_BLOCK_LABEL_1397;
        }
        flag = flag2;
        s35 = s;
        flag1 = flag3;
        s35 = s;
        obj5 = new Bundle();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1335;
        }
        flag = flag2;
        s35 = s;
        flag1 = flag3;
        s35 = s;
        ((Bundle) (obj5)).putString("key_page_title", ((String) (obj)));
        flag3 = true;
        flag4 = true;
        flag2 = true;
        flag = flag2;
        s35 = s;
        flag1 = flag4;
        s35 = s;
        ((Bundle) (obj5)).putString("key_category_id", s36);
        flag = flag2;
        s35 = s;
        flag1 = flag4;
        s35 = s;
        ((HomeActivity)context).attachProductMatrixFragment(((HomeActivity)context).getFragmentOnScreen(), ((Bundle) (obj5)));
        flag = flag3;
        return flag;
        s;
        flag = flag5;
        if (true) goto _L23; else goto _L13
_L13:
        s = ((String) (obj));
          goto _L24
_L9:
        s = ((String) (obj));
          goto _L25
        s;
          goto _L26
        i++;
        s36 = s35;
          goto _L27
    }

    public static void checkAndRefreshToken()
    {
        ControllerFactory.getRefreshTokenController().checkAndRefreshToken(null);
    }

    public static boolean checkDataExpired(long l)
    {
        return !(new Date(l)).after(new Date());
    }

    public static boolean checkDeviceConfigurationForNotifications()
    {
        return GooglePlayServicesUtil.isGooglePlayServicesAvailable(KohlsPhoneApplication.getContext()) == 0 && KohlsPhoneApplication.getInstance() != null && NotificationController.getInst() != null && NotificationController.getInst().isPushSupported();
    }

    public static void clearEditTextViewFocusOnOutsideTouch(View view, Activity activity)
    {
        if (!(view instanceof EditText))
        {
            view.setOnTouchListener(new _cls1(activity, view));
        }
        if (view instanceof ViewGroup)
        {
            for (int i = 0; i < ((ViewGroup)view).getChildCount(); i++)
            {
                clearEditTextViewFocusOnOutsideTouch(((ViewGroup)view).getChildAt(i), activity);
            }

        }
    }

    public static float convertDpToPixel(float f, Context context)
    {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static float convertPixelsToDp(float f, Context context)
    {
        return f / ((float)context.getResources().getDisplayMetrics().densityDpi / 160F);
    }

    public static File createFile(String s)
    {
        Context context = KohlsPhoneApplication.getContext();
        char c;
        if (hasSDCard(KohlsPhoneApplication.getContext()))
        {
            c = '\u03EA';
        } else
        {
            c = '\u03E9';
        }
        s = new File(getFileData(context, c), s);
        if (!s.exists())
        {
            try
            {
                s.createNewFile();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return null;
            }
        }
        return s;
    }

    public static String createJsonFromModel(Object obj)
    {
        return (new GsonBuilder()).disableHtmlEscaping().create().toJson(obj);
    }

    public static String decodeBase64(String s)
    {
        try
        {
            s = new String(Base64.decode(s, 0), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "";
        }
        return s;
    }

    public static void dismissDialog(int i)
    {
        BaseDialogFragment.dismissDialog(i);
    }

    public static void dumpIntoFile(String s, String s1)
    {
        s1 = createFile(s1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        s1 = new BufferedWriter(new FileWriter(s1, true));
        s1.write(s);
        s1.newLine();
        s1.flush();
        s1.close();
        return;
        s;
        s.printStackTrace();
        return;
    }

    public static String encryptedAccessToken(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        try
        {
            stringbuilder.append(s.substring(s.length() - 5));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return stringbuilder.toString();
    }

    public static String formatPhoneNumber(String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            StringBuilder stringbuilder = new StringBuilder(s);
            if (stringbuilder.length() >= 10)
            {
                stringbuilder.insert(0, '(');
                stringbuilder.insert(4, ')');
                stringbuilder.insert(8, '-');
                return stringbuilder.toString();
            }
        }
        return s;
    }

    public static int getActionBarHeight(Context context)
    {
        int i = 0;
        TypedValue typedvalue = new TypedValue();
        if (context.getTheme().resolveAttribute(0x10102eb, typedvalue, true))
        {
            i = TypedValue.complexToDimensionPixelSize(typedvalue.data, context.getResources().getDisplayMetrics());
        }
        return i;
    }

    public static List getAddressFromGeoCode(GeoCoderVO geocodervo, String s)
    {
        ArrayList arraylist = new ArrayList();
        if (geocodervo != null)
        {
            geocodervo = geocodervo.getResults().iterator();
label0:
            do
            {
                if (!geocodervo.hasNext())
                {
                    break;
                }
                Object obj = (com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult)geocodervo.next();
                boolean flag1 = false;
                if (((com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult) (obj)).getAddress_components() == null || ((com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult) (obj)).getAddress_components().size() <= 0)
                {
                    continue;
                }
                Address address = new Address(Locale.US);
                Iterator iterator = ((com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult) (obj)).getAddress_components().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult.AddressComponent addresscomponent = (com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult.AddressComponent)iterator.next();
                    if (addresscomponent.getTypes() != null && addresscomponent.getTypes().size() > 0)
                    {
                        if (((String)addresscomponent.getTypes().get(0)).equalsIgnoreCase("point_of_interest") || ((String)addresscomponent.getTypes().get(0)).equalsIgnoreCase("establishment") || ((String)addresscomponent.getTypes().get(0)).equalsIgnoreCase("route"))
                        {
                            flag1 = true;
                        }
                        if (((String)addresscomponent.getTypes().get(0)).equalsIgnoreCase("locality"))
                        {
                            address.setLocality(addresscomponent.getLong_name());
                        }
                        if (((String)addresscomponent.getTypes().get(0)).equalsIgnoreCase("administrative_area_level_1"))
                        {
                            address.setAdminArea(addresscomponent.getLong_name());
                        }
                        boolean flag = flag1;
                        if (((String)addresscomponent.getTypes().get(0)).equalsIgnoreCase("country"))
                        {
                            if (addresscomponent.getLong_name() != null && addresscomponent.getLong_name().equalsIgnoreCase("United States"))
                            {
                                address.setCountryName(addresscomponent.getLong_name());
                                flag = flag1;
                            } else
                            {
                                flag = true;
                            }
                        }
                        flag1 = flag;
                        if (((String)addresscomponent.getTypes().get(0)).equalsIgnoreCase("postal_code"))
                        {
                            address.setPostalCode(addresscomponent.getLong_name());
                            flag1 = flag;
                        }
                    }
                } while (true);
                if (((com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult) (obj)).getGeometry() != null && ((com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult) (obj)).getGeometry().getLocation() != null)
                {
                    address.setLatitude(((com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult) (obj)).getGeometry().getLocation().getLat().doubleValue());
                    address.setLongitude(((com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult) (obj)).getGeometry().getLocation().getLon().doubleValue());
                }
                address.setFeatureName(((com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult) (obj)).getFormatted_address());
                if (s != null && ((com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult) (obj)).getTypes() != null)
                {
                    obj = ((com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult) (obj)).getTypes().iterator();
                    do
                    {
                        if (!((Iterator) (obj)).hasNext())
                        {
                            continue label0;
                        }
                    } while (!((String)((Iterator) (obj)).next()).equalsIgnoreCase(s));
                    arraylist.add(address);
                } else
                if (!flag1)
                {
                    arraylist.add(address);
                }
            } while (true);
        }
        return arraylist;
    }

    public static Address getAddressFromGeoCodeResult(com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult geocoderesult)
    {
        boolean flag = false;
        if (geocoderesult.getAddress_components() != null && geocoderesult.getAddress_components().size() > 0)
        {
            Address address = new Address(Locale.US);
            Iterator iterator = geocoderesult.getAddress_components().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult.AddressComponent addresscomponent = (com.kohls.mcommerce.opal.framework.vo.GeoCoderVO.GeoCodeResult.AddressComponent)iterator.next();
                if (addresscomponent.getTypes() != null && addresscomponent.getTypes().size() > 0)
                {
                    if (addresscomponent.getTypes().contains("locality"))
                    {
                        address.setLocality(addresscomponent.getLong_name());
                    }
                    if (addresscomponent.getTypes().contains("administrative_area_level_1"))
                    {
                        address.setAdminArea(addresscomponent.getLong_name());
                    }
                    boolean flag1 = flag;
                    if (addresscomponent.getTypes().contains("country"))
                    {
                        if (addresscomponent.getLong_name() != null && addresscomponent.getLong_name().equalsIgnoreCase("United States"))
                        {
                            address.setCountryName(addresscomponent.getLong_name());
                            flag1 = flag;
                        } else
                        {
                            flag1 = true;
                        }
                    }
                    if (addresscomponent.getTypes().contains("point_of_interest") || addresscomponent.getTypes().contains("establishment"))
                    {
                        flag1 = true;
                    }
                    if (addresscomponent.getTypes().contains("postal_code"))
                    {
                        address.setPostalCode(addresscomponent.getLong_name());
                    }
                    if (addresscomponent.getTypes().contains("street_number"))
                    {
                        address.setPremises(addresscomponent.getLong_name());
                    }
                    flag = flag1;
                    if (addresscomponent.getTypes().contains("route"))
                    {
                        address.setSubLocality(addresscomponent.getLong_name());
                        flag = flag1;
                    }
                }
            } while (true);
            if (geocoderesult.getGeometry() != null && geocoderesult.getGeometry().getLocation() != null)
            {
                address.setLatitude(geocoderesult.getGeometry().getLocation().getLat().doubleValue());
                address.setLongitude(geocoderesult.getGeometry().getLocation().getLon().doubleValue());
            }
            address.setFeatureName(geocoderesult.getFormatted_address());
            if (!flag)
            {
                return address;
            }
        }
        return null;
    }

    public static StringBuilder getAddressLine(Address address, boolean flag, boolean flag1)
    {
        if (address != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((StringBuilder) (obj));
_L2:
        StringBuilder stringbuilder;
        String s;
        stringbuilder = new StringBuilder("");
        obj = address.getAddressLine(0);
        if (obj != null && !flag1)
        {
            stringbuilder.append(((String) (obj)));
        }
        s = address.getLocality();
        if (s != null)
        {
            if (obj != null)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(s);
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = stringbuilder;
        if (stringbuilder.length() > 0) goto _L4; else goto _L3
_L3:
        String s1 = address.getAdminArea();
        if (s1 != null)
        {
            if (s != null)
            {
                stringbuilder.append(',');
            }
            stringbuilder.append(s1);
        }
        address = address.getCountryName();
        obj = stringbuilder;
        if (address != null)
        {
            if (s1 != null)
            {
                stringbuilder.append(',');
            }
            stringbuilder.append(address);
            return stringbuilder;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public static StringBuilder getAddressLine(com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store.Address address, boolean flag, boolean flag1)
    {
        if (address != null) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder = null;
_L4:
        return stringbuilder;
_L2:
        StringBuilder stringbuilder1;
        String s1;
        stringbuilder1 = new StringBuilder("");
        s1 = address.getAddr1();
        if (s1 != null && !flag1)
        {
            stringbuilder1.append((new StringBuilder()).append(s1).append(", ").toString());
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder = stringbuilder1;
        if (stringbuilder1.length() > 0) goto _L4; else goto _L3
_L3:
        String s;
        s = address.getCity();
        if (s != null)
        {
            if (s1 == null);
            stringbuilder1.append(s);
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder = stringbuilder1;
        if (stringbuilder1.length() > 0) goto _L4; else goto _L5
_L5:
        address = address.getState();
        stringbuilder = stringbuilder1;
        if (address != null)
        {
            if (s != null)
            {
                stringbuilder1.append(", ");
            }
            stringbuilder1.append(address);
            return stringbuilder1;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public static android.app.AlertDialog.Builder getAlertDialog(Context context, String s, String s1, String s2, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        context = new android.app.AlertDialog.Builder(context);
        if (s != null)
        {
            context.setMessage(s);
        }
        if (s1 != null && onclicklistener != null)
        {
            context.setPositiveButton(s1, onclicklistener);
        }
        if (s2 != null && onclicklistener != null)
        {
            context.setNegativeButton(s2, onclicklistener);
        }
        return context;
    }

    public static String getBaseListUrl()
    {
        String s = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getAddToListUrl();
        return s.substring(0, s.indexOf("addItemsToList"));
    }

    public static String getBlackFridayListText(Context context, boolean flag)
    {
        String s = (new StringBuilder()).append(context.getResources().getString(0x7f0803fb)).append(" ").toString();
        String s1 = context.getResources().getString(0x7f0803fc);
        String s2 = (new StringBuilder()).append(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getSpecificOfferButtonDisplayName()).append(" ").toString();
        if (flag)
        {
            context = (new StringBuilder()).append("<font color='").append(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getSpecificOfferPDPDisplayTextColor()).append("'>").append(s2).append("</font>").toString();
        } else
        {
            context = (new StringBuilder()).append("<font color='").append(context.getResources().getColor(0x7f0c0040)).append("'>").append(s2).append("</font>").toString();
        }
        return (new StringBuilder()).append(s).append(context).append(s1).toString();
    }

    public static Spannable getColorSpanable(String s, int i)
    {
        s = new SpannableString(s);
        s.setSpan(new ForegroundColorSpan(i), 0, s.length(), 33);
        return s;
    }

    public static String getCustomerOrUpdateProfileLoggerReuest()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("email");
        stringbuffer.append(":");
        stringbuffer.append(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        stringbuffer.append(";");
        stringbuffer.append("access_token");
        stringbuffer.append(":");
        stringbuffer.append(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getUserAccessTokenFromPref());
        return stringbuffer.toString();
    }

    public static int getDataItemsCountIfSkuAlreadyAdded(String s, String s1)
    {
        return (new DBShoppingBagHelper()).isSkuCodeAvailable(s, s1);
    }

    public static String getDecimalFormattedText(Double double1)
    {
        DecimalFormat decimalformat = new DecimalFormat("0.00");
        if (double1 != null)
        {
            return decimalformat.format(double1);
        } else
        {
            return null;
        }
    }

    private static float getDeviceDensity()
    {
        return KohlsPhoneApplication.getContext().getResources().getDisplayMetrics().density;
    }

    public static HashMap getDirSize(File file)
    {
        HashMap hashmap = new HashMap();
        file = file.listFiles();
        int j = file.length;
        for (int i = 0; i < j; i++)
        {
            File file1 = file[i];
            if (file1.isFile() && file1.getName().equalsIgnoreCase("catalog.tmp"))
            {
                hashmap.put(file1.getName(), Long.valueOf(file1.length()));
            }
        }

        return hashmap;
    }

    public static double getDistance(Location location, Location location1)
    {
        return (double)location1.distanceTo(location) * 0.00062137100000000001D;
    }

    public static Intent getEmailIntent(String s)
    {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setType("text/plain");
        if (s != null)
        {
            intent.setData(Uri.parse((new StringBuilder()).append("mailto:").append(s).toString()));
            return intent;
        } else
        {
            intent.setData(Uri.parse("mailto:"));
            return intent;
        }
    }

    public static File getFileData(Context context, int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1001: 
            return context.getFilesDir();

        case 1002: 
            return context.getExternalCacheDir();
        }
    }

    public static List getFilteredAddresses(List list, String s)
    {
        ArrayList arraylist = new ArrayList();
        String s1 = "";
        Iterator iterator = list.iterator();
        list = s1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Address address = (Address)iterator.next();
            if (addressHasCityandStateInfo(address, list, s))
            {
                arraylist.add(address);
                list = address.getLocality();
            }
        } while (true);
        return arraylist;
    }

    public static void getFlushTimes()
    {
        (new CacheFlushHelper()).startFlushCalls();
    }

    public static String getFormattedPrice(String s)
    {
        Object obj;
        obj = "";
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        obj = getDecimalFormattedText(Double.valueOf(s));
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return (new StringBuilder()).append("$").append(((String) (obj))).toString();
        }
        obj = (new StringBuilder()).append("$").append(s).toString();
        return ((String) (obj));
        obj;
        if (s.toLowerCase().contains("final"))
        {
            return "For price, Add to Bag";
        }
        obj = s;
        return ((String) (obj));
    }

    public static Date getGMTTime(long l)
    {
        Object obj;
        SimpleDateFormat simpledateformat;
        obj = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
        ((SimpleDateFormat) (obj)).setTimeZone(TimeZone.getTimeZone("GMT"));
        simpledateformat = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
        if (l != 0L)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        return simpledateformat.parse(((SimpleDateFormat) (obj)).format(new Date()));
        obj = new Date(60000L * l + simpledateformat.parse(((SimpleDateFormat) (obj)).format(new Date())).getTime());
        return ((Date) (obj));
        ParseException parseexception;
        parseexception;
        parseexception.printStackTrace();
        return null;
    }

    public static GeoCoderVO getGeocodeFromAddress(String s)
        throws AppException
    {
        HashMap hashmap = new HashMap();
        hashmap.put("address", s);
        hashmap.put("client", "gme-kohlsdepartmentstores");
        s = RestClient.getHttpGetApiResponseAsJSON(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getGeoCodeUrl(), hashmap, false, true, "sensor=false", true);
        if (!TextUtils.isEmpty(s))
        {
            return (GeoCoderVO)getModelFromJsonString(s, com/kohls/mcommerce/opal/framework/vo/GeoCoderVO);
        } else
        {
            throw new AppException("No response from GeoCoder Api.");
        }
    }

    public static HashMap getHashMapFromJsonString(String s)
    {
        return (HashMap)(new GsonBuilder()).create().fromJson(s, (new _cls8()).getType());
    }

    public static float getKohlsFormatedRating(float f)
    {
        if ((double)(f - (float)(int)f) >= 0.5D)
        {
            return (float)((double)(int)f + 0.5D);
        } else
        {
            return (float)(int)f;
        }
    }

    public static String getListCopy(String s)
    {
        if ((s.startsWith("KOHLSQRCODE") || s.contains("kohls.com")) && s.contains("listcopy="))
        {
            return s.substring(s.indexOf("listcopy=") + "listcopy=".length()).split("&")[0];
        } else
        {
            return null;
        }
    }

    public static String getMD5HexString(String s)
    {
        Object obj = null;
        MessageDigest messagedigest = MessageDigest.getInstance("MD5");
        obj = messagedigest;
        messagedigest.update(s.getBytes());
        obj = messagedigest;
_L2:
        s = ((MessageDigest) (obj)).digest();
        obj = new StringBuffer();
        for (int i = 0; i < s.length; i++)
        {
            String s1 = Integer.toHexString(s[i] & 0xff);
            if (s1.length() == 1)
            {
                ((StringBuffer) (obj)).append('0');
            }
            ((StringBuffer) (obj)).append(s1);
        }

        break; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        return ((StringBuffer) (obj)).toString();
    }

    public static Map getMapFromObject(Object obj, Class class1)
    {
        Object obj1 = null;
        if (obj != null) goto _L2; else goto _L1
_L1:
        return ((Map) (obj1));
_L2:
        HashMap hashmap;
        hashmap = new HashMap(6);
        obj1 = hashmap;
        if (obj == null) goto _L1; else goto _L3
_L3:
        Method amethod[];
        int i;
        int j;
        amethod = class1.getMethods();
        j = amethod.length;
        i = 0;
_L7:
        obj1 = hashmap;
        if (i >= j) goto _L1; else goto _L4
_L4:
        obj1 = amethod[i];
        class1 = ((Method) (obj1)).getReturnType();
        if (!((Method) (obj1)).getName().startsWith("get") || class1.equals(java/lang/Class)) goto _L6; else goto _L5
_L5:
        String s;
        ((Method) (obj1)).setAccessible(true);
        s = (new StringBuilder()).append(((Method) (obj1)).getName().substring(3, 4).toLowerCase()).append(((Method) (obj1)).getName().substring(4)).toString();
        class1 = null;
        obj1 = ((Method) (obj1)).invoke(obj, (Object[])null);
        class1 = ((Class) (obj1));
_L8:
        if (class1 != null)
        {
            hashmap.put(s, String.valueOf(class1));
        }
_L6:
        i++;
          goto _L7
        Object obj2;
        obj2;
        ((IllegalArgumentException) (obj2)).printStackTrace();
          goto _L8
        obj2;
        ((IllegalAccessException) (obj2)).printStackTrace();
          goto _L8
        obj2;
        ((InvocationTargetException) (obj2)).printStackTrace();
          goto _L8
    }

    public static Object getModelFromJsonString(String s, Class class1)
    {
        return (new GsonBuilder()).create().fromJson(s, class1);
    }

    public static String getNonExistingListName(JSONArray jsonarray)
    {
        String s;
        String s1;
        boolean flag;
        int i;
        s = null;
        flag = false;
        s1 = (new SimpleDateFormat("MMM dd, yyyy")).format(new Date());
        if (jsonarray == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        i = 0;
_L6:
        if (i > jsonarray.length()) goto _L2; else goto _L1
_L1:
        boolean flag1;
        int j;
        boolean flag2;
        if (i == 0)
        {
            s = (new StringBuilder()).append("Beauty-").append(s1).toString();
        } else
        {
            s = (new StringBuilder()).append("Beauty-").append(i).append(" - ").append(s1).toString();
        }
        j = 0;
_L4:
        flag1 = flag;
        if (j >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_109;
        }
        flag2 = jsonarray.getJSONObject(j).getString("listName").contains(s);
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        flag1 = false;
        if (flag1)
        {
            return s;
        }
        break; /* Loop/switch isn't completed */
        flag = true;
_L5:
        j++;
        if (true) goto _L4; else goto _L3
        JSONException jsonexception;
        jsonexception;
        jsonexception.printStackTrace();
          goto _L5
_L3:
        i++;
        flag = flag1;
          goto _L6
_L2:
        return s;
        return (new StringBuilder()).append("Beauty-").append(s1).toString();
    }

    public static String getPhoneNumberNumerals(String s)
    {
        return s.replaceAll("[^\\d]", "");
    }

    public static int getPixelsFromDp(Context context, float f)
    {
        return (int)(f * context.getResources().getDisplayMetrics().density + 0.5F);
    }

    public static void getRecommendations(String s, String s1, String s2, String s3, String s4, IAdapterListener iadapterlistener)
    {
        RecommendationsPO recommendationspo = new RecommendationsPO();
        if (!TextUtils.isEmpty(s))
        {
            recommendationspo.setWebID(s);
        }
        if (!TextUtils.isEmpty(s1))
        {
            recommendationspo.setStoreNum(s1);
        }
        if (!TextUtils.isEmpty(s3))
        {
            recommendationspo.setLimit(s3);
        }
        if (!TextUtils.isEmpty(s2))
        {
            recommendationspo.setType(s2);
        }
        if (!TextUtils.isEmpty(s4))
        {
            recommendationspo.setPostalCode(s4);
        }
        (new AdapterHelper(AdapterProcedure.RECOMMENDATION, recommendationspo, iadapterlistener)).performTask();
    }

    public static String getRefreshTokenLoggerReuest()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("email");
        stringbuffer.append(":");
        stringbuffer.append(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        stringbuffer.append(";");
        stringbuffer.append("refresh_token");
        stringbuffer.append(":");
        stringbuffer.append(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getRefreshTokenFromPref());
        return stringbuffer.toString();
    }

    public static SpannableString getRewardText(LoyaltyProfileResponse loyaltyprofileresponse, Context context)
    {
        android.graphics.Typeface typeface = WalletFontCache.getGothamBook(KohlsPhoneApplication.getInstance());
        android.graphics.Typeface typeface1 = WalletFontCache.getGothamBold(KohlsPhoneApplication.getInstance());
        Object obj = null;
        if (TextUtils.isEmpty(loyaltyprofileresponse.getProfile().getPointBalance()))
        {
            loyaltyprofileresponse.getProfile().setPointBalance("0");
            loyaltyprofileresponse.getProfile().setPointThreshold("0");
        }
        SpannableString spannablestring = obj;
        if (!TextUtils.isEmpty(loyaltyprofileresponse.getProfile().getPointThreshold()))
        {
            spannablestring = obj;
            if (!TextUtils.isEmpty(loyaltyprofileresponse.getProfile().getPointBalance()))
            {
                int i = PointsIndicatorUtil.getThresholdPoints(Integer.parseInt(loyaltyprofileresponse.getProfile().getPointThreshold()), Integer.parseInt(loyaltyprofileresponse.getProfile().getPointBalance()));
                int j = Integer.parseInt(loyaltyprofileresponse.getProfile().getPointBalance());
                loyaltyprofileresponse = getDecimalFormattedText(Double.valueOf(Double.parseDouble(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getLoyaltyReward())));
                loyaltyprofileresponse = (new StringBuilder()).append(context.getResources().getString(0x7f0803c8)).append(" ").append(i - j).append(" ").append(context.getString(0x7f0803ca)).append(" ").append(context.getResources().getString(0x7f0803c6)).append(loyaltyprofileresponse).append(" ").append(context.getResources().getString(0x7f0803c7)).toString();
                i = context.getResources().getString(0x7f0803c4).length();
                j = loyaltyprofileresponse.indexOf(context.getResources().getString(0x7f0803c6));
                spannablestring = new SpannableString(loyaltyprofileresponse);
                spannablestring.setSpan(new TextAppearanceSpan(context, 0x7f0f001d), 0, i, 0);
                spannablestring.setSpan(new CustomTypeFace(typeface), 0, i, 0);
                spannablestring.setSpan(new TextAppearanceSpan(context, 0x7f0f001d), i, j, 0);
                spannablestring.setSpan(new CustomTypeFace(typeface1), i, j, 0);
                spannablestring.setSpan(new TextAppearanceSpan(context, 0x7f0f001d), j, loyaltyprofileresponse.length(), 0);
                spannablestring.setSpan(new CustomTypeFace(typeface), j, loyaltyprofileresponse.length(), 0);
            }
        }
        return spannablestring;
    }

    public static String getSaltValue()
    {
        String s = "";
        Object obj = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig();
        if (obj != null)
        {
            obj = ((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getSaltValue();
            s = ((String) (obj));
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                s = decodeBase64(((String) (obj)));
            }
        }
        return s;
    }

    public static int getScreenHeight(Context context)
    {
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        context.getSize(point);
        return point.x;
    }

    public static void getShippingInformation(int i, boolean flag, String s, boolean flag1, String s1, IAdapterListener iadapterlistener, boolean flag2)
    {
        CalculateOrderPO calculateorderpo;
        com.kohls.mcommerce.opal.common.po.CalculateOrderPO.Params params;
        com.kohls.mcommerce.opal.common.po.CalculateOrderPO.Params.Payload payload;
        com.kohls.mcommerce.opal.common.po.CalculateOrderPO.Params.Payload.Order order;
        com.kohls.mcommerce.opal.common.po.CalculateOrderPO.Params.Payload.Order.CartItems cartitems;
        int j;
        calculateorderpo = new CalculateOrderPO();
        params = new com.kohls.mcommerce.opal.common.po.CalculateOrderPO.Params();
        payload = new com.kohls.mcommerce.opal.common.po.CalculateOrderPO.Params.Payload();
        order = new com.kohls.mcommerce.opal.common.po.CalculateOrderPO.Params.Payload.Order();
        cartitems = new com.kohls.mcommerce.opal.common.po.CalculateOrderPO.Params.Payload.Order.CartItems();
        j = i;
        if (!flag2 || flag) goto _L2; else goto _L1
_L1:
        j = i + getDataItemsCountIfSkuAlreadyAdded(s, s1);
_L4:
        cartitems.setQty(String.valueOf(j));
        cartitems.setSkuCode(s);
        if (flag1)
        {
            cartitems.setBopusItem(flag1);
            cartitems.setStoreNum(s1);
        }
        s = new ArrayList();
        s.add(cartitems);
        order.setCartItems(s);
        if (!flag1)
        {
            order.setShippingMethod("USSTD");
        }
        if (flag1 && flag)
        {
            order.setCheckBopusItemInventory(true);
        }
        payload.setOrder(order);
        params.setPayload(payload);
        calculateorderpo.setParams(params);
        calculateorderpo.setTrEnabled(true);
        if (iadapterlistener != null)
        {
            (new AdapterHelper(AdapterProcedure.CALCULATE_ORDER, calculateorderpo, iadapterlistener)).performTask();
        }
        return;
_L2:
        if (!flag)
        {
            j = i + getDataItemsCountIfSkuAlreadyAdded(s, s1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int getShopingBagItemsCount()
    {
        com/kohls/mcommerce/opal/common/util/UtilityMethods;
        JVM INSTR monitorenter ;
        int i = (new DBShoppingBagHelper()).getItemsCountFromShoppingBag();
        com/kohls/mcommerce/opal/common/util/UtilityMethods;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public static String getShortDayName(String s)
    {
        if (s.equalsIgnoreCase("monday"))
        {
            return "Mon.";
        }
        if (s.equalsIgnoreCase("tuesday"))
        {
            return "Tue.";
        }
        if (s.equalsIgnoreCase("wednesday"))
        {
            return "Wed.";
        }
        if (s.equalsIgnoreCase("thursday"))
        {
            return "Thu.";
        }
        if (s.equalsIgnoreCase("friday"))
        {
            return "Fri.";
        }
        if (s.equalsIgnoreCase("saturday"))
        {
            return "Sat.";
        }
        if (s.equalsIgnoreCase("sunday"))
        {
            return "Sun.";
        } else
        {
            return null;
        }
    }

    public static String getSinInProfileLoggerReuest(String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("email");
        stringbuffer.append(":");
        stringbuffer.append(s);
        return stringbuffer.toString();
    }

    public static String getSkuFormattedPrice(String s, String s1)
    {
        Object obj;
        obj = "";
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_171;
        }
        obj = getDecimalFormattedText(Double.valueOf(s));
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return (new StringBuilder()).append(s1).append(" $").append(((String) (obj))).toString();
        }
        obj = (new StringBuilder()).append(s1).append(" $").append(s).toString();
        return ((String) (obj));
        obj;
        if (s.toLowerCase().contains("final") || s.toLowerCase().contains("add to bag"))
        {
            return "For price, Add to Bag";
        }
        if (s.toLowerCase().contains(" | "))
        {
            return (new StringBuilder()).append(s1).append(" $").append(s).toString();
        }
        obj = (new StringBuilder()).append(s1).append(" ").append(s).toString();
        return ((String) (obj));
    }

    public static String getSpecificOfferDate(String s)
    {
        s = s.split("-");
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
        SimpleDateFormat simpledateformat1 = new SimpleDateFormat("MMM. dd");
        try
        {
            s = simpledateformat1.format(simpledateformat1.parse(simpledateformat1.format(simpledateformat.parse(s[0]))));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "";
        }
        return s;
    }

    public static String getSpecificOfferTimeText(Context context, String s)
    {
        Object obj;
        Object obj1;
        String as[];
        Object obj2;
        as = s.split("-");
        obj2 = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
        obj1 = new SimpleDateFormat("kk:mm:ss");
        obj = new SimpleDateFormat("MMM. dd");
        s = null;
        int i;
        obj2 = ((SimpleDateFormat) (obj2)).parse(as[0]);
        Date date = ((SimpleDateFormat) (obj1)).parse(((SimpleDateFormat) (obj1)).format(((Date) (obj2))));
        obj2 = ((SimpleDateFormat) (obj)).parse(((SimpleDateFormat) (obj)).format(((Date) (obj2))));
        obj1 = ((SimpleDateFormat) (obj1)).format(date);
        obj = ((SimpleDateFormat) (obj)).format(((Date) (obj2)));
        i = Integer.parseInt(((String) (obj1)).split(":")[0]);
        if (i <= 11)
        {
            s = "morning";
        } else
        if (i >= 12 && i <= 15)
        {
            s = "noon";
        } else
        {
            if (i < 16 || i > 18)
            {
                continue; /* Loop/switch isn't completed */
            }
            s = "evening";
        }
        break MISSING_BLOCK_LABEL_119;
_L2:
        if (i <= 23)
        {
            s = "midnight";
        }
        continue; /* Loop/switch isn't completed */
_L4:
        try
        {
            return (new StringBuilder()).append(context.getResources().getString(0x7f0804eb)).append(" ").append(s).append(" ").append(context.getResources().getString(0x7f0803e7)).append(" ").append(((String) (obj))).toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return (new StringBuilder()).append(context.getResources().getString(0x7f0804eb)).append(" ").append("").append(" ").append(context.getResources().getString(0x7f0803e7)).append(" ").toString();
        if (i < 19 || i > 22) goto _L2; else goto _L1
_L1:
        s = "night";
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void getStores(Location location, IAdapterListener iadapterlistener)
    {
        StoreLocatorPO storelocatorpo = new StoreLocatorPO();
        if (location != null)
        {
            storelocatorpo.setLatitude(String.valueOf(location.getLatitude()));
            storelocatorpo.setLongitude(String.valueOf(location.getLongitude()));
            storelocatorpo.setRadius(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getStoreRadius());
            (new AdapterHelper(AdapterProcedure.STORE_BY_OPENSEARCH, storelocatorpo, iadapterlistener)).performTask();
        }
    }

    public static int getThresholdPoints(int i, int j)
    {
        int k = i;
        if (i != 0) goto _L2; else goto _L1
_L1:
        i = 100;
_L4:
        return i;
_L2:
        do
        {
            i = k;
            if (j <= k)
            {
                continue;
            }
            k += 100;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static long getTimeinLong(String s)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss zzz");
        Object obj = null;
        Date date = obj;
        if (s != null)
        {
            try
            {
                date = simpledateformat.parse(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                date = obj;
            }
        }
        if (date != null)
        {
            return date.getTime();
        } else
        {
            return 0L;
        }
    }

    public static String getUpdatedURL(String s, int i, int j)
    {
        int l = Math.round(getDeviceDensity());
        int k = l;
        if (l > 3)
        {
            k = 3;
        }
        if (s.indexOf("?") == -1)
        {
            return s;
        } else
        {
            s = new StringBuilder(s.substring(0, s.indexOf("?")));
            s.append((new StringBuilder()).append("?wid=").append(i * k).toString());
            s.append((new StringBuilder()).append("&hei=").append(j * k).toString());
            s.append("&op_sharpen=1");
            s.append("&resMode=sharp2");
            s.append("&op_usm=1,0.8,6,0");
            Logger.debug(com/kohls/mcommerce/opal/framework/view/activity/WebViewActivity.getSimpleName(), s.toString());
            return s.toString();
        }
    }

    public static String getUserTokenString(String s, String s1, String s2, String s3)
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s4 = getSaltValue();
        if (!TextUtils.isEmpty(s4))
        {
            stringbuffer.append(s4);
        }
        stringbuffer.append(s);
        stringbuffer.append(s1);
        stringbuffer.append(s2);
        stringbuffer.append(s3);
        return stringbuffer.toString();
    }

    public static String getValueAddedIconUrl(String s)
    {
        String s1 = s.toLowerCase();
        if (!TextUtils.isEmpty(s1))
        {
            if (s1.indexOf("online") != -1)
            {
                return "//d16rliti0tklvn.cloudfront.net/5/1376916272203.373873069.gif";
            }
            if (s1.indexOf("morecolors") != -1)
            {
                return "//d16rliti0tklvn.cloudfront.net/5/1376916393655.1217695000.gif";
            }
            if (s1.indexOf("bogo_1_1_d_100") != -1)
            {
                return "//d16rliti0tklvn.cloudfront.net/5/bogo_1_1_D_100.gif";
            }
            if (s1.indexOf("bogo_1_1_p_50") != -1)
            {
                return "//d16rliti0tklvn.cloudfront.net/5/bogo_1_1_P_50.gif";
            }
            if (s1.indexOf("bogo_1_1") != -1)
            {
                return "//d16rliti0tklvn.cloudfront.net/5/bogo_1_1.gif";
            }
            if (s1.indexOf("bogo_2_1") != -1)
            {
                return "//d16rliti0tklvn.cloudfront.net/5/bogo_2_1.gif";
            }
            if (s1.indexOf("buy_1_get_0_50_percentage") != -1 || s.indexOf("buy_1_get_1_50_percentage") != -1)
            {
                return "//d16rliti0tklvn.cloudfront.net/5/1376918161165.1885808990.gif";
            }
            if (s1.indexOf("rebate") != -1)
            {
                return "//d16rliti0tklvn.cloudfront.net/5/rebate.gif";
            }
            if (s1.indexOf("warning") != -1)
            {
                return "//d16rliti0tklvn.cloudfront.net/5/war.gif";
            }
        }
        return null;
    }

    public static String getWalletHeaders(Header aheader[])
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (aheader.length > 2)
        {
            stringbuffer.append("lastName");
            stringbuffer.append(":");
            stringbuffer.append(aheader[2].getValue());
            stringbuffer.append(";");
        }
        if (aheader.length > 3)
        {
            stringbuffer.append("firstName");
            stringbuffer.append(":");
            stringbuffer.append(aheader[3].getValue());
            stringbuffer.append(";");
        }
        if (aheader.length > 4)
        {
            stringbuffer.append("email");
            stringbuffer.append(":");
            stringbuffer.append(aheader[4].getValue());
            stringbuffer.append(";");
        }
        if (aheader.length > 5)
        {
            stringbuffer.append("walletHash");
            stringbuffer.append(":");
            stringbuffer.append(aheader[5].getValue());
            stringbuffer.append(";");
        }
        if (aheader.length > 6)
        {
            stringbuffer.append("walletTimeStamp");
            stringbuffer.append(":");
            stringbuffer.append(aheader[6].getValue());
        }
        return stringbuffer.toString();
    }

    public static boolean hasSDCard(Context context)
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static void hideKeyboard(Context context, View view)
    {
        if (context != null && view != null)
        {
            ((InputMethodManager)context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static String identifyURLForSearchAndPMP(String s)
    {
        if (s.contains("keyword="))
        {
            return s.substring(s.indexOf("keyword="), s.length());
        } else
        {
            return s;
        }
    }

    public static void initiateCall(String s, Context context)
    {
        context.startActivity(new Intent("android.intent.action.CALL", Uri.parse((new StringBuilder()).append("tel:").append(s).toString())));
    }

    public static boolean isAuthError(String s)
    {
        boolean flag1 = false;
        String as[] = ConstantValues.ERRORCODE_LOGOUT;
        int j = as.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!s.endsWith(as[i]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public static boolean isDialogVisible(int i)
    {
        return BaseDialogFragment.isDialogVisible(i);
    }

    public static boolean isEmailValid(String s)
    {
        return IsMatch(s, "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9\\-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }

    public static boolean isFragmentVisible(WeakReference weakreference)
    {
        return weakreference.get() != null && ((Fragment)weakreference.get()).getActivity() != null && ((Fragment)weakreference.get()).isVisible() && !((Fragment)weakreference.get()).isRemoving();
    }

    public static boolean isLocationServiceEnabled()
    {
        LocationManager locationmanager = (LocationManager)KohlsPhoneApplication.getContext().getSystemService("location");
        return locationmanager != null && locationmanager.isProviderEnabled("network");
    }

    public static boolean isNetworkConnected(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return context != null && context.isConnectedOrConnecting();
    }

    public static boolean isOmniChannelBagClientEnabled()
    {
        return KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getOmnibagswitch() != null && Boolean.valueOf(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getOmnibagswitch()).booleanValue() && !KohlsPhoneApplication.getInstance().getKohlsPref().wantOmnichannelFlagOverride() || KohlsPhoneApplication.getInstance().getKohlsPref().wantOmnichannelFlagOverride() && KohlsPhoneApplication.getInstance().getKohlsPref().isOmniChannelEnabledinPref();
    }

    public static boolean isSpecificOfferValid(String s, String s1)
    {
        boolean flag1 = false;
        s = s.split("-");
        s1 = s1.split("-");
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date date;
        boolean flag;
        boolean flag2;
        try
        {
            date = simpledateformat.parse(simpledateformat.format(new Date(System.currentTimeMillis())));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return false;
        }
        flag = flag1;
        if (!date.after(simpledateformat.parse(s[0])))
        {
            break MISSING_BLOCK_LABEL_92;
        }
        flag2 = date.before(simpledateformat.parse(s1[0]));
        flag = flag1;
        if (flag2)
        {
            flag = true;
        }
        return flag;
    }

    private static boolean isTelephonyEnabled(Context context)
    {
        context = (TelephonyManager)context.getSystemService("phone");
        return context != null && context.getSimState() == 5;
    }

    public static boolean isTextOnlyNumeric(String s)
    {
        while (s.length() == 0 || !Pattern.matches("^\\d{5}(-\\d{4})?$", s)) 
        {
            return false;
        }
        return true;
    }

    public static boolean isValidUserName(String s)
    {
        return IsMatch(s, "^[\\p{L} .'-]+$");
    }

    public static void launchSignInScreen(Activity activity)
    {
        activity.setResult(7004, new Intent());
        activity.finish();
    }

    public static String loadHtmlFromAsset(Context context, String s)
    {
        try
        {
            context = context.getAssets().open((new StringBuilder()).append(s).append(".html").toString());
            s = new byte[context.available()];
            context.read(s);
            context.close();
            context = new String(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return context;
    }

    public static String loadJSONFromAsset(Context context, String s)
    {
        try
        {
            context = context.getAssets().open((new StringBuilder()).append(s).append(".json").toString());
            s = new byte[context.available()];
            context.read(s);
            context.close();
            context = new String(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return context;
    }

    public static void markAllItemsAsNonSynced()
    {
        com/kohls/mcommerce/opal/common/util/UtilityMethods;
        JVM INSTR monitorenter ;
        (new DBShoppingBagHelper()).updateAllItemstoNonSync();
        com/kohls/mcommerce/opal/common/util/UtilityMethods;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean onlineExclusive(com.kohls.mcommerce.opal.framework.vo.ProductDetailVO.Payload.Product product, Context context)
    {
        boolean flag2 = false;
        boolean flag = false;
        boolean flag1 = flag2;
        if (product != null)
        {
            flag1 = flag2;
            if (product.getValueAddedIcons() != null)
            {
                int j = product.getValueAddedIcons().size();
                int i = 0;
                do
                {
                    flag1 = flag;
                    if (i >= j)
                    {
                        break;
                    }
                    String s = (String)product.getValueAddedIcons().get(i);
                    flag1 = flag;
                    if (s != null)
                    {
                        flag1 = flag;
                        if (s.contains(context.getString(0x7f0803e9)))
                        {
                            flag1 = true;
                        }
                    }
                    i++;
                    flag = flag1;
                } while (true);
            }
        }
        return flag1;
    }

    public static void openAccountActivity(Fragment fragment, boolean flag, boolean flag1, int i, String s)
    {
        Intent intent = new Intent();
        intent.putExtra("show_create_account", flag);
        intent.putExtra("show_manage_account_screen", flag1);
        if (s != null)
        {
            intent.putExtra("sign_in_err_msg", s);
        }
        intent.setClass(fragment.getActivity(), com/kohls/mcommerce/opal/framework/view/activity/AccountActivity);
        fragment.startActivityForResult(intent, i);
    }

    public static void openAccountActivity(Context context, boolean flag, String s, int i)
    {
        Intent intent = new Intent();
        intent.putExtra("show_create_account", flag);
        intent.putExtra("fragment_tag", s);
        intent.setClass(context, com/kohls/mcommerce/opal/framework/view/activity/AccountActivity);
        ((Activity)context).startActivityForResult(intent, i);
    }

    public static void openAccountActivity(Context context, boolean flag, boolean flag1)
    {
        Intent intent = new Intent();
        intent.putExtra("show_create_account", flag);
        intent.putExtra("show_manage_account_screen", flag1);
        intent.setClass(context, com/kohls/mcommerce/opal/framework/view/activity/AccountActivity);
        if (context instanceof Activity)
        {
            ((Activity)context).startActivityForResult(intent, 7001);
            return;
        } else
        {
            ((Activity)context).startActivityForResult(intent, 0);
            return;
        }
    }

    public static void openCamera(Activity activity, int i, String s)
    {
        s = new Intent("android.media.action.IMAGE_CAPTURE");
        if (s.resolveActivity(activity.getPackageManager()) != null)
        {
            if (Environment.getExternalStorageState().equalsIgnoreCase("mounted"))
            {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "KohlsVisualSearchCamera.jpg");
                KohlsActivityLifecycleCallbacks kohlsactivitylifecyclecallbacks = KohlsPhoneApplication.getInstance().getKohlsActivityLifecycleCallbacks();
                if (kohlsactivitylifecyclecallbacks != null)
                {
                    kohlsactivitylifecyclecallbacks.setInteractionCounterToReset(false);
                }
                s.putExtra("output", Uri.fromFile(file));
                activity.startActivityForResult(s, i);
                return;
            } else
            {
                ServerLogger.error("openCamera", "State:OpenCamera", "Code;status:External storage is not available");
                return;
            }
        } else
        {
            ServerLogger.error("openCamera", "State:OpenCamera", "Code;status:Camera intent not resolved");
            return;
        }
    }

    public static void openGallery(Activity activity, int i)
    {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        if (intent.resolveActivity(activity.getPackageManager()) != null)
        {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void openHTMLContentInWebView(String s, Context context)
    {
        Intent intent = new Intent(context, com/kohls/mcommerce/opal/framework/view/activity/WebViewActivity);
        intent.putExtra("HTML_CONTENT", s);
        intent.putExtra("EXTRA_KEY_WEBVIEW_FROM_URL", false);
        context.startActivity(intent);
    }

    public static void openHybridScreen(Activity activity, HybridScreen hybridscreen)
    {
        ControllerFactory.getRefreshTokenController().checkAndRefreshToken(null);
        Intent intent = new Intent();
        intent.setClass(activity, com/kohls/mcommerce/opal/wl/WLActivity);
        intent.putExtra("screenToLoad", hybridscreen);
        activity.startActivityForResult(intent, 0);
    }

    public static void openOrderTrackStatusActivity(Activity activity)
    {
        Intent intent = new Intent();
        intent.setClass(activity, com/kohls/mcommerce/opal/framework/view/activity/OrderTrackingStatusActivity);
        activity.startActivityForResult(intent, 7003);
    }

    public static void openProductDetailsOnRecommendationClick(Activity activity, String s, boolean flag)
    {
        Intent intent = new Intent();
        if (s.startsWith("c"))
        {
            intent.setClass(activity, com/kohls/mcommerce/opal/framework/view/activity/CollectionsActivity);
        } else
        {
            intent.setClass(activity, com/kohls/mcommerce/opal/framework/view/activity/ProductDetailsActivity);
        }
        intent.putExtra("key_category_id", s);
        if (activity.getIntent() != null && activity.getIntent().getExtras() != null && activity.getIntent().getExtras().getString("SiteSection") != null)
        {
            intent.putExtra("SiteSection", activity.getIntent().getExtras().getString("SiteSection"));
        }
        intent.putExtra("from", "Recommendations");
        if (flag)
        {
            activity.finish();
        }
        activity.startActivity(intent);
        activity.overridePendingTransition(0x7f05000b, 0x7f05000a);
    }

    public static void openRatingReviewActivity(Activity activity, String s, String s1)
    {
        Intent intent = new Intent();
        intent.putExtra("key_category_id", s);
        intent.putExtra("key_omniture_s_products", s1);
        intent.setClass(activity, com/kohls/mcommerce/opal/framework/view/activity/RatingAndReviewActivity);
        activity.startActivity(intent);
    }

    public static void openRewarIdHelpActivity(Context context)
    {
        Intent intent = new Intent();
        intent.setClass(context, com/kohls/mcommerce/opal/framework/view/activity/RewardIdHelpActivity);
        context.startActivity(intent);
    }

    public static void openScanActivity(Activity activity, int i, String s)
    {
        if (KohlsPhoneApplication.getInstance().getKohlsPref().isFirstScan())
        {
            s = new Intent(activity, com/kohls/mcommerce/opal/framework/view/activity/ScanHelpActivity);
            s.putExtra("scan_request", i);
        } else
        {
            Intent intent = new Intent(activity.getApplicationContext(), com/kohls/mcommerce/opal/framework/view/activity/ScanActivity);
            intent.setAction("com.google.zxing.client.android.SCAN");
            intent.putExtra("SCAN_FORMATS", activity.getResources().getStringArray(0x7f0a0018));
            intent.putExtra("SAVE_HISTORY", false);
            intent.putExtra("scan_request", i);
            if (s != null)
            {
                intent.putExtra("registryId", s);
            }
            s = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(s);
            i = ((DisplayMetrics) (s)).heightPixels;
            int j = ((DisplayMetrics) (s)).widthPixels;
            intent.putExtra("SCAN_WIDTH", (double)i * 0.59999999999999998D);
            intent.putExtra("SCAN_HEIGHT", (double)j * 0.59999999999999998D);
            s = intent;
        }
        if (activity != null && activity.getIntent() != null)
        {
            s.putExtra("LAUNCHED_FROM_TOOLS", activity.getIntent().getBooleanExtra("LAUNCHED_FROM_TOOLS", false));
            activity.getIntent().putExtra("LAUNCHED_FROM_TOOLS", false);
        }
        activity.startActivityForResult(s, 2);
    }

    public static void openShoppingBag(Context context, HybridScreen hybridscreen)
    {
        checkAndRefreshToken();
        Intent intent = new Intent();
        intent.setClass(context, com/kohls/mcommerce/opal/wl/WLActivity);
        intent.setFlags(0x10000000);
        intent.putExtra("screenToLoad", hybridscreen);
        context.startActivity(intent);
    }

    public static void openStoreDetailsActivity(Activity activity, com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store store)
    {
        Intent intent = new Intent(activity, com/kohls/mcommerce/opal/framework/view/activity/StoreDetailActivity);
        intent.putExtra("store_detail", store);
        activity.startActivity(intent);
    }

    public static void openUrlInWebViewActivity(String s, Context context)
    {
        Intent intent = new Intent(context, com/kohls/mcommerce/opal/framework/view/activity/WebViewActivity);
        intent.putExtra("KEY_URL", s);
        intent.putExtra("EXTRA_KEY_WEBVIEW_FROM_URL", true);
        context.startActivity(intent);
    }

    public static void openWebViewActivity(Activity activity, String s, String s1)
    {
        if (!TextUtils.isEmpty(s))
        {
            Intent intent = new Intent();
            intent.setClass(activity, com/kohls/mcommerce/opal/framework/view/activity/WebViewActivity);
            intent.putExtra("KEY_URL", s);
            intent.putExtra("KEY_SCREENNAME", s1);
            Logger.debug(com/kohls/mcommerce/opal/framework/view/activity/WebViewActivity.getSimpleName(), s);
            activity.startActivity(intent);
        }
    }

    public static void openWebViewActivity(Activity activity, String s, String s1, boolean flag)
    {
        if (!TextUtils.isEmpty(s))
        {
            Intent intent = new Intent();
            intent.setClass(activity, com/kohls/mcommerce/opal/framework/view/activity/WebViewActivity);
            intent.putExtra("KEY_URL", s);
            intent.putExtra("KEY_SCREENNAME", s1);
            intent.putExtra("EXTRA_KEY_OVERRIDE_USERAGENT", flag);
            Logger.debug(com/kohls/mcommerce/opal/framework/view/activity/WebViewActivity.getSimpleName(), s);
            activity.startActivity(intent);
        }
    }

    public static void openWebViewActivityForFAQ(Activity activity, String s, String s1)
    {
        if (!TextUtils.isEmpty(s))
        {
            Intent intent = new Intent();
            intent.setClass(activity, com/kohls/mcommerce/opal/framework/view/activity/WebViewActivity);
            intent.putExtra("KEY_URL", s);
            intent.putExtra("KEY_SCREENNAME", s1);
            Logger.debug(com/kohls/mcommerce/opal/framework/view/activity/WebViewActivity.getSimpleName(), s);
            activity.startActivity(intent);
        }
    }

    public static String parseFeatureBrandResponse(String s)
    {
        String s1;
        String s2;
        s1 = null;
        s2 = null;
        JSONArray jsonarray = (new JSONObject((new JSONObject(s)).getString("payload"))).getJSONArray("entries");
        int i;
        i = 0;
        s = s2;
_L2:
        s1 = s;
        s2 = s;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = s;
        s = jsonarray.getJSONObject(i).getString("properties");
        i++;
        if (true) goto _L2; else goto _L1
        s;
        s.printStackTrace();
        s2 = s1;
_L1:
        return s2;
    }

    public static String parseHmlToString(StringBuilder stringbuilder)
    {
        return stringbuilder.toString().replace("\n", "").replace("<ul>", "").replace("</ul>", "").replace("<li>", "<li> &#8226;  ").replace("<li>", "<span>").replace("</li>", "</span><br>").replace("</strong>", "</strong><br>").replace("<span> &#8226;  Details:", "<span> <p><strong> Details:</strong></p>").replaceAll("</?(a|A).*?>", "");
    }

    public static void recordHprof(int i)
    {
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        String s = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getPath()).append("kohls_prof.hprof").toString();
_L1:
        Debug.dumpHprofData(s);
        return;
        try
        {
            s = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getPath()).append("kohls_prof_").append(i).append(".hprof").toString();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return;
        }
          goto _L1
    }

    public static String removeSingleQuotes(String s)
    {
        String s1 = s;
        String s2 = s1;
        if (s1 != null)
        {
            s2 = s.replaceAll("'", "");
        }
        return s2;
    }

    public static void setApptentiveScreen(Activity activity, String s)
    {
        if (!KohlsPhoneApplication.getInstance().getKohlsPref().isForseeSurveyShown())
        {
            (new Handler()).postDelayed(new _cls9(activity, s), 3000L);
        }
    }

    public static void showAlertDialog(int i, ResultReceiver resultreceiver, String s, String s1, int j, String s2, String s3, String s4, 
            boolean flag, boolean flag1, Activity activity)
    {
        if (activity != null)
        {
            BaseDialogFragment basedialogfragment = new BaseDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("dialogId", i);
            bundle.putString("title", s);
            bundle.putString("message", s1);
            bundle.putInt("drawableID", j);
            if (!TextUtils.isEmpty(s2))
            {
                bundle.putString("positiveBtnText", s2);
            }
            if (!TextUtils.isEmpty(s3))
            {
                bundle.putString("negativeBtnText", s3);
            }
            if (!TextUtils.isEmpty(s4))
            {
                bundle.putString("neutralBtnText", s4);
            }
            bundle.putBoolean("isCancellable", flag1);
            bundle.putBoolean("isCustomView", flag);
            if (resultreceiver != null)
            {
                bundle.putParcelable("resultReceiver", resultreceiver);
            }
            basedialogfragment.setArguments(bundle);
            if (!activity.isFinishing())
            {
                basedialogfragment.show(activity.getFragmentManager(), "alert");
            }
        }
    }

    public static void showGoogleServiceErrorDialog(int i, int j, Activity activity)
    {
    /* block-local class not found */
    class GoogleServiceErrorDialogFragment {}

        GoogleServiceErrorDialogFragment googleserviceerrordialogfragment = new GoogleServiceErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_error", i);
        bundle.putInt("resolution_request_error", j);
        googleserviceerrordialogfragment.setArguments(bundle);
        googleserviceerrordialogfragment.show(activity.getFragmentManager(), "Location updates");
    }

    public static void showImageDisplayDialog(int i, String s, String s1, ResultReceiver resultreceiver, boolean flag, boolean flag1, boolean flag2, int j, 
            Activity activity)
    {
        BaseDialogFragment basedialogfragment = new BaseDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("dialogId", i);
        bundle.putInt("subDialogId", j);
        bundle.putString("message", s1);
        bundle.putString("title", s);
        bundle.putBoolean("isCancellable", flag);
        bundle.putBoolean("isIndeterminate", flag1);
        bundle.putBoolean("isOutsideCancellable", flag2);
        if (resultreceiver != null)
        {
            bundle.putParcelable("resultReceiver", resultreceiver);
        }
        basedialogfragment.setArguments(bundle);
        if (activity != null)
        {
            basedialogfragment.show(activity.getFragmentManager(), "imageDialog");
        }
    }

    public static void showKohlsProgressDialog(int i, String s, String s1, ResultReceiver resultreceiver, boolean flag, boolean flag1, boolean flag2, int j, 
            Activity activity)
    {
        BaseDialogFragment basedialogfragment = new BaseDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("dialogId", i);
        bundle.putInt("subDialogId", j);
        bundle.putString("message", s1);
        bundle.putString("title", s);
        bundle.putBoolean("isCancellable", flag);
        bundle.putBoolean("isIndeterminate", flag1);
        bundle.putBoolean("isOutsideCancellable", flag2);
        if (resultreceiver != null)
        {
            bundle.putParcelable("resultReceiver", resultreceiver);
        }
        basedialogfragment.setArguments(bundle);
        if (activity != null)
        {
            basedialogfragment.show(activity.getFragmentManager(), "progress");
        }
    }

    public static ProgressDialog showProgressDialogWithoutFragment(Context context, String s)
    {
        return ProgressDialog.show(context, "progress", s, true, false);
    }

    public static void showSettingsAlert(Context context)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle(0x7f080104);
        builder.setMessage(0x7f080103);
        builder.setPositiveButton(0x7f0804b6, new _cls2(context));
        builder.setNegativeButton(0x7f0800c7, new _cls3());
        builder.show();
    }

    public static void showToast(Context context, String s, int i)
    {
        if (!TextUtils.isEmpty(s))
        {
            Toast.makeText(context, s, i).show();
        }
    }

    public static List sortArrayStore(List list, int i, String s)
    {
        i;
        JVM INSTR tableswitch 1000 1003: default 32
    //                   1000 34
    //                   1001 47
    //                   1002 53
    //                   1003 66;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return list;
_L2:
        Collections.sort(list, new _cls4());
        return list;
_L3:
        sortStoreByDistance(list);
        return list;
_L4:
        Collections.sort(list, new _cls5());
        return list;
_L5:
        sortStoreByDistance(list);
        if (!TextUtils.isEmpty(s))
        {
            Collections.sort(list, new _cls6(s));
            return list;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    private static void sortStoreByDistance(List list)
    {
        Collections.sort(list, new _cls7());
    }

    public static void startDeleteCart(List list, CartListener cartlistener)
    {
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils() != null && KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn() && isOmniChannelBagClientEnabled())
        {
            ControllerFactory.getPersistentCartController().deleteCartItems(list, cartlistener);
        } else
        if (cartlistener != null)
        {
            cartlistener.onOCBDisabled();
            return;
        }
    }

    public static void startGetCart()
    {
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils() != null && KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn() && isOmniChannelBagClientEnabled())
        {
            ControllerFactory.getPersistentCartController().getCart();
        }
    }

    public static void startUpdateCart(String s, String s1, String s2, String s3, CartListener cartlistener, RegistryObject registryobject, boolean flag, String s4)
    {
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils() != null && KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn() && isOmniChannelBagClientEnabled())
        {
            ControllerFactory.getPersistentCartController().updateCart(s, s1, s2, s3, cartlistener, registryobject, flag, s4);
        } else
        if (cartlistener != null)
        {
            cartlistener.onOCBDisabled();
            return;
        }
    }

    public static CharSequence truncateMaxLength(CharSequence charsequence, TextPaint textpaint, int i)
    {
        if (charsequence == null)
        {
            textpaint = null;
        } else
        {
            textpaint = charsequence;
            if (charsequence.length() > i)
            {
                return (new StringBuilder()).append(charsequence.subSequence(0, i - 4)).append("..").toString();
            }
        }
        return textpaint;
    }

    public static boolean updateProgressTest(int i, String s)
    {
        if (BaseDialogFragment.isDialogVisible(i))
        {
            BaseDialogFragment.getProgressDialog().setMessage(s);
            return true;
        } else
        {
            return false;
        }
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls9 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls7 {}

}
