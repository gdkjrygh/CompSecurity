// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import butterknife.ButterKnife;
import com.pinterest.activity.sendapin.events.SendPinMessageChangeEvent;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import org.apache.commons.lang3.StringUtils;

public class AddMessageDialog extends BaseDialog
{

    private static final String CURRENT_MESSAGE = "_currentMessage";
    private static final String MESSAGE_HINT = "_messageHint";
    private View _container;
    private String _currentMessage;
    EditText _messageEt;
    private String _messageHint;

    public AddMessageDialog()
    {
        this(null, null);
    }

    public AddMessageDialog(String s, String s1)
    {
        _messageHint = null;
        _currentMessage = null;
        _messageHint = s;
        _currentMessage = s1;
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            if (StringUtils.isEmpty(_messageHint))
            {
                _messageHint = bundle.getString("_messageHint");
            }
            if (StringUtils.isEmpty(_currentMessage))
            {
                _currentMessage = bundle.getString("_currentMessage");
            }
        } else
        if (bundle == null)
        {
            Bundle bundle1 = new Bundle();
            if (s != null)
            {
                bundle1.putString("_messageHint", s);
            }
            if (s1 != null)
            {
                bundle1.putString("_currentMessage", s1);
            }
            setArguments(bundle1);
            return;
        }
    }

    private void onAddMessage(EditText edittext)
    {
        Events.post(new SendPinMessageChangeEvent(StringUtils.trimToNull(edittext.getText().toString())));
        Device.hideSoftKeyboard(_messageEt);
        dismiss();
    }

    public void init()
    {
        ButterKnife.a(this, _container);
    }

    public void make(LayoutInflater layoutinflater)
    {
        _container = LayoutInflater.from(getActivity()).inflate(0x7f03007c, null);
        setContent(_container, 0);
        super.make(layoutinflater);
        init();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (_messageHint == null)
        {
            dismiss();
            return;
        }
        setTitle(Resources.string(0x7f07003f));
        _messageEt.setInputType(0x10000);
        _messageEt.setImeOptions(0x10000006);
        _messageEt.setSingleLine(false);
        _messageEt.setMaxLines(3);
        Device.showSoftKeyboard(_messageEt);
        _messageEt.setOnEditorActionListener(new _cls1());
        if (StringUtils.isEmpty(_currentMessage))
        {
            _messageEt.setHint(_messageHint);
        } else
        {
            _messageEt.setText(_currentMessage);
            _messageEt.selectAll();
        }
        setPositiveButton(0x7f0703d2, new _cls2());
        setNegativeButton(0x7f0700af, new _cls3());
    }

    public void onDestroyView()
    {
        ButterKnife.a(this);
        super.onDestroyView();
    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final AddMessageDialog this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (ViewHelper.isKeyboardAction(6, i, keyevent))
            {
                onAddMessage(_messageEt);
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = AddMessageDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final AddMessageDialog this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.ADD_MESSAGE_BUTTON, ComponentType.MODAL_DIALOG);
            onAddMessage(_messageEt);
        }

        _cls2()
        {
            this$0 = AddMessageDialog.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final AddMessageDialog this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.CANCEL_BUTTON, ComponentType.MODAL_DIALOG);
            Device.hideSoftKeyboard(_messageEt);
            dismiss();
        }

        _cls3()
        {
            this$0 = AddMessageDialog.this;
            super();
        }
    }

}
