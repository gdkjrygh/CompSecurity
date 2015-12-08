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

public class LinkingErrorSignInActivity extends LinkingErrorActivity
{

    public LinkingErrorSignInActivity()
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
        byte0 = 0;
_L4:
        intent.putExtra("clickedAction", byte0);
        setResult(-1, intent);
        finish();
        return;
_L2:
        if (view == secondBtn)
        {
            byte0 = 2;
        } else
        if (view == actionLink)
        {
            byte0 = 3;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        errorMessage.setText(0x7f080498);
        errorHint.setVisibility(8);
        firstBtn.setText(0x7f080150);
        secondBtn.setText(0x7f08014f);
        actionLink.setText(0x7f080307);
    }
}
