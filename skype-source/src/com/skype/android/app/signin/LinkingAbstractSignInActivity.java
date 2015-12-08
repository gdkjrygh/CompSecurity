// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.skype.SkyLib;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.util.AccountUtil;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.AccessibleAutoCompleteTextView;
import com.skype.android.widget.SymbolView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingAbstractActivity, SignInConstants, LinkingUtil

public abstract class LinkingAbstractSignInActivity extends LinkingAbstractActivity
    implements TextWatcher, android.view.View.OnClickListener, android.widget.TextView.OnEditorActionListener, SignInConstants
{

    AccessibilityUtil accessibilityUtil;
    protected boolean allowSpam;
    LinkingUtil linkingUtil;
    protected boolean mergeMsaWithSkypeAccount;
    protected String password;
    EditText passwordEdit;
    SymbolView signInButton;
    View signInContent;
    SignInDurationReporter signInDurationReporter;
    View signInHeader;
    Button signinProblemsBtn;
    protected String skypeName;
    AccessibleAutoCompleteTextView skypeNameEdit;

    public LinkingAbstractSignInActivity()
    {
    }

    public void afterTextChanged(Editable editable)
    {
        int i = editable.length();
        if (skypeNameEdit.getVisibility() == 0 && skypeNameEdit.hasFocus())
        {
            String s = getString(0x7f08042b);
            if (i > 0)
            {
                s = (new StringBuilder()).append(getString(0x7f08027b)).append(" ").append(editable.toString()).toString();
            }
            skypeNameEdit.setContentDescription(s);
        } else
        if (passwordEdit.hasFocus())
        {
            editable = getString(0x7f08042a);
            if (i > 0)
            {
                editable = getResources().getQuantityString(0x7f0b0014, i, new Object[] {
                    Integer.valueOf(i)
                });
            }
            passwordEdit.setContentDescription(editable);
            return;
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    protected void doSignIn()
    {
        hideKeyboard();
        if (!interruptNavigatingHome)
        {
            showProgress();
            mergeMsaWithTechAccount(skypeAccessToken, allowSpam);
        } else
        if (!TextUtils.isEmpty(skypeName) && !TextUtils.isEmpty(password))
        {
            showProgress();
            if (Patterns.EMAIL_ADDRESS.matcher(skypeName).find())
            {
                showPotentiallyMSACredentialsDialog();
                return;
            } else
            {
                mergeMsaWithSkypeAccount = true;
                mergeMsaWithSkypeAccount(skypeName, password, skypeAccessToken, allowSpam);
                return;
            }
        }
    }

    protected void enableSignInButton()
    {
        boolean flag1 = true;
        SymbolView symbolview;
        boolean flag;
        if (skypeName != null && skypeName.length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        symbolview = signInButton;
        if (!flag || password.length() <= 0)
        {
            flag1 = false;
        }
        symbolview.setEnabled(flag1);
    }

    protected void hideKeyboard()
    {
        ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(passwordEdit.getWindowToken(), 2);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131756001: 
            signInDurationReporter.a(com.skype.android.util.SignInDurationReporter.CheckPoint.e);
            doSignIn();
            return;

        case 2131756002: 
            forgotPassword();
            break;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        if (accessibilityUtil.a())
        {
            accessibilityUtil.b(skypeNameEdit, 12);
            accessibilityUtil.b(passwordEdit, 12);
            accessibilityUtil.b(signInButton, 12);
        }
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (keyevent != null)
        {
            if (keyevent.getKeyCode() == 66 && keyevent.getAction() == 0)
            {
                return true;
            }
            if (keyevent.getKeyCode() == 66 && keyevent.getAction() == 1)
            {
                doSignIn();
                return true;
            }
        }
        if (i == 6 || i == 4)
        {
            doSignIn();
            return true;
        } else
        {
            return false;
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnAccountAvatarResult onaccountavatarresult)
    {
        if (onaccountavatarresult.getCode() == com.skype.SkyLib.AUTH_RESULT.AUTH_OK && skypeName != null)
        {
            linkingUtil.putSkypeAvatarToCache(skypeName, onaccountavatarresult.getData());
        }
        if (interruptNavigatingHome)
        {
            finish();
        }
    }

    protected void onLoggedIn()
    {
        if (mergeMsaWithSkypeAccount && !TextUtils.isEmpty(skypeName) && !TextUtils.isEmpty(password))
        {
            lib.getAccountAvatar(0L, "", skypeName, password, skypeName);
        } else
        if (interruptNavigatingHome)
        {
            finish();
            return;
        }
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (skypeNameEdit.getVisibility() == 0)
        {
            skypeName = skypeNameEdit.getText().toString().trim();
            if (skypeNameEdit.isPopupShowing() && android.os.Build.VERSION.SDK_INT >= 16)
            {
                skypeNameEdit.announceForAccessibility(charsequence.toString().substring(i));
            }
        }
        password = passwordEdit.getText().toString().trim();
        enableSignInButton();
    }

    protected void setButtonEvents()
    {
        ViewUtil.a(this, new View[] {
            signInButton, signinProblemsBtn
        });
        signInButton.setEnabled(false);
    }

    protected void setPasswordEditListener()
    {
        passwordEdit.setOnEditorActionListener(this);
        passwordEdit.addTextChangedListener(this);
    }

    protected void setSkypeNameEditListener()
    {
        skypeNameEdit.setOnEditorActionListener(this);
        skypeNameEdit.addTextChangedListener(this);
    }

    protected void setupAutoComplete()
    {
        skypeNameEdit.setAdapter(new ArrayAdapter(this, 0x1090011, AccountUtil.a(lib)));
    }

    protected void setupSignInHeader()
    {
        android.view.animation.Animation animation = AnimationUtils.loadAnimation(this, 0x10a0000);
        findViewById(0x7f1003ad).startAnimation(animation);
        styleForOrientation(getResources().getConfiguration().orientation);
    }

    public void skipLinking()
    {
        doSignIn();
    }

    protected void styleForOrientation(int i)
    {
        if (layoutExperience.isMultipane() && i == 2)
        {
            getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                int currentHeight;
                int screenHeight;
                final LinkingAbstractSignInActivity this$0;
                int topPadding;

                public final void onGlobalLayout()
                {
                    byte byte0 = 0;
                    View view = findViewById(0x1020002);
                    int j;
                    if (view != null)
                    {
                        if (currentHeight != (j = view.getHeight()))
                        {
                            currentHeight = j;
                            View view1;
                            boolean flag;
                            int k;
                            if (screenHeight - j > screenHeight / 4)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            if (flag)
                            {
                                k = topPadding;
                            } else
                            {
                                k = 0;
                            }
                            view1 = signInHeader;
                            if (flag)
                            {
                                byte0 = 8;
                            }
                            view1.setVisibility(byte0);
                            signInContent.setPadding(signInContent.getPaddingLeft(), k, signInContent.getPaddingRight(), signInContent.getPaddingBottom());
                            return;
                        }
                    }
                }

            
            {
                this$0 = LinkingAbstractSignInActivity.this;
                super();
                currentHeight = -1;
                topPadding = getResources().getDimensionPixelSize(0x7f0c00be);
                screenHeight = getResources().getDisplayMetrics().heightPixels;
            }
            });
        }
    }
}
