// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;

public final class nsc
    implements nto
{

    public nsc()
    {
    }

    public final Object a()
    {
        return "com.google.android.libraries.social.notifications.impl.SYNC_REGISTRATION_STATUS";
    }

    public final void a(Intent intent, Context context)
    {
        boolean flag1;
        boolean flag = intent.getBooleanExtra("force_gcm_registration", false);
        flag1 = intent.getBooleanExtra("force_clean_slate", false);
        ((nqn)olm.a(context, nqn)).a(flag);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        nql nql1 = (nql)olm.a(context, nql);
        int i;
        for (context = ((mmv)olm.a(context, mmv)).a().iterator(); context.hasNext(); nql1.a(i, nqk.a, nqx.c))
        {
            i = ((Integer)context.next()).intValue();
            nql1.b(i);
        }

        break MISSING_BLOCK_LABEL_128;
        context;
        ez.a(intent);
        throw context;
        ez.a(intent);
        return;
    }
}
