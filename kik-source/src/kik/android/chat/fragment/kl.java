// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.ContextMenu;
import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

final class kl
    implements android.view.View.OnCreateContextMenuListener
{

    final KikConversationsFragment a;

    kl(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        a.a(contextmenu, contextmenuinfo);
    }
}
