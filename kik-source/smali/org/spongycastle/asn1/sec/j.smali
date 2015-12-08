.class final Lorg/spongycastle/asn1/sec/j;
.super Lorg/spongycastle/asn1/x9/X9ECParametersHolder;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 472
    invoke-direct {p0}, Lorg/spongycastle/asn1/x9/X9ECParametersHolder;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()Lorg/spongycastle/asn1/x9/X9ECParameters;
    .locals 10

    .prologue
    .line 475
    const-string v0, "07A11B09A76B562144418FF3FF8C2570B8"

    invoke-static {v0}, Lorg/spongycastle/asn1/sec/SECNamedCurves;->c(Ljava/lang/String;)Ljava/math/BigInteger;

    move-result-object v5

    .line 481
    const-string v0, "0217C05610884B63B9C6C7291678F9D341"

    invoke-static {v0}, Lorg/spongycastle/asn1/sec/SECNamedCurves;->c(Ljava/lang/String;)Ljava/math/BigInteger;

    move-result-object v6

    .line 482
    const-string v0, "4D696E676875615175985BD3ADBADA21B43A97E2"

    invoke-static {v0}, Lorg/spongycastle/util/encoders/Hex;->a(Ljava/lang/String;)[B

    move-result-object v9

    .line 483
    const-string v0, "0400000000000000023123953A9464B54D"

    invoke-static {v0}, Lorg/spongycastle/asn1/sec/SECNamedCurves;->c(Ljava/lang/String;)Ljava/math/BigInteger;

    move-result-object v7

    .line 484
    const-wide/16 v0, 0x2

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v8

    .line 486
    new-instance v0, Lorg/spongycastle/math/ec/ECCurve$F2m;

    const/16 v1, 0x83

    const/4 v2, 0x2

    const/4 v3, 0x3

    const/16 v4, 0x8

    invoke-direct/range {v0 .. v8}, Lorg/spongycastle/math/ec/ECCurve$F2m;-><init>(IIIILjava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 489
    const-string v1, "040081BAF91FDF9833C40F9C181343638399078C6E7EA38C001F73C8134B1B4EF9E150"

    invoke-static {v1}, Lorg/spongycastle/util/encoders/Hex;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/math/ec/ECCurve;->a([B)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v6

    .line 493
    new-instance v4, Lorg/spongycastle/asn1/x9/X9ECParameters;

    move-object v5, v0

    invoke-direct/range {v4 .. v9}, Lorg/spongycastle/asn1/x9/X9ECParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    return-object v4
.end method
