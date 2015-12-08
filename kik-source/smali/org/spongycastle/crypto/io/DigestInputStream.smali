.class public Lorg/spongycastle/crypto/io/DigestInputStream;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# instance fields
.field protected a:Lorg/spongycastle/crypto/Digest;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Lorg/spongycastle/crypto/Digest;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 19
    iput-object p2, p0, Lorg/spongycastle/crypto/io/DigestInputStream;->a:Lorg/spongycastle/crypto/Digest;

    .line 20
    return-void
.end method


# virtual methods
.method public read()I
    .locals 3

    .prologue
    .line 25
    iget-object v0, p0, Lorg/spongycastle/crypto/io/DigestInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 27
    if-ltz v0, :cond_0

    .line 29
    iget-object v1, p0, Lorg/spongycastle/crypto/io/DigestInputStream;->a:Lorg/spongycastle/crypto/Digest;

    int-to-byte v2, v0

    invoke-interface {v1, v2}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 31
    :cond_0
    return v0
.end method

.method public read([BII)I
    .locals 2

    .prologue
    .line 40
    iget-object v0, p0, Lorg/spongycastle/crypto/io/DigestInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    .line 41
    if-lez v0, :cond_0

    .line 43
    iget-object v1, p0, Lorg/spongycastle/crypto/io/DigestInputStream;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1, p1, p2, v0}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 45
    :cond_0
    return v0
.end method
