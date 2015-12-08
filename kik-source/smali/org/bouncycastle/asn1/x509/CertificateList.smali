.class public Lorg/bouncycastle/asn1/x509/CertificateList;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field a:Lorg/bouncycastle/asn1/x509/TBSCertList;

.field b:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field c:Lorg/bouncycastle/asn1/DERBitString;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V
    .locals 2

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/TBSCertList;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/TBSCertList;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/CertificateList;->a:Lorg/bouncycastle/asn1/x509/TBSCertList;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->b(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/CertificateList;->b:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERBitString;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/CertificateList;->c:Lorg/bouncycastle/asn1/DERBitString;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "sequence wrong size for CertificateList"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/CertificateList;
    .locals 2

    instance-of v0, p0, Lorg/bouncycastle/asn1/x509/CertificateList;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/bouncycastle/asn1/x509/CertificateList;

    :goto_0
    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, Lorg/bouncycastle/asn1/x509/CertificateList;

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/CertificateList;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/CertificateList;->a:Lorg/bouncycastle/asn1/x509/TBSCertList;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/CertificateList;->b:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/CertificateList;->c:Lorg/bouncycastle/asn1/DERBitString;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final e()Lorg/bouncycastle/asn1/x509/TBSCertList;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/CertificateList;->a:Lorg/bouncycastle/asn1/x509/TBSCertList;

    return-object v0
.end method

.method public final f()[Lorg/bouncycastle/asn1/x509/TBSCertList$CRLEntry;
    .locals 5

    const/4 v0, 0x0

    iget-object v2, p0, Lorg/bouncycastle/asn1/x509/CertificateList;->a:Lorg/bouncycastle/asn1/x509/TBSCertList;

    iget-object v1, v2, Lorg/bouncycastle/asn1/x509/TBSCertList;->g:Lorg/bouncycastle/asn1/ASN1Sequence;

    if-nez v1, :cond_0

    new-array v0, v0, [Lorg/bouncycastle/asn1/x509/TBSCertList$CRLEntry;

    :goto_0
    return-object v0

    :cond_0
    iget-object v1, v2, Lorg/bouncycastle/asn1/x509/TBSCertList;->g:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v1

    new-array v1, v1, [Lorg/bouncycastle/asn1/x509/TBSCertList$CRLEntry;

    :goto_1
    array-length v3, v1

    if-ge v0, v3, :cond_1

    new-instance v3, Lorg/bouncycastle/asn1/x509/TBSCertList$CRLEntry;

    iget-object v4, v2, Lorg/bouncycastle/asn1/x509/TBSCertList;->g:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {v4, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v4

    invoke-static {v4}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v4

    invoke-direct {v3, v4}, Lorg/bouncycastle/asn1/x509/TBSCertList$CRLEntry;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    aput-object v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method public final g()Ljava/util/Enumeration;
    .locals 3

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/CertificateList;->a:Lorg/bouncycastle/asn1/x509/TBSCertList;

    iget-object v0, v1, Lorg/bouncycastle/asn1/x509/TBSCertList;->g:Lorg/bouncycastle/asn1/ASN1Sequence;

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/asn1/x509/TBSCertList$a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/asn1/x509/TBSCertList$a;-><init>(Lorg/bouncycastle/asn1/x509/TBSCertList;B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/bouncycastle/asn1/x509/TBSCertList$b;

    iget-object v2, v1, Lorg/bouncycastle/asn1/x509/TBSCertList;->g:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->e()Ljava/util/Enumeration;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/asn1/x509/TBSCertList$b;-><init>(Lorg/bouncycastle/asn1/x509/TBSCertList;Ljava/util/Enumeration;)V

    goto :goto_0
.end method

.method public final h()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/CertificateList;->b:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    return-object v0
.end method

.method public final i()Lorg/bouncycastle/asn1/DERBitString;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/CertificateList;->c:Lorg/bouncycastle/asn1/DERBitString;

    return-object v0
.end method

.method public final j()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/CertificateList;->a:Lorg/bouncycastle/asn1/x509/TBSCertList;

    iget-object v0, v0, Lorg/bouncycastle/asn1/x509/TBSCertList;->b:Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final k()Lorg/bouncycastle/asn1/x509/X509Name;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/CertificateList;->a:Lorg/bouncycastle/asn1/x509/TBSCertList;

    iget-object v0, v0, Lorg/bouncycastle/asn1/x509/TBSCertList;->d:Lorg/bouncycastle/asn1/x509/X509Name;

    return-object v0
.end method

.method public final l()Lorg/bouncycastle/asn1/x509/Time;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/CertificateList;->a:Lorg/bouncycastle/asn1/x509/TBSCertList;

    iget-object v0, v0, Lorg/bouncycastle/asn1/x509/TBSCertList;->e:Lorg/bouncycastle/asn1/x509/Time;

    return-object v0
.end method

.method public final m()Lorg/bouncycastle/asn1/x509/Time;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/CertificateList;->a:Lorg/bouncycastle/asn1/x509/TBSCertList;

    iget-object v0, v0, Lorg/bouncycastle/asn1/x509/TBSCertList;->f:Lorg/bouncycastle/asn1/x509/Time;

    return-object v0
.end method
