// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import java.util.Collections;
import java.util.List;

final class ief
    implements mpj, omb, opl, ops, opv
{

    private static final msm b;
    ejn a;
    private final am c;
    private final igy d;
    private Context e;
    private mpk f;
    private myf g;
    private mmr h;
    private iek i;
    private ihk j;

    ief(am am1, opd opd1, igy igy1)
    {
        c = am1;
        d = igy1;
        opd1.a(this);
    }

    public final void a(int k, Intent intent)
    {
        mry.a(e, 4, (new msn()).a(new msm(pwt.u)).a(b));
        intent = c.O_();
        Intent intent1 = new Intent();
        intent1.putExtra("share_details", j);
        intent.setResult(-1, intent1);
        intent.finish();
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        e = context;
        f = (mpk)olm1.a(mpk);
        f.a(ce.i, this);
        a = (ejn)olm1.a(ejn);
        g = (myf)olm1.a(myf);
        h = (mmr)olm1.a(mmr);
        i = (iek)olm1.a(iek);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            j = (ihk)bundle.getParcelable("share_details");
        }
    }

    void a(ifc ifc1, Intent intent)
    {
        String s1 = intent.getExtras().getString("android.intent.extra.TEXT", "");
        int k = h.d();
        String s = s1;
        if (h.e())
        {
            s = s1;
            if (g.a(ife.a, k))
            {
                s = s1;
                if (iek.b(ifc1))
                {
                    ifc1 = s1;
                    if (!s1.isEmpty())
                    {
                        ifc1 = String.valueOf(s1).concat(" ");
                    }
                    ifc1 = String.valueOf(ifc1);
                    s = String.valueOf(ife.a());
                    if (s.length() != 0)
                    {
                        s = ifc1.concat(s);
                    } else
                    {
                        s = new String(ifc1);
                    }
                }
            }
        }
        intent.putExtra("android.intent.extra.TEXT", s);
    }

    public final void a(ifc ifc1, ihk ihk1, boolean flag)
    {
        p.a(ifc1.a(), "targetIntents must allow shareLink");
        p.b(ihk1, "envelopeShareDetails can not be null");
        Intent intent = ifc1.b;
        intent.putExtra("android.intent.extra.TEXT", ihk1.b);
        if (!ifc1.c())
        {
            ihk1.e = ifc1.a;
        }
        j = ihk1;
        if (flag)
        {
            a(ifc1, intent);
        }
        b(ifc1, intent);
    }

    void b(ifc ifc1, Intent intent)
    {
        if (!ifc1.c())
        {
            ifc1 = ifc1.a;
            ifc1 = e.getString(b.yT, new Object[] {
                ifc1
            });
            Toast.makeText(e, ifc1, 0).show();
            intent.addFlags(0x10000000);
        } else
        {
            ((ClipboardManager)e.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", ""));
        }
        if (d.b.d)
        {
            ifc1 = d;
            String s = intent.getComponent().getPackageName();
            igx igx1 = ((igy) (ifc1)).b;
            p.b(igx1.d, "RecentAppLookup must be loaded before use");
            igx1.c.remove(s);
            if (igx1.c.size() == igx1.a)
            {
                igx1.c.remove(igx1.c.size() - 1);
            }
            igx1.c.add(0, s);
            igx1.a();
            ((igy) (ifc1)).a.a(new iha(Collections.unmodifiableList(((igy) (ifc1)).b.c)));
        }
        mry.a(e, -1, (new msn()).a(b));
        f.a(ce.i, intent);
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("share_details", j);
    }

    static 
    {
        b = new msm(pwt.F);
    }
}
