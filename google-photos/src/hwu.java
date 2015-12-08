// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

public final class hwu
    implements hgo
{

    final hsw a;
    final Context b;
    private final boolean c;
    private final hya d;

    public hwu(Context context, hsw hsw1, boolean flag)
    {
        b = context;
        a = hsw1;
        c = flag;
        d = (hya)olm.a(context, hya);
    }

    public final int a()
    {
        return c.eT;
    }

    public final int a(int i)
    {
        return i;
    }

    public final void a(afn afn1)
    {
        Object obj = afn1.a;
        afn1 = (hww)olm.a(((View) (obj)).getContext(), hww);
        TextView textview = (TextView)((View) (obj)).findViewById(c.eQ);
        obj = (TextView)((View) (obj)).findViewById(c.eR);
        if (a.b())
        {
            textview.setText(b.getResources().getString(a.j));
        }
        if (!c)
        {
            ((TextView) (obj)).setVisibility(8);
        } else
        {
            ((TextView) (obj)).setVisibility(0);
        }
        ((TextView) (obj)).setOnClickListener(new hwv(this, afn1));
    }

    public final int b(int i)
    {
        return 0;
    }

    public final long b()
    {
        return (long)a.ordinal();
    }
}
