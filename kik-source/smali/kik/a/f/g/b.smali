.class public final Lkik/a/f/g/b;
.super Ljava/io/OutputStream;
.source "SourceFile"


# instance fields
.field private final a:Ljava/io/OutputStream;

.field private final b:Lorg/bouncycastle/crypto/StreamCipher;

.field private final c:[B


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lorg/bouncycastle/crypto/StreamCipher;)V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 21
    iput-object p1, p0, Lkik/a/f/g/b;->a:Ljava/io/OutputStream;

    .line 22
    iput-object p2, p0, Lkik/a/f/g/b;->b:Lorg/bouncycastle/crypto/StreamCipher;

    .line 23
    const/16 v0, 0x2000

    new-array v0, v0, [B

    iput-object v0, p0, Lkik/a/f/g/b;->c:[B

    .line 24
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/a/f/g/b;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 38
    return-void
.end method

.method public final flush()V
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lkik/a/f/g/b;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 43
    return-void
.end method

.method public final write(I)V
    .locals 3

    .prologue
    const/4 v1, -0x1

    .line 28
    if-ne p1, v1, :cond_0

    .line 30
    iget-object v0, p0, Lkik/a/f/g/b;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 32
    :cond_0
    iget-object v0, p0, Lkik/a/f/g/b;->a:Ljava/io/OutputStream;

    iget-object v1, p0, Lkik/a/f/g/b;->b:Lorg/bouncycastle/crypto/StreamCipher;

    int-to-byte v2, p1

    invoke-interface {v1, v2}, Lorg/bouncycastle/crypto/StreamCipher;->returnByte(B)B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 33
    return-void
.end method

.method public final write([BII)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 47
    iget-object v0, p0, Lkik/a/f/g/b;->c:[B

    array-length v0, v0

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 48
    iget-object v0, p0, Lkik/a/f/g/b;->b:Lorg/bouncycastle/crypto/StreamCipher;

    iget-object v4, p0, Lkik/a/f/g/b;->c:[B

    move-object v1, p1

    move v2, p2

    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/crypto/StreamCipher;->processBytes([BII[BI)V

    .line 49
    iget-object v0, p0, Lkik/a/f/g/b;->a:Ljava/io/OutputStream;

    iget-object v1, p0, Lkik/a/f/g/b;->c:[B

    invoke-virtual {v0, v1, v5, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 50
    return-void
.end method
