// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            SelectedAccountNavigationView

final class this._cls0 extends AnimatorListenerAdapter
{

    final SelectedAccountNavigationView this$0;

    public final void onAnimationEnd(Animator animator)
    {
        SelectedAccountNavigationView.access$000(SelectedAccountNavigationView.this).offscreenAvatar.setVisibility(8);
        SelectedAccountNavigationView.access$000(SelectedAccountNavigationView.this).offscreenText.setVisibility(8);
        if (SelectedAccountNavigationView.access$000(SelectedAccountNavigationView.this).offscreenCoverPhoto != null)
        {
            SelectedAccountNavigationView.access$000(SelectedAccountNavigationView.this).offscreenCoverPhoto.setVisibility(8);
        }
        SelectedAccountNavigationView.access$100(SelectedAccountNavigationView.this);
        SelectedAccountNavigationView.access$200(SelectedAccountNavigationView.this);
        SelectedAccountNavigationView.access$302(SelectedAccountNavigationView.this, null);
    }

    ewHolderItem()
    {
        this$0 = SelectedAccountNavigationView.this;
        super();
    }
}
