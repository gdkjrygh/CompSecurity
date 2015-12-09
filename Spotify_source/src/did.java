// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.widget.TextView;

class did
    implements dia
{

    private Context a;
    private TextView b;
    private TextView c;
    private boolean d;

    public did(Context context, View view)
    {
        a = context;
        b = (TextView)view.findViewById(0x1020014);
        c = (TextView)view.findViewById(0x1020015);
    }

    private void a(boolean flag)
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
        dgo.b(a, c, i);
    }

    public TextView a()
    {
        return b;
    }

    public void a(CharSequence charsequence)
    {
        b.setText(charsequence);
    }

    public TextView b()
    {
        return c;
    }

    public void b(CharSequence charsequence)
    {
        if (d)
        {
            a(false);
        }
        c.setText(charsequence);
    }

    public void c(CharSequence charsequence)
    {
        if (!d)
        {
            a(true);
        }
        c.setText(charsequence);
    }
}
