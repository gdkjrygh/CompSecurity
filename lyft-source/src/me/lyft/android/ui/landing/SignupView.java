// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.studies.OnBoardingAnalytics;
import me.lyft.android.application.ILogoutService;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.application.landing.InvalidField;
import me.lyft.android.application.landing.exceptions.LandingValidationException;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.EmailAutoFillEditText;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.User;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.persistence.landing.ISignUpUserRepository;
import me.lyft.android.persistence.landing.SignupUser;
import me.lyft.android.providers.ProfileProvider;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.utils.Keyboard;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.landing:
//            LandingFlow

public class SignupView extends LinearLayout
{

    private Binder binder;
    IDevice device;
    EmailAutoFillEditText emailEdit;
    TextView errorEmailTextView;
    TextView errorFistNameTextView;
    TextView errorLastNameTextView;
    AdvancedEditText firstNameEdit;
    LandingFlow landingFlow;
    ILandingService landingService;
    AdvancedEditText lastNameEdit;
    ILogoutService logoutService;
    Button nextButton;
    ProfileProvider profileProvider;
    IProgressController progressController;
    ISignUpUserRepository signUpUserRepository;
    Toolbar toolbar;
    IUserProvider userProvider;

    public SignupView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private void autoFillProfile(me.lyft.android.providers.ProfileProvider.PhoneProfile phoneprofile)
    {
        String s;
        SignupUser signupuser;
        signupuser = signUpUserRepository.get();
        String s1 = userProvider.getUser().getEmail();
        s = s1;
        if (Strings.isNullOrEmpty(s1))
        {
            s = device.getGoogleAccountEmail();
        }
        if (Strings.isNullOrEmpty(signupuser.getEmail())) goto _L2; else goto _L1
_L1:
        emailEdit.setTextAndMoveCursor(signupuser.getEmail());
_L8:
        String s2 = userProvider.getUser().getLastName();
        s = s2;
        if (Strings.isNullOrEmpty(s2))
        {
            s = phoneprofile.getLastName();
        }
        if (!Strings.isNullOrEmpty(signupuser.getLastName()))
        {
            lastNameEdit.setTextAndMoveCursor(signupuser.getLastName());
        } else
        if (!Strings.isNullOrEmpty(s))
        {
            lastNameEdit.setTextAndMoveCursor(s);
        }
        s2 = userProvider.getUser().getFirstName();
        s = s2;
        if (Strings.isNullOrEmpty(s2))
        {
            s = phoneprofile.getFirstName();
        }
        if (Strings.isNullOrEmpty(signupuser.getFirstName())) goto _L4; else goto _L3
_L3:
        firstNameEdit.setTextAndMoveCursor(signupuser.getFirstName());
_L6:
        return;
_L2:
        if (!Strings.isNullOrEmpty(s))
        {
            emailEdit.setTextAndMoveCursor(s);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (Strings.isNullOrEmpty(s)) goto _L6; else goto _L5
_L5:
        firstNameEdit.setTextAndMoveCursor(s);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void initEditText(AdvancedEditText advancededittext, final TextView textView)
    {
        advancededittext.setValidationMessageView(textView);
        advancededittext.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final SignupView this$0;
            final TextView val$textView;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                textView.setVisibility(4);
                return false;
            }

            
            {
                this$0 = SignupView.this;
                textView = textview;
                super();
            }
        });
    }

    void loginWithFacebook()
    {
        progressController.showProgress();
        final ActionAnalytics analytics = OnBoardingAnalytics.trackAddFacebook();
        binder.bind(landingService.createFacebookUser(), new AsyncCall() {

            final SignupView this$0;
            final ActionAnalytics val$analytics;

            public void onFail(Throwable throwable)
            {
                analytics.trackFailure(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                analytics.trackSuccess();
                landingFlow.goToNextScreenInSignupFlow();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = SignupView.this;
                analytics = actionanalytics;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            logoutService.resetSignUp();
            binder = Binder.attach(this);
            binder.bind(profileProvider.observePhoneProfile(), new AsyncCall() {

                final SignupView this$0;

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((me.lyft.android.providers.ProfileProvider.PhoneProfile)obj);
                }

                public void onSuccess(me.lyft.android.providers.ProfileProvider.PhoneProfile phoneprofile)
                {
                    autoFillProfile(phoneprofile);
                }

                public void onUnsubscribe()
                {
                    showKeyboardIfNeeded();
                }

            
            {
                this$0 = SignupView.this;
                super();
            }
            });
            binder.bind(toolbar.observeItemClick(), new Action1() {

                final SignupView this$0;

                public void call(Integer integer)
                {
                    submitProfileInfo();
                }

                public volatile void call(Object obj)
                {
                    call((Integer)obj);
                }

            
            {
                this$0 = SignupView.this;
                super();
            }
            });
            return;
        }
    }

    boolean onEmailEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            submitProfileInfo();
            return true;
        } else
        {
            return false;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            toolbar.showTitle().setTitle(getResources().getString(0x7f0701d4)).addItem(0x7f0d001d, getResources().getString(0x7f07020e), 0, getResources().getColor(0x7f0c007e), 1);
            nextButton.setOnClickListener(new android.view.View.OnClickListener() {

                final SignupView this$0;

                public void onClick(View view)
                {
                    submitProfileInfo();
                }

            
            {
                this$0 = SignupView.this;
                super();
            }
            });
            initEditText(firstNameEdit, errorFistNameTextView);
            initEditText(lastNameEdit, errorLastNameTextView);
            initEditText(emailEdit, errorEmailTextView);
            emailEdit.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

                final SignupView this$0;

                public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
                {
                    if (i == 6)
                    {
                        submitProfileInfo();
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$0 = SignupView.this;
                super();
            }
            });
            return;
        }
    }

    void showKeyboardIfNeeded()
    {
        EditText aedittext[];
        int i;
        int j;
        aedittext = new EditText[3];
        aedittext[0] = firstNameEdit;
        aedittext[1] = lastNameEdit;
        aedittext[2] = emailEdit;
        j = aedittext.length;
        i = 0;
_L3:
        EditText edittext;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        edittext = aedittext[i];
        if (!Strings.isNullOrEmpty(edittext.getText().toString().trim())) goto _L2; else goto _L1
_L1:
        if (edittext != null)
        {
            Keyboard.showKeyboard(edittext);
        }
        return;
_L2:
        i++;
          goto _L3
        edittext = null;
          goto _L1
    }

    void submitProfileInfo()
    {
        final ActionAnalytics analytics = OnBoardingAnalytics.trackAddProfileInfo();
        SignupUser signupuser = SignupUser.create(firstNameEdit.getText().toString().trim(), lastNameEdit.getText().toString().trim(), emailEdit.getText().toString().trim(), false);
        binder.bind(landingService.createUser(signupuser), new AsyncCall() {

            final SignupView this$0;
            final ActionAnalytics val$analytics;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                analytics.trackFailure(throwable);
                if (throwable instanceof LandingValidationException)
                {
                    throwable = ((LandingValidationException)throwable).getFields().iterator();
                    do
                    {
                        if (!throwable.hasNext())
                        {
                            break;
                        }
                        InvalidField invalidfield = (InvalidField)throwable.next();
                        if (invalidfield.getName().equals("first_name"))
                        {
                            firstNameEdit.setValidationErrorId(Integer.valueOf(0x7f0701a9));
                            firstNameEdit.showValidationMessage();
                        }
                        if (invalidfield.getName().equals("last_name"))
                        {
                            lastNameEdit.setValidationErrorId(Integer.valueOf(0x7f0701aa));
                            lastNameEdit.showValidationMessage();
                        }
                        if (invalidfield.getName().equals("email"))
                        {
                            emailEdit.setValidationErrorId(Integer.valueOf(0x7f0701a7));
                            emailEdit.showValidationMessage();
                        }
                    } while (true);
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                analytics.trackSuccess();
                landingFlow.goToNextScreenInSignupFlow();
            }

            
            {
                this$0 = SignupView.this;
                analytics = actionanalytics;
                super();
            }
        });
    }

}
