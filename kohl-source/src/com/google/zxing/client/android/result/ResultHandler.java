// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.client.android.Contents;
import com.google.zxing.client.android.LocaleManager;
import com.google.zxing.client.android.book.SearchBookContentsActivity;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;
import com.google.zxing.client.result.ResultParser;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;

public abstract class ResultHandler
{

    private static final String ADDRESS_TYPE_STRINGS[] = {
        "home", "work"
    };
    private static final int ADDRESS_TYPE_VALUES[] = {
        1, 2
    };
    private static final String EMAIL_TYPE_STRINGS[] = {
        "home", "work", "mobile"
    };
    private static final int EMAIL_TYPE_VALUES[] = {
        1, 2, 4
    };
    public static final int MAX_BUTTON_COUNT = 4;
    private static final int NO_TYPE = -1;
    private static final String PHONE_TYPE_STRINGS[] = {
        "home", "work", "mobile", "fax", "pager", "main"
    };
    private static final int PHONE_TYPE_VALUES[] = {
        1, 3, 2, 4, 6, 12
    };
    private static final String TAG = com/google/zxing/client/android/result/ResultHandler.getSimpleName();
    private final Activity activity;
    private final String customProductSearch;
    private final Result rawResult;
    private final ParsedResult result;

    ResultHandler(Activity activity1, ParsedResult parsedresult)
    {
        this(activity1, parsedresult, null);
    }

    ResultHandler(Activity activity1, ParsedResult parsedresult, Result result1)
    {
        result = parsedresult;
        activity = activity1;
        rawResult = result1;
        customProductSearch = parseCustomSearchURL();
    }

    private static int doToContractType(String s, String as[], int ai[])
    {
        if (s != null)
        {
            int i = 0;
            while (i < as.length) 
            {
                String s1 = as[i];
                if (s.startsWith(s1) || s.startsWith(s1.toUpperCase(Locale.ENGLISH)))
                {
                    return ai[i];
                }
                i++;
            }
        }
        return -1;
    }

    private String parseCustomSearchURL()
    {
        String s1 = PreferenceManager.getDefaultSharedPreferences(activity).getString("preferences_custom_product_search", null);
        String s = s1;
        if (s1 != null)
        {
            s = s1;
            if (s1.trim().isEmpty())
            {
                s = null;
            }
        }
        return s;
    }

    private static void putExtra(Intent intent, String s, String s1)
    {
        if (s1 != null && !s1.isEmpty())
        {
            intent.putExtra(s, s1);
        }
    }

    private static int toAddressContractType(String s)
    {
        return doToContractType(s, ADDRESS_TYPE_STRINGS, ADDRESS_TYPE_VALUES);
    }

    private static int toEmailContractType(String s)
    {
        return doToContractType(s, EMAIL_TYPE_STRINGS, EMAIL_TYPE_VALUES);
    }

    private static int toPhoneContractType(String s)
    {
        return doToContractType(s, PHONE_TYPE_STRINGS, PHONE_TYPE_VALUES);
    }

