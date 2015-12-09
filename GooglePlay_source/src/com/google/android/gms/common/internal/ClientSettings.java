// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ClientSettings
{
    public static final class OptionalApiSettings
    {

        public final boolean mIsRecoverable;
        public final Set mScopes;
    }


    public final Account mAccount;
    public final Set mAllRequestedScopes;
    public final int mGravityForPopups;
    public final Map mOptionalApiSettingsMap;
    final String mRealClientClassName;
    public final String mRealClientPackageName;
    public final Set mRequiredScopes;
    public Integer mSessionId;
    public final SignInOptions mSignInOptions;
    public final View mViewForPopups = null;

    public ClientSettings(Account account, Set set, Map map, int i, View view, String s, String s1, 
            SignInOptions signinoptions)
    {
        mAccount = account;
        if (set == null)
        {
            account = Collections.EMPTY_SET;
        } else
        {
            account = Collections.unmodifiableSet(set);
        }
        mRequiredScopes = account;
        account = map;
        if (map == null)
        {
            account = Collections.EMPTY_MAP;
        }
        mOptionalApiSettingsMap = account;
        mGravityForPopups = i;
        mRealClientPackageName = s;
        mRealClientClassName = s1;
        mSignInOptions = signinoptions;
        account = new HashSet(mRequiredScopes);
        for (set = mOptionalApiSettingsMap.values().iterator(); set.hasNext(); account.addAll(((OptionalApiSettings)set.next()).mScopes)) { }
        mAllRequestedScopes = Collections.unmodifiableSet(account);
    }
}
