// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.common.k.a;
import com.facebook.common.w.o;
import com.facebook.fbservice.ops.aa;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.widget.images.UrlImage;
import com.facebook.widget.text.CustomUrlLikeSpan;
import java.util.Locale;

// Referenced classes of package com.facebook.auth.login:
//            AuthFragmentLogoViewGroup, bi, ah, ai, 
//            aj, ak, bj

public class GenericPasswordCredentialsViewGroup extends AuthFragmentLogoViewGroup
    implements bi
{

    private final TextView emailText;
    private final InputMethodManager inputMethodManager = (InputMethodManager)getInjector().a(android/view/inputmethod/InputMethodManager);
    private final Button loginButton;
    private final TextView notYouLink;
    private final TextView passwordText;
    private final Button signupButton;
    private final View userDisplay;
    private final TextView userName;
    private final UrlImage userPhoto;

    public GenericPasswordCredentialsViewGroup(Context context, bj bj1)
    {
        super(context, bj1);
        userDisplay = getView(i.user_display);
        userPhoto = (UrlImage)getView(i.user_photo);
        userName = (TextView)getView(i.user_name);
        notYouLink = (TextView)getView(i.not_you_link);
        emailText = (TextView)getView(i.email);
        passwordText = (TextView)getView(i.password);
        loginButton = (Button)getView(i.login);
        signupButton = (Button)getView(i.signup);
        context = new CustomUrlLikeSpan();
        bj1 = getResources();
        o o1 = new o(bj1);
        o1.a(context, 33);
        o1.a(bj1.getString(com.facebook.o.start_screen_sso_text_not_you_link));
        o1.a();
        notYouLink.setText(o1.b());
        notYouLink.setSaveEnabled(false);
        notYouLink.setOnClickListener(new ah(this));
        loginButton.setOnClickListener(new ai(this));
        signupButton.setOnClickListener(new aj(this));
        passwordText.setOnEditorActionListener(new ak(this));
        passwordText.setTypeface(Typeface.DEFAULT);
    }

    private void clearUser()
    {
        ((bj)control).Q();
        emailText.setText("");
        userDisplay.setVisibility(8);
        emailText.setVisibility(0);
    }

    private void onLoginClick()
    {
        String s = emailText.getText().toString();
        String s1;
        if (s.length() > 0)
        {
            if ((s1 = passwordText.getText().toString()).length() > 0)
            {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                ((bj)control).a(new PasswordCredentials(s, s1), new aa(getContext(), com.facebook.o.login_screen_login_progress));
                return;
            }
        }
    }

    protected int getDefaultLayoutResource()
    {
        return k.orca_login;
    }

    protected void onSignupClick()
    {
        android.net.Uri.Builder builder = Uri.parse("https://m.facebook.com/r.php").buildUpon();
        builder.appendQueryParameter("locale", a.a(Locale.getDefault()));
        ((bj)control).b(new Intent("android.intent.action.VIEW", builder.build()));
    }

    protected void setSignupButtonText(int j)
    {
        signupButton.setText(j);
    }

    public void setUser(String s, String s1, String s2)
    {
        emailText.setText(s);
        userName.setText(s1);
        userPhoto.setImageParams(Uri.parse(s2));
        emailText.setVisibility(8);
        userDisplay.setVisibility(0);
    }


}
