// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ListView;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            InviteToSplitView

class olator extends AccelerateDecelerateInterpolator
{

    final InviteToSplitView this$0;

    private void updatePosition()
    {
        android.widget.rams rams = (android.widget.rams)contactsList.getLayoutParams();
        rams.bottomMargin = sendInvitesButton.getHeight() - (int)sendInvitesButton.getTranslationY();
        contactsList.setLayoutParams(rams);
    }

    public float getInterpolation(float f)
    {
        f = super.getInterpolation(f);
        updatePosition();
        return f;
    }

    olator()
    {
        this$0 = InviteToSplitView.this;
        super();
    }
}
