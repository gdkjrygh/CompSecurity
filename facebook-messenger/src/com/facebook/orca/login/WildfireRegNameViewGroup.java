// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.auth.login.m;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.aa;
import com.facebook.fbservice.ops.ab;
import com.facebook.h;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.user.a.g;
import com.google.common.a.fi;
import com.google.common.base.Preconditions;
import java.util.Locale;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.login:
//            d, b, f, g, 
//            e

public class WildfireRegNameViewGroup extends m
    implements d
{

    public static final String LOGO1_RESOURCE = "orca:authparam:logo1";
    public static final String LOGO2_RESOURCE = "orca:authparam:logo2";
    private static final Class TAG = com/facebook/orca/login/WildfireRegNameViewGroup;
    private final av mAnalyticsLogger;
    private final Drawable mFirstNameErrorIcon;
    private final EditText mFirstNameText;
    private final InputMethodManager mInputMethodManager;
    private final Drawable mLastNameErrorIcon;
    private final EditText mLastNameText;
    private final a mLocaleProvider;
    private final ViewGroup mNameContainer;
    private final TextView mNamePrompt;
    private final Button mNextButton;
    private final ab mProgressIndicator;
    private final com.facebook.orca.login.b mWildfireAnalyticsUtils;

    public WildfireRegNameViewGroup(Context context, e e1)
    {
        super(context, e1);
        context = getInjector();
        mAnalyticsLogger = (av)context.a(com/facebook/analytics/av);
        mInputMethodManager = (InputMethodManager)context.a(android/view/inputmethod/InputMethodManager);
        mLocaleProvider = context.b(java/util/Locale);
        mWildfireAnalyticsUtils = (com.facebook.orca.login.b)context.a(com/facebook/orca/login/b);
        setContentView(k.orca_wildfire_reg_name);
        mNameContainer = (ViewGroup)getView(i.name_container);
        mNamePrompt = (TextView)getView(i.name_prompt);
        mFirstNameText = (EditText)getView(i.first_name);
        mFirstNameErrorIcon = getResources().getDrawable(h.orca_field_error_icon);
        mLastNameText = (EditText)getView(i.last_name);
        mLastNameErrorIcon = getResources().getDrawable(h.orca_field_error_icon);
        updateNameViewOrder();
        prefillName();
        mNextButton = (Button)getView(i.next);
        mProgressIndicator = new aa(getContext(), o.wildfire_reg_verification_progress);
        mNextButton.setOnClickListener(new f(this));
        mLastNameText.setOnEditorActionListener(new com.facebook.orca.login.g(this));
        context = (ImageView)getView(i.name_logo1);
        e1 = (ImageView)getView(i.name_logo2);
        int j = getResource("orca:authparam:logo1", 0);
        int l = getResource("orca:authparam:logo2", 0);
        if (j != 0)
        {
            context.setImageResource(j);
        }
        if (l != 0)
        {
            e1.setImageResource(l);
        }
    }

    public static Bundle createParameterBundle(int j, int l)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("orca:authparam:logo1", j);
        bundle.putInt("orca:authparam:logo2", l);
        return bundle;
    }

    private Rect getDrawableBoundsForEditText(EditText edittext, Drawable drawable)
    {
        return new Rect(0, 0, edittext.getHeight() - edittext.getPaddingTop() - edittext.getPaddingBottom(), edittext.getHeight() - edittext.getPaddingTop() - edittext.getPaddingBottom());
    }

    private void onNextClick()
    {
        String s = mFirstNameText.getText().toString();
        String s1;
        if (s.length() > 0)
        {
            if ((s1 = mLastNameText.getText().toString()).length() > 0)
            {
                mInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                ((e)control).a(s, s1);
                return;
            }
        }
    }

    private void prefillName()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            Object obj = getContext().getContentResolver().query(android.provider.ContactsContract.Profile.CONTENT_URI, new String[] {
                "display_name_alt"
            }, null, null, null);
            if (obj == null || !((Cursor) (obj)).moveToFirst())
            {
                b.e(TAG, "Couldn't find user profile!");
                return;
            }
            obj = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("display_name_alt"));
            if (obj == null)
            {
                b.e(TAG, "User's name was null!");
                return;
            }
            b.c(TAG, (new StringBuilder()).append("Found user's name: ").append(((String) (obj))).toString());
            mAnalyticsLogger.a(mWildfireAnalyticsUtils.a("prefill_user_name").b("name", ((String) (obj))));
            String as[] = ((String) (obj)).split(", ");
            if (as.length == 2)
            {
                mFirstNameText.setText(as[1]);
                mLastNameText.setText(as[0]);
                return;
            } else
            {
                b.e(TAG, "Couldn't split name into given/family.");
                return;
            }
        } else
        {
            b.d(TAG, "API does not support user profiles; cannot pre-fill user's name.");
            return;
        }
    }

    private void updateNameViewOrder()
    {
        boolean flag1 = true;
        int j = mNameContainer.indexOfChild(mFirstNameText);
        int l = mNameContainer.indexOfChild(mLastNameText);
        Locale locale;
        boolean flag;
        if (j != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (l != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (j < l)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        locale = (Locale)mLocaleProvider.b();
        if (!g.a.contains(locale.getLanguage()))
        {
            b.b(TAG, "Not reordering children, already matches default.");
            return;
        } else
        {
            b.b(TAG, (new StringBuilder()).append("Swapping first and last name to match locale: ").append(locale).toString());
            mNameContainer.removeView(mFirstNameText);
            mNameContainer.removeView(mLastNameText);
            mNameContainer.addView(mLastNameText, j);
            mNameContainer.addView(mFirstNameText, l);
            return;
        }
    }

    public void beginShowingProgress()
    {
        mProgressIndicator.a();
    }

    public void hideFirstNameError()
    {
        mFirstNameText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    public void hideLastNameError()
    {
        mLastNameText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    public void setNamePrompt(String s)
    {
        mNamePrompt.setText(s);
    }

    public void setNamePromptResource(int j)
    {
        mNamePrompt.setText(j);
    }

    public void showFirstNameError()
    {
        mFirstNameErrorIcon.setBounds(getDrawableBoundsForEditText(mFirstNameText, mFirstNameErrorIcon));
        mFirstNameText.setCompoundDrawables(null, null, mFirstNameErrorIcon, null);
    }

    public void showLastNameError()
    {
        mLastNameErrorIcon.setBounds(getDrawableBoundsForEditText(mLastNameText, mLastNameErrorIcon));
        mLastNameText.setCompoundDrawables(null, null, mLastNameErrorIcon, null);
    }

    public void stopShowingProgress()
    {
        mProgressIndicator.b();
    }


}
