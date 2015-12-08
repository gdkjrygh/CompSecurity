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

public class LinkingErrorConnectionDroppedActivity extends LinkingErrorActivity
{

    public LinkingErrorConnectionDroppedActivity()
    {
    }

    public void onClick(View view)
    {
        Intent intent = new Intent();
        byte byte0 = -1;
        if (view == firstBtn)
        {
            finish();
            return;
        }
        if (view == actionLink)
        {
            byte0 = 6;
        }
        intent.putExtra("clickedAction", byte0);
        setResult(-1, intent);
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        errorMessage.setText(0x7f080496);
        errorHint.setVisibility(8);
        firstBtn.setText(0x7f080150);
        secondBtn.setVisibility(8);
        actionLink.setText(0x7f08014d);
    }
}
