// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import com.jcp.b.b;
import com.jcp.c.l;
import com.jcp.util.au;

// Referenced classes of package com.jcp.fragments:
//            EditAccountFragment

class al
    implements android.view.View.OnClickListener
{

    final EditAccountFragment.DialogHolder a;
    final Dialog b;
    final EditAccountFragment c;

    al(EditAccountFragment editaccountfragment, EditAccountFragment.DialogHolder dialogholder, Dialog dialog)
    {
        c = editaccountfragment;
        a = dialogholder;
        b = dialog;
        super();
    }

    public void onClick(View view)
    {
        if (a.updateEmail.getText().toString().equals(EditAccountFragment.a(c)))
        {
            view = c.W();
            String s = com.jcp.b.b.C();
            EditAccountFragment.a(c, new l(c.i()));
            com.jcp.fragments.EditAccountFragment.b(c).a(c);
            com.jcp.fragments.EditAccountFragment.b(c).b(view, s);
        } else
        {
            au.a(c.i(), c.a(0x7f0701bb), c.a(0x7f07023f));
        }
        b.dismiss();
    }
}
