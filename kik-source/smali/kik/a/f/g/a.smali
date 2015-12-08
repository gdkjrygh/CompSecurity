.class public final Lkik/a/f/g/a;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field private final a:Lorg/bouncycastle/crypto/StreamCipher;

.field private final b:Ljava/io/InputStream;

.field private final c:[B


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/StreamCipher;Ljava/io/InputStream;)V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 21
    iput-object p1, p0, Lkik/a/f/g/a;->a:Lorg/bouncycastle/crypto/StreamCipher;

    .line 22
    iput-object p2, p0, Lkik/a/f/g/a;->b:Ljava/io/InputStream;

    .line 23
    const/16 v0, 0x2000

    new-array v0, v0, [B

    iput-object v0, p0, Lkik/a/f/g/a;->c:[B

    .line 24
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lkik/a/f/g/a;->b:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

.method public final close()V
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lkik/a/f/g/a;->b:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 39
    return-void
.end method

.method public final read()I
    .locals 2

    .prologue
    const/4 v0, -0x1

    .line 28
    iget-object v1, p0, Lkik/a/f/g/a;->b:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v1

    .line 29
    if-ne v1, v0, :cond_0

    .line 33
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lkik/a/f/g/a;->a:Lorg/bouncycastle/crypto/StreamCipher;

    int-to-byte v1, v1

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/StreamCipher;->returnByte(B)B

    move-result v0

    goto :goto_0
.end method

.method public final read([BII)I
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 43
    iget-object v0, p0, Lkik/a/f/g/a;->c:[B

    array-length v0, v0

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 44
    iget-object v1, p0, Lkik/a/f/g/a;->b:Ljava/io/InputStream;

    iget-object v3, p0, Lkik/a/f/g/a;->c:[B

    invoke-virtual {v1, v3, v2, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    .line 45
    if-lez v3, :cond_0

    .line 46
    iget-object v0, p0, Lkik/a/f/g/a;->a:Lorg/bouncycastle/crypto/StreamCipher;

    iget-object v1, p0, Lkik/a/f/g/a;->c:[B

    move-object v4, p1

    move v5, p2

    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/crypto/StreamCipher;->processBytes([BII[BI)V

    .line 51
    :cond_0
    return v3
.end method

.method public final skip(J)J
    .locals 2

    .prologue
    .line 61
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Not implemented."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
