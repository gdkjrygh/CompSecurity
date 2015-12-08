// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class esr
    implements ngs
{

    private final Context a;
    private final mmv b;
    private final mvh c;

    public esr(Context context)
    {
        a = context;
        b = (mmv)olm.a(context, mmv);
        c = (mvh)olm.a(context, mvh);
    }

    public final void a(int i)
    {
        if (b.a(i).c("logged_out"))
        {
            mvq mvq1 = (mvq)c.b(a, i);
            nlm.a(a, i);
            mvq1.a();
        }
    }
}
