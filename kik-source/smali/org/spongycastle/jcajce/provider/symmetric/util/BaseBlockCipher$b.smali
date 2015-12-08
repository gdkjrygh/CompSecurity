.class final Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private a:Lorg/spongycastle/crypto/BufferedBlockCipher;


# direct methods
.method constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 1

    .prologue
    .line 773
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 774
    new-instance v0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;

    invoke-direct {v0, p1}, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$b;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    .line 775
    return-void
.end method

.method constructor <init>(Lorg/spongycastle/crypto/BlockCipher;Lorg/spongycastle/crypto/paddings/BlockCipherPadding;)V
    .locals 1

    .prologue
    .line 778
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 779
    new-instance v0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;

    invoke-direct {v0, p1, p2}, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;Lorg/spongycastle/crypto/paddings/BlockCipherPadding;)V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$b;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    .line 780
    return-void
.end method

.method constructor <init>(Lorg/spongycastle/crypto/BufferedBlockCipher;)V
    .locals 0

    .prologue
    .line 768
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 769
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$b;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    .line 770
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .prologue
    .line 805
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$b;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v0, p1}, Lorg/spongycastle/crypto/BufferedBlockCipher;->b(I)I

    move-result v0

    return v0
.end method

.method public final a([BI)I
    .locals 1

    .prologue
    .line 825
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$b;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v0, p1, p2}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a([BI)I

    move-result v0

    return v0
.end method

.method public final a([BII[BI)I
    .locals 6

    .prologue
    .line 820
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$b;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a([BII[BI)I

    move-result v0

    return v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 1

    .prologue
    .line 785
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$b;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v0, p1, p2}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 786
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 790
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$b;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    instance-of v0, v0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;

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

    .prologue
    .line 810
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$b;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v0, p1}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a(I)I

    move-result v0

    return v0
.end method

.method public final b()Lorg/spongycastle/crypto/BlockCipher;
    .locals 1

    .prologue
    .line 800
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$b;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v0

    return-object v0
.end method
