// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.w.j;
import com.facebook.i;
import com.facebook.k;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.o;
import com.facebook.user.tiles.UserTileView;
import com.facebook.user.tiles.e;
import com.facebook.widget.d;
import com.facebook.widget.text.BetterTextView;

// Referenced classes of package com.facebook.orca.threadview:
//            ai

public class dp extends d
{

    private UserTileView a;
    private BetterTextView b;

    public dp(Context context)
    {
        super(context);
        a(context);
    }

    private void a(Context context)
    {
        setContentView(k.orca_typing_item);
        setPadding(0, 0, 0, j.a(getContext(), 12F));
        a = (UserTileView)c(i.message_user_tile);
        b = (BetterTextView)c(i.message_text);
    }

    public void setTypingItem(ai ai1)
    {
        a.setParams(e.a(ai1.b().e()));
        b.setText(getResources().getString(o.presence_typing));
    }
}
