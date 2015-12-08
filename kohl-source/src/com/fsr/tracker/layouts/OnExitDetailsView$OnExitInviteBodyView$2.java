// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.layouts;

import android.text.Editable;
import android.text.TextWatcher;
import com.fsr.tracker.StringsProvider;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.fsr.tracker.layouts:
//            OnExitDetailsView

class val.this._cls0
    implements TextWatcher
{

    final val.this._cls0 this$1;
    final OnExitDetailsView val$this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        Pattern pattern = Pattern.compile("^[\\d]{3}");
        if (Pattern.compile("@").matcher(charsequence).find())
        {
            setAcceptButtonText(stringsProvider.getEmailNotificationSubmit());
            return;
        }
        if (pattern.matcher(charsequence).find())
        {
            setAcceptButtonText(stringsProvider.getTextMessageNotificationSubmit());
            return;
        } else
        {
            setAcceptButtonText(stringsProvider.getOnExitDetailAcceptButtonText());
            return;
        }
    }

    ()
    {
        this$1 = final_;
        val$this$0 = OnExitDetailsView.this;
        super();
    }
}
