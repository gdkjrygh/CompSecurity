.class public Lorg/bouncycastle/asn1/x509/X509CertificateStructure;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;
.implements Lorg/bouncycastle/asn1/x509/X509ObjectIdentifiers;


# instance fields
.field bA:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field bB:Lorg/bouncycastle/asn1/DERBitString;

.field by:Lorg/bouncycastle/asn1/ASN1Sequence;

.field bz:Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;


# direct methods
.method private constructor <init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V
    .locals 2

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->by:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->bz:Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->b(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->bA:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERBitString;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->bB:Lorg/bouncycastle/asn1/DERBitString;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "sequence wrong size for a certificate"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509CertificateStructure;
    .locals 2

    instance-of v0, p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    :goto_0
    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method

.method public static a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/x509/X509CertificateStructure;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->by:Lorg/bouncycastle/asn1/ASN1Sequence;

    return-object v0
.end method

.method public final e()Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->bz:Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->bz:Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;

    iget-object v0, v0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bz:Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final g()Lorg/bouncycastle/asn1/DERInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->bz:Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;

    iget-object v0, v0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bA:Lorg/bouncycastle/asn1/DERInteger;

    return-object v0
.end method

.method public final h()Lorg/bouncycastle/asn1/x509/X509Name;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->bz:Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;

    iget-object v0, v0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bC:Lorg/bouncycastle/asn1/x509/X509Name;

    return-object v0
.end method

.method public final i()Lorg/bouncycastle/asn1/x509/Time;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->bz:Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;

    iget-object v0, v0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bD:Lorg/bouncycastle/asn1/x509/Time;

    return-object v0
.end method

.method public final j()Lorg/bouncycastle/asn1/x509/Time;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->bz:Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;

    iget-object v0, v0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bE:Lorg/bouncycastle/asn1/x509/Time;

    return-object v0
.end method

.method public final k()Lorg/bouncycastle/asn1/x509/X509Name;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->bz:Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;

    iget-object v0, v0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bF:Lorg/bouncycastle/asn1/x509/X509Name;

    return-object v0
.end method

.method public final l()Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->bz:Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;

    iget-object v0, v0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bG:Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    return-object v0
.end method

.method public final m()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->bA:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    return-object v0
.end method

.method public final n()Lorg/bouncycastle/asn1/DERBitString;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->bB:Lorg/bouncycastle/asn1/DERBitString;

    return-object v0
.end method
