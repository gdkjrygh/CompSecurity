// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.fbservice.ops.aa;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;

// Referenced classes of package com.facebook.auth.login:
//            m, af, ag, ao

public class GenericLoginApprovalViewGroup extends m
{

    public static final String LAYOUT_RESOURCE = "orca:authparam:login_approval_layout";
    private final InputMethodManager inputMethodManager = (InputMethodManager)getInjector().a(android/view/inputmethod/InputMethodManager);
    private final Button loginButton;
    private final TextView passwordText;

    public GenericLoginApprovalViewGroup(Context context, ao ao1)
    {
        super(context, ao1);
        setContentView(getResource("orca:authparam:login_approval_layout", k.orca_login_approval));
        passwordText = (TextView)getView(i.password);
        loginButton = (Button)getView(i.login);
        loginButton.setOnClickListener(new af(this));
        passwordText.setOnEditorActionListener(new ag(this));
    }

    public static Bundle createParameterBundle(int j)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("orca:authparam:login_approval_layout", j);
        return bundle;
    }

    private void onLoginClick()
    {
        String s = passwordText.getText().toString();
        if (s.length() <= 0)
        {
            return;
        } else
        {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            ((ao)control).a(s, new aa(getContext(), o.login_screen_login_progress));
            return;
        }
    }

}