    final void addContact(String as[], String as1[], String s, String as2[], String as3[], String as4[], String as5[], 
            String s1, String s2, String s3, String s4, String s5, String s6, String as6[], 
            String s7, String as7[])
    {
        Intent intent = new Intent("android.intent.action.INSERT_OR_EDIT", android.provider.ContactsContract.Contacts.CONTENT_URI);
        intent.setType("vnd.android.cursor.item/contact");
        int i;
        int j1;
        if (as != null)
        {
            as = as[0];
        } else
        {
            as = null;
        }
        putExtra(intent, "name", as);
        putExtra(intent, "phonetic_name", s);
        if (as2 != null)
        {
            i = as2.length;
        } else
        {
            i = 0;
        }
        j1 = Math.min(i, Contents.PHONE_KEYS.length);
        for (i = 0; i < j1; i++)
        {
            putExtra(intent, Contents.PHONE_KEYS[i], as2[i]);
            if (as3 == null || i >= as3.length)
            {
                continue;
            }
            int l1 = toPhoneContractType(as3[i]);
            if (l1 >= 0)
            {
                intent.putExtra(Contents.PHONE_TYPE_KEYS[i], l1);
            }
        }

        if (as4 != null)
        {
            i = as4.length;
        } else
        {
            i = 0;
        }
        j1 = Math.min(i, Contents.EMAIL_KEYS.length);
        for (i = 0; i < j1; i++)
        {
            putExtra(intent, Contents.EMAIL_KEYS[i], as4[i]);
            if (as5 == null || i >= as5.length)
            {
                continue;
            }
            int i2 = toEmailContractType(as5[i]);
            if (i2 >= 0)
            {
                intent.putExtra(Contents.EMAIL_TYPE_KEYS[i], i2);
            }
        }

        as = new StringBuilder();
        if (as6 != null)
        {
            j1 = as6.length;
            for (int j = 0; j < j1; j++)
            {
                s = as6[j];
                if (s != null && !s.isEmpty())
                {
                    as.append('\n').append(s);
                }
            }

        }
        s = new String[2];
        s[0] = s7;
        s[1] = s1;
        j1 = s.length;
        for (int k = 0; k < j1; k++)
        {
            as2 = s[k];
            if (as2 != null)
            {
                as.append('\n').append(as2);
            }
        }

        if (as1 != null)
        {
            int k1 = as1.length;
            for (int l = 0; l < k1; l++)
            {
                s = as1[l];
                if (s != null && !s.isEmpty())
                {
                    as.append('\n').append(s);
                }
            }

        }
        if (as7 != null)
        {
            as.append('\n').append(as7[0]).append(',').append(as7[1]);
        }
        if (as.length() > 0)
        {
            putExtra(intent, "notes", as.substring(1));
        }
        putExtra(intent, "im_handle", s2);
        putExtra(intent, "postal", s3);
        if (s4 != null)
        {
            int i1 = toAddressContractType(s4);
            if (i1 >= 0)
            {
                intent.putExtra("postal_type", i1);
            }
        }
        putExtra(intent, "company", s5);
        putExtra(intent, "job_title", s6);
        launchIntent(intent);
    }

    final void addEmailOnlyContact(String as[], String as1[])
    {
        addContact(null, null, null, null, null, as, as1, null, null, null, null, null, null, null, null, null);
    }

