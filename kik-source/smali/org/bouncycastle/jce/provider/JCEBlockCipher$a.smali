.class final Lorg/bouncycastle/jce/provider/JCEBlockCipher$a;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JCEBlockCipher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private a:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;


# direct methods
.method constructor <init>(Lorg/bouncycastle/crypto/modes/AEADBlockCipher;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$a;->a:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$a;->a:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {v0, p1}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->getOutputSize(I)I

    move-result v0

    return v0
.end method

.method public final a([BI)I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$a;->a:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {v0, p1, p2}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->doFinal([BI)I

    move-result v0

    return v0
.end method

.method public final a([BII[BI)I
    .locals 6

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$a;->a:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->processBytes([BII[BI)I

    move-result v0

    return v0
.end method

.method public final a(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$a;->a:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {v0, p1, p2}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method public final a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final b(I)I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$a;->a:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {v0, p1}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->getUpdateOutputSize(I)I

    move-result v0

    return v0
.end method

.method public final b()Lorg/bouncycastle/crypto/BlockCipher;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$a;->a:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    return-object v0
.end method
