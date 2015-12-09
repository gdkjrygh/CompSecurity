// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.emv;

import com.google.android.apps.wallet.hce.iso7816.ResponseApdu;
import java.security.GeneralSecurityException;

public interface Applet
{

    public abstract ResponseApdu processCommand(byte abyte0[], int i)
        throws GeneralSecurityException;
}
