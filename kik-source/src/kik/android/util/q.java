// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.DialogInterface;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.util:
//            p, t

final class q
    implements android.content.DialogInterface.OnClickListener
{

    final CharSequence a[];
    final KikScopedDialogFragment b;
    final p c;

    q(p p1, CharSequence acharsequence[], KikScopedDialogFragment kikscopeddialogfragment)
    {
        c = p1;
        a = acharsequence;
        b = kikscopeddialogfragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == 0 && a.length > 1)
        {
            dialoginterface = t.b(p.i());
            b.startActivityForResult(dialoginterface, 10334);
            return;
        } else
        {
            dialoginterface = t.a(p.i());
            b.startActivityForResult(dialoginterface, 10335);
            return;
        }
    }
}
