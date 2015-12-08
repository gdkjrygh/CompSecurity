// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class FingerprintManagerCompatApi23
{
    public static abstract class AuthenticationCallback
    {

        public void onAuthenticationError(int i, CharSequence charsequence)
        {
        }

        public void onAuthenticationFailed()
        {
        }

        public void onAuthenticationHelp(int i, CharSequence charsequence)
        {
        }

        public void onAuthenticationSucceeded(AuthenticationResultInternal authenticationresultinternal)
        {
        }

        public AuthenticationCallback()
        {
        }
    }

    public static final class AuthenticationResultInternal
    {

        private CryptoObject mCryptoObject;

        public CryptoObject getCryptoObject()
        {
            return mCryptoObject;
        }

        public AuthenticationResultInternal(CryptoObject cryptoobject)
        {
            mCryptoObject = cryptoobject;
        }
    }

    public static class CryptoObject
    {

        private final Cipher mCipher;
        private final Mac mMac;
        private final Signature mSignature;

        public Cipher getCipher()
        {
            return mCipher;
        }

        public Mac getMac()
        {
            return mMac;
        }

        public Signature getSignature()
        {
            return mSignature;
        }

        public CryptoObject(Signature signature)
        {
            mSignature = signature;
            mCipher = null;
            mMac = null;
        }

        public CryptoObject(Cipher cipher)
        {
            mCipher = cipher;
            mSignature = null;
            mMac = null;
        }

        public CryptoObject(Mac mac)
        {
            mMac = mac;
            mCipher = null;
            mSignature = null;
        }
    }


    public FingerprintManagerCompatApi23()
    {
    }

    public static void authenticate(Context context, CryptoObject cryptoobject, int i, Object obj, AuthenticationCallback authenticationcallback, Handler handler)
    {
        getFingerprintManager(context).authenticate(wrapCryptoObject(cryptoobject), (CancellationSignal)obj, i, wrapCallback(authenticationcallback), handler);
    }

    private static FingerprintManager getFingerprintManager(Context context)
    {
        return (FingerprintManager)context.getSystemService(android/hardware/fingerprint/FingerprintManager);
    }

    public static boolean hasEnrolledFingerprints(Context context)
    {
        return getFingerprintManager(context).hasEnrolledFingerprints();
    }

    public static boolean isHardwareDetected(Context context)
    {
        return getFingerprintManager(context).isHardwareDetected();
    }

    private static CryptoObject unwrapCryptoObject(android.hardware.fingerprint.FingerprintManager.CryptoObject cryptoobject)
    {
        if (cryptoobject != null)
        {
            if (cryptoobject.getCipher() != null)
            {
                return new CryptoObject(cryptoobject.getCipher());
            }
            if (cryptoobject.getSignature() != null)
            {
                return new CryptoObject(cryptoobject.getSignature());
            }
            if (cryptoobject.getMac() != null)
            {
                return new CryptoObject(cryptoobject.getMac());
            }
        }
        return null;
    }

    private static android.hardware.fingerprint.FingerprintManager.AuthenticationCallback wrapCallback(AuthenticationCallback authenticationcallback)
    {
        return new android.hardware.fingerprint.FingerprintManager.AuthenticationCallback(authenticationcallback) {

            final AuthenticationCallback val$callback;

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

            public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult authenticationresult)
            {
                callback.onAuthenticationSucceeded(new AuthenticationResultInternal(FingerprintManagerCompatApi23.unwrapCryptoObject(authenticationresult.getCryptoObject())));
            }

            
            {
                callback = authenticationcallback;
                super();
            }
        };
    }

    private static android.hardware.fingerprint.FingerprintManager.CryptoObject wrapCryptoObject(CryptoObject cryptoobject)
    {
        if (cryptoobject != null)
        {
            if (cryptoobject.getCipher() != null)
            {
                return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoobject.getCipher());
            }
            if (cryptoobject.getSignature() != null)
            {
                return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoobject.getSignature());
            }
            if (cryptoobject.getMac() != null)
            {
                return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoobject.getMac());
            }
        }
        return null;
    }

}
