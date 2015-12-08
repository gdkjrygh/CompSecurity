// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            ProgressDialogFragment, KikChatInfoFragment

final class hd
    implements Runnable
{

    final ProgressDialogFragment a;
    final KikChatInfoFragment b;

    hd(KikChatInfoFragment kikchatinfofragment, ProgressDialogFragment progressdialogfragment)
    {
        b = kikchatinfofragment;
        a = progressdialogfragment;
        super();
    }

    public final void run()
    {
        a.dismissAllowingStateLoss();
        if (b.getActivity() != null)
        {
            b.a(KikChatInfoFragment.b(0x7f0902db), KikChatInfoFragment.b(0x7f09017a));
        }
    }
}
