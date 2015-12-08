// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            MissedConversationsFragment, qi, qh

final class qg
    implements android.view.View.OnClickListener
{

    final MissedConversationsFragment a;

    qg(MissedConversationsFragment missedconversationsfragment)
    {
        a = missedconversationsfragment;
        super();
    }

    public final void onClick(View view)
    {
        view = new KikDialogFragment.a(a.getActivity().getResources());
        view.b(MissedConversationsFragment.b(a).getResources().getString(0x7f090039)).a(MissedConversationsFragment.b(a).getResources().getString(0x7f090088)).a(0x7f090193, new qi(this)).b(0x7f090299, new qh(this));
        a.a(((KikDialogFragment.a) (view)).a, KikScopedDialogFragment.a.b, "delete");
    }
}
