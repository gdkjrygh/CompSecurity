// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;

public final class fpi
    implements nug, opp, opr, opv
{

    private final fph a;
    private final Context b;

    public fpi(fph fph1, opd opd1, Context context)
    {
        a = fph1;
        opd1.a(this);
        b = context;
    }

    public final void al_()
    {
        ((fpj)olm.a(b, fpj)).d.a(this, true);
    }

    public final void am_()
    {
        ((fpj)olm.a(b, fpj)).d.a(this);
    }

    public final void b_(Object obj)
    {
        obj = ((fpj)obj).a;
        fph fph1 = a;
        int i = ((Rect) (obj)).left;
        i = ((Rect) (obj)).top;
        fph1.a(((Rect) (obj)).right, ((Rect) (obj)).bottom);
    }
}
