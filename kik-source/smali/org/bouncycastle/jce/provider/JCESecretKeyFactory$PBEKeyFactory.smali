.class public Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;
.super Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBEKeyFactory"
.end annotation


# instance fields
.field private c:Z

.field private d:I

.field private e:I

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;ZIIII)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;-><init>(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    iput-boolean p3, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->c:Z

    iput p4, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->d:I

    iput p5, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->e:I

    iput p6, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->f:I

    iput p7, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->g:I

    return-void
.end method


# virtual methods
.method protected engineGenerateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    .locals 9

    instance-of v0, p1, Ljavax/crypto/spec/PBEKeySpec;

    if-eqz v0, :cond_2

    move-object v7, p1

    check-cast v7, Ljavax/crypto/spec/PBEKeySpec;

    invoke-virtual {v7}, Ljavax/crypto/spec/PBEKeySpec;->getSalt()[B

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEPBEKey;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->a:Ljava/lang/String;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget v3, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->d:I

    iget v4, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->e:I

    iget v5, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->f:I

    iget v6, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->g:I

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lorg/bouncycastle/jce/provider/JCEPBEKey;-><init>(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;IIIILjavax/crypto/spec/PBEKeySpec;Lorg/bouncycastle/crypto/CipherParameters;)V

    :goto_0
    return-object v0

    :cond_0
    iget-boolean v0, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->c:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->d:I

    iget v1, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->e:I

    iget v2, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->f:I

    iget v3, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->g:I

    invoke-static {v7, v0, v1, v2, v3}, Lorg/bouncycastle/jce/provider/PBE$Util;->a(Ljavax/crypto/spec/PBEKeySpec;IIII)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v8

    :goto_1
    new-instance v0, Lorg/bouncycastle/jce/provider/JCEPBEKey;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->a:Ljava/lang/String;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget v3, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->d:I

    iget v4, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->e:I

    iget v5, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->f:I

    iget v6, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->g:I

    invoke-direct/range {v0 .. v8}, Lorg/bouncycastle/jce/provider/JCEPBEKey;-><init>(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;IIIILjavax/crypto/spec/PBEKeySpec;Lorg/bouncycastle/crypto/CipherParameters;)V

    goto :goto_0

    :cond_1
    iget v0, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->d:I

    iget v1, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->e:I

    iget v2, p0, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->f:I

    invoke-static {v7, v0, v1, v2}, Lorg/bouncycastle/jce/provider/PBE$Util;->a(Ljavax/crypto/spec/PBEKeySpec;III)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v8

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/spec/InvalidKeySpecException;

    const-string v1, "Invalid KeySpec"

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
