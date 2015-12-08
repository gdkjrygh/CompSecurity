// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

public final class fho
    implements omb, opv
{

    public static final ekk a = (new ekm()).b(ikw).b(iks).a();
    public final am b;
    public fpj c;
    public ifj d;
    public mmr e;
    public int f;
    public boolean g;

    public fho(am am1, opd opd1)
    {
        b = am1;
        opd1.a(this);
    }

    public void a()
    {
        android.view.View view = b.R;
        if (view != null)
        {
            mk.u(view);
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        f = context.getResources().getDimensionPixelSize(b.oN);
        d = (ifj)olm1.a(ifj);
        e = (mmr)olm1.a(mmr);
        c = (fpj)olm1.a(fpj);
    }

}
