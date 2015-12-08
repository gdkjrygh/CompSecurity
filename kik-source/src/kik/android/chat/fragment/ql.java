// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.ProgressDialog;
import kik.a.e.s;

// Referenced classes of package kik.android.chat.fragment:
//            ProgressDialogFragment

final class ql
    implements s
{

    final ProgressDialogFragment a;

    ql(ProgressDialogFragment progressdialogfragment)
    {
        a = progressdialogfragment;
        super();
    }

    public final void a(int i)
    {
        ProgressDialogFragment.a(a, i);
        ProgressDialogFragment.b(a).setProgress(ProgressDialogFragment.a(a));
    }
}
