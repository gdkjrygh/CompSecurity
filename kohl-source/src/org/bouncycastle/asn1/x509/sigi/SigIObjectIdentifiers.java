// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509.sigi;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface SigIObjectIdentifiers
{

    public static final ASN1ObjectIdentifier id_sigi = new ASN1ObjectIdentifier("1.3.36.8");
    public static final ASN1ObjectIdentifier id_sigi_cp = new ASN1ObjectIdentifier((new StringBuilder()).append(id_sigi).append(".1").toString());
    public static final ASN1ObjectIdentifier id_sigi_cp_sigconform = new ASN1ObjectIdentifier((new StringBuilder()).append(id_sigi_cp).append(".1").toString());
    public static final ASN1ObjectIdentifier id_sigi_kp = new ASN1ObjectIdentifier((new StringBuilder()).append(id_sigi).append(".2").toString());
    public static final ASN1ObjectIdentifier id_sigi_kp_directoryService = new ASN1ObjectIdentifier((new StringBuilder()).append(id_sigi_kp).append(".1").toString());
    public static final ASN1ObjectIdentifier id_sigi_on = new ASN1ObjectIdentifier((new StringBuilder()).append(id_sigi).append(".4").toString());
    public static final ASN1ObjectIdentifier id_sigi_on_personalData = new ASN1ObjectIdentifier((new StringBuilder()).append(id_sigi_on).append(".1").toString());

}
