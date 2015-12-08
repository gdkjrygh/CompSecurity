// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class fxw
    implements android.view.View.OnClickListener
{

    private Context a;
    private fxv b;

    fxw(fxv fxv1, Context context)
    {
        b = fxv1;
        a = context;
        super();
    }

    public final void onClick(View view)
    {
        ((fxx)olm.a(a, fxx)).b(b.a);
    }
}
