// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.android.util.av;

// Referenced classes of package kik.android.chat.fragment:
//            CameraFragment

final class k
    implements android.hardware.Camera.ShutterCallback
{

    final CameraFragment a;

    k(CameraFragment camerafragment)
    {
        a = camerafragment;
        super();
    }

    public final void onShutter()
    {
        if (a._cameraCover != null)
        {
            av.a(a._cameraCover);
        }
    }
}
