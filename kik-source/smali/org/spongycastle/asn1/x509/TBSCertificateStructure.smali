.class public Lorg/spongycastle/asn1/x509/TBSCertificateStructure;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;
.implements Lorg/spongycastle/asn1/x509/X509ObjectIdentifiers;


# instance fields
.field bA:Lorg/spongycastle/asn1/ASN1Integer;

.field bB:Lorg/spongycastle/asn1/ASN1Integer;

.field bC:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

.field bD:Lorg/spongycastle/asn1/x500/X500Name;

.field bE:Lorg/spongycastle/asn1/x509/Time;

.field bF:Lorg/spongycastle/asn1/x509/Time;

.field bG:Lorg/spongycastle/asn1/x500/X500Name;

.field bH:Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

.field bI:Lorg/spongycastle/asn1/DERBitString;

.field bJ:Lorg/spongycastle/asn1/DERBitString;

.field bK:Lorg/spongycastle/asn1/x509/X509Extensions;

.field bz:Lorg/spongycastle/asn1/ASN1Sequence;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 74
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 77
    iput-object p1, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bz:Lorg/spongycastle/asn1/ASN1Sequence;

    .line 82
    invoke-virtual {p1, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    instance-of v0, v0, Lorg/spongycastle/asn1/DERTaggedObject;

    if-eqz v0, :cond_0

    .line 84
    invoke-virtual {p1, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    invoke-static {v0, v3}, Lorg/spongycastle/asn1/ASN1Integer;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bA:Lorg/spongycastle/asn1/ASN1Integer;

    move v1, v2

    .line 92
    :goto_0
    add-int/lit8 v0, v1, 0x1

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Integer;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bB:Lorg/spongycastle/asn1/ASN1Integer;

    .line 94
    add-int/lit8 v0, v1, 0x2

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bC:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    .line 95
    add-int/lit8 v0, v1, 0x3

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x500/X500Name;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bD:Lorg/spongycastle/asn1/x500/X500Name;

    .line 100
    add-int/lit8 v0, v1, 0x4

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 102
    invoke-virtual {v0, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/x509/Time;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/Time;

    move-result-object v2

    iput-object v2, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bE:Lorg/spongycastle/asn1/x509/Time;

    .line 103
    invoke-virtual {v0, v3}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/Time;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/Time;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bF:Lorg/spongycastle/asn1/x509/Time;

    .line 105
    add-int/lit8 v0, v1, 0x5

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x500/X500Name;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bG:Lorg/spongycastle/asn1/x500/X500Name;

    .line 110
    add-int/lit8 v0, v1, 0x6

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bH:Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

    .line 112
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    add-int/lit8 v2, v1, 0x6

    sub-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_1
    if-lez v2, :cond_1

    .line 114
    add-int/lit8 v0, v1, 0x6

    add-int/2addr v0, v2

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DERTaggedObject;

    .line 116
    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERTaggedObject;->c()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    .line 112
    :goto_2
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_1

    .line 88
    :cond_0
    const/4 v0, -0x1

    .line 89
    new-instance v1, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    iput-object v1, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bA:Lorg/spongycastle/asn1/ASN1Integer;

    move v1, v0

    goto/16 :goto_0

    .line 119
    :pswitch_0
    invoke-static {v0}, Lorg/spongycastle/asn1/DERBitString;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/DERBitString;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bI:Lorg/spongycastle/asn1/DERBitString;

    goto :goto_2

    .line 122
    :pswitch_1
    invoke-static {v0}, Lorg/spongycastle/asn1/DERBitString;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/DERBitString;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bJ:Lorg/spongycastle/asn1/DERBitString;

    goto :goto_2

    .line 125
    :pswitch_2
    invoke-static {v0}, Lorg/spongycastle/asn1/x509/X509Extensions;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/X509Extensions;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bK:Lorg/spongycastle/asn1/x509/X509Extensions;

    goto :goto_2

    .line 128
    :cond_1
    return-void

    .line 116
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/TBSCertificateStructure;
    .locals 2

    .prologue
    .line 60
    instance-of v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    if-eqz v0, :cond_0

    .line 62
    check-cast p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    .line 69
    :goto_0
    return-object p0

    .line 64
    :cond_0
    if-eqz p0, :cond_1

    .line 66
    new-instance v0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 69
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bz:Lorg/spongycastle/asn1/ASN1Sequence;

    return-object v0
.end method

.method public final c()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bC:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/x500/X500Name;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bD:Lorg/spongycastle/asn1/x500/X500Name;

    return-object v0
.end method

.method public final e()Lorg/spongycastle/asn1/x500/X500Name;
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bG:Lorg/spongycastle/asn1/x500/X500Name;

    return-object v0
.end method

.method public final f()Lorg/spongycastle/asn1/DERBitString;
    .locals 1

    .prologue
    .line 177
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bI:Lorg/spongycastle/asn1/DERBitString;

    return-object v0
.end method

.method public final g()Lorg/spongycastle/asn1/DERBitString;
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bJ:Lorg/spongycastle/asn1/DERBitString;

    return-object v0
.end method

.method public final h()Lorg/spongycastle/asn1/x509/X509Extensions;
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->bK:Lorg/spongycastle/asn1/x509/X509Extensions;

    return-object v0
.end method
