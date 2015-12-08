// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;

class dem
    implements del
{

    private View a;
    private TextView b;

    dem(View view)
    {
        a = view;
        b = (TextView)view.findViewById(0x1020014);
    }

    public final View a()
    {
        return a;
    }

    public final void a(CharSequence charsequence)
    {
        b.setText(charsequence);
    }
}
