// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

public final class enw
    implements dhf, emm, omb, opv
{

    private static final ekk a = (new ekm()).b(gsn).a();
    private final am b;
    private Context c;
    private mmr d;
    private ekb e;
    private dha f;
    private eol g;
    private noz h;
    private ekq i;

    public enw(am am1)
    {
        b = am1;
    }

    public static void a(ekq ekq1, eml eml1)
    {
        eml1.a(ekq1, a);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = context;
        d = (mmr)olm1.a(mmr);
        e = (ekb)olm1.a(ekb);
        f = (dha)olm1.a(dha);
        g = new eol(context, s.i);
        h = noz.a(context, "AddToAlbumHandler", new String[0]);
    }

    public final void a(MenuItem menuitem)
    {
        if (!d.e() || i == null) goto _L2; else goto _L1
_L1:
        gsn gsn1 = (gsn)i.b(gsn);
        if (gsn1 != null && gsn1.a()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        menuitem.setVisible(flag);
        return;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(elb elb1)
    {
        try
        {
            i = (ekq)elb1.a();
            f.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (elb elb1)
        {
            return;
        }
    }

    public final void b(MenuItem menuitem)
    {
        menuitem = new eoc(c, d.d());
        menuitem.b = true;
        menuitem.a = true;
        menuitem.c = e.a();
        menuitem = menuitem.a();
        g.a(b.O_(), menuitem);
    }

}
