// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;

public final class huf
    implements hgo
{

    final hrr a;
    final huh b;
    private final int c;
    private final hrs d;
    private final int e;
    private String f;
    private final ForegroundColorSpan g;

    public huf(Context context, hrr hrr1, int i, int j)
    {
        a = hrr1;
        c = i;
        f = hrr1.aq_();
        e = j;
        d = (hrs)olm.a(context, hrs);
        b = (huh)olm.a(context, huh);
        g = new ForegroundColorSpan(context.getResources().getColor(aa.I));
    }

    public final int a()
    {
        return au.D;
    }

    public final int a(int i)
    {
        return i;
    }

    public final void a(afn afn)
    {
        afn = (hui)afn;
        Object obj = a.as_();
        d.a(((hui) (afn)).p, ((String) (obj)), c);
        ((hui) (afn)).p.setContentDescription(a.c());
        obj = ((hui) (afn)).o;
        Object obj1 = a;
        int i = ((hrr) (obj1)).c().toLowerCase(Locale.getDefault()).indexOf(f.toLowerCase(Locale.getDefault()));
        int j = f.length();
        obj1 = new SpannableString(((hrr) (obj1)).c());
        if (i >= 0)
        {
            ((Spannable) (obj1)).setSpan(g, i, i + j, 17);
        }
        ((TextView) (obj)).setText(((CharSequence) (obj1)));
        ((hui) (afn)).a.setOnClickListener(new msj(new hug(this)));
        b.a(((hui) (afn)).a, new ogr(pwy.b, e));
    }

    public final int b(int i)
    {
        return 0;
    }

    public final long b()
    {
        return 0L;
    }
}
