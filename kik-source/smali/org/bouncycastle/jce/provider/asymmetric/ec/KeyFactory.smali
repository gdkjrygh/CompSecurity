.class public Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyFactory;
.super Lorg/bouncycastle/jce/provider/JDKKeyFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyFactory$EC;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyFactory$ECDH;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyFactory$ECDHC;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyFactory$ECDSA;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyFactory$ECGOST3410;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyFactory$ECMQV;
    }
.end annotation


# instance fields
.field b:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/JDKKeyFactory;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyFactory;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected engineGeneratePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
    .locals 3

    instance-of v0, p1, Ljava/security/spec/PKCS8EncodedKeySpec;

    if-eqz v0, :cond_0

    :try_start_0
    check-cast p1, Ljava/security/spec/PKCS8EncodedKeySpec;

    invoke-virtual {p1}, Ljava/security/spec/PKCS8EncodedKeySpec;->getEncoded()[B

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/JDKKeyFactory;->b([B)Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;

    new-instance v1, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyFactory;->b:Ljava/lang/String;

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;-><init>(Ljava/lang/String;Lorg/bouncycastle/jce/provider/JCEECPrivateKey;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/spec/InvalidKeySpecException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    instance-of v0, p1, Lorg/bouncycastle/jce/spec/ECPrivateKeySpec;

    if-eqz v0, :cond_1

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyFactory;->b:Ljava/lang/String;

    check-cast p1, Lorg/bouncycastle/jce/spec/ECPrivateKeySpec;

    invoke-direct {v0, v1, p1}, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;-><init>(Ljava/lang/String;Lorg/bouncycastle/jce/spec/ECPrivateKeySpec;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/security/spec/ECPrivateKeySpec;

    if-eqz v0, :cond_2

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyFactory;->b:Ljava/lang/String;

    check-cast p1, Ljava/security/spec/ECPrivateKeySpec;

    invoke-direct {v0, v1, p1}, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;-><init>(Ljava/lang/String;Ljava/security/spec/ECPrivateKeySpec;)V

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/security/spec/InvalidKeySpecException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown KeySpec type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineGeneratePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    .locals 3

    instance-of v0, p1, Ljava/security/spec/X509EncodedKeySpec;

    if-eqz v0, :cond_0

    :try_start_0
    check-cast p1, Ljava/security/spec/X509EncodedKeySpec;

    invoke-virtual {p1}, Ljava/security/spec/X509EncodedKeySpec;->getEncoded()[B

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/JDKKeyFactory;->a([B)Ljava/security/PublicKey;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/JCEECPublicKey;

    new-instance v1, Lorg/bouncycastle/jce/provider/JCEECPublicKey;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyFactory;->b:Ljava/lang/String;

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/JCEECPublicKey;-><init>(Ljava/lang/String;Lorg/bouncycastle/jce/provider/JCEECPublicKey;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/spec/InvalidKeySpecException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    instance-of v0, p1, Lorg/bouncycastle/jce/spec/ECPublicKeySpec;

    if-eqz v0, :cond_1

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEECPublicKey;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyFactory;->b:Ljava/lang/String;

    check-cast p1, Lorg/bouncycastle/jce/spec/ECPublicKeySpec;

    invoke-direct {v0, v1, p1}, Lorg/bouncycastle/jce/provider/JCEECPublicKey;-><init>(Ljava/lang/String;Lorg/bouncycastle/jce/spec/ECPublicKeySpec;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/security/spec/ECPublicKeySpec;

    if-eqz v0, :cond_2

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEECPublicKey;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyFactory;->b:Ljava/lang/String;

    check-cast p1, Ljava/security/spec/ECPublicKeySpec;

    invoke-direct {v0, v1, p1}, Lorg/bouncycastle/jce/provider/JCEECPublicKey;-><init>(Ljava/lang/String;Ljava/security/spec/ECPublicKeySpec;)V

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/security/spec/InvalidKeySpecException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown KeySpec type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineGetKeySpec(Ljava/security/Key;Ljava/lang/Class;)Ljava/security/spec/KeySpec;
    .locals 4

    const-class v0, Ljava/security/spec/PKCS8EncodedKeySpec;

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/security/Key;->getFormat()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PKCS#8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/security/spec/PKCS8EncodedKeySpec;

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V

    :goto_0
    return-object v0

    :cond_0
    const-class v0, Ljava/security/spec/X509EncodedKeySpec;

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/security/Key;->getFormat()Ljava/lang/String;

    move-result-object v0

    const-string v1, "X.509"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/security/spec/X509EncodedKeySpec;

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    goto :goto_0

    :cond_1
    const-class v0, Ljava/security/spec/ECPublicKeySpec;

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    instance-of v0, p1, Ljava/security/interfaces/ECPublicKey;

    if-eqz v0, :cond_3

    check-cast p1, Ljava/security/interfaces/ECPublicKey;

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/security/spec/ECPublicKeySpec;

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v1

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    goto :goto_0

    :cond_2
    invoke-static {}, Lorg/bouncycastle/jce/provider/ProviderUtil;->a()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    new-instance v0, Ljava/security/spec/ECPublicKeySpec;

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v2

    invoke-virtual {v1}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->b()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v3

    invoke-static {v3}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Lorg/bouncycastle/math/ec/ECCurve;)Ljava/security/spec/EllipticCurve;

    move-result-object v3

    invoke-static {v3, v1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/EllipticCurve;Lorg/bouncycastle/jce/spec/ECParameterSpec;)Ljava/security/spec/ECParameterSpec;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    goto :goto_0

    :cond_3
    const-class v0, Ljava/security/spec/ECPrivateKeySpec;

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_5

    instance-of v0, p1, Ljava/security/interfaces/ECPrivateKey;

    if-eqz v0, :cond_5

    check-cast p1, Ljava/security/interfaces/ECPrivateKey;

    invoke-interface {p1}, Ljava/security/interfaces/ECPrivateKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v0, Ljava/security/spec/ECPrivateKeySpec;

    invoke-interface {p1}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object v1

    invoke-interface {p1}, Ljava/security/interfaces/ECPrivateKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/security/spec/ECPrivateKeySpec;-><init>(Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)V

    goto :goto_0

    :cond_4
    invoke-static {}, Lorg/bouncycastle/jce/provider/ProviderUtil;->a()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    new-instance v0, Ljava/security/spec/ECPrivateKeySpec;

    invoke-interface {p1}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->b()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v3

    invoke-static {v3}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Lorg/bouncycastle/math/ec/ECCurve;)Ljava/security/spec/EllipticCurve;

    move-result-object v3

    invoke-static {v3, v1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/EllipticCurve;Lorg/bouncycastle/jce/spec/ECParameterSpec;)Ljava/security/spec/ECParameterSpec;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ljava/security/spec/ECPrivateKeySpec;-><init>(Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)V

    goto/16 :goto_0

    :cond_5
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "not implemented yet "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineTranslateKey(Ljava/security/Key;)Ljava/security/Key;
    .locals 2

    instance-of v0, p1, Ljava/security/interfaces/ECPublicKey;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEECPublicKey;

    check-cast p1, Ljava/security/interfaces/ECPublicKey;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jce/provider/JCEECPublicKey;-><init>(Ljava/security/interfaces/ECPublicKey;)V

    :goto_0
    return-object v0

    :cond_0
    instance-of v0, p1, Ljava/security/interfaces/ECPrivateKey;

    if-eqz v0, :cond_1

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;

    check-cast p1, Ljava/security/interfaces/ECPrivateKey;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;-><init>(Ljava/security/interfaces/ECPrivateKey;)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "key type unknown"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
