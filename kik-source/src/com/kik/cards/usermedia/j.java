// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import android.content.DialogInterface;
import com.kik.g.p;

// Referenced classes of package com.kik.cards.usermedia:
//            h

final class j
    implements android.content.DialogInterface.OnClickListener
{

    final CharSequence a[];
    final p b;
    final h c;

    j(h h, CharSequence acharsequence[], p p1)
    {
        c = h;
        a = acharsequence;
        b = p1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == 0 && a.length > 1)
        {
            b.a("camera");
            return;
        } else
        {
            b.a("gallery");
            return;
        }
    }
}
