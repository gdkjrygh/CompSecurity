// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageButton;
import com.snapchat.android.model.FriendAction;

final class lang.Object
    implements android.view.OnClickListener
{

    private yQ a;

    public final void onClick(View view)
    {
        view = a;
        com.snapchat.android.model.Friend friend;
        boolean flag;
        if (!a.l.isSelected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.a(false, flag, true);
        friend = a.m;
        if (a.l.isSelected())
        {
            view = FriendAction.ADD;
        } else
        {
            view = FriendAction.DELETE;
        }
        view = new mh(friend, view);
        view.mAddSourceType = a.s();
        view.mAnalyticsContext = com.snapchat.android.analytics.ticsEvents.AnalyticsContext.STORIES;
        view.mFriendActionCompleteCallback = a;
        view = view.a();
        view.mActionMethod = hT.CHECKMARK;
        view.execute();
    }

    >(yQ yq)
    {
        a = yq;
        super();
    }
}
