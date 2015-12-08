// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.invites:
//            InviteItemView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (InviteItemView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, InviteItemView inviteitemview, Object obj)
    {
        inviteitemview.categoryText = (TextView)viewinjector.categoryText((View)viewinjector.categoryText(obj, 0x7f0d0142, "field 'categoryText'"), 0x7f0d0142, "field 'categoryText'");
        inviteitemview.checkBox = (CheckBox)viewinjector.checkBox((View)viewinjector.checkBox(obj, 0x7f0d0144, "field 'checkBox'"), 0x7f0d0144, "field 'checkBox'");
        inviteitemview.dividerView = (View)viewinjector.dividerView(obj, 0x7f0d0143, "field 'dividerView'");
        inviteitemview.inviteName = (TextView)viewinjector.inviteName((View)viewinjector.inviteName(obj, 0x7f0d0145, "field 'inviteName'"), 0x7f0d0145, "field 'inviteName'");
        inviteitemview.inviteLabel = (TextView)viewinjector.inviteLabel((View)viewinjector.inviteLabel(obj, 0x7f0d0146, "field 'inviteLabel'"), 0x7f0d0146, "field 'inviteLabel'");
    }

    public volatile void reset(Object obj)
    {
        reset((InviteItemView)obj);
    }

    public void reset(InviteItemView inviteitemview)
    {
        inviteitemview.categoryText = null;
        inviteitemview.checkBox = null;
        inviteitemview.dividerView = null;
        inviteitemview.inviteName = null;
        inviteitemview.inviteLabel = null;
    }

    public ()
    {
    }
}
