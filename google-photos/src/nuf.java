// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public class nuf
    implements omb, opt, opu, opv
{

    public boolean a;
    private final Class b;
    private final nug c;
    private nud d;

    public nuf(opd opd1, Class class1, nug nug)
    {
        b = class1;
        c = nug;
        opd1.a(this);
    }

    public final void V_()
    {
        d.a(c);
    }

    public final void X_()
    {
        d.a(c, a);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = ((nuc)olm1.a(b)).a();
    }
}
