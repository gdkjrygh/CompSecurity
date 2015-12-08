.class public Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;
.super Ljavax/crypto/SecretKeyFactorySpi;

# interfaces
.implements Lorg/bouncycastle/jce/provider/PBE;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DES;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithMD2AndDES;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithMD2AndRC2;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithMD5And128BitAESCBCOpenSSL;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithMD5And192BitAESCBCOpenSSL;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithMD5And256BitAESCBCOpenSSL;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithMD5AndDES;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithMD5AndRC2;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithRIPEMD160;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHA;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHA1AndDES;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHA1AndRC2;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHA256And128BitAESBC;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHA256And192BitAESBC;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHA256And256BitAESBC;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAnd128BitAESBC;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAnd128BitRC2;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAnd128BitRC4;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAnd192BitAESBC;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAnd256BitAESBC;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAnd40BitRC2;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAnd40BitRC4;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAndDES2Key;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAndDES3Key;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAndTwofish;,
        Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithTiger;
    }
.end annotation


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:Lorg/bouncycastle/asn1/DERObjectIdentifier;


# direct methods
.method protected constructor <init>(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V
    .locals 0

    invoke-direct {p0}, Ljavax/crypto/SecretKeyFactorySpi;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;->a:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    return-void
.end method


# virtual methods
.method protected engineGenerateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    .locals 2

    instance-of v0, p1, Ljavax/crypto/spec/SecretKeySpec;

    if-eqz v0, :cond_0

    check-cast p1, Ljavax/crypto/SecretKey;

    return-object p1

    :cond_0
    new-instance v0, Ljava/security/spec/InvalidKeySpecException;

    const-string v1, "Invalid KeySpec"

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineGetKeySpec(Ljavax/crypto/SecretKey;Ljava/lang/Class;)Ljava/security/spec/KeySpec;
    .locals 4

    if-nez p2, :cond_0

    new-instance v0, Ljava/security/spec/InvalidKeySpecException;

    const-string v1, "keySpec parameter is null"

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-nez p1, :cond_1

    new-instance v0, Ljava/security/spec/InvalidKeySpecException;

    const-string v1, "key parameter is null"

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-class v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-interface {p1}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    :goto_0
    return-object v0

    :cond_2
    const/4 v0, 0x1

    :try_start_0
    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, [B

    aput-object v2, v0, v1

    invoke-virtual {p2, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-interface {p1}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/spec/KeySpec;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/spec/InvalidKeySpecException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineTranslateKey(Ljavax/crypto/SecretKey;)Ljavax/crypto/SecretKey;
    .locals 3

    if-nez p1, :cond_0

    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "key parameter is null"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-interface {p1}, Ljavax/crypto/SecretKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Key not of type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-interface {p1}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object v0
.end method
