// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlacesParamsCreator

public class PlacesParams
    implements SafeParcelable
{

    public static final PlacesParamsCreator CREATOR = new PlacesParamsCreator();
    public static final PlacesParams GMS_CORE = new PlacesParams("com.google.android.gms", Locale.getDefault());
    public final String accountName;
    public final String clientPackageName;
    public final int gCoreClientJarVersion;
    public final String gCoreClientName;
    public final String localeString;
    public final int requestSource;
    public final int versionCode;

    public PlacesParams(int i, String s, String s1, String s2, String s3, int j, int k)
    {
        versionCode = i;
        clientPackageName = s;
        localeString = s1;
        accountName = s2;
        gCoreClientName = s3;
        gCoreClientJarVersion = j;
        requestSource = k;
    }

    private PlacesParams(String s, Locale locale)
    {
        this(3, s, locale.toString(), null, null, GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE, 0);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof PlacesParams))
            {
                return false;
            }
            obj = (PlacesParams)obj;
            if (gCoreClientJarVersion != ((PlacesParams) (obj)).gCoreClientJarVersion || requestSource != ((PlacesParams) (obj)).requestSource || !localeString.equals(((PlacesParams) (obj)).localeString) || !clientPackageName.equals(((PlacesParams) (obj)).clientPackageName) || !Objects.equal(accountName, ((PlacesParams) (obj)).accountName) || !Objects.equal(gCoreClientName, ((PlacesParams) (obj)).gCoreClientName))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            clientPackageName, localeString, accountName, gCoreClientName, Integer.valueOf(gCoreClientJarVersion), Integer.valueOf(requestSource)
        });
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("clientPackageName", clientPackageName).add("locale", localeString).add("accountName", accountName).add("gCoreClientName", gCoreClientName).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlacesParamsCreator.writeToParcel$1b076b97(this, parcel);
    }

}
