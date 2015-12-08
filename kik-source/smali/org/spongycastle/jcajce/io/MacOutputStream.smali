.class public Lorg/spongycastle/jcajce/io/MacOutputStream;
.super Ljava/io/OutputStream;
.source "SourceFile"


# instance fields
.field protected a:Ljavax/crypto/Mac;


# virtual methods
.method public write(I)V
    .locals 2

    .prologue
    .line 22
    iget-object v0, p0, Lorg/spongycastle/jcajce/io/MacOutputStream;->a:Ljavax/crypto/Mac;

    int-to-byte v1, p1

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->update(B)V

    .line 23
    return-void
.end method

.method public write([BII)V
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lorg/spongycastle/jcajce/io/MacOutputStream;->a:Ljavax/crypto/Mac;

    invoke-virtual {v0, p1, p2, p3}, Ljavax/crypto/Mac;->update([BII)V

    .line 32
    return-void
.end method
