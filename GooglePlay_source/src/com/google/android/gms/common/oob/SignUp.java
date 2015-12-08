// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.oob;

import android.content.Intent;
import com.google.android.gms.common.internal.GmsClient;

public final class SignUp
{

    public static final String GOOGLE_PLUS_REQUIRED_FEATURES[];

    public static Intent newSignUpIntent(String s)
    {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction("com.google.android.gms.common.oob.OOB_SIGN_UP");
        intent.putExtra("com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME", s);
        intent.putExtra("com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME", null);
        return intent;
    }

    static 
    {
        GOOGLE_PLUS_REQUIRED_FEATURES = GmsClient.GOOGLE_PLUS_REQUIRED_FEATURES;
    }
}
