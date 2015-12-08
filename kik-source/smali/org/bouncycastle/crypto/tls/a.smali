.class final Lorg/bouncycastle/crypto/tls/a;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/Digest;


# instance fields
.field private a:Lorg/bouncycastle/crypto/digests/MD5Digest;

.field private b:Lorg/bouncycastle/crypto/digests/SHA1Digest;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/crypto/digests/MD5Digest;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/digests/MD5Digest;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/a;->a:Lorg/bouncycastle/crypto/digests/MD5Digest;

    new-instance v0, Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/digests/SHA1Digest;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/a;->b:Lorg/bouncycastle/crypto/digests/SHA1Digest;

    return-void
.end method

.method constructor <init>(Lorg/bouncycastle/crypto/tls/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/crypto/digests/MD5Digest;

    iget-object v1, p1, Lorg/bouncycastle/crypto/tls/a;->a:Lorg/bouncycastle/crypto/digests/MD5Digest;

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;-><init>(Lorg/bouncycastle/crypto/digests/MD5Digest;)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/a;->a:Lorg/bouncycastle/crypto/digests/MD5Digest;

    new-instance v0, Lorg/bouncycastle/crypto/digests/SHA1Digest;

    iget-object v1, p1, Lorg/bouncycastle/crypto/tls/a;->b:Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/digests/SHA1Digest;-><init>(Lorg/bouncycastle/crypto/digests/SHA1Digest;)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/a;->b:Lorg/bouncycastle/crypto/digests/SHA1Digest;

    return-void
.end method


# virtual methods
.method public final doFinal([BI)I
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/a;->a:Lorg/bouncycastle/crypto/digests/MD5Digest;

    invoke-virtual {v0, p1, p2}, Lorg/bouncycastle/crypto/digests/MD5Digest;->doFinal([BI)I

    move-result v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/a;->b:Lorg/bouncycastle/crypto/digests/SHA1Digest;

    add-int/lit8 v2, p2, 0x10

    invoke-virtual {v1, p1, v2}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->doFinal([BI)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final getAlgorithmName()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/a;->a:Lorg/bouncycastle/crypto/digests/MD5Digest;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/a;->b:Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " for TLS 1.0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getDigestSize()I
    .locals 1

    const/16 v0, 0x24

    return v0
.end method

.method public final reset()V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/a;->a:Lorg/bouncycastle/crypto/digests/MD5Digest;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/digests/MD5Digest;->reset()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/a;->b:Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->reset()V

    return-void
.end method

.method public final update(B)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/a;->a:Lorg/bouncycastle/crypto/digests/MD5Digest;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/crypto/digests/MD5Digest;->update(B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/a;->b:Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->update(B)V

    return-void
.end method

.method public final update([BII)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/a;->a:Lorg/bouncycastle/crypto/digests/MD5Digest;

    invoke-virtual {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/digests/MD5Digest;->update([BII)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/a;->b:Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-virtual {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->update([BII)V

    return-void
.end method
