// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.DialogInterface;

// Referenced classes of package com.facebook.internal:
//            bd

final class be
    implements android.content.DialogInterface.OnCancelListener
{

    final bd a;

    be(bd bd1)
    {
        a = bd1;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.cancel();
    }
}
