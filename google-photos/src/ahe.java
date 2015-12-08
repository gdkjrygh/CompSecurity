// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.hardware.Camera;

final class ahe
    implements android.hardware.Camera.PreviewCallback
{

    private ahd a;

    ahe(ahd ahd1)
    {
        a = ahd1;
        super();
    }

    public final void onPreviewFrame(byte abyte0[], Camera camera)
    {
        a.g();
        camera.addCallbackBuffer(a.f());
        a.e.a(2, false);
    }
}
