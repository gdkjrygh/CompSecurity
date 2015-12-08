// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.Context;
import android.util.AttributeSet;
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
import me.lyft.android.controls.LowerCaseTextWatcher;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.controls.Validation;
import me.lyft.android.domain.User;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.infrastructure.lyft.LyftApiException;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.utils.EditTextUtils;
import rx.functions.Action1;

public class EditEmailView extends LinearLayout
{

    AppFlow appFlow;
    private Binder binder;
    IDefaultErrorHandler defaultErrorHandler;
    DialogFlow dialogFlow;
    AdvancedEditText emailEditText;
    TextView inlineErrorTxt;
    private final Action1 onToolbarItemClicked = new Action1() {

        final EditEmailView this$0;

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
                this$0 = EditEmailView.this;
                super();
            }
    };
    IProgressController progressController;
    ISettingsService settingsService;
    Toolbar toolbar;
    IUserProvider userProvider;

    public EditEmailView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private void goToNextStep()
    {
        appFlow.goUp();
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
                    me.lyft.android.infrastructure.lyft.LyftError.ValidationError validationerror = (me.lyft.android.infrastructure.lyft.LyftError.ValidationError)throwable.next();
                    String s = validationerror.getField();
                    validationerror.getReason();
                    if (s.equalsIgnoreCase("email"))
                    {
                        emailEditText.setValidationErrorId(Integer.valueOf(0x7f0701a8));
                        flag = true;
                    }
                } while (true);
                if (flag)
                {
                    inlineErrorTxt.setVisibility(0);
                }
                Validation.focusErrorField(new View[] {
                    emailEditText
                });
                return true;
            }
        }
        return false;
    }

    private boolean isEmailChanged()
    {
        String s = userProvider.getUser().getEmail();
        String s1 = emailEditText.getText().toString();
        return !Strings.isNullOrEmpty(s1) && !s1.equalsIgnoreCase(s);
    }

    private void onSaveClicked()
    {
        if (isEmailChanged())
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
        binder.bind(settingsService.updateEmail(emailEditText.getText().toString()), new AsyncCall() {

            final EditEmailView this$0;

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
                this$0 = EditEmailView.this;
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
            EditTextUtils.setTextAndMoveCursor(emailEditText, user.getEmail());
            binder = Binder.attach(this);
            binder.bind(toolbar.observeItemClick(), onToolbarItemClicked);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
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
            emailEditText.addTextChangedListener(new LowerCaseTextWatcher());
            emailEditText.setValidationMessageView(inlineErrorTxt);
            toolbar.setTitle(getContext().getString(0x7f070333)).addItem(0x7f0d0024, getContext().getString(0x7f070321), 0x7f020005);
            return;
        }
    }



}
