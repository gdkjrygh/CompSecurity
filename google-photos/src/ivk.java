// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;

public final class ivk
    implements hgo
{

    public boolean a;
    private Context b;
    private TextView c;
    private final long d;
    private final String e;

    public ivk(Context context, long l, String s)
    {
        a = true;
        b = context;
        d = l;
        e = s;
    }

    public final int a()
    {
        return cn.E;
    }

    public final int a(int i)
    {
        return i;
    }

    public final void a(afn afn1)
    {
        c = (TextView)afn1.a;
        c.setText(e);
        c();
        c.setOnClickListener(new ivl(this));
    }

    public final int b(int i)
    {
        return 0;
    }

    public final long b()
    {
        return d;
    }

    public void c()
    {
        int i;
        if (a)
        {
            i = c.fo;
        } else
        {
            i = c.fp;
        }
        if (c != null)
        {
            c.setTextColor(b.getResources().getColor(i));
        }
    }
}
