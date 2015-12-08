// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.internal.zzhw;

public final class zzf
{

    public static final String zzg(Context context, int i)
    {
        context = context.getResources();
        switch (i)
        {
        default:
            Log.e("GooglePlayServicesUtil", (new StringBuilder()).append("Unexpected error code ").append(i).toString());
            // fall through

        case 4: // '\004'
        case 6: // '\006'
            return null;

        case 1: // '\001'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_install_title);

        case 3: // '\003'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_enable_title);

        case 2: // '\002'
        case 18: // '\022'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_update_title);

        case 42: // '*'
            return context.getString(com.google.android.gms.R.string.common_android_wear_update_title);

        case 9: // '\t'
            Log.e("GooglePlayServicesUtil", "Google Play services is invalid. Cannot recover.");
            return context.getString(com.google.android.gms.R.string.common_google_play_services_unsupported_title);

        case 7: // '\007'
            Log.e("GooglePlayServicesUtil", "Network error occurred. Please retry request later.");
            return context.getString(com.google.android.gms.R.string.common_google_play_services_network_error_title);

        case 8: // '\b'
            Log.e("GooglePlayServicesUtil", "Internal error occurred. Please see logs for detailed information");
            return null;

        case 10: // '\n'
            Log.e("GooglePlayServicesUtil", "Developer error occurred. Please see logs for detailed information");
            return null;

        case 5: // '\005'
            Log.e("GooglePlayServicesUtil", "An invalid account was specified when connecting. Please provide a valid account.");
            return context.getString(com.google.android.gms.R.string.common_google_play_services_invalid_account_title);

        case 11: // '\013'
            Log.e("GooglePlayServicesUtil", "The application is not licensed to the user.");
            return null;

        case 16: // '\020'
            Log.e("GooglePlayServicesUtil", "One of the API components you attempted to connect to is not available.");
            return null;

        case 17: // '\021'
            Log.e("GooglePlayServicesUtil", "The specified account could not be signed in.");
            break;
        }
        return context.getString(com.google.android.gms.R.string.common_google_play_services_sign_in_failed_title);
    }

    public static String zzh(Context context, int i)
    {
        Resources resources = context.getResources();
        switch (i)
        {
        default:
            return resources.getString(com.google.android.gms.R.string.common_google_play_services_unknown_issue);

        case 1: // '\001'
            if (zzhw.zzb(context.getResources()))
            {
                return resources.getString(com.google.android.gms.R.string.common_google_play_services_install_text_tablet);
            } else
            {
                return resources.getString(com.google.android.gms.R.string.common_google_play_services_install_text_phone);
            }

        case 3: // '\003'
            return resources.getString(com.google.android.gms.R.string.common_google_play_services_enable_text);

        case 2: // '\002'
        case 18: // '\022'
            return resources.getString(com.google.android.gms.R.string.common_google_play_services_update_text);

        case 42: // '*'
            return resources.getString(com.google.android.gms.R.string.common_android_wear_update_text);

        case 9: // '\t'
            return resources.getString(com.google.android.gms.R.string.common_google_play_services_unsupported_text);

        case 7: // '\007'
            return resources.getString(com.google.android.gms.R.string.common_google_play_services_network_error_text);

        case 5: // '\005'
            return resources.getString(com.google.android.gms.R.string.common_google_play_services_invalid_account_text);

        case 16: // '\020'
            return resources.getString(com.google.android.gms.R.string.commono_google_play_services_api_unavailable_text);

        case 17: // '\021'
            return resources.getString(com.google.android.gms.R.string.common_google_play_services_sign_in_failed_text);
        }
    }

    public static String zzi(Context context, int i)
    {
        context = context.getResources();
        switch (i)
        {
        default:
            return context.getString(0x104000a);

        case 1: // '\001'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_install_button);

        case 3: // '\003'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_enable_button);

        case 2: // '\002'
        case 18: // '\022'
        case 42: // '*'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_update_button);
        }
    }

    public static String zzj(Context context, int i)
    {
        context = context.getResources();
        switch (i)
        {
        default:
            return context.getString(com.google.android.gms.R.string.common_google_play_services_unknown_issue);

        case 1: // '\001'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_notification_needs_installation_title);

        case 2: // '\002'
        case 18: // '\022'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_notification_needs_update_title);

        case 42: // '*'
            return context.getString(com.google.android.gms.R.string.common_android_wear_notification_needs_update_text);

        case 3: // '\003'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_needs_enabling_title);

        case 9: // '\t'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_unsupported_text);

        case 7: // '\007'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_network_error_text);

        case 5: // '\005'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_invalid_account_text);

        case 16: // '\020'
            return context.getString(com.google.android.gms.R.string.commono_google_play_services_api_unavailable_text);

        case 17: // '\021'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_sign_in_failed_text);
        }
    }
}
