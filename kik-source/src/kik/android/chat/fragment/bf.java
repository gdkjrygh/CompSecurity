// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import com.kik.g.p;
import kik.a.d.j;
import kik.a.e.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikAddToBlockFragment, bg

final class bf
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final KikAddToBlockFragment b;

    bf(KikAddToBlockFragment kikaddtoblockfragment, String s)
    {
        b = kikaddtoblockfragment;
        a = s;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = b.H.c(j.a(a));
        if (!dialoginterface.g())
        {
            b.b(b.getString(0x7f09036a), true);
        }
        dialoginterface.a(new bg(this));
    }
}
