// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.address;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;

// Referenced classes of package com.dominos.fragments.address:
//            AddressDormitoryFragment

class this._cls0
    implements android.widget.istener
{

    final AddressDormitoryFragment this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (!AddressDormitoryFragment.access$000(AddressDormitoryFragment.this))
        {
            mZipEntry.requestFocus();
        }
        AddressDormitoryFragment.access$002(AddressDormitoryFragment.this, false);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    ()
    {
        this$0 = AddressDormitoryFragment.this;
        super();
    }
}
