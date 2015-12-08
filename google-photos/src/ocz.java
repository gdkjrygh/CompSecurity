// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class ocz
    implements mrw
{

    ocz()
    {
    }

    public final String a(Context context)
    {
        int i;
        mmr mmr1 = (mmr)olm.b(context, mmr);
        if (mmr1 == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        i = mmr1.d();
        if (-1 == i)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        context = ((mmv)olm.a(context, mmv)).a(i).b("account_name");
        return context;
        context;
        return null;
    }
}
