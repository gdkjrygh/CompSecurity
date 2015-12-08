.class public Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;
.super Lorg/spongycastle/jce/provider/JCESecretKeyFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JCESecretKeyFactory;
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
.method public constructor <init>(Ljava/lang/String;Lorg/spongycastle/asn1/DERObjectIdentifier;ZIIII)V
    .locals 0

    .prologue
    .line 125
    invoke-direct {p0, p1, p2}, Lorg/spongycastle/jce/provider/JCESecretKeyFactory;-><init>(Ljava/lang/String;Lorg/spongycastle/asn1/DERObjectIdentifier;)V

    .line 127
    iput-boolean p3, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->c:Z

    .line 128
    iput p4, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->d:I

    .line 129
    iput p5, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->e:I

    .line 130
    iput p6, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->f:I

    .line 131
    iput p7, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->g:I

    .line 132
    return-void
.end method


# virtual methods
.method protected engineGenerateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    .locals 9

    .prologue
    .line 138
    instance-of v0, p1, Ljavax/crypto/spec/PBEKeySpec;

    if-eqz v0, :cond_2

    move-object v7, p1

    .line 140
    check-cast v7, Ljavax/crypto/spec/PBEKeySpec;

    .line 143
    invoke-virtual {v7}, Ljavax/crypto/spec/PBEKeySpec;->getSalt()[B

    move-result-object v0

    if-nez v0, :cond_0

    .line 145
    new-instance v0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->a:Ljava/lang/String;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->b:Lorg/spongycastle/asn1/DERObjectIdentifier;

    iget v3, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->d:I

    iget v4, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->e:I

    iget v5, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->f:I

    iget v6, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->g:I

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;-><init>(Ljava/lang/String;Lorg/spongycastle/asn1/DERObjectIdentifier;IIIILjavax/crypto/spec/PBEKeySpec;Lorg/spongycastle/crypto/CipherParameters;)V

    .line 157
    :goto_0
    return-object v0

    .line 148
    :cond_0
    iget-boolean v0, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->c:Z

    if-eqz v0, :cond_1

    .line 150
    iget v0, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->d:I

    iget v1, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->e:I

    iget v2, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->f:I

    iget v3, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->g:I

    invoke-static {v7, v0, v1, v2, v3}, Lorg/spongycastle/jcajce/provider/symmetric/util/PBE$Util;->a(Ljavax/crypto/spec/PBEKeySpec;IIII)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v8

    .line 157
    :goto_1
    new-instance v0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->a:Ljava/lang/String;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->b:Lorg/spongycastle/asn1/DERObjectIdentifier;

    iget v3, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->d:I

    iget v4, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->e:I

    iget v5, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->f:I

    iget v6, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->g:I

    invoke-direct/range {v0 .. v8}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;-><init>(Ljava/lang/String;Lorg/spongycastle/asn1/DERObjectIdentifier;IIIILjavax/crypto/spec/PBEKeySpec;Lorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_0

    .line 154
    :cond_1
    iget v0, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->d:I

    iget v1, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->e:I

    iget v2, p0, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;->f:I

    invoke-static {v7, v0, v1, v2}, Lorg/spongycastle/jcajce/provider/symmetric/util/PBE$Util;->a(Ljavax/crypto/spec/PBEKeySpec;III)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v8

    goto :goto_1

    .line 160
    :cond_2
    new-instance v0, Ljava/security/spec/InvalidKeySpecException;

    const-string v1, "Invalid KeySpec"

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
