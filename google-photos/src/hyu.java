// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Set;

public final class hyu
    implements omb, ood, opv
{

    private hzh a;
    private hyy b;

    public hyu(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (hzh)olm1.a(hzh);
        b = (hyy)olm1.a(hyy);
    }

    public final boolean d()
    {
        if (b.b == 3 || a.b.a.size() > 0)
        {
            a.c();
            return true;
        } else
        {
            return false;
        }
    }
}
