// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;

final class ddg extends dde
    implements ddf
{

    private final TextView b;

    public ddg(View view)
    {
        super(view);
        b = (TextView)view.findViewById(0x1020014);
    }

    public final void a(int i)
    {
        b.setMaxLines(i);
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
