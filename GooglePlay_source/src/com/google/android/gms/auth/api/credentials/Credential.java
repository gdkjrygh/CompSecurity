// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialCreator

public class Credential
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new CredentialCreator();
    final String mAccountType;
    final String mGeneratedHintId;
    final String mGeneratedPassword;
    final String mId;
    final List mIdTokens;
    final String mName;
    final String mPassword;
    final Uri mProfilePictureUri;
    final int mVersionCode;

    Credential(int i, String s, String s1, Uri uri, List list, String s2, String s3, 
            String s4, String s5)
    {
        mVersionCode = i;
        s = ((String)Preconditions.checkNotNull(s, "credential identifier cannot be null")).trim();
        Preconditions.checkNotEmpty(s, "credential identifier cannot be empty");
        mId = s;
        mName = s1;
        mProfilePictureUri = uri;
        if (list == null)
        {
            s = Collections.emptyList();
        } else
        {
            s = Collections.unmodifiableList(list);
        }
        mIdTokens = s;
        mPassword = s2;
        if (s2 != null && s2.isEmpty())
        {
            throw new IllegalArgumentException("password cannot be empty");
        }
        if (!TextUtils.isEmpty(s3))
        {
            s = Uri.parse(s3).getScheme();
            boolean flag;
            if ("http".equalsIgnoreCase(s) || "https".equalsIgnoreCase(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
        }
        mAccountType = s3;
        mGeneratedPassword = s4;
        mGeneratedHintId = s5;
        if (!TextUtils.isEmpty(mPassword) && !TextUtils.isEmpty(mAccountType))
        {
            throw new IllegalStateException("password and accountType cannot both be set");
        } else
        {
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Credential))
            {
                return false;
            }
            obj = (Credential)obj;
            if (!TextUtils.equals(mId, ((Credential) (obj)).mId) || !TextUtils.equals(mName, ((Credential) (obj)).mName) || !Objects.equal(mProfilePictureUri, ((Credential) (obj)).mProfilePictureUri) || !TextUtils.equals(mPassword, ((Credential) (obj)).mPassword) || !TextUtils.equals(mAccountType, ((Credential) (obj)).mAccountType) || !TextUtils.equals(mGeneratedPassword, ((Credential) (obj)).mGeneratedPassword))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mId, mName, mProfilePictureUri, mPassword, mAccountType, mGeneratedPassword
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CredentialCreator.writeToParcel(this, parcel, i);
    }

}
