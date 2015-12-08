// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;

// Referenced classes of package com.QRBS.activity:
//            ManualInsert

class this._cls0
    implements android.widget.OnCheckedChangeListener
{

    final ManualInsert this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag)
        {
            compoundbutton.setChecked(true);
            ManualInsert.access$6(ManualInsert.this).setChecked(false);
            ManualInsert.access$1(ManualInsert.this).setChecked(false);
            ManualInsert.access$0(ManualInsert.this).setChecked(false);
            ManualInsert.access$3(ManualInsert.this).setBackgroundResource(0x7f02009d);
            ManualInsert.access$5(ManualInsert.this).setInputType(1);
            ManualInsert.access$5(ManualInsert.this).setEnabled(true);
            ManualInsert.access$5(ManualInsert.this).setFocusableInTouchMode(true);
            ManualInsert.access$5(ManualInsert.this).setHint(0x7f08011d);
            return;
        } else
        {
            ManualInsert.access$5(ManualInsert.this).setFocusableInTouchMode(false);
            ManualInsert.access$5(ManualInsert.this).setFocusable(false);
            ManualInsert.access$5(ManualInsert.this).setEnabled(false);
            ManualInsert.access$5(ManualInsert.this).setText("");
            ManualInsert.access$5(ManualInsert.this).setHint(0x7f08011c);
            return;
        }
    }

    heckedChangeListener()
    {
        this$0 = ManualInsert.this;
        super();
    }
}
