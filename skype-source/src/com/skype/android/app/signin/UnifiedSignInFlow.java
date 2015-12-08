// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;


// Referenced classes of package com.skype.android.app.signin:
//            AccountsList

public interface UnifiedSignInFlow
{

    public abstract AccountsList getAccountsList();

    public abstract boolean navigateToSignInBasedOnGuess(String s, boolean flag);

    public abstract boolean navigateToSignInBasedOnType(String s, SignInConstants.AccountType accounttype);

    public abstract boolean requiresCountryCode(String s);

    public abstract void searchAccountsAsync(String s);

    public abstract void selectAccount(int i);
}
