// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public final class fpk
    implements nug, omb, ooi, oos, oov, opn, opv
{

    private final fpl a;
    private fpj b;

    public fpk(opd opd1, fpl fpl1)
    {
        a = fpl1;
        opd1.a(this);
    }

    public final void a()
    {
        if (b != null)
        {
            b.d.a(this);
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (fpj)olm1.b(fpj);
    }

    public final void a(View view, Bundle bundle)
    {
        if (b != null)
        {
            b.d.a(this, true);
        }
    }

    public final void b_(Bundle bundle)
    {
        if (b != null)
        {
            b.d.a(this, true);
        }
    }

    public final void b_(Object obj)
    {
        obj = (fpj)obj;
        a.a(((fpj) (obj)), ((fpj) (obj)).a);
    }

    public final void c()
    {
        if (b != null)
        {
            b.d.a(this);
        }
    }
}
