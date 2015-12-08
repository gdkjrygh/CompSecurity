// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.nbcsports.liveextra.library.api.models.Asset;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            ShowcaseFragment, DetailActionDialogFragment

class this._cls0
    implements android.view.r
{

    final ShowcaseFragment this$0;

    public void onClick(View view)
    {
        if (getActivity() == null || getActivity().isFinishing())
        {
            return;
        }
        String s = ShowcaseFragment.access$000(ShowcaseFragment.this).getStreamUrl();
        view = s;
        if (s == null)
        {
            view = ShowcaseFragment.access$000(ShowcaseFragment.this).getBackupUrl();
        }
        boolean flag = false;
        if (view != null)
        {
            flag = Boolean.parseBoolean(Uri.parse(view).getQueryParameter("launchExternal"));
        }
        if (flag)
        {
            view = new Intent("android.intent.action.VIEW", Uri.parse(view));
            startActivity(view);
            return;
        } else
        {
            view = new com.phunware.nbc.sochi.metrics.PageInfo(":Showcase:List", "Showcase", null, null);
            DetailActionDialogFragment.getInstance(ShowcaseFragment.access$000(ShowcaseFragment.this), view).show(getActivity().getSupportFragmentManager(), "detailfragment");
            return;
        }
    }

    ragment()
    {
        this$0 = ShowcaseFragment.this;
        super();
    }
}
