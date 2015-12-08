// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.DialogInterface;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget:
//            ce

final class ck
    implements android.content.DialogInterface.OnClickListener
{

    final Context a;
    final KikScopedDialogFragment b;

    ck(Context context, KikScopedDialogFragment kikscopeddialogfragment)
    {
        a = context;
        b = kikscopeddialogfragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        ce.a(a, b);
    }
}
