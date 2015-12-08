// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.a;

import android.content.DialogInterface;

// Referenced classes of package com.tremorvideo.a:
//            e

class f
    implements android.content.DialogInterface.OnCancelListener
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a.d.a();
    }
}
