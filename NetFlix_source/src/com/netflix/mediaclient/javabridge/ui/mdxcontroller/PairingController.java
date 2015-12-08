// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.mdxcontroller;


public interface PairingController
{

    public static final String PAIRING_VERSION = "1.0";
    public static final String REG_PAIRING_VERSION = "2.0";

    public abstract void deletePairing(String s);

    public abstract void pairingRequest(String s);

    public abstract void registrationPairingRequest(String s);

    public abstract void registrationPairingRequest(String s, String s1);
}
