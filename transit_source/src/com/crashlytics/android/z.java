// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.DialogInterface;

// Referenced classes of package com.crashlytics.android:
//            w, Crashlytics, C

final class z
    implements android.content.DialogInterface.OnClickListener
{

    private w a;

    z(w w1)
    {
        a = w1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        Crashlytics crashlytics = a.b;
        Crashlytics.a(true);
        a.a.a(true);
        dialoginterface.dismiss();
    }
}
