// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            X509Extensions

public class KeyPurposeId extends ASN1ObjectIdentifier
{

    public static final KeyPurposeId anyExtendedKeyUsage;
    private static final String id_kp = "1.3.6.1.5.5.7.3";
    public static final KeyPurposeId id_kp_OCSPSigning = new KeyPurposeId("1.3.6.1.5.5.7.3.9");
    public static final KeyPurposeId id_kp_capwapAC = new KeyPurposeId("1.3.6.1.5.5.7.3.18");
    public static final KeyPurposeId id_kp_capwapWTP = new KeyPurposeId("1.3.6.1.5.5.7.3.19");
    public static final KeyPurposeId id_kp_clientAuth = new KeyPurposeId("1.3.6.1.5.5.7.3.2");
    public static final KeyPurposeId id_kp_codeSigning = new KeyPurposeId("1.3.6.1.5.5.7.3.3");
    public static final KeyPurposeId id_kp_dvcs = new KeyPurposeId("1.3.6.1.5.5.7.3.10");
    public static final KeyPurposeId id_kp_eapOverLAN = new KeyPurposeId("1.3.6.1.5.5.7.3.14");
    public static final KeyPurposeId id_kp_eapOverPPP = new KeyPurposeId("1.3.6.1.5.5.7.3.13");
    public static final KeyPurposeId id_kp_emailProtection = new KeyPurposeId("1.3.6.1.5.5.7.3.4");
    public static final KeyPurposeId id_kp_ipsecEndSystem = new KeyPurposeId("1.3.6.1.5.5.7.3.5");
    public static final KeyPurposeId id_kp_ipsecIKE = new KeyPurposeId("1.3.6.1.5.5.7.3.17");
    public static final KeyPurposeId id_kp_ipsecTunnel = new KeyPurposeId("1.3.6.1.5.5.7.3.6");
    public static final KeyPurposeId id_kp_ipsecUser = new KeyPurposeId("1.3.6.1.5.5.7.3.7");
    public static final KeyPurposeId id_kp_sbgpCertAAServerAuth = new KeyPurposeId("1.3.6.1.5.5.7.3.11");
    public static final KeyPurposeId id_kp_scvpClient = new KeyPurposeId("1.3.6.1.5.5.7.3.16");
    public static final KeyPurposeId id_kp_scvpServer = new KeyPurposeId("1.3.6.1.5.5.7.3.15");
    public static final KeyPurposeId id_kp_scvp_responder = new KeyPurposeId("1.3.6.1.5.5.7.3.12");
    public static final KeyPurposeId id_kp_serverAuth = new KeyPurposeId("1.3.6.1.5.5.7.3.1");
    public static final KeyPurposeId id_kp_smartcardlogon = new KeyPurposeId("1.3.6.1.4.1.311.20.2.2");
    public static final KeyPurposeId id_kp_timeStamping = new KeyPurposeId("1.3.6.1.5.5.7.3.8");

    public KeyPurposeId(String s)
    {
        super(s);
    }

    static 
    {
        anyExtendedKeyUsage = new KeyPurposeId((new StringBuilder()).append(X509Extensions.ExtendedKeyUsage.getId()).append(".0").toString());
    }
}
