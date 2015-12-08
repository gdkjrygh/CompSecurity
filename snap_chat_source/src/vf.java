// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.NetworkInfo;
import com.snapchat.android.discover.model.DSnapPage;

public final class vf
    implements vd
{

    private final Cl a;
    private final vi b;
    private final vh c;

    public vf()
    {
        this(Cl.a(), new vi(), new vh());
    }

    private vf(Cl cl, vi vi1, vh vh1)
    {
        a = cl;
        c = vh1;
        b = vi1;
    }

    public final boolean a(uR ur, DSnapPage dsnappage, Cj.a a1)
    {
        NetworkInfo networkinfo = a.b();
        if (networkinfo == null)
        {
            return false;
        }
        if (networkinfo.getType() == 1)
        {
            return b.a(ur, dsnappage, a1);
        } else
        {
            return c.a(ur, dsnappage, a1);
        }
    }
}
