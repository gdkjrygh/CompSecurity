.class public Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field a:I

.field b:Lorg/bouncycastle/asn1/DERInteger;

.field c:Lorg/bouncycastle/asn1/DERInteger;

.field d:Lorg/bouncycastle/asn1/DERInteger;


# direct methods
.method public constructor <init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    const/16 v0, 0x400

    iput v0, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;->a:I

    new-instance v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;->b:Lorg/bouncycastle/asn1/DERInteger;

    new-instance v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-direct {v0, p2}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;->c:Lorg/bouncycastle/asn1/DERInteger;

    new-instance v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-direct {v0, p3}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;->d:Lorg/bouncycastle/asn1/DERInteger;

    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 3

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    new-instance v1, Lorg/bouncycastle/asn1/DERInteger;

    iget v2, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;->a:I

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/DERInteger;-><init>(I)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;->b:Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;->c:Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;->d:Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final e()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;->b:Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->f()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;->c:Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->f()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public final g()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410ParamSetParameters;->d:Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->f()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method
