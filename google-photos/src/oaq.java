// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class oaq
    implements oau, oot, oov, ops, opv
{

    private final nzf a;
    private bp b;
    private oar c;
    private PreferenceScreen d;

    private oaq(nzf nzf1, oar oar1, opd opd1)
    {
        a = nzf1;
        c = (oar)p.a(oar1);
        opd1.a(this);
    }

    public oaq(nzf nzf1, opd opd1)
    {
        this(nzf1, (oar)nzf1, opd1);
    }

    public final void a()
    {
        PreferenceScreen preferencescreen = ((oad) (a)).d.a(a.a);
        nzf nzf1 = a;
        oam oam1 = ((oad) (nzf1)).d;
        boolean flag;
        if (preferencescreen != oam1.c)
        {
            oam1.c = preferencescreen;
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && preferencescreen != null)
        {
            nzf1.e = true;
            if (((oad) (nzf1)).f && !((oad) (nzf1)).g.hasMessages(1))
            {
                ((oad) (nzf1)).g.obtainMessage(1).sendToTarget();
            }
        }
        d = preferencescreen;
    }

    public final void a(am am)
    {
        b.a(am, null);
    }

    public final void a(View view, Bundle bundle)
    {
        if (bundle == null)
        {
            b = a.h().a();
            c.r();
            b.b();
            b = null;
        }
    }

    public final PreferenceScreen b()
    {
        if (d == null)
        {
            throw new IllegalStateException("PreferenceScreen cannot be accessed before OnCreateView");
        } else
        {
            return d;
        }
    }

    public final void e(Bundle bundle)
    {
    }
}
