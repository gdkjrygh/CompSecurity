.class public Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;
.super Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DESPBEKeyFactory"
.end annotation


# instance fields
.field private c:Z

.field private d:I

.field private e:I

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;III)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;-><init>(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->c:Z

    iput p3, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->d:I

    iput p4, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->e:I

    iput p5, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->f:I

    const/16 v0, 0x40

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->g:I

    return-void
.end method


# virtual methods
.method protected engineGenerateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    .locals 9

    instance-of v0, p1, Ljavax/crypto/spec/PBEKeySpec;

    if-eqz v0, :cond_3

    move-object v7, p1

    check-cast v7, Ljavax/crypto/spec/PBEKeySpec;

    invoke-virtual {v7}, Ljavax/crypto/spec/PBEKeySpec;->getSalt()[B

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEPBEKey;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->a:Ljava/lang/String;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget v3, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->d:I

    iget v4, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->e:I

    iget v5, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->f:I

    iget v6, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->g:I

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lorg/bouncycastle/jce/provider/JCEPBEKey;-><init>(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;IIIILjavax/crypto/spec/PBEKeySpec;Lorg/bouncycastle/crypto/CipherParameters;)V

    :goto_0
    return-object v0

    :cond_0
    iget-boolean v0, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->c:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->d:I

    iget v1, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->e:I

    iget v2, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->f:I

    iget v3, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->g:I

    invoke-static {v7, v0, v1, v2, v3}, Lorg/bouncycastle/jce/provider/PBE$Util;->a(Ljavax/crypto/spec/PBEKeySpec;IIII)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v8

    :goto_1
    instance-of v0, v8, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_2

    move-object v0, v8

    check-cast v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    :goto_2
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/KeyParameter;->getKey()[B

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/crypto/params/DESParameters;->setOddParity([B)V

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEPBEKey;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->a:Ljava/lang/String;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget v3, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->d:I

    iget v4, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->e:I

    iget v5, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->f:I

    iget v6, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->g:I

    invoke-direct/range {v0 .. v8}, Lorg/bouncycastle/jce/provider/JCEPBEKey;-><init>(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;IIIILjavax/crypto/spec/PBEKeySpec;Lorg/bouncycastle/crypto/CipherParameters;)V

    goto :goto_0

    :cond_1
    iget v0, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->d:I

    iget v1, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->e:I

    iget v2, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;->f:I

    invoke-static {v7, v0, v1, v2}, Lorg/bouncycastle/jce/provider/PBE$Util;->a(Ljavax/crypto/spec/PBEKeySpec;III)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v8

    goto :goto_1

    :cond_2
    move-object v0, v8

    check-cast v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/security/spec/InvalidKeySpecException;

    const-string v1, "Invalid KeySpec"

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
