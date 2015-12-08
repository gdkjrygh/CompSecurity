// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Service;
import android.database.Cursor;

final class ggs extends ggq
    implements gfk
{

    private gfi b;

    private ggs(Service service)
    {
        super((byte)0);
        b = new gfi(service, this);
    }

    ggs(Service service, byte byte0)
    {
        this(service);
    }

    public final void a(gfi gfi1, Cursor cursor)
    {
        a(cursor);
    }

    public final void a(String s, ggt ggt)
    {
        super.a(s, ggt);
        b.a(c(), ggq.a);
    }

    public final void b()
    {
        super.b();
        if (b != null)
        {
            b.b();
            b = null;
        }
    }
}
