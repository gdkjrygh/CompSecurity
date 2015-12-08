// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import android.content.DialogInterface;
import com.kik.g.p;

// Referenced classes of package com.kik.cards.usermedia:
//            h

final class i
    implements android.content.DialogInterface.OnCancelListener
{

    final p a;
    final h b;

    i(h h, p p1)
    {
        b = h;
        a = p1;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.e();
    }
}
