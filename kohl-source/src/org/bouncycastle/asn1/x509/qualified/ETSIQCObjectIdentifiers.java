// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509.qualified;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface ETSIQCObjectIdentifiers
{

    public static final ASN1ObjectIdentifier id_etsi_qcs = new ASN1ObjectIdentifier("0.4.0.1862.1");
    public static final ASN1ObjectIdentifier id_etsi_qcs_LimiteValue = id_etsi_qcs.branch("2");
    public static final ASN1ObjectIdentifier id_etsi_qcs_QcCompliance = id_etsi_qcs.branch("1");
    public static final ASN1ObjectIdentifier id_etsi_qcs_QcSSCD = id_etsi_qcs.branch("4");
    public static final ASN1ObjectIdentifier id_etsi_qcs_RetentionPeriod = id_etsi_qcs.branch("3");

}
