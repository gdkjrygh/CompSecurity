// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import butterknife.ButterKnife;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            BaseDialog

public abstract class OneFieldBaseDialog extends BaseDialog
{

    private View _container;
    protected EditText _et;

    public OneFieldBaseDialog()
    {
    }

    public void dismiss()
    {
        Device.hideSoftKeyboard(_et);
        super.dismiss();
    }

    protected boolean dismissOnUnchanged()
    {
        return true;
    }

    protected abstract String getDialogTitle();

    protected abstract String getHint();

    protected abstract String getInitialValue();

    protected String getInvalidToast()
    {
        return null;
    }

    protected boolean isValid(String s)
    {
        return true;
    }

    protected abstract void logSubmitAction();

    public void make(LayoutInflater layoutinflater)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            _container = LayoutInflater.from(getActivity()).inflate(0x7f03007b, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            ButterKnife.a(this, _container);
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        setTitle(getDialogTitle());
        ViewHelper.setTextAndCursor(_et, getInitialValue());
        _et.setHint(getHint());
        _et.setImeActionLabel(Resources.string(0x7f0704be), 2);
        _et.setOnEditorActionListener(new _cls1());
        setPositiveButton(getString(0x7f0704be), new _cls2());
        setNegativeButton(getString(0x7f0700af), null);
        Device.showSoftKeyboard(getDialog());
        super.onActivityCreated(bundle);
    }

    protected abstract void submit(String s, String s1);

    protected void trySubmit()
    {
        logSubmitAction();
        if (_et != null)
        {
            String s = getInitialValue();
            String s1 = _et.getText().toString();
            if (s != null && dismissOnUnchanged() && s.equals(s1))
            {
                dismiss();
                return;
            }
            if (!isValid(s1))
            {
                s = getInvalidToast();
                if (s != null)
                {
                    Application.showToastShort(s);
                    return;
                }
            } else
            {
                submit(s, s1);
                dismiss();
                return;
            }
        }
    }

    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final OneFieldBaseDialog this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (ViewHelper.isKeyboardAction(2, i, keyevent))
            {
                trySubmit();
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = OneFieldBaseDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final OneFieldBaseDialog this$0;

        public void onClick(View view)
        {
            trySubmit();
        }

        _cls2()
        {
            this$0 = OneFieldBaseDialog.this;
            super();
        }
    }

}
