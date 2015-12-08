// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.a;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.Toast;
import com.arist.b.c;
import com.arist.view.a;

// Referenced classes of package com.arist.model.a:
//            b

final class d
    implements android.content.DialogInterface.OnClickListener
{

    final b a;
    private final EditText b;
    private final Context c;
    private final c d;
    private final BaseAdapter e;
    private final a f;

    d(b b1, EditText edittext, Context context, c c1, BaseAdapter baseadapter, a a1)
    {
        a = b1;
        b = edittext;
        c = context;
        d = c1;
        e = baseadapter;
        f = a1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        dialoginterface = b.getText().toString().trim();
        if (TextUtils.isEmpty(dialoginterface))
        {
            Toast.makeText(c, c.getString(0x7f0900a4), 0).show();
        } else
        if (!dialoginterface.equals(d.b()))
        {
            d.c(dialoginterface);
            com.arist.model.a.b.a(a).d(d);
            e.notifyDataSetChanged();
            f.b();
            return;
        }
    }
}
