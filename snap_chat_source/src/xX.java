// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.fragments.chat.MessageViewHolder;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.util.fragment.SnapchatFragment;

public final class xX
    implements xP.b, zJ
{

    private final SnapchatFragment a;
    private final Ku b;
    private ChatConversation c;

    public xX(SnapchatFragment snapchatfragment, zG zg)
    {
        this(snapchatfragment, zg, new Ku());
    }

    private xX(SnapchatFragment snapchatfragment, zG zg, Ku ku)
    {
        zg.a(this);
        a = snapchatfragment;
        b = ku;
    }

    public final void a(MessageViewHolder messageviewholder)
    {
        if (messageviewholder.C == null || c == null)
        {
            return;
        } else
        {
            b.a(a.getActivity(), c, messageviewholder.C);
            return;
        }
    }

    public final void a(ChatConversation chatconversation)
    {
        c = chatconversation;
    }
}
