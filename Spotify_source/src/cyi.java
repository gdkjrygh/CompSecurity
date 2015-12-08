// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.mixpanel.android.surveys.CardCarouselLayout;

public final class cyi
{

    cyb a;
    public final View b;
    final CardCarouselLayout c;
    private final TextView d;
    private final TextView e;
    private final ListView f;

    public cyi(CardCarouselLayout cardcarousellayout, View view)
    {
        c = cardcarousellayout;
        super();
        b = view;
        d = (TextView)view.findViewWithTag("com_mixpanel_android_TAG_prompt_text");
        e = (EditText)view.findViewWithTag("com_mixpanel_android_TAG_text_answer");
        f = (ListView)view.findViewWithTag("com_mixpanel_android_TAG_choice_list");
        e.setText("");
        e.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            private cyi a;

            public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                boolean flag1 = false;
                boolean flag;
                if (keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 0 && (keyevent.getFlags() & 0x20) == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag || i == 6)
                {
                    textview.clearComposingText();
                    if (CardCarouselLayout.a(a.c) != null)
                    {
                        textview = textview.getText().toString();
                        CardCarouselLayout.a(a.c).a(a.a, textview);
                    }
                    flag1 = true;
                }
                return flag1;
            }

            
            {
                a = cyi.this;
                super();
            }
        });
        f.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final cyi a;

            public final void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                if (CardCarouselLayout.a(a.c) != null)
                {
                    adapterview = adapterview.getItemAtPosition(i).toString();
                    a.c.postDelayed(new Runnable(this, adapterview) {

                        private String a;
                        private _cls2 b;

                        public final void run()
                        {
                            CardCarouselLayout.a(b.a.c).a(b.a.a, a);
                        }

            
            {
                b = _pcls2;
                a = s;
                super();
            }
                    }, 165L);
                }
            }

            
            {
                a = cyi.this;
                super();
            }
        });
    }

    public final void a(cyb cyb1, String s)
    {
        InputMethodManager inputmethodmanager;
        com.mixpanel.android.mpmetrics.Survey.QuestionType questiontype;
        a = cyb1;
        d.setText(a.b);
        inputmethodmanager = (InputMethodManager)b.getContext().getSystemService("input_method");
        questiontype = cyb1.a();
        if (com.mixpanel.android.mpmetrics.Survey.QuestionType.c != questiontype) goto _L2; else goto _L1
_L1:
        f.setVisibility(8);
        e.setVisibility(0);
        if (s != null)
        {
            e.setText(s);
        }
        if (c.getResources().getConfiguration().orientation == 1)
        {
            e.requestFocus();
            inputmethodmanager.showSoftInput(e, 0);
        } else
        {
            inputmethodmanager.hideSoftInputFromWindow(b.getWindowToken(), 0);
        }
_L4:
        b.invalidate();
        return;
_L2:
        if (com.mixpanel.android.mpmetrics.Survey.QuestionType.b != questiontype)
        {
            break; /* Loop/switch isn't completed */
        }
        inputmethodmanager.hideSoftInputFromWindow(b.getWindowToken(), 0);
        f.setVisibility(0);
        e.setVisibility(8);
        cyb1 = new cyg(cyb1.c, LayoutInflater.from(c.getContext()));
        f.setAdapter(cyb1);
        f.clearChoices();
        if (s != null)
        {
            int i = 0;
            while (i < cyb1.getCount()) 
            {
                if (cyb1.a(i).equals(s))
                {
                    f.setItemChecked(i, true);
                }
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        throw new com.mixpanel.android.surveys.CardCarouselLayout.UnrecognizedAnswerTypeException((new StringBuilder("No way to display question type ")).append(questiontype).toString(), (byte)0);
    }
}
