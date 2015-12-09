// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.ScopeChecker;

// Referenced classes of package com.google.android.gms.plus:
//            PlusIntents

public static final class mSignUpState
{

    private final ClientContext mCallerClientContext;
    private final Context mContext;
    private boolean mIsForceAccountPicker;
    public int mSignUpState;

    public final Intent build()
    {
        Bundle bundle = new Bundle();
        Object obj;
        String s;
        String s1;
        String s2;
        String as[];
        int i;
        if (mCallerClientContext.hasAnyScopes())
        {
            obj = mCallerClientContext.getScopesString();
        } else
        {
            obj = null;
        }
        s = mCallerClientContext.getResolvedAccountName();
        if (mSignUpState == 2 && !ScopeChecker.hasScopeRequiringUpgrade(mCallerClientContext.getGrantedScopes()))
        {
            mSignUpState = 0;
        }
        s1 = mCallerClientContext.mCallingPackageName;
        s2 = mCallerClientContext.mAuthPackageName;
        i = mSignUpState;
        as = mCallerClientContext.getVisibleActions();
        bundle.putString("authAccount", s);
        bundle.putString("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE", s1);
        bundle.putString("com.google.android.gms.plus.intent.extra.AUTHENTICATION_PACKAGE_NAME", s2);
        bundle.putInt("com.google.android.gms.plus.intent.extra.SIGN_UP_STATE", i);
        if (as != null)
        {
            bundle.putStringArray("request_visible_actions", as);
        }
        bundle.putString("com.google.android.gms.plus.intent.extra.AUTH_SCOPE_STRING", ((String) (obj)));
        bundle.putParcelable("com.google.android.gms.plus.intent.extra.AUTH_TOKEN_INTENT", null);
        bundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", SafeParcelableSerializer.serializeToBytes(PlusCommonExtras.extractFromBundle(mCallerClientContext.mExtras)));
        obj = new Intent("com.google.android.gms.plus.action.SIGN_UP");
        ((Intent) (obj)).putExtras(bundle);
        return ((Intent) (obj));
    }

    public ableSerializer(Context context, ClientContext clientcontext)
    {
        mContext = context;
        mCallerClientContext = clientcontext;
        mIsForceAccountPicker = false;
        mSignUpState = 2;
    }
}
