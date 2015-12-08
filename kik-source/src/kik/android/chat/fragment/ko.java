// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import com.kik.android.a;
import kik.android.chat.activity.k;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

final class ko
    implements android.view.View.OnClickListener
{

    final KikConversationsFragment a;

    ko(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final void onClick(View view)
    {
        a.f.b("Talk To Opened").b();
        k.a(new KikComposeFragment.a(), a.getActivity()).f();
    }
}
