// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class dyo
    implements dup, omb
{

    private Context a;
    private dyq b;

    dyo()
    {
    }

    public final hgo a(dum dum)
    {
        if (b == null)
        {
            b = new dyq(a, dum);
        }
        return b;
    }

    public final void a(Context context, olm olm, Bundle bundle)
    {
        a = context;
    }

    public final void a(olm olm)
    {
    }

    public final hhg b()
    {
        return new dwm();
    }
}
