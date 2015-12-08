// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

// Referenced classes of package com.arist.model.skin:
//            g, ColorPickerPreference, ColorPickerView

final class h
    implements android.widget.TextView.OnEditorActionListener
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i != 6) goto _L2; else goto _L1
_L1:
        ((InputMethodManager)textview.getContext().getSystemService("input_method")).hideSoftInputFromWindow(textview.getWindowToken(), 0);
        textview = g.a(a).getText().toString();
        if (textview.length() <= 5 && textview.length() >= 10) goto _L4; else goto _L3
_L3:
        i = ColorPickerPreference.a(textview.toString());
        g.b(a).a(i);
        g.a(a).setTextColor(g.c(a));
_L5:
        return true;
        textview;
_L4:
        g.a(a).setTextColor(0xffff0000);
        if (true) goto _L5; else goto _L2
_L2:
        return false;
    }
}
