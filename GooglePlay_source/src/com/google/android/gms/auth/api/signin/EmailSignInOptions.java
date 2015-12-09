// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Patterns;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            EmailSignInOptionsCreator

public class EmailSignInOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new EmailSignInOptionsCreator();
    String mModeQueryName;
    final Uri mServerWidgetUrl;
    Uri mTosUrl;
    final int versionCode;

    EmailSignInOptions(int i, Uri uri, String s, Uri uri1)
    {
        Preconditions.checkNotNull(uri, "Server widget url cannot be null in order to use email/password sign in.");
        Preconditions.checkNotEmpty(uri.toString(), "Server widget url cannot be null in order to use email/password sign in.");
        Preconditions.checkArgument(Patterns.WEB_URL.matcher(uri.toString()).matches(), "Invalid server widget url");
        versionCode = i;
        mServerWidgetUrl = uri;
        mModeQueryName = s;
        mTosUrl = uri1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (!mServerWidgetUrl.equals(((EmailSignInOptions) (obj = (EmailSignInOptions)obj)).mServerWidgetUrl)) goto _L1; else goto _L3
_L3:
        if (mTosUrl != null) goto _L5; else goto _L4
_L4:
        if (((EmailSignInOptions) (obj)).mTosUrl != null) goto _L1; else goto _L6
_L5:
        if (!mTosUrl.equals(((EmailSignInOptions) (obj)).mTosUrl)) goto _L1; else goto _L6
_L6:
        if (TextUtils.isEmpty(mModeQueryName))
        {
            if (!TextUtils.isEmpty(((EmailSignInOptions) (obj)).mModeQueryName))
            {
                break; /* Loop/switch isn't completed */
            }
            break; /* Loop/switch isn't completed */
        }
        boolean flag;
        try
        {
            flag = mModeQueryName.equals(((EmailSignInOptions) (obj)).mModeQueryName);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (!flag) goto _L1; else goto _L7
_L7:
        return true;
    }

    public int hashCode()
    {
        return (new HashAccumulator()).addObject(mServerWidgetUrl).addObject(mTosUrl).addObject(mModeQueryName).mHash;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        EmailSignInOptionsCreator.writeToParcel(this, parcel, i);
    }

}
