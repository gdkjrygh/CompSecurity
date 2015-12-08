// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.account:
//            CallForwardingActivity, DeleteCallForwardingNumberDialog

final class deleteButton extends com.skype.android.app.data.r
{

    ImageButton deleteButton;
    TextView phoneNumber;
    final CallForwardingActivity this$0;

    protected final void onSetData(final com.skype.android.util.vity.b number)
    {
        String s1 = number.b;
        phoneNumber.setText(s1);
        String s = "";
        int j = s1.length();
        for (int i = 0; i < j; i++)
        {
            s = (new StringBuilder()).append(s).append(s1.charAt(i)).append(" ").toString();
        }

        phoneNumber.setContentDescription(getResources().getString(0x7f08005f, new Object[] {
            s
        }));
        deleteButton.setContentDescription(getResources().getString(0x7f08005d, new Object[] {
            s
        }));
        deleteButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CallForwardingActivity.b this$1;
            final com.skype.android.util.CallForwarding.Number val$number;

            public final void onClick(View view)
            {
                view = new DeleteCallForwardingNumberDialog();
                Bundle bundle = new Bundle();
                bundle.putString("phone_num", number.c);
                view.setArguments(bundle);
                view.show(getSupportFragmentManager());
            }

            
            {
                this$1 = CallForwardingActivity.b.this;
                number = number1;
                super();
            }
        });
    }

    protected final volatile void onSetData(Object obj)
    {
        onSetData((com.skype.android.util.vity.b.onSetData)obj);
    }

    public _cls1.val.number(View view)
    {
        this$0 = CallForwardingActivity.this;
        super(view);
        phoneNumber = (TextView)view.findViewById(0x7f100250);
        deleteButton = (ImageButton)view.findViewById(0x7f100251);
    }
}
