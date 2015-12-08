// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;

class ddo extends dde
    implements ddl
{

    private TextView b;
    private TextView c;
    private boolean d;

    public ddo(View view)
    {
        super(view);
        b = (TextView)view.findViewById(0x1020014);
        c = (TextView)view.findViewById(0x1020015);
    }

    private void c(boolean flag)
    {
        d = flag;
        int i;
        if (flag)
        {
            i = 0x7f0101dc;
        } else
        {
            i = 0x7f0101d8;
        }
        dgo.b(super.a.getContext(), c, i);
    }

    public final void a(CharSequence charsequence)
    {
        b.setText(charsequence);
    }

    public final void b(CharSequence charsequence)
    {
        if (d)
        {
            c(false);
        }
        c.setText(charsequence);
    }

    public final TextView c()
    {
        return b;
    }

    public final void c(CharSequence charsequence)
    {
        if (!d)
        {
            c(true);
        }
        c.setText(charsequence);
    }

    public final TextView d()
    {
        return c;
    }
}
