.class public Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;
.implements Lorg/bouncycastle/asn1/x509/X509ObjectIdentifiers;


# instance fields
.field bA:Lorg/bouncycastle/asn1/DERInteger;

.field bB:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field bC:Lorg/bouncycastle/asn1/x509/X509Name;

.field bD:Lorg/bouncycastle/asn1/x509/Time;

.field bE:Lorg/bouncycastle/asn1/x509/Time;

.field bF:Lorg/bouncycastle/asn1/x509/X509Name;

.field bG:Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

.field bH:Lorg/bouncycastle/asn1/DERBitString;

.field bI:Lorg/bouncycastle/asn1/DERBitString;

.field bJ:Lorg/bouncycastle/asn1/x509/X509Extensions;

.field by:Lorg/bouncycastle/asn1/ASN1Sequence;

.field bz:Lorg/bouncycastle/asn1/DERInteger;


# direct methods
.method private constructor <init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->by:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {p1, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    instance-of v0, v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    invoke-static {v0, v3}, Lorg/bouncycastle/asn1/DERInteger;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bz:Lorg/bouncycastle/asn1/DERInteger;

    move v1, v2

    :goto_0
    add-int/lit8 v0, v1, 0x1

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERInteger;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bA:Lorg/bouncycastle/asn1/DERInteger;

    add-int/lit8 v0, v1, 0x2

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->b(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bB:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    add-int/lit8 v0, v1, 0x3

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/X509Name;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509Name;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bC:Lorg/bouncycastle/asn1/x509/X509Name;

    add-int/lit8 v0, v1, 0x4

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {v0, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/asn1/x509/Time;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/Time;

    move-result-object v2

    iput-object v2, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bD:Lorg/bouncycastle/asn1/x509/Time;

    invoke-virtual {v0, v3}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/Time;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/Time;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bE:Lorg/bouncycastle/asn1/x509/Time;

    add-int/lit8 v0, v1, 0x5

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/X509Name;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509Name;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bF:Lorg/bouncycastle/asn1/x509/X509Name;

    add-int/lit8 v0, v1, 0x6

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bG:Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v0

    add-int/lit8 v2, v1, 0x6

    sub-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_1
    if-lez v2, :cond_1

    add-int/lit8 v0, v1, 0x6

    add-int/2addr v0, v2

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERTaggedObject;->e()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    :goto_2
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_1

    :cond_0
    const/4 v0, -0x1

    new-instance v1, Lorg/bouncycastle/asn1/DERInteger;

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/DERInteger;-><init>(I)V

    iput-object v1, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bz:Lorg/bouncycastle/asn1/DERInteger;

    move v1, v0

    goto/16 :goto_0

    :pswitch_0
    invoke-static {v0}, Lorg/bouncycastle/asn1/DERBitString;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bH:Lorg/bouncycastle/asn1/DERBitString;

    goto :goto_2

    :pswitch_1
    invoke-static {v0}, Lorg/bouncycastle/asn1/DERBitString;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bI:Lorg/bouncycastle/asn1/DERBitString;

    goto :goto_2

    :pswitch_2
    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/X509Extensions;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509Extensions;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bJ:Lorg/bouncycastle/asn1/x509/X509Extensions;

    goto :goto_2

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;
    .locals 2

    instance-of v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;

    :goto_0
    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->by:Lorg/bouncycastle/asn1/ASN1Sequence;

    return-object v0
.end method

.method public final e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bB:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    return-object v0
.end method

.method public final f()Lorg/bouncycastle/asn1/x509/X509Name;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bC:Lorg/bouncycastle/asn1/x509/X509Name;

    return-object v0
.end method

.method public final g()Lorg/bouncycastle/asn1/x509/X509Name;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bF:Lorg/bouncycastle/asn1/x509/X509Name;

    return-object v0
.end method

.method public final h()Lorg/bouncycastle/asn1/DERBitString;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bH:Lorg/bouncycastle/asn1/DERBitString;

    return-object v0
.end method

.method public final i()Lorg/bouncycastle/asn1/DERBitString;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bI:Lorg/bouncycastle/asn1/DERBitString;

    return-object v0
.end method

.method public final j()Lorg/bouncycastle/asn1/x509/X509Extensions;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->bJ:Lorg/bouncycastle/asn1/x509/X509Extensions;

    return-object v0
.end method
