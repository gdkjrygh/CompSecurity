// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.ToggleButton;
import com.jcp.views.TypefaceEditTextWithClear;

// Referenced classes of package com.jcp.fragments:
//            SignInFragment, ge, gf, gg

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector, SignInFragment signinfragment, Object obj)
    {
        signinfragment.etEmailAddress = (TypefaceEditTextWithClear)ector.ddress((View)ector.edView(obj, 0x7f0e02f1, "field 'etEmailAddress'"), 0x7f0e02f1, "field 'etEmailAddress'");
        signinfragment.etPassword = (TypefaceEditTextWithClear)ector.rd((View)ector.edView(obj, 0x7f0e02f2, "field 'etPassword'"), 0x7f0e02f2, "field 'etPassword'");
        signinfragment.tbKeepMeSignedIn = (ToggleButton)ector.SignedIn((View)ector.edView(obj, 0x7f0e02f4, "field 'tbKeepMeSignedIn'"), 0x7f0e02f4, "field 'tbKeepMeSignedIn'");
        ((View)ector.edView(obj, 0x7f0e02f5, "method 'onSignInButtonClicked'")).setOnClickListener(new ge(this, signinfragment));
        ((View)ector.edView(obj, 0x7f0e02f6, "method 'onCreateAccountButtonClicked'")).setOnClickListener(new gf(this, signinfragment));
        ((View)ector.edView(obj, 0x7f0e02f7, "method 'onForgotPasswordClicked'")).setOnClickListener(new gg(this, signinfragment));
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (SignInFragment)obj, obj1);
    }

    public void reset(SignInFragment signinfragment)
    {
        signinfragment.etEmailAddress = null;
        signinfragment.etPassword = null;
        signinfragment.tbKeepMeSignedIn = null;
    }

    public volatile void reset(Object obj)
    {
        reset((SignInFragment)obj);
    }

    public ()
    {
    }
}
