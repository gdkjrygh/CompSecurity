// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.PopMenu;

import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.arist.PopMenu:
//            PopupWindowSearch

class val.handler
    implements TextWatcher
{

    final PopupWindowSearch this$0;
    private final Handler val$handler;

    public void afterTextChanged(Editable editable)
    {
        Message message = val$handler.obtainMessage();
        message.what = 8;
        message.obj = editable.toString().toLowerCase();
        val$handler.sendMessage(message);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    ()
    {
        this$0 = final_popupwindowsearch;
        val$handler = Handler.this;
        super();
    }
}
