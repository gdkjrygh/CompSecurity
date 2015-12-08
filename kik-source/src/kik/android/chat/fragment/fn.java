// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment, fp, fo

final class fn
    implements android.view.View.OnClickListener
{

    final KikChatFragment a;

    fn(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onClick(View view)
    {
        view = new KikDialogFragment.a(a.getResources());
        Resources resources = a.getResources();
        view.a(resources.getString(0x7f0902ac)).b(resources.getString(0x7f090038));
        view.a(0x7f0902a9, new fp(this)).b(0x7f090299, new fo(this));
        a.a(((KikDialogFragment.a) (view)).a, KikScopedDialogFragment.a.b, "removeContent");
    }
}
