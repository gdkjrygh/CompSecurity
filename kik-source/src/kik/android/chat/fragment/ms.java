// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.a.d.k;
import kik.android.widget.KikContactImageThumbNailList;

// Referenced classes of package kik.android.chat.fragment:
//            KikMultiselectContactsListFragment

final class ms
    implements Runnable
{

    final String a;
    final k b;
    final KikMultiselectContactsListFragment c;

    ms(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment, String s, k k)
    {
        c = kikmultiselectcontactslistfragment;
        a = s;
        b = k;
        super();
    }

    public final void run()
    {
        KikMultiselectContactsListFragment.e(c).a(a, b, c.H);
    }
}
