.class final Lorg/spongycastle/asn1/x9/c;
.super Lorg/spongycastle/asn1/x9/X9ECParametersHolder;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 224
    invoke-direct {p0}, Lorg/spongycastle/asn1/x9/X9ECParametersHolder;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()Lorg/spongycastle/asn1/x9/X9ECParameters;
    .locals 11

    .prologue
    const/16 v10, 0x10

    .line 227
    new-instance v7, Ljava/math/BigInteger;

    const-string v0, "010092537397ECA4F6145799D62B0A19CE06FE26AD"

    invoke-direct {v7, v0, v10}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 228
    const-wide/32 v0, 0xff6e

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v8

    .line 230
    new-instance v0, Lorg/spongycastle/math/ec/ECCurve$F2m;

    const/16 v1, 0xb0

    const/4 v2, 0x1

    const/4 v3, 0x2

    const/16 v4, 0x2b

    new-instance v5, Ljava/math/BigInteger;

    const-string v6, "00E4E6DB2995065C407D9D39B8D0967B96704BA8E9C90B"

    invoke-direct {v5, v6, v10}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    new-instance v6, Ljava/math/BigInteger;

    const-string v9, "005DDA470ABE6414DE8EC133AE28E9BBD7FCEC0AE0FFF2"

    invoke-direct {v6, v9, v10}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    invoke-direct/range {v0 .. v8}, Lorg/spongycastle/math/ec/ECCurve$F2m;-><init>(IIIILjava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 237
    new-instance v4, Lorg/spongycastle/asn1/x9/X9ECParameters;

    const-string v1, "038D16C2866798B600F9F08BB4A8E860F3298CE04A5798"

    invoke-static {v1}, Lorg/spongycastle/util/encoders/Hex;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/math/ec/ECCurve;->a([B)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v6

    const/4 v9, 0x0

    move-object v5, v0

    invoke-direct/range {v4 .. v9}, Lorg/spongycastle/asn1/x9/X9ECParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    return-object v4
.end method
