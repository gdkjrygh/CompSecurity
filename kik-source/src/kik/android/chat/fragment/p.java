// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.media.MediaRecorder;

// Referenced classes of package kik.android.chat.fragment:
//            CameraFragment

final class p
    implements android.media.MediaRecorder.OnInfoListener
{

    final CameraFragment a;

    p(CameraFragment camerafragment)
    {
        a = camerafragment;
        super();
    }

    public final void onInfo(MediaRecorder mediarecorder, int i, int j)
    {
        if (i == 800 || i == 801)
        {
            a.b();
        }
    }
}
