.class public Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;
.super Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/jcajce/provider/symmetric/util/PBE;


# instance fields
.field private c:Z

.field private d:I

.field private e:I

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 31
    invoke-direct {p0, p1}, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory;-><init>(Ljava/lang/String;)V

    .line 33
    iput-boolean v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->c:Z

    .line 34
    const/4 v0, 0x2

    iput v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->d:I

    .line 35
    iput v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->e:I

    .line 36
    const/16 v0, 0x80

    iput v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->f:I

    .line 37
    const/16 v0, 0x40

    iput v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->g:I

    .line 38
    return-void
.end method


# virtual methods
.method protected engineGenerateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    .locals 9

    .prologue
    .line 44
    instance-of v0, p1, Ljavax/crypto/spec/PBEKeySpec;

    if-eqz v0, :cond_2

    move-object v7, p1

    .line 46
    check-cast v7, Ljavax/crypto/spec/PBEKeySpec;

    .line 49
    invoke-virtual {v7}, Ljavax/crypto/spec/PBEKeySpec;->getSalt()[B

    move-result-object v0

    if-nez v0, :cond_0

    .line 51
    new-instance v0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->a:Ljava/lang/String;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->b:Lorg/spongycastle/asn1/DERObjectIdentifier;

    iget v3, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->d:I

    iget v4, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->e:I

    iget v5, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->f:I

    iget v6, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->g:I

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;-><init>(Ljava/lang/String;Lorg/spongycastle/asn1/DERObjectIdentifier;IIIILjavax/crypto/spec/PBEKeySpec;Lorg/spongycastle/crypto/CipherParameters;)V

    .line 63
    :goto_0
    return-object v0

    .line 54
    :cond_0
    iget-boolean v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->c:Z

    if-eqz v0, :cond_1

    .line 56
    iget v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->d:I

    iget v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->e:I

    iget v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->f:I

    iget v3, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->g:I

    invoke-static {v7, v0, v1, v2, v3}, Lorg/spongycastle/jcajce/provider/symmetric/util/PBE$Util;->a(Ljavax/crypto/spec/PBEKeySpec;IIII)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v8

    .line 63
    :goto_1
    new-instance v0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->a:Ljava/lang/String;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->b:Lorg/spongycastle/asn1/DERObjectIdentifier;

    iget v3, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->d:I

    iget v4, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->e:I

    iget v5, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->f:I

    iget v6, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->g:I

    invoke-direct/range {v0 .. v8}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;-><init>(Ljava/lang/String;Lorg/spongycastle/asn1/DERObjectIdentifier;IIIILjavax/crypto/spec/PBEKeySpec;Lorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_0

    .line 60
    :cond_1
    iget v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->d:I

    iget v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->e:I

    iget v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;->f:I

    invoke-static {v7, v0, v1, v2}, Lorg/spongycastle/jcajce/provider/symmetric/util/PBE$Util;->a(Ljavax/crypto/spec/PBEKeySpec;III)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v8

    goto :goto_1

    .line 66
    :cond_2
    new-instance v0, Ljava/security/spec/InvalidKeySpecException;

    const-string v1, "Invalid KeySpec"

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
