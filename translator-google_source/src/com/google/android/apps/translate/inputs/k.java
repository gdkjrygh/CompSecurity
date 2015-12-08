// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import com.google.android.libraries.wordlens.GL2SurfaceView;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup, l

final class k
    implements Runnable
{

    final Camera2InputPopup a;

    k(Camera2InputPopup camera2inputpopup)
    {
        a = camera2inputpopup;
        super();
    }

    public final void run()
    {
        Camera2InputPopup.o(a).queueEvent(new l(this));
    }
}
