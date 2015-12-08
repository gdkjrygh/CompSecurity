// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public final class fiy
    implements fij, fiw, mti, omb, opp, opr, opv
{

    private final ekq a;
    private final am b;
    private Context c;
    private mtj d;
    private ibz e;
    private mmr f;
    private noz g;
    private fiu h;
    private CompoundButton i;
    private fiv j;

    public fiy(am am1, opd opd1, ekq ekq1)
    {
        a = ekq1;
        b = am1;
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = context;
        g = noz.a(context, "CollabSettingHandler", new String[0]);
        d = ((mtj)olm1.a(mtj)).a(this);
        e = (ibz)olm1.a(ibz);
        f = (mmr)olm1.a(mmr);
        h = (fiu)olm1.a(fiu);
    }

    public final void a(Switch switch1)
    {
        i = switch1;
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (!s.equals("DeleteCollectionTask"))
        {
            return;
        }
        if (mue1 != null && mue1.c())
        {
            if (g.a())
            {
                s = mue1.c;
            }
            Toast.makeText(c, b.px, 1).show();
            i.setChecked(true);
            return;
        } else
        {
            h.a((ikq)a.a(ikq));
            return;
        }
    }

    public final boolean a(boolean flag)
    {
        if (flag)
        {
            e.a(Boolean.valueOf(flag));
            return true;
        } else
        {
            j = new fiv();
            j.ad = this;
            j.a(b.h(), "StopSharingFragmentTag");
            return false;
        }
    }

    public final void al_()
    {
        j = (fiv)b.h().a("StopSharingFragmentTag");
        if (j != null)
        {
            j.ad = this;
        }
    }

    public final void am_()
    {
        if (j != null)
        {
            j.ad = null;
            j = null;
        }
    }

    public final void c()
    {
        i.setChecked(false);
        e.a(Boolean.valueOf(false));
        Object obj = ((hpe)a.a(hpe)).a.a;
        obj = new ihh(f.d(), ((String) (obj)));
        d.b(((mtf) (obj)));
    }
}
