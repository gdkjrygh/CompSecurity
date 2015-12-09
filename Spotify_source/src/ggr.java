// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;

final class ggr extends ggq
    implements an
{

    private Activity b;
    private am c;

    private ggr(Activity activity, am am1)
    {
        super((byte)0);
        b = activity;
        c = am1;
    }

    ggr(Activity activity, am am1, byte byte0)
    {
        this(activity, am1);
    }

    public final da a(Bundle bundle)
    {
        return new cu((Context)ctz.a(b), c(), ggq.a, null, null);
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((Cursor)obj);
    }

    public final void a(String s, ggt ggt)
    {
        super.a(s, ggt);
        if (b != null)
        {
            c.a(0x7f1100ae, null, this);
        }
    }

    public final void b()
    {
        super.b();
        c.a(0x7f1100ae);
        b = null;
    }
}
