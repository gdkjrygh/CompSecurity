// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import com.skype.Account;
import com.skype.android.crash.CrashReporter;

// Referenced classes of package com.skype.android.app.signin.tasks:
//            AccountTask

final class b
    implements AccountTask
{

    private final CrashReporter crashReporter;

    public b(CrashReporter crashreporter)
    {
        crashReporter = crashreporter;
    }

    public final void onLogin(Account account)
    {
    }

    public final void onLogout(Account account)
    {
        crashReporter.a();
    }
}
