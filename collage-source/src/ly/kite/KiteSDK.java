// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.UUID;
import ly.kite.catalogue.AssetHelper;
import ly.kite.journey.ImageSource;
import ly.kite.journey.selection.ProductSelectionActivity;
import ly.kite.util.ImageAgent;

public class KiteSDK
{
    public static final class DefaultEnvironment extends Enum
        implements IEnvironment
    {

        private static final DefaultEnvironment $VALUES[];
        public static final DefaultEnvironment LIVE;
        public static final DefaultEnvironment STAGING;
        public static final DefaultEnvironment TEST;
        private Environment mEnvironment;

        public static DefaultEnvironment valueOf(String s)
        {
            return (DefaultEnvironment)Enum.valueOf(ly/kite/KiteSDK$DefaultEnvironment, s);
        }

        public static DefaultEnvironment[] values()
        {
            return (DefaultEnvironment[])$VALUES.clone();
        }

        public String getAPIEndpoint()
        {
            return mEnvironment.getAPIEndpoint();
        }

        public String getName()
        {
            return mEnvironment.getName();
        }

        public String getPayPalAPIEndpoint()
        {
            return mEnvironment.getPayPalAPIEndpoint();
        }

        public String getPayPalClientId()
        {
            return mEnvironment.getPayPalClientId();
        }

        public String getPayPalEnvironment()
        {
            return mEnvironment.getPayPalEnvironment();
        }

        public String getPayPalPassword()
        {
            return mEnvironment.getPayPalPassword();
        }

        public String getPaymentActivityEnvironment()
        {
            return mEnvironment.getPaymentActivityEnvironment();
        }

        public void writeTo(android.content.SharedPreferences.Editor editor)
        {
            mEnvironment.writeTo(editor);
        }

        static 
        {
            LIVE = new DefaultEnvironment("LIVE", 0, "Live", "https://api.kite.ly/v1.4", "ly.kite.ENVIRONMENT_LIVE", "live", "api.paypal.com", "ASYVBBCHF_KwVUstugKy4qvpQaPlUeE_5beKRJHpIP2d3SA_jZrsaUDTmLQY", "");
            TEST = new DefaultEnvironment("TEST", 1, "Test", "https://api.kite.ly/v1.4", "ly.kite.ENVIRONMENT_TEST", "sandbox", "api.sandbox.paypal.com", "AcEcBRDxqcCKiikjm05FyD4Sfi4pkNP98AYN67sr3_yZdBe23xEk0qhdhZLM", "");
            STAGING = new DefaultEnvironment("STAGING", 2, "Staging", "http://staging.api.kite.ly", "ly.kite.ENVIRONMENT_STAGING", "sandbox", "api.sandbox.paypal.com", "AcEcBRDxqcCKiikjm05FyD4Sfi4pkNP98AYN67sr3_yZdBe23xEk0qhdhZLM", "");
            $VALUES = (new DefaultEnvironment[] {
                LIVE, TEST, STAGING
            });
        }

        private DefaultEnvironment(String s, int i, String s1, String s2, String s3, String s4, String s5, 
                String s6, String s7)
        {
            super(s, i);
            mEnvironment = new Environment(s1, s2, s3, s4, s5, s6, s7);
        }
    }

    public static class Environment
        implements Parcelable, IEnvironment
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        private final String mAPIEndpoint;
        private final String mName;
        private final String mPayPalAPIEndpoint;
        private final String mPayPalClientId;
        private final String mPayPalEnvironment;
        private final String mPayPalPassword;
        private final String mPaymentActivityEnvironment;

        static Environment getFrom(IEnvironment ienvironment)
        {
            if (ienvironment instanceof Environment)
            {
                return (Environment)ienvironment;
            } else
            {
                return new Environment(ienvironment);
            }
        }

        public int describeContents()
        {
            return 0;
        }

        public String getAPIEndpoint()
        {
            return mAPIEndpoint;
        }

        public String getName()
        {
            return mName;
        }

        public String getPayPalAPIEndpoint()
        {
            return mPayPalAPIEndpoint;
        }

