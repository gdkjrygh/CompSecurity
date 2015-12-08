// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

public final class ffk
    implements fgb, omb, opv
{

    private Context a;
    private eem b;

    public ffk(opd opd1)
    {
        opd1.a(this);
    }

    public final int a(ffw ffw1)
    {
        if (ffw1 == ffw.b)
        {
            return b.b;
        } else
        {
            return 0;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = context;
        b = (eem)olm1.a(eem);
    }

    public final String b(ffw ffw1)
    {
        if (ffw1 == ffw.b)
        {
            int i = a(ffw1);
            return a.getResources().getQuantityString(b.nX, i, new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            return "";
        }
    }
}
