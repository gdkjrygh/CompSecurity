// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

public final class hhr
    implements mti, omb, opv
{

    public final ar a;
    public mtj b;
    public mmr c;

    public hhr(ar ar1, opd opd1)
    {
        a = ar1;
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (mmr)olm1.a(mmr);
        b = (mtj)olm1.a(mtj);
        b.a(this);
    }

    public final void a(String s, mue mue1, mua mua1)
    {
        if (TextUtils.equals(s, "RemoveCollectionTask"))
        {
            mua1.a(s);
            if (mue1.c())
            {
                if (!nuo.a(a, mue1, nup.n))
                {
                    Toast.makeText(a, a.getString(b.vT), 1).show();
                    return;
                }
            } else
            {
                a.finish();
                return;
            }
        }
    }
}
