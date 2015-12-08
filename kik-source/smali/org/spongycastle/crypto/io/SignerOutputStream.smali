.class public Lorg/spongycastle/crypto/io/SignerOutputStream;
.super Ljava/io/OutputStream;
.source "SourceFile"


# instance fields
.field protected a:Lorg/spongycastle/crypto/Signer;


# virtual methods
.method public write(I)V
    .locals 2

    .prologue
    .line 22
    iget-object v0, p0, Lorg/spongycastle/crypto/io/SignerOutputStream;->a:Lorg/spongycastle/crypto/Signer;

    int-to-byte v1, p1

    invoke-interface {v0, v1}, Lorg/spongycastle/crypto/Signer;->a(B)V

    .line 23
    return-void
.end method

.method public write([BII)V
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lorg/spongycastle/crypto/io/SignerOutputStream;->a:Lorg/spongycastle/crypto/Signer;

    invoke-interface {v0, p1, p2, p3}, Lorg/spongycastle/crypto/Signer;->a([BII)V

    .line 32
    return-void
.end method
