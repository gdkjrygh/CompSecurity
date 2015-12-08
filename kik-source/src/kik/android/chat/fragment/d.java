// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.view.adapters.bb;

// Referenced classes of package kik.android.chat.fragment:
//            c, AbTestsFragment

final class d
    implements Runnable
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public final void run()
    {
        AbTestsFragment.a(a.a).notifyDataSetChanged();
    }
}
