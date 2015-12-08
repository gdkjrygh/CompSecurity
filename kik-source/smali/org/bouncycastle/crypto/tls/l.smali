.class final Lorg/bouncycastle/crypto/tls/l;
.super Ljava/io/OutputStream;


# instance fields
.field private a:[B

.field private b:Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;


# direct methods
.method constructor <init>(Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;)V
    .locals 1

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/l;->a:[B

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/l;->b:Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/l;->b:Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/l;->b:Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/l;->a:[B

    int-to-byte v1, p1

    aput-byte v1, v0, v2

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/l;->a:[B

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lorg/bouncycastle/crypto/tls/l;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/l;->b:Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;

    invoke-virtual {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->writeData([BII)V

    return-void
.end method
