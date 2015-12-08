// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.hardware.fingerprint;

import android.content.Context;
import android.os.Handler;
import android.support.v4.os.CancellationSignal;

// Referenced classes of package android.support.v4.hardware.fingerprint:
//            FingerprintManagerCompat, FingerprintManagerCompatApi23

private static class 
    implements 
{

    private static  unwrapCryptoObject( )
    {
        if ( != null)
        {
            if (.() != null)
            {
                return new (.());
            }
            if (.() != null)
            {
                return new (.());
            }
            if (.() != null)
            {
                return new (.());
            }
        }
        return null;
    }

    private static  wrapCallback( )
    {
        return new FingerprintManagerCompatApi23.AuthenticationCallback() {

            final FingerprintManagerCompat.AuthenticationCallback val$callback;

            public void onAuthenticationError(int i, CharSequence charsequence)
            {
                callback.onAuthenticationError(i, charsequence);
            }

            public void onAuthenticationFailed()
            {
                callback.onAuthenticationFailed();
            }

            public void onAuthenticationHelp(int i, CharSequence charsequence)
            {
                callback.onAuthenticationHelp(i, charsequence);
            }

            public void onAuthenticationSucceeded(FingerprintManagerCompatApi23.AuthenticationResultInternal authenticationresultinternal)
            {
                callback.onAuthenticationSucceeded(new FingerprintManagerCompat.AuthenticationResult(FingerprintManagerCompat.Api23FingerprintManagerCompatImpl.unwrapCryptoObject(authenticationresultinternal.getCryptoObject())));
            }

            
            {
                callback = authenticationcallback;
                super();
            }
        };
    }

    private static getCryptoObject wrapCryptoObject(getCryptoObject getcryptoobject)
    {
        if (getcryptoobject != null)
        {
            if (getcryptoobject.getCryptoObject() != null)
            {
                return new getCryptoObject(getcryptoobject.getCryptoObject());
            }
            if (getcryptoobject.getCryptoObject() != null)
            {
                return new getCryptoObject(getcryptoobject.getCryptoObject());
            }
            if (getcryptoobject.getCryptoObject() != null)
            {
                return new getCryptoObject(getcryptoobject.getCryptoObject());
            }
        }
        return null;
    }

    public void authenticate(Context context, getCryptoObject getcryptoobject, int i, CancellationSignal cancellationsignal, getCryptoObject getcryptoobject1, Handler handler)
    {
        getCryptoObject getcryptoobject2 = wrapCryptoObject(getcryptoobject);
        if (cancellationsignal != null)
        {
            getcryptoobject = ((wrapCryptoObject) (cancellationsignal.getCancellationSignalObject()));
        } else
        {
            getcryptoobject = null;
        }
        FingerprintManagerCompatApi23.authenticate(context, getcryptoobject2, i, getcryptoobject, wrapCallback(getcryptoobject1), handler);
    }

    public boolean hasEnrolledFingerprints(Context context)
    {
        return FingerprintManagerCompatApi23.hasEnrolledFingerprints(context);
    }

    public boolean isHardwareDetected(Context context)
    {
        return FingerprintManagerCompatApi23.isHardwareDetected(context);
    }


    public ()
    {
    }
}
