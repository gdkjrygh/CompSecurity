.class public Lorg/bouncycastle/jce/provider/JCEMac;
.super Ljavax/crypto/MacSpi;

# interfaces
.implements Lorg/bouncycastle/jce/provider/PBE;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/jce/provider/JCEMac$DES;,
        Lorg/bouncycastle/jce/provider/JCEMac$DES9797Alg3;,
        Lorg/bouncycastle/jce/provider/JCEMac$DES9797Alg3with7816d4;,
        Lorg/bouncycastle/jce/provider/JCEMac$DESCFB8;,
        Lorg/bouncycastle/jce/provider/JCEMac$GOST28147;,
        Lorg/bouncycastle/jce/provider/JCEMac$MD2;,
        Lorg/bouncycastle/jce/provider/JCEMac$MD4;,
        Lorg/bouncycastle/jce/provider/JCEMac$MD5;,
        Lorg/bouncycastle/jce/provider/JCEMac$OldSHA384;,
        Lorg/bouncycastle/jce/provider/JCEMac$OldSHA512;,
        Lorg/bouncycastle/jce/provider/JCEMac$PBEWithRIPEMD160;,
        Lorg/bouncycastle/jce/provider/JCEMac$PBEWithSHA;,
        Lorg/bouncycastle/jce/provider/JCEMac$PBEWithTiger;,
        Lorg/bouncycastle/jce/provider/JCEMac$RC2;,
        Lorg/bouncycastle/jce/provider/JCEMac$RC2CFB8;,
        Lorg/bouncycastle/jce/provider/JCEMac$RIPEMD128;,
        Lorg/bouncycastle/jce/provider/JCEMac$RIPEMD160;,
        Lorg/bouncycastle/jce/provider/JCEMac$SHA1;,
        Lorg/bouncycastle/jce/provider/JCEMac$SHA224;,
        Lorg/bouncycastle/jce/provider/JCEMac$SHA256;,
        Lorg/bouncycastle/jce/provider/JCEMac$SHA384;,
        Lorg/bouncycastle/jce/provider/JCEMac$SHA512;,
        Lorg/bouncycastle/jce/provider/JCEMac$Tiger;
    }
.end annotation


# instance fields
.field private a:Lorg/bouncycastle/crypto/Mac;

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method protected constructor <init>(Lorg/bouncycastle/crypto/Mac;)V
    .locals 1

    invoke-direct {p0}, Ljavax/crypto/MacSpi;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEMac;->b:I

    const/4 v0, 0x1

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEMac;->c:I

    const/16 v0, 0xa0

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEMac;->d:I

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JCEMac;->a:Lorg/bouncycastle/crypto/Mac;

    return-void
.end method

.method protected constructor <init>(Lorg/bouncycastle/crypto/Mac;II)V
    .locals 2

    const/4 v1, 0x2

    invoke-direct {p0}, Ljavax/crypto/MacSpi;-><init>()V

    iput v1, p0, Lorg/bouncycastle/jce/provider/JCEMac;->b:I

    const/4 v0, 0x1

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEMac;->c:I

    const/16 v0, 0xa0

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEMac;->d:I

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JCEMac;->a:Lorg/bouncycastle/crypto/Mac;

    iput v1, p0, Lorg/bouncycastle/jce/provider/JCEMac;->b:I

    iput p2, p0, Lorg/bouncycastle/jce/provider/JCEMac;->c:I

    iput p3, p0, Lorg/bouncycastle/jce/provider/JCEMac;->d:I

    return-void
.end method


# virtual methods
.method protected engineDoFinal()[B
    .locals 3

    invoke-virtual {p0}, Lorg/bouncycastle/jce/provider/JCEMac;->engineGetMacLength()I

    move-result v0

    new-array v0, v0, [B

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEMac;->a:Lorg/bouncycastle/crypto/Mac;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lorg/bouncycastle/crypto/Mac;->doFinal([BI)I

    return-object v0
.end method

.method protected engineGetMacLength()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEMac;->a:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Mac;->getMacSize()I

    move-result v0

    return v0
.end method

.method protected engineInit(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 3

    if-nez p1, :cond_0

    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "key is null"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    instance-of v0, p1, Lorg/bouncycastle/jce/provider/JCEPBEKey;

    if-eqz v0, :cond_3

    check-cast p1, Lorg/bouncycastle/jce/provider/JCEPBEKey;

    iget-object v0, p1, Lorg/bouncycastle/jce/provider/JCEPBEKey;->g:Lorg/bouncycastle/crypto/CipherParameters;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lorg/bouncycastle/jce/provider/JCEPBEKey;->g:Lorg/bouncycastle/crypto/CipherParameters;

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEMac;->a:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v1, v0}, Lorg/bouncycastle/crypto/Mac;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    return-void

    :cond_1
    instance-of v0, p2, Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v0, :cond_2

    invoke-static {p1, p2}, Lorg/bouncycastle/jce/provider/PBE$Util;->a(Lorg/bouncycastle/jce/provider/JCEPBEKey;Ljava/security/spec/AlgorithmParameterSpec;)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "PBE requires PBE parameters to be set."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    instance-of v0, p2, Ljavax/crypto/spec/IvParameterSpec;

    if-eqz v0, :cond_4

    new-instance v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    new-instance v1, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    check-cast p2, Ljavax/crypto/spec/IvParameterSpec;

    invoke-virtual {p2}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    goto :goto_0

    :cond_4
    if-nez p2, :cond_5

    new-instance v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    goto :goto_0

    :cond_5
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "unknown parameter type."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineReset()V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEMac;->a:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Mac;->reset()V

    return-void
.end method

.method protected engineUpdate(B)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEMac;->a:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0, p1}, Lorg/bouncycastle/crypto/Mac;->update(B)V

    return-void
.end method

.method protected engineUpdate([BII)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEMac;->a:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    return-void
.end method
