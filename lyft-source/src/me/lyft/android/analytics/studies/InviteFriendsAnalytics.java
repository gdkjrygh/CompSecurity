// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.IntentAnalytics;
import me.lyft.android.analytics.SpanningAnalytics;

public class InviteFriendsAnalytics
{

    private static final String TAG = "invite_friends";

    public InviteFriendsAnalytics()
    {
    }

    public static IntentAnalytics createShareInvitesIntent()
    {
        return (IntentAnalytics)(new IntentAnalytics(me.lyft.android.analytics.definitions.IntentEvent.Intent.SHARE_INVITES)).setTag("invite_friends");
    }

    public static ActionAnalytics createShownInviteFriends()
    {
        return (ActionAnalytics)(new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.SHOW_INVITE_FRIENDS)).setTag("invite_friends");
    }

    public static ActionAnalytics trackSendInvites(int i)
    {
        return (ActionAnalytics)(new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.SEND_INVITES)).setTag("invite_friends").setValue(i).trackInitiation();
    }

    public static ActionAnalytics trackShareInvites(String s)
    {
        return (ActionAnalytics)(new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.SHARE_INVITES)).setTag("invite_friends").setParameter(s).trackInitiation();
    }

    public static ActionAnalytics trackShowInviteButton(String s)
    {
        return (ActionAnalytics)(new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.SHOW_INVITE_BUTTON)).setTag("invite_friends").setParameter(s).trackInitiation();
    }
}
