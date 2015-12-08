// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

// Referenced classes of package com.QRBS.activity:
//            ManualInsert

class this._cls0
    implements android.view.tener
{

    final ManualInsert this$0;

    public void onClick(View view)
    {
        ManualInsert.access$7(ManualInsert.this, ManualInsert.access$5(ManualInsert.this).getText().toString());
        if (ManualInsert.access$8(ManualInsert.this).equals(""))
        {
            return;
        }
        if (!ManualInsert.access$6(ManualInsert.this).isChecked())
        {
            if (ManualInsert.access$0(ManualInsert.this).isChecked())
            {
                view = Uri.parse((new StringBuilder("http://www.google.com/m/products?q=")).append(ManualInsert.access$8(ManualInsert.this)).toString());
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(view);
                startActivity(intent);
                return;
            }
            if (ManualInsert.access$1(ManualInsert.this).isChecked())
            {
                view = Uri.parse((new StringBuilder("http://www.google.com/m/products?q=")).append(ManualInsert.access$8(ManualInsert.this)).toString());
                Intent intent1 = new Intent("android.intent.action.VIEW");
                intent1.setData(view);
                startActivity(intent1);
                return;
            }
            if (!ManualInsert.access$2(ManualInsert.this).isChecked())
            {
                Log.d("", "No one checked");
                return;
            } else
            {
                view = Uri.parse((new StringBuilder("http://www.google.com/m/products?q=")).append(ManualInsert.access$8(ManualInsert.this)).toString());
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(view);
                startActivity(intent2);
                return;
            }
        } else
        {
            view = Uri.parse((new StringBuilder("http://www.google.com/m/products?q=")).append(ManualInsert.access$8(ManualInsert.this)).toString());
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.setData(view);
            startActivity(intent3);
            return;
        }
    }

    ()
    {
        this$0 = ManualInsert.this;
        super();
    }
}
