// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

final class npz
    implements npw
{

    private final List a;

    npz(Context context)
    {
        a = olm.c(context, npx);
    }

    public final void a(npy npy)
    {
        int j = a.size();
        for (int i = 0; i < j; i++)
        {
            ((npx)a.get(i)).a(npy);
        }

    }
}
