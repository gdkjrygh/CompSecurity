.class public Lorg/bouncycastle/jce/provider/JDKMessageDigest;
.super Ljava/security/MessageDigest;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/jce/provider/JDKMessageDigest$GOST3411;,
        Lorg/bouncycastle/jce/provider/JDKMessageDigest$MD2;,
        Lorg/bouncycastle/jce/provider/JDKMessageDigest$MD4;,
        Lorg/bouncycastle/jce/provider/JDKMessageDigest$MD5;,
        Lorg/bouncycastle/jce/provider/JDKMessageDigest$RIPEMD128;,
        Lorg/bouncycastle/jce/provider/JDKMessageDigest$RIPEMD160;,
        Lorg/bouncycastle/jce/provider/JDKMessageDigest$RIPEMD256;,
        Lorg/bouncycastle/jce/provider/JDKMessageDigest$RIPEMD320;,
        Lorg/bouncycastle/jce/provider/JDKMessageDigest$SHA1;,
        Lorg/bouncycastle/jce/provider/JDKMessageDigest$SHA224;,
        Lorg/bouncycastle/jce/provider/JDKMessageDigest$SHA256;,
        Lorg/bouncycastle/jce/provider/JDKMessageDigest$SHA384;,
        Lorg/bouncycastle/jce/provider/JDKMessageDigest$SHA512;,
        Lorg/bouncycastle/jce/provider/JDKMessageDigest$Tiger;,
        Lorg/bouncycastle/jce/provider/JDKMessageDigest$Whirlpool;
    }
.end annotation


# instance fields
.field a:Lorg/bouncycastle/crypto/Digest;


# direct methods
.method protected constructor <init>(Lorg/bouncycastle/crypto/Digest;)V
    .locals 1

    invoke-interface {p1}, Lorg/bouncycastle/crypto/Digest;->getAlgorithmName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/security/MessageDigest;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JDKMessageDigest;->a:Lorg/bouncycastle/crypto/Digest;

    return-void
.end method


# virtual methods
.method public engineDigest()[B
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKMessageDigest;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    new-array v0, v0, [B

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKMessageDigest;->a:Lorg/bouncycastle/crypto/Digest;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    return-object v0
.end method

.method public engineReset()V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKMessageDigest;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->reset()V

    return-void
.end method

.method public engineUpdate(B)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKMessageDigest;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, p1}, Lorg/bouncycastle/crypto/Digest;->update(B)V

    return-void
.end method

.method public engineUpdate([BII)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKMessageDigest;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    return-void
.end method
