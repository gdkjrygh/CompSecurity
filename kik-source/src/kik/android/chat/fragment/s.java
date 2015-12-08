// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.hardware.Camera;

// Referenced classes of package kik.android.chat.fragment:
//            CameraFragment

final class s
    implements android.hardware.Camera.AutoFocusCallback
{

    final CameraFragment a;

    s(CameraFragment camerafragment)
    {
        a = camerafragment;
        super();
    }

    public final void onAutoFocus(boolean flag, Camera camera)
    {
        a.d();
        CameraFragment.e(a);
    }
}