        public String getPayPalAuthToken()
        {
            return Base64.encodeToString((new StringBuilder()).append(mPayPalClientId).append(":").append(mPayPalPassword).toString().getBytes(), 2);
        }

        public String getPayPalClientId()
        {
            return mPayPalClientId;
        }

        public String getPayPalEnvironment()
        {
            return mPayPalEnvironment;
        }

        public String getPayPalPassword()
        {
            return mPayPalPassword;
        }

        public String getPaymentActivityEnvironment()
        {
            return mPaymentActivityEnvironment;
        }

        public void writeTo(android.content.SharedPreferences.Editor editor)
        {
            editor.putString("environment_name", mName);
            editor.putString("api_endpoint", mAPIEndpoint);
            editor.putString("payment_activity_environment", mPaymentActivityEnvironment);
            editor.putString("paypal_environment", mPayPalEnvironment);
            editor.putString("paypal_api_endpoint", mPayPalAPIEndpoint);
            editor.putString("paypay_client_id", mPayPalClientId);
            editor.putString("paypal_password", mPayPalPassword);
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(mName);
            parcel.writeString(mAPIEndpoint);
            parcel.writeString(mPaymentActivityEnvironment);
            parcel.writeString(mPayPalEnvironment);
            parcel.writeString(mPayPalAPIEndpoint);
            parcel.writeString(mPayPalClientId);
            parcel.writeString(mPayPalPassword);
        }


        Environment(SharedPreferences sharedpreferences)
        {
            mName = sharedpreferences.getString("environment_name", null);
            mAPIEndpoint = sharedpreferences.getString("api_endpoint", null);
            mPaymentActivityEnvironment = sharedpreferences.getString("payment_activity_environment", null);
            mPayPalEnvironment = sharedpreferences.getString("paypal_environment", null);
            mPayPalAPIEndpoint = sharedpreferences.getString("paypal_api_endpoint", null);
            mPayPalClientId = sharedpreferences.getString("paypay_client_id", null);
            mPayPalPassword = sharedpreferences.getString("paypal_password", null);
        }

        Environment(Parcel parcel)
        {
            mName = parcel.readString();
            mAPIEndpoint = parcel.readString();
            mPaymentActivityEnvironment = parcel.readString();
            mPayPalEnvironment = parcel.readString();
            mPayPalAPIEndpoint = parcel.readString();
            mPayPalClientId = parcel.readString();
            mPayPalPassword = parcel.readString();
        }

        Environment(String s, String s1, String s2, String s3, String s4, String s5, String s6)
        {
            mName = s;
            mAPIEndpoint = s1;
            mPaymentActivityEnvironment = s2;
            mPayPalEnvironment = s3;
            mPayPalAPIEndpoint = s4;
            mPayPalClientId = s5;
            mPayPalPassword = s6;
        }

        public Environment(IEnvironment ienvironment)
        {
            mName = ienvironment.getName();
            mAPIEndpoint = ienvironment.getAPIEndpoint();
            mPaymentActivityEnvironment = ienvironment.getPaymentActivityEnvironment();
            mPayPalEnvironment = ienvironment.getPayPalEnvironment();
            mPayPalAPIEndpoint = ienvironment.getPayPalAPIEndpoint();
            mPayPalClientId = ienvironment.getPayPalClientId();
            mPayPalPassword = ienvironment.getPayPalPassword();
        }

        public Environment(IEnvironment ienvironment, String s)
        {
            mName = ienvironment.getName();
            mAPIEndpoint = ienvironment.getAPIEndpoint();
            mPaymentActivityEnvironment = ienvironment.getPaymentActivityEnvironment();
            mPayPalEnvironment = ienvironment.getPayPalEnvironment();
            mPayPalAPIEndpoint = ienvironment.getPayPalAPIEndpoint();
            mPayPalClientId = s;
            mPayPalPassword = ienvironment.getPayPalPassword();
        }

