// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

public final class kcw
{

    public static Intent a(String s, String s1, String s2, String s3)
    {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction("com.google.android.gms.common.oob.OOB_SIGN_UP");
        intent.putExtra("com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME", s);
        intent.putExtra("com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME", s1);
        intent.putExtra("com.google.android.gms.common.oob.EXTRAS_PROMO_APP_PACKAGE", s2);
        intent.putExtra("com.google.android.gms.common.oob.EXTRAS_PROMO_APP_TEXT", s3);
        return intent;
    }

    static 
    {
        String as[] = kbo.j;
    }
}
