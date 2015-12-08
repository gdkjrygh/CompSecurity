// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.hardware.Camera;
import kik.android.util.av;

// Referenced classes of package kik.android.chat.fragment:
//            CameraFragment

final class t
    implements android.hardware.Camera.AutoFocusCallback
{

    final CameraFragment a;

    t(CameraFragment camerafragment)
    {
        a = camerafragment;
        super();
    }

    public final void onAutoFocus(boolean flag, Camera camera)
    {
        if (flag)
        {
            CameraFragment.f(a);
        }
        CameraFragment.e(a);
        av.b(a._touchFocusImage, 250);
    }
}
