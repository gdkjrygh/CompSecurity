.class public Lorg/spongycastle/util/test/UncloseableOutputStream;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"


# virtual methods
.method public close()V
    .locals 2

    .prologue
    .line 16
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "close() called on UncloseableOutputStream"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public write([BII)V
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lorg/spongycastle/util/test/UncloseableOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 22
    return-void
.end method
