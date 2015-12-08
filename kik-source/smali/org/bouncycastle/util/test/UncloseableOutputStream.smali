.class public Lorg/bouncycastle/util/test/UncloseableOutputStream;
.super Ljava/io/FilterOutputStream;


# virtual methods
.method public close()V
    .locals 2

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "close() called on UncloseableOutputStream"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public write([BII)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/util/test/UncloseableOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method
