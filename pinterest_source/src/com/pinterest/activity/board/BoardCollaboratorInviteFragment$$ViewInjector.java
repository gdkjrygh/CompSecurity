// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board;

import android.widget.ListView;
import android.widget.TextView;
import com.pinterest.ui.text.SearchEditText;

// Referenced classes of package com.pinterest.activity.board:
//            BoardCollaboratorInviteFragment

public class 
{

    public static void inject(butterknife.nt nt, BoardCollaboratorInviteFragment boardcollaboratorinvitefragment, Object obj)
    {
        boardcollaboratorinvitefragment._reminderTv = (TextView)nt._reminderTv(obj, 0x7f0f01e3, "field '_reminderTv'");
        boardcollaboratorinvitefragment._searchEt = (SearchEditText)nt._searchEt(obj, 0x7f0f0236, "field '_searchEt'");
        boardcollaboratorinvitefragment._listView = (ListView)nt._listView(obj, 0x7f0f01e4, "field '_listView'");
    }

    public static void reset(BoardCollaboratorInviteFragment boardcollaboratorinvitefragment)
    {
        boardcollaboratorinvitefragment._reminderTv = null;
        boardcollaboratorinvitefragment._searchEt = null;
        boardcollaboratorinvitefragment._listView = null;
    }

    public ()
    {
    }
}
