// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            ConfirmationDialogActivity, SharePointsCompleteActivity

class this._cls0
    implements android.content.er
{

    final ConfirmationDialogActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        i = ConfirmationDialogActivity.access$000(ConfirmationDialogActivity.this);
        if (i == 3005 || ConfirmationDialogActivity.access$100(ConfirmationDialogActivity.this).equalsIgnoreCase("donate"))
        {
            Intent intent = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/loyalty/SharePointsCompleteActivity);
            intent.putExtra("email_of_friend", getIntent().getStringExtra("email_of_friend"));
            intent.putExtra("charityname", getIntent().getStringExtra("charityname"));
            intent.putExtra("charityimg", getIntent().getStringExtra("charityimg"));
            intent.putExtra("message", getIntent().getStringExtra("message"));
            intent.putExtra("points_to_share", getIntent().getStringExtra("points_to_share"));
            intent.putExtra("loyaltyid", ConfirmationDialogActivity.access$200(ConfirmationDialogActivity.this));
            intent.putExtra("sharewith", getIntent().getStringExtra("sharewith"));
            intent.putExtra("phone", getIntent().getStringExtra("phone"));
            startActivity(intent);
        } else
        {
            setResult(i);
        }
        dialoginterface.dismiss();
    }

    ()
    {
        this$0 = ConfirmationDialogActivity.this;
        super();
    }
}
