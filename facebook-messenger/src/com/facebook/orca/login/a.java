// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.os.Bundle;
import com.facebook.auth.login.AuthFragmentConfig;
import com.facebook.auth.login.AuthStateMachineConfig;
import com.facebook.auth.login.GenericFirstPartySsoViewGroup;
import com.facebook.auth.login.GenericLoginApprovalViewGroup;
import com.facebook.auth.login.SilentLoginFragment;
import com.facebook.auth.login.bg;
import com.facebook.fbservice.ops.ab;
import com.google.common.a.ew;

// Referenced classes of package com.facebook.orca.login:
//            WildfirePasswordCredentialsViewGroup, OrcaSilentLoginViewGroup, WildfireRegStartFragment, WildfireRegStartViewGroup, 
//            WildfireRegNameFragment, WildfireRegNameViewGroup, WildfireRegPhoneNumberFragment, WildfireRegPhoneNumberViewGroup, 
//            WildfireRegSmsCodeFragment, WildfireRegSmsCodeViewGroup

public class a
{

    public a()
    {
    }

    public static AuthStateMachineConfig a(com.facebook.auth.b.a a1, Bundle bundle, Bundle bundle1, Bundle bundle2, Bundle bundle3, Bundle bundle4, Bundle bundle5, Bundle bundle6, 
            Bundle bundle7, ab ab)
    {
        a1 = AuthStateMachineConfig.a(new AuthFragmentConfig(com/facebook/auth/login/GenericFirstPartySsoViewGroup, bundle), new AuthFragmentConfig(com/facebook/orca/login/WildfirePasswordCredentialsViewGroup, bundle2), new AuthFragmentConfig(com/facebook/auth/login/GenericLoginApprovalViewGroup, bundle3));
        a1.b(com/facebook/auth/login/SilentLoginFragment.getCanonicalName(), new AuthFragmentConfig(com/facebook/orca/login/OrcaSilentLoginViewGroup, bundle1));
        a1.b(com/facebook/orca/login/WildfireRegStartFragment.getCanonicalName(), new AuthFragmentConfig(com/facebook/orca/login/WildfireRegStartViewGroup, bundle5));
        a1.b(com/facebook/orca/login/WildfireRegNameFragment.getCanonicalName(), new AuthFragmentConfig(com/facebook/orca/login/WildfireRegNameViewGroup, bundle4));
        a1.b(com/facebook/orca/login/WildfireRegPhoneNumberFragment.getCanonicalName(), new AuthFragmentConfig(com/facebook/orca/login/WildfireRegPhoneNumberViewGroup, bundle6));
        a1.b(com/facebook/orca/login/WildfireRegSmsCodeFragment.getCanonicalName(), new AuthFragmentConfig(com/facebook/orca/login/WildfireRegSmsCodeViewGroup, bundle7));
        return new AuthStateMachineConfig(a1.b(), new bg(ab));
    }
}
