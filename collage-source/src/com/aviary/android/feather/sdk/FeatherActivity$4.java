// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.aviary.android.feather.sdk:
//            FeatherActivity

class a
    implements android.view.er
{

    final FeatherActivity a;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW");
        view.setData(Uri.parse("http://support.aviary.com/"));
        a.startActivity(view);
    }

    (FeatherActivity featheractivity)
    {
        a = featheractivity;
        super();
    }
}
