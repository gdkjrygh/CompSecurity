// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public final class Storage
{

    private static Storage sInstance;
    private static final Lock sLk = new ReentrantLock();
    private final Lock mLk = new ReentrantLock();
    private final SharedPreferences mPrefs;

    private Storage(Context context)
    {
        mPrefs = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static Storage getInstance(Context context)
    {
        Preconditions.checkNotNull(context);
        sLk.lock();
        if (sInstance == null)
        {
            sInstance = new Storage(context.getApplicationContext());
        }
        context = sInstance;
        sLk.unlock();
        return context;
        context;
        sLk.unlock();
        throw context;
    }

    public String getFromStore(String s)
    {
        mLk.lock();
        s = mPrefs.getString(s, null);
        mLk.unlock();
        return s;
        s;
        mLk.unlock();
        throw s;
    }

    public GoogleSignInAccount getSavedGoogleSignInAccount(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if ((s = getFromStore((new StringBuilder()).append("googleSignInAccount").append(":").append(s).toString())) != null)
            {
                try
                {
                    s = GoogleSignInAccount.fromJsonString(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return null;
                }
                return s;
            }
        }
        return null;
    }

}
