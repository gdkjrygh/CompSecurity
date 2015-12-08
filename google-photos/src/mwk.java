// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public final class mwk extends nzf
    implements oar
{

    private final oaq h;

    public mwk()
    {
        h = new oaq(this, c);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        b.a(oau, h);
    }

    public final void r()
    {
        oaq oaq1 = h;
        Object obj = new mwl();
        obj.c = (Intent)super.q.getParcelable("args_account_status_intent");
        obj.d = (Intent)super.q.getParcelable("args_browse_experiments_intent");
        obj.f = super.q.getBoolean("args_show_override_pref");
        obj.e = (Intent)super.q.getParcelable("args_show_tracing_pref");
        oaq1.a(((am) (obj)));
        oaq1 = h;
        obj = new mwr();
        obj.a = super.q.getBoolean("args_show_apiary_pref");
        obj.b = super.q.getBoolean("args_show_datamixer_pref");
        oaq1.a(((am) (obj)));
        oaq1 = h;
        obj = new mwo();
        obj.c = (Intent)super.q.getParcelable("args_network_requests_intent");
        obj.d = (Intent)super.q.getParcelable("args_network_stats_intent");
        obj.e = (Intent)super.q.getParcelable("extra_upload_stats_intent");
        obj.a = super.q.getBoolean("args_show_network_netlogst_pref");
        obj.b = super.q.getBoolean("args_show_network_defaults_pref");
        oaq1.a(((am) (obj)));
    }
}
