.class public Lorg/spongycastle/crypto/digests/NullDigest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/Digest;


# instance fields
.field private a:Ljava/io/ByteArrayOutputStream;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/crypto/digests/NullDigest;->a:Ljava/io/ByteArrayOutputStream;

    return-void
.end method


# virtual methods
.method public final a([BI)I
    .locals 3

    .prologue
    .line 35
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/NullDigest;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 37
    const/4 v1, 0x0

    array-length v2, v0

    invoke-static {v0, v1, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    iget-object v1, p0, Lorg/spongycastle/crypto/digests/NullDigest;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 41
    array-length v0, v0

    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 15
    const-string v0, "NULL"

    return-object v0
.end method

.method public final a(B)V
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/NullDigest;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 26
    return-void
.end method

.method public final a([BII)V
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/NullDigest;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 31
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/NullDigest;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    return v0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/NullDigest;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 47
    return-void
.end method
