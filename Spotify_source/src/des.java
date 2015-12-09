// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;

class des extends dem
    implements dep
{

    private TextView a;

    des(View view)
    {
        super(view);
        a = (TextView)view.findViewById(0x1020015);
    }

    public final TextView b()
    {
        return a;
    }

    public final void b(CharSequence charsequence)
    {
        a.setText(charsequence);
    }
}
