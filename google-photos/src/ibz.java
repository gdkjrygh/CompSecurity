// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

public final class ibz
    implements omb, opv
{

    private final am a;
    private dfo b;

    public ibz(am am1, opd opd1)
    {
        a = am1;
        opd1.a(this);
    }

    public final ibz a(olm olm1)
    {
        olm1.a(ibz, this);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (dfo)olm1.a(dfo);
    }

    public final void a(Boolean boolean1)
    {
        View view = a.R;
        if (view != null)
        {
            if (boolean1.booleanValue())
            {
                boolean1 = view.getContext().getResources().getString(p.bs);
            } else
            {
                boolean1 = view.getContext().getResources().getString(p.br);
            }
            b.a(boolean1, view);
        }
    }
}
