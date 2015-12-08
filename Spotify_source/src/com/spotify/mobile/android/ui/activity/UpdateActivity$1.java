// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            UpdateActivity

final class a
    implements android.view.ner
{

    private UpdateActivity a;

    public final void onClick(View view)
    {
        a.startActivity((new Intent("android.intent.action.VIEW", UpdateActivity.a(a))).addFlags(0x10000000));
        a.finish();
    }

    (UpdateActivity updateactivity)
    {
        a = updateactivity;
        super();
    }
}
