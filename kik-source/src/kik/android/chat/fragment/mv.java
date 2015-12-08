// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.a.d.k;
import kik.android.widget.KikContactImageThumbNailList;

// Referenced classes of package kik.android.chat.fragment:
//            KikMultiselectContactsListFragment

final class mv
    implements Runnable
{

    final k a;
    final KikMultiselectContactsListFragment b;

    mv(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment, k k)
    {
        b = kikmultiselectcontactslistfragment;
        a = k;
        super();
    }

    public final void run()
    {
        KikMultiselectContactsListFragment.e(b).a(a);
        b.c(a);
    }
}
