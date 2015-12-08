// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.common.util;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.activity.AccountActivity;
import com.kohls.mcommerce.opal.framework.view.activity.ProductDetailsActivity;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentOnScreen;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import com.kohls.mcommerce.opal.modules.lnr.common.po.LoggedInUser;
import com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPO;
import com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPropertiesPO;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.MyRegistryActivity;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.BabyRegistryFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.CelebrationRegistryFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.WeddingRegistryFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.ListItem;
import com.kohls.mcommerce.opal.modules.lnr.helper.registry.RegistryDashboardValueGenerator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LnRUtility
{

    public LnRUtility()
    {
    }

    public static boolean containsIgnoreCase(String s, String s1)
    {
        if (s1.equals(""))
        {
            return true;
        }
        if (s == null || s1 == null || s.equals(""))
        {
            return false;
        } else
        {
            return Pattern.compile(s1, 18).matcher(s).find();
        }
    }

    public static void displayAlertDialog(Context context, String s, String s1, String s2, String s3, android.content.DialogInterface.OnClickListener onclicklistener, android.content.DialogInterface.OnClickListener onclicklistener1)
    {
        context = new android.app.AlertDialog.Builder(context);
        context.setTitle(s);
        context.setMessage(s1);
        context.setPositiveButton(s2, onclicklistener);
        context.setNegativeButton(s3, onclicklistener1);
        ((TextView)context.show().findViewById(0x102000b)).setGravity(17);
    }

    public static void fetchDashboardValuesAndCallAddressFragment(MyRegistryActivity myregistryactivity, Fragment fragment, RegistryDashboardValueGenerator registrydashboardvaluegenerator, int i)
    {
        ArrayList arraylist;
        arraylist = registrydashboardvaluegenerator.getDashboardAddedValuesArray(i);
        registrydashboardvaluegenerator = registrydashboardvaluegenerator.getDashboardRemovedValuesArray(i);
        if (arraylist == null || registrydashboardvaluegenerator == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        if (!(fragment instanceof WeddingRegistryFragment)) goto _L2; else goto _L1
_L1:
        ((WeddingRegistryFragment)fragment).goNextForAddressPage(arraylist, registrydashboardvaluegenerator);
_L4:
        return;
_L2:
        if (fragment instanceof BabyRegistryFragment)
        {
            ((BabyRegistryFragment)fragment).goNextForAddressPage(arraylist, registrydashboardvaluegenerator);
            return;
        }
        if (!(fragment instanceof CelebrationRegistryFragment)) goto _L4; else goto _L3
_L3:
        ((CelebrationRegistryFragment)fragment).goNextForAddressPage(arraylist, registrydashboardvaluegenerator);
        return;
        UtilityMethods.showToast(myregistryactivity, myregistryactivity.getResources().getString(0x7f0803be), 0);
        myregistryactivity.setRegistryDashboardValueObject(null);
        return;
    }

    public static String formatBudgetValue(float f)
    {
        String s1 = String.valueOf(f);
        int i = s1.indexOf('.');
        if (i != -1)
        {
            String s = s1;
            if (s1.substring(i, s1.length()).length() == 2)
            {
                s = (new StringBuilder()).append(s1).append("0").toString();
            }
            return s;
        } else
        {
            return (new StringBuilder()).append(s1).append(".00").toString();
        }
    }

    public static double getBudgetSpentPercentage(float f, float f1)
    {
        return Math.ceil((f1 / f) * 100F);
    }

    public static String getChecksum()
    {
        return UtilityMethods.getMD5HexString(getInputForChecksum());
    }

    public static String getCreateOrUserDetailsForList()
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getCreateorGetUserForList();
    }

    public static String getCreateOrUserDetailsForRegistry()
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getCreateorGetUserForRegistry();
    }

    public static com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPropertiesPO.DashboardPO getDashboardPOUsingRegistryType(RegistryPropertiesPO registrypropertiespo, ArrayList arraylist, ArrayList arraylist1)
    {
        registrypropertiespo.getClass();
        registrypropertiespo = new com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPropertiesPO.DashboardPO(registrypropertiespo);
        registrypropertiespo.setVisited(false);
        registrypropertiespo.setAddedArray(arraylist);
        registrypropertiespo.setRemovedArray(arraylist1);
        return registrypropertiespo;
    }

    public static String getDateInListEventDateFormat(Date date)
    {
        return (new SimpleDateFormat("yyyy-MM-dd", Locale.US)).format(date);
    }

    public static int getDaysFromCurrentDate(String s)
    {
        Object obj = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        long l;
        try
        {
            s = ((SimpleDateFormat) (obj)).parse(s);
            obj = ((SimpleDateFormat) (obj)).parse(getDateInListEventDateFormat(new Date()));
            l = (s.getTime() - ((Date) (obj)).getTime()) / 0x5265c00L;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.debug("Error in date", s.toString());
            return -1;
        }
        return (int)l;
    }

    public static String getEventNameForAnalytics(String s, String s1)
    {
        Object obj = null;
        String s2;
        if (s.equals("registry.wedding"))
        {
            s2 = "wedding";
        } else
        {
            if (s.equals("registry.baby"))
            {
                return "baby";
            }
            s2 = obj;
            if (s.equals("registry.splday"))
            {
                s2 = obj;
                if (s1 != null)
                {
                    s2 = obj;
                    if (!TextUtils.isEmpty(s1))
                    {
                        return s1.toLowerCase();
                    }
                }
            }
        }
        return s2;
    }

    public static String getInputForChecksum()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = UtilityMethods.getSaltValue();
        if (!TextUtils.isEmpty(s))
        {
            stringbuffer.append(s);
        }
        String s2 = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref();
        s = s2;
        if (!TextUtils.isEmpty(s2))
        {
            s = s2;
            if (s2.contains(" "))
            {
                s = s2.replace(" ", "");
            }
            stringbuffer.append(s);
        }
        s2 = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserLastnameFromPref();
        if (!TextUtils.isEmpty(s))
        {
            String s1 = s2;
            if (s2.contains(" "))
            {
                s1 = s2.replace(" ", "");
            }
            stringbuffer.append(s1);
        }
        stringbuffer.append(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        return stringbuffer.toString();
    }

    public static String getListBaseUrl()
    {
        String s = null;
        String s1 = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getBaseUrlList();
        s = s1;
_L2:
        String s2;
label0:
        {
            if (s != null)
            {
                s2 = s;
                if (!"".equals(s.trim()))
                {
                    break label0;
                }
            }
            s2 = "https://kregistry5.skavaone.com/kohls/";
        }
        return s2;
        Throwable throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String getListJsessionId()
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getListJsessionId();
    }

    public static String getListResourceUrl(String s, String s1, String s2)
    {
        if (s2 != null && !s2.equals(""))
        {
            return (new StringBuilder()).append(s).append(";jsessionId=").append(s2).append("?").append(s1).toString();
        } else
        {
            return (new StringBuilder()).append(s).append("?").append(s1).toString();
        }
    }

    public static String getListShareURL()
    {
        String s = null;
        String s1 = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getListShareURL();
        s = s1;
_L2:
        String s2;
label0:
        {
            if (s != null)
            {
                s2 = s;
                if (!"".equals(s.trim()))
                {
                    break label0;
                }
            }
            s2 = "http://www.kohls.com/upgrade/giftinglisting/wishlist.jsp?section=list&listid=";
        }
        return s2;
        Throwable throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String getLnRItemImageUrl()
    {
        String s = null;
        String s1 = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getLnrItemImageURL();
        s = s1;
_L2:
        String s2;
label0:
        {
            if (s != null)
            {
                s2 = s;
                if (!"".equals(s.trim()))
                {
                    break label0;
                }
            }
            s2 = "http://simages.kohls.com/is/image/kohls/";
        }
        return s2;
        Throwable throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static LoggedInUser getLoggedInUser()
    {
        LoggedInUser loggedinuser = new LoggedInUser();
        loggedinuser.setEmail(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        loggedinuser.setRetailerUserId(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserID());
        String s2 = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref();
        String s = s2;
        if (!TextUtils.isEmpty(s2))
        {
            s = s2;
            if (s2.contains(" "))
            {
                s = s2.replace(" ", "");
            }
            loggedinuser.setFirstName(s);
        }
        s2 = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserLastnameFromPref();
        if (!TextUtils.isEmpty(s))
        {
            String s1 = s2;
            if (s2.contains(" "))
            {
                s1 = s2.replace(" ", "");
            }
            loggedinuser.setLastName(s1);
        }
        loggedinuser.setCheckSum(getChecksum());
        return loggedinuser;
    }

    public static String getPriceValue(String s, String s1)
    {
        String s3 = "";
        String s2 = s3;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        String s4 = s3;
        try
        {
            s = (new JSONObject((new JSONArray(s)).getString(0))).getString(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return s4;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return s3;
        }
        s2 = s;
        s4 = s;
        s3 = s;
        if (s1.equalsIgnoreCase("promo"))
        {
            break MISSING_BLOCK_LABEL_95;
        }
        s2 = s;
        s4 = s;
        s3 = s;
        if (s.equals(""))
        {
            break MISSING_BLOCK_LABEL_95;
        }
        s4 = s;
        s3 = s;
        s2 = String.format("%.2f", new Object[] {
            Double.valueOf(Double.parseDouble(s))
        });
        return s2;
    }

    public static String getRegistryBaseUrl()
    {
        String s = null;
        String s1 = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getBaseUrlRegistry();
        s = s1;
_L2:
        String s2;
label0:
        {
            if (s != null)
            {
                s2 = s;
                if (!"".equals(s.trim()))
                {
                    break label0;
                }
            }
            s2 = "https://kregistry5.skavaone.com/registry/";
        }
        return s2;
        Throwable throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String getRegistryJsessionId()
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getRegistryJsessionId();
    }

    public static String getRegistryName(RegistryPO registrypo, Context context)
    {
        String s;
        String s1 = "";
        s = s1;
        if (registrypo.getRegistryProperties().getProperties().getOwnerFirstName() != null)
        {
            s = s1;
            if (registrypo.getRegistryProperties().getProperties().getOwnerFirstName().length() > 0)
            {
                s = registrypo.getRegistryProperties().getProperties().getOwnerFirstName();
            }
        }
        if ("".equals(s)) goto _L2; else goto _L1
_L1:
        String s2;
        s2 = s;
        if (registrypo.getRegistryProperties().getProperties().getPartnerFirstName() != null)
        {
            s2 = s;
            if (registrypo.getRegistryProperties().getProperties().getPartnerFirstName().length() > 0)
            {
                s2 = (new StringBuilder()).append(s).append(context.getResources().getString(0x7f080305)).append(registrypo.getRegistryProperties().getProperties().getPartnerFirstName()).toString();
            }
        }
_L4:
        if (registrypo.getRegistryProperties().getProperties().getRegtype().contains("wedding"))
        {
            return (new StringBuilder()).append(s2).append("'s Wedding Registry").toString();
        }
        break; /* Loop/switch isn't completed */
_L2:
        s2 = s;
        if (registrypo.getRegistryProperties().getProperties().getPartnerFirstName() != null)
        {
            s2 = s;
            if (registrypo.getRegistryProperties().getProperties().getPartnerFirstName().length() > 0)
            {
                s2 = registrypo.getRegistryProperties().getProperties().getPartnerFirstName();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (registrypo.getRegistryProperties().getProperties().getRegtype().contains("baby"))
        {
            return (new StringBuilder()).append(s2).append("'s Baby Registry").toString();
        } else
        {
            return (new StringBuilder()).append(s2).append("'s ").append(registrypo.getRegistryProperties().getProperties().getCustomEventType()).append(" Registry").toString();
        }
    }

    public static String getRegistryName(com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList wishlist, Context context)
    {
        String s;
        String s1 = "";
        s = s1;
        if (wishlist.getRegistryProperties().getProperties().getOwnerFirstName() != null)
        {
            s = s1;
            if (wishlist.getRegistryProperties().getProperties().getOwnerFirstName().length() > 0)
            {
                s = wishlist.getRegistryProperties().getProperties().getOwnerFirstName();
            }
        }
        if ("".equals(s)) goto _L2; else goto _L1
_L1:
        String s2;
        s2 = s;
        if (wishlist.getRegistryProperties().getProperties().getPartnerFirstName() != null)
        {
            s2 = s;
            if (wishlist.getRegistryProperties().getProperties().getPartnerFirstName().length() > 0)
            {
                s2 = (new StringBuilder()).append(s).append(context.getResources().getString(0x7f080305)).append(wishlist.getRegistryProperties().getProperties().getPartnerFirstName()).toString();
            }
        }
_L4:
        if (wishlist.getRegistryProperties().getProperties().getRegtype().contains("wedding"))
        {
            return (new StringBuilder()).append(s2).append("'s Wedding Registry").toString();
        }
        break; /* Loop/switch isn't completed */
_L2:
        s2 = s;
        if (wishlist.getRegistryProperties().getProperties().getPartnerFirstName() != null)
        {
            s2 = s;
            if (wishlist.getRegistryProperties().getProperties().getPartnerFirstName().length() > 0)
            {
                s2 = wishlist.getRegistryProperties().getProperties().getPartnerFirstName();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (wishlist.getRegistryProperties().getProperties().getRegtype().contains("baby"))
        {
            return (new StringBuilder()).append(s2).append("'s Baby Registry").toString();
        } else
        {
            return (new StringBuilder()).append(s2).append("'s ").append(wishlist.getRegistryProperties().getProperties().getCustomEventType()).append(" Registry").toString();
        }
    }

    public static String getRegistryName(String s)
    {
        String s1 = "";
        if (s.equals("registry.wedding"))
        {
            s1 = "wedding";
        } else
        {
            if (s.equals("registry.baby"))
            {
                return "baby";
            }
            if (s.equals("registry.splday"))
            {
                return "splday";
            }
        }
        return s1;
    }

    public static String getRegistryNameForAnalytics(String s, boolean flag, long l)
    {
        if (flag)
        {
            return (new StringBuilder()).append("registry:").append(s).append(":").append(l).append("|guest").toString();
        } else
        {
            return (new StringBuilder()).append("registry:").append(s).append(":").append(l).append("|owner").toString();
        }
    }

    public static String getRegistryShareURL()
    {
        String s = null;
        String s1 = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getRegistryShareURL();
        s = s1;
_L2:
        String s2;
label0:
        {
            if (s != null)
            {
                s2 = s;
                if (!"".equals(s.trim()))
                {
                    break label0;
                }
            }
            s2 = "http://www.kohls.com/upgrade/gift_registry/kohlsgrw_home.jsp?section=list&listid=";
        }
        return s2;
        Throwable throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String getReminderAPIDate(String s)
    {
        try
        {
            s = getReminderAPIDateFormat((new SimpleDateFormat("MMMM dd, yyyy", Locale.US)).parse(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Date Parsing failed", s.toString());
            return "";
        }
        return s;
    }

    public static String getReminderAPIDateFormat(Date date)
    {
        return (new SimpleDateFormat("yyyy-MM-dd", Locale.US)).format(date);
    }

    public static String getReminderDateDisplayFormat(Date date)
    {
        return (new SimpleDateFormat("MMMM dd, yyyy", Locale.US)).format(date);
    }

    public static String getReminderDisplayDate(String s)
    {
        try
        {
            s = getReminderDateDisplayFormat((new SimpleDateFormat("yyyy-MM-dd", Locale.US)).parse(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Date Parsing failed", s.toString());
            return "";
        }
        return s;
    }

    public static String getResponseJsonString(String s)
    {
        try
        {
            s = s.substring(s.indexOf("(") + 1, s.lastIndexOf(")"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.debug("LnRUtility - getResponseJsonString", "Response Callback parsing Issue occured");
            return "{}";
        }
        return s;
    }

    public static String getShareListURL(long l, String s)
    {
        if (s == null)
        {
            return null;
        }
        if (s.equals("share_originated_from_list"))
        {
            s = new StringBuffer(getListShareURL());
        } else
        {
            s = new StringBuffer(getRegistryShareURL());
        }
        s.append(l);
        return s.toString();
    }

    public static int getSpinnerItemPosition(String as[], String s)
    {
        for (int i = 0; i < as.length; i++)
        {
            if (as[i].equals(s))
            {
                return i;
            }
        }

        return -1;
    }

    public static String getValIconUrl(String s)
    {
        if (s == null)
        {
            return "";
        }
        s = s.toLowerCase();
        if (s.contains("war.gif".toLowerCase()))
        {
            return "http://d16rliti0tklvn.cloudfront.net/5/war.gif";
        }
        if (s.contains("morecolors.gif".toLowerCase()))
        {
            return "http://d16rliti0tklvn.cloudfront.net/5/1376916393655.1217695000.gif";
        }
        if (s.contains("rebate.gif".toLowerCase()))
        {
            return "http://d16rliti0tklvn.cloudfront.net/5/rebate.gif";
        }
        if (s.contains("online_exclusive".toLowerCase()))
        {
            return "http://d16rliti0tklvn.cloudfront.net/5/1376916272203.373873069.gif";
        }
        if (s.contains("bogo_1_1_D_100.gif".toLowerCase()))
        {
            return "http://d16rliti0tklvn.cloudfront.net/5/bogo_1_1_D_100.gif";
        }
        if (s.contains("bogo_1_1_P_50.gif".toLowerCase()))
        {
            return "http://d16rliti0tklvn.cloudfront.net/5/bogo_1_1_P_50.gif";
        }
        if (s.contains("bogo_1_1.gif".toLowerCase()))
        {
            return "http://d16rliti0tklvn.cloudfront.net/5/bogo_1_1.gif";
        }
        if (s.contains("bogo_2_1.gif".toLowerCase()))
        {
            return "http://d16rliti0tklvn.cloudfront.net/5/bogo_2_1.gif";
        } else
        {
            return "";
        }
    }

    public static void hideEditTextUserEntryError(Activity activity, EditText edittext, TextView textview)
    {
        if (textview != null)
        {
            textview.setText("");
            textview.setVisibility(8);
        }
        if (edittext != null)
        {
            int i = (int)UtilityMethods.convertDpToPixel(10F, activity);
            edittext.setBackgroundResource(0x7f02013e);
            edittext.setPadding(i, i, i, i);
        }
    }

    public static void hideOrShowProgressBar(boolean flag, View view)
    {
        if (flag)
        {
            view.setVisibility(0);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    public static RegistryPO mapWishlistToRegistryPO(com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList wishlist)
    {
        RegistryPO registrypo = new RegistryPO();
        if (wishlist != null)
        {
            registrypo.setRegistryProperties(wishlist.getRegistryProperties());
            registrypo.setRegistryName(wishlist.getListName());
            registrypo.setBudget(wishlist.getBudget());
            registrypo.setEventDate(wishlist.getListEventDate());
            registrypo.setPromoCode(wishlist.getPromoCode());
            registrypo.setPublic(wishlist.isPublic());
        }
        return registrypo;
    }

    public static void openAccountActivity(Context context, boolean flag, FragmentOnScreen fragmentonscreen)
    {
        Intent intent = new Intent();
        intent.putExtra("show_create_account", flag);
        intent.putExtra("show_screen_on_result", fragmentonscreen.ordinal());
        intent.setClass(context, com/kohls/mcommerce/opal/framework/view/activity/AccountActivity);
        ((Activity)context).startActivityForResult(intent, 7001);
    }

    public static void openProductDetailsFromLDP(Activity activity, ListItem listitem, boolean flag)
    {
        Intent intent = new Intent();
        intent.setClass(activity, com/kohls/mcommerce/opal/framework/view/activity/ProductDetailsActivity);
        intent.putExtra("key_category_id", listitem.getItemProductId());
        intent.putExtra("from", "Recommendations");
        intent.putExtra("key_sku_from_list_or_registry", listitem.getItemId());
        intent.putExtra("key_qty_from_list_or_registry", (new StringBuilder()).append(listitem.getWantedQty()).append("").toString());
        if (flag)
        {
            activity.finish();
        }
        activity.startActivity(intent);
        activity.overridePendingTransition(0x7f05000b, 0x7f05000a);
    }

    public static String removeExtraSpaces(String s)
    {
        String s1 = "";
        StringTokenizer stringtokenizer = new StringTokenizer(s, " ");
        for (s = s1; stringtokenizer.hasMoreTokens(); s = (new StringBuilder()).append(s).append(stringtokenizer.nextToken().trim()).append(" ").toString()) { }
        return s.trim();
    }

    public static String replaceSpaceWithUnderscore(String s)
    {
        return s.replaceAll(" ", "_");
    }

    public static void setDefaultValueforRegistryUser(Activity activity, EditText edittext, EditText edittext1)
    {
        String s = AuthUtil.getInstance(activity).getSignedInUsernameFromPref();
        activity = AuthUtil.getInstance(activity).getSignedInUserLastnameFromPref();
        if (s != null && !s.equals(""))
        {
            edittext.setText(s);
        }
        if (activity != null && !activity.equals(""))
        {
            edittext1.setText(activity);
        }
    }

    public static void setRegistryHeaderLayoutParams(Activity activity, ImageView imageview, View view)
    {
        imageview.getViewTreeObserver().addOnPreDrawListener(new _cls2(imageview, view));
    }

    public static void showBudgetUpdationToast(Activity activity, String s, float f)
    {
label0:
        {
            if (s.equals("budget_fragment"))
            {
                if (f != 0.0F)
                {
                    break label0;
                }
                ToastUtility.showCustomToast(activity.getActionBar().getHeight(), activity.getString(0x7f080187));
            }
            return;
        }
        ToastUtility.showCustomToast(activity.getActionBar().getHeight(), activity.getString(0x7f080188));
    }

    public static DatePickerDialog showDatePicker(Activity activity, Calendar calendar, android.app.DatePickerDialog.OnDateSetListener ondatesetlistener, boolean flag, boolean flag1, int i, TextView textview)
    {
        Calendar calendar1;
        Calendar calendar2;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        calendar1 = Calendar.getInstance();
        calendar2 = Calendar.getInstance();
        calendar2.set(calendar2.get(1) + i, calendar2.get(2), calendar2.get(5));
        textview = textview.getText().toString();
        k = calendar.get(1);
        l = calendar.get(2);
        j1 = calendar.get(5);
        j = k;
        i = l;
        i1 = j1;
        if (textview == null)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        j = k;
        i = l;
        i1 = j1;
        if (textview.equals(""))
        {
            break MISSING_BLOCK_LABEL_218;
        }
        j = k;
        i = l;
        calendar = (new SimpleDateFormat("MMMM dd, yyyy", Locale.US)).parse(textview);
        j = k;
        i = l;
        textview = Calendar.getInstance();
        j = k;
        i = l;
        textview.setTime(calendar);
        j = k;
        i = l;
        k = textview.get(1);
        j = k;
        i = l;
        l = textview.get(2);
        j = k;
        i = l;
        i1 = textview.get(5);
        i = l;
        j = k;
_L2:
        calendar = new DatePickerDialog(activity, ondatesetlistener, j, i, i1);
        calendar.setButton(-2, "Cancel", new _cls1(activity, calendar));
        activity = calendar.getDatePicker();
        if (flag)
        {
            activity.setMinDate(calendar1.getTimeInMillis());
        }
        if (flag1)
        {
            activity.setMaxDate(calendar2.getTimeInMillis());
        }
        calendar.show();
        return calendar;
        calendar;
        Logger.debug("Date Parsing", calendar.toString());
        i1 = j1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void showEditTextUserEntryError(Activity activity, EditText edittext, TextView textview, int i)
    {
        textview.setText(activity.getResources().getString(i));
        textview.setVisibility(0);
        if (edittext != null)
        {
            i = (int)UtilityMethods.convertDpToPixel(10F, activity);
            edittext.setBackgroundResource(0x7f020149);
            edittext.setPadding(i, i, i, i);
        }
    }

    public static void showReminderUpdationToast(Activity activity, String s, Bundle bundle)
    {
label0:
        {
            if (s.equals("reminder_fragment"))
            {
                if (bundle == null || !bundle.getBoolean("list_reminder_updated"))
                {
                    break label0;
                }
                ToastUtility.showCustomToast(activity.getActionBar().getHeight(), activity.getString(0x7f0802fb));
            }
            return;
        }
        ToastUtility.showCustomToast(activity.getActionBar().getHeight(), activity.getString(0x7f0802f8));
    }

    public static String underlineString(String s)
    {
        SpannableString spannablestring = new SpannableString(s);
        spannablestring.setSpan(new UnderlineSpan(), 0, s.length(), 0);
        return spannablestring.toString();
    }

    public static boolean validateFieldsEntered(Context context, EditText edittext, TextView textview)
    {
        if (edittext.getText().toString().trim().length() < 2)
        {
            textview.setText(context.getResources().getString(0x7f08028a));
            textview.setVisibility(0);
            edittext.setBackgroundResource(0x7f020149);
            int i = (int)UtilityMethods.convertDpToPixel(10F, context);
            edittext.setPadding(i, i, i, i);
            return false;
        } else
        {
            textview.setVisibility(4);
            edittext.setBackgroundResource(0x7f02013e);
            int j = (int)UtilityMethods.convertDpToPixel(10F, context);
            edittext.setPadding(j, j, j, j);
            return true;
        }
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
