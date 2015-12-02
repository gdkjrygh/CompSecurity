// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.login.GenericPasswordCredentialsViewGroup;
import com.facebook.auth.login.bj;
import com.facebook.o;

// Referenced classes of package com.facebook.orca.login:
//            WildfireRegStartFragment

public class WildfirePasswordCredentialsViewGroup extends GenericPasswordCredentialsViewGroup
{

    public WildfirePasswordCredentialsViewGroup(Context context, bj bj1)
    {
        super(context, bj1);
        setSignupButtonText(o.login_screen_wildfire_signup_button);
    }

    protected void onSignupClick()
    {
        Intent intent = new Intent("com.facebook.fragment.FRAGMENT_ACTION", null, getContext(), com/facebook/orca/login/WildfireRegStartFragment);
        intent.putExtra("orca:authparam:userrequestedsignup", true);
        ((bj)control).c(intent);
    }
}
