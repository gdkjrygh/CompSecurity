// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.app.Activity;
import android.widget.Toast;

// Referenced classes of package com.yume.android.player:
//            J

final class h
    implements Runnable
{

    h()
    {
    }

    public final void run()
    {
        Activity activity = (Activity)J.E();
        if (activity != null)
        {
            Toast.makeText(activity, "Calendar updated successfully.", 0).show();
        }
    }
}
