// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.DialogHelper;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.unauth.UnauthHelper;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.base.GooglePlayServices;
import com.pinterest.base.PermissionUtil;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;

public class BrioSignupFragment extends BaseFragment
{

    View _editButton;
    private String _email;
    View _emailBt;
    TextView _emailTv;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    View _fbBt;
    private String _firstname;
    View _gplusBt;
    private String _lastname;
    private String _password;
    EditText _passwordEt;
    LinearLayout _prefilled_email_signup;
    View _signupBtn;
    LinearLayout _signupDialog;
    TextView _termsTv;
    TextView _userName;

    public BrioSignupFragment()
    {
        _eventsSubscriber = new _cls1();
    }

    protected void onActivate()
    {
        super.onActivate();
        if (!Device.isTablet() && getActivity() != null)
        {
            getActivity().setRequestedOrientation(1);
        }
    }

    void onButtonClick(View view)
    {
        if (_editButton == view)
        {
            Pinalytics.a(ElementType.USER_EDIT_BUTTON, ComponentType.MODAL_DIALOG);
            AnalyticsApi.a("edit_button_click");
            DialogHelper.goEmailSignup();
            return;
        }
        if (_signupBtn == view)
        {
            AnalyticsApi.a("signup_button_click");
            _password = _passwordEt.getText().toString();
            if (!SignupFormUtils.isPasswordValid(_password))
            {
                AnalyticsApi.a("signup_invalid_password");
                Application.showToast(0x7f070541);
                return;
            } else
            {
                AnalyticsApi.a("email_signup_step_1_complete");
                DialogHelper.goGenderSignup(_firstname, _lastname, _email, _password);
                return;
            }
        }
        if (_emailBt == view)
        {
            DialogHelper.goEmailSignup();
            return;
        } else
        {
            UnauthHelper.onClick(view, getActivity());
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300ac;
    }

    protected void onDeactivate()
    {
        super.onDeactivate();
        if (!Device.isTablet() && getActivity() != null)
        {
            getActivity().setRequestedOrientation(-1);
        }
    }

    public void onStart()
    {
        if (!Device.isTablet() && getActivity() != null)
        {
            getActivity().setRequestedOrientation(1);
        }
        super.onStart();
        AnalyticsApi.a("unauth_home");
    }

    public void onStop()
    {
        if (!Device.isTablet() && getActivity() != null)
        {
            getActivity().setRequestedOrientation(-1);
        }
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        if (Device.getUserProfile(getActivity()))
        {
            ViewHelper.setVisibility(_emailBt, false);
            ViewHelper.setVisibility(_prefilled_email_signup, true);
        }
        ViewHelper.setVisibility(_gplusBt, GooglePlayServices.isAvailable());
        if (PermissionUtil.checkPermission(getContext(), "android.permission.READ_CONTACTS"))
        {
            (new GetProfileTask(getActivity())).execute();
            Events.register(_eventsSubscriber, com/pinterest/base/Social$DenySignupEvent, new Class[0]);
            if (Preferences.persisted().getBoolean("BLOCK_SIGNUP", false))
            {
                ViewHelper.setVisibility(_signupDialog, 4);
                Application.showToast(0x7f07054a);
            }
        }
    }


/*
    static String access$002(BrioSignupFragment briosignupfragment, String s)
    {
        briosignupfragment._firstname = s;
        return s;
    }

*/


/*
    static String access$102(BrioSignupFragment briosignupfragment, String s)
    {
        briosignupfragment._lastname = s;
        return s;
    }

*/


/*
    static String access$202(BrioSignupFragment briosignupfragment, String s)
    {
        briosignupfragment._email = s;
        return s;
    }

*/

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final BrioSignupFragment this$0;

        public void onEventMainThread(com.pinterest.base.Social.DenySignupEvent denysignupevent)
        {
            ViewHelper.setVisibility(_signupDialog, 4);
            Application.showToast(0x7f07054a);
        }

        _cls1()
        {
            this$0 = BrioSignupFragment.this;
            super();
        }
    }


    private class GetProfileTask extends BackgroundTask
    {

        Activity activity;
        String names[];
        final BrioSignupFragment this$0;

        public void onFinish()
        {
            if (names != null && _userName != null)
            {
                if (names.length > 1)
                {
                    _userName.setText((new StringBuilder()).append(names[0]).append(" ").append(names[1]).toString());
                    _firstname = names[0];
                    _lastname = names[1];
                } else
                {
                    _firstname = names[0];
                    _userName.setText(names[0]);
                }
                try
                {
                    String s = Device.getDefaultEmailAddress();
                    if (StringUtils.isNotEmpty(s))
                    {
                        _email = s;
                        _emailTv.setText(s);
                        return;
                    }
                }
                catch (Exception exception)
                {
                    return;
                }
            }
        }

        public void run()
        {
            if (activity != null)
            {
                Cursor cursor;
                try
                {
                    cursor = activity.getContentResolver().query(android.provider.ContactsContract.Profile.CONTENT_URI, null, null, null, null);
                }
                catch (SecurityException securityexception)
                {
                    CrashReporting.a(securityexception);
                    securityexception = null;
                }
                if (cursor != null)
                {
                    if (cursor.getCount() > 0 && cursor.moveToFirst())
                    {
                        Pair pair = new Pair("display_name", cursor.getString(cursor.getColumnIndex("display_name")));
                        if ("display_name".equals(pair.first) && pair.second != null && (pair.second instanceof String))
                        {
                            names = ((String)pair.second).split(" ");
                        }
                    }
                    cursor.close();
                    return;
                }
            }
        }

        public GetProfileTask(Activity activity1)
        {
            this$0 = BrioSignupFragment.this;
            super();
            activity = activity1;
        }
    }

}
