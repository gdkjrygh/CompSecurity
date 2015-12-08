// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

public final class hku
    implements dhf, omb, opv
{

    private hkv a;
    private grn b;
    private mmr c;
    private ejz d;

    public hku()
    {
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (hkv)olm1.a(hkv);
        b = (grn)olm1.a(grn);
        c = (mmr)olm1.a(mmr);
        d = (ejz)olm1.a(ejz);
    }

    public final void a(MenuItem menuitem)
    {
        Object obj = (hkh)b.b.b(hkh);
        if (obj != null) goto _L2; else goto _L1
_L1:
        boolean flag1 = true;
_L7:
        menuitem.setVisible(flag1);
        return;
_L2:
        flag1 = ((hkh) (obj)).a.a(c.g());
        if (d == null) goto _L4; else goto _L3
_L3:
        obj = d.b();
        if (obj == null) goto _L4; else goto _L5
_L5:
        obj = (hjv)((ekq) (obj)).b(hjv);
        if (obj == null || !((hjv) (obj)).a.a(c.g())) goto _L4; else goto _L6
_L6:
        boolean flag = true;
_L8:
        if (flag || flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (true) goto _L7; else goto _L4
_L4:
        flag = false;
          goto _L8
    }

    public final void b(MenuItem menuitem)
    {
        a.c();
    }
}
