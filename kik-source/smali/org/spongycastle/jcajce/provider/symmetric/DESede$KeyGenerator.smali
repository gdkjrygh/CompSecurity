.class public Lorg/spongycastle/jcajce/provider/symmetric/DESede$KeyGenerator;
.super Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/symmetric/DESede;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "KeyGenerator"
.end annotation


# instance fields
.field private f:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 146
    const-string v0, "DESede"

    const/16 v1, 0xc0

    new-instance v2, Lorg/spongycastle/crypto/generators/DESedeKeyGenerator;

    invoke-direct {v2}, Lorg/spongycastle/crypto/generators/DESedeKeyGenerator;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;-><init>(Ljava/lang/String;ILorg/spongycastle/crypto/CipherKeyGenerator;)V

    .line 142
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/DESede$KeyGenerator;->f:Z

    .line 147
    return-void
.end method


# virtual methods
.method protected engineGenerateKey()Ljavax/crypto/SecretKey;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 159
    iget-boolean v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/DESede$KeyGenerator;->e:Z

    if-eqz v0, :cond_0

    .line 161
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/DESede$KeyGenerator;->d:Lorg/spongycastle/crypto/CipherKeyGenerator;

    new-instance v1, Lorg/spongycastle/crypto/KeyGenerationParameters;

    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    iget v3, p0, Lorg/spongycastle/jcajce/provider/symmetric/DESede$KeyGenerator;->c:I

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/crypto/KeyGenerationParameters;-><init>(Ljava/security/SecureRandom;I)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/crypto/CipherKeyGenerator;->a(Lorg/spongycastle/crypto/KeyGenerationParameters;)V

    .line 162
    iput-boolean v4, p0, Lorg/spongycastle/jcajce/provider/symmetric/DESede$KeyGenerator;->e:Z

    .line 169
    :cond_0
    iget-boolean v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/DESede$KeyGenerator;->f:Z

    if-nez v0, :cond_1

    .line 171
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/DESede$KeyGenerator;->d:Lorg/spongycastle/crypto/CipherKeyGenerator;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/CipherKeyGenerator;->a()[B

    move-result-object v1

    .line 173
    const/16 v0, 0x10

    const/16 v2, 0x8

    invoke-static {v1, v4, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 175
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/DESede$KeyGenerator;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 179
    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/DESede$KeyGenerator;->d:Lorg/spongycastle/crypto/CipherKeyGenerator;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/CipherKeyGenerator;->a()[B

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/DESede$KeyGenerator;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    goto :goto_0
.end method

.method protected engineInit(ILjava/security/SecureRandom;)V
    .locals 1

    .prologue
    .line 153
    invoke-super {p0, p1, p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->engineInit(ILjava/security/SecureRandom;)V

    .line 154
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/DESede$KeyGenerator;->f:Z

    .line 155
    return-void
.end method
