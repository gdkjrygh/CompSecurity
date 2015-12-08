.class final Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JCEBlockCipher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private a:Lorg/bouncycastle/crypto/BufferedBlockCipher;


# direct methods
.method constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;

    invoke-direct {v0, p1}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;->a:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    return-void
.end method

.method constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/paddings/BlockCipherPadding;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;

    invoke-direct {v0, p1, p2}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/paddings/BlockCipherPadding;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;->a:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    return-void
.end method

.method constructor <init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;->a:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;->a:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->getOutputSize(I)I

    move-result v0

    return v0
.end method

.method public final a([BI)I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;->a:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v0, p1, p2}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->doFinal([BI)I

    move-result v0

    return v0
.end method

.method public final a([BII[BI)I
    .locals 6

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;->a:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->processBytes([BII[BI)I

    move-result v0

    return v0
.end method

.method public final a(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;->a:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v0, p1, p2}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method public final a()Z
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;->a:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    instance-of v0, v0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(I)I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;->a:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->getUpdateOutputSize(I)I

    move-result v0

    return v0
.end method

.method public final b()Lorg/bouncycastle/crypto/BlockCipher;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;->a:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    return-object v0
.end method
