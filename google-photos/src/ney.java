// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.PopupMenu;
import com.google.android.libraries.social.location.FriendLocationsListItemView;

public final class ney
    implements android.view.View.OnClickListener
{

    private FriendLocationsListItemView a;

    public ney(FriendLocationsListItemView friendlocationslistitemview)
    {
        a = friendlocationslistitemview;
        super();
    }

    public final void onClick(View view)
    {
        FriendLocationsListItemView friendlocationslistitemview = a;
        view = new PopupMenu(friendlocationslistitemview.getContext(), view);
        view.setOnMenuItemClickListener(friendlocationslistitemview);
        view.inflate(b.Gi);
        view.show();
    }
}
