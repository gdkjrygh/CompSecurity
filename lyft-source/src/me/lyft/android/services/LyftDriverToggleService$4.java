// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import me.lyft.android.IUserSession;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import rx.functions.Action0;

// Referenced classes of package me.lyft.android.services:
//            LyftDriverToggleService

class this._cls0
    implements Action0
{

    final LyftDriverToggleService this$0;

    public void call()
    {
        LyftDriverToggleService.access$300(LyftDriverToggleService.this).setVisibility(0);
        LyftDriverToggleService.access$400(LyftDriverToggleService.this).setVisibility(0);
        RideDTO ridedto = userSession.getRide();
        int i;
        if (ridedto != null && LyftDriverToggleService.access$1000().contains(ridedto.getStatus()))
        {
            i = 0x7f07017c;
        } else
        if ("driver".equalsIgnoreCase(userSession.getUser().getMode()))
        {
            i = 0x7f07017d;
        } else
        {
            i = 0x7f07017e;
        }
        LyftDriverToggleService.access$500(LyftDriverToggleService.this).setText(i);
        if (LyftDriverToggleService.access$600(LyftDriverToggleService.this) != 242)
        {
            LyftDriverToggleService.access$700(LyftDriverToggleService.this, LyftDriverToggleService.access$200(LyftDriverToggleService.this), LyftDriverToggleService.access$600(LyftDriverToggleService.this), 242);
        }
        if (LyftDriverToggleService.access$800(LyftDriverToggleService.this) != null)
        {
            LyftDriverToggleService.access$800(LyftDriverToggleService.this).cancel();
        }
        if (LyftDriverToggleService.access$500(LyftDriverToggleService.this).getVisibility() != 0 || LyftDriverToggleService.access$900(LyftDriverToggleService.this).getAlpha() != 1.0F)
        {
            LyftDriverToggleService.access$500(LyftDriverToggleService.this).setAlpha(0.0F);
            LyftDriverToggleService.access$500(LyftDriverToggleService.this).setVisibility(0);
            LyftDriverToggleService.access$802(LyftDriverToggleService.this, LyftDriverToggleService.access$500(LyftDriverToggleService.this).animate().alpha(1.0F).setDuration(325L).setListener(null));
        }
    }

    ()
    {
        this$0 = LyftDriverToggleService.this;
        super();
    }
}
