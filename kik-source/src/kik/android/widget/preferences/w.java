// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import com.kik.g.r;
import kik.android.chat.fragment.ProgressDialogFragment;

final class w extends r
{

    final ProgressDialogFragment a;

    w(ProgressDialogFragment progressdialogfragment)
    {
        a = progressdialogfragment;
        super();
    }

    public final void a()
    {
        a.dismissAllowingStateLoss();
    }
}
