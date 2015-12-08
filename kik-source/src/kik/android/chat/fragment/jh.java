// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.ListView;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.chat.fragment:
//            jg, KikContactsListFragment

final class jh
    implements Runnable
{

    final jg a;

    jh(jg jg1)
    {
        a = jg1;
        super();
    }

    public final void run()
    {
        if (a.a.B)
        {
            a.a.c.setSelectionFromTop(a.a.c.getHeaderViewsCount(), KikApplication.a(113));
            return;
        } else
        {
            a.a.B = true;
            a.a.c.setSelection(0);
            return;
        }
    }
}
