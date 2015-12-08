// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.hardware.fingerprint;


// Referenced classes of package android.support.v4.hardware.fingerprint:
//            FingerprintManagerCompat

static final class val.callback extends val.callback
{

    final tCryptoObject val$callback;

    public void onAuthenticationError(int i, CharSequence charsequence)
    {
        val$callback.ionError(i, charsequence);
    }

    public void onAuthenticationFailed()
    {
        val$callback.ionFailed();
    }

    public void onAuthenticationHelp(int i, CharSequence charsequence)
    {
        val$callback.ionHelp(i, charsequence);
    }

    public void onAuthenticationSucceeded(ionHelp ionhelp)
    {
        val$callback.ionSucceeded(new ionSucceeded(cess._mth000(ionhelp.tCryptoObject())));
    }

    ( )
    {
        val$callback = ;
        super();
    }
}
