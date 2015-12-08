// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.release:
//            ge, PhotoGridActivity

final class gs
    implements android.content.DialogInterface.OnDismissListener
{

    final ge a;

    gs(ge ge1)
    {
        a = ge1;
        super();
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        ge.s(a);
        ge.f(a).i = false;
    }
}
