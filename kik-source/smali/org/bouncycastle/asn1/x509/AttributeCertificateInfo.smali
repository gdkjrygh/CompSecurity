.class public Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field private a:Lorg/bouncycastle/asn1/DERInteger;

.field private b:Lorg/bouncycastle/asn1/x509/Holder;

.field private c:Lorg/bouncycastle/asn1/x509/AttCertIssuer;

.field private d:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field private e:Lorg/bouncycastle/asn1/DERInteger;

.field private f:Lorg/bouncycastle/asn1/x509/AttCertValidityPeriod;

.field private g:Lorg/bouncycastle/asn1/ASN1Sequence;

.field private h:Lorg/bouncycastle/asn1/DERBitString;

.field private i:Lorg/bouncycastle/asn1/x509/X509Extensions;


# direct methods
.method private constructor <init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V
    .locals 3

    const/4 v0, 0x7

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v1

    if-lt v1, v0, :cond_0

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v1

    const/16 v2, 0x9

    if-le v1, v2, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad sequence size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/DERInteger;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->a:Lorg/bouncycastle/asn1/DERInteger;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/Holder;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/Holder;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->b:Lorg/bouncycastle/asn1/x509/Holder;

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/AttCertIssuer;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/AttCertIssuer;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->c:Lorg/bouncycastle/asn1/x509/AttCertIssuer;

    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->b(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->d:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    const/4 v1, 0x4

    invoke-virtual {p1, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/DERInteger;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->e:Lorg/bouncycastle/asn1/DERInteger;

    const/4 v1, 0x5

    invoke-virtual {p1, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/AttCertValidityPeriod;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/AttCertValidityPeriod;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->f:Lorg/bouncycastle/asn1/x509/AttCertValidityPeriod;

    const/4 v1, 0x6

    invoke-virtual {p1, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->g:Lorg/bouncycastle/asn1/ASN1Sequence;

    move v1, v0

    :goto_0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v0

    if-ge v1, v0, :cond_5

    invoke-virtual {p1, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Encodable;

    instance-of v2, v0, Lorg/bouncycastle/asn1/DERBitString;

    if-eqz v2, :cond_3

    invoke-virtual {p1, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERBitString;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->h:Lorg/bouncycastle/asn1/DERBitString;

    :cond_2
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_3
    instance-of v2, v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    if-nez v2, :cond_4

    instance-of v0, v0, Lorg/bouncycastle/asn1/x509/X509Extensions;

    if-eqz v0, :cond_2

    :cond_4
    invoke-virtual {p1, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/X509Extensions;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509Extensions;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->i:Lorg/bouncycastle/asn1/x509/X509Extensions;

    goto :goto_1

    :cond_5
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;
    .locals 3

    instance-of v0, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;

    :goto_0
    return-object p0

    :cond_0
    instance-of v0, p0, Lorg/bouncycastle/asn1/ASN1Sequence;

    if-eqz v0, :cond_1

    new-instance v0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;

    check-cast p0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown object in factory: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->a:Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->b:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->c:Lorg/bouncycastle/asn1/x509/AttCertIssuer;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->d:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->e:Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->f:Lorg/bouncycastle/asn1/x509/AttCertValidityPeriod;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->g:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->h:Lorg/bouncycastle/asn1/DERBitString;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->h:Lorg/bouncycastle/asn1/DERBitString;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->i:Lorg/bouncycastle/asn1/x509/X509Extensions;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->i:Lorg/bouncycastle/asn1/x509/X509Extensions;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_1
    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final e()Lorg/bouncycastle/asn1/x509/Holder;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->b:Lorg/bouncycastle/asn1/x509/Holder;

    return-object v0
.end method

.method public final f()Lorg/bouncycastle/asn1/x509/AttCertIssuer;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->c:Lorg/bouncycastle/asn1/x509/AttCertIssuer;

    return-object v0
.end method

.method public final g()Lorg/bouncycastle/asn1/DERInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->e:Lorg/bouncycastle/asn1/DERInteger;

    return-object v0
.end method

.method public final h()Lorg/bouncycastle/asn1/x509/AttCertValidityPeriod;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->f:Lorg/bouncycastle/asn1/x509/AttCertValidityPeriod;

    return-object v0
.end method

.method public final i()Lorg/bouncycastle/asn1/ASN1Sequence;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->g:Lorg/bouncycastle/asn1/ASN1Sequence;

    return-object v0
.end method

.method public final j()Lorg/bouncycastle/asn1/x509/X509Extensions;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/AttributeCertificateInfo;->i:Lorg/bouncycastle/asn1/x509/X509Extensions;

    return-object v0
.end method
