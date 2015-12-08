// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.social.debug.settings.DeveloperSettingsActivity;

public final class mwj extends oav
{

    private DeveloperSettingsActivity a;

    public mwj(DeveloperSettingsActivity developersettingsactivity, rz rz, opd opd)
    {
        a = developersettingsactivity;
        super(rz, opd);
    }

    protected final oad a()
    {
        Intent intent = a.getIntent();
        mwk mwk1 = new mwk();
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_browse_experiments_intent", intent.getParcelableExtra("args_browse_experiments_intent"));
        bundle.putParcelable("args_account_status_intent", intent.getParcelableExtra("args_account_status_intent"));
        bundle.putParcelable("args_network_requests_intent", intent.getParcelableExtra("args_network_requests_intent"));
        bundle.putParcelable("args_network_stats_intent", intent.getParcelableExtra("args_network_stats_intent"));
        bundle.putParcelable("extra_upload_stats_intent", intent.getParcelableExtra("extra_upload_stats_intent"));
        bundle.putBoolean("args_show_apiary_pref", intent.getBooleanExtra("args_show_apiary_pref", true));
        bundle.putBoolean("args_show_datamixer_pref", intent.getBooleanExtra("args_show_datamixer_pref", true));
        bundle.putBoolean("args_show_override_pref", intent.getBooleanExtra("args_show_override_pref", true));
        bundle.putParcelable("args_show_tracing_pref", intent.getParcelableExtra("args_show_tracing_pref"));
        mwk1.f(bundle);
        return mwk1;
    }
}
