// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

final class dee
{

    Context a;
    dhu b;
    final int c;
    final dfw d;
    final Picasso e;
    private ViewGroup f;

    public dee(deg deg1, boolean flag, Picasso picasso)
    {
        a = deg1.a;
        f = deg1.c;
        c = gcg.b(a, 0x7f0f0080);
        d = new dfw(f, gcg.a(a, 0x7f02018e), gcg.b(a, 0x7f0f0035));
        if (flag)
        {
            b = dhv.g(a, f);
        } else
        {
            b = dhv.e(a, f);
        }
        f.addView(((dcn) (b)).a);
        e = picasso;
    }

    static void a(TextView textview)
    {
        textview.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
        textview.setMarqueeRepeatLimit(-1);
        textview.setSelected(true);
    }
}
