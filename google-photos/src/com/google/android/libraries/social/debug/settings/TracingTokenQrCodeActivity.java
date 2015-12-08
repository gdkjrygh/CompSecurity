// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.debug.settings;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import ar;
import mww;

public final class TracingTokenQrCodeActivity extends ar
{

    public TracingTokenQrCodeActivity()
    {
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            return;
        }
        bundle = getIntent().getData();
        if (bundle == null || !"gplus".equals(bundle.getScheme()) || !"apiaryTrace".equals(bundle.getLastPathSegment()))
        {
            finish();
            return;
        } else
        {
            (new mww()).a(c(), "confirm");
            return;
        }
    }
}
