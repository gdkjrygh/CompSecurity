.class public Lorg/spongycastle/asn1/x509/X509CertificateStructure;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;
.implements Lorg/spongycastle/asn1/x509/X509ObjectIdentifiers;


# instance fields
.field bA:Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

.field bB:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

.field bC:Lorg/spongycastle/asn1/DERBitString;

.field bz:Lorg/spongycastle/asn1/ASN1Sequence;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 2

    .prologue
    .line 56
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 57
    iput-object p1, p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->bz:Lorg/spongycastle/asn1/ASN1Sequence;

    .line 62
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 64
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->bA:Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    .line 65
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->bB:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    .line 67
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/DERBitString;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/DERBitString;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->bC:Lorg/spongycastle/asn1/DERBitString;

    return-void

    .line 71
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "sequence wrong size for a certificate"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/X509CertificateStructure;
    .locals 2

    .prologue
    .line 42
    instance-of v0, p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    if-eqz v0, :cond_0

    .line 44
    check-cast p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    .line 51
    :goto_0
    return-object p0

    .line 46
    :cond_0
    if-eqz p0, :cond_1

    .line 48
    new-instance v0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 51
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/X509CertificateStructure;
    .locals 1

    .prologue
    .line 36
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->bz:Lorg/spongycastle/asn1/ASN1Sequence;

    return-object v0
.end method

.method public final c()Lorg/spongycastle/asn1/x509/TBSCertificateStructure;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->bA:Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    return-object v0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->bA:Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    iget-object v0, v0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bA:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final e()Lorg/spongycastle/asn1/ASN1Integer;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->bA:Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    iget-object v0, v0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bB:Lorg/spongycastle/asn1/ASN1Integer;

    return-object v0
.end method

.method public final f()Lorg/spongycastle/asn1/x500/X500Name;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->bA:Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    iget-object v0, v0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bD:Lorg/spongycastle/asn1/x500/X500Name;

    return-object v0
.end method

.method public final g()Lorg/spongycastle/asn1/x509/Time;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->bA:Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    iget-object v0, v0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bE:Lorg/spongycastle/asn1/x509/Time;

    return-object v0
.end method

.method public final h()Lorg/spongycastle/asn1/x509/Time;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->bA:Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    iget-object v0, v0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bF:Lorg/spongycastle/asn1/x509/Time;

    return-object v0
.end method

.method public final i()Lorg/spongycastle/asn1/x500/X500Name;
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->bA:Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    iget-object v0, v0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bG:Lorg/spongycastle/asn1/x500/X500Name;

    return-object v0
.end method

.method public final j()Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->bA:Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    iget-object v0, v0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bH:Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

    return-object v0
.end method

.method public final k()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->bB:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    return-object v0
.end method

.method public final l()Lorg/spongycastle/asn1/DERBitString;
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->bC:Lorg/spongycastle/asn1/DERBitString;

    return-object v0
.end method
