// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class iih
    implements android.view.View.OnClickListener
{

    private Context a;
    private iig b;

    iih(iig iig1, Context context)
    {
        b = iig1;
        a = context;
        super();
    }

    public final void onClick(View view)
    {
        ((iim)olm.a(a, iim)).b(b.a);
    }
}
