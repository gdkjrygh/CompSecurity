// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

final class hxx
    implements android.view.View.OnClickListener
{

    private hxw a;

    hxx(hxw hxw1)
    {
        a = hxw1;
        super();
    }

    public final void onClick(View view)
    {
        if (hxw.a(a) != null)
        {
            hxw.a(a).setText(null);
            if (hxw.a(a).requestFocus())
            {
                ((InputMethodManager)hxw.b(a).O_().getSystemService("input_method")).showSoftInput(hxw.a(a), 1);
            }
        }
    }
}
