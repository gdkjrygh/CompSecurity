// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.DialogInterface;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseShareActivity

class a
    implements android.content.ncelListener
{

    final BaseShareActivity a;

    public void onCancel(DialogInterface dialoginterface)
    {
        BaseShareActivity.a(a, false);
    }

    (BaseShareActivity baseshareactivity)
    {
        a = baseshareactivity;
        super();
    }
}
