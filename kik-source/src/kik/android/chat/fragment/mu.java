// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.android.widget.KikContactImageThumbNailList;

// Referenced classes of package kik.android.chat.fragment:
//            KikMultiselectContactsListFragment

final class mu
    implements Runnable
{

    final String a;
    final KikMultiselectContactsListFragment b;

    mu(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment, String s)
    {
        b = kikmultiselectcontactslistfragment;
        a = s;
        super();
    }

    public final void run()
    {
        KikMultiselectContactsListFragment.e(b).a(a, b.H);
    }
}
