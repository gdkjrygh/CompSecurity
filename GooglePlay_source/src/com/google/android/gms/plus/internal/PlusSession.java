// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.plus.internal:
//            PlusSessionCreator, PlusCommonExtras

public class PlusSession
    implements SafeParcelable
{

    public static final PlusSessionCreator CREATOR = new PlusSessionCreator();
    final String mAccountName;
    final String mApplicationName;
    final String mCallingPackageName;
    final String mClientId_DEPRECATED;
    final PlusCommonExtras mExtras;
    final String mPackageNameForAuth;
    final String mRequestedScopes[];
    final String mRequiredFeatures[];
    final int mVersionCode;
    final String mVisibleActions[];

    PlusSession(int i, String s, String as[], String as1[], String as2[], String s1, String s2, 
            String s3, String s4, PlusCommonExtras pluscommonextras)
    {
        mVersionCode = i;
        mAccountName = s;
        mRequestedScopes = as;
        mVisibleActions = as1;
        mRequiredFeatures = as2;
        mPackageNameForAuth = s1;
        mCallingPackageName = s2;
        mApplicationName = s3;
        mClientId_DEPRECATED = s4;
        mExtras = pluscommonextras;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlusSession)
        {
            if (mVersionCode == ((PlusSession) (obj = (PlusSession)obj)).mVersionCode && Objects.equal(mAccountName, ((PlusSession) (obj)).mAccountName) && Arrays.equals(mRequestedScopes, ((PlusSession) (obj)).mRequestedScopes) && Arrays.equals(mVisibleActions, ((PlusSession) (obj)).mVisibleActions) && Arrays.equals(mRequiredFeatures, ((PlusSession) (obj)).mRequiredFeatures) && Objects.equal(mPackageNameForAuth, ((PlusSession) (obj)).mPackageNameForAuth) && Objects.equal(mCallingPackageName, ((PlusSession) (obj)).mCallingPackageName) && Objects.equal(mApplicationName, ((PlusSession) (obj)).mApplicationName) && Objects.equal(mClientId_DEPRECATED, ((PlusSession) (obj)).mClientId_DEPRECATED) && Objects.equal(mExtras, ((PlusSession) (obj)).mExtras))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mVersionCode), mAccountName, mRequestedScopes, mVisibleActions, mRequiredFeatures, mPackageNameForAuth, mCallingPackageName, mApplicationName, mClientId_DEPRECATED, mExtras
        });
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("versionCode", Integer.valueOf(mVersionCode)).add("accountName", mAccountName).add("requestedScopes", mRequestedScopes).add("visibleActivities", mVisibleActions).add("requiredFeatures", mRequiredFeatures).add("packageNameForAuth", mPackageNameForAuth).add("callingPackageName", mCallingPackageName).add("applicationName", mApplicationName).add("extra", mExtras.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlusSessionCreator.writeToParcel(this, parcel, i);
    }

}