        /* block-local class not found */
        class _cls1 {}

    }

    public static interface IEnvironment
    {

        public abstract String getAPIEndpoint();

        public abstract String getName();

        public abstract String getPayPalAPIEndpoint();

        public abstract String getPayPalClientId();

        public abstract String getPayPalEnvironment();

        public abstract String getPayPalPassword();

        public abstract String getPaymentActivityEnvironment();

        public abstract void writeTo(android.content.SharedPreferences.Editor editor);
    }


    public static final float FLOAT_ZERO_THRESHOLD = 1E-04F;
    public static final String INTENT_PREFIX = "ly.kite";
    private static final String KEY_API_ENDPOINT = "api_endpoint";
    private static final String KEY_ENVIRONMENT_NAME = "environment_name";
    private static final String KEY_PAYMENT_ACTIVITY_ENVIRONMENT = "payment_activity_environment";
    private static final String KEY_PAYPAL_API_ENDPOINT = "paypal_api_endpoint";
    private static final String KEY_PAYPAL_CLIENT_ID = "paypay_client_id";
    private static final String KEY_PAYPAL_ENVIRONMENT = "paypal_environment";
    private static final String KEY_PAYPAL_PASSWORD = "paypal_password";
    private static final String LOG_TAG = "KiteSDK";
    public static final long MAX_ACCEPTED_PRODUCT_AGE_MILLIS = 0x36ee80L;
    public static final String PAYPAL_LIVE_API_ENDPOINT = "api.paypal.com";
    public static final String PAYPAL_LIVE_CLIENT_ID = "ASYVBBCHF_KwVUstugKy4qvpQaPlUeE_5beKRJHpIP2d3SA_jZrsaUDTmLQY";
    public static final String PAYPAL_LIVE_PASSWORD = "";
    public static final String PAYPAL_SANDBOX_API_ENDPOINT = "api.sandbox.paypal.com";
    public static final String PAYPAL_SANDBOX_CLIENT_ID = "AcEcBRDxqcCKiikjm05FyD4Sfi4pkNP98AYN67sr3_yZdBe23xEk0qhdhZLM";
    public static final String PAYPAL_SANDBOX_PASSWORD = "";
    public static final String SDK_VERSION = "4.0.1";
    private static final String SHARED_PREFERENCES_INSTAGRAM_CLIENT_ID = "instagram_client_id";
    private static final String SHARED_PREFERENCES_INSTAGRAM_REDIRECT_URI = "instagram_redirect_uri";
    private static final String SHARED_PREFERENCES_KEY_API_KEY = "api_key";
    private static final String SHARED_PREFERENCES_KEY_UNIQUE_USER_ID = "unique_user_id";
    private static final String SHARED_PREFERENCES_NAME = "kite_shared_prefs";
    private static final String SHARED_PREFERENCES_REQUEST_PHONE_NUMBER = "request_phone_number";
    private static KiteSDK sKiteSDK;
    private String mAPIKey;
    private Context mApplicationContext;
    private Environment mEnvironment;
    private String mUniqueUserId;

    private KiteSDK(Context context, String s, IEnvironment ienvironment)
    {
        mApplicationContext = context.getApplicationContext();
        setEnvironment(s, ienvironment);
        AssetHelper.clearCachedImages(context);
    }

    public static KiteSDK getInstance(Context context)
    {
        if (sKiteSDK == null)
        {
            SharedPreferences sharedpreferences = context.getSharedPreferences("kite_shared_prefs", 0);
            String s = sharedpreferences.getString("api_key", null);
            if (s == null)
            {
                throw new IllegalStateException("Unable to find persisted API key ... have you initialised the SDK?");
            }
            if (s == null)
            {
                throw new IllegalStateException("Unable to find persisted environment name ... have you initialised the SDK?");
            }
            try
            {
                sKiteSDK = new KiteSDK(context, s, new Environment(sharedpreferences));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("KiteSDK", "Unable to load previous environment", context);
            }
        }
        return sKiteSDK;
    }

    public static KiteSDK getInstance(Context context, String s, IEnvironment ienvironment)
    {
        if (sKiteSDK != null)
        {
            sKiteSDK.setEnvironment(s, ienvironment);
        } else
        {
            sKiteSDK = new KiteSDK(context, s, ienvironment);
        }
        return sKiteSDK;
    }

    public static void initialise(Context context, String s, IEnvironment ienvironment)
    {
        getInstance(context, s, ienvironment);
    }

    public static void startShopping(Context context, String s, IEnvironment ienvironment)
    {
        getInstance(context, s, ienvironment).startShopping(context, new ArrayList(0));
    }

    public static transient KiteSDK startShoppingByProductId(Context context, String s, IEnvironment ienvironment, ArrayList arraylist, String as[])
    {
        s = getInstance(context, s, ienvironment);
        s.startShoppingByProductId(context, arraylist, as);
        return s;
    }

    public String getAPIEndpoint()
    {
        return mEnvironment.getAPIEndpoint();
    }

    public String getAPIKey()
    {
        return mAPIKey;
    }

    public ArrayList getAvailableImageSources()
    {
        ArrayList arraylist = new ArrayList();
        ImageSource aimagesource[] = ImageSource.values();
        int j = aimagesource.length;
        for (int i = 0; i < j; i++)
        {
            ImageSource imagesource = aimagesource[i];
            if (imagesource.isAvailable(mApplicationContext))
            {
                arraylist.add(imagesource);
            }
        }

        return arraylist;
    }

    public Environment getEnvironment()
    {
        return mEnvironment;
    }

    public ImageAgent getImageAgent(Context context)
    {
        return ImageAgent.getInstance(context);
    }

    public String getInstagramClientId()
    {
        return mApplicationContext.getSharedPreferences("kite_shared_prefs", 0).getString("instagram_client_id", null);
    }

    public String getInstagramRedirectURI()
    {
        return mApplicationContext.getSharedPreferences("kite_shared_prefs", 0).getString("instagram_redirect_uri", null);
    }

    public boolean getRequestPhoneNumber()
    {
        return mApplicationContext.getSharedPreferences("kite_shared_prefs", 0).getBoolean("request_phone_number", true);
    }

    public String getUniqueUserId()
    {
        if (mUniqueUserId == null)
        {
            SharedPreferences sharedpreferences = mApplicationContext.getSharedPreferences("kite_shared_prefs", 0);
            String s1 = sharedpreferences.getString("unique_user_id", null);
            String s = s1;
            if (s1 == null)
            {
                s = UUID.randomUUID().toString();
                sharedpreferences.edit().putString("unique_user_id", s).commit();
            }
            mUniqueUserId = s;
        }
        return mUniqueUserId;
    }

    public boolean haveInstagramCredentials()
    {
        return getInstagramClientId() != null && getInstagramRedirectURI() != null;
    }

    public KiteSDK setEnvironment(String s, IEnvironment ienvironment)
    {
        mAPIKey = s;
        mEnvironment = Environment.getFrom(ienvironment);
        android.content.SharedPreferences.Editor editor = mApplicationContext.getSharedPreferences("kite_shared_prefs", 0).edit();
        editor.putString("api_key", s);
        ienvironment.writeTo(editor);
        if (!editor.commit())
        {
            Log.e("KiteSDK", "Unable to save current environment to shared preferences");
        }
        return sKiteSDK;
    }

    public KiteSDK setInstagramCredentials(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = mApplicationContext.getSharedPreferences("kite_shared_prefs", 0).edit();
        editor.putString("instagram_client_id", s).putString("instagram_redirect_uri", s1);
        if (!editor.commit())
        {
            Log.e("KiteSDK", "Unable to save instagram credentials to shared preferences");
        }
        return sKiteSDK;
    }

    public KiteSDK setRequestPhoneNumber(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = mApplicationContext.getSharedPreferences("kite_shared_prefs", 0).edit();
        editor.putBoolean("request_phone_number", flag);
        if (!editor.commit())
        {
            Log.e("KiteSDK", "Unable to save request phone number preference to shared preferences");
        }
        return sKiteSDK;
    }

    public void startShopping(Context context, ArrayList arraylist)
    {
        startShoppingByProductId(context, arraylist, new String[0]);
    }

    public transient void startShoppingByProductId(Context context, ArrayList arraylist, String as[])
    {
        AssetHelper.clearCachedImages(context);
        ProductSelectionActivity.start(context, AssetHelper.toParcelableList(context, arraylist), as);
    }
}
