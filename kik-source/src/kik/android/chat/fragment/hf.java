// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment, ProgressDialogFragment

final class hf extends r
{

    final ProgressDialogFragment a;
    final KikChatInfoFragment b;

    hf(KikChatInfoFragment kikchatinfofragment, ProgressDialogFragment progressdialogfragment)
    {
        b = kikchatinfofragment;
        a = progressdialogfragment;
        super();
    }

    public final void a(Object obj)
    {
        KikChatInfoFragment.g(b).sendEmptyMessage(2);
        a.dismissAllowingStateLoss();
        KikChatInfoFragment.d(b);
    }

    public final void b(Throwable throwable)
    {
        KikChatInfoFragment.g(b).sendEmptyMessage(2);
        a.dismissAllowingStateLoss();
        if (b.getActivity() != null)
        {
            b.a(KikChatInfoFragment.b(0x7f0902db), KikChatInfoFragment.b(0x7f09017a));
        }
        KikChatInfoFragment.d(b);
    }
}
