// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

class dks
{

    final gui a;
    final hdu b;
    final ekk c = (new ekm()).a(gui.a()).a(guk.a()).a(guh.a()).a();
    private final guk d;
    private final guh e;

    dks(Context context)
    {
        b = (hdu)olm.a(context, hdu);
        a = new gui(context);
        d = new guk(context);
        e = new guh(context);
    }

    public final hpk a(gue gue1, Context context)
    {
        Object obj;
        try
        {
            obj = (String)d.a(gue1).a();
            hpm hpm1 = new hpm();
            hpm1.d = ((String) (obj));
            obj = hpm1.a();
            gue1 = gue1.b;
            ((dle)b.a(context, dle, gue1)).a(gue1, ((hpk) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (gue gue1)
        {
            throw new eke("Failed to save the edited remote media", new bjg(((eke) (gue1)).a));
        }
        return ((hpk) (obj));
    }
}
