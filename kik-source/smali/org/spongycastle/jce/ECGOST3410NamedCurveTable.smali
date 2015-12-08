.class public Lorg/spongycastle/jce/ECGOST3410NamedCurveTable;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lorg/spongycastle/jce/spec/ECNamedCurveParameterSpec;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 25
    invoke-static {p0}, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->a(Ljava/lang/String;)Lorg/spongycastle/crypto/params/ECDomainParameters;

    move-result-object v1

    .line 26
    if-nez v1, :cond_0

    .line 30
    :try_start_0
    new-instance v1, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v1, p0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/crypto/params/ECDomainParameters;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 38
    :cond_0
    if-nez v1, :cond_1

    .line 43
    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Lorg/spongycastle/jce/spec/ECNamedCurveParameterSpec;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/ECDomainParameters;->a()Lorg/spongycastle/math/ec/ECCurve;

    move-result-object v2

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/ECDomainParameters;->b()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v3

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/ECDomainParameters;->c()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/ECDomainParameters;->d()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/ECDomainParameters;->e()[B

    move-result-object v6

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lorg/spongycastle/jce/spec/ECNamedCurveParameterSpec;-><init>(Ljava/lang/String;Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    goto :goto_0

    .line 34
    :catch_0
    move-exception v1

    goto :goto_0
.end method
