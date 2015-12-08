// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Referenced classes of package com.millennialmedia.android:
//            CachedAd, HttpMMHeaders, MMLog, OverlaySettings, 
//            HandShake, MMAdImpl

class InterstitialAd extends CachedAd
    implements Parcelable, Externalizable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public InterstitialAd createFromParcel(Parcel parcel)
        {
            return new InterstitialAd(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public InterstitialAd[] newArray(int i)
        {
            return new InterstitialAd[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    static final String EXTRA_AD_URL = "EXTRA_AD_URL";
    static final String EXTRA_CONTENT = "EXTRA_CONTENT";
    private static final String TAG = com/millennialmedia/android/InterstitialAd.getName();
    static final long serialVersionUID = 0x47973e3dff4c4b9dL;
    String adUrl;
    String content;
    HttpMMHeaders mmHeaders;

    public InterstitialAd()
    {
    }

    InterstitialAd(Parcel parcel)
    {
        super(parcel);
        try
        {
            content = parcel.readString();
            adUrl = parcel.readString();
            mmHeaders = (HttpMMHeaders)parcel.readParcelable(com/millennialmedia/android/HttpMMHeaders.getClassLoader());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            MMLog.e(TAG, "Interstitial problem reading parcel: ", parcel);
        }
    }

    private Intent getExpandExtrasIntent(Context context, long l)
    {
        context = new Intent();
        OverlaySettings overlaysettings = new OverlaySettings();
        overlaysettings.creatorAdImplId = l;
        overlaysettings.content = content;
        overlaysettings.adUrl = adUrl;
        overlaysettings.setWebMMHeaders(mmHeaders);
        overlaysettings.isFromInterstitial = true;
        context.putExtra("settings", overlaysettings);
        context.putExtra("internalId", l);
        return context;
    }

    boolean canShow(Context context, MMAdImpl mmadimpl, boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        if (content == null || content.length() <= 0 || adUrl == null || adUrl.length() <= 0 || !HandShake.sharedHandShake(context).canDisplayCachedAd(mmadimpl.adType, deferredViewStart)) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (content == null || content.length() <= 0 || adUrl == null || adUrl.length() <= 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public int describeContents()
    {
        return 0;
    }

    boolean download(Context context)
    {
        return true;
    }

    int getType()
    {
        return 2;
    }

    String getTypeString()
    {
        return "Interstitial";
    }

    boolean isOnDisk(Context context)
    {
        return true;
    }

    public void readExternal(ObjectInput objectinput)
        throws IOException, ClassNotFoundException
    {
        super.readExternal(objectinput);
        content = (String)objectinput.readObject();
        adUrl = (String)objectinput.readObject();
        mmHeaders = (HttpMMHeaders)objectinput.readObject();
    }

    boolean saveAssets(Context context)
    {
        return true;
    }

    void show(Context context, long l)
    {
        Utils.IntentUtils.startAdViewOverlayActivity(context, getExpandExtrasIntent(context, l));
    }

    public void writeExternal(ObjectOutput objectoutput)
        throws IOException
    {
        super.writeExternal(objectoutput);
        objectoutput.writeObject(content);
        objectoutput.writeObject(adUrl);
        objectoutput.writeObject(mmHeaders);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(content);
        parcel.writeString(adUrl);
        parcel.writeParcelable(mmHeaders, i);
    }

}
