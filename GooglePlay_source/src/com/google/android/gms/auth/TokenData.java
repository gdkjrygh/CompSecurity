// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//            TokenDataCreator

public class TokenData
    implements SafeParcelable
{
    public static final class Builder
    {

        private Long mExpirationTimeSecs;
        private List mGrantedScopes;
        private boolean mIsCached;
        private boolean mIsSnowballed;
        public String mToken;

        public Builder()
        {
            mToken = null;
            mExpirationTimeSecs = null;
            mIsCached = false;
            mIsSnowballed = false;
            mGrantedScopes = null;
        }
    }


    public static final TokenDataCreator CREATOR = new TokenDataCreator();
    final Long mExpirationTimeSecs;
    final List mGrantedScopes;
    final boolean mIsCached;
    final boolean mIsSnowballed;
    public final String mToken;
    final int mVersionCode;

    public TokenData(int i, String s, Long long1, boolean flag, boolean flag1, List list)
    {
        mVersionCode = i;
        mToken = Preconditions.checkNotEmpty(s);
        mExpirationTimeSecs = long1;
        mIsCached = flag;
        mIsSnowballed = flag1;
        mGrantedScopes = list;
    }

    public static TokenData fromWrappedBundle(Bundle bundle, String s)
    {
        bundle.setClassLoader(com/google/android/gms/auth/TokenData.getClassLoader());
        bundle = bundle.getBundle(s);
        if (bundle == null)
        {
            return null;
        } else
        {
            bundle.setClassLoader(com/google/android/gms/auth/TokenData.getClassLoader());
            return (TokenData)bundle.getParcelable("TokenData");
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof TokenData)
        {
            if (TextUtils.equals(mToken, ((TokenData) (obj = (TokenData)obj)).mToken) && Objects.equal(mExpirationTimeSecs, ((TokenData) (obj)).mExpirationTimeSecs) && mIsCached == ((TokenData) (obj)).mIsCached && mIsSnowballed == ((TokenData) (obj)).mIsSnowballed && Objects.equal(mGrantedScopes, ((TokenData) (obj)).mGrantedScopes))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mToken, mExpirationTimeSecs, Boolean.valueOf(mIsCached), Boolean.valueOf(mIsSnowballed), mGrantedScopes
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        TokenDataCreator.writeToParcel$6d52043c(this, parcel);
    }

}
