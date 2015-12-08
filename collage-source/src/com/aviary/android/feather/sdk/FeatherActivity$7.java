// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk;

import android.content.DialogInterface;

// Referenced classes of package com.aviary.android.feather.sdk:
//            FeatherActivity

class a
    implements android.content.CancelListener
{

    final FeatherActivity a;

    public void onCancel(DialogInterface dialoginterface)
    {
        a.a(0, null);
        a.finish();
    }

    (FeatherActivity featheractivity)
    {
        a = featheractivity;
        super();
    }
}
