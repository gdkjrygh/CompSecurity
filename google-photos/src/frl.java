// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class frl
    implements android.view.View.OnLongClickListener
{

    private frn a;
    private fro b;
    private frj c;

    frl(frj frj, frn frn1, fro fro1)
    {
        c = frj;
        a = frn1;
        b = fro1;
        super();
    }

    public final boolean onLongClick(View view)
    {
        return a.a(b.o);
    }
}
