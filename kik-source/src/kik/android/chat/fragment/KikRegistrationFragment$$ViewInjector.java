// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import kik.android.widget.KikAutoCompleteTextView;

// Referenced classes of package kik.android.chat.fragment:
//            KikRegistrationFragment

public class 
{

    public static void inject(butterknife..ViewInjector viewinjector, KikRegistrationFragment kikregistrationfragment, Object obj)
    {
        android.view.View view = viewinjector.ViewInjector(obj, 0x7f0e007f);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624063' for field '_firstnameField' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikregistrationfragment._firstnameField = (EditText)view;
        view = viewinjector._firstnameField(obj, 0x7f0e0080);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624064' for field '_lastnameField' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikregistrationfragment._lastnameField = (EditText)view;
        view = viewinjector._lastnameField(obj, 0x7f0e0081);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624065' for field '_usernameField' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikregistrationfragment._usernameField = (EditText)view;
        view = viewinjector._usernameField(obj, 0x7f0e0084);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624068' for field '_birthdayField' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikregistrationfragment._birthdayField = (EditText)view;
        view = viewinjector._birthdayField(obj, 0x7f0e0083);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624067' for field '_passwordField' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikregistrationfragment._passwordField = (EditText)view;
        view = viewinjector._passwordField(obj, 0x7f0e0085);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624069' for field '_registerButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikregistrationfragment._registerButton = (Button)view;
        view = viewinjector._registerButton(obj, 0x7f0e0082);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624066' for field '_emailField' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikregistrationfragment._emailField = (KikAutoCompleteTextView)view;
        viewinjector = viewinjector._emailField(obj, 0x7f0e007e);
        if (viewinjector == null)
        {
            throw new IllegalStateException("Required view with id '2131624062' for field '_profPic' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            kikregistrationfragment._profPic = (ImageView)viewinjector;
            return;
        }
    }

    public static void reset(KikRegistrationFragment kikregistrationfragment)
    {
        kikregistrationfragment._firstnameField = null;
        kikregistrationfragment._lastnameField = null;
        kikregistrationfragment._usernameField = null;
        kikregistrationfragment._birthdayField = null;
        kikregistrationfragment._passwordField = null;
        kikregistrationfragment._registerButton = null;
        kikregistrationfragment._emailField = null;
        kikregistrationfragment._profPic = null;
    }

    public ()
    {
    }
}
