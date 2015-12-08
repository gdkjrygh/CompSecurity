// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;

class ddk extends dde
    implements ddh
{

    private final TextView b;

    public ddk(View view)
    {
        super(view);
        b = (TextView)view.findViewById(0x1020014);
    }

    public final void a(CharSequence charsequence)
    {
        b.setText(charsequence);
    }

    public final TextView c()
    {
        return b;
    }
}
