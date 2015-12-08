.class public Lorg/spongycastle/asn1/misc/CAST5CBCParameters;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/asn1/ASN1Integer;

.field b:Lorg/spongycastle/asn1/ASN1OctetString;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 44
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1OctetString;

    iput-object v0, p0, Lorg/spongycastle/asn1/misc/CAST5CBCParameters;->b:Lorg/spongycastle/asn1/ASN1OctetString;

    .line 45
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Integer;

    iput-object v0, p0, Lorg/spongycastle/asn1/misc/CAST5CBCParameters;->a:Lorg/spongycastle/asn1/ASN1Integer;

    .line 46
    return-void
.end method

.method public constructor <init>([BI)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 37
    new-instance v0, Lorg/spongycastle/asn1/DEROctetString;

    invoke-direct {v0, p1}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    iput-object v0, p0, Lorg/spongycastle/asn1/misc/CAST5CBCParameters;->b:Lorg/spongycastle/asn1/ASN1OctetString;

    .line 38
    new-instance v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v0, p2}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    iput-object v0, p0, Lorg/spongycastle/asn1/misc/CAST5CBCParameters;->a:Lorg/spongycastle/asn1/ASN1Integer;

    .line 39
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/misc/CAST5CBCParameters;
    .locals 2

    .prologue
    .line 21
    instance-of v0, p0, Lorg/spongycastle/asn1/misc/CAST5CBCParameters;

    if-eqz v0, :cond_0

    .line 23
    check-cast p0, Lorg/spongycastle/asn1/misc/CAST5CBCParameters;

    .line 30
    :goto_0
    return-object p0

    .line 25
    :cond_0
    if-eqz p0, :cond_1

    .line 27
    new-instance v0, Lorg/spongycastle/asn1/misc/CAST5CBCParameters;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/misc/CAST5CBCParameters;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 30
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 71
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 73
    iget-object v1, p0, Lorg/spongycastle/asn1/misc/CAST5CBCParameters;->b:Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 74
    iget-object v1, p0, Lorg/spongycastle/asn1/misc/CAST5CBCParameters;->a:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 76
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()[B
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lorg/spongycastle/asn1/misc/CAST5CBCParameters;->b:Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lorg/spongycastle/asn1/misc/CAST5CBCParameters;->a:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    return v0
.end method
