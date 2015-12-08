// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.settings.ISettingsService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.PhoneFormattingTextWatcher;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.controls.Validation;
import me.lyft.android.domain.Phone;
import me.lyft.android.domain.User;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.infrastructure.lyft.LyftApiException;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.utils.EditTextUtils;
import rx.functions.Action1;

public class EditPhoneView extends LinearLayout
{

    AppFlow appFlow;
    private Binder binder;
    IDefaultErrorHandler defaultErrorHandler;
    DialogFlow dialogFlow;
    TextView inlineErrorTxt;
    private final Action1 onToolbarItemClicked = new Action1() {

        final EditPhoneView this$0;

        public void call(Integer integer)
        {
            if (integer.intValue() == 0x7f0d0024)
            {
                onSaveClicked();
            }
        }

        public volatile void call(Object obj)
        {
            call((Integer)obj);
        }

            
            {
                this$0 = EditPhoneView.this;
                super();
            }
    };
    AdvancedEditText phoneEditText;
    ISettingsService phoneVerificationService;
    IProgressController progressController;
    Toolbar toolbar;
    IUserProvider userProvider;

    public EditPhoneView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private String getCleanNumber(String s)
    {
        String s1 = s;
        if (!Strings.isNullOrEmpty(s))
        {
            s1 = s.replaceAll("[^0-9]", "");
        }
        return s1;
    }

    private void goToNextStep()
    {
        if (userProvider.getUser().getPhone().isVerificationNeeded())
        {
            appFlow.goTo(new SettingsScreens.EditPhoneVerifyNumberScreen());
            return;
        } else
        {
            appFlow.goUp();
            return;
        }
    }

    private boolean handleUpdateError(Throwable throwable)
    {
        if (throwable instanceof LyftApiException)
        {
            throwable = (LyftApiException)throwable;
            if (throwable.getStatusCode() == 422)
            {
                throwable = throwable.getValidationErrors().iterator();
                boolean flag = false;
                do
                {
                    if (!throwable.hasNext())
                    {
                        break;
                    }
                    Object obj = (me.lyft.android.infrastructure.lyft.LyftError.ValidationError)throwable.next();
                    String s = ((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj)).getField();
                    obj = ((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj)).getReason();
                    if (s.equalsIgnoreCase("number"))
                    {
                        if (((String) (obj)).equalsIgnoreCase("invalidAreaCode"))
                        {
                            phoneEditText.setValidationErrorId(Integer.valueOf(0x7f0701ab));
                        } else
                        if (((String) (obj)).equalsIgnoreCase("invalidCountry"))
                        {
                            phoneEditText.setValidationErrorId(Integer.valueOf(0x7f0701ac));
                        } else
                        {
                            phoneEditText.setValidationErrorId(Integer.valueOf(0x7f0701ad));
                        }
                        flag = true;
                    }
                } while (true);
                if (flag)
                {
                    inlineErrorTxt.setVisibility(0);
                }
                Validation.focusErrorField(new View[] {
                    phoneEditText
                });
                return true;
            }
        }
        return false;
    }

    private boolean isPhoneNumberChanged()
    {
        String s = getCleanNumber(userProvider.getUser().getPhone().getNumber());
        String s1 = getCleanNumber(phoneEditText.getText().toString());
        return !Strings.isNullOrEmpty(s1) && !s1.equalsIgnoreCase(s);
    }

    private void onSaveClicked()
    {
        if (isPhoneNumberChanged())
        {
            saveProfile();
            return;
        } else
        {
            goToNextStep();
            return;
        }
    }

    private void saveProfile()
    {
        progressController.showProgress();
        binder.bind(phoneVerificationService.requestVerificationCode(phoneEditText.getText().toString()), new AsyncCall() {

            final EditPhoneView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                if (!handleUpdateError(throwable))
                {
                    defaultErrorHandler.handle(throwable);
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                dialogFlow.show(new Toast(getContext().getString(0x7f0702ca)));
                goToNextStep();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = EditPhoneView.this;
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
            User user = userProvider.getUser();
            EditTextUtils.setTextAndMoveCursor(phoneEditText, user.getPhone().getNumber());
            binder = Binder.attach(this);
            binder.bind(toolbar.observeItemClick(), onToolbarItemClicked);
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        phoneEditText.addTextChangedListener(new PhoneFormattingTextWatcher(null));
        phoneEditText.setValidationMessageView(inlineErrorTxt);
        phoneEditText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final EditPhoneView this$0;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6)
                {
                    onSaveClicked();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = EditPhoneView.this;
                super();
            }
        });
        toolbar.setTitle(getContext().getString(0x7f070334)).addItem(0x7f0d0024, getContext().getString(0x7f070321), 0x7f020005);
    }



}
