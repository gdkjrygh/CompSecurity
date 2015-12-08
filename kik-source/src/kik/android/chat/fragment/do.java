// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import android.view.View;
import com.kik.view.adapters.MediaTrayTabAdapter;
import kik.android.widget.GalleryWidget;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class do
    implements android.content.DialogInterface.OnClickListener
{

    final boolean a;
    final KikChatFragment b;

    do(KikChatFragment kikchatfragment, boolean flag)
    {
        b = kikchatfragment;
        a = flag;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        KikChatFragment.v(b);
        KikChatFragment.ah(b);
        kik.a.d.a.a a1 = KikChatFragment.k();
        KikChatFragment.a(b, "Attachment Overwritten", a, KikChatFragment.a(a1));
        b.sendButton.setEnabled(true);
        KikChatFragment.ai(b);
        KikChatFragment.c(b, a1);
        dialoginterface.dismiss();
        if (KikChatFragment.K(b).getCount() > 0 && KikChatFragment.K(b).getItem(0) != null && (KikChatFragment.K(b).getItem(0) instanceof GalleryWidget))
        {
            ((GalleryWidget)KikChatFragment.K(b).getItem(0)).c();
        }
    }
}
