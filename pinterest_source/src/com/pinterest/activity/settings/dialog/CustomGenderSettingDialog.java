// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.view.LayoutInflater;
import android.view.View;
import butterknife.ButterKnife;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.FontUtils;
import com.pinterest.ui.text.PEditText;

public class CustomGenderSettingDialog extends BaseDialog
{

    private View _container;
    PEditText _customGenderEt;
    private CustomGenderListener listener;

    public CustomGenderSettingDialog()
    {
    }

    private void init()
    {
        ButterKnife.a(this, _container);
        setTitle(Resources.string(0x7f0701bf));
        _customGenderEt.setHint(Resources.string(0x7f0701be));
        _customGenderEt.setTypeface(FontUtils.getTypeface(com.pinterest.kit.utils.FontUtils.TypefaceId.LIGHT));
        _customGenderEt.requestFocus();
        _customGenderEt.setOnEditorActionListener(new _cls1());
        setPositiveButton(Resources.string(0x7f0704be), new _cls2());
        Device.showSoftKeyboard(getDialog());
    }

    public void make(LayoutInflater layoutinflater)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity == null)
        {
            return;
        } else
        {
            _container = LayoutInflater.from(fragmentactivity).inflate(0x7f03006c, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            init();
            return;
        }
    }

    public void onDestroyView()
    {
        listener = null;
        super.onDestroyView();
    }

    public void setListener(CustomGenderListener customgenderlistener)
    {
        listener = customgenderlistener;
    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final CustomGenderSettingDialog this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (i == 6)
            {
                listener.setCustomGender(_customGenderEt.getText().toString());
            } else
            if (i == 5)
            {
                if (_customGenderEt != null)
                {
                    _customGenderEt.requestFocus();
                    return true;
                }
            } else
            {
                return false;
            }
            return true;
        }

        _cls1()
        {
            this$0 = CustomGenderSettingDialog.this;
            super();
        }

        private class CustomGenderListener
        {

            public abstract void setCustomGender(String s);
        }

    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final CustomGenderSettingDialog this$0;

        public void onClick(View view)
        {
            listener.setCustomGender(_customGenderEt.getText().toString());
        }

        _cls2()
        {
            this$0 = CustomGenderSettingDialog.this;
            super();
        }
    }

}
