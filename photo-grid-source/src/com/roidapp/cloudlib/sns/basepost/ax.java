// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            aw, bb

final class ax
    implements android.content.DialogInterface.OnClickListener
{

    final aw a;

    ax(aw aw1)
    {
        a = aw1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (aw.a(a) != null)
        {
            aw.a(a).a();
        }
    }
}
