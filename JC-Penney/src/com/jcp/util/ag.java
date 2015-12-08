// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.jcp.b.b;

// Referenced classes of package com.jcp.util:
//            k

final class ag
    implements android.content.DialogInterface.OnClickListener
{

    final Context a;

    ag(Context context)
    {
        a = context;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        com.jcp.util.k.b(a, a.getResources().getString(0x7f070346), b.W());
    }
}
