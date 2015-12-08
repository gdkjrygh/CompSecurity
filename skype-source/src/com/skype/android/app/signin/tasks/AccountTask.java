// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import com.skype.Account;

public interface AccountTask
{

    public abstract void onLogin(Account account);

    public abstract void onLogout(Account account);
}
