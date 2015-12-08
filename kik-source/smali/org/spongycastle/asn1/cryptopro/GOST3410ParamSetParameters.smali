.class public Lorg/spongycastle/asn1/cryptopro/GOST3410ParamSetParameters;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field a:I

.field b:Lorg/spongycastle/asn1/ASN1Integer;

.field c:Lorg/spongycastle/asn1/ASN1Integer;

.field d:Lorg/spongycastle/asn1/ASN1Integer;


# direct methods
.method public constructor <init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 49
    const/16 v0, 0x400

    iput v0, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410ParamSetParameters;->a:I

    .line 50
    new-instance v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v0, p1}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410ParamSetParameters;->b:Lorg/spongycastle/asn1/ASN1Integer;

    .line 51
    new-instance v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v0, p2}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410ParamSetParameters;->c:Lorg/spongycastle/asn1/ASN1Integer;

    .line 52
    new-instance v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v0, p3}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410ParamSetParameters;->d:Lorg/spongycastle/asn1/ASN1Integer;

    .line 53
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 3

    .prologue
    .line 96
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 98
    new-instance v1, Lorg/spongycastle/asn1/ASN1Integer;

    iget v2, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410ParamSetParameters;->a:I

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 99
    iget-object v1, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410ParamSetParameters;->b:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 100
    iget-object v1, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410ParamSetParameters;->c:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 101
    iget-object v1, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410ParamSetParameters;->d:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 103
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410ParamSetParameters;->b:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->d()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410ParamSetParameters;->c:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->d()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410ParamSetParameters;->d:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->d()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method
