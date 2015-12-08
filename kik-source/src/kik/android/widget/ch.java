// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.DialogInterface;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.d.b;
import kik.android.d.c;
import kik.android.d.d;

// Referenced classes of package kik.android.widget:
//            ce

final class ch
    implements android.content.DialogInterface.OnCancelListener
{

    final Context a;
    final KikScopedDialogFragment b;

    ch(Context context, KikScopedDialogFragment kikscopeddialogfragment)
    {
        a = context;
        b = kikscopeddialogfragment;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        kik.android.widget.ce.b(a, b);
        dialoginterface = (Boolean)d.a(a).a("eula-resign-app").b();
        if (dialoginterface != null && dialoginterface.booleanValue())
        {
            b.J();
            return;
        } else
        {
            kik.android.widget.ce.c(a, b);
            return;
        }
    }
}
