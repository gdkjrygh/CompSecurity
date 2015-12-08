// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class eoo
    implements android.view.View.OnClickListener
{

    private eop a;
    private eon b;

    eoo(eon eon1, eop eop1)
    {
        b = eon1;
        a = eop1;
        super();
    }

    public final void onClick(View view)
    {
        a.a(b.a);
    }
}
