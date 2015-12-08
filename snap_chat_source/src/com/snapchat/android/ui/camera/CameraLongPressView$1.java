// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.camera;


// Referenced classes of package com.snapchat.android.ui.camera:
//            CameraLongPressView

final class a
    implements Runnable
{

    private CameraLongPressView a;

    public final void run()
    {
        a.invalidate();
    }

    (CameraLongPressView cameralongpressview)
    {
        a = cameralongpressview;
        super();
    }
}
