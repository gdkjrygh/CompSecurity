// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.Dialog;
import android.content.res.Resources;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import com.jcp.b.b;
import com.jcp.c.aj;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class dj
    implements android.view.View.OnClickListener
{

    final EditText a;
    final Dialog b;
    final ProductDetailFragment c;

    dj(ProductDetailFragment productdetailfragment, EditText edittext, Dialog dialog)
    {
        c = productdetailfragment;
        a = edittext;
        b = dialog;
        super();
    }

    public void onClick(View view)
    {
        view = a.getEditableText().toString().trim();
        if (TextUtils.isEmpty(view))
        {
            Toast.makeText(c.i(), c.j().getString(0x7f0701a4), 0).show();
            return;
        }
        ((InputMethodManager)c.i().getSystemService("input_method")).hideSoftInputFromWindow(a.getWindowToken(), 0);
        try
        {
            if (com.jcp.b.b.a(c.i()))
            {
                aj aj1 = aj.b(c.i());
                aj1.a(c);
                aj1.a(ProductDetailFragment.c(c), view);
                b.dismiss();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view.printStackTrace();
            return;
        }
        ProductDetailFragment.a(c, c.j().getString(0x7f0702a6), c.j().getString(0x7f0702b7), false);
        return;
    }
}
