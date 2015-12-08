// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import com.facebook.login.o;
import dagger.a.t;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.accounts:
//            AuthenticationModule

public static final class setLibrary extends t
    implements Provider
{

    private final AuthenticationModule module;

    public final o get()
    {
        return module.providesFacebookLoginManager();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (AuthenticationModule authenticationmodule)
    {
        super("com.facebook.login.LoginManager", false, "com.soundcloud.android.accounts.AuthenticationModule", "providesFacebookLoginManager");
        module = authenticationmodule;
        setLibrary(false);
    }
}
