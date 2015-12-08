// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            SimplifiedSetupProfileActivity, AccountAdapter, ZipCodeView

final class this._cls0
    implements android.widget.r
{

    final SimplifiedSetupProfileActivity this$0;

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (SimplifiedSetupProfileActivity.access$000(SimplifiedSetupProfileActivity.this).isAddAccountIndex(i))
        {
            SimplifiedSetupProfileActivity.access$200(SimplifiedSetupProfileActivity.this).setSelection(SimplifiedSetupProfileActivity.access$100(SimplifiedSetupProfileActivity.this));
            adapterview = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
            adapterview.putExtra("account_types", new String[] {
                "com.google"
            });
            startActivityForResult(adapterview, 9002);
            return;
        } else
        {
            SimplifiedSetupProfileActivity.access$300(SimplifiedSetupProfileActivity.this).clear();
            SimplifiedSetupProfileActivity.access$102(SimplifiedSetupProfileActivity.this, i);
            return;
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }

    ()
    {
        this$0 = SimplifiedSetupProfileActivity.this;
        super();
    }
}
