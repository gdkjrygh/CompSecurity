// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.aviary.android.feather.sdk:
//            FeatherActivity

class a
    implements android.view.er
{

    final Dialog a;
    final FeatherActivity b;

    public void onClick(View view)
    {
        a.dismiss();
    }

    (FeatherActivity featheractivity, Dialog dialog)
    {
        b = featheractivity;
        a = dialog;
        super();
    }
}
