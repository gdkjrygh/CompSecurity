// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;

public final class gdd
    implements omb, opv
{

    public gdd(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        context = (nkv)olm1.a(nkv);
        if (!((nkv) (context)).a)
        {
            context.a = true;
            olm1 = ((nkv) (context)).b.getContentResolver();
            bundle = nkw.a;
            int j = bundle.length;
            for (int i = 0; i < j; i++)
            {
                olm1.registerContentObserver(bundle[i], true, context);
            }

        }
    }
}
