// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.ContextMenu;
import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            MissedConversationsFragment

final class qe
    implements android.view.View.OnCreateContextMenuListener
{

    final MissedConversationsFragment a;

    qe(MissedConversationsFragment missedconversationsfragment)
    {
        a = missedconversationsfragment;
        super();
    }

    public final void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        a.a(contextmenu, contextmenuinfo);
    }
}
