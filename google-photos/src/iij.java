// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

final class iij
    implements abk
{

    private Context a;
    private View b;
    private ekq c;
    private iig d;

    iij(iig iig1, Context context, View view, ekq ekq)
    {
        d = iig1;
        a = context;
        b = view;
        c = ekq;
        super();
    }

    public final boolean a(MenuItem menuitem)
    {
        iim iim1 = (iim)olm.a(a, iim);
        if (menuitem.getItemId() == ce.q)
        {
            iig.a(d, b, pwr.f);
            iim1.c(c);
            return true;
        }
        if (menuitem.getItemId() == ce.o)
        {
            iig.a(d, b, pwz.c);
            iim1.d(c);
            return true;
        } else
        {
            menuitem = String.valueOf(menuitem.getTitle());
            Log.e("SharedLinkAdapterItem", (new StringBuilder(String.valueOf(menuitem).length() + 37)).append("Unknown Popup Menu Item encountered: ").append(menuitem).toString());
            return false;
        }
    }
}
