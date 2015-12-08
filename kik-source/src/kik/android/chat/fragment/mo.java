// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            KikMultiselectContactsListFragment

final class mo
    implements Runnable
{

    final KikMultiselectContactsListFragment a;

    mo(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment)
    {
        a = kikmultiselectcontactslistfragment;
        super();
    }

    public final void run()
    {
        a.a(a.s, 1);
        a.a(a.s);
    }
}
