// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;
import com.arist.activity.MainActivity;
import com.arist.activity.MyApplication;
import com.arist.c.a;
import com.arist.c.f;

// Referenced classes of package com.arist.view:
//            e

final class g
    implements android.content.DialogInterface.OnClickListener
{

    final e a;
    private final EditText b;

    g(e e1, EditText edittext)
    {
        a = e1;
        b = edittext;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        long l = 0L;
        String s = b.getText().toString().trim();
        if (TextUtils.isEmpty(s) || "0".equals(s))
        {
            Toast.makeText(a.getContext(), 0x7f09004d, 0).show();
        } else
        {
            l = Long.parseLong(s);
            Toast.makeText(com.arist.view.e.a(a), String.format(com.arist.view.e.a(a).getString(0x7f09004e), new Object[] {
                Long.valueOf(l)
            }), 1).show();
        }
        dialoginterface.dismiss();
        MyApplication.e.a(l);
        dialoginterface = new Intent(a.s);
        dialoginterface.putExtra("sleep_time", l);
        com.arist.view.e.a(a).sendBroadcast(dialoginterface);
    }
}
