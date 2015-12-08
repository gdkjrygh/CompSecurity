.class public Lorg/spongycastle/crypto/io/DigestOutputStream;
.super Ljava/io/OutputStream;
.source "SourceFile"


# instance fields
.field protected a:Lorg/spongycastle/crypto/Digest;


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/Digest;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 16
    iput-object p1, p0, Lorg/spongycastle/crypto/io/DigestOutputStream;->a:Lorg/spongycastle/crypto/Digest;

    .line 17
    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 3

    .prologue
    .line 36
    iget-object v0, p0, Lorg/spongycastle/crypto/io/DigestOutputStream;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v0, v0, [B

    .line 38
    iget-object v1, p0, Lorg/spongycastle/crypto/io/DigestOutputStream;->a:Lorg/spongycastle/crypto/Digest;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 40
    return-object v0
.end method

.method public write(I)V
    .locals 2

    .prologue
    .line 22
    iget-object v0, p0, Lorg/spongycastle/crypto/io/DigestOutputStream;->a:Lorg/spongycastle/crypto/Digest;

    int-to-byte v1, p1

    invoke-interface {v0, v1}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 23
    return-void
.end method

.method public write([BII)V
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lorg/spongycastle/crypto/io/DigestOutputStream;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 32
    return-void
.end method
