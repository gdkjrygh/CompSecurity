// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.content.DialogInterface;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            LiveUpcomingListMenuDialog

class val.liveUpcomingMenuList
    implements android.content.er
{

    final LiveUpcomingListMenuDialog this$0;
    final String val$liveUpcomingMenuList[];

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = val$liveUpcomingMenuList[i];
        if (LiveUpcomingListMenuDialog.access$000(LiveUpcomingListMenuDialog.this) != null)
        {
            LiveUpcomingListMenuDialog.access$000(LiveUpcomingListMenuDialog.this).onLiveMenuSelected(dialoginterface, i);
        }
    }

    veUpcomingListMenuDialogListener()
    {
        this$0 = final_liveupcominglistmenudialog;
        val$liveUpcomingMenuList = _5B_Ljava.lang.String_3B_.this;
        super();
    }
}
