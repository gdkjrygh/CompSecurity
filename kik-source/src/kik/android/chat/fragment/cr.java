// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.h.c;
import kik.android.widget.BugmeBarView;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment, cs, KikDialogFragment

final class cr extends c
{

    final KikChatFragment a;

    cr(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void a(KikDialogFragment kikdialogfragment)
    {
        KikChatFragment.w(a).post(new cs(this, kikdialogfragment));
    }
}
