// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;

final class dzb
    implements ngs
{

    private final mmv a;
    private final nql b;

    dzb(Context context)
    {
        b = (nql)olm.a(context, nql);
        a = (mmv)olm.a(context, mmv);
    }

    public final void a(int i)
    {
        if (!a.a(i).a())
        {
            nqv nqv1 = b.b(i);
            if (nqv1.a != nqw.a && Log.isLoggable("AssistantGunsDataDelete", 6))
            {
                Log.e("AssistantGunsDataDelete", "Couldn't delete guns data on log out", nqv1.b);
            }
        }
    }
}
