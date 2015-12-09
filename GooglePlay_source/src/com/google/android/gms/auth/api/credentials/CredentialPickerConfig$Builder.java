// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;


// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialPickerConfig

public static final class mForNewAccount
{

    private boolean mForNewAccount;
    private boolean mShowAddAccountButton;
    boolean mShowCancelButton;

    public final CredentialPickerConfig build()
    {
        return new CredentialPickerConfig(this, (byte)0);
    }

    public ()
    {
        mShowAddAccountButton = false;
        mShowCancelButton = true;
        mForNewAccount = false;
    }
}
