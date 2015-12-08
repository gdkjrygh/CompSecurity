// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ListView;

// Referenced classes of package me.lyft.android.ui.invites:
//            InviteScreenView

class rpolator extends AccelerateDecelerateInterpolator
{

    final InviteScreenView this$0;

    public float getInterpolation(float f)
    {
        f = super.getInterpolation(f);
        updatePosition();
        return f;
    }

    void updatePosition()
    {
        android.widget.rams rams = (android.widget.rams)contactsList.getLayoutParams();
        rams.bottomMargin = sendInvitesButton.getHeight() - (int)sendInvitesButton.getTranslationY();
        contactsList.setLayoutParams(rams);
    }

    rpolator()
    {
        this$0 = InviteScreenView.this;
        super();
    }
}
