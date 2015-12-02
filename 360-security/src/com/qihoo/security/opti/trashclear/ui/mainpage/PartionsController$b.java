// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ProgressBar;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.opti.b.d;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            PartionsController

static class it> extends it>
{

    View a;
    LocaleTextView b;
    LocaleTextView c;
    ProgressBar d;

    private Drawable b()
    {
        return a().getResources().getDrawable(0x7f0200eb);
    }

    private Drawable c()
    {
        return a().getResources().getDrawable(0x7f0200ea);
    }

    private Drawable d()
    {
        return a().getResources().getDrawable(0x7f0200ee);
    }

    public void a(View view)
    {
        a = view;
        b = (LocaleTextView)a.findViewById(0x7f0b00ca);
        c = (LocaleTextView)a.findViewById(0x7f0b00cb);
        d = (ProgressBar)a.findViewById(0x7f0b00cc);
    }

    public void a(a a1)
    {
        int j;
        int l = 0x7f0c0058;
        d.setMax(100);
        int i = (int)(a1.b() * 100F);
        int k = i;
        if (i <= 1)
        {
            k = 1;
        }
        SpannableStringBuilder spannablestringbuilder;
        Object obj;
        if (a1.b() < 0.8F)
        {
            i = a().getResources().getColor(0x7f080056);
            d.setProgressDrawable(b());
        } else
        if (a1.b() < 0.9F)
        {
            i = a().getResources().getColor(0x7f080057);
            d.setProgressDrawable(d());
        } else
        {
            i = a().getResources().getColor(0x7f080058);
            d.setProgressDrawable(c());
        }
        j = l;
        a[a1.a.ordinal()];
        JVM INSTR tableswitch 1 3: default 112
    //                   1 116
    //                   2 327
    //                   3 334;
           goto _L1 _L2 _L3 _L4
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        j = l;
_L6:
        d.setProgress(k);
        b.setLocalText(j);
        obj = com.qihoo.security.opti.b.d.a(SecurityApplication.a(), a1.c(), true);
        spannablestringbuilder = new SpannableStringBuilder(((CharSequence) (obj)));
        spannablestringbuilder.setSpan(new ForegroundColorSpan(i), 0, ((String) (obj)).length(), 33);
        a1 = com.qihoo.security.locale.d.a().a(0x7f0c01ef, new Object[] {
            "", com.qihoo.security.opti.b.d.a(SecurityApplication.a(), a1.c, true)
        });
        obj = new SpannableStringBuilder(a1);
        ((SpannableStringBuilder) (obj)).setSpan(new ForegroundColorSpan(a().getResources().getColor(0x7f080055)), 0, a1.length(), 33);
        a1 = spannablestringbuilder.append(((CharSequence) (obj)));
        c.setLocalText(a1);
        return;
_L3:
        j = 0x7f0c0059;
        continue; /* Loop/switch isn't completed */
_L4:
        j = 0x7f0c005a;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public rtionType(Context context)
    {
        super(context);
    }
}
