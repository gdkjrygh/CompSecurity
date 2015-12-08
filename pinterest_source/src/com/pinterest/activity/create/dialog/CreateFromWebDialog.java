// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.create.PinItActivity;
import com.pinterest.activity.create.helper.CreateImageHelper;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

public class CreateFromWebDialog extends BaseDialog
{

    private View _container;
    EditText _editText;
    TextView _textView;

    public CreateFromWebDialog()
    {
    }

    private void tryGoUrl()
    {
        String s = CreateImageHelper.getValidWebUrl(_editText);
        if (s != null)
        {
            Pinalytics.a(ElementType.FIND_IMAGES_BUTTON, ComponentType.MODAL_DIALOG);
            Intent intent = new Intent(getActivity(), com/pinterest/activity/create/PinItActivity);
            intent.putExtra("android.intent.extra.TEXT", s);
            intent.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", Resources.string(0x7f070736));
            getActivity().startActivity(intent);
            dismiss();
            return;
        } else
        {
            Application.showToast(0x7f07037e, 0, 0);
            return;
        }
    }

    public void init()
    {
        ButterKnife.a(this, _container);
    }

    public void make(LayoutInflater layoutinflater)
    {
        _container = LayoutInflater.from(getActivity()).inflate(0x7f03007e, null);
        setContent(_container, 0);
        super.make(layoutinflater);
        init();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setTitle(0x7f07041d);
        _textView.setMovementMethod(LinkMovementMethod.getInstance());
        Device.showSoftKeyboard(_editText);
        _editText.setOnEditorActionListener(new _cls1());
        setPositiveButton(0x7f07029d, new _cls2());
        setNegativeButton(0x7f0703e0, new _cls3());
    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final CreateFromWebDialog this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (ViewHelper.isKeyboardAction(6, i, keyevent))
            {
                tryGoUrl();
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = CreateFromWebDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final CreateFromWebDialog this$0;

        public void onClick(View view)
        {
            tryGoUrl();
        }

        _cls2()
        {
            this$0 = CreateFromWebDialog.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final CreateFromWebDialog this$0;

        public void onClick(View view)
        {
            view = Device.getClipboard();
            if (view != null)
            {
                _editText.setText(view);
                return;
            } else
            {
                Application.showToast(0x7f07037d, 0, 0);
                return;
            }
        }

        _cls3()
        {
            this$0 = CreateFromWebDialog.this;
            super();
        }
    }

}
