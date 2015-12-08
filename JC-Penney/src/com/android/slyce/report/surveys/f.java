// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.surveys;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.android.slyce.report.mpmetrics.bf;
import com.android.slyce.report.mpmetrics.bg;

// Referenced classes of package com.android.slyce.report.surveys:
//            g, h, CardCarouselLayout, c, 
//            j

class f
{

    final CardCarouselLayout a;
    private bf b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final ListView f;

    public f(CardCarouselLayout cardcarousellayout, View view)
    {
        a = cardcarousellayout;
        super();
        c = view;
        d = (TextView)view.findViewWithTag("com_mixpanel_android_TAG_prompt_text");
        e = (EditText)view.findViewWithTag("com_mixpanel_android_TAG_text_answer");
        f = (ListView)view.findViewWithTag("com_mixpanel_android_TAG_choice_list");
        e.setText("");
        e.setOnEditorActionListener(new g(this, cardcarousellayout));
        f.setOnItemClickListener(new h(this, cardcarousellayout));
    }

    static bf a(f f1)
    {
        return f1.b;
    }

    public View a()
    {
        return c;
    }

    public void a(bf bf1, String s)
    {
        InputMethodManager inputmethodmanager;
        bg bg1;
        b = bf1;
        d.setText(b.b());
        inputmethodmanager = (InputMethodManager)c.getContext().getSystemService("input_method");
        bg1 = bf1.d();
        if (bg.c != bg1) goto _L2; else goto _L1
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
        if (bg.b != bg1)
        {
            break; /* Loop/switch isn't completed */
        }
        inputmethodmanager.hideSoftInputFromWindow(c.getWindowToken(), 0);
        f.setVisibility(0);
        e.setVisibility(8);
        bf1 = new c(bf1.c(), LayoutInflater.from(a.getContext()));
        f.setAdapter(bf1);
        f.clearChoices();
        if (s != null)
        {
            int i = 0;
            while (i < bf1.getCount()) 
            {
                if (bf1.a(i).equals(s))
                {
                    f.setItemChecked(i, true);
                }
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        throw new j((new StringBuilder()).append("No way to display question type ").append(bg1).toString(), null);
    }
}
