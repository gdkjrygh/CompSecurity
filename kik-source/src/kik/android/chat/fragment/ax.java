// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

// Referenced classes of package kik.android.chat.fragment:
//            KikAddContactFragment

final class ax
    implements android.widget.TextView.OnEditorActionListener
{

    long a;
    final KikAddContactFragment b;

    ax(KikAddContactFragment kikaddcontactfragment)
    {
        b = kikaddcontactfragment;
        super();
        a = 0L;
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if ((i == 2 || keyevent.getKeyCode() == 66) && System.currentTimeMillis() - 500L > a && KikAddContactFragment.a(b).getText().toString().matches(b.getString(0x7f0901ee)))
        {
            KikAddContactFragment.b(b);
            ((InputMethodManager)KikAddContactFragment.c(b).getSystemService("input_method")).hideSoftInputFromWindow(textview.getWindowToken(), 0);
            a = System.currentTimeMillis();
        }
        return true;
    }
}
