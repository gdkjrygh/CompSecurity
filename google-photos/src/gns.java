// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class gns
{

    gnu a;
    private final Bundle b = new Bundle();

    gns()
    {
    }

    public final gnk a()
    {
        gnk gnk1 = new gnk();
        gnk1.f(b);
        gnk1.a = a;
        return gnk1;
    }

    public final gns a(ekp ekp)
    {
        b.putParcelable("arg.pager.exit_media", ekp);
        return this;
    }

    public final gns a(gnt gnt)
    {
        b.putSerializable("arg.pager.direction", gnt);
        return this;
    }

    public final gns b(ekp ekp)
    {
        b.putParcelable("arg.pager.enter_media", ekp);
        return this;
    }
}
