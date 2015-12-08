// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp;

import android.content.Intent;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.googlehelp:
//            GoogleHelpLauncher, Help, GoogleHelpApi

public final class pIntent
    implements tener
{

    final GoogleHelpLauncher this$0;
    final Intent val$helpIntent;

    public final PendingResult onGoogleApiClientConnected$3946365()
    {
        return Help.GoogleHelpApi.startHelp(mApiClient, mActivity, val$helpIntent);
    }

    public final void onInvokeFailed()
    {
        handlePlayServicesUnavailable(16, val$helpIntent);
    }

    public tener()
    {
        this$0 = final_googlehelplauncher;
        val$helpIntent = Intent.this;
        super();
    }
}
