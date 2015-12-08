// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;

class dhz
    implements dhw
{

    private final TextView a;

    public dhz(View view)
    {
        a = (TextView)view.findViewById(0x1020014);
    }

    public final TextView a()
    {
        return a;
    }

    public final void a(CharSequence charsequence)
    {
        a.setText(charsequence);
    }
}
