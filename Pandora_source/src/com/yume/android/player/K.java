// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import java.util.TimerTask;

// Referenced classes of package com.yume.android.player:
//            J, ac, S

final class K extends TimerTask
{

    K()
    {
    }

    public final void run()
    {
        J.d.runOnUiThread(new ac());
    }
}
