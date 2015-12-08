// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public final class gsh
    implements emm, gpx, mti, omb, opv
{

    public static final ekk a = (new ekm()).b(gsn).a();
    public final nud b = new ntz(this);
    public boolean c;
    private mtj d;
    private noz e;
    private gpp f;
    private Context g;
    private dhk h;

    public gsh(opd opd1)
    {
        c = true;
        opd1.a(this);
    }

    static dhk a(gsh gsh1)
    {
        return gsh1.h;
    }

    static mtj b(gsh gsh1)
    {
        return gsh1.d;
    }

    private View c()
    {
        return f.a(b.tQ);
    }

    public final nud a()
    {
        return b;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        g = context;
        d = (mtj)olm1.a(mtj);
        f = (gpp)olm1.a(gpp);
        h = (dhk)olm1.a(dhk);
        e = noz.a(context, "SavePendingMedia", new String[0]);
    }

    public final void a(elb elb1)
    {
        gsn gsn1;
        boolean flag;
        try
        {
            elb1 = (ekq)elb1.a();
            gsn1 = (gsn)elb1.b(gsn);
        }
        // Misplaced declaration of an exception variable
        catch (elb elb1)
        {
            return;
        }
        if (gsn1 == null) goto _L2; else goto _L1
_L1:
        if (!gsn1.a()) goto _L2; else goto _L3
_L3:
        flag = true;
_L9:
        if (!flag) goto _L5; else goto _L4
_L4:
        c = false;
        View view = c();
        view.setVisibility(0);
        view.setOnClickListener(new gsi(this, elb1));
_L7:
        b.b();
        return;
_L5:
        c = true;
        elb1 = c();
        if (elb1 == null) goto _L7; else goto _L6
_L6:
        elb1.setVisibility(8);
          goto _L7
_L2:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void a(String s, mue mue1, mua mua)
    {
        while (mue1 == null || !"AddPendingMedia".equals(s) || !mue1.c()) 
        {
            return;
        }
        Toast.makeText(g, b.tR, 1).show();
    }

    public final boolean b()
    {
        return c;
    }

}
