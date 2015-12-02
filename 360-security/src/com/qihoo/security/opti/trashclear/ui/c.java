// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleButton;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo360.mobilesafe.b.l;
import com.qihoo360.mobilesafe.b.q;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            i

public class c extends com.qihoo.security.dialog.c
    implements android.view.View.OnClickListener
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(c c1);

        public abstract void a(c c1, boolean flag, i i1, View view);

        public abstract void b();
    }


    LocaleTextView b;
    LocaleTextView c;
    LocaleTextView d;
    LinearLayout e;
    View f;
    CheckBox g;
    boolean h;
    final a i;
    CharSequence j;
    CharSequence k;
    CharSequence l;
    List m;
    boolean n;
    Context o;
    private final i p;

    public c(Context context, i i1, a a1, boolean flag)
    {
        super(context);
        h = true;
        n = false;
        p = i1;
        i = a1;
        o = context;
        h();
        n = flag;
    }

    static i a(c c1)
    {
        return c1.p;
    }

    static void a(c c1, int i1)
    {
        c1.b(i1);
    }

    private void a(String s)
    {
        g.setText(com.qihoo.security.locale.d.a().a(0x7f0c0238));
        s = g;
        boolean flag;
        if (!h)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s.setChecked(flag);
        if (!h)
        {
            b(o.getResources().getColor(0x7f080077));
        } else
        {
            b(o.getResources().getColor(0x7f080025));
        }
        g.setOnClickListener(new android.view.View.OnClickListener() {

            final c a;

            public void onClick(View view)
            {
                boolean flag2 = a.h;
                if (a.i != null)
                {
                    c c1 = a;
                    boolean flag1;
                    if (!a.h)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    c1.h = flag1;
                    if (!a.h)
                    {
                        c.a(a, a.o.getResources().getColor(0x7f080077));
                    } else
                    {
                        c.a(a, a.o.getResources().getColor(0x7f080025));
                    }
                    a.g.setText(com.qihoo.security.locale.d.a().a(0x7f0c0238));
                    a.i.a(a, flag2, c.a(a), view);
                }
            }

            
            {
                a = c.this;
                super();
            }
        });
    }

    private void a(String s, boolean flag)
    {
        if (flag)
        {
            d.setVisibility(0);
            d.setText(Html.fromHtml((new StringBuilder()).append("<u>").append(s).append("</u>").toString()));
            d.setOnClickListener(new android.view.View.OnClickListener() {

                final c a;

                public void onClick(View view)
                {
                    if (a.i != null)
                    {
                        a.i.a();
                    }
                    a.dismiss();
                }

            
            {
                a = c.this;
                super();
            }
            });
            return;
        } else
        {
            d.setVisibility(8);
            return;
        }
    }

    private void b(int i1)
    {
        getShownButtons()[1].setTextColor(i1);
    }

    private void e()
    {
        setButtonText(new CharSequence[] {
            com.qihoo.security.locale.d.a().a(0x7f0c0214), com.qihoo.security.locale.d.a().a(0x7f0c014f)
        });
        setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener() {

                final c a;

                public void onClick(View view)
                {
                    if (a.i != null)
                    {
                        a.i.a(a);
                        a.dismiss();
                    }
                }

            
            {
                a = c.this;
                super();
            }
            }, new android.view.View.OnClickListener() {

                final c a;

                public void onClick(View view)
                {
                    a.dismiss();
                }

            
            {
                a = c.this;
                super();
            }
            }
        });
        g.setVisibility(8);
    }

    private android.widget.LinearLayout.LayoutParams f()
    {
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.bottomMargin = com.qihoo360.mobilesafe.b.l.b(getContext(), 4F);
        return layoutparams;
    }

    private LocaleTextView g()
    {
        LocaleTextView localetextview = new LocaleTextView(getContext());
        localetextview.setTextColor(getContext().getResources().getColor(0x7f080023));
        localetextview.setTextSize(0, getContext().getResources().getDimensionPixelSize(0x7f09005f));
        localetextview.setLineSpacing(com.qihoo360.mobilesafe.b.l.b(getContext(), 4F), 1.0F);
        return localetextview;
    }

    private void h()
    {
        f = j();
    }

    private void i()
    {
        setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final c a;

            public void onDismiss(DialogInterface dialoginterface)
            {
                if (a.i != null)
                {
                    a.i.b();
                }
            }

            
            {
                a = c.this;
                super();
            }
        });
        setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener() {

                final c a;

                public void onClick(View view)
                {
label0:
                    {
                        if (a.i != null)
                        {
                            if (a.h)
                            {
                                break label0;
                            }
                            q.a().a(0x7f0c0239);
                        }
                        return;
                    }
                    a.i.a(a);
                    a.dismiss();
                }

            
            {
                a = c.this;
                super();
            }
            }, new android.view.View.OnClickListener() {

                final c a;

                public void onClick(View view)
                {
                    a.dismiss();
                }

            
            {
                a = c.this;
                super();
            }
            }
        });
    }

    private View j()
    {
        View view = View.inflate(getContext(), 0x7f03003b, null);
        c = (LocaleTextView)view.findViewById(0x7f0b00cd);
        b = (LocaleTextView)view.findViewById(0x7f0b00ce);
        e = (LinearLayout)view.findViewById(0x7f0b00cf);
        g = (CheckBox)view.findViewById(0x7f0b00d1);
        d = (LocaleTextView)view.findViewById(0x7f0b00d0);
        return view;
    }

    public void a(CharSequence charsequence)
    {
        j = charsequence;
        setDialogTitle(charsequence);
    }

    public void a(CharSequence charsequence, CharSequence charsequence1)
    {
label0:
        {
            k = charsequence1;
            if (b != null)
            {
                if (charsequence1 == null)
                {
                    b.setVisibility(8);
                } else
                {
                    b.setVisibility(0);
                    b.setLocalText(charsequence1);
                }
            }
            l = charsequence;
            if (c != null)
            {
                if (charsequence != null)
                {
                    break label0;
                }
                c.setVisibility(8);
            }
            return;
        }
        c.setVisibility(0);
        c.setLocalText(charsequence);
    }

    public void a(CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, List list, CharSequence charsequence3, boolean flag, boolean flag1, 
            boolean flag2)
    {
        a(charsequence);
        a(charsequence1, charsequence2);
        a(list, flag2);
        if (flag1)
        {
            a(flag);
        } else
        {
            e();
        }
        if (!TextUtils.isEmpty(charsequence3))
        {
            a(charsequence3.toString(), true);
            return;
        } else
        {
            a(charsequence3.toString(), false);
            return;
        }
    }

    public void a(String s, String s1)
    {
        setButtonText(new CharSequence[] {
            s, s1
        });
    }

    public void a(List list, boolean flag)
    {
        m = list;
        if (e != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!flag)
        {
            e.setVisibility(8);
            return;
        }
        e.setVisibility(0);
        if (e.getChildCount() > 0)
        {
            e.removeAllViews();
        }
        if (list != null)
        {
            String s = com.qihoo.security.locale.d.a().a(0x7f0c0047);
            list = list.iterator();
            while (list.hasNext()) 
            {
                Object obj = (String)list.next();
                LocaleTextView localetextview = g();
                localetextview.setLocalText((new StringBuilder()).append(s).append(((String) (obj))).toString());
                obj = f();
                e.addView(localetextview, ((android.view.ViewGroup.LayoutParams) (obj)));
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(boolean flag)
    {
        h = flag;
        String s;
        if (flag)
        {
            s = com.qihoo.security.locale.d.a().a(0x7f0c0040);
        } else
        {
            s = com.qihoo.security.locale.d.a().a(0x7f0c0041);
        }
        d();
        a(s);
        i();
    }

    public void d()
    {
        setButtonText(new CharSequence[] {
            com.qihoo.security.locale.d.a().a(0x7f0c0214), com.qihoo.security.locale.d.a().a(0x7f0c014f)
        });
    }

    public void onClick(View view)
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(f);
    }
}
