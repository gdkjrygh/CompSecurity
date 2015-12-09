// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.cheat.popup;

import android.os.IBinder;

// Referenced classes of package com.google.android.gms.games.ui.cheat.popup:
//            CodeListenerPopupManager

public static final class <init>
{

    public int bottom;
    public int displayId;
    public int gravity;
    public int left;
    public int right;
    public int top;
    public IBinder windowToken;

    private (int i, IBinder ibinder)
    {
        displayId = -1;
        left = 0;
        top = 0;
        right = 0;
        bottom = 0;
        gravity = i;
        windowToken = ibinder;
    }

    windowToken(int i, IBinder ibinder, byte byte0)
    {
        this(i, ibinder);
    }
}
