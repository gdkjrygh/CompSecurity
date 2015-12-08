// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            BaseDialog

public class SimpleTextDialog extends BaseDialog
{

    private static final String KEY_DESTORYED = "simple_text_dialog_destroyed";
    protected String _text;
    TextView _textView;

    public SimpleTextDialog()
    {
    }

    public static SimpleTextDialog newInstance()
    {
        return new SimpleTextDialog();
    }

    private void updateTitle()
    {
        if (_textView != null)
        {
            _textView.setText(_text);
        }
    }

    public String getText()
    {
        return _text;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setContent(LayoutInflater.from(getActivity()).inflate(0x7f030095, null));
        ButterKnife.a(this, container);
        _textView.setMovementMethod(LinkMovementMethod.getInstance());
        updateTitle();
        if (bundle != null && bundle.getBoolean("simple_text_dialog_destroyed"))
        {
            dismiss();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("simple_text_dialog_destroyed", true);
        super.onSaveInstanceState(bundle);
    }

    public void setText(int i)
    {
        setText(Resources.string(i));
    }

    public void setText(String s)
    {
        _text = s;
        updateTitle();
    }
}
