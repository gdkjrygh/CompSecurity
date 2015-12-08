// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.util.SparseArray;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikScopedDialogFragment, KikDialogFragment

final class ph extends r
{

    final KikDialogFragment a;
    final KikScopedDialogFragment b;

    ph(KikScopedDialogFragment kikscopeddialogfragment, KikDialogFragment kikdialogfragment)
    {
        b = kikscopeddialogfragment;
        a = kikdialogfragment;
        super();
    }

    public final void a()
    {
        super.a();
        KikScopedDialogFragment.a(b).remove(a.c());
    }
}
