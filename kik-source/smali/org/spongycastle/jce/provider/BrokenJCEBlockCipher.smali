.class public Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/jce/provider/BrokenPBE;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish;,
        Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher$BrokePBEWithSHAAndDES2Key;,
        Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher$OldPBEWithSHAAndDES3Key;,
        Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher$BrokePBEWithSHAAndDES3Key;,
        Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES;,
        Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher$BrokePBEWithMD5AndDES;
    }
.end annotation


# instance fields
.field private a:[Ljava/lang/Class;

.field private b:Lorg/spongycastle/crypto/BufferedBlockCipher;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Ljava/security/AlgorithmParameters;


# direct methods
.method protected constructor <init>(Lorg/spongycastle/crypto/BlockCipher;IIII)V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Ljavax/crypto/spec/IvParameterSpec;

    aput-object v1, v0, v3

    const-class v1, Ljavax/crypto/spec/PBEParameterSpec;

    aput-object v1, v0, v4

    const-class v1, Ljavax/crypto/spec/RC2ParameterSpec;

    aput-object v1, v0, v5

    const/4 v1, 0x3

    const-class v2, Ljavax/crypto/spec/RC5ParameterSpec;

    aput-object v2, v0, v1

    iput-object v0, p0, Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher;->a:[Ljava/lang/Class;

    .line 63
    iput v5, p0, Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher;->c:I

    .line 64
    iput v4, p0, Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher;->d:I

    .line 68
    iput v3, p0, Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher;->g:I

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher;->h:Ljava/security/AlgorithmParameters;

    .line 85
    new-instance v0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;

    invoke-direct {v0, p1}, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher;->b:Lorg/spongycastle/crypto/BufferedBlockCipher;

    .line 87
    iput p2, p0, Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher;->c:I

    .line 88
    iput p3, p0, Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher;->d:I

    .line 89
    iput p4, p0, Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher;->e:I

    .line 90
    iput p5, p0, Lorg/spongycastle/jce/provider/BrokenJCEBlockCipher;->f:I

    .line 91
    return-void
.end method
