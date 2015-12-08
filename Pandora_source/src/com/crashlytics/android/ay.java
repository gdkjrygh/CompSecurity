// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.DialogInterface;

// Referenced classes of package com.crashlytics.android:
//            aw, bb

final class ay
    implements android.content.DialogInterface.OnClickListener
{

    private aw a;

    ay(aw aw1)
    {
        a = aw1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a.a(false);
        dialoginterface.dismiss();
    }
}
