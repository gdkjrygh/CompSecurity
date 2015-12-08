// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import android.widget.TextView;
import com.pinterest.api.model.BoardInvite;
import com.pinterest.ui.ViewHelper;
import java.util.ArrayList;
import java.util.List;

public class BoardInviteHelper
{

    private static ArrayList sInvites = new ArrayList();

    public BoardInviteHelper()
    {
    }

    public static void clear()
    {
        sInvites.clear();
    }

    public static boolean deleteInvite(Long long1)
    {
        return true;
    }

    public static BoardInvite getInvite(Long long1)
    {
        return null;
    }

    public static boolean hasInvite(Long long1)
    {
        return false;
    }

    public static void setInviteMessage(TextView textview, String s)
    {
        textview.setText(ViewHelper.getBoldText(0x7f070094, s));
    }

    public static void setInvites(List list)
    {
        sInvites.clear();
        sInvites.addAll(list);
    }

}
