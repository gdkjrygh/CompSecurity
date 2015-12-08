// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.api.remote.PinvitationalApi;
import com.pinterest.base.Device;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.ui.progress.LoadingView;

public class PinvitationalRequestInviteDialogView extends LinearLayout
    implements android.view.View.OnClickListener
{

    BaseDialog _dialog;
    EditText _emailEditText;
    LoadingView _loadingView;
    String _prefilledEmailAddress;
    Button _submitButton;

    public PinvitationalRequestInviteDialogView(Context context, BaseDialog basedialog, String s)
    {
        super(context);
        _dialog = basedialog;
        _prefilledEmailAddress = s;
        init();
    }

    private void init()
    {
        if (TextUtils.isEmpty(_prefilledEmailAddress)) goto _L2; else goto _L1
_L1:
        Object obj = _prefilledEmailAddress;
_L4:
        LayoutInflater.from(getContext()).inflate(0x7f030080, this, true);
        _emailEditText = (EditText)findViewById(0x7f0f016b);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            _emailEditText.setText(((CharSequence) (obj)));
        }
        _emailEditText.setOnKeyListener(new _cls1());
        _emailEditText.addTextChangedListener(new _cls2());
        _submitButton = (Button)findViewById(0x7f0f0180);
        _submitButton.setOnClickListener(this);
        setSubmitButtonEnabled(SignupFormUtils.isEmailValid(_emailEditText.getText().toString()));
        _loadingView = (LoadingView)findViewById(0x7f0f0095);
        return;
_L2:
        try
        {
            obj = Device.getDefaultEmailAddress();
        }
        catch (Exception exception)
        {
            exception = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void setSubmitButtonEnabled(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0x7f02009b;
        } else
        {
            i = 0x7f020087;
        }
        _submitButton.setBackgroundResource(i);
        _submitButton.setEnabled(flag);
    }

    private void setSubmitButtonSpinning(final boolean spinning)
    {
        float f1 = 0.0F;
        Object obj = _submitButton;
        float f;
        if (spinning)
        {
            f = 1.0F;
        } else
        {
            f = 0.0F;
        }
        if (!spinning)
        {
            f1 = 1.0F;
        }
        obj = ObjectAnimator.ofFloat(obj, "alpha", new float[] {
            f, f1
        });
        ((Animator) (obj)).addListener(new _cls3());
        ((Animator) (obj)).setDuration(200L);
        ((Animator) (obj)).start();
    }

    private void submitEmail()
    {
        AnalyticsApi.c("wl_submitted");
        setSubmitButtonSpinning(true);
        Device.hideSoftKeyboard(_emailEditText);
        final String emailAddress = _emailEditText.getText().toString();
        PinvitationalApi.a(emailAddress, new _cls4());
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131689856: 
            submitEmail();
            break;
        }
    }



    private class _cls1
        implements android.view.View.OnKeyListener
    {

        final PinvitationalRequestInviteDialogView this$0;

        public boolean onKey(View view, int i, KeyEvent keyevent)
        {
            if (keyevent.getAction() == 0 && i == 66)
            {
                _submitButton.performClick();
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = PinvitationalRequestInviteDialogView.this;
            super();
        }
    }


    private class _cls2
        implements TextWatcher
    {

        final PinvitationalRequestInviteDialogView this$0;

        public void afterTextChanged(Editable editable)
        {
            setSubmitButtonEnabled(SignupFormUtils.isEmailValid(editable.toString()));
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        _cls2()
        {
            this$0 = PinvitationalRequestInviteDialogView.this;
            super();
        }
    }


    private class _cls3 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final PinvitationalRequestInviteDialogView this$0;
        final boolean val$spinning;

        public void onAnimationEnd(Animator animator)
        {
            super.onAnimationEnd(animator);
            animator = _loadingView;
            int i;
            if (spinning)
            {
                i = 0;
            } else
            {
                i = 2;
            }
            animator.setState(i);
        }

        _cls3()
        {
            this$0 = PinvitationalRequestInviteDialogView.this;
            spinning = flag;
            super();
        }
    }


    private class _cls4 extends BaseApiResponseHandler
    {

        final PinvitationalRequestInviteDialogView this$0;
        final String val$emailAddress;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            setSubmitButtonSpinning(false);
            AnalyticsApi.c("wl_errored");
            Events.post(new DialogEvent(new PinvitationalRequestInviteFailureDialog(emailAddress, apiresponse)));
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            _dialog.dismiss();
            Events.post(new com.pinterest.api.remote.PinvitationalApi.PinvitationalRequestInviteResult(emailAddress));
        }

        _cls4()
        {
            this$0 = PinvitationalRequestInviteDialogView.this;
            emailAddress = s;
            super();
        }
    }

}
