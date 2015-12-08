.class public Lorg/spongycastle/jce/provider/JCESecretKeyFactory;
.super Ljavax/crypto/SecretKeyFactorySpi;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/jcajce/provider/symmetric/util/PBE;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithMD5And256BitAESCBCOpenSSL;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithMD5And192BitAESCBCOpenSSL;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithMD5And128BitAESCBCOpenSSL;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHA256And256BitAESBC;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHA256And192BitAESBC;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHA256And128BitAESBC;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAnd256BitAESBC;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAnd192BitAESBC;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAnd128BitAESBC;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithTiger;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHA;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithRIPEMD160;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAnd40BitRC4;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAnd128BitRC4;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAndTwofish;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAnd40BitRC2;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAnd128BitRC2;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAndDES2Key;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAndDES3Key;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHA1AndRC2;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHA1AndDES;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithMD5AndRC2;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithMD5AndDES;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithMD2AndRC2;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithMD2AndDES;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$DES;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;,
        Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;
    }
.end annotation


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:Lorg/spongycastle/asn1/DERObjectIdentifier;


# direct methods
.method protected constructor <init>(Ljava/lang/String;Lorg/spongycastle/asn1/DERObjectIdentifier;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljavax/crypto/SecretKeyFactorySpi;-><init>()V

    .line 34
    iput-object p1, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory;->a:Ljava/lang/String;

    .line 35
    iput-object p2, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory;->b:Lorg/spongycastle/asn1/DERObjectIdentifier;

    .line 36
    return-void
.end method


# virtual methods
.method protected engineGenerateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    .locals 2

    .prologue
    .line 42
    instance-of v0, p1, Ljavax/crypto/spec/SecretKeySpec;

    if-eqz v0, :cond_0

    .line 44
    check-cast p1, Ljavax/crypto/SecretKey;

    return-object p1

    .line 47
    :cond_0
    new-instance v0, Ljava/security/spec/InvalidKeySpecException;

    const-string v1, "Invalid KeySpec"

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineGetKeySpec(Ljavax/crypto/SecretKey;Ljava/lang/Class;)Ljava/security/spec/KeySpec;
    .locals 4

    .prologue
    .line 55
    if-nez p2, :cond_0

    .line 57
    new-instance v0, Ljava/security/spec/InvalidKeySpecException;

    const-string v1, "keySpec parameter is null"

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :cond_0
    if-nez p1, :cond_1

    .line 61
    new-instance v0, Ljava/security/spec/InvalidKeySpecException;

    const-string v1, "key parameter is null"

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_1
    const-class v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 66
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-interface {p1}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 78
    :goto_0
    return-object v0

    .line 71
    :cond_2
    const/4 v0, 0x1

    :try_start_0
    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, [B

    aput-object v2, v0, v1

    .line 73
    invoke-virtual {p2, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 74
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 76
    const/4 v2, 0x0

    invoke-interface {p1}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v3

    aput-object v3, v1, v2

    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/spec/KeySpec;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 80
    :catch_0
    move-exception v0

    .line 82
    new-instance v1, Ljava/security/spec/InvalidKeySpecException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineTranslateKey(Ljavax/crypto/SecretKey;)Ljavax/crypto/SecretKey;
    .locals 3

    .prologue
    .line 90
    if-nez p1, :cond_0

    .line 92
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "key parameter is null"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_0
    invoke-interface {p1}, Ljavax/crypto/SecretKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 97
    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Key not of type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 100
    :cond_1
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-interface {p1}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object v0
.end method
