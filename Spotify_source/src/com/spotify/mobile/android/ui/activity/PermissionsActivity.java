// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import fou;
import gdh;
import gfl;
import ggn;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            FacebookWebPermissionsActivity

public class PermissionsActivity extends fou
{

    private gfl d;
    private boolean i;

    public PermissionsActivity()
    {
    }

    public void onActivityResult(int j, int k, Intent intent)
    {
        super.onActivityResult(j, k, intent);
        if (j == 101)
        {
            if (intent != null && intent.hasExtra("denied_scopes"))
            {
                intent = intent.getStringExtra("denied_scopes");
            } else
            {
                intent = "";
            }
            if (!intent.contains((CharSequence)gdh.a.get(0)))
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (k == 0 || j == 0)
            {
                d.a(0);
                setResult(2);
            } else
            {
                d.a(1);
                setResult(-1);
            }
            finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            bundle.setClassLoader(getClassLoader());
            i = bundle.getBoolean("com.spotify.mobile.android.ui.activity.permissions_requested");
        }
        super.e = ggn.a(this, ViewUri.ao);
        d = new gfl(this);
    }

    public void onResume()
    {
        super.onResume();
        if (!i)
        {
            startActivityForResult(new Intent(this, com/spotify/mobile/android/ui/activity/FacebookWebPermissionsActivity), 101);
            i = true;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.spotify.mobile.android.ui.activity.permissions_requested", i);
    }
}
