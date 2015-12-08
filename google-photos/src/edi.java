// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class edi
    implements dwg
{

    private ich a;
    private edg b;

    edi(edg edg1, ich ich)
    {
        b = edg1;
        a = ich;
        super();
    }

    public final void a(Context context)
    {
        context = b.a;
        context.a(a);
        dgg dgg1 = ((icf) (context)).e.a().a(icf.a);
        dgg1.d = ((icf) (context)).b.getString(p.bo);
        dgg1 = dgg1.a(((icf) (context)).b.getString(p.be), new icg(context));
        ((icf) (context)).e.a(dgg1.a());
    }
}
