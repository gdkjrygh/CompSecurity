// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//            IdpTokenTypeCreator

public final class IdpTokenType
    implements SafeParcelable
{

    public static final IdpTokenType ACCESS_TOKEN = new IdpTokenType("accessToken");
    public static final android.os.Parcelable.Creator CREATOR = new IdpTokenTypeCreator();
    public static final IdpTokenType ID_TOKEN = new IdpTokenType("idToken");
    final String mTokenType;
    final int versionCode;

    IdpTokenType(int i, String s)
    {
        versionCode = i;
        mTokenType = Preconditions.checkNotEmpty(s);
    }

    private IdpTokenType(String s)
    {
        this(1, s);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            boolean flag2;
            try
            {
                flag2 = mTokenType.equals(((IdpTokenType)obj).mTokenType);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            flag = flag1;
            if (flag2)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return mTokenType.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        IdpTokenTypeCreator.writeToParcel$17cea525(this, parcel);
    }

}
