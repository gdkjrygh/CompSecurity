// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.List;

public final class mut
    implements omb, omz, opv
{

    private final mus a;
    private muq b;

    public mut(opd opd1, mus mus)
    {
        a = mus;
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (muq)olm1.b(muq);
        ((omx)olm1.a(omx)).a(this);
    }

    public final void a(boolean flag)
    {
label0:
        {
            if (b != null)
            {
                if (!flag)
                {
                    break label0;
                }
                muq muq1 = b;
                mus mus = a;
                if (muq1.a.contains(mus))
                {
                    throw new IllegalStateException("BackNavigationHandler already on stack.");
                }
                muq1.a.add(mus);
            }
            return;
        }
        muq muq2 = b;
        mus mus1 = a;
        muq2.a.remove(mus1);
    }
}
