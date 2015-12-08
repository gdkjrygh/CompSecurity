// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.dialog;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import butterknife.ButterKnife;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;

public class EditUserDialog extends BaseDialog
{

    private static final String KEY_ABOUT = "about";
    private static final String KEY_LOCATION = "location";
    private String _about;
    EditText _aboutEt;
    private OnChangedListener _changeListener;
    private View _container;
    private String _location;
    EditText _locationEt;

    public EditUserDialog()
    {
    }

    public static EditUserDialog newInstance(String s, String s1)
    {
        EditUserDialog edituserdialog = new EditUserDialog();
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(s))
        {
            bundle.putString("about", s);
        }
        if (!TextUtils.isEmpty(s1))
        {
            bundle.putString("location", s1);
        }
        edituserdialog.setArguments(bundle);
        return edituserdialog;
    }

    private void onSaveUserAboutClicked()
    {
        boolean flag1 = true;
        Pinalytics.a(ElementType.USER_ABOUT_EDIT_BUTTON);
        android.text.Editable editable = _aboutEt.getText();
        android.text.Editable editable1;
        boolean flag;
        if (!TextUtils.equals(editable, _about))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        editable1 = _locationEt.getText();
        if (TextUtils.equals(editable1, _location))
        {
            flag1 = false;
        }
        if ((flag || flag1) && _changeListener != null)
        {
            _changeListener.onChanged(editable.toString(), editable1.toString());
        }
        dismiss();
    }

    public void init()
    {
        ButterKnife.a(this, _container);
    }

    public void make(LayoutInflater layoutinflater)
    {
        _container = LayoutInflater.from(getActivity()).inflate(0x7f030070, null);
        setContent(_container, 0);
        super.make(layoutinflater);
        init();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setTitle(0x7f070032);
        ViewHelper.setTextAndCursor(_aboutEt, _about);
        ViewHelper.setTextAndCursor(_locationEt, _location);
        _aboutEt.setImeActionLabel(Resources.string(0x7f0704be), 2);
        _aboutEt.setOnEditorActionListener(new _cls1());
        setPositiveButton(0x7f0704be, new _cls2());
        setNegativeButton(0x7f0700af, new _cls3());
        (new Handler()).postDelayed(new _cls4(), 200L);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            _about = bundle.getString("about");
            _location = bundle.getString("location");
        }
    }

    public void onDestroyView()
    {
        Device.hideSoftKeyboard(getView());
        super.onDestroyView();
    }

    public void setOnChangedListener(OnChangedListener onchangedlistener)
    {
        _changeListener = onchangedlistener;
    }


    private class OnChangedListener
    {

        public abstract void onChanged(String s, String s1);
    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final EditUserDialog this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (ViewHelper.isKeyboardAction(2, i, keyevent))
            {
                onSaveUserAboutClicked();
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = EditUserDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final EditUserDialog this$0;

        public void onClick(View view)
        {
            onSaveUserAboutClicked();
        }

        _cls2()
        {
            this$0 = EditUserDialog.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final EditUserDialog this$0;

        public void onClick(View view)
        {
            dismiss();
        }

        _cls3()
        {
            this$0 = EditUserDialog.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final EditUserDialog this$0;

        public void run()
        {
            Device.showSoftKeyboard(_aboutEt);
        }

        _cls4()
        {
            this$0 = EditUserDialog.this;
            super();
        }
    }

}
