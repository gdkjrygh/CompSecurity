.class public Lorg/bouncycastle/crypto/io/SignerOutputStream;
.super Ljava/io/FilterOutputStream;


# instance fields
.field protected a:Lorg/bouncycastle/crypto/Signer;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lorg/bouncycastle/crypto/Signer;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object p2, p0, Lorg/bouncycastle/crypto/io/SignerOutputStream;->a:Lorg/bouncycastle/crypto/Signer;

    return-void
.end method


# virtual methods
.method public getSigner()Lorg/bouncycastle/crypto/Signer;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/io/SignerOutputStream;->a:Lorg/bouncycastle/crypto/Signer;

    return-object v0
.end method

.method public write(I)V
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/crypto/io/SignerOutputStream;->a:Lorg/bouncycastle/crypto/Signer;

    int-to-byte v1, p1

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/Signer;->update(B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/io/SignerOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public write([BII)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/io/SignerOutputStream;->a:Lorg/bouncycastle/crypto/Signer;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/Signer;->update([BII)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/io/SignerOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method
