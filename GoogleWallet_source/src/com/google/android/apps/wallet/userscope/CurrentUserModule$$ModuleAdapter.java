// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.userscope;

import dagger.internal.BindingsGroup;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.userscope:
//            CurrentUserModule

public final class INCLUDES extends ModuleAdapter
{
    public static final class GetUserIdProvidesAdapter extends ProvidesBinding
        implements Provider
    {

        private final CurrentUserModule module;

        public final volatile Object get()
        {
            return get();
        }

        public final String get()
        {
            return module.getUserId();
        }

        public GetUserIdProvidesAdapter(CurrentUserModule currentusermodule)
        {
            super("@com.google.android.apps.wallet.userscope.api.BindingAnnotations$AccountName()/java.lang.String", false, "com.google.android.apps.wallet.userscope.CurrentUserModule", "getUserId");
            module = currentusermodule;
            setLibrary(true);
        }
    }


    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = new String[0];
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final void getBindings(BindingsGroup bindingsgroup, CurrentUserModule currentusermodule)
    {
        bindingsgroup.contributeProvidesBinding("@com.google.android.apps.wallet.userscope.api.BindingAnnotations$AccountName()/java.lang.String", new GetUserIdProvidesAdapter(currentusermodule));
    }

    public final volatile void getBindings(BindingsGroup bindingsgroup, Object obj)
    {
        getBindings(bindingsgroup, (CurrentUserModule)obj);
    }


    public GetUserIdProvidesAdapter.setLibrary()
    {
        super(com/google/android/apps/wallet/userscope/CurrentUserModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, true);
    }
}
