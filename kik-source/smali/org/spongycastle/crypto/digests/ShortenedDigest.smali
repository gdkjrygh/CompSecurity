.class public Lorg/spongycastle/crypto/digests/ShortenedDigest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/ExtendedDigest;


# instance fields
.field private a:Lorg/spongycastle/crypto/ExtendedDigest;

.field private b:I


# virtual methods
.method public final a([BI)I
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 62
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/ShortenedDigest;->a:Lorg/spongycastle/crypto/ExtendedDigest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/ExtendedDigest;->b()I

    move-result v0

    new-array v0, v0, [B

    .line 64
    iget-object v1, p0, Lorg/spongycastle/crypto/digests/ShortenedDigest;->a:Lorg/spongycastle/crypto/ExtendedDigest;

    invoke-interface {v1, v0, v2}, Lorg/spongycastle/crypto/ExtendedDigest;->a([BI)I

    .line 66
    iget v1, p0, Lorg/spongycastle/crypto/digests/ShortenedDigest;->b:I

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 68
    iget v0, p0, Lorg/spongycastle/crypto/digests/ShortenedDigest;->b:I

    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/spongycastle/crypto/digests/ShortenedDigest;->a:Lorg/spongycastle/crypto/ExtendedDigest;

    invoke-interface {v1}, Lorg/spongycastle/crypto/ExtendedDigest;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/spongycastle/crypto/digests/ShortenedDigest;->b:I

    mul-int/lit8 v1, v1, 0x8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(B)V
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/ShortenedDigest;->a:Lorg/spongycastle/crypto/ExtendedDigest;

    invoke-interface {v0, p1}, Lorg/spongycastle/crypto/ExtendedDigest;->a(B)V

    .line 53
    return-void
.end method

.method public final a([BII)V
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/ShortenedDigest;->a:Lorg/spongycastle/crypto/ExtendedDigest;

    invoke-interface {v0, p1, p2, p3}, Lorg/spongycastle/crypto/ExtendedDigest;->a([BII)V

    .line 58
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 47
    iget v0, p0, Lorg/spongycastle/crypto/digests/ShortenedDigest;->b:I

    return v0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/ShortenedDigest;->a:Lorg/spongycastle/crypto/ExtendedDigest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/ExtendedDigest;->c()V

    .line 74
    return-void
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/ShortenedDigest;->a:Lorg/spongycastle/crypto/ExtendedDigest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/ExtendedDigest;->d()I

    move-result v0

    return v0
.end method
