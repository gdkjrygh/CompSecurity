// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;

public class b extends com.qihoo.security.dialog.b
    implements android.view.View.OnClickListener
{
    public static interface a
    {

        public abstract void a(b b1);
    }


    LocaleTextView b;
    View c;
    final a d;
    CharSequence e;
    CharSequence f;

    public b(Context context, a a1)
    {
        super(context);
        d = a1;
        d();
    }

    private void d()
    {
        c = f();
    }

    private void e()
    {
        setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener() {

                final b a;

                public void onClick(View view)
                {
                    if (a.d != null)
                    {
                        a.d.a(a);
                    }
                }

            
            {
                a = b.this;
                super();
            }
            }, new android.view.View.OnClickListener() {

                final b a;

                public void onClick(View view)
                {
                    a.dismiss();
                }

            
            {
                a = b.this;
                super();
            }
            }
        });
    }

    private View f()
    {
        View view = View.inflate(getContext(), 0x7f030034, null);
        b = (LocaleTextView)view.findViewById(0x7f0b00c2);
        return view;
    }

    public void a(CharSequence charsequence)
    {
        e = charsequence;
        setDialogTitle(charsequence);
    }

    public void a(CharSequence charsequence, CharSequence charsequence1, boolean flag)
    {
        a(charsequence);
        b(charsequence1);
        a(flag);
    }

    public void a(String s, String s1)
    {
        setButtonText(new CharSequence[] {
            s, s1
        });
    }

    public void a(boolean flag)
    {
        b(flag);
        e();
    }

    public void b(CharSequence charsequence)
    {
        f = charsequence;
        if (b != null)
        {
            b.setLocalText(charsequence);
        }
    }

    public void b(boolean flag)
    {
        String s;
        if (flag)
        {
            s = com.qihoo.security.locale.d.a().a(0x7f0c022e);
        } else
        {
            s = com.qihoo.security.locale.d.a().a(0x7f0c022e);
        }
        setButtonText(new CharSequence[] {
            s, com.qihoo.security.locale.d.a().a(0x7f0c014f)
        });
    }

    public void onClick(View view)
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(c);
    }
}
