// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;

// Referenced classes of package ly.kite:
//            KiteSDK

public static class .getPayPalPassword
    implements Parcelable, 
{

    public static final android.os.yPalPassword CREATOR = new _cls1();
    private final String mAPIEndpoint;
    private final String mName;
    private final String mPayPalAPIEndpoint;
    private final String mPayPalClientId;
    private final String mPayPalEnvironment;
    private final String mPayPalPassword;
    private final String mPaymentActivityEnvironment;

    static  getFrom( )
    {
        if ( instanceof )
        {
            return ();
        } else
        {
            return new <init>();
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

    public void writeTo(android.content.itor itor)
    {
        itor.putString("environment_name", mName);
        itor.putString("api_endpoint", mAPIEndpoint);
        itor.putString("payment_activity_environment", mPaymentActivityEnvironment);
        itor.putString("paypal_environment", mPayPalEnvironment);
        itor.putString("paypal_api_endpoint", mPayPalAPIEndpoint);
        itor.putString("paypay_client_id", mPayPalClientId);
        itor.putString("paypal_password", mPayPalPassword);
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


    ences(SharedPreferences sharedpreferences)
    {
        mName = sharedpreferences.getString("environment_name", null);
        mAPIEndpoint = sharedpreferences.getString("api_endpoint", null);
        mPaymentActivityEnvironment = sharedpreferences.getString("payment_activity_environment", null);
        mPayPalEnvironment = sharedpreferences.getString("paypal_environment", null);
        mPayPalAPIEndpoint = sharedpreferences.getString("paypal_api_endpoint", null);
        mPayPalClientId = sharedpreferences.getString("paypay_client_id", null);
        mPayPalPassword = sharedpreferences.getString("paypal_password", null);
    }

    ences.getString(Parcel parcel)
    {
        mName = parcel.readString();
        mAPIEndpoint = parcel.readString();
        mPaymentActivityEnvironment = parcel.readString();
        mPayPalEnvironment = parcel.readString();
        mPayPalAPIEndpoint = parcel.readString();
        mPayPalClientId = parcel.readString();
        mPayPalPassword = parcel.readString();
    }

    (String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        mName = s;
        mAPIEndpoint = s1;
        mPaymentActivityEnvironment = s2;
        mPayPalEnvironment = s3;
        mPayPalAPIEndpoint = s4;
        mPayPalClientId = s5;
        mPayPalPassword = s6;
    }

    public ( )
    {
        mName = .getName();
        mAPIEndpoint = .getAPIEndpoint();
        mPaymentActivityEnvironment = .getPaymentActivityEnvironment();
        mPayPalEnvironment = .getPayPalEnvironment();
        mPayPalAPIEndpoint = .getPayPalAPIEndpoint();
        mPayPalClientId = .getPayPalClientId();
        mPayPalPassword = .getPayPalPassword();
    }

    public ( , String s)
    {
        mName = .getName();
        mAPIEndpoint = .getAPIEndpoint();
        mPaymentActivityEnvironment = .getPaymentActivityEnvironment();
        mPayPalEnvironment = .getPayPalEnvironment();
        mPayPalAPIEndpoint = .getPayPalAPIEndpoint();
        mPayPalClientId = s;
        mPayPalPassword = .getPayPalPassword();
    }

    /* block-local class not found */
    class _cls1 {}

}
