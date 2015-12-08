// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;

public final class ong
    implements oor, opl, opn, opv
{

    private final onc a;
    private Activity b;

    public ong(opd opd1, onc onc)
    {
        a = onc;
        opd1.a(this);
    }

    public final void a(Activity activity)
    {
        b = activity;
    }

    public final void a(Bundle bundle)
    {
        one.a(b, a);
    }

    public final void c()
    {
        one.b(b, a);
    }
}
