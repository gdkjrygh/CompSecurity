// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.content.DialogInterface;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            LoyaltyEnrollmentActivity

class this._cls0
    implements android.content.ner
{

    final LoyaltyEnrollmentActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            startScan(1002);
        }
    }

    ()
    {
        this$0 = LoyaltyEnrollmentActivity.this;
        super();
    }
}
