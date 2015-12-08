// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

public interface CommitmentTypeIdentifier
{

    public static final ASN1ObjectIdentifier proofOfApproval = PKCSObjectIdentifiers.id_cti_ets_proofOfApproval;
    public static final ASN1ObjectIdentifier proofOfCreation = PKCSObjectIdentifiers.id_cti_ets_proofOfCreation;
    public static final ASN1ObjectIdentifier proofOfDelivery = PKCSObjectIdentifiers.id_cti_ets_proofOfDelivery;
    public static final ASN1ObjectIdentifier proofOfOrigin = PKCSObjectIdentifiers.id_cti_ets_proofOfOrigin;
    public static final ASN1ObjectIdentifier proofOfReceipt = PKCSObjectIdentifiers.id_cti_ets_proofOfReceipt;
    public static final ASN1ObjectIdentifier proofOfSender = PKCSObjectIdentifiers.id_cti_ets_proofOfSender;

}
