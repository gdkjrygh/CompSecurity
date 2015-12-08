.class public Lorg/bouncycastle/crypto/io/MacOutputStream;
.super Ljava/io/FilterOutputStream;


# instance fields
.field protected a:Lorg/bouncycastle/crypto/Mac;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lorg/bouncycastle/crypto/Mac;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object p2, p0, Lorg/bouncycastle/crypto/io/MacOutputStream;->a:Lorg/bouncycastle/crypto/Mac;

    return-void
.end method


# virtual methods
.method public getMac()Lorg/bouncycastle/crypto/Mac;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/io/MacOutputStream;->a:Lorg/bouncycastle/crypto/Mac;

    return-object v0
.end method

.method public write(I)V
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/crypto/io/MacOutputStream;->a:Lorg/bouncycastle/crypto/Mac;

    int-to-byte v1, p1

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/Mac;->update(B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/io/MacOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public write([BII)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/io/MacOutputStream;->a:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/io/MacOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method