    final void addPhoneOnlyContact(String as[], String as1[])
    {
        addContact(null, null, null, as, as1, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean areContentsSecure()
    {
        return false;
    }

    final void dialPhone(String s)
    {
        launchIntent(new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder()).append("tel:").append(s).toString())));
    }

    final void dialPhoneFromUri(String s)
    {
        launchIntent(new Intent("android.intent.action.DIAL", Uri.parse(s)));
    }

    final String fillInCustomSearchURL(String s)
    {
        if (customProductSearch != null) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        String s1 = URLEncoder.encode(s, "UTF-8");
        s = s1;
_L4:
        String s2 = customProductSearch.replace("%s", s);
        s = s2;
        if (rawResult != null)
        {
            s2 = s2.replace("%f", rawResult.getBarcodeFormat().toString());
            s = s2;
            if (s2.contains("%t"))
            {
                return s2.replace("%t", ResultParser.parseResult(rawResult).getType().toString());
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
          goto _L4
    }

    final Activity getActivity()
    {
        return activity;
    }

    public abstract int getButtonCount();

    public abstract int getButtonText(int i);

    final void getDirections(double d, double d1)
    {
        launchIntent(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("http://maps.google.").append(LocaleManager.getCountryTLD(activity)).append("/maps?f=d&daddr=").append(d).append(',').append(d1).toString())));
    }

    public CharSequence getDisplayContents()
    {
        return result.getDisplayResult().replace("\r", "");
    }

    public abstract int getDisplayTitle();

    public final ParsedResult getResult()
    {
        return result;
    }

    public final ParsedResultType getType()
    {
        return result.getType();
    }

    public abstract void handleButtonPress(int i);

    final boolean hasCustomProductSearch()
    {
        return customProductSearch != null;
    }

    final void launchIntent(Intent intent)
    {
        try
        {
            rawLaunchIntent(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            intent = new android.app.AlertDialog.Builder(activity);
        }
        intent.setTitle(com.google.zxing.client.android.R.string.app_name);
        intent.setMessage(com.google.zxing.client.android.R.string.msg_intent_failed);
        intent.setPositiveButton(com.google.zxing.client.android.R.string.button_ok, null);
        intent.show();
    }

    final void openBookSearch(String s)
    {
        launchIntent(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("http://books.google.").append(LocaleManager.getBookSearchCountryTLD(activity)).append("/books?vid=isbn").append(s).toString())));
    }

    final void openMap(String s)
    {
        launchIntent(new Intent("android.intent.action.VIEW", Uri.parse(s)));
    }

    final void openProductSearch(String s)
    {
        launchIntent(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("http://www.google.").append(LocaleManager.getProductSearchCountryTLD(activity)).append("/m/products?q=").append(s).append("&source=zxing").toString())));
    }

    final void openURL(String s)
    {
        String s1;
        if (s.startsWith("HTTP://"))
        {
            s1 = (new StringBuilder()).append("http").append(s.substring(4)).toString();
        } else
        {
            s1 = s;
            if (s.startsWith("HTTPS://"))
            {
                s1 = (new StringBuilder()).append("https").append(s.substring(5)).toString();
            }
        }
        s = new Intent("android.intent.action.VIEW", Uri.parse(s1));
        try
        {
            launchIntent(s);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            Log.w(TAG, (new StringBuilder()).append("Nothing available to handle ").append(s).toString());
        }
    }

    final void rawLaunchIntent(Intent intent)
    {
        if (intent != null)
        {
            intent.addFlags(0x80000);
            Log.d(TAG, (new StringBuilder()).append("Launching intent: ").append(intent).append(" with extras: ").append(intent.getExtras()).toString());
            activity.startActivity(intent);
        }
    }

    final void searchBookContents(String s)
    {
        Intent intent = new Intent("com.google.zxing.client.android.SEARCH_BOOK_CONTENTS");
        intent.setClassName(activity, com/google/zxing/client/android/book/SearchBookContentsActivity.getName());
        putExtra(intent, "ISBN", s);
        launchIntent(intent);
    }

    final void searchMap(String s, String s1)
    {
        String s2 = s;
        if (s1 != null)
        {
            s2 = s;
            if (!s1.isEmpty())
            {
                s2 = (new StringBuilder()).append(s).append(" (").append(s1).append(')').toString();
            }
        }
        launchIntent(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("geo:0,0?q=").append(Uri.encode(s2)).toString())));
    }

    final void sendEmail(String s, String s1, String s2)
    {
        sendEmailFromUri((new StringBuilder()).append("mailto:").append(s).toString(), s, s1, s2);
    }

    final void sendEmailFromUri(String s, String s1, String s2, String s3)
    {
        s = new Intent("android.intent.action.SEND", Uri.parse(s));
        if (s1 != null)
        {
            s.putExtra("android.intent.extra.EMAIL", new String[] {
                s1
            });
        }
        putExtra(s, "android.intent.extra.SUBJECT", s2);
        putExtra(s, "android.intent.extra.TEXT", s3);
        s.setType("text/plain");
        launchIntent(s);
    }

    final void sendMMS(String s, String s1, String s2)
    {
        sendMMSFromUri((new StringBuilder()).append("mmsto:").append(s).toString(), s1, s2);
    }

    final void sendMMSFromUri(String s, String s1, String s2)
    {
        s = new Intent("android.intent.action.SENDTO", Uri.parse(s));
        if (s1 == null || s1.isEmpty())
        {
            putExtra(s, "subject", activity.getString(com.google.zxing.client.android.R.string.msg_default_mms_subject));
        } else
        {
            putExtra(s, "subject", s1);
        }
        putExtra(s, "sms_body", s2);
        s.putExtra("compose_mode", true);
        launchIntent(s);
    }

    final void sendSMS(String s, String s1)
    {
        sendSMSFromUri((new StringBuilder()).append("smsto:").append(s).toString(), s1);
    }

    final void sendSMSFromUri(String s, String s1)
    {
        s = new Intent("android.intent.action.SENDTO", Uri.parse(s));
        putExtra(s, "sms_body", s1);
        s.putExtra("compose_mode", true);
        launchIntent(s);
    }

    final void shareByEmail(String s)
    {
        sendEmailFromUri("mailto:", null, null, s);
    }

    final void shareBySMS(String s)
    {
        sendSMSFromUri("smsto:", s);
    }

    final void webSearch(String s)
    {
        Intent intent = new Intent("android.intent.action.WEB_SEARCH");
        intent.putExtra("query", s);
        launchIntent(intent);
    }

}
