// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.deeplinks;

import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import com.soundcloud.android.main.TrackedActivity;

// Referenced classes of package com.soundcloud.android.deeplinks:
//            IntentResolver

public class ResolveActivity extends TrackedActivity
{

    IntentResolver intentResolver;

    public ResolveActivity()
    {
    }

    public static boolean accept(Uri uri, Resources resources)
    {
        return "soundcloud".equalsIgnoreCase(uri.getScheme()) || uri.getHost() != null && uri.getHost().contains(resources.getString(0x7f0702b5));
    }

    protected void onResume()
    {
        super.onResume();
        findViewById(0x7f0f0173).setVisibility(0);
        intentResolver.handleIntent(getIntent(), this);
        finish();
    }

    protected void setActivityContentView()
    {
        setContentView(0x7f0300a5);
    }
}
