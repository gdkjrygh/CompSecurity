// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import AY;
import Fd;
import android.content.Context;
import android.util.AttributeSet;
import com.snapchat.android.model.Snap;

// Referenced classes of package com.snapchat.android.ui:
//            FrivolousAnimationView

public class ChatFragmentSnapIconView extends FrivolousAnimationView
{

    public ChatFragmentSnapIconView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void setDisplayedIcon(Snap snap)
    {
        super.a = 0x8000000000000000L;
        com.snapchat.android.model.Snap.ClientSnapStatus clientsnapstatus = snap.aj();
        if (clientsnapstatus == com.snapchat.android.model.Snap.ClientSnapStatus.SENT_AND_SCREENSHOTTED)
        {
            int i;
            if (snap instanceof AY)
            {
                i = snap.ag();
            } else
            {
                i = snap.af();
            }
            setIconResource(new Fd(i));
        } else
        {
            if (clientsnapstatus == com.snapchat.android.model.Snap.ClientSnapStatus.SENT_AND_REPLAYED_AND_SCREENSHOTTED)
            {
                setIconResource(new Fd(snap.ah()));
                return;
            }
            snap = snap.a(this, null);
            if (snap != null)
            {
                boolean flag;
                if (System.currentTimeMillis() - ((Fd) (snap)).c <= 500L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    a(((Fd) (snap)).c);
                    setIconResource(snap);
                    return;
                } else
                {
                    Fd fd = new Fd(((Fd) (snap)).b);
                    fd.b = ((Fd) (snap)).b;
                    setIconResource(fd);
                    return;
                }
            }
        }
    }
}
