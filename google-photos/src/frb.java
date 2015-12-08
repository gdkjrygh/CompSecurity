// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class frb
    implements android.view.View.OnClickListener
{

    private final long a;
    private fra b;

    public frb(fra fra1, long l)
    {
        b = fra1;
        super();
        a = l;
    }

    public final void onClick(View view)
    {
        view.setClickable(false);
        if (fra.a(b).a(a))
        {
            fra.b(b).b(a);
            return;
        } else
        {
            fra.b(b).a(a);
            return;
        }
    }
}
