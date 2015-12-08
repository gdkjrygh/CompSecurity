// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.h;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib.sns.h:
//            a

final class b
    implements android.content.DialogInterface.OnClickListener
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            com.roidapp.cloudlib.sns.h.a.a(a);
            return;

        case 1: // '\001'
            com.roidapp.cloudlib.sns.h.a.b(a);
            break;
        }
    }
}
