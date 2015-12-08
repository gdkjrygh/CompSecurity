// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.a;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;
import com.arist.activity.MyApplication;
import com.arist.model.b.d;
import java.util.ArrayList;

// Referenced classes of package com.arist.model.a:
//            b

final class e
    implements android.content.DialogInterface.OnClickListener
{

    final b a;
    private final EditText b;
    private final Runnable c;
    private final Context d;

    e(b b1, EditText edittext, Runnable runnable, Context context)
    {
        a = b1;
        b = edittext;
        c = runnable;
        d = context;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = b.getText().toString().trim();
        if (!TextUtils.isEmpty(dialoginterface))
        {
            MyApplication.l.add(com.arist.model.a.b.a(a).a(dialoginterface));
            c.run();
            return;
        } else
        {
            Toast.makeText(d, d.getString(0x7f0900a4), 0).show();
            return;
        }
    }
}
