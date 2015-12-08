// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.equize;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import com.arist.b.a;

// Referenced classes of package com.arist.model.equize:
//            a, j

final class f
    implements android.content.DialogInterface.OnClickListener
{

    final com.arist.model.equize.a a;
    private final EditText b;
    private final a c;

    f(com.arist.model.equize.a a1, EditText edittext, a a2)
    {
        a = a1;
        b = edittext;
        c = a2;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        String s = b.getText().toString();
        if (TextUtils.isEmpty(s))
        {
            com.arist.model.equize.a.a(a, 0x7f0900a4);
            return;
        } else
        {
            dialoginterface.dismiss();
            c.a = s;
            com.arist.model.equize.a.a(a).b(c);
            com.arist.model.equize.a.a(a, 0x7f0900a0);
            return;
        }
    }
}
