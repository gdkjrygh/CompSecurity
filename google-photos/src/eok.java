// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

public final class eok
    implements dhf, omb, opv
{

    private final am a;
    private Context b;
    private mmr c;
    private eol d;
    private ekq e;

    public eok(am am1)
    {
        a = am1;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = context;
        c = (mmr)olm1.a(mmr);
        d = new eol(context, s.i);
        context = (ejz)olm1.b(ejz);
        if (context != null)
        {
            e = context.b();
        }
    }

    public final void a(MenuItem menuitem)
    {
        menuitem.setVisible(c.e());
    }

    public final void b(MenuItem menuitem)
    {
        menuitem = new eoc(b, c.d());
        if (e != null)
        {
            menuitem.d = new epd(e);
        }
        d.a(a.O_(), menuitem.a());
    }
}
