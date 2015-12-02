// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.common.w.n;
import com.facebook.o;
import com.facebook.ui.d.a;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.orca.threadview:
//            as, ax, aw

class at
    implements android.content.DialogInterface.OnClickListener
{

    final as a;

    at(as as1)
    {
        a = as1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        String s = com.facebook.orca.threadview.as.a(a).getText().toString().trim();
        if (n.a(s))
        {
            com.facebook.ui.d.a.a(a.getContext()).a(o.app_error_dialog_title).b(o.thread_name_dialog_blank_error).a();
        } else
        {
            as.b(a).hideSoftInputFromWindow(a.getWindow().getDecorView().getWindowToken(), 0);
            a.dismiss();
            if (as.c(a) != null)
            {
                if (Objects.equal(s, as.d(a)))
                {
                    dialoginterface = ax.NO_CHANGE;
                } else
                {
                    dialoginterface = ax.CHANGE;
                }
                as.c(a).a(dialoginterface, s);
                return;
            }
        }
    }
}
