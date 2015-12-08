// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import com.google.android.apps.translate.wordlens.GTRNativeUI;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup, an

final class w
    implements Runnable
{

    final int a;
    final int b;
    final byte c[];
    final Camera2InputPopup d;

    w(Camera2InputPopup camera2inputpopup, int i, int j, byte abyte0[])
    {
        d = camera2inputpopup;
        a = i;
        b = j;
        c = abyte0;
        super();
    }

    public final void run()
    {
        GTRNativeUI.a().a(a, b, c);
        Camera2InputPopup.v(d);
        (new an(d, false)).execute(new Void[0]);
    }
}
