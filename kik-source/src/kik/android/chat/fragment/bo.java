// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            ProgressDialogFragment, KikCardBrowserFragment

final class bo
    implements Runnable
{

    final String a;
    final KikCardBrowserFragment b;

    bo(KikCardBrowserFragment kikcardbrowserfragment, String s)
    {
        b = kikcardbrowserfragment;
        a = s;
        super();
    }

    public final void run()
    {
        KikCardBrowserFragment.a(b, new ProgressDialogFragment(a, false));
        b.a(KikCardBrowserFragment.b(b));
    }
}
