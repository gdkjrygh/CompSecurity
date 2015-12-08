// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.android.a;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment, jw, jv

final class ju
    implements Runnable
{

    final KikConversationsFragment a;

    ju(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final void run()
    {
        if (!KikConversationsFragment.e(a))
        {
            a.f.b("Address Book Prompt Shown").g().b();
            KikDialogFragment.a a1 = new KikDialogFragment.a(a.getResources());
            a1.b(a.getString(0x7f0901c5)).a(a.getString(0x7f0901c7)).c(0x7f0901c6, new jw(this)).a(0x7f090326, new jv(this)).a(false);
            a.a(a1.a);
        }
    }
}
