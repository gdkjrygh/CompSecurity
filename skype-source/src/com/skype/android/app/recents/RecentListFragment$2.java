// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import android.content.DialogInterface;

// Referenced classes of package com.skype.android.app.recents:
//            RecentListFragment, RecentRemoveHistoryDialog, EditModeBar

final class alog
    implements android.content.missListener
{

    final RecentListFragment this$0;
    final RecentRemoveHistoryDialog val$removeHistoryDialog;

    public final void onDismiss(DialogInterface dialoginterface)
    {
        if (!val$removeHistoryDialog.isCanceled())
        {
            unselectRecentItems(getSelectedItems());
            RecentListFragment.access$000(RecentListFragment.this).onSelectedConversationListChanged(getSelectedItems());
        }
    }

    alog()
    {
        this$0 = final_recentlistfragment;
        val$removeHistoryDialog = RecentRemoveHistoryDialog.this;
        super();
    }
}
