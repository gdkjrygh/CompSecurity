// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

// Referenced classes of package com.mixpanel.android.surveys:
//            CardCarouselLayout, b, c

private final class f
{

    final CardCarouselLayout a;
    private com.mixpanel.android.mpmetrics.nit> b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final ListView f;

    static com.mixpanel.android.mpmetrics._cls9 a(f f1)
    {
        return f1.b;
    }

    public final View a()
    {
        return c;
    }

    public final void a(com.mixpanel.android.mpmetrics._cls9 _pcls9, String s)
    {
        InputMethodManager inputmethodmanager;
        com.mixpanel.android.mpmetrics._cls9 _lcls9;
        b = _pcls9;
        d.setText(b._mth9());
        inputmethodmanager = (InputMethodManager)c.getContext().getSystemService("input_method");
        _lcls9 = _pcls9._mth9();
        if (com.mixpanel.android.mpmetrics._fld9 != _lcls9) goto _L2; else goto _L1
_L1:
        f.setVisibility(8);
        e.setVisibility(0);
        if (s != null)
        {
            e.setText(s);
        }
        if (a.getResources().getConfiguration().orientation == 1)
        {
            e.requestFocus();
            inputmethodmanager.showSoftInput(e, 0);
        } else
        {
            inputmethodmanager.hideSoftInputFromWindow(c.getWindowToken(), 0);
        }
_L4:
        c.invalidate();
        return;
_L2:
        if (com.mixpanel.android.mpmetrics.InputFromWindow != _lcls9)
        {
            break; /* Loop/switch isn't completed */
        }
        inputmethodmanager.hideSoftInputFromWindow(c.getWindowToken(), 0);
        f.setVisibility(0);
        e.setVisibility(8);
        _pcls9 = new <init>(_pcls9.nit>(), LayoutInflater.from(a.getContext()));
        f.setAdapter(_pcls9);
        f.clearChoices();
        if (s != null)
        {
            int i = 0;
            while (i < _pcls9.getCount()) 
            {
                if (_pcls9.a(i).equals(s))
                {
                    f.setItemChecked(i, true);
                }
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        throw new <init>((new StringBuilder("No way to display question type ")).append(_lcls9).toString(), (byte)0);
    }

    public (CardCarouselLayout cardcarousellayout, View view)
    {
        a = cardcarousellayout;
        super();
        c = view;
        d = (TextView)view.findViewWithTag("com_mixpanel_android_TAG_prompt_text");
        e = (EditText)view.findViewWithTag("com_mixpanel_android_TAG_text_answer");
        f = (ListView)view.findViewWithTag("com_mixpanel_android_TAG_choice_list");
        e.setText("");
        e.setOnEditorActionListener(new b(this, cardcarousellayout));
        f.setOnItemClickListener(new c(this, cardcarousellayout));
    }
}
