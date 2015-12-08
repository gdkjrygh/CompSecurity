// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.aviary.android.feather.sdk:
//            FeatherActivity

class b
    implements android.view.r
{

    final android.view.r a;
    final Dialog b;
    final FeatherActivity c;

    public void onClick(View view)
    {
        if (a != null)
        {
            a.onClick(view);
        }
        b.dismiss();
    }

    (FeatherActivity featheractivity, android.view.r r, Dialog dialog)
    {
        c = featheractivity;
        a = r;
        b = dialog;
        super();
    }
}
