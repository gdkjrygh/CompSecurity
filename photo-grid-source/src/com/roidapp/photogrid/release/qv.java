// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import com.roidapp.photogrid.common.c;

// Referenced classes of package com.roidapp.photogrid.release:
//            ShareEntryBase

final class qv
    implements android.content.DialogInterface.OnClickListener
{

    final ShareEntryBase a;

    qv(ShareEntryBase shareentrybase)
    {
        a = shareentrybase;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        c.a("400", a);
    }
}
