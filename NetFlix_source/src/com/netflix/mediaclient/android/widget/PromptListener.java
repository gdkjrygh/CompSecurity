// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            PromptResult

public class PromptListener
    implements android.content.DialogInterface.OnClickListener
{

    private View promptDialogView;
    private int promptEditTextControlId;
    private String promptValue;
    private PromptResult result;

    public PromptListener(View view, int i, String s, int j, String s1, PromptResult promptresult)
    {
        if (view == null)
        {
            throw new IllegalArgumentException("Dialog view is null!");
        }
        promptDialogView = view;
        promptEditTextControlId = j;
        result = promptresult;
        view = s1;
        if (s1 == null)
        {
            view = "";
        }
        s1 = (EditText)promptDialogView.findViewById(j);
        if (s1 != null)
        {
            s1.setText(view);
        }
        s1 = (TextView)promptDialogView.findViewById(i);
        if (s1 != null)
        {
            view = s;
            if (s == null)
            {
                view = "";
            }
            s1.setText(view);
        }
    }

    private String getPromptText()
    {
        EditText edittext = (EditText)promptDialogView.findViewById(promptEditTextControlId);
        if (edittext != null)
        {
            return edittext.getText().toString();
        } else
        {
            return "";
        }
    }

    public String getPromptValue()
    {
        return promptValue;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            result.confirm(getPromptText());
        } else
        if (i == -2)
        {
            result.cancel();
            return;
        }
    }
}
