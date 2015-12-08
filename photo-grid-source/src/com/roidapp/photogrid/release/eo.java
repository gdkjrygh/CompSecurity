// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.release:
//            el

final class eo
    implements android.content.DialogInterface.OnCancelListener
{

    final el a;

    eo(el el1)
    {
        a = el1;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        el.g(a);
    }
}
