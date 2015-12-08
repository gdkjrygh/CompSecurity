.class public Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/jce/provider/BrokenPBE;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher$BrokePBEWithMD5AndDES;,
        Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES;,
        Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher$BrokePBEWithSHAAndDES2Key;,
        Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher$BrokePBEWithSHAAndDES3Key;,
        Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher$OldPBEWithSHAAndDES3Key;,
        Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish;
    }
.end annotation


# instance fields
.field private a:[Ljava/lang/Class;

.field private b:Lorg/bouncycastle/crypto/BufferedBlockCipher;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Ljava/security/AlgorithmParameters;


# direct methods
.method protected constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;IIII)V
    .locals 6

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher;->a:[Ljava/lang/Class;

    iput v5, p0, Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher;->c:I

    iput v4, p0, Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher;->d:I

    iput v3, p0, Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher;->g:I

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher;->h:Ljava/security/AlgorithmParameters;

    new-instance v0, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;

    invoke-direct {v0, p1}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher;->b:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    iput p2, p0, Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher;->c:I

    iput p3, p0, Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher;->d:I

    iput p4, p0, Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher;->e:I

    iput p5, p0, Lorg/bouncycastle/jce/provider/BrokenJCEBlockCipher;->f:I

    return-void
.end method
