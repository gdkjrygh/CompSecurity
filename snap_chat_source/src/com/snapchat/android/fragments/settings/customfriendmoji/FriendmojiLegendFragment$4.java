// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.customfriendmoji;

import android.content.DialogInterface;
import com.snapchat.android.analytics.framework.EasyMetric;
import mj;

// Referenced classes of package com.snapchat.android.fragments.settings.customfriendmoji:
//            FriendmojiLegendFragment

final class Y
    implements android.content.ener
{

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        (new mj(face)).execute();
        (new EasyMetric("RESETTING_FRIEND_EMOJIS_TO_DEFAULT")).b(false);
    }

    Y()
    {
    }
}
