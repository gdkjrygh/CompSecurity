// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.Activity;

// Referenced classes of package kik.android.chat.fragment:
//            pj, KikDialogFragment, KikScopedDialogFragment

final class pi
    implements Runnable
{

    final Activity a;
    final String b;
    final String c;
    final KikScopedDialogFragment d;

    pi(KikScopedDialogFragment kikscopeddialogfragment, Activity activity, String s, String s1)
    {
        d = kikscopeddialogfragment;
        a = activity;
        b = s;
        c = s1;
        super();
    }

    public final void run()
    {
        Object obj = new KikDialogFragment.a(a.getResources());
        ((KikDialogFragment.a) (obj)).b(b).a(c);
        obj = ((KikDialogFragment.a) (obj)).a;
        ((KikDialogFragment) (obj)).a(0x7f090193, new pj(this));
        d.a(((KikDialogFragment) (obj)));
    }
}
