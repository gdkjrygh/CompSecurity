// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.media:
//            RemoteControlClientCompat

private static final class mImplWeak
    implements mImplWeak
{

    private final WeakReference mImplWeak;

    public void onVolumeSetRequest(Object obj, int i)
    {
        obj = (mImplWeak)mImplWeak.get();
        if (obj != null && ((mImplWeak) (obj)).mImplWeak != null)
        {
            ((mImplWeak) (obj)).mImplWeak.mImplWeak(i);
        }
    }

    public void onVolumeUpdateRequest(Object obj, int i)
    {
        obj = (mImplWeak)mImplWeak.get();
        if (obj != null && ((mImplWeak) (obj)).mImplWeak != null)
        {
            ((mImplWeak) (obj)).mImplWeak.(i);
        }
    }

    public ( )
    {
        mImplWeak = new WeakReference();
    }
}
