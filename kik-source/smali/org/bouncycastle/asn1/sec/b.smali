.class final Lorg/bouncycastle/asn1/sec/b;
.super Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()Lorg/bouncycastle/asn1/x9/X9ECParameters;
    .locals 8

    const-string v0, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"

    invoke-static {v0}, Lorg/bouncycastle/asn1/sec/SECNamedCurves;->c(Ljava/lang/String;)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v2, Lorg/bouncycastle/math/ec/ECConstants;->f:Ljava/math/BigInteger;

    const-wide/16 v4, 0x5

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v5

    const-string v1, "010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"

    invoke-static {v1}, Lorg/bouncycastle/asn1/sec/SECNamedCurves;->c(Ljava/lang/String;)Ljava/math/BigInteger;

    move-result-object v3

    const-wide/16 v6, 0x1

    invoke-static {v6, v7}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v4

    new-instance v1, Lorg/bouncycastle/math/ec/ECCurve$Fp;

    invoke-direct {v1, v0, v2, v5}, Lorg/bouncycastle/math/ec/ECCurve$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    const-string v0, "04A1455B334DF099DF30FC28A169A467E9E47075A90F7E650EB6B7A45C7E089FED7FBA344282CAFBD6F7E319F7C0B0BD59E2CA4BDB556D61A5"

    invoke-static {v0}, Lorg/bouncycastle/util/encoders/Hex;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/bouncycastle/math/ec/ECCurve;->a([B)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    new-instance v0, Lorg/bouncycastle/asn1/x9/X9ECParameters;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    return-object v0
.end method
