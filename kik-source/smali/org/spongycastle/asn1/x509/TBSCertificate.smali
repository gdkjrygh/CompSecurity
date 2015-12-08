.class public Lorg/spongycastle/asn1/x509/TBSCertificate;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/asn1/ASN1Sequence;

.field b:Lorg/spongycastle/asn1/ASN1Integer;

.field c:Lorg/spongycastle/asn1/ASN1Integer;

.field d:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

.field e:Lorg/spongycastle/asn1/x500/X500Name;

.field f:Lorg/spongycastle/asn1/x509/Time;

.field g:Lorg/spongycastle/asn1/x509/Time;

.field h:Lorg/spongycastle/asn1/x500/X500Name;

.field i:Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

.field j:Lorg/spongycastle/asn1/DERBitString;

.field k:Lorg/spongycastle/asn1/DERBitString;

.field l:Lorg/spongycastle/asn1/x509/Extensions;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 72
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 75
    iput-object p1, p0, Lorg/spongycastle/asn1/x509/TBSCertificate;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    .line 80
    invoke-virtual {p1, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    instance-of v0, v0, Lorg/spongycastle/asn1/DERTaggedObject;

    if-eqz v0, :cond_0

    .line 82
    invoke-virtual {p1, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    invoke-static {v0, v4}, Lorg/spongycastle/asn1/ASN1Integer;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificate;->b:Lorg/spongycastle/asn1/ASN1Integer;

    move v1, v2

    .line 90
    :goto_0
    add-int/lit8 v0, v1, 0x1

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Integer;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificate;->c:Lorg/spongycastle/asn1/ASN1Integer;

    .line 92
    add-int/lit8 v0, v1, 0x2

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificate;->d:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    .line 93
    add-int/lit8 v0, v1, 0x3

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x500/X500Name;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificate;->e:Lorg/spongycastle/asn1/x500/X500Name;

    .line 98
    add-int/lit8 v0, v1, 0x4

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 100
    invoke-virtual {v0, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/x509/Time;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/Time;

    move-result-object v2

    iput-object v2, p0, Lorg/spongycastle/asn1/x509/TBSCertificate;->f:Lorg/spongycastle/asn1/x509/Time;

    .line 101
    invoke-virtual {v0, v4}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/Time;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/Time;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificate;->g:Lorg/spongycastle/asn1/x509/Time;

    .line 103
    add-int/lit8 v0, v1, 0x5

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x500/X500Name;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificate;->h:Lorg/spongycastle/asn1/x500/X500Name;

    .line 108
    add-int/lit8 v0, v1, 0x6

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificate;->i:Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

    .line 110
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    add-int/lit8 v2, v1, 0x6

    sub-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_1
    if-lez v2, :cond_1

    .line 112
    add-int/lit8 v0, v1, 0x6

    add-int/2addr v0, v2

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DERTaggedObject;

    .line 114
    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERTaggedObject;->c()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    .line 110
    :goto_2
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_1

    .line 86
    :cond_0
    const/4 v0, -0x1

    .line 87
    new-instance v1, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    iput-object v1, p0, Lorg/spongycastle/asn1/x509/TBSCertificate;->b:Lorg/spongycastle/asn1/ASN1Integer;

    move v1, v0

    goto/16 :goto_0

    .line 117
    :pswitch_0
    invoke-static {v0}, Lorg/spongycastle/asn1/DERBitString;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/DERBitString;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificate;->j:Lorg/spongycastle/asn1/DERBitString;

    goto :goto_2

    .line 120
    :pswitch_1
    invoke-static {v0}, Lorg/spongycastle/asn1/DERBitString;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/DERBitString;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificate;->k:Lorg/spongycastle/asn1/DERBitString;

    goto :goto_2

    .line 123
    :pswitch_2
    invoke-static {v0, v4}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/Extensions;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/Extensions;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificate;->l:Lorg/spongycastle/asn1/x509/Extensions;

    goto :goto_2

    .line 126
    :cond_1
    return-void

    .line 114
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/TBSCertificate;
    .locals 2

    .prologue
    .line 58
    instance-of v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificate;

    if-eqz v0, :cond_0

    .line 60
    check-cast p0, Lorg/spongycastle/asn1/x509/TBSCertificate;

    .line 67
    :goto_0
    return-object p0

    .line 62
    :cond_0
    if-eqz p0, :cond_1

    .line 64
    new-instance v0, Lorg/spongycastle/asn1/x509/TBSCertificate;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/TBSCertificate;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 67
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertificate;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    return-object v0
.end method
