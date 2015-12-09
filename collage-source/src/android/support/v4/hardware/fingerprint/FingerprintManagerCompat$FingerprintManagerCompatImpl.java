// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.hardware.fingerprint;

import android.content.Context;
import android.os.Handler;
import android.support.v4.os.CancellationSignal;

// Referenced classes of package android.support.v4.hardware.fingerprint:
//            FingerprintManagerCompat

private static interface 
{

    public abstract void authenticate(Context context,  , int i, CancellationSignal cancellationsignal,  1, Handler handler);

    public abstract boolean hasEnrolledFingerprints(Context context);

    public abstract boolean isHardwareDetected(Context context);
}
