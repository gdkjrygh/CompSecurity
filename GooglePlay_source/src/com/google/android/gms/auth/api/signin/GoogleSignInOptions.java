// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            GoogleSignInOptionsCreator

public class GoogleSignInOptions
    implements com.google.android.gms.common.api.Api.ApiOptions.Optional, SafeParcelable
{
    public static final class Builder
    {

        Set mScopes;

        public Builder()
        {
            mScopes = new HashSet();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new GoogleSignInOptionsCreator();
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;
    public static final Scope SCOPE_EMAIL = new Scope("email");
    public static final Scope SCOPE_OPEN_ID;
    public static final Scope SCOPE_PROFILE;
    Account mAccount;
    final boolean mForceCodeForRefreshToken;
    boolean mIdTokenRequested;
    private final ArrayList mScopes;
    final boolean mServerAuthCodeRequested;
    String mServerClientId;
    final int versionCode;

    GoogleSignInOptions(int i, ArrayList arraylist, Account account, boolean flag, boolean flag1, boolean flag2, String s)
    {
        versionCode = i;
        mScopes = arraylist;
        mAccount = account;
        mIdTokenRequested = flag;
        mServerAuthCodeRequested = flag1;
        mForceCodeForRefreshToken = flag2;
        mServerClientId = s;
    }

    private GoogleSignInOptions(Set set, Account account, boolean flag, boolean flag1, boolean flag2, String s)
    {
        this(1, new ArrayList(set), account, flag, flag1, flag2, s);
    }

    private GoogleSignInOptions(Set set, Account account, boolean flag, boolean flag1, boolean flag2, String s, byte byte0)
    {
        this(set, null, false, false, false, null);
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
        if (mScopes.size() != ((GoogleSignInOptions) (obj = (GoogleSignInOptions)obj)).getScopes().size() || !mScopes.containsAll(((GoogleSignInOptions) (obj)).getScopes())) goto _L1; else goto _L3
_L3:
        if (mAccount != null) goto _L5; else goto _L4
_L4:
        if (((GoogleSignInOptions) (obj)).mAccount != null) goto _L1; else goto _L6
_L6:
        if (!TextUtils.isEmpty(mServerClientId)) goto _L8; else goto _L7
_L7:
        if (!TextUtils.isEmpty(((GoogleSignInOptions) (obj)).mServerClientId))
        {
            break; /* Loop/switch isn't completed */
        }
_L10:
        if (mForceCodeForRefreshToken == ((GoogleSignInOptions) (obj)).mForceCodeForRefreshToken && mIdTokenRequested == ((GoogleSignInOptions) (obj)).mIdTokenRequested && mServerAuthCodeRequested == ((GoogleSignInOptions) (obj)).mServerAuthCodeRequested)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L5:
        if (!mAccount.equals(((GoogleSignInOptions) (obj)).mAccount)) goto _L9; else goto _L6
_L9:
        break; /* Loop/switch isn't completed */
_L8:
        boolean flag;
        try
        {
            flag = mServerClientId.equals(((GoogleSignInOptions) (obj)).mServerClientId);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (!flag) goto _L1; else goto _L10
    }

    public final ArrayList getScopes()
    {
        return new ArrayList(mScopes);
    }

    public int hashCode()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = mScopes.iterator(); iterator.hasNext(); arraylist.add(((Scope)iterator.next()).mScopeUri)) { }
        Collections.sort(arraylist);
        return (new HashAccumulator()).addObject(arraylist).addObject(mAccount).addObject(mServerClientId).addBoolean(mForceCodeForRefreshToken).addBoolean(mIdTokenRequested).addBoolean(mServerAuthCodeRequested).mHash;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GoogleSignInOptionsCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        SCOPE_PROFILE = new Scope("profile");
        SCOPE_OPEN_ID = new Scope("openid");
        Builder builder = new Builder();
        builder.mScopes.add(SCOPE_OPEN_ID);
        builder.mScopes.add(SCOPE_PROFILE);
        DEFAULT_SIGN_IN = new GoogleSignInOptions(builder.mScopes, ((Account) (null)), false, false, false, ((String) (null)), (byte)0);
    }
}
