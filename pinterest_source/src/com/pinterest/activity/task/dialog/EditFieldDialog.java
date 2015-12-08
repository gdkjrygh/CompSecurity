// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.widget.EditText;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            BaseDialog

public class EditFieldDialog extends BaseDialog
{

    protected EditText _editText;
    protected String _hint;
    protected int _layoutId;
    private OnClickListener _onClickListener;
    protected String _prefilledText;

    public EditFieldDialog()
    {
        this("");
    }

    public EditFieldDialog(String s)
    {
        _layoutId = 0x7f03007b;
        _prefilledText = s;
        Bundle bundle = new Bundle();
        bundle.putString("text", s);
        setArguments(bundle);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setContent(LayoutInflater.from(getActivity()).inflate(_layoutId, null));
        bundle = getArguments();
        if (bundle != null && _prefilledText == null)
        {
            _prefilledText = bundle.getString("text");
        }
        _editText = (EditText)findViewById(0x7f0f0163);
        if (_hint != null)
        {
            _editText.setHint(_hint);
        }
        ViewHelper.setTextAndCursor(_editText, _prefilledText);
        _editText.setImeActionLabel(Resources.string(0x7f0704be), 2);
        _editText.setOnEditorActionListener(new _cls1());
        setPositiveButton(0x7f0703d2, new _cls2());
        setNegativeButton(0x7f0700af, new _cls3());
        (new Handler()).postDelayed(new _cls4(), 200L);
    }

    public void onDestroyView()
    {
        Device.hideSoftKeyboard(getView());
        super.onDestroyView();
    }

    public void setHint(int i)
    {
        _hint = Resources.string(i);
    }

    public void setHint(String s)
    {
        _hint = s;
    }

    public void setLayout(int i)
    {
        _layoutId = i;
    }

    public void setOnClickListener(OnClickListener onclicklistener)
    {
        _onClickListener = onclicklistener;
    }

    public void setPrefilledText(String s)
    {
        _prefilledText = s;
        s = (EditText)findViewById(0x7f0f0163);
        if (s != null)
        {
            ViewHelper.setTextAndCursor(s, _prefilledText);
        }
    }

    public void setText(String s)
    {
        if (_editText != null)
        {
            _editText.setText(s);
        }
    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final EditFieldDialog this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            boolean flag = false;
            if (ViewHelper.isKeyboardAction(2, i, keyevent))
            {
                if (_onClickListener != null)
                {
                    textview = _editText.getText().toString();
                    keyevent = _onClickListener;
                    if (!TextUtils.equals(textview, _prefilledText))
                    {
                        flag = true;
                    }
                    keyevent.onPositiveClicked(textview, flag);
                }
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = EditFieldDialog.this;
            super();
        }

        private class OnClickListener
        {

            public void onNegativeClicked()
            {
            }

            public void onPositiveClicked(String s, boolean flag)
            {
            }

            public OnClickListener()
            {
            }
        }

    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final EditFieldDialog this$0;

        public void onClick(View view)
        {
            if (_onClickListener != null)
            {
                view = _editText.getText().toString();
                OnClickListener onclicklistener = _onClickListener;
                boolean flag;
                if (!TextUtils.equals(view, _prefilledText))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                onclicklistener.onPositiveClicked(view, flag);
            }
        }

        _cls2()
        {
            this$0 = EditFieldDialog.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final EditFieldDialog this$0;

        public void onClick(View view)
        {
            dismiss();
            if (_onClickListener != null)
            {
                _onClickListener.onNegativeClicked();
            }
        }

        _cls3()
        {
            this$0 = EditFieldDialog.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final EditFieldDialog this$0;

        public void run()
        {
            Device.showSoftKeyboard(_editText);
        }

        _cls4()
        {
            this$0 = EditFieldDialog.this;
            super();
        }
    }

}
