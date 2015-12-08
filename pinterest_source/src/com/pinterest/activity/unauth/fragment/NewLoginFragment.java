// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.DialogHelper;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.unauth.UnauthHelper;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.base.GooglePlayServices;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;

public class NewLoginFragment extends BaseFragment
{

    View _bussinessSignupBt;
    View _editButton;
    private String _email;
    TextView _emailTv;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private String _firstname;
    View _gplusBt;
    private String _lastname;
    private String _password;
    EditText _passwordEt;
    View _signupBtn;
    LinearLayout _signupDialog;
    TextView _termsTv;
    TextView _userName;

    public NewLoginFragment()
    {
        _eventsSubscriber = new _cls1();
    }

    private void getUserProfile()
    {
        (new GetProfileTask()).execute();
    }

    void onButtonClick(View view)
    {
        if (_editButton == view)
        {
            Pinalytics.a(ElementType.USER_EDIT_BUTTON, ComponentType.MODAL_DIALOG);
            DialogHelper.goEmailSignup();
            return;
        }
        if (_signupBtn == view)
        {
            _password = _passwordEt.getText().toString();
            if (!SignupFormUtils.isPasswordValid(_password))
            {
                Application.showToast(0x7f070541);
                return;
            } else
            {
                DialogHelper.goGenderSignup(_firstname, _lastname, _email, _password);
                return;
            }
        }
        if (_bussinessSignupBt == view)
        {
            DialogHelper.goBusinessSignup(_email, null);
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
        _layoutId = 0x7f030105;
    }

    public void onDestroyView()
    {
        Events.unregister(_eventsSubscriber);
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        ViewHelper.setVisibility(_gplusBt, GooglePlayServices.isAvailable());
        bundle = new ImageView(view.getContext());
        bundle.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        bundle.setImageBitmap(BitmapFactory.decodeResource(getResources(), 0x7f02021f));
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        ((ViewGroup)view).addView(bundle, 0, layoutparams);
        _termsTv.setText(Html.fromHtml(Resources.string(0x7f070587)));
        getUserProfile();
        Events.register(_eventsSubscriber, com/pinterest/base/Social$DenySignupEvent, new Class[0]);
        if (Preferences.persisted().getBoolean("BLOCK_SIGNUP", false))
        {
            ViewHelper.setVisibility(_signupDialog, 4);
            Application.showToast(0x7f07054a);
        }
    }


/*
    static String access$002(NewLoginFragment newloginfragment, String s)
    {
        newloginfragment._firstname = s;
        return s;
    }

*/


/*
    static String access$102(NewLoginFragment newloginfragment, String s)
    {
        newloginfragment._lastname = s;
        return s;
    }

*/


/*
    static String access$202(NewLoginFragment newloginfragment, String s)
    {
        newloginfragment._email = s;
        return s;
    }

*/

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final NewLoginFragment this$0;

        public void onEventMainThread(com.pinterest.base.Social.DenySignupEvent denysignupevent)
        {
            ViewHelper.setVisibility(_signupDialog, 4);
            Application.showToast(0x7f07054a);
        }

        _cls1()
        {
            this$0 = NewLoginFragment.this;
            super();
        }
    }


    private class GetProfileTask extends BackgroundTask
    {

        String names[];
        final NewLoginFragment this$0;

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
            Cursor cursor;
            if (getActivity() != null)
            {
                if ((cursor = getActivity().getContentResolver().query(android.provider.ContactsContract.Profile.CONTENT_URI, null, null, null, null)) != null)
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

        public GetProfileTask()
        {
            this$0 = NewLoginFragment.this;
            super();
        }
    }

}
