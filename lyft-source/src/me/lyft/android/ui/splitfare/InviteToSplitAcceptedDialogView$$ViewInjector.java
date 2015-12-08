// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.view.View;
import android.widget.ImageView;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            InviteToSplitAcceptedDialogView

public class 
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (InviteToSplitAcceptedDialogView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, InviteToSplitAcceptedDialogView invitetosplitaccepteddialogview, Object obj)
    {
        invitetosplitaccepteddialogview.leftIcon = (ImageView)viewinjector.leftIcon((View)viewinjector.leftIcon(obj, 0x7f0d0241, "field 'leftIcon'"), 0x7f0d0241, "field 'leftIcon'");
        invitetosplitaccepteddialogview.rightIcon = (ImageView)viewinjector.rightIcon((View)viewinjector.rightIcon(obj, 0x7f0d0242, "field 'rightIcon'"), 0x7f0d0242, "field 'rightIcon'");
    }

    public volatile void reset(Object obj)
    {
        reset((InviteToSplitAcceptedDialogView)obj);
    }

    public void reset(InviteToSplitAcceptedDialogView invitetosplitaccepteddialogview)
    {
        invitetosplitaccepteddialogview.leftIcon = null;
        invitetosplitaccepteddialogview.rightIcon = null;
    }

    public ()
    {
    }
}
