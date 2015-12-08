// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.PopMenu;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class PopupWindowSearch extends PopupWindow
{

    private LayoutInflater inflater;
    private LinearLayout layout;

    public PopupWindowSearch(Context context, final Handler handler)
    {
        super(context);
        layout = new LinearLayout(context);
        layout.setOrientation(1);
        inflater = LayoutInflater.from(context);
        context = inflater.inflate(0x7f030017, null);
        ((EditText)context.findViewById(0x7f0d005e)).addTextChangedListener(new TextWatcher() {

            final PopupWindowSearch this$0;
            private final Handler val$handler;

            public void afterTextChanged(Editable editable)
            {
                Message message = handler.obtainMessage();
                message.what = 8;
                message.obj = editable.toString().toLowerCase();
                handler.sendMessage(message);
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            
            {
                this$0 = PopupWindowSearch.this;
                handler = handler1;
                super();
            }
        });
        layout.addView(context);
        super.setContentView(layout);
        super.setWidth(-1);
        super.setHeight(-2);
        super.setFocusable(true);
    }
}
