// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.content.Context;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.auth.credentials.b;
import com.facebook.fbservice.ops.aa;
import com.facebook.i;
import com.facebook.k;
import com.facebook.o;
import com.facebook.widget.text.CustomUrlLikeSpan;

// Referenced classes of package com.facebook.auth.login:
//            AuthFragmentLogoViewGroup, ab, ad, ac, 
//            ae

public class GenericFirstPartySsoViewGroup extends AuthFragmentLogoViewGroup
    implements ab
{

    private final Button loginButton;
    private final TextView loginText;

    public GenericFirstPartySsoViewGroup(Context context, ac ac1)
    {
        super(context, ac1);
        loginButton = (Button)getView(i.login);
        loginText = (TextView)getView(i.login_sso_text);
        loginText.setMovementMethod(LinkMovementMethod.getInstance());
        loginButton.setOnClickListener(new ad(this));
    }

    private void onLoginClicked()
    {
        ((ac)control).a(new aa(getContext(), o.login_screen_login_progress));
    }

    private void onNotYouClicked()
    {
        ((ac)control).Q();
    }

    protected int getDefaultLayoutResource()
    {
        return k.orca_login_start_screen;
    }

    public void setSsoSessionInfo(b b1)
    {
        Object obj = b1.b().replace(' ', '\240');
        b1 = getResources();
        com.facebook.common.w.o o1 = new com.facebook.common.w.o(b1);
        o1.a(b1.getString(o.start_screen_sso_text));
        o1.a("[[name]]", ((String) (obj)), null, 33);
        loginButton.setText(o1.b());
        obj = new CustomUrlLikeSpan();
        ((CustomUrlLikeSpan) (obj)).a(new ae(this));
        o1 = new com.facebook.common.w.o(b1);
        o1.a(obj, 33);
        o1.a(b1.getString(o.start_screen_sso_text_not_you_link));
        o1.a();
        loginText.setText(o1.b());
        loginText.setSaveEnabled(false);
    }


}
