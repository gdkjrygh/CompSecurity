// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingErrorActivity

public class LinkingErrorAccountBlockedActivity extends LinkingErrorActivity
{

    public LinkingErrorAccountBlockedActivity()
    {
    }

    public void onClick(View view)
    {
        Intent intent;
        byte byte0;
        intent = new Intent();
        byte0 = -1;
        if (view != firstBtn) goto _L2; else goto _L1
_L1:
        byte0 = 5;
_L4:
        intent.putExtra("clickedAction", byte0);
        setResult(-1, intent);
        finish();
        return;
_L2:
        if (view == actionLink)
        {
            byte0 = 6;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        errorMessage.setText(0x7f080494);
        errorHint.setText(0x7f080495);
        firstBtn.setText(0x7f080153);
        secondBtn.setVisibility(8);
        actionLink.setText(0x7f08014d);
    }
}
