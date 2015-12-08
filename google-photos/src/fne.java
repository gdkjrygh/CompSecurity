// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class fne
    implements hyk
{

    private ekp a;
    private fnd b;

    fne(fnd fnd1, ekp ekp)
    {
        b = fnd1;
        a = ekp;
        super();
    }

    public final void a(View view)
    {
        if (view == null)
        {
            b.a(new IllegalStateException("Thumbnail view for created manual awesome not found."));
            return;
        } else
        {
            fnd.b(b).a(a, view, fnd.a(b).t());
            return;
        }
    }
}
