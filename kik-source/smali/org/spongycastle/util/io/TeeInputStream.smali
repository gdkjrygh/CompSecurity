.class public Lorg/spongycastle/util/io/TeeInputStream;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field private final a:Ljava/io/InputStream;

.field private final b:Ljava/io/OutputStream;


# virtual methods
.method public close()V
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lorg/spongycastle/util/io/TeeInputStream;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 55
    iget-object v0, p0, Lorg/spongycastle/util/io/TeeInputStream;->b:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 56
    return-void
.end method

.method public read()I
    .locals 2

    .prologue
    .line 41
    iget-object v0, p0, Lorg/spongycastle/util/io/TeeInputStream;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 43
    if-ltz v0, :cond_0

    .line 45
    iget-object v1, p0, Lorg/spongycastle/util/io/TeeInputStream;->b:Ljava/io/OutputStream;

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 48
    :cond_0
    return v0
.end method

.method public read([B)I
    .locals 2

    .prologue
    .line 22
    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lorg/spongycastle/util/io/TeeInputStream;->read([BII)I

    move-result v0

    return v0
.end method

.method public read([BII)I
    .locals 2

    .prologue
    .line 28
    iget-object v0, p0, Lorg/spongycastle/util/io/TeeInputStream;->a:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    .line 30
    if-lez v0, :cond_0

    .line 32
    iget-object v1, p0, Lorg/spongycastle/util/io/TeeInputStream;->b:Ljava/io/OutputStream;

    invoke-virtual {v1, p1, p2, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 35
    :cond_0
    return v0
.end method
