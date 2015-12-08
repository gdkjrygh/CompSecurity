// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget:
//            ce

final class cj
    implements Runnable
{

    final Context a;
    final KikScopedDialogFragment b;

    cj(Context context, KikScopedDialogFragment kikscopeddialogfragment)
    {
        a = context;
        b = kikscopeddialogfragment;
        super();
    }

    public final void run()
    {
        ce.a(a, b);
    }
}
