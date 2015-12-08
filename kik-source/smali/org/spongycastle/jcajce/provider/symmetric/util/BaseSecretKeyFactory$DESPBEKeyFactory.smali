.class public Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;
.super Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory;
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


# virtual methods
.method protected engineGenerateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    .locals 9

    .prologue
    .line 137
    instance-of v0, p1, Ljavax/crypto/spec/PBEKeySpec;

    if-eqz v0, :cond_3

    move-object v7, p1

    .line 139
    check-cast v7, Ljavax/crypto/spec/PBEKeySpec;

    .line 142
    invoke-virtual {v7}, Ljavax/crypto/spec/PBEKeySpec;->getSalt()[B

    move-result-object v0

    if-nez v0, :cond_0

    .line 144
    new-instance v0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->a:Ljava/lang/String;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->b:Lorg/spongycastle/asn1/DERObjectIdentifier;

    iget v3, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->d:I

    iget v4, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->e:I

    iget v5, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->f:I

    iget v6, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->g:I

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;-><init>(Ljava/lang/String;Lorg/spongycastle/asn1/DERObjectIdentifier;IIIILjavax/crypto/spec/PBEKeySpec;Lorg/spongycastle/crypto/CipherParameters;)V

    .line 168
    :goto_0
    return-object v0

    .line 147
    :cond_0
    iget-boolean v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->c:Z

    if-eqz v0, :cond_1

    .line 149
    iget v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->d:I

    iget v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->e:I

    iget v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->f:I

    iget v3, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->g:I

    invoke-static {v7, v0, v1, v2, v3}, Lorg/spongycastle/jcajce/provider/symmetric/util/PBE$Util;->a(Ljavax/crypto/spec/PBEKeySpec;IIII)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v8

    .line 157
    :goto_1
    instance-of v0, v8, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_2

    move-object v0, v8

    .line 159
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    .line 166
    :goto_2
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/crypto/params/DESParameters;->a([B)V

    .line 168
    new-instance v0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->a:Ljava/lang/String;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->b:Lorg/spongycastle/asn1/DERObjectIdentifier;

    iget v3, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->d:I

    iget v4, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->e:I

    iget v5, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->f:I

    iget v6, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->g:I

    invoke-direct/range {v0 .. v8}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;-><init>(Ljava/lang/String;Lorg/spongycastle/asn1/DERObjectIdentifier;IIIILjavax/crypto/spec/PBEKeySpec;Lorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_0

    .line 153
    :cond_1
    iget v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->d:I

    iget v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->e:I

    iget v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseSecretKeyFactory$DESPBEKeyFactory;->f:I

    invoke-static {v7, v0, v1, v2}, Lorg/spongycastle/jcajce/provider/symmetric/util/PBE$Util;->a(Ljavax/crypto/spec/PBEKeySpec;III)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v8

    goto :goto_1

    :cond_2
    move-object v0, v8

    .line 163
    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    goto :goto_2

    .line 171
    :cond_3
    new-instance v0, Ljava/security/spec/InvalidKeySpecException;

    const-string v1, "Invalid KeySpec"

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
